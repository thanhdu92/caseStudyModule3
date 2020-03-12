package model;

import java.sql.Date;

public class Comment {
    public int getCommentID() {
        return commentID;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public int getRoomID() {
        return roomID;
    }

    public String getUserName() {
        return userName;
    }

    public int getCommentRating() {
        return commentRating;
    }

    public Comment(int commentID, String commentContent, Date commentDate, int roomID, String userName, int commentRating) {
        this.commentID = commentID;
        this.commentContent = commentContent;
        this.commentDate = commentDate;
        this.roomID = roomID;
        this.userName = userName;
        this.commentRating = commentRating;
    }

    public int commentID;
    public String commentContent;
    public Date commentDate;
    public int roomID;
    public String userName;
    public int commentRating;
}
