package com.sportybet.android.user;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public class ErrorView extends LinearLayout {
    public final Button a;
    public final TextView b;

    public ErrorView(Context context) {
        super(context);
        setOrientation(1);
        setGravity(1);
        LayoutInflater.from(getContext()).inflate(R.layout.error_view, this);
        this.a = (Button) findViewById(R.id.retry);
        this.b = (TextView) findViewById(R.id.title);
    }

    public Button getButton() {
        return this.a;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public ErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        setGravity(1);
        LayoutInflater.from(getContext()).inflate(R.layout.error_view, this);
        this.a = (Button) findViewById(R.id.retry);
        this.b = (TextView) findViewById(R.id.title);
    }
}
