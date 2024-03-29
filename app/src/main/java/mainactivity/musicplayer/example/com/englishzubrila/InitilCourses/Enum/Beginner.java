package mainactivity.musicplayer.example.com.englishzubrila.InitilCourses.Enum;

public enum  Beginner {
    Letters0(0),
    Letters1(1),
    Letters2(2),
    Letters3(3);

    private final int id;

    Beginner(int code){
        id = code;
    }

    public int getId() {
        return id;
    }

    public static Beginner fromId(int code)
    {
        Beginner[] list = Beginner.values();

        if (code >= 0 && code < list.length)
            return list[code];
        else
            return Beginner.Letters0;
    }
}
