package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.l;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class z3v {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, final boolean z, final boolean z2, final Function0 function0, final exu exuVar, a aVar, final int i) {
        e eVarZ;
        Function2<? super a, ? super Integer, Unit> function2;
        final String str2 = str;
        final exu exuVar2 = exuVar;
        b bVarI = aVar.i(-1971668119);
        int i2 = i | (bVarI.M(str2) ? 4 : 2) | (bVarI.b(z) ? 32 : 16) | (bVarI.b(z2) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024) | (bVarI.A(exuVar2) ? 16384 : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            if (z) {
                Object objY = bVarI.y();
                a.C0041a.C0042a c0042a = a.C0041a.a;
                if (objY == c0042a) {
                    objY = m.b(Boolean.FALSE);
                    bVarI.r(objY);
                }
                final ytw ytwVar = (ytw) objY;
                Object objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = l.a(0L);
                    bVarI.r(objY2);
                }
                final xsw xswVar = (xsw) objY2;
                Object objY3 = bVarI.y();
                if (objY3 == c0042a) {
                    objY3 = new v3v();
                    bVarI.r(objY3);
                }
                d dVarA = androidx.compose.ui.draw.a.a(d.a.b, (Function1) objY3);
                boolean z3 = (i2 & 7168) == 2048;
                Object objY4 = bVarI.y();
                if (z3 || objY4 == c0042a) {
                    objY4 = new sqg(function0, ytwVar, xswVar, 1);
                    bVarI.r(objY4);
                }
                b490.a((i2 >> 3) & 112, 4, bVarI, dVarA, (Function0) objY4, z2, false);
                if (((Boolean) ytwVar.getValue()).booleanValue()) {
                    str2 = str;
                    exuVar2 = exuVar;
                    boolean z4 = (57344 & i2) == 16384;
                    Object objY5 = bVarI.y();
                    if (z4 || objY5 == c0042a) {
                        objY5 = new Function0() { // from class: x3v
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                xsw xswVar2 = xswVar;
                                exuVar2.invoke(Long.valueOf(xswVar2.u()));
                                ytwVar.setValue(Boolean.FALSE);
                                xswVar2.K(0L);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY5);
                    }
                    c3s.b(i2 & 14, bVarI, str2, (Function0) objY5);
                } else {
                    eVarZ = bVarI.Z();
                    if (eVarZ == null) {
                        return;
                    } else {
                        function2 = new Function2(str, z, z2, function0, exuVar, i) { // from class: w3v
                            public final /* synthetic */ String a;
                            public final /* synthetic */ boolean b;
                            public final /* synthetic */ boolean c;
                            public final /* synthetic */ Function0 d;
                            public final /* synthetic */ exu e;

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = qj40.a(1);
                                z3v.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                                return Unit.a;
                            }
                        };
                    }
                }
            } else {
                eVarZ = bVarI.Z();
                if (eVarZ == null) {
                    return;
                } else {
                    function2 = new Function2(str2, z, z2, function0, exuVar2, i) { // from class: u3v
                        public final /* synthetic */ String a;
                        public final /* synthetic */ boolean b;
                        public final /* synthetic */ boolean c;
                        public final /* synthetic */ Function0 d;
                        public final /* synthetic */ exu e;

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(1);
                            z3v.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                            return Unit.a;
                        }
                    };
                }
            }
            eVarZ.d = function2;
        }
        bVarI.G();
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            function2 = new Function2(str2, z, z2, function0, exuVar2, i) { // from class: y3v
                public final /* synthetic */ String a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ exu e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    z3v.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
            eVarZ.d = function2;
        }
    }
}
