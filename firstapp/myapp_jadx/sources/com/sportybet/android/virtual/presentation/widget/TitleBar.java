package com.sportybet.android.virtual.presentation.widget;

import android.accounts.Account;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import defpackage.e5m;
import defpackage.jyf0;
import defpackage.uqm;

/* JADX INFO: loaded from: classes6.dex */
public class TitleBar extends e5m {
    public final TextView c;
    public final View d;
    public final View e;
    public final View f;
    public final TextView i;
    public uqm v;

    public TitleBar(Context context) {
        super(context);
        if (!isInEditMode() && !this.b) {
            this.b = true;
            ((jyf0) generatedComponent()).q(this);
        }
        View.inflate(getContext(), R.layout.title_bar, this);
        this.c = (TextView) findViewById(R.id.balance);
        this.i = (TextView) findViewById(R.id.title);
        this.d = findViewById(R.id.register);
        this.e = findViewById(R.id.login);
        this.f = findViewById(R.id.divide_line);
    }

    public final void a() {
        Account account = this.v.getAccount();
        TextView textView = this.c;
        View view = this.f;
        View view2 = this.e;
        View view3 = this.d;
        if (account == null) {
            view3.setVisibility(0);
            view2.setVisibility(0);
            view.setVisibility(0);
            textView.setVisibility(8);
            return;
        }
        view3.setVisibility(8);
        view2.setVisibility(8);
        view.setVisibility(8);
        textView.setVisibility(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setTitle(int i) {
        this.i.setText(i);
    }

    public TitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), R.layout.title_bar, this);
        this.c = (TextView) findViewById(R.id.balance);
        this.i = (TextView) findViewById(R.id.title);
        this.d = findViewById(R.id.register);
        this.e = findViewById(R.id.login);
        this.f = findViewById(R.id.divide_line);
    }
}
