package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import defpackage.j42;

/* JADX INFO: loaded from: classes4.dex */
public final class cfn<S extends j42> extends xdf {
    public final kef<S> C;
    public bfn<ObjectAnimator> D;
    public hwh0 E;

    public cfn(Context context, j42 j42Var, kef<S> kefVar, bfn<ObjectAnimator> bfnVar) {
        super(context, j42Var);
        this.C = kefVar;
        this.D = bfnVar;
        bfnVar.a = this;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x010c  */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        hwh0 hwh0Var;
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.A)) {
            ik0 ik0Var = this.c;
            j42 j42Var = this.b;
            if (ik0Var != null && ik0.a(this.a.getContentResolver()) == 0.0f && (hwh0Var = this.E) != null) {
                hwh0Var.setBounds(getBounds());
                this.E.setTint(j42Var.e[0]);
                this.E.draw(canvas);
                return;
            }
            canvas.save();
            Rect bounds = getBounds();
            float fB = b();
            ObjectAnimator objectAnimator = this.d;
            boolean z = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.e;
            boolean z2 = objectAnimator2 != null && objectAnimator2.isRunning();
            kef<S> kefVar = this.C;
            kefVar.a.d();
            kefVar.a(canvas, bounds, fB, z, z2);
            int i2 = j42Var.i;
            int i3 = this.z;
            boolean z3 = (j42Var instanceof LinearProgressIndicatorSpec) || ((j42Var instanceof CircularProgressIndicatorSpec) && ((CircularProgressIndicatorSpec) j42Var).s);
            boolean z4 = z3 && i2 == 0 && !j42Var.b(false);
            Paint paint = this.y;
            if (!z4) {
                if (z3) {
                    kef.a aVar = (kef.a) this.D.b.get(0);
                    kef.a aVar2 = (kef.a) rh6.a(1, this.D.b);
                    kef<S> kefVar2 = this.C;
                    if (kefVar2 instanceof efs) {
                        i = i2;
                        kefVar2.d(canvas, paint, 0.0f, aVar.a, j42Var.f, i3, i);
                        this.C.d(canvas, paint, aVar2.b, 1.0f, j42Var.f, i3, i);
                    } else {
                        i = i2;
                        canvas.save();
                        canvas.rotate(aVar2.g);
                        this.C.d(canvas, paint, aVar2.b, 1.0f + aVar.a, j42Var.f, i3, i);
                        canvas.restore();
                    }
                }
                for (int i4 = 0; i4 < this.D.b.size(); i4++) {
                    kef.a aVar3 = (kef.a) this.D.b.get(i4);
                    aVar3.f = c();
                    this.C.c(canvas, paint, aVar3, this.z);
                    if (i4 <= 0 && !z4 && z3) {
                        this.C.d(canvas, paint, ((kef.a) this.D.b.get(i4 - 1)).b, aVar3.a, j42Var.f, i3, i);
                    }
                }
                canvas.restore();
            }
            this.C.d(canvas, paint, 0.0f, 1.0f, j42Var.f, i3, 0);
            i = i2;
            while (i4 < this.D.b.size()) {
                kef.a aVar4 = (kef.a) this.D.b.get(i4);
                aVar4.f = c();
                this.C.c(canvas, paint, aVar4, this.z);
                if (i4 <= 0) {
                }
            }
            canvas.restore();
        }
    }

    @Override // defpackage.xdf
    public final boolean e(boolean z, boolean z2, boolean z3) {
        hwh0 hwh0Var;
        boolean zE = super.e(z, z2, z3);
        if (this.c != null && ik0.a(this.a.getContentResolver()) == 0.0f && (hwh0Var = this.E) != null) {
            return hwh0Var.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.D.a();
        }
        if (z && z3) {
            this.D.f();
        }
        return zE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.C.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.C.f();
    }
}
