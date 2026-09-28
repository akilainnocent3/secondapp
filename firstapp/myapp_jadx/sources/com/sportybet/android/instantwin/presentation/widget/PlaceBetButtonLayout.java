package com.sportybet.android.instantwin.presentation.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.n590;

/* JADX INFO: loaded from: classes6.dex */
public class PlaceBetButtonLayout extends LinearLayout {
    public TextView a;
    public TextView b;
    public TextView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public LinearLayout i;
    public LinearLayout v;
    public FrameLayout w;
    public ViewGroup y;
    public ShimmerFrameLayout z;

    public PlaceBetButtonLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(getContext(), R.layout.iwqk_layout_place_bet_button, this);
        setOrientation(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        setLeftActionShimmerEnabled(false);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.w = (FrameLayout) findViewById(R.id.left_action_btn_container);
        this.i = (LinearLayout) findViewById(R.id.left_action_btn);
        this.v = (LinearLayout) findViewById(R.id.right_action_btn);
        this.z = (ShimmerFrameLayout) findViewById(R.id.left_action_shimmer);
        this.c = (TextView) findViewById(R.id.left_action_text);
        this.d = (TextView) findViewById(R.id.right_action_text);
        this.a = (TextView) findViewById(R.id.left_count_badge);
        this.b = (TextView) findViewById(R.id.right_count_badge);
        this.e = (TextView) findViewById(R.id.change_teams);
        this.y = (ViewGroup) findViewById(R.id.small_open_bets_button);
        this.f = (TextView) findViewById(R.id.small_open_bets_button_badge);
    }

    public void setChangeTeamsClick(View.OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
    }

    public void setChangeTeamsVisible(boolean z) {
        FrameLayout frameLayout = this.w;
        if (frameLayout != null) {
            frameLayout.setVisibility(z ? 8 : 0);
        }
        TextView textView = this.e;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 8);
        }
    }

    public void setLeftActionBtnBackgroundColor(int i) {
        this.i.setBackgroundResource(i);
    }

    public void setLeftActionBtnText(String str) {
        this.c.setText(str);
    }

    public void setLeftActionShimmerEnabled(boolean z) {
        FrameLayout frameLayout;
        if (this.z == null || (frameLayout = this.w) == null) {
            return;
        }
        if (!z || frameLayout.getVisibility() != 0) {
            this.z.setVisibility(8);
            ShimmerFrameLayout shimmerFrameLayout = this.z;
            shimmerFrameLayout.d();
            shimmerFrameLayout.c = false;
            shimmerFrameLayout.invalidate();
            this.z.d();
            return;
        }
        this.z.setVisibility(0);
        this.z.c();
        n590 n590Var = this.z.b;
        ValueAnimator valueAnimator = n590Var.e;
        if (valueAnimator == null || valueAnimator.isStarted() || n590Var.getCallback() == null) {
            return;
        }
        n590Var.e.start();
    }

    public void setLeftBtnClick(View.OnClickListener onClickListener) {
        this.w.setOnClickListener(onClickListener);
    }

    public void setLeftCountBadge(int i) {
        this.a.setVisibility(i > 0 ? 0 : 8);
        this.a.setText(String.valueOf(i));
    }

    public void setRightActionBtnText(String str) {
        this.d.setText(str);
    }

    public void setRightBtnClick(View.OnClickListener onClickListener) {
        this.v.setOnClickListener(onClickListener);
    }

    public void setRightCountBadge(int i) {
        this.b.setVisibility(i > 0 ? 0 : 8);
        this.b.setText(String.valueOf(i));
    }

    public void setSmallOpenBetsButtonBadge(int i) {
        if (i <= 0) {
            this.y.setVisibility(8);
        } else {
            this.f.setText(String.valueOf(i));
            this.y.setVisibility(0);
        }
    }

    public void setSmallOpenBetsButtonClick(View.OnClickListener onClickListener) {
        this.y.setOnClickListener(onClickListener);
    }

    public PlaceBetButtonLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlaceBetButtonLayout(Context context) {
        this(context, null);
    }
}
