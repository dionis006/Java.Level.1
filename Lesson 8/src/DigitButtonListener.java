import javax.script.ScriptException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DigitButtonListener implements ActionListener {
    private JTextField outField;
    private StringBuilder sb;

    public DigitButtonListener(JTextField outField) {
        this.outField = outField;
        this.sb = new StringBuilder();
    }

    @Override
    public  void actionPerformed(ActionEvent e) {
        JButton jButton = (JButton) e.getSource();
        String val = sb.append(outField.getText()) // принимает информацию о строке
                .append((jButton.getText())) // добавляем к конец
                .toString(); // в строку
        outField.setText(val);
        sb.setLength(0);

        char lastChar = val.charAt(val.length() - 1);
        String lastCharacter = String.valueOf(lastChar);
        String result = null;
        try {
            result = new MathematicalExpressions().expressions(val, lastCharacter);
            writer(result);

        } catch (ScriptException scriptException) {
            scriptException.printStackTrace();
        }
    }
    public void writer (String result) {
        outField.setText(result);
        sb.setLength(0);
    }
}

