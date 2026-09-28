package com.sportybet.android.instantwin.presentation.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.widget.NextButtonLayout;

/* JADX INFO: loaded from: classes.dex */
public class NextButtonLayout extends LinearLayout {
    public static final /* synthetic */ int e = 0;
    public TextView a;
    public TextView b;
    public LinearLayout c;
    public a d;

    public interface a {
        void a();
    }

    public NextButtonLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(getContext(), R.layout.iwqk_layout_next_button, this);
        setOrientation(1);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.next_button_title);
        this.b = (TextView) findViewById(R.id.content);
        this.c = (LinearLayout) findViewById(R.id.main_layout);
        setOnClickListener(new View.OnClickListener() { // from class: orx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = NextButtonLayout.e;
                NextButtonLayout.a aVar = this.a.d;
                if (aVar != null) {
                    aVar.a();
                }
            }
        });
    }

    public void setData(String str, String str2, a aVar) {
        this.a.setText(str);
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        TextView textView = this.b;
        if (zIsEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            this.b.setText(str2);
        }
        this.d = aVar;
    }

    public NextButtonLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NextButtonLayout(Context context) {
        this(context, null);
    }
}
