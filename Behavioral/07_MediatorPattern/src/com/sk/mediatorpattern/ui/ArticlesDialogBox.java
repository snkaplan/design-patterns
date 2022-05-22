package com.sk.mediatorpattern.ui;

public class ArticlesDialogBox extends DialogBox {
    private final ListBox articlesListBox = new ListBox(this);
    private final TextBox titleTextBox = new TextBox(this);
    private final Button saveButton = new Button(this);

    public void simulateUserInteraction(){
        articlesListBox.setSelection("Article 1");
        System.out.println("TextBox: " + titleTextBox.getContent());
        System.out.println("Button: " + saveButton.isEnabled());
        titleTextBox.setContent("");
        System.out.println("TextBox: " + titleTextBox.getContent());
        System.out.println("Button: " + saveButton.isEnabled());
    }

    @Override
    public void changed(UIControl uiControl) {
        if(uiControl == articlesListBox){
            articleSelected();
        } else if(uiControl == titleTextBox){
            titleChanged();
        }
    }

    private void articleSelected(){
        titleTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnabled(true);
    }

    private void titleChanged(){
        var isEmpty = titleTextBox.getContent().isEmpty() || titleTextBox.getContent() == null;
        saveButton.setEnabled(!isEmpty);
    }
}
