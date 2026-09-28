package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import java.text.Bidi;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class skf0 {
    public static final float a(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    /* JADX WARN: Code duplicated, block: B:144:0x025b A[EDGE_INSN: B:144:0x025b->B:171:0x02b8 BREAK  A[LOOP:5: B:154:0x0277->B:206:0x0277]] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a3  */
    public static final int b(qkf0 qkf0Var, Layout layout, csr csrVar, int i, RectF rectF, g580 g580Var, d90 d90Var, boolean z) {
        csr.a[] aVarArr;
        csr.a[] aVarArr2;
        int i2;
        int i3;
        int iD;
        int i4;
        int i5;
        int iC;
        Bidi bidiCreateLineBidi;
        float fA;
        float fA2;
        float fA3;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i6 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i6];
        Layout layout2 = qkf0Var.f;
        int lineStart2 = layout2.getLineStart(i);
        int iF = qkf0Var.f(i);
        if (i6 < (iF - lineStart2) * 2) {
            xkn.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        qjm qjmVar = new qjm(qkf0Var);
        boolean z2 = false;
        boolean z3 = layout2.getParagraphDirection(i) == 1;
        int i7 = 0;
        while (lineStart2 < iF) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z3 && !zIsRtlCharAt) {
                fA = qjmVar.a(lineStart2, z2, z2, true);
                fA3 = qjmVar.a(lineStart2 + 1, true, true, true);
            } else if (z3 && zIsRtlCharAt) {
                fA3 = qjmVar.a(lineStart2, false, false, false);
                fA = qjmVar.a(lineStart2 + 1, true, true, false);
            } else {
                if (zIsRtlCharAt) {
                    fA2 = qjmVar.a(lineStart2, false, false, true);
                    fA = qjmVar.a(lineStart2 + 1, true, true, true);
                } else {
                    fA = qjmVar.a(lineStart2, false, false, false);
                    fA2 = qjmVar.a(lineStart2 + 1, true, true, false);
                }
                fA3 = fA2;
            }
            fArr[i7] = fA;
            fArr[i7 + 1] = fA3;
            i7 += 2;
            lineStart2++;
            z3 = z3;
            z2 = false;
        }
        Layout layout3 = csrVar.a;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int iD2 = csrVar.d(lineStart3, false);
        int iE = csrVar.e(iD2);
        int i8 = lineStart3 - iE;
        int i9 = lineEnd2 - iE;
        Bidi bidiA = csrVar.a(iD2);
        if (bidiA == null || (bidiCreateLineBidi = bidiA.createLineBidi(i8, i9)) == null) {
            aVarArr = new csr.a[]{new csr.a(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            aVarArr = new csr.a[runCount];
            int i10 = 0;
            while (i10 < runCount) {
                int i11 = runCount;
                aVarArr[i10] = new csr.a(bidiCreateLineBidi.getRunStart(i10) + lineStart3, bidiCreateLineBidi.getRunLimit(i10) + lineStart3, bidiCreateLineBidi.getRunLevel(i10) % 2 == 1);
                i10++;
                runCount = i11;
            }
        }
        c intRange = z ? new IntRange(0, ay0.A(aVarArr), 1) : f.j(aVarArr.length - 1, 0);
        int i12 = intRange.a;
        int i13 = intRange.b;
        int i14 = intRange.c;
        if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
            return -1;
        }
        while (true) {
            csr.a aVar = aVarArr[i12];
            boolean z4 = aVar.c;
            int iA = aVar.a;
            int iE2 = aVar.b;
            float f = z4 ? fArr[((iE2 - 1) - lineStart) * 2] : fArr[(iA - lineStart) * 2];
            float fA4 = z4 ? a(iA, lineStart, fArr) : a(iE2 - 1, lineStart, fArr);
            float f2 = rectF.left;
            int i15 = i14;
            if (!z) {
                aVarArr2 = aVarArr;
                if (fA4 < f2) {
                    i2 = -1;
                    break;
                }
                float f3 = rectF.right;
                if (f <= f3) {
                    if ((z4 || f3 < fA4) && (!z4 || f2 > f)) {
                        int i16 = iE2;
                        int i17 = iA;
                        while (i16 - i17 > 1) {
                            int i18 = (i16 + i17) / 2;
                            float f4 = fArr[(i18 - lineStart) * 2];
                            int i19 = i16;
                            if ((z4 || f4 <= rectF.right) && (!z4 || f4 >= rectF.left)) {
                                i16 = i19;
                                i17 = i18;
                            } else {
                                i16 = i18;
                            }
                        }
                        i3 = z4 ? i16 : i17;
                    } else {
                        i3 = iE2 - 1;
                    }
                    int iC2 = g580Var.c(i3 + 1);
                    if (iC2 == -1 || (iD = g580Var.d(iC2)) <= iA) {
                        i2 = -1;
                        break;
                    }
                    if (iC2 < iA) {
                        iC2 = iA;
                    }
                    if (iD <= iE2) {
                        iE2 = iD;
                    }
                    RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                    int iC3 = iC2;
                    while (true) {
                        rectF2.left = z4 ? fArr[((iE2 - 1) - lineStart) * 2] : fArr[(iC3 - lineStart) * 2];
                        rectF2.right = z4 ? a(iC3, lineStart, fArr) : a(iE2 - 1, lineStart, fArr);
                        if (((Boolean) d90Var.invoke(rectF2, rectF)).booleanValue()) {
                            i2 = iE2;
                            break;
                        }
                        iE2 = g580Var.e(iE2);
                        if (iE2 == -1 || iE2 <= iA) {
                            i2 = -1;
                            break;
                        }
                        iC3 = g580Var.c(iE2);
                        if (iC3 < iA) {
                            iC3 = iA;
                        }
                    }
                } else {
                    i2 = -1;
                    break;
                }
                iA = i2;
            } else {
                if (fA4 < f2) {
                    aVarArr2 = aVarArr;
                    iA = -1;
                    break;
                }
                float f5 = rectF.right;
                if (f <= f5) {
                    if ((z4 || f2 > f) && (!z4 || f5 < fA4)) {
                        int i20 = iE2;
                        int i21 = iA;
                        while (true) {
                            i4 = i20;
                            if (i20 - i21 <= 1) {
                                break;
                            }
                            int i22 = (i4 + i21) / 2;
                            float f6 = fArr[(i22 - lineStart) * 2];
                            if ((z4 || f6 <= rectF.left) && (!z4 || f6 >= rectF.right)) {
                                i20 = i4;
                                i21 = i22;
                            } else {
                                i20 = i22;
                            }
                        }
                        i5 = z4 ? i4 : i21;
                    } else {
                        i5 = iA;
                    }
                    int iD3 = g580Var.d(i5);
                    if (iD3 != -1 && (iC = g580Var.c(iD3)) < iE2) {
                        if (iC >= iA) {
                            iA = iC;
                        }
                        if (iD3 > iE2) {
                            iD3 = iE2;
                        }
                        aVarArr2 = aVarArr;
                        RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                        int iD4 = iD3;
                        while (true) {
                            rectF3.left = z4 ? fArr[((iD4 - 1) - lineStart) * 2] : fArr[(iA - lineStart) * 2];
                            rectF3.right = z4 ? a(iA, lineStart, fArr) : a(iD4 - 1, lineStart, fArr);
                            if (((Boolean) d90Var.invoke(rectF3, rectF)).booleanValue()) {
                                break;
                            }
                            iA = g580Var.a(iA);
                            if (iA != -1 && iA < iE2) {
                                iD4 = g580Var.d(iA);
                                if (iD4 > iE2) {
                                    iD4 = iE2;
                                }
                            }
                        }
                    } else {
                        aVarArr2 = aVarArr;
                    }
                    iA = -1;
                    break;
                } else {
                    aVarArr2 = aVarArr;
                    iA = -1;
                    break;
                }
            }
            if (iA >= 0) {
                return iA;
            }
            if (i12 == i13) {
                return -1;
            }
            i12 += i15;
            i14 = i15;
            aVarArr = aVarArr2;
        }
    }
}
