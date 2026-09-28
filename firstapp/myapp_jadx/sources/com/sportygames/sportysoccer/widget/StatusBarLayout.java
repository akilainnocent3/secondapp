package com.sportygames.sportysoccer.widget;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import defpackage.b3;

/* JADX INFO: loaded from: classes8.dex */
public class StatusBarLayout extends RelativeLayout {
    public TextView a;
    public TextView b;
    public ViewGroup c;
    public ImageView d;

    public StatusBarLayout(Context context) {
        super(context);
    }

    private void setInfoMarginRight(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.b.getLayoutParams());
        marginLayoutParams.setMargins(0, 0, i, 0);
        this.b.setLayoutParams(new LinearLayout.LayoutParams(marginLayoutParams));
    }

    public final void a(int i) {
        this.d.setVisibility(0);
        setInfoMarginRight((int) getContext().getResources().getDimension(R.dimen.sg_highest_score_margin_right));
        this.b.setText(getContext().getString(R.string.sg_common_functions_status_bar_high_score, String.valueOf(i)));
    }

    public final void b(float f) {
        this.d.setVisibility(8);
        setInfoMarginRight((int) getContext().getResources().getDimension(R.dimen.sg_next_win_amount_margin_right));
        this.b.setText(getContext().getString(R.string.sg_sporty_soccer_potential_win, b3.K(String.valueOf(f))));
    }

    public RectF getLeaderBoardIconRect() {
        int left = this.d.getLeft() + this.c.getLeft() + getLeft();
        int top = this.d.getTop() + this.c.getTop() + getTop();
        return new RectF(left, top, this.d.getWidth() + left, this.d.getHeight() + top);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.streak);
        this.b = (TextView) findViewById(R.id.info);
        this.c = (ViewGroup) findViewById(R.id.info_container);
        this.d = (ImageView) findViewById(R.id.leader_board_icon);
    }

    public void setLeaderBoardIconNormal() {
        this.d.setImageResource(R.drawable.sg_btn_leader_board);
    }

    public void setLeaderBoardIconPressed() {
        this.d.setImageResource(R.drawable.sg_btn_leader_board_pressed);
    }

    public StatusBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StatusBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
