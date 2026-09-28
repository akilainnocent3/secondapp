package com.sportygames.sportysoccer.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.sportysoccer.activities.GameActivity;
import defpackage.b3;
import defpackage.fbn;
import defpackage.th8;

/* JADX INFO: loaded from: classes8.dex */
public class CelebrationLayout extends RelativeLayout {
    public TextView a;
    public RelativeLayout b;
    public RelativeLayout c;
    public FullButtonLayout d;
    public GameActivity.b e;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            GameActivity.b bVar = CelebrationLayout.this.e;
            if (bVar == null || bVar.a) {
                return;
            }
            bVar.a = true;
            GameActivity.this.z.c("cash_out_celebration", null);
        }
    }

    public CelebrationLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.cashout_amount);
        this.d = (FullButtonLayout) findViewById(R.id.custom_btn_next);
        this.b = (RelativeLayout) findViewById(R.id.small_celebration);
        this.c = (RelativeLayout) findViewById(R.id.big_celebration);
        FullButtonLayout fullButtonLayout = this.d;
        fullButtonLayout.a.setText(getResources().getString(R.string.sg_common_functions__ok));
        this.d.setOnClickListener(new a());
        fbn fbnVarA = th8.a();
        fbnVarA.a("https://s.sporty.net/ke/main/res/73130683b0707f4e66379f71d58ee86b.png", (ImageView) findViewById(R.id.ss_celebration_image));
        fbnVarA.b("https://s.sporty.net/ke/main/res/98e4e7d7067d425bd8819c74c537efcc.png", (ImageView) findViewById(R.id.cashout_amount_title));
    }

    public void setData(boolean z, float f, String str) {
        RelativeLayout relativeLayout = this.b;
        if (z) {
            relativeLayout.setVisibility(8);
            this.c.setVisibility(0);
            this.d.setText(getResources().getString(R.string.sg_common_functions_start));
        } else {
            relativeLayout.setVisibility(0);
            this.c.setVisibility(8);
            this.d.setText(getResources().getString(R.string.sg_common_functions__ok));
        }
        this.a.setText(b3.K(String.valueOf(f)));
    }

    public CelebrationLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CelebrationLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
