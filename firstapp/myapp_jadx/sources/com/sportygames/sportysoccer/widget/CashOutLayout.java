package com.sportygames.sportysoccer.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.sportysoccer.activities.GameActivity;
import com.sportygames.sportysoccer.widget.CashOutLayout;
import defpackage.b3;
import defpackage.th8;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes8.dex */
public class CashOutLayout extends RelativeLayout {
    public static final /* synthetic */ int f = 0;
    public ButtonLayout a;
    public ButtonLayout b;
    public TextView c;
    public TextView d;
    public GameActivity.d e;

    public CashOutLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.c = (TextView) findViewById(R.id.shot_round);
        this.d = (TextView) findViewById(R.id.ss_cash_out_next_win_amount);
        ButtonLayout buttonLayout = (ButtonLayout) findViewById(R.id.btn_continue);
        this.a = buttonLayout;
        buttonLayout.a(100, R.drawable.sg_icon_practice, getContext().getString(R.string.sg_common_functions_game_challenge));
        this.a.setOnClickListener(new View.OnClickListener() { // from class: rl6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = CashOutLayout.f;
                GameActivity.d dVar = this.a.e;
                if (dVar == null || dVar.a) {
                    return;
                }
                dVar.a = true;
                GameActivity gameActivity = GameActivity.this;
                int i2 = GameActivity.H;
                gameActivity.w1(false, false);
            }
        });
        ButtonLayout buttonLayout2 = (ButtonLayout) findViewById(R.id.btn_cash_out);
        this.b = buttonLayout2;
        buttonLayout2.a(HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS, R.drawable.sg_icon_cashout, getContext().getString(R.string.sg_common_functions_cash_out));
        this.b.setOnClickListener(new View.OnClickListener() { // from class: sl6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = CashOutLayout.f;
                GameActivity.d dVar = this.a.e;
                if (dVar == null || dVar.a) {
                    return;
                }
                dVar.a = true;
                GameActivity gameActivity = GameActivity.this;
                int i2 = GameActivity.H;
                gameActivity.w1(true, false);
            }
        });
        th8.a().a("https://s.sporty.net/ke/main/res/73130683b0707f4e66379f71d58ee86b.png", (ImageView) findViewById(R.id.winning_image));
    }

    public void setAmount(int i, float f2) {
        int i2 = i % 10;
        if (i2 == 1) {
            this.c.setText(getContext().getString(R.string.sg_sporty_soccer_first_shot));
        } else if (i2 == 2) {
            this.c.setText(getContext().getString(R.string.sg_sporty_soccer_second_shot));
        } else {
            TextView textView = this.c;
            if (i2 == 3) {
                textView.setText(getContext().getString(R.string.sg_sporty_soccer_third_shot));
            } else {
                textView.setText(getContext().getString(R.string.sg_sporty_soccer_n_shot, String.valueOf(i)));
            }
        }
        this.d.setText(b3.K(String.valueOf(f2)));
    }

    public void setBtnCashOutText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public CashOutLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CashOutLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
