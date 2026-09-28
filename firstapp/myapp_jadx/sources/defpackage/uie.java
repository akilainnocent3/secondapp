package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.j;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.d;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class uie {
    public static final void a(final int i, final int i2, a aVar) {
        b bVarI = aVar.i(1568825895);
        int i3 = i2 | 6;
        if (bVarI.q(i3 & 1, (i3 & 3) != 2)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new SnapshotStateList();
                bVarI.r(objY);
            }
            final SnapshotStateList snapshotStateList = (SnapshotStateList) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = j.a(1080.0f);
                bVarI.r(objY2);
            }
            final isw iswVar = (isw) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = j.a(1920.0f);
                bVarI.r(objY3);
            }
            final isw iswVar2 = (isw) objY3;
            d dVarE = androidx.compose.foundation.layout.j.e(d.a.b, 1.0f);
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = new Function1() { // from class: qie
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        tcf tcfVar;
                        tcf tcfVar2 = (tcf) obj;
                        tcfVar2.getClass();
                        char c = ' ';
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar2.d() >> 32));
                        isw iswVar3 = iswVar;
                        iswVar3.A(fIntBitsToFloat);
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tcfVar2.d() & 4294967295L));
                        isw iswVar4 = iswVar2;
                        iswVar4.A(fIntBitsToFloat2);
                        SnapshotStateList snapshotStateList2 = snapshotStateList;
                        if (snapshotStateList2.isEmpty()) {
                            int i4 = 0;
                            while (i4 < 10) {
                                float fJ = iswVar3.j() / 300.0f;
                                float fJ2 = iswVar3.j() / 50.0f;
                                lx30.INSTANCE.getClass();
                                p4 p4Var = lx30.b;
                                char c2 = c;
                                isw iswVar5 = iswVar4;
                                snapshotStateList2.add(new zvd0((((long) Float.floatToRawIntBits(iswVar3.j() * p4Var.d())) << c2) | (((long) Float.floatToRawIntBits(iswVar4.j() * p4Var.d())) & 4294967295L), (fJ * 0.5f) + (p4Var.d() * fJ), (fJ2 * 0.75f) + (p4Var.d() * fJ2), false, new ArrayList(), r58.d(p4Var.i() ? 4294964965L : 4293259519L), 1.0f, 0.015f));
                                i4++;
                                c = c2;
                                iswVar4 = iswVar5;
                            }
                        }
                        ListIterator listIterator = snapshotStateList2.listIterator();
                        while (true) {
                            dxd0 dxd0Var = (dxd0) listIterator;
                            if (!dxd0Var.hasNext()) {
                                return Unit.a;
                            }
                            zvd0 zvd0Var = (zvd0) dxd0Var.next();
                            boolean z = zvd0Var.d;
                            float f = zvd0Var.g;
                            long j = zvd0Var.f;
                            List<gly> list = zvd0Var.e;
                            float f2 = zvd0Var.b;
                            float f3 = 0.6f;
                            if (z) {
                                int size = list.size() - 1;
                                int i5 = 0;
                                while (i5 < size) {
                                    long j2 = list.get(i5).a;
                                    int i6 = i5 + 1;
                                    ListIterator listIterator2 = listIterator;
                                    long j3 = list.get(i6).a;
                                    float f4 = i5;
                                    float f5 = 1.0f;
                                    float size2 = (1.0f - (f4 / list.size())) * f;
                                    float f6 = f2 * f;
                                    float f7 = f4 * 0.2f;
                                    float f8 = (3.0f - f7) * f6;
                                    if (f8 >= 1.0f) {
                                        f5 = f8;
                                    }
                                    long j4 = j;
                                    int i7 = size;
                                    tcf tcfVar3 = tcfVar2;
                                    tcf.Z1(tcfVar3, j58.c(size2 * f3, j), j2, j3, f5, 0, null, 496);
                                    tcf.n0(tcfVar3, j58.c(0.15f * size2, j4), (4.0f - f7) * f6, j2, 0.0f, null, 120);
                                    tcfVar2 = tcfVar3;
                                    j = j4;
                                    f3 = f3;
                                    i5 = i6;
                                    f2 = f2;
                                    size = i7;
                                    list = list;
                                    listIterator = listIterator2;
                                }
                                tcfVar = tcfVar2;
                                tcf.n0(tcfVar, j58.c(f, j58.f), f2 * 2.0f * f, zvd0Var.a, 0.0f, null, 120);
                            } else {
                                tcfVar = tcfVar2;
                                tcf.n0(tcfVar, j58.c(0.1f, j), f2 * 3.0f, zvd0Var.a, 0.0f, null, 120);
                                tcf.n0(tcfVar, j58.c(0.25f, j), 1.7f * f2, zvd0Var.a, 0.0f, null, 120);
                                tcf.n0(tcfVar, j58.c(0.6f, j58.f), zvd0Var.b, zvd0Var.a, 0.0f, null, 120);
                                listIterator = listIterator;
                            }
                            tcfVar2 = tcfVar;
                        }
                    }
                };
                bVarI.r(objY4);
            }
            rxo.b(dVarE, (Function1) objY4, bVarI, 6);
            Unit unit = Unit.a;
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = new tie(snapshotStateList, iswVar, iswVar2, null);
                bVarI.r(objY5);
            }
            xvf.e(bVarI, unit, (Function2) objY5);
            i = 10;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, i2) { // from class: rie
                public final /* synthetic */ int a;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    uie.a(this.a, iA, (a) obj);
                    return Unit.a;
                }
            };
        }
    }
}
