package com.example.strokeapp2;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.Display;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
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

    View.OnClickListener n = new  View.OnClickListener(){
        public void onClick(View v){
            updateArticleView(15);
        }
    };

    View.OnClickListener o = new  View.OnClickListener(){
        public void onClick(View v){
            updateArticleView(16);
        }
    };

    View.OnClickListener p = new  View.OnClickListener(){
        public void onClick(View v){
            updateArticleView(17);
        }
    };

    View.OnClickListener q = new  View.OnClickListener(){
        public void onClick(View v){
            updateArticleView(18);
        }
    };

    View.OnClickListener r = new  View.OnClickListener(){
        public void onClick(View v){
            updateArticleView(19);
        }
    };

    View.OnClickListener s = new  View.OnClickListener(){
        public void onClick(View v){
            updateArticleView(20);
        }
    };

    View.OnClickListener t = new  View.OnClickListener(){
        public void onClick(View v){
            updateArticleView(21);
        }
    };

    View.OnClickListener u = new  View.OnClickListener(){
        public void onClick(View v){
            updateArticleView(22);
        }
    };

    View.OnClickListener v = new  View.OnClickListener(){
        public void onClick(View v){
            updateArticleView(23);
        }
    };

    View.OnClickListener w = new  View.OnClickListener(){
        public void onClick(View v){
            updateArticleView(24);
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


    //This is essentially where everything happens**************************
    //*********************************************
    //*********************************************

    public void updateArticleView(int position) {
        //Log.i("xx", " " + position + " ");
        //GridView article = new GridView(frame.getContext());
        //article.setLayoutParams(getActivity().findViewById(R.id.grid).getLayoutParams());
        //article.setText(Ipsum.Articles[position]);
        FrameLayout Frame = (FrameLayout) getActivity().findViewById(R.id.article);
        LinearLayout article = new LinearLayout(Frame.getContext());
        article.removeAllViewsInLayout();
        //article.setLayoutParams(getActivity().findViewById(R.id.relative).getLayoutParams());
        //article.setColumnCount(1);
        article.setOrientation(LinearLayout.VERTICAL);
        //article.setLayoutDirection(LinearLayout.VERTICAL);

        Frame.addView(article);
        if (position == 0) {
            Frame.removeAllViewsInLayout();
            Frame.addView(article);
            //GridLayout article = (GridLayout) getActivity().findViewById(R.id.article);
            Frame.setBackgroundColor(0X8EFF0000);
            //frame.addView(article);
            TextView article_text1 = new TextView(article.getContext());
            //GridView grid1 = new GridView(article.getContext());
            article_text1.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            //grid1.addView(article_text1);
            //article_text1.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            article.addView(article_text1, RelativeLayout.LayoutParams.WRAP_CONTENT);
            article_text1.setOnClickListener(a);
            article_text1.setTextSize(23);
            article_text1.setText("Facial Drooping(click for Details)\n\n");
            TextView article_text2 = new TextView(article.getContext());
            //GridView grid2 = new GridView(article.getContext());
            article_text2.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            //grid2.addView(grid2);
            //article_text2.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            article.addView(article_text2, RelativeLayout.LayoutParams.WRAP_CONTENT);
            article_text2.setOnClickListener(b);
            article_text2.setTextSize(23);
            article_text2.setText("Slurred Speech(click for Details)\n\n");
            TextView article_text3 = new TextView(article.getContext());
            //GridView grid3 = new GridView(article.getContext());
            article_text3.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            //grid3.addView(article_text3);
            // article_text3.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            article.addView(article_text3, RelativeLayout.LayoutParams.WRAP_CONTENT);
            article_text3.setOnClickListener(c);
            article_text3.setTextSize(23);
            article_text3.setText("Other Symptoms(click for Details)\n\n");
            /*TextView article_text4 = new TextView(article.getContext());
            //GridView grid4 = new GridView(article.getContext());
            article_text4.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            //grid4.addView(article_text4);
            //article_text4.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            article.addView(article_text4, RelativeLayout.LayoutParams.WRAP_CONTENT);
            article_text4.setOnClickListener(d);
            article_text4.setTextSize(23);
            article_text4.setText("Arm Weakness(click for Details)\n\n");*/
        } else {
            if (position == 1) {
                Frame.removeAllViewsInLayout();
                Frame.addView(article);
                //GridLayout article = (GridLayout) getActivity().findViewById(R.id.article);
                Frame.setBackgroundColor(0X90FFFF00);

                TextView article_text5 = new TextView(article.getContext());
                article_text5.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                article.addView(article_text5);
                article_text5.setOnClickListener(e);
                article_text5.setTextSize(23);
                article_text5.setText("PREVENTION\n\n");
                TextView article_text6 = new TextView(article.getContext());
                article_text6.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                article.addView(article_text6);
                article_text6.setOnClickListener(f);
                article_text6.setTextSize(23);
                article_text6.setText("MODIFIED RISK FACTORS\n\n");
                TextView article_text7 = new TextView(article.getContext());
                article_text7.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                article.addView(article_text7);
                article_text7.setOnClickListener(g);
                article_text7.setTextSize(23);
                article_text7.setText("NON MODIFIED RISK FACTORS\n\n");

            } else {
                if (position == 2) {
                    //FrameLayout frame = (FrameLayout) getActivity().findViewById(R.id.frame);
                    //GridLayout article = (GridLayout) getActivity().findViewById(R.id.article);
                    Frame.removeAllViewsInLayout();
                    Frame.addView(article);
                    Frame.setBackgroundColor(0x8EFF0000);
                    ImageView image1 = new ImageView(article.getContext());
                    //image1.setPadding(100,0,100,0);
                    image1.setLayoutParams(new GridView.LayoutParams((Frame.getWidth()), Frame.getHeight() / 3));
                    //image1.setPadding(Frame.getWidth()/3, -100, 0, -100);
                    article.addView(image1);
                    image1.setImageResource(R.drawable.facial_drooping);
                    TextView facial_drooping = new TextView(article.getContext());
                    facial_drooping.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                    article.addView(facial_drooping);
                    facial_drooping.setTextSize(Frame.getWidth() / 22);
                    facial_drooping.setPadding(0, 0, 0, Frame.getHeight() / 200);
                    facial_drooping.setText("Does one side of the face droop or is it numb? Ask the person to smile. Is the person's " +
                            "smile uneven? *Arm Weakness – Is one arm weak or numb? Ask the person to raise both arms. Does one arm drift downward?");
                } else {
                    if (position == 3) {
                        //GridLayout article = (GridLayout) getActivity().findViewById(R.id.article);
                        Frame.removeAllViewsInLayout();
                        Frame.addView(article);
                        Frame.setBackgroundColor(0x8EFF0000);
                        ImageView image2 = new ImageView(article.getContext());
                        image2.setLayoutParams(new GridView.LayoutParams((Frame.getWidth()), Frame.getHeight() / 3));
                        article.addView(image2);
                        image2.setImageResource(R.drawable.confusion);
                        TextView slurred_speech = new TextView(article.getContext());
                        slurred_speech.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                        article.addView(slurred_speech);
                        slurred_speech.setTextSize(Frame.getWidth() / 22);
                        slurred_speech.setPadding(0, 0, 0, Frame.getHeight() / 200);
                        slurred_speech.setText(" Is speech slurred? Is the person unable to speak or hard to understand? Ask the person to re" +
                                "peat a simple sentence, like \"The sky is blue.\" Is the sentence repeated correctly?");
                    } else {
                        if (position == 4) {
                            //GridLayout article = (GridLayout) getActivity().findViewById(R.id.article);
                            Frame.removeAllViewsInLayout();
                            Frame.addView(article);
                            Frame.setBackgroundColor(0x8EFF0000);
                            ImageView image3 = new ImageView(article.getContext());
                            image3.setLayoutParams(new GridView.LayoutParams((Frame.getWidth()), Frame.getHeight() / 3));
                            article.addView(image3);
                            image3.setImageResource(R.drawable.severe_headache);
                            TextView other_symptoms = new TextView(article.getContext());
                            other_symptoms.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                            article.addView(other_symptoms);
                            other_symptoms.setTextSize(Frame.getWidth() / 27);
                            other_symptoms.setPadding(0, 0, 0, Frame.getHeight() / 200);
                            other_symptoms.setText("Sudden NUMBNESS or weakness of face, arm, or leg, especially on one side of the body\n" +
                                    "\n" +
                                    "Sudden CONFUSION, trouble speaking or understanding speech\n" +
                                    "\n" +
                                    "Sudden TROUBLE SEEING in one or both eyes\n" +
                                    "\n" +
                                    "Sudden TROUBLE WALKING, dizziness, loss of balance or coordination\n" +
                                    "\n" +
                                    "Sudden SEVERE HEADACHE with no known cause");
                        } else {/*
                            if (position == 5) {
                                //GridLayout article = (GridLayout) getActivity().findViewById(R.id.article);
                                Frame.removeAllViewsInLayout();
                                Frame.addView(article);
                                Frame.setBackgroundColor(0x8EFF0000);
                                ImageView image4 = new ImageView(article.getContext());
                                image4.setLayoutParams(new GridView.LayoutParams((Frame.getWidth()), Frame.getHeight()/3));
                                article.addView(image4);
                                image4.setImageResource(R.drawable.arm_weakness);
                                TextView arm_weakness = new TextView(article.getContext());
                                arm_weakness.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                                article.addView(arm_weakness);
                                arm_weakness.setTextSize(Frame.getWidth() / 27);
                                arm_weakness.setPadding(0, 0, 0, Frame.getHeight() / 200);
                                arm_weakness.setText("detailed description of symptom detailed description of symptom detailed description of symptom detailed description of symptom" +
                                        "detailed description of symptom detailed description of symptom detailed description of symptom detailed description of symptom");
                            } else {*/
                            if (position == 6) {
                                Frame.removeAllViewsInLayout();
                                Frame.addView(article);
                                Frame.setBackgroundColor(0X90FFFF00);
                                TextView prevention = new TextView(article.getContext());
                                article.addView(prevention);
                                prevention.setTextSize(Frame.getWidth() / 27);
                                prevention.setText("\n" +
                                        "Stroke may be prevented with healthier lifestyle choices. You can do plenty to decrease your risk of stroke by taking the appropriate measures. Here are the steps to take:\n" +
                                        "·      Stop smoking\n" +
                                        "·      Improve your eating habits\n" +
                                        "·      Exercise regularly\n" +
                                        "·      Maintain a healthy weight \n" +
                                        "·      Keep your blood pressure and cholesterol levels under control  \n" +
                                        "·      Keep your blood sugar at healthy levels\n" +
                                        "·      Limit the number of alcoholic beverages intake\n" +
                                        "Ask your doctor for help if you are overwhelmed and find it difficult. Health care providers may be able to easy your transition into a healthier lifestyle. ");
                            } else {
                                if (position == 7) {
                                    Frame.removeAllViewsInLayout();
                                    Frame.addView(article);
                                    Frame.setBackgroundColor(0X90FFFF00);
                                    TextView mrf1 = new TextView(article.getContext());
                                    mrf1.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                                    article.addView(mrf1);
                                    mrf1.setOnClickListener(h);
                                    mrf1.setTextSize(Frame.getWidth() / 40);
                                    mrf1.setText("High Blood Pressure(CLICK FOR DETAILED INFO)\n\n");
                                    TextView mrf2 = new TextView(article.getContext());
                                    mrf2.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                                    article.addView(mrf2);
                                    mrf2.setOnClickListener(i);
                                    mrf2.setTextSize(Frame.getWidth() / 40);
                                    mrf2.setText("Smoking(CLICK FOR DETAILED INFO)\n\n");
                                    TextView mrf3 = new TextView(article.getContext());
                                    mrf3.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                                    article.addView(mrf3);
                                    mrf3.setOnClickListener(j);
                                    mrf3.setTextSize(Frame.getWidth() / 40);
                                    mrf3.setText("Diabetes Mellitus(CLICK FOR DETAILED INFO)\n\n");

                                    TextView mrf4 = new TextView(article.getContext());
                                    mrf4.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                                    article.addView(mrf4);
                                    mrf4.setOnClickListener(n);
                                    mrf4.setTextSize(Frame.getWidth() / 40);
                                    mrf4.setText("Carotid or Other Artery Disease(CLICK FOR DETAILED INFO)\n\n");
                                    TextView mrf5 = new TextView(article.getContext());
                                    mrf5.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                                    article.addView(mrf5);
                                    mrf5.setOnClickListener(o);
                                    mrf5.setTextSize(Frame.getWidth() / 40);
                                    mrf5.setText("Peripheral Artery Disease(CLICK FOR DETAILED INFO)\n\n");
                                    TextView mrf6 = new TextView(article.getContext());
                                    mrf6.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                                    article.addView(mrf6);
                                    mrf6.setOnClickListener(p);
                                    mrf6.setTextSize(Frame.getWidth() / 40);
                                    mrf6.setText("Atrial Fibrillation(CLICK FOR DETAILED INFO)\n\n");
                                    TextView mrf7 = new TextView(article.getContext());
                                    mrf7.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                                    article.addView(mrf7);
                                    mrf7.setOnClickListener(q);
                                    mrf7.setTextSize(Frame.getWidth() / 40);
                                    mrf7.setText("Other Heart Disease(CLICK FOR DETAILED INFO)\n\n");
                                    TextView mrf8 = new TextView(article.getContext());
                                    mrf8.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                                    article.addView(mrf8);
                                    mrf8.setOnClickListener(r);
                                    mrf8.setTextSize(Frame.getWidth() / 40);
                                    mrf8.setText("Sickle Cell Disease(CLICK FOR DETAILED INFO)\n\n");

                                    TextView mrf9 = new TextView(article.getContext());
                                    mrf9.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                                    article.addView(mrf9);
                                    mrf9.setOnClickListener(s);
                                    mrf9.setTextSize(Frame.getWidth() / 40);
                                    mrf9.setText("High Blood Cholesterol(CLICK FOR DETAILED INFO)\n\n");
                                    TextView mrf10 = new TextView(article.getContext());
                                    mrf10.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                                    article.addView(mrf10);
                                    mrf10.setOnClickListener(t);
                                    mrf10.setTextSize(Frame.getWidth() / 40);
                                    mrf10.setText("Poor Diet(CLICK FOR DETAILED INFO)\n\n");
                                    TextView mrf11 = new TextView(article.getContext());
                                    mrf11.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                                    article.addView(mrf11);
                                    mrf11.setOnClickListener(u);
                                    mrf11.setTextSize(Frame.getWidth() / 40);
                                    mrf11.setText("Physical Inactivity and Obesity(CLICK FOR DETAILED INFO)\n\n");
                                } else {
                                    if (position == 8) {
                                        Frame.removeAllViewsInLayout();
                                        Frame.addView(article);
                                        Frame.setBackgroundColor(0X90FFFF00);
                                        TextView nmrf1 = new TextView(article.getContext());
                                        nmrf1.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                                        article.addView(nmrf1);
                                        nmrf1.setOnClickListener(k);
                                        nmrf1.setTextSize(Frame.getWidth() / 35);
                                        nmrf1.setText("Age(CLICK FOR DETAILED INFO)\n\n");
                                        TextView nmrf2 = new TextView(article.getContext());
                                        nmrf2.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                                        article.addView(nmrf2);
                                        nmrf2.setOnClickListener(l);
                                        nmrf2.setTextSize(Frame.getWidth() / 35);
                                        nmrf2.setText("Heredity(CLICK FOR DETAILED INFO)\n\n");
                                        TextView nmrf3 = new TextView(article.getContext());
                                        nmrf3.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                                        article.addView(nmrf3);
                                        nmrf3.setOnClickListener(m);
                                        nmrf3.setTextSize(Frame.getWidth() / 35);
                                        nmrf3.setText("Race(CLICK FOR DETAILED INFO)\n\n");

                                        TextView nmrf4 = new TextView(article.getContext());
                                        nmrf4.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                                        article.addView(nmrf4);
                                        nmrf4.setOnClickListener(v);
                                        nmrf4.setTextSize(Frame.getWidth() / 35);
                                        nmrf4.setText("Sex(gender)(CLICK FOR DETAILED INFO)\n\n");
                                        TextView nmrf5 = new TextView(article.getContext());
                                        nmrf5.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                                        article.addView(nmrf5);
                                        nmrf5.setOnClickListener(w);
                                        nmrf5.setTextSize(Frame.getWidth() / 35);
                                        nmrf5.setText("Prior Stroke, TIA or Heart Attack(CLICK FOR DETAILED INFO)\n\n");
                                        /*TextView nmrf6 = new TextView(article.getContext());
                                        nmrf6.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                                        article.addView(nmrf6);
                                        //nmrf6.setOnClickListener(s);
                                        nmrf6.setTextSize(Frame.getWidth() / 40);
                                        nmrf6.setText("NON MODIFIED RISK FACTOR 6(CLICK FOR DETAILED INFO)\n\n");*/
                                    } else {
                                        if (position == 9) {
                                            Frame.removeAllViewsInLayout();
                                            Frame.addView(article);
                                            Frame.setBackgroundColor(0X90FFFF00);
                                            TextView mrf1details = new TextView(article.getContext());
                                            article.addView(mrf1details);
                                            mrf1details.setTextSize(Frame.getWidth() / 20);
                                            mrf1details.setText("High blood pressure is the leading cause of stroke and the most important controllable risk factor for stroke. ");
                                        } else {
                                            if (position == 10) {
                                                Frame.removeAllViewsInLayout();
                                                Frame.addView(article);
                                                Frame.setBackgroundColor(0X90FFFF00);
                                                TextView mrf2details = new TextView(article.getContext());
                                                article.addView(mrf2details);
                                                mrf2details.setTextSize(Frame.getWidth() / 20);
                                                mrf2details.setText("In recent years, studies have shown cigarette smoking to be an important risk factor for stroke. The nicotine and carbon monoxide in cigarette smoke damage the" +
                                                        " cardiovascular system in many ways. The use of oral contraceptives combined with cigarette smoking greatly increases stroke risk.");
                                            } else {
                                                if (position == 11) {
                                                    Frame.removeAllViewsInLayout();
                                                    Frame.addView(article);
                                                    Frame.setBackgroundColor(0X90FFFF00);
                                                    TextView mrf3details = new TextView(article.getContext());
                                                    article.addView(mrf3details);
                                                    mrf3details.setTextSize(Frame.getWidth() / 20);
                                                    mrf3details.setText("Diabetes is an independent risk factor for stroke.  Many people with diabetes also have high blood pressure, high blood cholesterol and are overweight. This increases their risk even more. " +
                                                            "While diabetes is treatable, the presence of the disease still increases your risk of stroke.");
                                                } else {
                                                    if (position == 12) {
                                                        Frame.removeAllViewsInLayout();
                                                        Frame.addView(article);
                                                        Frame.setBackgroundColor(0X90FFFF00);
                                                        TextView nmrf1details = new TextView(article.getContext());
                                                        article.addView(nmrf1details);
                                                        nmrf1details.setTextSize(Frame.getWidth() / 20);
                                                        nmrf1details.setText("The chance of having a stroke approximately doubles for each " +
                                                                "decade of life after age 55. While stroke is common among the elderly, a lot of people under 65 also have strokes.");
                                                    } else {
                                                        if (position == 13) {
                                                            Frame.removeAllViewsInLayout();
                                                            Frame.addView(article);
                                                            Frame.setBackgroundColor(0X90FFFF00);
                                                            TextView nmrf2details = new TextView(article.getContext());
                                                            article.addView(nmrf2details);
                                                            nmrf2details.setTextSize(Frame.getWidth() / 20);
                                                            nmrf2details.setText("Your stroke risk may be greater if a parent, grandparent, sister or brother has had a stroke.");
                                                        } else {
                                                            if (position == 14) {
                                                                Frame.removeAllViewsInLayout();
                                                                Frame.addView(article);
                                                                Frame.setBackgroundColor(0X90FFFF00);
                                                                TextView nmrf3details = new TextView(article.getContext());
                                                                article.addView(nmrf3details);
                                                                nmrf3details.setTextSize(Frame.getWidth() / 20);
                                                                nmrf3details.setText("African-Americans have a much higher risk of death from a stroke than Caucasians do." +
                                                                        " This is partly because blacks have higher risks of high blood pressure, diabetes and obesity.");
                                                            } else {
                                                                if (position == 15) {
                                                                    Frame.removeAllViewsInLayout();
                                                                    Frame.addView(article);
                                                                    Frame.setBackgroundColor(0X90FFFF00);
                                                                    TextView mrf4details = new TextView(article.getContext());
                                                                    article.addView(mrf4details);
                                                                    mrf4details.setTextSize(Frame.getWidth() / 20);
                                                                    mrf4details.setText("The carotid arteries in your neck supply blood to your brain. A carotid artery narrowed by fatty deposits from atherosclerosis (plaque buildups in artery walls)" +
                                                                            " may become blocked by a blood clot. Carotid artery disease is also called carotid artery stenosis.");
                                                                } else {
                                                                    if (position == 16) {
                                                                        Frame.removeAllViewsInLayout();
                                                                        Frame.addView(article);
                                                                        Frame.setBackgroundColor(0X90FFFF00);
                                                                        TextView mrf5details = new TextView(article.getContext());
                                                                        article.addView(mrf5details);
                                                                        mrf5details.setTextSize(Frame.getWidth() / 20);
                                                                        mrf5details.setText("leg and arm muscles. It's caused by fatty buildups of plaque in artery walls. People with peripheral" +
                                                                                " artery disease have a higher risk of carotid artery disease, which raises their risk of stroke.");
                                                                    } else {
                                                                        if (position == 17) {
                                                                            Frame.removeAllViewsInLayout();
                                                                            Frame.addView(article);
                                                                            Frame.setBackgroundColor(0X90FFFF00);
                                                                            TextView mrf6details = new TextView(article.getContext());
                                                                            article.addView(mrf6details);
                                                                            mrf6details.setTextSize(Frame.getWidth() / 20);
                                                                            mrf6details.setText("This heart rhythm disorder raises the risk for stroke. The heart's upper chambers quiver instead of beating effectively, which can let the blood pool and clot." +
                                                                                    " If a clot breaks off, enters the bloodstream and lodges in an artery leading to the brain, a stroke results.");
                                                                        } else {
                                                                            if (position == 18) {
                                                                                Frame.removeAllViewsInLayout();
                                                                                Frame.addView(article);
                                                                                Frame.setBackgroundColor(0X90FFFF00);
                                                                                TextView mrf7details = new TextView(article.getContext());
                                                                                article.addView(mrf7details);
                                                                                mrf7details.setTextSize(Frame.getWidth() / 20);
                                                                                mrf7details.setText("People with coronary heart disease or heart failure have a higher risk of stroke than those with hearts that work normally. Dilated cardiomyopathy (an enlarged heart)," +
                                                                                        " heart valve disease and some types of congenital heart defects also raise the risk of stroke.");
                                                                            } else {
                                                                                if (position == 19) {
                                                                                    Frame.removeAllViewsInLayout();
                                                                                    Frame.addView(article);
                                                                                    Frame.setBackgroundColor(0X90FFFF00);
                                                                                    TextView mrf8details = new TextView(article.getContext());
                                                                                    article.addView(mrf8details);
                                                                                    mrf8details.setTextSize(Frame.getWidth() / 20);
                                                                                    mrf8details.setText("This is a genetic disorder that mainly affects African-American and Hispanic children. \"Sickled\" red blood cells are less able to carry oxygen to the body's tissues and organs. These cells " +
                                                                                            "also tend to stick to blood vessel walls, which can block arteries to the brain and cause a stroke");
                                                                                } else {
                                                                                    if (position == 20) {
                                                                                        Frame.removeAllViewsInLayout();
                                                                                        Frame.addView(article);
                                                                                        Frame.setBackgroundColor(0X90FFFF00);
                                                                                        TextView mrf9details = new TextView(article.getContext());
                                                                                        article.addView(mrf9details);
                                                                                        mrf9details.setTextSize(Frame.getWidth() / 20);
                                                                                        mrf9details.setText("People with high blood cholesterol have an increased risk for stroke.");
                                                                                    } else {
                                                                                        if (position == 21) {
                                                                                            Frame.removeAllViewsInLayout();
                                                                                            Frame.addView(article);
                                                                                            Frame.setBackgroundColor(0X90FFFF00);
                                                                                            TextView mrf10details = new TextView(article.getContext());
                                                                                            article.addView(mrf10details);
                                                                                            mrf10details.setTextSize(Frame.getWidth() / 20);
                                                                                            mrf10details.setText("Diets high in saturated fat, trans fat and cholesterol can raise blood cholesterol levels. Diets high in sodium (salt) can contribute to increased blood pressure. Diets with excess calories can contribute to obesity. Also" +
                                                                                                    ", a diet containing five or more servings of fruits and vegetables per day may reduce the risk of stroke )");
                                                                                        } else {
                                                                                            if (position == 22) {
                                                                                                Frame.removeAllViewsInLayout();
                                                                                                Frame.addView(article);
                                                                                                Frame.setBackgroundColor(0X90FFFF00);
                                                                                                TextView mrf11details = new TextView(article.getContext());
                                                                                                article.addView(mrf11details);
                                                                                                mrf11details.setTextSize(Frame.getWidth() / 20);
                                                                                                mrf11details.setText("Being inactive, obese or both can increase your risk of high blood pressure, high blood cholesterol, diabetes, heart disease and stroke. So go on a brisk walk, " +
                                                                                                        "take the stairs, and do whatever you can to make your life more active. ");
                                                                                            } else {
                                                                                                if (position == 23) {
                                                                                                    Frame.removeAllViewsInLayout();
                                                                                                    Frame.addView(article);
                                                                                                    Frame.setBackgroundColor(0X90FFFF00);
                                                                                                    TextView nmrf4details = new TextView(article.getContext());
                                                                                                    article.addView(nmrf4details);
                                                                                                    nmrf4details.setTextSize(Frame.getWidth() / 20);
                                                                                                    nmrf4details.setText("women have more strokes than men, and stroke kills more women than men. ");
                                                                                                } else {
                                                                                                    if (position == 24) {
                                                                                                        Frame.removeAllViewsInLayout();
                                                                                                        Frame.addView(article);
                                                                                                        Frame.setBackgroundColor(0X90FFFF00);
                                                                                                        TextView nmrf5details = new TextView(article.getContext());
                                                                                                        article.addView(nmrf5details);
                                                                                                        nmrf5details.setTextSize(Frame.getWidth() / 20);
                                                                                                        nmrf5details.setText("The risk of stroke for someone who has already had one is many times that of a person who has not");
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