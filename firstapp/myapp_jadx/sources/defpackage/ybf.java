package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ybf implements qbf {
    public final fcf a;
    public final i3z b;
    public final int c;

    public ybf(fcf fcfVar, i3z i3zVar, int i) {
        fcfVar.getClass();
        this.a = fcfVar;
        this.b = i3zVar;
        this.c = i;
    }

    @Override // defpackage.qbf
    public final d a(d dVar, boolean z, obf obfVar, pbf pbfVar) {
        dVar.getClass();
        fcf fcfVar = this.a;
        SnapshotStateList<kcf> snapshotStateList = fcfVar.j;
        int i = this.c;
        return y9f.a(dVar, snapshotStateList.get(i), this.b, z && (((Boolean) a6a0.b(new bcf(i, fcfVar)).getValue()).booleanValue() || !((Boolean) fcfVar.i.getValue()).booleanValue()), null, false, new vbf(this, obfVar, null), new wbf(pbfVar, this, null), false, 144);
    }

    @Override // defpackage.qbf
    public final d b(final psw pswVar, final mbf mbfVar, final nbf nbfVar) {
        gaj gajVar = new gaj() { // from class: rbf
            @Override // defpackage.gaj
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                d dVar = (d) obj;
                a aVar = (a) obj2;
                ((Integer) obj3).getClass();
                dVar.getClass();
                aVar.N(1821710050);
                Object objY = aVar.y();
                a.C0041a.C0042a c0042a = a.C0041a.a;
                if (objY == c0042a) {
                    objY = new jxh0();
                    aVar.r(objY);
                }
                final jxh0 jxh0Var = (jxh0) objY;
                Object objY2 = aVar.y();
                if (objY2 == c0042a) {
                    objY2 = xvf.i(e.a, aVar);
                    aVar.r(objY2);
                }
                final v5b v5bVar = (v5b) objY2;
                final ybf ybfVar = this.a;
                final fcf fcfVar = ybfVar.a;
                int i = ybfVar.c;
                fcfVar.getClass();
                final boolean z = ((Boolean) a6a0.b(new bcf(i, fcfVar)).getValue()).booleanValue() || !((Boolean) ybfVar.a.i.getValue()).booleanValue();
                boolean zA = aVar.A(ybfVar);
                final mbf mbfVar2 = mbfVar;
                boolean zM = zA | aVar.M(mbfVar2);
                Object objY3 = aVar.y();
                if (zM || objY3 == c0042a) {
                    objY3 = new Function1(mbfVar2) { // from class: sbf
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            ybf ybfVar2 = this.a;
                            fcf fcfVar2 = ybfVar2.a;
                            int i2 = ybfVar2.c;
                            ((x5a0) fcfVar2.g).setValue(Integer.valueOf(i2));
                            ((x5a0) fcfVar2.h).setValue(Integer.valueOf(i2));
                            return Unit.a;
                        }
                    };
                    aVar.r(objY3);
                }
                final Function1 function1 = (Function1) objY3;
                boolean zA2 = aVar.A(jxh0Var) | aVar.A(ybfVar) | aVar.A(v5bVar);
                final nbf nbfVar2 = nbfVar;
                boolean zM2 = zA2 | aVar.M(nbfVar2);
                Object objY4 = aVar.y();
                if (zM2 || objY4 == c0042a) {
                    objY4 = new Function0() { // from class: tbf
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            float fC;
                            jxh0 jxh0Var2 = jxh0Var;
                            jxh0Var2.getClass();
                            long jA = jxh0Var2.a(fxh0.a(Float.MAX_VALUE, Float.MAX_VALUE));
                            jxh0Var2.b();
                            ybf ybfVar2 = ybfVar;
                            int iOrdinal = ybfVar2.b.ordinal();
                            if (iOrdinal == 0) {
                                fC = exh0.c(jA);
                            } else {
                                if (iOrdinal != 1) {
                                    uhc.a();
                                    return null;
                                }
                                fC = exh0.b(jA);
                            }
                            ej5.c(v5bVar, null, null, new xbf(ybfVar2, fC, null), 3);
                            nbfVar2.invoke(Float.valueOf(fC));
                            return Unit.a;
                        }
                    };
                    aVar.r(objY4);
                }
                final Function0 function0 = (Function0) objY4;
                boolean zA3 = aVar.A(jxh0Var) | aVar.A(ybfVar);
                Object objY5 = aVar.y();
                if (zA3 || objY5 == c0042a) {
                    objY5 = new Function2() { // from class: ubf
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            float fIntBitsToFloat;
                            m020 m020Var = (m020) obj4;
                            gly glyVar = (gly) obj5;
                            m020Var.getClass();
                            mxh0.a(jxh0Var, m020Var, 0L);
                            ybf ybfVar2 = ybfVar;
                            kcf kcfVar = ybfVar2.a.j.get(ybfVar2.c);
                            int iOrdinal = ybfVar2.b.ordinal();
                            if (iOrdinal == 0) {
                                fIntBitsToFloat = Float.intBitsToFloat((int) (glyVar.a & 4294967295L));
                            } else {
                                if (iOrdinal != 1) {
                                    uhc.a();
                                    return null;
                                }
                                fIntBitsToFloat = Float.intBitsToFloat((int) (glyVar.a >> 32));
                            }
                            kcfVar.a(fIntBitsToFloat);
                            return Unit.a;
                        }
                    };
                    aVar.r(objY5);
                }
                final Function2 function2 = (Function2) objY5;
                function1.getClass();
                function0.getClass();
                function2.getClass();
                Function1 function3 = new Function1() { // from class: v9f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        knn knnVar = (knn) obj4;
                        knnVar.getClass();
                        xuh0 xuh0Var = knnVar.a;
                        xuh0Var.b(fcfVar, "key");
                        xuh0Var.b(Boolean.valueOf(z), "enabled");
                        return Unit.a;
                    }
                };
                final psw pswVar2 = pswVar;
                d dVarA = c.a(dVar, function3, new gaj() { // from class: w9f
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        d dVar2 = (d) obj4;
                        a aVar2 = (a) obj5;
                        ((Integer) obj6).getClass();
                        dVar2.getClass();
                        aVar2.N(1062227074);
                        Object objY6 = aVar2.y();
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        if (objY6 == c0042a2) {
                            objY6 = xvf.i(e.a, aVar2);
                            aVar2.r(objY6);
                        }
                        final v5b v5bVar2 = (v5b) objY6;
                        Object objY7 = aVar2.y();
                        if (objY7 == c0042a2) {
                            objY7 = m.b(null);
                            aVar2.r(objY7);
                        }
                        final ytw ytwVar = (ytw) objY7;
                        Object objY8 = aVar2.y();
                        if (objY8 == c0042a2) {
                            objY8 = m.b(Boolean.FALSE);
                            aVar2.r(objY8);
                        }
                        final ytw ytwVar2 = (ytw) objY8;
                        boolean zA4 = aVar2.A(v5bVar2);
                        final psw pswVar3 = pswVar2;
                        boolean zM3 = zA4 | aVar2.M(pswVar3);
                        final Function0 function4 = function0;
                        boolean zM4 = zM3 | aVar2.M(function4);
                        Object objY9 = aVar2.y();
                        if (zM4 || objY9 == c0042a2) {
                            objY9 = new Function1() { // from class: x9f
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj7) {
                                    ((use) obj7).getClass();
                                    return new eaf(v5bVar2, pswVar3, ytwVar2, ytwVar, function4);
                                }
                            };
                            aVar2.r(objY9);
                        }
                        Object obj7 = fcfVar;
                        xvf.c(obj7, (Function1) objY9, aVar2);
                        boolean z2 = z;
                        Boolean boolValueOf = Boolean.valueOf(z2);
                        boolean zB = aVar2.b(z2) | aVar2.A(v5bVar2) | aVar2.M(pswVar3);
                        Function1 function5 = function1;
                        boolean zM5 = zB | aVar2.M(function5) | aVar2.M(function4);
                        Function2 function6 = function2;
                        boolean zM6 = zM5 | aVar2.M(function6);
                        Object objY10 = aVar2.y();
                        if (zM6 || objY10 == c0042a2) {
                            daf dafVar = new daf(z2, function6, function5, ytwVar2, v5bVar2, pswVar3, ytwVar, function4);
                            aVar2.r(dafVar);
                            objY10 = dafVar;
                        }
                        b020 b020Var = wje0.a;
                        d dVarN = dVar2.n(new SuspendPointerInputElement(obj7, boolValueOf, null, (PointerInputEventHandler) objY10, 4));
                        aVar2.H();
                        return dVarN;
                    }
                });
                aVar.H();
                return dVarA;
            }
        };
        return c.a(d.a.b, gnn.a, gajVar);
    }
}
