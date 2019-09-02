package com.rbworks.dev.cquiz.com.rbwdcq;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import static com.javaprogramming.rbworks.dev.jpcp.QuizContract.MovieEntry.KEY_ANSWER;
//import static com.javaprogramming.rbworks.dev.jpcp.QuizContract.MovieEntry.KEY_ID;
//import static com.javaprogramming.rbworks.dev.jpcp.QuizContract.MovieEntry.KEY_OPTA;
//import static com.javaprogramming.rbworks.dev.jpcp.QuizContract.MovieEntry.KEY_OPTB;
//import static com.javaprogramming.rbworks.dev.jpcp.QuizContract.MovieEntry.KEY_OPTC;
//import static com.javaprogramming.rbworks.dev.jpcp.QuizContract.MovieEntry.KEY_QUES;
//import static com.javaprogramming.rbworks.dev.jpcp.QuizContract.MovieEntry.TABLE_QUEST;
import static com.rbworks.dev.cquiz.com.rbwdcq.QuizContract.MovieEntry.KEY_ANSWER;
import static com.rbworks.dev.cquiz.com.rbwdcq.QuizContract.MovieEntry.KEY_ID;
import static com.rbworks.dev.cquiz.com.rbwdcq.QuizContract.MovieEntry.KEY_OPTA;
import static com.rbworks.dev.cquiz.com.rbwdcq.QuizContract.MovieEntry.KEY_OPTB;
import static com.rbworks.dev.cquiz.com.rbwdcq.QuizContract.MovieEntry.KEY_OPTC;
import static com.rbworks.dev.cquiz.com.rbwdcq.QuizContract.MovieEntry.KEY_QUES;
import static com.rbworks.dev.cquiz.com.rbwdcq.QuizContract.MovieEntry.TABLE_QUEST;

//import static com.javaprogramming.rbworks.dev.jpfp.QuizContract.MovieEntry.KEY_ANSWER;
//import static com.javaprogramming.rbworks.dev.jpfp.QuizContract.MovieEntry.KEY_ID;
//import static com.javaprogramming.rbworks.dev.jpfp.QuizContract.MovieEntry.KEY_OPTA;
//import static com.javaprogramming.rbworks.dev.jpfp.QuizContract.MovieEntry.KEY_OPTB;
//import static com.javaprogramming.rbworks.dev.jpfp.QuizContract.MovieEntry.KEY_OPTC;
//import static com.javaprogramming.rbworks.dev.jpfp.QuizContract.MovieEntry.KEY_QUES;
//import static com.javaprogramming.rbworks.dev.jpfp.QuizContract.MovieEntry.TABLE_QUEST;
//import static com.javaprogramming.rbworks.dev.jpp.QuizContract.MovieEntry.KEY_ANSWER;
//import static com.javaprogramming.rbworks.dev.jpp.QuizContract.MovieEntry.KEY_ID;
//import static com.javaprogramming.rbworks.dev.jpp.QuizContract.MovieEntry.KEY_OPTA;
//import static com.javaprogramming.rbworks.dev.jpp.QuizContract.MovieEntry.KEY_OPTB;
//import static com.javaprogramming.rbworks.dev.jpp.QuizContract.MovieEntry.KEY_OPTC;
//import static com.javaprogramming.rbworks.dev.jpp.QuizContract.MovieEntry.KEY_QUES;
//import static com.javaprogramming.rbworks.dev.jpp.QuizContract.MovieEntry.TABLE_QUEST;

//import com.delaroystudios.quiz.Question;

public class DbHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "quizzer";
    // tasks table name

    private SQLiteDatabase dbase;
    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        dbase=db;
        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER+ " TEXT, "+KEY_OPTA +" TEXT, "
                +KEY_OPTB +" TEXT, "+KEY_OPTC+" TEXT)";
        db.execSQL(sql);
        addQuestions();
        //db.close();
    }
    private void addQuestions()
    {
        Question q1=new Question("Which of the following is a correct comment ?"," */ Comments */", "** Comment ** ", "/* Comment */", "/* Comment */");
        this.addQuestion(q1);
        Question q2=new Question("What punctuation ends most lines of C  ?", ":", ";", ".", ";");
        this.addQuestion(q2);
        Question q3=new Question("Which of the following function is used to print something on console ?","printf()", "scanf()","getch()", "printf()" );
        this.addQuestion(q3);
        Question q4=new Question("Which function is used to read the input from Console ?", "printf()", "getchar()", "scanf()","scanf()");
        this.addQuestion(q4);
        Question q5=new Question("C lanuage is what ?","OOP Language ","POP Language","None","OOP Language");
        this.addQuestion(q5);
        Question q6=new Question("Who developed C language ?","Peter Norton","Dennis Ritchie"," Von Neuman","Dennis Ritchie");
        this.addQuestion(q6);
        Question q7=new Question("What is the length null string ?","0","16","32","0");
        this.addQuestion(q7);
        Question q8=new Question("Pointers can be used to achieve ..","call by procedure","call by reference","call by function","call by function");
        this.addQuestion(q8);

        Question q9=new Question("What is the default return type of a function in C?","void","int","char","int");
        this.addQuestion(q9);

        Question q10=new Question("How much memory is required to store a value of type double in C?","4","6","8","8");
        this.addQuestion(q10);

        Question q11=new Question("Which of the following is not a reserved word in C ?","doo","for","Not Sure","doo");
        this.addQuestion(q11);

        Question q12=new Question("Which of the following is not a valid storage class in C ?","static","extern","automatic","automatic");
        this.addQuestion(q12);

        Question q13=new Question("The C language consist of .. number of keywords ","32","40","24","32");
        this.addQuestion(q13);

        Question q14=new Question("Which of the following is a keyword used for a storage class in C ? ","printf","external","scanf","scanf");
        this.addQuestion(q14);

        Question q15=new Question("The prototype of the function in the header file is  .. ? ","conio.h","Stdio.h","stdlb.h","conio.h");
        this.addQuestion(q15);

        Question q16=new Question("File manipulation functions in C are available in which header file ?  ","streams.h","files.h","stdio.h","files.h");
        this.addQuestion(q16);

        Question q17=new Question("Which of the following is not keyword of C ?   ","auto","int","std","auto");
        this.addQuestion(q17);

        Question q18=new Question("What is sizeof In C ?   ","operator","reserve word","funcction","operator");
        this.addQuestion(q18);

        Question q19=new Question("Which is not keyword in C  ?    ","typedef","const","near","near");
        this.addQuestion(q19);

        Question q20=new Question("Which is valid string function ?   ","strlen","struct","strpbrk","strlen");
        this.addQuestion(q20);




    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
        // Create tables again
        onCreate(db);
    }
    // Adding new question
    public void addQuestion(Question quest) {
        //SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(KEY_OPTA, quest.getOPTA());
        values.put(KEY_OPTB, quest.getOPTB());
        values.put(KEY_OPTC, quest.getOPTC());
        // Inserting Row
        dbase.insert(TABLE_QUEST, null, values);
    }
    public List<Question> getAllQuestions() {
        List<Question> quesList = new ArrayList<Question>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST + " ORDER BY "+ "RANDOM()";
        dbase=this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question quest = new Question();
                quest.setID(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOPTA(cursor.getString(3));
                quest.setOPTB(cursor.getString(4));
                quest.setOPTC(cursor.getString(5));
                quesList.add(quest);
            } while (cursor.moveToNext());
            Collections.shuffle(quesList);
        }
        // return quest list
        return quesList;
    }
    public int rowcount()
    {
        int row=0;
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        row=cursor.getCount();
        return row;
    }
}
