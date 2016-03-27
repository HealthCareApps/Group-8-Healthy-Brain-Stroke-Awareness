package com.example.strokeapp2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by phil on 3/14/2016.
 */
public class ArticleFragment extends Fragment {
    final static String ARG_POSITION = "position";
    int mCurrentPosition = -1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // If activity recreated (such as from screen rotate), restore
        // the previous article selection set by onSaveInstanceState().
        // This is primarily necessary when in the two-pane layout.
        if (savedInstanceState != null) {
            mCurrentPosition = savedInstanceState.getInt(ARG_POSITION);
        }

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.article_view, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        // During startup, check if there are arguments passed to the fragment.
        // onStart is a good place to do this because the layout has already been
        // applied to the fragment at this point so we can safely call the method
        // below that sets the article text.
        Bundle args = getArguments();
        if (args != null) {
            // Set article based on argument passed in
            updateArticleView(args.getInt(ARG_POSITION));
        } else if (mCurrentPosition != -1) {
            // Set article based on saved instance state defined during onCreateView
            updateArticleView(mCurrentPosition);
        }
    }

    public void updateArticleView(int position) {
        //Log.i("xx", " " + position + " ");
        GridLayout article = (GridLayout) getActivity().findViewById(R.id.article);
        //GridView article = new GridView(frame.getContext());
        //article.setLayoutParams(getActivity().findViewById(R.id.grid).getLayoutParams());
        //article.setText(Ipsum.Articles[position]);
        if(position == 0) {
            article.setBackgroundColor(0XBEFF0000);
            //frame.addView(article);
            TextView article_text1 = new TextView(article.getContext());
            article_text1.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            article.addView(article_text1);
            article_text1.setTextSize(26);
            article_text1.setText("Stroke Symptom 1\n\n");
            TextView article_text2 = new TextView(article.getContext());
            article_text2.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            article.addView(article_text2);
            article_text2.setTextSize(26);
            article_text2.setText("Stroke Symptom 2\n\n");
            TextView article_text3 = new TextView(article.getContext());
            article_text3.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            article.addView(article_text3);
            article_text3.setTextSize(26);
            article_text3.setText("Stroke Symptom 3\n\n");
            TextView article_text4 = new TextView(article.getContext());
            article_text4.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            article.addView(article_text4);
            article_text4.setTextSize(26);
            article_text4.setText("Stroke Symptom 4\n\n");
            }else{
            if(position == 1){
                article.setBackgroundColor(0X9000FF00);
            }else{
                    article.setBackgroundColor(0xFF000000);
                }
            }
        mCurrentPosition = position;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // Save the current article selection in case we need to recreate the fragment
        outState.putInt(ARG_POSITION, mCurrentPosition);
    }
}