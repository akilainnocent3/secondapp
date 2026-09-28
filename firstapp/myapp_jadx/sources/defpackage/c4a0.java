package defpackage;

import androidx.compose.ui.layout.i;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c4a0 implements aiv {
    /* JADX WARN: Code duplicated, block: B:64:0x0103 A[PHI: r4 r6
      0x0103: PHI (r4v8 int) = (r4v7 int), (r4v12 int), (r4v12 int) binds: [B:67:0x011d, B:60:0x00f8, B:62:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x0103: PHI (r6v5 int) = (r6v4 int), (r6v10 int), (r6v10 int) binds: [B:67:0x011d, B:60:0x00f8, B:62:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.aiv
    public final biv c(t tVar, List<? extends vhv> list, long j) {
        vhv vhvVar;
        vhv vhvVar2;
        int iY0;
        int iMax;
        int i;
        int iF0;
        List<? extends vhv> list2 = list;
        long j2 = j;
        int iMin = Math.min(kxa.i(j2), tVar.y0(600.0f));
        int size = list2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                vhvVar = null;
                break;
            }
            vhvVar = list2.get(i2);
            if (Intrinsics.g(i.a(vhvVar), "action")) {
                break;
            }
            i2++;
        }
        vhv vhvVar3 = vhvVar;
        y yVarD0 = vhvVar3 != null ? vhvVar3.d0(j2) : null;
        int size2 = list2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                vhvVar2 = null;
                break;
            }
            vhvVar2 = list2.get(i3);
            if (Intrinsics.g(i.a(vhvVar2), "dismissAction")) {
                break;
            }
            i3++;
        }
        vhv vhvVar4 = vhvVar2;
        final y yVarD1 = vhvVar4 != null ? vhvVar4.d0(j2) : null;
        int i4 = yVarD0 != null ? yVarD0.a : 0;
        int i5 = yVarD0 != null ? yVarD0.b : 0;
        int i6 = yVarD1 != null ? yVarD1.a : 0;
        int i7 = yVarD1 != null ? yVarD1.b : 0;
        int iY1 = ((iMin - i4) - i6) - (i6 == 0 ? tVar.y0(8.0f) : 0);
        int iK = kxa.k(j2);
        if (iY1 >= iK) {
            iK = iY1;
        }
        int size3 = list2.size();
        int i8 = 0;
        while (i8 < size3) {
            vhv vhvVar5 = list2.get(i8);
            if (Intrinsics.g(i.a(vhvVar5), "text")) {
                final y yVarD2 = vhvVar5.d0(kxa.b(0, iK, 0, 0, 9, j2));
                mjm mjmVar = mt.a;
                int iF1 = yVarD2.f0(mjmVar);
                int iF2 = yVarD2.f0(mt.b);
                boolean z = true;
                boolean z2 = (iF1 == Integer.MIN_VALUE || iF2 == Integer.MIN_VALUE) ? false : true;
                if (iF1 != iF2 && z2) {
                    z = false;
                }
                final int i9 = iMin - i6;
                final int i10 = i9 - i4;
                if (z) {
                    iMax = Math.max(tVar.y0(k4a0.i), Math.max(i5, i7));
                    iY0 = (iMax - yVarD2.b) / 2;
                    if (yVarD0 == null || (iF0 = yVarD0.f0(mjmVar)) == Integer.MIN_VALUE) {
                        i = 0;
                    } else {
                        i = (iF1 + iY0) - iF0;
                    }
                } else {
                    iY0 = tVar.y0(30.0f) - iF1;
                    iMax = Math.max(tVar.y0(k4a0.j), yVarD2.b + iY0);
                    if (yVarD0 != null) {
                        i = (iMax - yVarD0.b) / 2;
                    } else {
                        i = 0;
                    }
                }
                final int i11 = i;
                final int i12 = iY0;
                final int i13 = yVarD1 != null ? (iMax - yVarD1.b) / 2 : 0;
                final y yVar = yVarD0;
                return t.z1(tVar, iMin, iMax, new Function1() { // from class: b4a0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        y.a aVar = (y.a) obj;
                        y.a.A(aVar, yVarD2, 0, i12);
                        y yVar2 = yVarD1;
                        if (yVar2 != null) {
                            y.a.A(aVar, yVar2, i9, i13);
                        }
                        y yVar3 = yVar;
                        if (yVar3 != null) {
                            y.a.A(aVar, yVar3, i10, i11);
                        }
                        return Unit.a;
                    }
                });
            }
            i8++;
            list2 = list;
            j2 = j;
        }
        throw hu1.a("Collection contains no element matching the predicate.");
    }
}
