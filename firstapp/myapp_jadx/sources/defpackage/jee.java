package defpackage;

import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import com.google.protobuf.Reader;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jee {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    public static final biv a(z060 z060Var, int i, int i2, int i3, int i4, int i5, t tVar, List list, y[] yVarArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        int i10;
        float f;
        boolean z;
        int iMax;
        int i11;
        int i12;
        int i13;
        int i14;
        List list2 = list;
        long j = i5;
        int i15 = i7 - i6;
        int[] iArr2 = new int[i15];
        int i16 = i6;
        int iMax2 = 0;
        int i17 = 0;
        boolean z2 = false;
        int i18 = 0;
        int iMin = 0;
        float f2 = 0.0f;
        while (i16 < i7) {
            vhv vhvVar = (vhv) list2.get(i16);
            long j2 = j;
            a160 a160VarB = nj0.b(vhvVar);
            float fC = nj0.c(a160VarB);
            if (z2) {
                z2 = true;
            } else {
                c3c c3cVar = a160VarB != null ? a160VarB.c : null;
                if (c3cVar != null ? c3cVar instanceof c3c.a : false) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (fC > 0.0f) {
                f2 += fC;
                i17++;
                i12 = i16;
            } else {
                int i19 = i3 - i18;
                y yVarD0 = yVarArr[i16];
                if (yVarD0 == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i12 = i16;
                        i13 = i17;
                        i14 = Reader.READ_DONE;
                    } else {
                        i12 = i16;
                        i13 = i17;
                        i14 = i19 < 0 ? 0 : i19;
                    }
                    yVarD0 = vhvVar.d0(z060Var.d(0, i14, i4, false));
                } else {
                    i12 = i16;
                    i13 = i17;
                }
                int iH = z060Var.h(yVarD0);
                int iJ = z060Var.j(yVarD0);
                iArr2[i12 - i6] = iH;
                int i20 = i19 - iH;
                if (i20 < 0) {
                    i20 = 0;
                }
                iMin = Math.min(i5, i20);
                i18 += iH + iMin;
                iMax2 = Math.max(iMax2, iJ);
                yVarArr[i12] = yVarD0;
                i17 = i13;
            }
            i16 = i12 + 1;
            j = j2;
        }
        long j3 = j;
        int i21 = i17;
        boolean z3 = true;
        if (i21 == 0) {
            i18 -= iMin;
            i9 = 0;
        } else {
            long j4 = ((long) (i21 - 1)) * j3;
            long jRound = ((long) ((i3 != Integer.MAX_VALUE ? i3 : i) - i18)) - j4;
            if (jRound < 0) {
                jRound = 0;
            }
            float f3 = jRound / f2;
            int i22 = i6;
            while (i22 < i7) {
                jRound -= (long) Math.round(nj0.c(nj0.b((vhv) list2.get(i22))) * f3);
                i22++;
                j4 = j4;
            }
            long j5 = j4;
            int i23 = i6;
            int i24 = 0;
            while (i23 < i7) {
                if (yVarArr[i23] == null) {
                    vhv vhvVar2 = (vhv) list2.get(i23);
                    a160 a160VarB2 = nj0.b(vhvVar2);
                    float fC2 = nj0.c(a160VarB2);
                    if (fC2 <= 0.0f) {
                        ukn.b("All weights <= 0 should have placeables");
                    }
                    i10 = i23;
                    int iSignum = Long.signum(jRound);
                    f = f3;
                    jRound -= (long) iSignum;
                    int iMax3 = Math.max(0, Math.round(f * fC2) + iSignum);
                    z = z3;
                    y yVarD1 = vhvVar2.d0(z060Var.d((!(a160VarB2 != null ? a160VarB2.b : z3) || iMax3 == Integer.MAX_VALUE) ? 0 : iMax3, iMax3, i4, z));
                    int iH2 = z060Var.h(yVarD1);
                    int iJ2 = z060Var.j(yVarD1);
                    iArr2[i10 - i6] = iH2;
                    i24 += iH2;
                    int iMax4 = Math.max(iMax2, iJ2);
                    yVarArr[i10] = yVarD1;
                    iMax2 = iMax4;
                } else {
                    i10 = i23;
                    f = f3;
                    z = z3;
                }
                list2 = list;
                z3 = z;
                i23 = i10 + 1;
                f3 = f;
            }
            i9 = (int) (((long) i24) + j5);
            int i25 = i3 - i18;
            if (i9 < 0) {
                i9 = 0;
            }
            if (i9 > i25) {
                i9 = i25;
            }
        }
        if (z2) {
            int iMax5 = 0;
            iMax = 0;
            for (int i26 = i6; i26 < i7; i26++) {
                y yVar = yVarArr[i26];
                yVar.getClass();
                Object objG = yVar.g();
                a160 a160Var = objG instanceof a160 ? (a160) objG : null;
                c3c c3cVar2 = a160Var != null ? a160Var.c : null;
                Integer numB = c3cVar2 != null ? c3cVar2.b(yVar) : null;
                if (numB != null) {
                    int iIntValue = numB.intValue();
                    int iJ3 = z060Var.j(yVar);
                    iMax5 = Math.max(iMax5, iIntValue != Integer.MIN_VALUE ? numB.intValue() : 0);
                    if (iIntValue == Integer.MIN_VALUE) {
                        iIntValue = iJ3;
                    }
                    iMax = Math.max(iMax, iJ3 - iIntValue);
                }
            }
            i11 = iMax5;
        } else {
            iMax = 0;
            i11 = 0;
        }
        int i27 = i18 + i9;
        int iMax6 = Math.max(i27 < 0 ? 0 : i27, i);
        int iMax7 = Math.max(iMax2, Math.max(i2, iMax + i11));
        int[] iArr3 = new int[i15];
        z060Var.b(iMax6, iArr2, iArr3, tVar);
        return z060Var.f(yVarArr, tVar, i11, iArr3, iMax6, iMax7, iArr, i8, i6, i7);
    }
}
