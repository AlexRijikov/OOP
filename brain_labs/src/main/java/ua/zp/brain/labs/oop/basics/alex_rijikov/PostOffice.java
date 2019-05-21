package ua.zp.brain.labs.oop.basics.alex_rijikov;

//
public class PostOffice {

    public  String namePost;

    public String geolocation;

    PostOffice(String namePost,String geolocation) {
        this.namePost = namePost;
        this.geolocation = geolocation;

    }

    public String getNamePost() {
        return namePost;
    }

    public String getGeolocation() {
        return geolocation;
    }

    public void setGeolocation(String geolocation) {
        this.geolocation = geolocation;
    }

    public void setNamePost(String namePost) { this.namePost = namePost;
    }


    @Override
    public String toString() {
        return "PostOffice{" +
                "namePost='" + namePost + '\'' +
                ", geolocation=" + geolocation +
                '}';
    }
     public void  infoPost (){
         System.out.println( "Название почты - "+ (namePost)  +"; "+ "Находиться по координатам - " + geolocation  );
     }
}
