package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.social.domain.CustomCodes;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class cac {
    public static final void a(final d dVar, final hjx hjxVar, final bdc bdcVar, final a0c a0cVar, final Function0 function0, final Function0 function1, final Function0 function2, final Function1 function3, final gaj gajVar, final Function2 function4, e1c e1cVar, a aVar, final int i) {
        int i2;
        b bVar;
        final e1c e1cVar2;
        final e1c e1cVar3;
        b bVar2;
        int i3;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        gajVar.getClass();
        function4.getClass();
        b bVarI = aVar.i(45049260);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(hjxVar) : bVarI.A(hjxVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(bdcVar) : bVarI.A(bdcVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? bVarI.M(a0cVar) : bVarI.A(a0cVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.A(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= bVarI.A(function3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= bVarI.A(gajVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= bVarI.A(function4) ? 536870912 : 268435456;
        }
        if (bVarI.q(i2 & 1, (i2 & 306783379) != 306783378)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                w8i0 w8i0VarA = zdt.a(bVarI);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                e1cVar3 = (e1c) p8i0.a(jq40.a(e1c.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            } else {
                bVarI.G();
                e1cVar3 = e1cVar;
            }
            bVarI.Y();
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            final ytw ytwVar = (ytw) objY;
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            Unit unit = Unit.a;
            boolean zA = bVarI.A(context);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new bac(context, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, unit, (Function2) objY2);
            boolean zA2 = ((i2 & 896) == 256 || ((i2 & 512) != 0 && bVarI.A(bdcVar))) | ((((i2 & 112) ^ 48) > 32 && bVarI.A(hjxVar)) || (i2 & 48) == 32) | ((29360128 & i2) == 8388608) | ((234881024 & i2) == 67108864) | ((1879048192 & i2) == 536870912) | ((57344 & i2) == 16384) | ((458752 & i2) == 131072) | bVarI.A(e1cVar3) | ((3670016 & i2) == 1048576);
            Object objY3 = bVarI.y();
            if (zA2 || objY3 == c0042a) {
                bVar2 = bVarI;
                i3 = i2;
                Function1 function5 = new Function1() { // from class: m9c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ghx ghxVar = (ghx) obj;
                        ghxVar.getClass();
                        final bdc bdcVar2 = bdcVar;
                        final hjx hjxVar2 = hjxVar;
                        final Function1 function6 = function3;
                        final gaj gajVar2 = gajVar;
                        final Function2 function7 = function4;
                        op8 op8Var = new op8(-1365230197, new iaj() { // from class: t9c
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                a aVar2 = (a) obj4;
                                ((Integer) obj5).getClass();
                                ((pf0) obj2).getClass();
                                ((ifx) obj3).getClass();
                                hjx hjxVar3 = hjxVar2;
                                boolean zA3 = aVar2.A(hjxVar3);
                                Object objY4 = aVar2.y();
                                a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                if (zA3 || objY4 == c0042a2) {
                                    objY4 = new r9c(hjxVar3, 0);
                                    aVar2.r(objY4);
                                }
                                Function0 function8 = (Function0) objY4;
                                boolean zA4 = aVar2.A(hjxVar3);
                                Object objY5 = aVar2.y();
                                if (zA4 || objY5 == c0042a2) {
                                    objY5 = new sk8(hjxVar3, 1);
                                    aVar2.r(objY5);
                                }
                                rbc.i(bdcVar2, function8, (Function1) objY5, function6, gajVar2, function7, aVar2, 8);
                                return Unit.a;
                            }
                        }, true);
                        o2g o2gVar = o2g.a;
                        o2gVar.getClass();
                        m2g m2gVar = m2g.a;
                        hhx.a(ghxVar, jq40.a(CustomCodes.class), o2gVar, m2gVar, null, null, null, null, op8Var);
                        final Function0 function8 = function0;
                        final Function0 function9 = function1;
                        hhx.a(ghxVar, jq40.a(a0c.c.class), o2gVar, m2gVar, null, null, null, null, new op8(-671653516, new iaj() { // from class: u9c
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                ((Integer) obj5).getClass();
                                ((pf0) obj2).getClass();
                                ((ifx) obj3).getClass();
                                a2c.a(function8, function9, null, (a) obj4, 0);
                                return Unit.a;
                            }
                        }, true));
                        final e1c e1cVar4 = e1cVar3;
                        final ytw ytwVar2 = ytwVar;
                        hhx.a(ghxVar, jq40.a(a0c.a.class), o2gVar, m2gVar, null, null, null, null, new op8(-1789834029, new iaj() { // from class: v9c
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                a aVar2 = (a) obj4;
                                ((Integer) obj5).getClass();
                                ((pf0) obj2).getClass();
                                ((ifx) obj3).getClass();
                                ytw ytwVar3 = ytwVar2;
                                boolean zBooleanValue = ((Boolean) ytwVar3.getValue()).booleanValue();
                                Object objY4 = aVar2.y();
                                int i4 = 0;
                                a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                if (objY4 == c0042a2) {
                                    objY4 = new n9c(ytwVar3, i4);
                                    aVar2.r(objY4);
                                }
                                Function0 function10 = (Function0) objY4;
                                hjx hjxVar3 = hjxVar2;
                                boolean zA3 = aVar2.A(hjxVar3);
                                Object objY5 = aVar2.y();
                                if (zA3 || objY5 == c0042a2) {
                                    objY5 = new o9c(hjxVar3, 0);
                                    aVar2.r(objY5);
                                }
                                Function0 function11 = (Function0) objY5;
                                boolean zA4 = aVar2.A(hjxVar3);
                                Object objY6 = aVar2.y();
                                if (zA4 || objY6 == c0042a2) {
                                    objY6 = new p9c(hjxVar3, 0);
                                    aVar2.r(objY6);
                                }
                                w0c.d(zBooleanValue, function10, function8, function9, function11, (Function1) objY6, e1cVar4, aVar2, 2097200);
                                return Unit.a;
                            }
                        }, true));
                        hhx.a(ghxVar, jq40.a(a0c.d.class), o2gVar, m2gVar, null, null, null, null, new op8(1386952754, new iaj() { // from class: w9c
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                a aVar2 = (a) obj4;
                                ((Integer) obj5).getClass();
                                ((pf0) obj2).getClass();
                                ((ifx) obj3).getClass();
                                final hjx hjxVar3 = hjxVar2;
                                boolean zA3 = aVar2.A(hjxVar3);
                                Object objY4 = aVar2.y();
                                if (zA3 || objY4 == a.C0041a.a) {
                                    objY4 = new gaj() { // from class: q9c
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                            String str = (String) obj6;
                                            String str2 = (String) obj7;
                                            String str3 = (String) obj8;
                                            str.getClass();
                                            str2.getClass();
                                            str3.getClass();
                                            yfx.h(hjxVar3, new a0c.e(str, str3, str2), null, 6);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY4);
                                }
                                szb.d(function8, (gaj) objY4, null, aVar2, 0);
                                return Unit.a;
                            }
                        }, true));
                        hhx.a(ghxVar, jq40.a(a0c.e.class), o2gVar, m2gVar, null, null, null, null, new op8(268772241, new iaj() { // from class: x9c
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                ((Integer) obj5).getClass();
                                ((pf0) obj2).getClass();
                                ((ifx) obj3).getClass();
                                zyb.c(function8, null, (a) obj4, 0);
                                return Unit.a;
                            }
                        }, true));
                        final Function0 function10 = function2;
                        hhx.a(ghxVar, jq40.a(a0c.b.class), o2gVar, m2gVar, null, null, null, null, new op8(-849408272, new iaj() { // from class: y9c
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                a aVar2 = (a) obj4;
                                ((Integer) obj5).getClass();
                                ((pf0) obj2).getClass();
                                ((ifx) obj3).getClass();
                                final Function0 function11 = function8;
                                boolean zM = aVar2.M(function11);
                                Object objY4 = aVar2.y();
                                final ytw ytwVar3 = ytwVar2;
                                a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                if (zM || objY4 == c0042a2) {
                                    objY4 = new Function0() { // from class: z9c
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function11.invoke();
                                            ytwVar3.setValue(Boolean.TRUE);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY4);
                                }
                                Function0 function12 = (Function0) objY4;
                                final Function0 function13 = function10;
                                boolean zM2 = aVar2.M(function13);
                                final hjx hjxVar3 = hjxVar2;
                                boolean zA3 = zM2 | aVar2.A(hjxVar3);
                                Object objY5 = aVar2.y();
                                if (zA3 || objY5 == c0042a2) {
                                    objY5 = new Function0() { // from class: aac
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function13.invoke();
                                            hjxVar3.k();
                                            ytwVar3.setValue(Boolean.TRUE);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY5);
                                }
                                rp7.c(function12, (Function0) objY5, null, aVar2, 0);
                                return Unit.a;
                            }
                        }, true));
                        return Unit.a;
                    }
                };
                bVar2.r(function5);
                objY3 = function5;
            } else {
                i3 = i2;
                bVar2 = bVarI;
            }
            b bVar3 = bVar2;
            uix.b(hjxVar, a0cVar, dVar, null, null, null, null, null, null, (Function1) objY3, bVar3, ((i3 >> 3) & 14) | 8 | ((i3 >> 6) & 112) | ((i3 << 6) & 896), 2040);
            bVar = bVar3;
            e1cVar2 = e1cVar3;
        } else {
            bVar = bVarI;
            bVar.G();
            e1cVar2 = e1cVar;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: s9c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    cac.a(dVar, hjxVar, bdcVar, a0cVar, function0, function1, function2, function3, gajVar, function4, e1cVar2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
