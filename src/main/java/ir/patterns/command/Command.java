package ir.patterns.command;

public abstract class Command {

    public Editor editor;
    public String backup;

    public Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}