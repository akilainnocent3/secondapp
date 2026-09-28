package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import com.sportybet.plugin.sportypicks.domain.model.Kjqv.DZsoPoBl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class zjw {
    public final ckw a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public zjw(ckw ckwVar, long j, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int iH;
        int i5;
        this.a = ckwVar;
        this.b = i;
        if (kxa.k(j) != 0 || kxa.j(j) != 0) {
            xkn.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = ckwVar.e;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= size) {
                i3 = 0;
                z = false;
                break;
            }
            krz krzVar = (krz) arrayList2.get(i6);
            h90 h90Var = krzVar.a;
            int i8 = kxa.i(j);
            if (kxa.d(j)) {
                i4 = i6;
                iH = kxa.h(j) - ((int) Math.ceil(f));
                if (iH < 0) {
                    iH = 0;
                }
            } else {
                i4 = i6;
                iH = kxa.h(j);
            }
            i3 = 0;
            e90 e90Var = new e90(h90Var, this.b - i7, i2, oxa.b(0, i8, iH, 5));
            float fD = e90Var.d() + f;
            qkf0 qkf0Var = e90Var.d;
            int i9 = i7 + qkf0Var.g;
            arrayList.add(new jrz(e90Var, krzVar.b, krzVar.c, i7, i9, f, fD));
            if (!qkf0Var.d) {
                if (i9 == this.b) {
                    i5 = i4;
                    if (i5 != b.j(this.a.e)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i9;
                f = fD;
            }
            z = true;
            i7 = i9;
            f = fD;
            break;
        }
        this.e = f;
        this.f = i7;
        this.c = z;
        this.h = arrayList;
        this.d = kxa.i(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i10 = i3; i10 < size2; i10++) {
            jrz jrzVar = (jrz) arrayList.get(i10);
            List<lk40> list = jrzVar.a.f;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i11 = i3; i11 < size3; i11++) {
                lk40 lk40Var = list.get(i11);
                arrayList4.add(lk40Var != null ? jrzVar.a(lk40Var) : null);
            }
            p48.w(arrayList4, arrayList3);
        }
        if (arrayList3.size() < this.a.b.size()) {
            int size4 = this.a.b.size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i12 = i3; i12 < size4; i12++) {
                arrayList5.add(null);
            }
            arrayList3 = CollectionsKt.i0(arrayList5, arrayList3);
        }
        this.g = arrayList3;
    }

    public final void a(final float[] fArr, final long j) {
        j(ulf0.f(j));
        k(ulf0.e(j));
        final bq40 bq40Var = new bq40();
        bq40Var.a = 0;
        final aq40 aq40Var = new aq40();
        kf9.e(this.h, j, new Function1() { // from class: xjw
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                long j2;
                e90 e90Var;
                boolean z;
                float fA;
                float fA2;
                jrz jrzVar = (jrz) obj;
                int i = jrzVar.b;
                e90 e90Var2 = jrzVar.a;
                int iE = jrzVar.c;
                long j3 = j;
                int iF = i > ulf0.f(j3) ? jrzVar.b : ulf0.f(j3);
                if (iE >= ulf0.e(j3)) {
                    iE = ulf0.e(j3);
                }
                long jA = vlf0.a(jrzVar.d(iF), jrzVar.d(iE));
                bq40 bq40Var2 = bq40Var;
                int i2 = bq40Var2.a;
                qkf0 qkf0Var = e90Var2.d;
                int iF2 = ulf0.f(jA);
                int iE2 = ulf0.e(jA);
                Layout layout = qkf0Var.f;
                int length = layout.getText().length();
                if (iF2 < 0) {
                    xkn.a("startOffset must be > 0");
                }
                if (iF2 >= length) {
                    xkn.a("startOffset must be less than text length");
                }
                if (iE2 <= iF2) {
                    xkn.a("endOffset must be greater than startOffset");
                }
                if (iE2 > length) {
                    xkn.a("endOffset must be smaller or equal to text length");
                }
                int i3 = (iE2 - iF2) * 4;
                float[] fArr2 = fArr;
                if (fArr2.length - i2 < i3) {
                    xkn.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(iF2);
                int lineForOffset2 = layout.getLineForOffset(iE2 - 1);
                qjm qjmVar = new qjm(qkf0Var);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        int iF3 = qkf0Var.f(lineForOffset);
                        int iMax = Math.max(iF2, lineStart);
                        int iMin = Math.min(iE2, iF3);
                        float fG = qkf0Var.g(lineForOffset);
                        float fE = qkf0Var.e(lineForOffset);
                        j2 = jA;
                        e90Var = e90Var2;
                        boolean z2 = false;
                        boolean z3 = layout.getParagraphDirection(lineForOffset) == 1;
                        while (iMax < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                            if (!z3 || zIsRtlCharAt) {
                                if (z3 && zIsRtlCharAt) {
                                    z2 = false;
                                    float fA3 = qjmVar.a(iMax, false, false, false);
                                    z = z3;
                                    fA = qjmVar.a(iMax + 1, true, true, false);
                                    fA2 = fA3;
                                } else {
                                    z = z3;
                                    z2 = false;
                                    if (z || !zIsRtlCharAt) {
                                        fA = qjmVar.a(iMax, false, false, false);
                                        fA2 = qjmVar.a(iMax + 1, true, true, false);
                                    } else {
                                        fA2 = qjmVar.a(iMax, false, false, true);
                                        fA = qjmVar.a(iMax + 1, true, true, true);
                                    }
                                }
                                fArr2[i2] = fA;
                                fArr2[i2 + 1] = fG;
                                fArr2[i2 + 2] = fA2;
                                fArr2[i2 + 3] = fE;
                                i2 += 4;
                                iMax++;
                                z3 = z;
                            } else {
                                fA = qjmVar.a(iMax, z2, z2, true);
                                z = z3;
                                fA2 = qjmVar.a(iMax + 1, true, true, true);
                            }
                            z2 = false;
                            fArr2[i2] = fA;
                            fArr2[i2 + 1] = fG;
                            fArr2[i2 + 2] = fA2;
                            fArr2[i2 + 3] = fE;
                            i2 += 4;
                            iMax++;
                            z3 = z;
                        }
                        if (lineForOffset == lineForOffset2) {
                            break;
                        }
                        lineForOffset++;
                        e90Var2 = e90Var;
                        jA = j2;
                    }
                } else {
                    j2 = jA;
                    e90Var = e90Var2;
                }
                int iD = (ulf0.d(j2) * 4) + bq40Var2.a;
                int i4 = bq40Var2.a;
                while (true) {
                    aq40 aq40Var2 = aq40Var;
                    if (i4 >= iD) {
                        bq40Var2.a = iD;
                        aq40Var2.a = e90Var.d() + aq40Var2.a;
                        return Unit.a;
                    }
                    int i5 = i4 + 1;
                    float f = fArr2[i5];
                    float f2 = aq40Var2.a;
                    fArr2[i5] = f + f2;
                    int i6 = i4 + 3;
                    fArr2[i6] = fArr2[i6] + f2;
                    i4 += 4;
                }
            }
        });
    }

    public final float b(int i) {
        l(i);
        ArrayList arrayList = this.h;
        jrz jrzVar = (jrz) arrayList.get(kf9.c(i, arrayList));
        e90 e90Var = jrzVar.a;
        return e90Var.d.e(i - jrzVar.d) + jrzVar.f;
    }

    public final int c(int i, boolean z) {
        int iF;
        l(i);
        ArrayList arrayList = this.h;
        jrz jrzVar = (jrz) arrayList.get(kf9.c(i, arrayList));
        e90 e90Var = jrzVar.a;
        int i2 = i - jrzVar.d;
        qkf0 qkf0Var = e90Var.d;
        if (z) {
            Layout layout = qkf0Var.f;
            idf0 idf0Var = wkf0.a;
            if (layout.getEllipsisCount(i2) <= 0 || qkf0Var.b != TextUtils.TruncateAt.END) {
                csr csrVarC = qkf0Var.c();
                Layout layout2 = csrVarC.a;
                iF = csrVarC.f(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                iF = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            iF = qkf0Var.f(i2);
        }
        return iF + jrzVar.b;
    }

    public final int d(int i) {
        int iB;
        int length = this.a.a.b.length();
        ArrayList arrayList = this.h;
        if (i >= length) {
            iB = arrayList.size() - 1;
        } else {
            iB = i < 0 ? 0 : kf9.b(i, arrayList);
        }
        jrz jrzVar = (jrz) arrayList.get(iB);
        return jrzVar.a.d.f.getLineForOffset(jrzVar.d(i)) + jrzVar.d;
    }

    public final int e(float f) {
        ArrayList arrayList = this.h;
        jrz jrzVar = (jrz) arrayList.get(kf9.d(arrayList, f));
        int i = jrzVar.c - jrzVar.b;
        int i2 = jrzVar.d;
        if (i == 0) {
            return i2;
        }
        e90 e90Var = jrzVar.a;
        float f2 = f - jrzVar.f;
        qkf0 qkf0Var = e90Var.d;
        return qkf0Var.f.getLineForVertical(((int) f2) - qkf0Var.h) + i2;
    }

    public final float f(int i) {
        l(i);
        ArrayList arrayList = this.h;
        jrz jrzVar = (jrz) arrayList.get(kf9.c(i, arrayList));
        e90 e90Var = jrzVar.a;
        return e90Var.d.g(i - jrzVar.d) + jrzVar.f;
    }

    public final int g(long j) {
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        jrz jrzVar = (jrz) arrayList.get(kf9.d(arrayList, fIntBitsToFloat));
        int i2 = jrzVar.c;
        int i3 = jrzVar.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        e90 e90Var = jrzVar.a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) - jrzVar.f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        qkf0 qkf0Var = e90Var.d;
        int lineForVertical = qkf0Var.f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits))) - qkf0Var.h);
        return qkf0Var.f.getOffsetForHorizontal(lineForVertical, (qkf0Var.b(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) + i3;
    }

    public final long h(lk40 lk40Var, int i, ojf0 ojf0Var) {
        long jB;
        long j;
        float f = lk40Var.b;
        ArrayList arrayList = this.h;
        int iD = kf9.d(arrayList, f);
        float f2 = ((jrz) arrayList.get(iD)).g;
        float f3 = lk40Var.d;
        if (f2 >= f3 || iD == arrayList.size() - 1) {
            jrz jrzVar = (jrz) arrayList.get(iD);
            return jrzVar.b(jrzVar.a.g(jrzVar.c(lk40Var), i, ojf0Var), true);
        }
        int iD2 = kf9.d(arrayList, f3);
        long jB2 = ulf0.b;
        while (true) {
            jB = ulf0.b;
            if (!ulf0.b(jB2, jB) || iD > iD2) {
                break;
            }
            jrz jrzVar2 = (jrz) arrayList.get(iD);
            jB2 = jrzVar2.b(jrzVar2.a.g(jrzVar2.c(lk40Var), i, ojf0Var), true);
            iD++;
        }
        if (ulf0.b(jB2, jB)) {
            return jB;
        }
        while (true) {
            j = ulf0.b;
            if (!ulf0.b(jB, j) || iD > iD2) {
                break;
            }
            jrz jrzVar3 = (jrz) arrayList.get(iD2);
            jB = jrzVar3.b(jrzVar3.a.g(jrzVar3.c(lk40Var), i, ojf0Var), true);
            iD2--;
        }
        return ulf0.b(jB, j) ? jB2 : vlf0.a((int) (jB2 >> 32), (int) (4294967295L & jB));
    }

    public final void i(lc6 lc6Var, long j, ix80 ix80Var, yef0 yef0Var, wcf wcfVar) {
        lc6Var.p();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            jrz jrzVar = (jrz) arrayList.get(i);
            jrzVar.a.j(lc6Var, j, ix80Var, yef0Var, wcfVar);
            lc6Var.e(0.0f, jrzVar.a.d());
        }
        lc6Var.f();
    }

    public final void j(int i) {
        nk0 nk0Var = this.a.a;
        if (i < 0 || i >= nk0Var.b.length()) {
            StringBuilder sbA = efe0.a(i, "offset(", ") is out of bounds [0, ");
            sbA.append(nk0Var.b.length());
            sbA.append(')');
            xkn.a(sbA.toString());
        }
    }

    public final void l(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        xkn.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }

    public final void k(int i) {
        nk0 nk0Var = this.a.a;
        if (i < 0 || i > nk0Var.b.length()) {
            StringBuilder sbA = efe0.a(i, "offset(", DZsoPoBl.WDSBMb);
            sbA.append(nk0Var.b.length());
            sbA.append(']');
            xkn.a(sbA.toString());
        }
    }
}
