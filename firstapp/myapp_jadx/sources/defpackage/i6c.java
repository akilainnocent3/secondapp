package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i6c implements LeadingMarginSpan {
    public final float a;
    public final float b;
    public final wcf c;
    public final mmd d;
    public final int e;
    public final int f;

    public i6c(float f, float f2, float f3, wcf wcfVar, mmd mmdVar, float f4) {
        this.a = f;
        this.b = f2;
        this.c = wcfVar;
        this.d = mmdVar;
        int iB = ycv.b(f + f3);
        this.e = iB;
        this.f = ycv.b(f4) - iB;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(final Canvas canvas, final Paint paint, int i, final int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        Paint.Cap cap;
        Paint.Join join;
        if (canvas == null) {
            return;
        }
        final float f = (i3 + i5) / 2.0f;
        int i8 = i - this.e;
        if (i8 < 0) {
            i8 = 0;
        }
        final int i9 = i8;
        charSequence.getClass();
        if (((Spanned) charSequence).getSpanStart(this) != i6 || paint == null) {
            return;
        }
        Paint.Style style = paint.getStyle();
        rlh rlhVar = rlh.a;
        wcf wcfVar = this.c;
        Integer numValueOf = null;
        if (Intrinsics.g(wcfVar, rlhVar)) {
            paint.setStyle(Paint.Style.FILL);
        } else {
            if (!(wcfVar instanceof yae0)) {
                uhc.a();
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            yae0 yae0Var = (yae0) wcfVar;
            paint.setStrokeWidth(yae0Var.a);
            paint.setStrokeMiter(yae0Var.b);
            int i10 = yae0Var.c;
            if (i10 == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i10 == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i10 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
            }
            paint.setStrokeCap(cap);
            int i11 = yae0Var.d;
            if (i11 == 0) {
                join = Paint.Join.MITER;
            } else if (i11 == 1) {
                join = Paint.Join.ROUND;
            } else {
                join = i11 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER;
            }
            paint.setStrokeJoin(join);
            k90 k90Var = yae0Var.e;
            paint.setPathEffect(k90Var != null ? k90Var.a : null);
        }
        final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.a)) << 32) | (((long) Float.floatToRawIntBits(this.b)) & 4294967295L);
        Function0 function0 = new Function0(this) { // from class: h6c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i12 = i2;
                asr asrVar = asr.a;
                long j = jFloatToRawIntBits;
                float fC = yw90.c(j) / 2.0f;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fC)) << 32) | (((long) Float.floatToRawIntBits(fC)) & 4294967295L);
                b9z.c cVar = new b9z.c(bys.c(pk40.b(0L, j), jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits2));
                float f2 = i9;
                Canvas canvas2 = canvas;
                Paint paint2 = paint;
                float f3 = f;
                lz50 lz50Var = cVar.a;
                if (bys.f(lz50Var)) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (lz50Var.e >> 32));
                    canvas2.drawRoundRect(f2, f3 - (lz50Var.a() / 2.0f), (lz50Var.b() * i12) + f2, (lz50Var.a() / 2.0f) + f3, fIntBitsToFloat, fIntBitsToFloat, paint2);
                } else {
                    j90 j90VarA = m90.a();
                    bxz.s(j90VarA, lz50Var);
                    canvas2.save();
                    canvas2.translate(f2, f3 - (lz50Var.a() / 2.0f));
                    canvas2.drawPath(j90VarA.a, paint2);
                    canvas2.restore();
                }
                return Unit.a;
            }
        };
        if (!Float.isNaN(Float.NaN)) {
            numValueOf = Integer.valueOf(paint.getAlpha());
            paint.setAlpha((int) Math.rint(Double.NaN));
        }
        function0.invoke();
        if (numValueOf != null) {
            paint.setAlpha(numValueOf.intValue());
        }
        paint.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        int i = this.f;
        if (i >= 0) {
            return 0;
        }
        return Math.abs(i);
    }
}
