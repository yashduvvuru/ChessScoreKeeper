package com.example.yasaswiduvvuru.chessscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ChessScoreKeeper extends AppCompatActivity {
    int p1Score = 0;
    int p2Score = 0;
    int p1Pawn = 0;
    int p2Pawn = 0;
    int p1Knight = 0;
    int p2Knight = 0;
    int p1Bishop = 0;
    int p2Bishop = 0;
    int p1Rook = 0;
    int p2Rook = 0;
    int p1Queen = 0;
    int p2Queen = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chess_score_keeper);
    }

    private void setP1Score()
    {
        TextView p1Sc = (TextView) findViewById(R.id.p1_score_text_view);
        p1Sc.setText("" + p1Score);
    }
    private void setP2Score()
    {
        TextView p2Sc = (TextView) findViewById(R.id.p2_score_text_view);
        p2Sc.setText("" + p2Score);
    }

    public void setP1Pawn(View view)
    {
        if(p1Pawn < 8)
        {
            p1Pawn++;
            TextView p1Pa = (TextView) findViewById(R.id.p1pawn_text_view);
            p1Pa.setText("" + p1Pawn);
            p1Score++;
            setP1Score();

        }

    }
    public void setP2Pawn(View view)
    {
        if(p2Pawn < 8)
        {
            p2Pawn++;
            TextView p2Pa = (TextView) findViewById(R.id.p2pawn_text_view);
            p2Pa.setText("" + p2Pawn);
            p2Score++;
            setP2Score();


        }

    }
    public void setP1Knight(View view)
    {
        if(p1Knight < 2)
        {
            p1Knight++;
            TextView p1Kn = (TextView) findViewById(R.id.p1knight_text_view);
            p1Kn.setText("" + p1Knight);
            p1Score += 3;
            setP1Score();
        }
    }
    public void setP2Knight(View view)
    {
        if(p2Knight < 2)
        {
            p2Knight++;
            TextView p2Kn = (TextView) findViewById(R.id.p2knight_text_view);
            p2Kn.setText("" + p2Knight);
            p2Score += 3;
            setP2Score();
        }
    }
    public void setP1Bishop(View view)
    {
        if(p1Bishop < 2)
        {
            p1Bishop++;
            TextView p1Bi = (TextView) findViewById(R.id.p1bishop_text_view);
            p1Bi.setText("" + p1Bishop);
            p1Score += 3;
            setP1Score();
        }
    }
    public void setP2Bishop(View view)
    {
        if(p2Bishop < 2)
        {
            p2Bishop++;
            TextView p2Bi = (TextView) findViewById(R.id.p2bishop_text_view);
            p2Bi.setText("" + p2Bishop);
            p2Score += 3;
            setP2Score();
        }
    }
    public void setP1Rook(View view)
    {
        if(p1Rook < 2)
        {
            p1Rook++;
            TextView p1Ro = (TextView) findViewById(R.id.p1rook_text_view);
            p1Ro.setText("" + p1Rook);
            p1Score += 5;
            setP1Score();
        }
    }
    public void setP2Rook(View view)
    {
        if(p2Rook < 2)
        {
            p2Rook++;
            TextView p2Ro = (TextView) findViewById(R.id.p2rook_text_view);
            p2Ro.setText("" + p2Rook);
            p2Score += 5;
            setP2Score();
        }
    }

    public void setP1Queen(View view)
    {
        if(p1Queen < 1)
        {
            p1Queen++;
            TextView p1Qu = (TextView) findViewById(R.id.p1queen_text_view);
            p1Qu.setText("" + p1Queen);
            p1Score += 9;
            setP1Score();
        }
    }

    public void setP2Queen(View view)
    {
        if(p2Queen < 1)
        {
            p2Queen++;
            TextView p2Qu = (TextView) findViewById(R.id.p2queen_text_view);
            p2Qu.setText("" + p2Queen);
            p2Score += 9;
            setP2Score();
        }
    }

    public void reset(View view)
    {
        TextView p1Pa = (TextView) findViewById(R.id.p1pawn_text_view);
        TextView p2Pa = (TextView) findViewById(R.id.p2pawn_text_view);
        TextView p1Kn = (TextView) findViewById(R.id.p1knight_text_view);
        TextView p2Kn = (TextView) findViewById(R.id.p2knight_text_view);
        TextView p1Bi = (TextView) findViewById(R.id.p1bishop_text_view);
        TextView p2Bi = (TextView) findViewById(R.id.p2bishop_text_view);
        TextView p1Ro = (TextView) findViewById(R.id.p1rook_text_view);
        TextView p2Ro = (TextView) findViewById(R.id.p2rook_text_view);
        TextView p1Qu = (TextView) findViewById(R.id.p1queen_text_view);
        TextView p2Qu = (TextView) findViewById(R.id.p2queen_text_view);

        p1Score = 0;
        p2Score = 0;
        p1Pawn = 0;
        p2Pawn = 0;
        p1Knight = 0;
        p2Knight = 0;
        p1Bishop = 0;
        p2Bishop = 0;
        p1Rook = 0;
        p2Rook = 0;
        p1Queen = 0;
        p2Queen = 0;

        p1Pa.setText("" + p1Pawn);
        p2Pa.setText("" + p2Pawn);
        p1Kn.setText("" + p1Knight);
        p2Kn.setText("" + p2Knight);
        p1Bi.setText("" + p1Bishop);
        p2Bi.setText("" + p2Bishop);
        p1Ro.setText("" + p1Rook);
        p2Ro.setText("" + p2Rook);
        p1Qu.setText("" + p1Queen);
        p2Qu.setText("" + p2Queen);
        setP1Score();
        setP2Score();

    }

}
