package oop;

import java.util.Date;

public class Post
{
//    int id;
//    String title;
//    String content;
//    Date created_at
    public int id;
    public String title;
    public String content;
    public String author;
    public Date created_at;


    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", created_at=" + created_at +
                '}';
    }

    public static void main(String[] args)
    {
        Post post = new Post();

        post.id = 1;
        post.title = "Title";
        post.content = "Content";
        post.author = "Me";
        post.created_at = new Date();

        System.out.println(post.title);
    }
}
