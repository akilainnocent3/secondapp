package defpackage;

import android.view.View;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.ui.d;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class tii0 {
    public static final void a(final uji0 uji0Var, final Function2<? super String, ? super String, Unit> function2, final Function0<Unit> function0, a aVar, final int i) {
        b bVar;
        final Function0<Unit> function1 = function0;
        uji0Var.getClass();
        function2.getClass();
        function1.getClass();
        b bVarI = aVar.i(1648187551);
        int i2 = i | (bVarI.M(uji0Var) ? 4 : 2) | (bVarI.A(function2) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = xvf.i(e.a, bVarI);
                bVarI.r(objY);
            }
            final v5b v5bVar = (v5b) objY;
            final j590 j590VarG = v1w.g(true, null, bVarI, 6, 2);
            bVar = bVarI;
            function1 = function0;
            v1w.a(function1, v8j0.b(g3w.c(d.a.b)), j590VarG, 0.0f, false, j060.e(16.0f, 16.0f, 0.0f, 0.0f, 12), ((lib0) bVarI.O(oib0.a)).b1, 0L, 0L, null, null, null, pp8.b(-464426495, new gaj() { // from class: nii0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
                        dnn dnnVarC = r8j0.c(q8j0.a.a(aVar2).k, aVar2);
                        d dVarI = j.i(d.a.b, ((mla.f((int) (((a8j0) aVar2.O(kna.t)).a() & 4294967295L), aVar2) - dnnVarC.d()) - dnnVarC.a()) * 0.8f);
                        final v5b v5bVar2 = v5bVar;
                        boolean zA = aVar2.A(v5bVar2);
                        final j590 j590Var = j590VarG;
                        boolean zM = zA | aVar2.M(j590Var);
                        final Function0 function3 = function0;
                        boolean zM2 = zM | aVar2.M(function3);
                        final Function2 function4 = function2;
                        boolean zM3 = zM2 | aVar2.M(function4);
                        Object objY2 = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zM3 || objY2 == c0042a) {
                            objY2 = new Function2() { // from class: pii0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    final String str = (String) obj4;
                                    final String str2 = (String) obj5;
                                    str.getClass();
                                    str2.getClass();
                                    final Function2 function5 = function4;
                                    ej5.c(v5bVar2, null, null, new sii0(j590Var, new Function0() { // from class: rii0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function5.invoke(str, str2);
                                            return Unit.a;
                                        }
                                    }, function3, null), 3);
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY2);
                        }
                        Function2 function5 = (Function2) objY2;
                        boolean zA2 = aVar2.A(v5bVar2) | aVar2.M(j590Var) | aVar2.M(function3);
                        Object objY3 = aVar2.y();
                        if (zA2 || objY3 == c0042a) {
                            objY3 = new Function0() { // from class: qii0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    ej5.c(v5bVar2, null, null, new sii0(j590Var, null, function3, null), 3);
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY3);
                        }
                        mii0.a(dVarI, uji0Var, function5, (Function0) objY3, aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, ((i2 >> 6) & 14) | 24576, 3078, 7048);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function2, function1, i) { // from class: oii0
                public final /* synthetic */ Function2 b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    tii0.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
