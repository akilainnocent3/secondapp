package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public abstract class jkd0 extends hkd0 {
    public final hkd0[] Q;
    public int R;

    public jkd0() {
        hkd0[] hkd0VarArrL = l();
        this.Q = hkd0VarArrL;
        for (hkd0 hkd0Var : hkd0VarArrL) {
            hkd0Var.setCallback(this);
        }
        k(this.Q);
    }

    @Override // defpackage.hkd0
    public final int c() {
        return this.R;
    }

    @Override // defpackage.hkd0
    public ValueAnimator d() {
        return null;
    }

    @Override // defpackage.hkd0, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        h(canvas);
    }

    @Override // defpackage.hkd0
    public final void e(int i) {
        this.R = i;
        for (int i2 = 0; i2 < j(); i2++) {
            i(i2).e(i);
        }
    }

    public void h(Canvas canvas) {
        hkd0[] hkd0VarArr = this.Q;
        if (hkd0VarArr != null) {
            for (hkd0 hkd0Var : hkd0VarArr) {
                int iSave = canvas.save();
                hkd0Var.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
    }

    public final hkd0 i(int i) {
        hkd0[] hkd0VarArr = this.Q;
        if (hkd0VarArr == null) {
            return null;
        }
        return hkd0VarArr[i];
    }

    @Override // defpackage.hkd0, android.graphics.drawable.Animatable
    public final boolean isRunning() {
        boolean z;
        hkd0[] hkd0VarArr = this.Q;
        int length = hkd0VarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            if (hkd0VarArr[i].isRunning()) {
                z = true;
                break;
            }
            i++;
        }
        return z || super.isRunning();
    }

    public final int j() {
        hkd0[] hkd0VarArr = this.Q;
        if (hkd0VarArr == null) {
            return 0;
        }
        return hkd0VarArr.length;
    }

    public abstract hkd0[] l();

    @Override // defpackage.hkd0, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        for (hkd0 hkd0Var : this.Q) {
            hkd0Var.setBounds(rect);
        }
    }

    @Override // defpackage.hkd0, android.graphics.drawable.Animatable
    public final void start() {
        super.start();
        for (hkd0 hkd0Var : this.Q) {
            hkd0Var.start();
        }
    }

    @Override // defpackage.hkd0, android.graphics.drawable.Animatable
    public final void stop() {
        super.stop();
        for (hkd0 hkd0Var : this.Q) {
            hkd0Var.stop();
        }
    }

    @Override // defpackage.hkd0
    public final void b(Canvas canvas) {
    }

    public void k(hkd0... hkd0VarArr) {
    }
}
