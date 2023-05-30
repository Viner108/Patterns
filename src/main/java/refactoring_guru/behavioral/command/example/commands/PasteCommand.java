package refactoring_guru.behavioral.command.example.commands;


import refactoring_guru.behavioral.command.example.editor.Editor;

public class PasteCommand extends Command{
    public PasteCommand(Editor editor){
        super(editor);
    }
    public boolean execute(){
        if (editor.clipboard==null || editor.clipboard.isEmpty()) return false;
        backup();
        editor.textField.insert(editor.clipboard,editor.textField.getCaretPosition());
        return true;
    }
}
