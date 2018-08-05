package com.am.framework.activity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.QuoteSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.MenuItem;
import android.widget.TextView;

import com.am.framework.R;
import com.binaryfork.spanny.Spanny;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SpannyActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.textView)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spanny);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        showBackArrow();

        Spanny spanny = new Spanny("StyleSpan, ", new StyleSpan(Typeface.BOLD_ITALIC))
                .append("Underline, ", new UnderlineSpan())
                .append("Typeface, ", new TypefaceSpan("serif"))
                .append("URL, ", new URLSpan("https://www.google.com"))
                .append("Strike through, ", new StrikethroughSpan())
                .append("Quote, ", new QuoteSpan(Color.RED))
                .append("Plain text, ")
                .append("Subscript, ", new SubscriptSpan())
                .append("Superscript, ", new SuperscriptSpan())
                .append("BackgroundColor, ", new BackgroundColorSpan(Color.RED))
                .append("ForegroundColor, ", new ForegroundColorSpan(Color.RED))
                .append("Alignment,\n ", new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER))
                .append("TextAppearance, ", new TextAppearanceSpan(this, android.R.style.TextAppearance_Medium))
                .append("ImageSpan, ", new ImageSpan(getApplicationContext(), R.drawable.ic_cheer_active))
                .append("RelativeSize, ", new RelativeSizeSpan(1.5f))
                .append("Multiple spans, ", new StyleSpan(Typeface.ITALIC), new UnderlineSpan(), new TextAppearanceSpan(this, android.R.style.TextAppearance_Large), new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER), new BackgroundColorSpan(Color.LTGRAY));
        textView.setText(spanny);


    }




}
