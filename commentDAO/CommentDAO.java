package dao;
import model.Comment;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class CommentDAO {
    public static Map<Integer, Comment> mapComment = loadComment();

    private static Map<Integer, Comment> loadComment() {

        Map<Integer, Comment> mapTemp = new HashMap<>();

        try {
            ResultSet rs = new ConnectToDatabase().selectData("select * from comment");

            while (rs.next()) {
                int commentID = rs.getInt(1);
                String commentContent = rs.getString(2);
                Date commentDate = rs.getDate(3);
                int roomID = rs.getInt(4);
                String userName = rs.getString(5);
                int rating = rs.getInt(6);

                Comment comment = new Comment(commentID,commentContent,commentDate,roomID,userName,rating);

                mapTemp.put(comment.getRoomID(), comment);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mapTemp;
    }

    public boolean deleteComment(String id) {
        mapComment.remove(id);

        try {
            new ConnectToDatabase().excuteSql("delete from comment where commentID='" + id + "'");
            return true;
        } catch (Exception e) {
            System.out.println("Error when delete comment: " + e.getMessage());
        }
        return false;
    }
}



