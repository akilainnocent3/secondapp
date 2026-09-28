package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class PagerTabStrip extends PagerTitleStrip {
    public int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final Paint L;
    public final Rect M;
    public int N;
    public boolean O;
    public boolean P;
    public final int Q;
    public boolean R;
    public float S;
    public float T;
    public final int U;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.L = paint;
        this.M = new Rect();
        this.N = 255;
        this.O = false;
        this.P = false;
        int i = this.C;
        this.F = i;
        paint.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.G = (int) ((3.0f * f) + 0.5f);
        this.H = (int) ((6.0f * f) + 0.5f);
        this.I = (int) (64.0f * f);
        this.K = (int) ((16.0f * f) + 0.5f);
        this.Q = (int) ((1.0f * f) + 0.5f);
        this.J = (int) ((f * 32.0f) + 0.5f);
        this.U = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.b.setFocusable(true);
        this.b.setOnClickListener(new a());
        this.d.setFocusable(true);
        this.d.setOnClickListener(new b());
        if (getBackground() == null) {
            this.O = true;
        }
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public final void c(int i, float f, boolean z) {
        int height = getHeight();
        TextView textView = this.c;
        int left = textView.getLeft();
        int i2 = this.K;
        int right = textView.getRight() + i2;
        int i3 = height - this.G;
        Rect rect = this.M;
        rect.set(left - i2, i3, right, height);
        super.c(i, f, z);
        this.N = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(textView.getLeft() - i2, i3, textView.getRight() + i2, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.O;
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.J);
    }

    public int getTabIndicatorColor() {
        return this.F;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        TextView textView = this.c;
        int left = textView.getLeft();
        int i = this.K;
        int i2 = left - i;
        int right = textView.getRight() + i;
        int i3 = height - this.G;
        int i4 = (this.N << 24) | (this.F & 16777215);
        Paint paint = this.L;
        paint.setColor(i4);
        float f = height;
        canvas.drawRect(i2, i3, right, f, paint);
        if (this.O) {
            paint.setColor((this.F & 16777215) | (-16777216));
            canvas.drawRect(getPaddingLeft(), height - this.Q, getWidth() - getPaddingRight(), f, paint);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.R) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.S = x;
            this.T = y;
            this.R = false;
            return true;
        }
        if (action == 1) {
            TextView textView = this.c;
            int left = textView.getLeft();
            int i = this.K;
            if (x < left - i) {
                ViewPager viewPager = this.a;
                viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
                return true;
            }
            if (x > textView.getRight() + i) {
                ViewPager viewPager2 = this.a;
                viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
            }
        } else if (action == 2) {
            float fAbs = Math.abs(x - this.S);
            float f = this.U;
            if (fAbs > f || Math.abs(y - this.T) > f) {
                this.R = true;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        if (this.P) {
            return;
        }
        this.O = (i & (-16777216)) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.P) {
            return;
        }
        this.O = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.P) {
            return;
        }
        this.O = i == 0;
    }

    public void setDrawFullUnderline(boolean z) {
        this.O = z;
        this.P = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.H;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(int i) {
        this.F = i;
        this.L.setColor(i);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i) {
        setTabIndicatorColor(getContext().getColor(i));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i) {
        int i2 = this.I;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }

    public PagerTabStrip(Context context) {
        this(context, null);
    }
}
