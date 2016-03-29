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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by phil on 3/14/2016.
 */
public class ArticleFragment extends Fragment {
    View.OnClickListener a = new  View.OnClickListener(){
        public void onClick(View v){
            updateArticleView(2);
        }
    };

    View.OnClickListener b = new  View.OnClickListener(){
        public void onClick(View v){
            updateArticleView(3);
        }
    };

    View.OnClickListener c = new  View.OnClickListener(){
        public void onClick(View v){
            updateArticleView(4);
        }
    };

    View.OnClickListener d = new  View.OnClickListener(){
        public void onClick(View v){
            updateArticleView(5);
        }
    };

    View.OnClickListener e = new  View.OnClickListener(){
        public void onClick(View v){
            updateArticleView(6);
        }
    };

    View.OnClickListener f = new  View.OnClickListener(){
        public void onClick(View v){
            updateArticleView(7);
        }
    };

    View.OnClickListener g = new  View.OnClickListener(){
        public void onClick(View v){
            updateArticleView(8);
        }
    };

    View.OnClickListener h = new  View.OnClickListener(){
        public void onClick(View v){
            updateArticleView(9);
        }
    };

    View.OnClickListener i = new  View.OnClickListener(){
        public void onClick(View v){
            updateArticleView(10);
        }
    };

    View.OnClickListener j = new  View.OnClickListener(){
        public void onClick(View v){
            updateArticleView(11);
        }
    };

    View.OnClickListener k = new  View.OnClickListener(){
        public void onClick(View v){
            updateArticleView(12);
        }
    };

    View.OnClickListener l = new  View.OnClickListener(){
        public void onClick(View v){
            updateArticleView(13);
        }
    };

    View.OnClickListener m = new  View.OnClickListener(){
        public void onClick(View v){
            updateArticleView(14);
        }
    };

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

