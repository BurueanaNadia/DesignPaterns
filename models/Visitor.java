package models;

public interface Visitor<T> {
       T visitBook(Book book);
       T visitSection(Section s);
       T visitTableOfContents(TableOfContents tableOfContents);
       T visitParagraph(Paragraph paragraph);
       T visitImageProxy(ImageProxy ip);
       T visitImage(Image image);
       T visitTable(Table table);
}
