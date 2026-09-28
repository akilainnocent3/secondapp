package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.material.loadingindicator.LoadingIndicatorSpec;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes4.dex */
public final class fys extends Drawable implements Drawable.Callback {
    public final Context b;
    public final LoadingIndicatorSpec c;
    public final gys d;
    public final eys e;
    public int i;
    public hwh0 v;
    public ik0 a = new ik0();
    public final Paint f = new Paint();

    public fys(Context context, LoadingIndicatorSpec loadingIndicatorSpec, gys gysVar, eys eysVar) {
        this.b = context;
        this.c = loadingIndicatorSpec;
        this.d = gysVar;
        this.e = eysVar;
        eysVar.g = this;
        setAlpha(255);
    }

    public final boolean a(boolean z, boolean z2, boolean z3) {
        boolean visible = super.setVisible(z, z2);
        eys eysVar = this.e;
        ObjectAnimator objectAnimator = eysVar.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ckd0 ckd0Var = eysVar.e;
        if (ckd0Var != null) {
            ckd0Var.e();
        }
        if (!z || !z3 || (this.a != null && ik0.a(this.b.getContentResolver()) == 0.0f)) {
            return visible;
        }
        if (eysVar.e == null) {
            ckd0 ckd0Var2 = new ckd0(eysVar, eys.j);
            dkd0 dkd0Var = new dkd0();
            dkd0Var.b(200.0f);
            dkd0Var.a(0.6f);
            ckd0Var2.s = dkd0Var;
            ckd0Var2.j = 0.01f;
            eysVar.e = ckd0Var2;
        }
        if (eysVar.d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(eysVar, eys.i, 0.0f, 1.0f);
            eysVar.d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(650L);
            eysVar.d.setInterpolator(null);
            eysVar.d.setRepeatCount(-1);
            eysVar.d.addListener(new dys(eysVar));
        }
        eysVar.a = 1;
        eysVar.a(0.0f);
        eysVar.h.a = eysVar.f.d[0];
        eysVar.e.d(eysVar.a);
        eysVar.d.start();
        return visible;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        hwh0 hwh0Var;
        Rect rect = new Rect();
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            ik0 ik0Var = this.a;
            int i2 = 0;
            LoadingIndicatorSpec loadingIndicatorSpec = this.c;
            if (ik0Var != null && ik0.a(this.b.getContentResolver()) == 0.0f && (hwh0Var = this.v) != null) {
                hwh0Var.setBounds(bounds);
                this.v.setTint(loadingIndicatorSpec.d[0]);
                this.v.draw(canvas);
                return;
            }
            canvas.save();
            gys gysVar = this.d;
            gysVar.getClass();
            LoadingIndicatorSpec loadingIndicatorSpec2 = gysVar.a;
            canvas.translate(bounds.centerX(), bounds.centerY());
            float f = 2.0f;
            canvas.clipRect((-Math.max(loadingIndicatorSpec2.c, loadingIndicatorSpec2.a)) / 2.0f, (-Math.max(loadingIndicatorSpec2.b, loadingIndicatorSpec2.a)) / 2.0f, Math.max(loadingIndicatorSpec2.c, loadingIndicatorSpec2.a) / 2.0f, Math.max(loadingIndicatorSpec2.b, loadingIndicatorSpec2.a) / 2.0f);
            canvas.rotate(-90.0f);
            int i3 = loadingIndicatorSpec.e;
            int i4 = this.i;
            float fMin = Math.min(loadingIndicatorSpec2.b, loadingIndicatorSpec2.c) / 2.0f;
            int iA = vbv.a(i3, i4);
            Paint paint = this.f;
            paint.setColor(iA);
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            int i5 = loadingIndicatorSpec2.b;
            int i6 = loadingIndicatorSpec2.c;
            canvas.drawRoundRect(new RectF((-i5) / 2.0f, (-i6) / 2.0f, i5 / 2.0f, i6 / 2.0f), fMin, fMin, paint);
            gys.a aVar = this.e.h;
            int i7 = this.i;
            Matrix matrix = gysVar.c;
            paint.setColor(vbv.a(aVar.a, i7));
            paint.setStyle(style);
            canvas.save();
            canvas.rotate(aVar.c);
            Path path = gysVar.b;
            path.rewind();
            int iFloor = (int) Math.floor(aVar.b);
            g5w[] g5wVarArr = gys.e;
            int length = g5wVarArr.length;
            int i8 = iFloor / length;
            if ((iFloor ^ length) < 0 && i8 * length != iFloor) {
                i8--;
            }
            float f2 = aVar.b - iFloor;
            g5w g5wVar = g5wVarArr[iFloor - (i8 * length)];
            g5wVar.getClass();
            ngs ngsVarB = a.b();
            ArrayList arrayList = g5wVar.a;
            int size = arrayList.size();
            e4c e4cVar = null;
            int i9 = 0;
            e4c e4cVar2 = null;
            while (i9 < size) {
                float[] fArr = new float[8];
                int i10 = i2;
                for (int i11 = 8; i2 < i11; i11 = 8) {
                    fArr[i2] = csh0.c(((e4c) ((Pair) arrayList.get(i9)).a).a[i2], ((e4c) ((Pair) arrayList.get(i9)).b).a[i2], f2);
                    i2++;
                    f = f;
                }
                float f3 = f;
                e4c e4cVar3 = new e4c(fArr);
                if (e4cVar2 == null) {
                    e4cVar2 = e4cVar3;
                }
                if (e4cVar != null) {
                    ngsVarB.add(e4cVar);
                }
                i9++;
                e4cVar = e4cVar3;
                i2 = i10;
                f = f3;
            }
            int i12 = i2;
            float f4 = f;
            if (e4cVar != null && e4cVar2 != null) {
                float[] fArr2 = e4cVar.a;
                float f5 = fArr2[i12];
                float f6 = fArr2[1];
                float f7 = fArr2[2];
                float f8 = fArr2[3];
                float f9 = fArr2[4];
                float f10 = fArr2[5];
                float[] fArr3 = e4cVar2.a;
                ngsVarB.add(i4c.a(f5, f6, f7, f8, f9, f10, fArr3[i12], fArr3[1]));
            }
            ngs ngsVarA = a.a(ngsVarB);
            path.rewind();
            int i13 = 1;
            int i14 = i12;
            for (int b = ngsVarA.getB(); i14 < b; b = b) {
                e4c e4cVar4 = (e4c) ngsVarA.get(i14);
                if (i13 != 0) {
                    float[] fArr4 = e4cVar4.a;
                    path.moveTo(fArr4[i12], fArr4[1]);
                    i = i12;
                } else {
                    i = i13;
                }
                float[] fArr5 = e4cVar4.a;
                path.cubicTo(fArr5[2], fArr5[3], fArr5[4], fArr5[5], e4cVar4.a(), e4cVar4.b());
                i14++;
                i13 = i;
            }
            path.close();
            float f11 = loadingIndicatorSpec2.a / f4;
            matrix.setScale(f11, f11);
            path.transform(matrix);
            canvas.drawPath(path, paint);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        LoadingIndicatorSpec loadingIndicatorSpec = this.d.a;
        return Math.max(loadingIndicatorSpec.b, loadingIndicatorSpec.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        LoadingIndicatorSpec loadingIndicatorSpec = this.d.a;
        return Math.max(loadingIndicatorSpec.c, loadingIndicatorSpec.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.i != i) {
            this.i = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return a(z, z2, z);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
