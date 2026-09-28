package com.sportybet.plugin.realsports.event;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.event.ChangeMatchPanel;
import defpackage.mfb0;

/* JADX INFO: loaded from: classes4.dex */
public class ChangeMatchPanel extends LinearLayout {
    public static final /* synthetic */ int f = 0;
    public mfb0 a;
    public LayoutInflater b;
    public LoadingView c;
    public LinearLayout d;
    public a e;

    public interface a {
        void a(Event event);

        void b();
    }

    public ChangeMatchPanel(Context context) {
        super(context);
        a();
    }

    public final void a() {
        setOrientation(1);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        this.b = layoutInflaterFrom;
        layoutInflaterFrom.inflate(R.layout.spr_match_thumbnail, this);
        LoadingView loadingView = (LoadingView) findViewById(R.id.loading);
        this.c = loadingView;
        loadingView.setOnClickListener(new View.OnClickListener() { // from class: w47
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ChangeMatchPanel.f;
                ChangeMatchPanel.a aVar = this.a.e;
                if (aVar != null) {
                    aVar.b();
                }
            }
        });
        this.d = (LinearLayout) findViewById(R.id.container);
    }

    public void setListener(a aVar) {
        this.e = aVar;
    }

    public void setSportRule(mfb0 mfb0Var) {
        this.a = mfb0Var;
    }

    public ChangeMatchPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public ChangeMatchPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
