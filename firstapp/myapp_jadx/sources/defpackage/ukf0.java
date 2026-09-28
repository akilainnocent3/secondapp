package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ukf0 {
    public final tkf0 a;
    public final zjw b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public ukf0(tkf0 tkf0Var, zjw zjwVar, long j) {
        this.a = tkf0Var;
        this.b = zjwVar;
        this.c = j;
        ArrayList arrayList = zjwVar.h;
        float f = 0.0f;
        this.d = arrayList.isEmpty() ? 0.0f : ((jrz) arrayList.get(0)).a.c();
        if (!arrayList.isEmpty()) {
            jrz jrzVar = (jrz) CollectionsKt.b0(arrayList);
            f = jrzVar.a.f() + jrzVar.f;
        }
        this.e = f;
        this.f = zjwVar.g;
    }

    public final lg50 a(int i) {
        zjw zjwVar = this.b;
        zjwVar.k(i);
        int length = zjwVar.a.a.b.length();
        ArrayList arrayList = zjwVar.h;
        jrz jrzVar = (jrz) arrayList.get(i == length ? arrayList.size() - 1 : kf9.b(i, arrayList));
        return jrzVar.a.b(jrzVar.d(i));
    }

    public final lk40 b(int i) {
        float fI;
        float fI2;
        float fH;
        float fH2;
        zjw zjwVar = this.b;
        zjwVar.j(i);
        ArrayList arrayList = zjwVar.h;
        jrz jrzVar = (jrz) arrayList.get(kf9.b(i, arrayList));
        e90 e90Var = jrzVar.a;
        int iD = jrzVar.d(i);
        CharSequence charSequence = e90Var.e;
        if (iD < 0 || iD >= charSequence.length()) {
            StringBuilder sbA = efe0.a(iD, "offset(", ") is out of bounds [0,");
            sbA.append(charSequence.length());
            sbA.append(')');
            xkn.a(sbA.toString());
        }
        qkf0 qkf0Var = e90Var.d;
        Layout layout = qkf0Var.f;
        int lineForOffset = layout.getLineForOffset(iD);
        float fG = qkf0Var.g(lineForOffset);
        float fE = qkf0Var.e(lineForOffset);
        boolean z = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fH = qkf0Var.i(iD, false);
                fH2 = qkf0Var.i(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fH = qkf0Var.h(iD, false);
                fH2 = qkf0Var.h(iD + 1, true);
            } else {
                fI = qkf0Var.i(iD, false);
                fI2 = qkf0Var.i(iD + 1, true);
            }
            float f = fH;
            fI = fH2;
            fI2 = f;
        } else {
            fI = qkf0Var.h(iD, false);
            fI2 = qkf0Var.h(iD + 1, true);
        }
        RectF rectF = new RectF(fI, fG, fI2, fE);
        return jrzVar.a(new lk40(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final lk40 c(int i) {
        zjw zjwVar = this.b;
        zjwVar.k(i);
        int length = zjwVar.a.a.b.length();
        ArrayList arrayList = zjwVar.h;
        jrz jrzVar = (jrz) arrayList.get(i == length ? arrayList.size() - 1 : kf9.b(i, arrayList));
        e90 e90Var = jrzVar.a;
        int iD = jrzVar.d(i);
        CharSequence charSequence = e90Var.e;
        qkf0 qkf0Var = e90Var.d;
        if (iD < 0 || iD > charSequence.length()) {
            StringBuilder sbA = efe0.a(iD, "offset(", ") is out of bounds [0,");
            sbA.append(charSequence.length());
            sbA.append(']');
            xkn.a(sbA.toString());
        }
        float fH = qkf0Var.h(iD, false);
        int lineForOffset = qkf0Var.f.getLineForOffset(iD);
        return jrzVar.a(new lk40(fH, qkf0Var.g(lineForOffset), fH, qkf0Var.e(lineForOffset)));
    }

    public final boolean d() {
        zjw zjwVar = this.b;
        return zjwVar.c || ((float) ((int) (this.c & 4294967295L))) < zjwVar.e;
    }

    public final boolean e() {
        return ((float) ((int) (this.c >> 32))) < this.b.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ukf0) {
            ukf0 ukf0Var = (ukf0) obj;
            if (Intrinsics.g(this.a, ukf0Var.a) && this.b == ukf0Var.b && jxo.b(this.c, ukf0Var.c) && this.d == ukf0Var.d && this.e == ukf0Var.e && this.f.equals(ukf0Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return e() || d();
    }

    public final float g(int i) {
        zjw zjwVar = this.b;
        zjwVar.l(i);
        ArrayList arrayList = zjwVar.h;
        jrz jrzVar = (jrz) arrayList.get(kf9.c(i, arrayList));
        e90 e90Var = jrzVar.a;
        int i2 = i - jrzVar.d;
        qkf0 qkf0Var = e90Var.d;
        return qkf0Var.f.getLineLeft(i2) + (i2 == qkf0Var.g + (-1) ? qkf0Var.j : 0.0f);
    }

    public final float h(int i) {
        zjw zjwVar = this.b;
        zjwVar.l(i);
        ArrayList arrayList = zjwVar.h;
        jrz jrzVar = (jrz) arrayList.get(kf9.c(i, arrayList));
        e90 e90Var = jrzVar.a;
        int i2 = i - jrzVar.d;
        qkf0 qkf0Var = e90Var.d;
        return qkf0Var.f.getLineRight(i2) + (i2 == qkf0Var.g + (-1) ? qkf0Var.k : 0.0f);
    }

    public final int hashCode() {
        return this.f.hashCode() + tvh.a(this.e, tvh.a(this.d, f87.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31), 31), 31);
    }

    public final int i(int i) {
        zjw zjwVar = this.b;
        zjwVar.l(i);
        ArrayList arrayList = zjwVar.h;
        jrz jrzVar = (jrz) arrayList.get(kf9.c(i, arrayList));
        e90 e90Var = jrzVar.a;
        return e90Var.d.f.getLineStart(i - jrzVar.d) + jrzVar.b;
    }

    public final lg50 j(int i) {
        zjw zjwVar = this.b;
        zjwVar.k(i);
        int length = zjwVar.a.a.b.length();
        ArrayList arrayList = zjwVar.h;
        jrz jrzVar = (jrz) arrayList.get(i == length ? arrayList.size() - 1 : kf9.b(i, arrayList));
        e90 e90Var = jrzVar.a;
        int iD = jrzVar.d(i);
        qkf0 qkf0Var = e90Var.d;
        return qkf0Var.f.getParagraphDirection(qkf0Var.f.getLineForOffset(iD)) == 1 ? lg50.a : lg50.b;
    }

    public final j90 k(final int i, final int i2) {
        zjw zjwVar = this.b;
        nk0 nk0Var = zjwVar.a.a;
        if (i < 0 || i > i2 || i2 > nk0Var.b.length()) {
            StringBuilder sbA = dy5.a("Start(", i, i2, ") or End(", ") is out of range [0..");
            sbA.append(nk0Var.b.length());
            sbA.append("), or start > end!");
            xkn.a(sbA.toString());
        }
        if (i == i2) {
            return m90.a();
        }
        final j90 j90VarA = m90.a();
        kf9.e(zjwVar.h, vlf0.a(i, i2), new Function1() { // from class: yjw
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                jrz jrzVar = (jrz) obj;
                e90 e90Var = jrzVar.a;
                int iD = jrzVar.d(i);
                int iD2 = jrzVar.d(i2);
                CharSequence charSequence = e90Var.e;
                if (iD < 0 || iD > iD2 || iD2 > charSequence.length()) {
                    StringBuilder sbA2 = dy5.a("start(", iD, iD2, ") or end(", ") is out of range [0..");
                    sbA2.append(charSequence.length());
                    sbA2.append("], or start > end!");
                    xkn.a(sbA2.toString());
                }
                Path path = new Path();
                qkf0 qkf0Var = e90Var.d;
                qkf0Var.f.getSelectionPath(iD, iD2, path);
                int i3 = qkf0Var.h;
                if (i3 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i3);
                }
                j90 j90Var = new j90(path);
                j90Var.k((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(jrzVar.f)) & 4294967295L));
                bxz.r(j90VarA, j90Var);
                return Unit.a;
            }
        });
        return j90VarA;
    }

    public final long l(int i) {
        int i2;
        int iH;
        int iH2;
        zjw zjwVar = this.b;
        zjwVar.k(i);
        int length = zjwVar.a.a.b.length();
        ArrayList arrayList = zjwVar.h;
        jrz jrzVar = (jrz) arrayList.get(i == length ? arrayList.size() - 1 : kf9.b(i, arrayList));
        e90 e90Var = jrzVar.a;
        int iD = jrzVar.d(i);
        muj0 muj0VarJ = e90Var.d.j();
        if (muj0VarJ.g(muj0VarJ.i(iD))) {
            muj0VarJ.a(iD);
            i2 = iD;
            while (i2 != -1 && (!muj0VarJ.g(i2) || muj0VarJ.c(i2))) {
                i2 = muj0VarJ.i(i2);
            }
        } else {
            muj0VarJ.a(iD);
            if (muj0VarJ.f(iD)) {
                i2 = (!muj0VarJ.d(iD) || muj0VarJ.b(iD)) ? muj0VarJ.i(iD) : iD;
            } else {
                i2 = muj0VarJ.b(iD) ? muj0VarJ.i(iD) : -1;
            }
        }
        if (i2 == -1) {
            i2 = iD;
        }
        if (muj0VarJ.c(muj0VarJ.h(iD))) {
            muj0VarJ.a(iD);
            iH = iD;
            while (iH != -1 && (muj0VarJ.g(iH) || !muj0VarJ.c(iH))) {
                iH = muj0VarJ.h(iH);
            }
        } else {
            muj0VarJ.a(iD);
            if (muj0VarJ.b(iD)) {
                if (!muj0VarJ.d(iD) || muj0VarJ.f(iD)) {
                    iH2 = muj0VarJ.h(iD);
                    iH = iH2;
                } else {
                    iH = iD;
                }
            } else if (muj0VarJ.f(iD)) {
                iH2 = muj0VarJ.h(iD);
                iH = iH2;
            } else {
                iH = -1;
            }
        }
        if (iH != -1) {
            iD = iH;
        }
        return jrzVar.b(vlf0.a(i2, iD), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) jxo.c(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }
}
