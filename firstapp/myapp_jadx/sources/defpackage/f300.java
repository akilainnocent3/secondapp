package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class f300 {
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:63:0x0117  */
    /* JADX WARN: Code duplicated, block: B:64:0x0124  */
    /* JADX WARN: Code duplicated, block: B:67:0x012f  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final int i, final int i2, a aVar, final d dVar, final String str, Function0 function0) {
        int i3;
        Function0 function1;
        boolean z;
        b bVar;
        Function0 function2;
        e eVarZ;
        a.C0041a.C0042a c0042a;
        Function0 function3;
        boolean z2;
        Object objY;
        final ytw ytwVar;
        boolean zM;
        Object objY2;
        Object objY3;
        str.getClass();
        b bVarI = aVar.i(-743005675);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.A(null) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                function1 = function0;
                i3 |= bVarI.A(function1) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i3 & 1, z)) {
                c0042a = a.C0041a.a;
                if (i4 != 0) {
                    objY3 = bVarI.y();
                    if (objY3 == c0042a) {
                        objY3 = new df3(2);
                        bVarI.r(objY3);
                    }
                    function3 = (Function0) objY3;
                } else {
                    function3 = function1;
                }
                if ((i3 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objY = bVarI.y();
                if (z2 || objY == c0042a) {
                    objY = m.b(Boolean.TRUE);
                    bVarI.r(objY);
                }
                ytwVar = (ytw) objY;
                if (((Boolean) ytwVar.getValue()).booleanValue()) {
                    bVarI.N(1379627692);
                    d dVarN = g3w.f(d.a.b, true, function3).n(dVar);
                    nan.a aVar2 = new nan.a((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
                    aVar2.c = str;
                    aVar2.m = wr5.c;
                    nan nanVarA = aVar2.a();
                    zM = bVarI.M(ytwVar);
                    objY2 = bVarI.y();
                    if (zM || objY2 == c0042a) {
                        objY2 = new Function1() { // from class: d300
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ((b01.b.C0106b) obj).getClass();
                                ytwVar.setValue(Boolean.FALSE);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY2);
                    }
                    int i5 = ((i3 << 3) & 7168) | 48;
                    function2 = function3;
                    mw90.b(nanVarA, null, dVarN, null, null, null, null, (Function1) objY2, d0b.a.b, 0.0f, null, bVarI, i5, 6, 31472);
                    bVar = bVarI;
                    bVar.X(false);
                } else {
                    function2 = function3;
                    bVar = bVarI;
                    bVar.N(1380095885);
                    bVar.X(false);
                }
            } else {
                bVar = bVarI;
                bVar.G();
                function2 = function1;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                final Function0 function4 = function2;
                eVarZ.d = new Function2() { // from class: e300
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        f300.a(qj40.a(i | 1), i2, (a) obj, dVar, str, function4);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 3072;
        function1 = function0;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i3 & 1, z)) {
            c0042a = a.C0041a.a;
            if (i4 != 0) {
                objY3 = bVarI.y();
                if (objY3 == c0042a) {
                    objY3 = new df3(2);
                    bVarI.r(objY3);
                }
                function3 = (Function0) objY3;
            } else {
                function3 = function1;
            }
            if ((i3 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            objY = bVarI.y();
            if (z2) {
                objY = m.b(Boolean.TRUE);
                bVarI.r(objY);
            } else {
                objY = m.b(Boolean.TRUE);
                bVarI.r(objY);
            }
            ytwVar = (ytw) objY;
            if (((Boolean) ytwVar.getValue()).booleanValue()) {
                bVarI.N(1379627692);
                d dVarN2 = g3w.f(d.a.b, true, function3).n(dVar);
                nan.a aVar3 = new nan.a((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
                aVar3.c = str;
                aVar3.m = wr5.c;
                nan nanVarA2 = aVar3.a();
                zM = bVarI.M(ytwVar);
                objY2 = bVarI.y();
                if (zM) {
                    objY2 = new Function1() { // from class: d300
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ((b01.b.C0106b) obj).getClass();
                            ytwVar.setValue(Boolean.FALSE);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                } else {
                    objY2 = new Function1() { // from class: d300
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ((b01.b.C0106b) obj).getClass();
                            ytwVar.setValue(Boolean.FALSE);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                }
                int i6 = ((i3 << 3) & 7168) | 48;
                function2 = function3;
                mw90.b(nanVarA2, null, dVarN2, null, null, null, null, (Function1) objY2, d0b.a.b, 0.0f, null, bVarI, i6, 6, 31472);
                bVar = bVarI;
                bVar.X(false);
            } else {
                function2 = function3;
                bVar = bVarI;
                bVar.N(1380095885);
                bVar.X(false);
            }
        } else {
            bVar = bVarI;
            bVar.G();
            function2 = function1;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            final Function0 function5 = function2;
            eVarZ.d = new Function2() { // from class: e300
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f300.a(qj40.a(i | 1), i2, (a) obj, dVar, str, function5);
                    return Unit.a;
                }
            };
        }
    }
}
