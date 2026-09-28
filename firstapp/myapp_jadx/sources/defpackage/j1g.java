package defpackage;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes.dex */
public abstract class j1g extends ReplacementSpan {
    public final t9h0 b;
    public final Paint.FontMetricsInt a = new Paint.FontMetricsInt();
    public short c = -1;
    public float d = 1.0f;

    public j1g(t9h0 t9h0Var) {
        km20.f(t9h0Var, "rasterizer cannot be null");
        this.b = t9h0Var;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        t9h0 t9h0Var = this.b;
        bpv bpvVarB = t9h0Var.b();
        int iA = bpvVarB.a(14);
        this.d = fAbs / (iA != 0 ? bpvVarB.b.getShort(iA + bpvVarB.a) : (short) 0);
        bpv bpvVarB2 = t9h0Var.b();
        int iA2 = bpvVarB2.a(14);
        if (iA2 != 0) {
            bpvVarB2.b.getShort(iA2 + bpvVarB2.a);
        }
        bpv bpvVarB3 = t9h0Var.b();
        int iA3 = bpvVarB3.a(12);
        short s = (short) ((iA3 != 0 ? bpvVarB3.b.getShort(iA3 + bpvVarB3.a) : (short) 0) * this.d);
        this.c = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
