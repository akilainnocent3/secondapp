package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xcf extends CharacterStyle implements UpdateAppearance {
    public final wcf a;

    public xcf(wcf wcfVar) {
        this.a = wcfVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            rlh rlhVar = rlh.a;
            wcf wcfVar = this.a;
            if (Intrinsics.g(wcfVar, rlhVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(wcfVar instanceof yae0)) {
                uhc.a();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            yae0 yae0Var = (yae0) wcfVar;
            textPaint.setStrokeWidth(yae0Var.a);
            textPaint.setStrokeMiter(yae0Var.b);
            int i = yae0Var.d;
            if (i == 0) {
                join = Paint.Join.MITER;
            } else if (i == 1) {
                join = Paint.Join.ROUND;
            } else {
                join = i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER;
            }
            textPaint.setStrokeJoin(join);
            int i2 = yae0Var.c;
            if (i2 == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i2 == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
            }
            textPaint.setStrokeCap(cap);
            k90 k90Var = yae0Var.e;
            textPaint.setPathEffect(k90Var != null ? k90Var.a : null);
        }
    }
}
