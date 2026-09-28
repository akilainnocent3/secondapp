package defpackage;

import androidx.compose.ui.layout.i;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class wk7 implements aiv {
    @Override // defpackage.aiv
    public final int a(nzo nzoVar, List<? extends mzo> list, int i) {
        int size = list.size();
        int iB0 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iB0 += list.get(i2).b0(i);
        }
        return iB0;
    }

    @Override // defpackage.aiv
    public final biv c(t tVar, List<? extends vhv> list, long j) {
        vhv vhvVar;
        long j2;
        y yVarD0;
        vhv vhvVar2;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                vhvVar = null;
                break;
            }
            vhvVar = list.get(i);
            if (Intrinsics.g(i.a(vhvVar), "leadingIcon")) {
                break;
            }
            i++;
        }
        vhv vhvVar3 = vhvVar;
        if (vhvVar3 != null) {
            j2 = j;
            yVarD0 = vhvVar3.d0(kxa.b(0, 0, 0, 0, 10, j2));
        } else {
            j2 = j;
            yVarD0 = null;
        }
        int i2 = yVarD0 != null ? yVarD0.a : 0;
        int i3 = yVarD0 != null ? yVarD0.b : 0;
        int size2 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                vhvVar2 = null;
                break;
            }
            vhvVar2 = list.get(i4);
            if (Intrinsics.g(i.a(vhvVar2), "trailingIcon")) {
                break;
            }
            i4++;
        }
        vhv vhvVar4 = vhvVar2;
        y yVarD1 = vhvVar4 != null ? vhvVar4.d0(kxa.b(0, 0, 0, 0, 10, j2)) : null;
        int i5 = yVarD1 != null ? yVarD1.a : 0;
        final int i6 = yVarD1 != null ? yVarD1.b : 0;
        int size3 = list.size();
        for (int i7 = 0; i7 < size3; i7++) {
            vhv vhvVar5 = list.get(i7);
            if (Intrinsics.g(i.a(vhvVar5), "label")) {
                final y yVarD2 = vhvVar5.d0(oxa.j(-(i2 + i5), 0, 2, j2));
                int i8 = yVarD2.a + i2 + i5;
                final int iMax = Math.max(i3, Math.max(yVarD2.b, i6));
                final y yVar = yVarD0;
                final int i9 = i2;
                final int i10 = i3;
                final y yVar2 = yVarD1;
                return t.z1(tVar, i8, iMax, new Function1() { // from class: vk7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        y.a aVar = (y.a) obj;
                        y yVar3 = yVar;
                        int i11 = iMax;
                        if (yVar3 != null) {
                            y.a.A(aVar, yVar3, 0, Math.round(((i11 - i10) / 2.0f) * 1.0f));
                        }
                        y yVar4 = yVarD2;
                        int i12 = i9;
                        y.a.A(aVar, yVar4, i12, 0);
                        y yVar5 = yVar2;
                        if (yVar5 != null) {
                            y.a.A(aVar, yVar5, i12 + yVar4.a, Math.round(((i11 - i6) / 2.0f) * 1.0f));
                        }
                        return Unit.a;
                    }
                });
            }
        }
        throw hu1.a("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.aiv
    public final int e(nzo nzoVar, List<? extends mzo> list, int i) {
        int size = list.size();
        int iA0 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iA0 += list.get(i2).a0(i);
        }
        return iA0;
    }

    @Override // defpackage.aiv
    public final int g(nzo nzoVar, List<? extends mzo> list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).x(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).x(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.aiv
    public final int i(nzo nzoVar, List<? extends mzo> list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).R(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).R(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
