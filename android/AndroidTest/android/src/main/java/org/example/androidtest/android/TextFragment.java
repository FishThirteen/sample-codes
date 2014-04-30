package org.example.androidtest.android;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Hatsune Miku on 4/28/14.
 */
public class TextFragment extends Fragment {
    public static String TEXTKEY = "textkey";

    private TextView textview;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View parent = inflater.inflate(R.layout.fragment_text, null);
        textview = (TextView)parent.findViewById(R.id.textview);

        Bundle bundle = getArguments();
        textview.setText(bundle.getString(TEXTKEY));

        return parent;
    }
}
