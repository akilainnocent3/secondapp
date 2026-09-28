package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class wl70 {
    public static final void a(final String str, final boolean z, final xl70 xl70Var, final qcn<d970> qcnVar, final String str2, final Function1<? super String, Unit> function1, final Function2<? super String, ? super String, Unit> function2, a aVar, final int i) {
        str.getClass();
        qcnVar.getClass();
        function1.getClass();
        function2.getClass();
        b bVarI = aVar.i(2117238185);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.b(z) ? 32 : 16) | (bVarI.M(xl70Var) ? 256 : 128) | (bVarI.M(qcnVar) ? 2048 : 1024) | (bVarI.M(str2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function1) ? 131072 : 65536) | (bVarI.A(function2) ? 1048576 : 524288);
        if (bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            d dVarB = androidx.compose.foundation.a.b(d.a.b, ((lib0) bVarI.O(oib0.a)).n0, zk40.a);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            boolean z2 = ((458752 & i2) == 131072) | ((i2 & 14) == 4);
            Object objY = bVarI.y();
            if (z2 || objY == a.C0041a.a) {
                objY = new Function0() { // from class: tl70
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(str);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            rl70.a(xl70Var, (Function0) objY, bVarI, (i2 >> 6) & 14);
            hh0.b(l78.a, z, null, null, null, null, pp8.b(1761078555, new gaj() { // from class: ul70
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((jh0) obj).getClass();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        final Function2 function3 = function2;
                        boolean zM = aVar3.M(function3);
                        final String str3 = str;
                        boolean zM2 = zM | aVar3.M(str3);
                        Object objY2 = aVar3.y();
                        if (zM2 || objY2 == a.C0041a.a) {
                            objY2 = new Function1() { // from class: sl70
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    String str4 = (String) obj4;
                                    str4.getClass();
                                    function3.invoke(str3, str4);
                                    return Unit.a;
                                }
                            };
                            aVar3.r(objY2);
                        }
                        b970.a(0, qcnVar, aVar3, str2, (Function1) objY2);
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 1572870 | (i2 & 112), 30);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, z, xl70Var, qcnVar, str2, function1, function2, i) { // from class: vl70
                public final /* synthetic */ String a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ xl70 c;
                public final /* synthetic */ qcn d;
                public final /* synthetic */ String e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Function2 i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    wl70.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
