package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class u9t {
    public static final void a(d dVar, a aVar, final int i) {
        int i2;
        final d dVar2;
        b bVar;
        b bVarI = aVar.i(146291886);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            final egn.a aVarA = kgn.a(kgn.b("shimmer", bVarI, 0), 0.0f, 1.0f, yi0.a(yi0.e(1000, 0, xkf.d, 2), l850.a, 0L, 4), "linePosition", bVarI, 29112, 0);
            qyd0 qyd0Var = vh60.a;
            long j = ((th60) bVarI.O(qyd0Var)).s;
            long j2 = ((th60) bVarI.O(qyd0Var)).t;
            Object objY = bVarI.y();
            ya5.a aVar2 = ya5.a;
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = ya5.a.h(aVar2, kotlin.collections.b.k(new j58(j), new j58(j2)), 0.0f, 0.0f, 14);
                bVarI.r(objY);
            }
            final ya5 ya5Var = (ya5) objY;
            long j3 = ((th60) bVarI.O(qyd0Var)).q;
            long j4 = ((th60) bVarI.O(qyd0Var)).r;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = ya5.a.h(aVar2, kotlin.collections.b.k(new j58(j3), new j58(j4)), 0.0f, 0.0f, 14);
                bVarI.r(objY2);
            }
            final ya5 ya5Var2 = (ya5) objY2;
            dVar2 = dVar;
            rg6.a(dVar2, null, gg6.b(j58.l, 0L, bVarI, 6, 14), null, null, pp8.b(447882236, new gaj() { // from class: q9t
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d dVarE = j.e(d.a.b, 1.0f);
                        final twd0 twd0Var = aVarA;
                        boolean zM = aVar3.M(twd0Var);
                        Object objY3 = aVar3.y();
                        if (zM || objY3 == a.C0041a.a) {
                            final ya5 ya5Var3 = ya5Var2;
                            final ya5 ya5Var4 = ya5Var;
                            objY3 = new Function1() { // from class: s9t
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    mr5 mr5Var = (mr5) obj4;
                                    mr5Var.getClass();
                                    final ya5 ya5Var5 = ya5Var3;
                                    final ya5 ya5Var6 = ya5Var4;
                                    final twd0 twd0Var2 = twd0Var;
                                    return mr5Var.e(new Function1() { // from class: t9t
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj5) {
                                            tcf tcfVar = (tcf) obj5;
                                            tcfVar.getClass();
                                            float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                                            float fFloatValue = ((Number) twd0Var2.getValue()).floatValue() * fIntBitsToFloat;
                                            tcf.V1(tcfVar, ya5Var5, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), 0.0f, null, null, 0, 120);
                                            tcf.V1(tcfVar, ya5Var6, (((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat - fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), 0.0f, null, null, 0, 120);
                                            return Unit.a;
                                        }
                                    });
                                }
                            };
                            aVar3.r(objY3);
                        }
                        g75.a(androidx.compose.ui.draw.a.b(dVarE, (Function1) objY3), aVar3, 0);
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, (i2 & 14) | 196608, 26);
            bVar = bVarI;
        } else {
            dVar2 = dVar;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: r9t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    u9t.a(dVar2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
