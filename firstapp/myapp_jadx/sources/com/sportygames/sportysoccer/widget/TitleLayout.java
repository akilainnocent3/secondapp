package com.sportygames.sportysoccer.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import defpackage.hpa0;
import defpackage.wij;

/* JADX INFO: loaded from: classes8.dex */
public class TitleLayout extends RelativeLayout {
    public TextView a;
    public com.sportygames.sportysoccer.activities.a b;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            hpa0 hpa0Var = wij.a().c;
            if (hpa0Var != null) {
                hpa0Var.b();
            }
            TitleLayout.this.b.finish();
        }
    }

    public TitleLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.title);
        ((ImageView) findViewById(R.id.back)).setOnClickListener(new a());
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public TitleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TitleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
