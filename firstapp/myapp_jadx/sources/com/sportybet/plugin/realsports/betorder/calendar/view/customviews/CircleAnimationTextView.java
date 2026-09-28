package com.sportybet.plugin.realsports.betorder.calendar.view.customviews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.appcompat.widget.AppCompatTextView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betorder.calendar.view.CalendarView;
import defpackage.l980;
import defpackage.uyc;
import defpackage.vn7;

/* JADX INFO: loaded from: classes7.dex */
public class CircleAnimationTextView extends AppCompatTextView {
    public boolean A;
    public Paint B;
    public Paint C;
    public uyc D;
    public int E;
    public boolean F;
    public long G;
    public Paint H;
    public Rect I;
    public Paint J;
    public Rect K;
    public l980 v;
    public CalendarView w;
    public int y;
    public boolean z;

    public class a extends Animation {
        public a() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            CircleAnimationTextView circleAnimationTextView = CircleAnimationTextView.this;
            circleAnimationTextView.setAnimationProgress((int) (f * 100.0f));
            circleAnimationTextView.requestLayout();
        }
    }

    public CircleAnimationTextView(Context context) {
        super(context);
    }

    private int getCircleWidth() {
        if (getParent() instanceof View) {
            View view = (View) getParent();
            if (view.getWidth() > 0) {
                return view.getWidth();
            }
            if (view.getMeasuredWidth() > 0) {
                return view.getMeasuredWidth();
            }
        }
        if (getWidth() > 0) {
            return getWidth();
        }
        if (getMeasuredWidth() > 0) {
            return getMeasuredWidth();
        }
        Context context = getContext();
        return Math.min(((WindowManager) context.getSystemService("window")).getDefaultDisplay().getWidth(), context.getResources().getDimensionPixelSize(R.dimen.calendar_date_grid_max_width)) / 7;
    }

    private Rect getRectangleForState() {
        int iOrdinal = this.v.ordinal();
        if (iOrdinal == 1) {
            return new Rect(getWidth() / 2, 10, getWidth(), getHeight() - 10);
        }
        if (iOrdinal == 2) {
            return new Rect(0, 10, getWidth() / 2, getHeight() - 10);
        }
        if (iOrdinal != 3) {
            return null;
        }
        return new Rect(0, 10, getWidth(), getHeight() - 10);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.z) {
            g();
        }
        l980 l980Var = this.v;
        if (l980Var != null) {
            int iOrdinal = l980Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1 || iOrdinal == 2) {
                    if (this.H == null) {
                        Paint paint = new Paint();
                        this.H = paint;
                        paint.setColor(this.w.getSelectedDayBackgroundColor());
                        this.H.setFlags(1);
                    }
                    Rect rectangleForState = this.I;
                    if (rectangleForState == null) {
                        rectangleForState = getRectangleForState();
                        this.I = rectangleForState;
                    }
                    canvas.drawRect(rectangleForState, this.H);
                    if (this.C == null || this.A) {
                        Paint paint2 = new Paint();
                        this.C = paint2;
                        paint2.setColor(this.w.getSelectedDayBackgroundColor());
                        this.C.setFlags(1);
                    }
                    canvas.drawCircle(getWidth() / 2, getWidth() / 2, (getWidth() - 20) / 2, this.C);
                    h(canvas);
                } else if (iOrdinal == 3) {
                    if (this.J == null) {
                        Paint paint3 = new Paint();
                        this.J = paint3;
                        paint3.setColor(this.w.getSelectedDayBackgroundColor());
                        this.J.setFlags(1);
                    }
                    Rect rectangleForState2 = this.K;
                    if (rectangleForState2 == null) {
                        rectangleForState2 = getRectangleForState();
                        this.K = rectangleForState2;
                    }
                    canvas.drawRect(rectangleForState2, this.J);
                } else if (iOrdinal == 4) {
                    boolean z = (this.F || this.y == 100) ? false : true;
                    boolean z2 = this.F && System.currentTimeMillis() > this.G + 300 && this.y != 100;
                    if (z || z2) {
                        a aVar = new a();
                        aVar.setDuration(300L);
                        aVar.setAnimationListener(new vn7(this));
                        startAnimation(aVar);
                        invalidate();
                    } else {
                        h(canvas);
                    }
                }
            } else {
                h(canvas);
            }
        }
        super.draw(canvas);
    }

    public final void g() {
        this.v = null;
        this.w = null;
        this.B = null;
        this.H = null;
        this.I = null;
        this.A = false;
        this.E = 0;
        this.y = 0;
        this.F = false;
        this.G = 0L;
        setBackgroundColor(0);
        this.z = false;
    }

    public l980 getSelectionState() {
        return this.v;
    }

    public final void h(Canvas canvas) {
        uyc uycVar;
        if (this.y == 100 && (uycVar = this.D) != null) {
            uycVar.h = true;
        }
        if (this.B == null || this.A) {
            Paint paint = new Paint();
            this.B = paint;
            paint.setColor(this.E);
            this.B.setFlags(1);
        }
        int width = (this.y * (getWidth() - 20)) / 100;
        setBackgroundColor(0);
        canvas.drawCircle(getWidth() / 2, getWidth() / 2, width / 2, this.B);
    }

    public final void i(int i) {
        this.E = i;
        this.y = 100;
        int circleWidth = getCircleWidth();
        setWidth(circleWidth);
        setHeight(circleWidth);
        requestLayout();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824));
        } else {
            super.onMeasure(i, i);
        }
    }

    public void setAnimationProgress(int i) {
        this.y = i;
    }

    public void setSelectionStateAndAnimate(l980 l980Var, CalendarView calendarView, uyc uycVar) {
        l980 l980Var2 = this.v;
        this.A = l980Var2 == null || l980Var2 != l980Var;
        this.v = l980Var;
        this.w = calendarView;
        uycVar.g = l980Var;
        this.D = uycVar;
        if (l980Var != null && calendarView != null) {
            int iOrdinal = l980Var.ordinal();
            if (iOrdinal == 0) {
                setBackgroundColor(0);
                this.E = calendarView.getSelectedDayBackgroundStartColor();
            } else if (iOrdinal == 1) {
                this.E = calendarView.getSelectedDayBackgroundStartColor();
            } else if (iOrdinal == 2) {
                this.E = calendarView.getSelectedDayBackgroundEndColor();
            } else if (iOrdinal == 4) {
                this.E = calendarView.getSelectedDayBackgroundColor();
                setBackgroundColor(0);
            }
        }
        a aVar = new a();
        aVar.setDuration(300L);
        aVar.setAnimationListener(new vn7(this));
        startAnimation(aVar);
        invalidate();
    }

    public CircleAnimationTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircleAnimationTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
