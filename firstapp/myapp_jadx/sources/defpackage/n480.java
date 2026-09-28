package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.seekbar.RangeSeekBar;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes6.dex */
public final class n480 {
    public final boolean A;
    public Bitmap B;
    public Bitmap C;
    public Bitmap D;
    public ValueAnimator E;
    public String F;
    public final RangeSeekBar I;
    public String J;
    public DecimalFormat O;
    public int P;
    public int Q;
    public final int a;
    public int b;
    public final int c;
    public final int d;
    public int e;
    public int f;
    public final int g;
    public final int h;
    public final float i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public int o;
    public int p;
    public final int q;
    public final int r;
    public final float s;
    public int t;
    public int u;
    public int v;
    public int w;
    public float x;
    public boolean z;
    public float y = 0.0f;
    public boolean G = false;
    public boolean H = true;
    public final Path K = new Path();
    public final Rect L = new Rect();
    public final Rect M = new Rect();
    public final Paint N = new Paint(1);

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            n480 n480Var = n480.this;
            n480Var.y = fFloatValue;
            RangeSeekBar rangeSeekBar = n480Var.I;
            if (rangeSeekBar != null) {
                rangeSeekBar.invalidate();
            }
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            n480 n480Var = n480.this;
            n480Var.y = 0.0f;
            RangeSeekBar rangeSeekBar = n480Var.I;
            if (rangeSeekBar != null) {
                rangeSeekBar.invalidate();
            }
        }
    }

    public n480(RangeSeekBar rangeSeekBar, AttributeSet attributeSet, boolean z) {
        this.I = rangeSeekBar;
        this.A = z;
        TypedArray typedArrayObtainStyledAttributes = rangeSeekBar.getContext().obtainStyledAttributes(attributeSet, sk30.d);
        if (typedArrayObtainStyledAttributes != null) {
            this.d = (int) typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
            this.e = typedArrayObtainStyledAttributes.getResourceId(3, 0);
            this.a = typedArrayObtainStyledAttributes.getInt(11, 1);
            this.b = typedArrayObtainStyledAttributes.getLayoutDimension(4, -1);
            this.c = typedArrayObtainStyledAttributes.getLayoutDimension(14, -1);
            this.g = (int) typedArrayObtainStyledAttributes.getDimension(13, zrh0.b(14.0f, rangeSeekBar.getContext()));
            this.h = typedArrayObtainStyledAttributes.getColor(12, -1);
            this.j = typedArrayObtainStyledAttributes.getColor(2, rangeSeekBar.getContext().getColor(R.color.colorAccent));
            this.k = (int) typedArrayObtainStyledAttributes.getDimension(7, 0.0f);
            this.l = (int) typedArrayObtainStyledAttributes.getDimension(8, 0.0f);
            this.m = (int) typedArrayObtainStyledAttributes.getDimension(9, 0.0f);
            this.n = (int) typedArrayObtainStyledAttributes.getDimension(6, 0.0f);
            this.f = (int) typedArrayObtainStyledAttributes.getDimension(1, 0.0f);
            this.o = typedArrayObtainStyledAttributes.getResourceId(32, 0);
            this.p = typedArrayObtainStyledAttributes.getResourceId(34, 0);
            this.q = (int) typedArrayObtainStyledAttributes.getDimension(36, zrh0.b(26.0f, rangeSeekBar.getContext()));
            this.r = (int) typedArrayObtainStyledAttributes.getDimension(33, zrh0.b(26.0f, rangeSeekBar.getContext()));
            this.s = typedArrayObtainStyledAttributes.getFloat(35, 1.0f);
            this.i = typedArrayObtainStyledAttributes.getDimension(10, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
        i();
        j();
    }

    public final boolean a(float f, float f2) {
        int progressWidth = (int) (this.I.getProgressWidth() * this.x);
        return f > ((float) (this.t + progressWidth)) && f < ((float) (this.u + progressWidth)) && f2 > ((float) this.v) && f2 < ((float) this.w);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x01e1  */
    public final void b(Canvas canvas) {
        RangeSeekBar rangeSeekBar;
        float f;
        float f2;
        int iWidth;
        int iHeight;
        if (this.H) {
            RangeSeekBar rangeSeekBar2 = this.I;
            int progressWidth = (int) (rangeSeekBar2.getProgressWidth() * this.x);
            canvas.save();
            canvas.translate(progressWidth, 0.0f);
            canvas.translate(this.t, 0.0f);
            if (this.z) {
                String str = this.F;
                o480[] rangeSeekBarState = rangeSeekBar2.getRangeSeekBarState();
                if (TextUtils.isEmpty(str)) {
                    DecimalFormat decimalFormat = this.O;
                    if (this.A) {
                        str = decimalFormat != null ? decimalFormat.format(rangeSeekBarState[0].b) : rangeSeekBarState[0].a;
                    } else {
                        str = decimalFormat != null ? decimalFormat.format(rangeSeekBarState[1].b) : rangeSeekBarState[1].a;
                    }
                }
                String str2 = this.J;
                if (str2 != null) {
                    str = String.format(str2, str);
                }
                if (str == null) {
                    rangeSeekBar = rangeSeekBar2;
                    f = 0.0f;
                    f2 = 2.0f;
                } else {
                    float f3 = this.g;
                    Paint paint = this.N;
                    paint.setTextSize(f3);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setColor(this.j);
                    int length = str.length();
                    Rect rect = this.L;
                    paint.getTextBounds(str, 0, length, rect);
                    int iWidth2 = rect.width();
                    int i = this.k;
                    int i2 = this.l;
                    int i3 = iWidth2 + i + i2;
                    int i4 = this.c;
                    if (i4 > i3) {
                        i3 = i4;
                    }
                    int iHeight2 = rect.height();
                    int i5 = this.m;
                    int i6 = this.n;
                    int i7 = iHeight2 + i5 + i6;
                    f2 = 2.0f;
                    int i8 = this.b;
                    if (i8 > i7) {
                        i7 = i8;
                    }
                    int i9 = this.P;
                    f = 0.0f;
                    int i10 = (int) ((i9 / 2.0f) - (i3 / 2.0f));
                    Rect rect2 = this.M;
                    rect2.left = i10;
                    rangeSeekBar = rangeSeekBar2;
                    int i11 = ((this.w - i7) - this.Q) - this.d;
                    rect2.top = i11;
                    rect2.right = i10 + i3;
                    int i12 = i11 + i7;
                    rect2.bottom = i12;
                    if (this.D == null) {
                        int i13 = i9 / 2;
                        int i14 = this.f;
                        int i15 = i13 - i14;
                        int i16 = i13 + i14;
                        Path path = this.K;
                        path.reset();
                        path.moveTo(i13, i12);
                        float f4 = i12 - i14;
                        path.lineTo(i15, f4);
                        path.lineTo(i16, f4);
                        path.close();
                        canvas.drawPath(path, paint);
                        int i17 = rect2.bottom;
                        int i18 = this.f;
                        rect2.bottom = i17 - i18;
                        rect2.top -= i18;
                    }
                    int iB = zrh0.b(1.0f, rangeSeekBar.getContext());
                    int iWidth3 = (((rect2.width() / 2) - ((int) (rangeSeekBar.getProgressWidth() * this.x))) - rangeSeekBar.getProgressLeft()) + iB;
                    int iWidth4 = (((rect2.width() / 2) - ((int) ((1.0f - this.x) * rangeSeekBar.getProgressWidth()))) - rangeSeekBar.getProgressPaddingRight()) + iB;
                    if (iWidth3 > 0) {
                        rect2.left += iWidth3;
                        rect2.right += iWidth3;
                    } else if (iWidth4 > 0) {
                        rect2.left -= iWidth4;
                        rect2.right -= iWidth4;
                    }
                    Bitmap bitmap = this.D;
                    if (bitmap != null) {
                        try {
                            if (NinePatch.isNinePatchChunk(bitmap.getNinePatchChunk())) {
                                NinePatch.isNinePatchChunk(bitmap.getNinePatchChunk());
                                new NinePatch(bitmap, bitmap.getNinePatchChunk(), null).draw(canvas, rect2);
                            } else {
                                canvas.drawBitmap(bitmap, rect2.left, rect2.top, paint);
                            }
                        } catch (Exception unused) {
                        }
                    } else {
                        float f5 = this.i;
                        if (f5 > 0.0f) {
                            canvas.drawRoundRect(new RectF(rect2), f5, f5, paint);
                        } else {
                            canvas.drawRect(rect2, paint);
                        }
                    }
                    if (i > 0) {
                        iWidth = rect2.left + i;
                    } else {
                        iWidth = i2 > 0 ? (rect2.right - i2) - rect.width() : rect2.left + ((i3 - rect.width()) / 2);
                    }
                    if (i5 > 0) {
                        iHeight = rect.height() + rect2.top + i5;
                    } else {
                        int i19 = rect2.bottom;
                        iHeight = i6 > 0 ? (i19 - rect.height()) - i6 : (i19 - ((i7 - rect.height()) / 2)) + 1;
                    }
                    paint.setColor(this.h);
                    canvas.drawText(str, iWidth, iHeight, paint);
                }
            } else {
                rangeSeekBar = rangeSeekBar2;
                f = 0.0f;
                f2 = 2.0f;
            }
            Bitmap bitmap2 = this.C;
            if (bitmap2 == null || this.G) {
                Bitmap bitmap3 = this.B;
                if (bitmap3 != null) {
                    canvas.drawBitmap(bitmap3, 0.0f, ((rangeSeekBar.getProgressHeight() - this.Q) / f2) + rangeSeekBar.getProgressTop(), (Paint) null);
                }
            } else {
                canvas.drawBitmap(bitmap2, f, ((rangeSeekBar.getProgressHeight() - this.Q) / f2) + rangeSeekBar.getProgressTop(), (Paint) null);
            }
            canvas.restore();
        }
    }

    public final int c() {
        int i = this.b;
        Bitmap bitmap = this.D;
        int i2 = this.d;
        if (i > 0) {
            return bitmap != null ? i + i2 : i + this.f + i2;
        }
        int i3 = this.n;
        int i4 = this.m;
        int i5 = this.g;
        return bitmap != null ? zrh0.e(i5, "8").height() + i4 + i3 + i2 : zrh0.e(i5, "8").height() + i4 + i3 + i2 + this.f;
    }

    public final float d() {
        RangeSeekBar rangeSeekBar = this.I;
        float maxProgress = rangeSeekBar.getMaxProgress() - rangeSeekBar.getMinProgress();
        return (maxProgress * this.x) + rangeSeekBar.getMinProgress();
    }

    public final float e() {
        return g() + this.b + this.f + this.d;
    }

    public final Resources f() {
        RangeSeekBar rangeSeekBar = this.I;
        if (rangeSeekBar.getContext() != null) {
            return rangeSeekBar.getContext().getResources();
        }
        return null;
    }

    public final float g() {
        return this.r * this.s;
    }

    public final float h() {
        return this.q * this.s;
    }

    public final void i() {
        int i = this.e;
        if (i != 0) {
            this.e = i;
            this.D = BitmapFactory.decodeResource(f(), i);
        }
        n(this.o, this.q, this.r);
        int i2 = this.p;
        if (i2 == 0 || f() == null) {
            return;
        }
        this.p = i2;
        this.C = zrh0.d(this.q, this.r, f().getDrawable(i2, null));
    }

    public final void j() {
        int i = this.q;
        this.P = i;
        this.Q = this.r;
        if (this.b == -1) {
            this.b = zrh0.e(this.g, "8").height() + this.m + this.n;
        }
        if (this.f <= 0) {
            this.f = i / 4;
        }
    }

    public final void k() {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.y, 0.0f);
        this.E = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new a());
        this.E.addListener(new b());
        this.E.start();
    }

    public final void l(int i, int i2) {
        j();
        i();
        float f = i;
        this.t = (int) (f - (h() / 2.0f));
        this.u = (int) ((h() / 2.0f) + f);
        int i3 = this.r / 2;
        this.v = i2 - i3;
        this.w = i3 + i2;
    }

    public final void m(boolean z) {
        int i = this.a;
        if (i == 0) {
            this.z = z;
            return;
        }
        if (i == 1) {
            this.z = false;
        } else if (i == 2 || i == 3) {
            this.z = true;
        }
    }

    public final void n(int i, int i2, int i3) {
        if (i == 0 || f() == null || i2 <= 0 || i3 <= 0) {
            return;
        }
        this.o = i;
        this.B = zrh0.d(i2, i3, f().getDrawable(i, null));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0005 A[PHI: r0
      0x0005: PHI (r0v2 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0003, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    public final void o(float f) {
        float f2 = 0.0f;
        if (f < 0.0f) {
            f = f2;
        } else {
            f2 = 1.0f;
            if (f > 1.0f) {
                f = f2;
            }
        }
        this.x = f;
    }
}