    public void onClick(){

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
        //GridView article = new GridView(frame.getContext());
        //article.setLayoutParams(getActivity().findViewById(R.id.grid).getLayoutParams());
        //article.setText(Ipsum.Articles[position]);
        GridLayout article = (GridLayout) getActivity().findViewById(R.id.article);
        if(position == 0) {
            //GridLayout article = (GridLayout) getActivity().findViewById(R.id.article);
            article.setBackgroundColor(0XBEFF0000);
            //frame.addView(article);
            TextView article_text1 = new TextView(article.getContext());
            article_text1.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            article.addView(article_text1);
            article_text1.setOnClickListener(a);
            article_text1.setTextSize(26);
            article_text1.setText("Stroke Symptom 1(click for animation)\n\n");
            TextView article_text2 = new TextView(article.getContext());
            article_text2.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            article.addView(article_text2);
            article_text2.setOnClickListener(b);
            article_text2.setTextSize(26);
            article_text2.setText("Stroke Symptom 2(click for animation)\n\n");
            TextView article_text3 = new TextView(article.getContext());
            article_text3.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            article.addView(article_text3);
            article_text3.setOnClickListener(c);
            article_text3.setTextSize(26);
            article_text3.setText("Stroke Symptom 3(click for animation)\n\n");
            TextView article_text4 = new TextView(article.getContext());
            article_text4.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            article.addView(article_text4);
            article_text4.setOnClickListener(d);
            article_text4.setTextSize(26);
            article_text4.setText("Stroke Symptom 4(click for animation)\n\n");
            }else {
            if (position == 1) {
                //GridLayout article = (GridLayout) getActivity().findViewById(R.id.article);
                article.setBackgroundColor(0X9000FF00);

                TextView article_text5 = new TextView(article.getContext());
                article_text5.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                article.addView(article_text5);
                article_text5.setOnClickListener(e);
                article_text5.setTextSize(26);
                article_text5.setText("PREVENTION\n\n");
                TextView article_text6 = new TextView(article.getContext());
                article_text6.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                article.addView(article_text6);
                article_text6.setOnClickListener(f);
                article_text6.setTextSize(26);
                article_text6.setText("MODIFIED RISK FACTORS\n\n");
                TextView article_text7 = new TextView(article.getContext());
                article_text7.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                article.addView(article_text7);
                article_text7.setOnClickListener(g);
                article_text7.setTextSize(26);
                article_text7.setText("NON MODIFIED RISK FACTORS\n\n");

            } else {
                if (position == 2) {
                    //FrameLayout frame = (FrameLayout) getActivity().findViewById(R.id.frame);
                    //GridLayout article = (GridLayout) getActivity().findViewById(R.id.article);
                    article.removeAllViewsInLayout();
                    article.setBackgroundColor(0xBEFF0000);
                    ImageView image1 = new ImageView(article.getContext());
                    article.addView(image1);
                    image1.setImageResource(R.drawable.sample_1);
                } else {
                    if (position == 3) {
                        //GridLayout article = (GridLayout) getActivity().findViewById(R.id.article);
                        article.removeAllViewsInLayout();
                        article.setBackgroundColor(0xBEFF0000);
                        ImageView image2 = new ImageView(article.getContext());
                        article.addView(image2);
                        image2.setImageResource(R.drawable.sample_2);
                    } else {
                        if (position == 4) {
                            //GridLayout article = (GridLayout) getActivity().findViewById(R.id.article);
                            article.removeAllViewsInLayout();
                            article.setBackgroundColor(0xBEFF0000);
                            ImageView image3 = new ImageView(article.getContext());
                            article.addView(image3);
                            image3.setImageResource(R.drawable.sample_3);
                        } else {
                            if (position == 5) {
                                //GridLayout article = (GridLayout) getActivity().findViewById(R.id.article);
                                article.removeAllViewsInLayout();
                                article.setBackgroundColor(0xBEFF0000);
                                ImageView image4 = new ImageView(article.getContext());
                                article.addView(image4);
                                image4.setImageResource(R.drawable.sample_4);
                            } else {
                                if (position == 6) {
                                    article.removeAllViewsInLayout();
                                    article.setBackgroundColor(0X9000FF00);
                                    TextView prevention = new TextView(article.getContext());
                                    article.addView(prevention);
                                    prevention.setTextSize(26);
                                    prevention.setText("stroke prevention information stroke prevention information stroke prevention information stroke prevention information" +
                                            "stroke prevention information stroke prevention information stroke prevention information stroke prevention information");
                                } else {
                                    if (position == 7) {
                                        article.removeAllViewsInLayout();
                                        article.setBackgroundColor(0X9000FF00);
                                        TextView mrf1 = new TextView(article.getContext());
                                        mrf1.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                                        article.addView(mrf1);
                                        mrf1.setOnClickListener(h);
                                        mrf1.setTextSize(26);
                                        mrf1.setText("MODIFIED RISK FACTOR 1(CLICK FOR DETAILED INFO)\n\n");
                                        TextView mrf2 = new TextView(article.getContext());
                                        mrf2.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                                        article.addView(mrf2);
                                        mrf2.setOnClickListener(i);
                                        mrf2.setTextSize(26);
                                        mrf2.setText("MODIFIED RISK FACTOR 2(CLICK FOR DETAILED INFO)\n\n");
                                        TextView mrf3 = new TextView(article.getContext());
                                        mrf3.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                                        article.addView(mrf3);
                                        mrf3.setOnClickListener(j);
                                        mrf3.setTextSize(26);
                                        mrf3.setText("MODIFIED RISK FACTOR 3(CLICK FOR DETAILED INFO)\n\n");
                                    }else{
                                        if(position == 8) {
                                            article.removeAllViewsInLayout();
                                            article.setBackgroundColor(0X9000FF00);
                                            TextView nmrf1 = new TextView(article.getContext());
                                            nmrf1.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                                            article.addView(nmrf1);
                                            nmrf1.setOnClickListener(k);
                                            nmrf1.setTextSize(26);
                                            nmrf1.setText("NON MODIFIED RISK FACTOR 1(CLICK FOR DETAILED INFO)\n\n");
                                            TextView nmrf2 = new TextView(article.getContext());
                                            nmrf2.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                                            article.addView(nmrf2);
                                            nmrf2.setOnClickListener(l);
                                            nmrf2.setTextSize(26);
                                            nmrf2.setText("NON MODIFIED RISK FACTOR 2(CLICK FOR DETAILED INFO)\n\n");
                                            TextView nmrf3 = new TextView(article.getContext());
                                            nmrf3.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                                            article.addView(nmrf3);
                                            nmrf3.setOnClickListener(m);
                                            nmrf3.setTextSize(26);
                                            nmrf3.setText("NON MODIFIED RISK FACTOR 3(CLICK FOR DETAILED INFO)\n\n");
                                        }else{
                                            if(position == 9){
                                                article.removeAllViewsInLayout();
                                                article.setBackgroundColor(0X9000FF00);
                                                TextView mrf1details = new TextView(article.getContext());
                                                article.addView(mrf1details);
                                                mrf1details.setTextSize(26);
                                                mrf1details.setText("details for modified risk factor 1 details for modified risk factor 1 details for modified risk factor 1 details for modified risk factor 1" +
                                                        "details for modified risk factor 1 details for modified risk factor 1 details for modified risk factor 1 details for modified risk factor 1");
                                            }else{
                                                if(position == 10){
                                                    article.removeAllViewsInLayout();
                                                    article.setBackgroundColor(0X9000FF00);
                                                    TextView mrf2details = new TextView(article.getContext());
                                                    article.addView(mrf2details);
                                                    mrf2details.setTextSize(26);
                                                    mrf2details.setText("details for modified risk factor 2 details for modified risk factor 2 details for modified risk factor 2 details for modified risk factor 2" +
                                                            "details for modified risk factor 2 details for modified risk factor 2 details for modified risk factor 2 details for modified risk factor 2");
                                                }else{
                                                    if(position == 11){
                                                        article.removeAllViewsInLayout();
                                                        article.setBackgroundColor(0X9000FF00);
                                                        TextView mrf3details = new TextView(article.getContext());
                                                        article.addView(mrf3details);
                                                        mrf3details.setTextSize(26);
                                                        mrf3details.setText("details for modified risk factor 3 details for modified risk factor 3 details for modified risk factor 3 details for modified risk factor 3" +
                                                                "details for modified risk factor 3 details for modified risk factor 3 details for modified risk factor 3 details for modified risk factor 3");
                                                    }else{
                                                        if(position == 12){
                                                            article.removeAllViewsInLayout();
                                                            article.setBackgroundColor(0X9000FF00);
                                                            TextView nmrf1details = new TextView(article.getContext());
                                                            article.addView(nmrf1details);
                                                            nmrf1details.setTextSize(26);
                                                            nmrf1details.setText("details for non modified risk factor 1 details for non modified risk factor 1 details for non modified risk factor 1 details for non modified risk factor 1" +
                                                                    "details for non modified risk factor 1 details for non modified risk factor 1 details for non modified risk factor 1 details for non modified risk factor 1" +
                                                                    "details for non modified risk factor 1 details for non modified risk factor 1");
                                                        }else{
                                                            if(position == 13){
                                                                article.removeAllViewsInLayout();
                                                                article.setBackgroundColor(0X9000FF00);
                                                                TextView nmrf2details = new TextView(article.getContext());
                                                                article.addView(nmrf2details);
                                                                nmrf2details.setTextSize(26);
                                                                nmrf2details.setText("details for non modified risk factor 2 details for non modified risk factor 2 details for non modified risk factor 2 details for non modified risk factor 2" +
                                                                        "details for non modified risk factor 2 details for non modified risk factor 2 details for non modified risk factor 2 details for non modified risk factor 2" +
                                                                        "details for non modified risk factor 2 details for non modified risk factor 2");
                                                            }else{
                                                                if(position == 14){
                                                                    article.removeAllViewsInLayout();
                                                                    article.setBackgroundColor(0X9000FF00);
                                                                    TextView nmrf3details = new TextView(article.getContext());
                                                                    article.addView(nmrf3details);
                                                                    nmrf3details.setTextSize(26);
                                                                    nmrf3details.setText("details for non modified risk factor 3 details for non modified risk factor 3 details for non modified risk factor 3 details for non modified risk factor 3" +
                                                                            "details for non modified risk factor 3 details for non modified risk factor 3 details for non modified risk factor 3 details for non modified risk factor 3" +
                                                                            "details for non modified risk factor 3 details for non modified risk factor 3");
                                                                } else {
                                                                    //GridLayout article = (GridLayout) getActivity().findViewById(R.id.article);
                                                                    article.setBackgroundColor(0xFF000000);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
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