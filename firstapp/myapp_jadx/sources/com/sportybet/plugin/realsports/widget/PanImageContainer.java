package com.sportybet.plugin.realsports.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public class PanImageContainer extends ConstraintLayout {
    public SwipeRefreshLayout F;
    public final ImageView G;
    public final ImageView H;
    public final int I;
    public float J;
    public float K;
    public float L;
    public float M;
    public int N;
    public int O;
    public boolean P;

    public PanImageContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.I = ViewConfiguration.get(context).getScaledTouchSlop();
        View.inflate(context, R.layout.gift_box_container, this);
        this.G = (ImageView) findViewById(R.id.gift_box);
        this.H = (ImageView) findViewById(R.id.close);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f = 0.0f;
        if (motionEvent.getAction() == 2) {
            float rawX = motionEvent.getRawX() + this.L;
            int i = this.N;
            if (rawX < 0.0f) {
                rawX = 0.0f;
            } else {
                float f2 = i;
                if (rawX > f2) {
                    rawX = f2;
                }
            }
            setTranslationX(rawX);
            float rawY = motionEvent.getRawY() + this.M;
            float f3 = this.O;
            if (rawY < f3) {
                f = f3;
            } else if (rawY <= 0.0f) {
                f = rawY;
            }
            setTranslationY(f);
            float fAbs = Math.abs(this.J - motionEvent.getRawX());
            float f4 = this.I;
            this.P = fAbs > f4 || Math.abs(this.K - motionEvent.getRawY()) > f4;
            return true;
        }
        if (motionEvent.getAction() != 0) {
            if (motionEvent.getAction() != 1) {
                return false;
            }
            if (!this.P) {
                return super.dispatchTouchEvent(motionEvent);
            }
            if (getTranslationX() * 2.0f < this.N) {
                animate().translationX(0.0f);
                return true;
            }
            animate().translationX(this.N);
            return true;
        }
        this.P = false;
        this.J = motionEvent.getRawX();
        this.K = motionEvent.getRawY();
        this.L = getTranslationX() - motionEvent.getRawX();
        this.M = getTranslationY() - motionEvent.getRawY();
        SwipeRefreshLayout swipeRefreshLayout = this.F;
        if (swipeRefreshLayout == null) {
            this.N = (((View) getParent()).getWidth() - getWidth()) - (getResources().getDimensionPixelSize(R.dimen.ten) * 2);
            this.O = -((((View) getParent()).getHeight() - getHeight()) - (getResources().getDimensionPixelSize(R.dimen.eight) * 2));
        } else {
            this.N = (swipeRefreshLayout.getWidth() - getWidth()) - (getResources().getDimensionPixelSize(R.dimen.ten) * 2);
            this.O = -((this.F.getHeight() - getHeight()) - (getResources().getDimensionPixelSize(R.dimen.eight) * 2));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public PanImageContainer(Context context) {
        this(context, null);
    }
}
