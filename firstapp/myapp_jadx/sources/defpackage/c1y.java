package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class c1y {
    public static final void a(final w3x w3xVar, final Function0<Unit> function0, final Function0<Unit> function1, final Function1<? super Uri, Unit> function2, final Function1<? super String, Unit> function3, final Function1<? super f4x, Unit> function4, a aVar, final int i) {
        b bVar;
        w3xVar.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        b bVarI = aVar.i(-116628258);
        int i2 = i | (bVarI.M(w3xVar) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024) | (bVarI.A(function3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function4) ? 131072 : 65536);
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            final phx phxVarC = mr10.c(new vkx[0], bVarI);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = b40.a(bVarI);
            }
            final v3a0 v3a0Var = (v3a0) objY;
            bVar = bVarI;
            hy60.a(null, pp8.b(-1288290918, new Function2() { // from class: p0y
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        odd0.c(null, cb40.a(R.string.page_notification_center__notification_center, new Object[0], aVar2), function0, function1, aVar2, 0, 1);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), null, pp8.b(932443224, new s0y(v3a0Var), bVarI), null, 0, c68.a(R.color.background_general_secondary, bVarI), c68.a(R.color.background_general_secondary, bVarI), null, pp8.b(-1857802769, new gaj() { // from class: t0y
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    tmz tmzVar = (tmz) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    tmzVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(tmzVar) ? 4 : 2;
                    }
                    int i3 = 1;
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        d.a aVar3 = d.a.b;
                        d dVarE = j.e(h.e(aVar3, tmzVar), 1.0f);
                        i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarE);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, i78VarA, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        d dVarG = j.g(aVar3, 1.0f);
                        long jA = c68.a(R.color.background_general_secondary, aVar2);
                        long jA2 = c68.a(R.color.background_general_secondary, aVar2);
                        final w3x w3xVar2 = w3xVar;
                        j3f0.g(w3xVar2.a.ordinal(), dVarG, jA2, jA, pp8.b(1298938237, new gaj() { // from class: v0y
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                List list = (List) obj4;
                                a aVar5 = (a) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                list.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= (iIntValue2 & 8) == 0 ? aVar5.M(list) : aVar5.A(list) ? 4 : 2;
                                }
                                if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    w3x w3xVar3 = w3xVar2;
                                    if (w3xVar3.a.ordinal() < list.size()) {
                                        aVar5.N(-986219694);
                                        i2f0.a.a(i2f0.d((z1f0) list.get(w3xVar3.a.ordinal())), 4.0f, c68.a(R.color.brand_secondary, aVar5), aVar5, 3120, 0);
                                        aVar5.H();
                                    } else {
                                        aVar5.N(-985893915);
                                        aVar5.H();
                                    }
                                } else {
                                    aVar5.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), og9.b, pp8.b(679144317, new x51(i3, w3xVar2, function4), aVar2), aVar2, 1794096, 0);
                        String strName = w3xVar2.a.name();
                        d dVarE2 = j.e(aVar3, 1.0f);
                        final Function1 function5 = function3;
                        boolean zM = aVar2.M(function5);
                        final Function1 function6 = function2;
                        boolean zM2 = zM | aVar2.M(function6);
                        Object objY2 = aVar2.y();
                        if (zM2 || objY2 == a.C0041a.a) {
                            final v3a0 v3a0Var2 = v3a0Var;
                            objY2 = new Function1() { // from class: w0y
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    ghx ghxVar = (ghx) obj4;
                                    ghxVar.getClass();
                                    final v3a0 v3a0Var3 = v3a0Var2;
                                    final Function1 function7 = function5;
                                    final Function1 function8 = function6;
                                    hhx.b(ghxVar, "SYSTEM", null, new op8(1775735880, new iaj() { // from class: z0y
                                        @Override // defpackage.iaj
                                        public final Object d(Object obj5, Object obj6, Object obj7, Object obj8) {
                                            a aVar5 = (a) obj7;
                                            ((Integer) obj8).getClass();
                                            ((pf0) obj5).getClass();
                                            ((ifx) obj6).getClass();
                                            w8i0 w8i0VarA = zdt.a(aVar5);
                                            if (w8i0VarA == null) {
                                                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                                return null;
                                            }
                                            n32 n32Var = (n32) p8i0.a(jq40.a(y3x.class), w8i0VarA, null, cll.a(w8i0VarA, aVar5), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, aVar5);
                                            h0s h0sVarA = k0s.a(n32Var.i, aVar5);
                                            Context context = (Context) aVar5.O(AndroidCompositionLocals_androidKt.b);
                                            Unit unit = Unit.a;
                                            boolean zA = aVar5.A(n32Var) | aVar5.A(context);
                                            Object objY3 = aVar5.y();
                                            a.C0041a.C0042a c0042a = a.C0041a.a;
                                            if (zA || objY3 == c0042a) {
                                                objY3 = new a1y(n32Var, context, null);
                                                aVar5.r(objY3);
                                            }
                                            xvf.e(aVar5, unit, (Function2) objY3);
                                            boolean z = n32Var.a == f4x.i;
                                            boolean zA2 = aVar5.A(n32Var);
                                            Object objY4 = aVar5.y();
                                            if (zA2 || objY4 == c0042a) {
                                                objY4 = new b1y(n32Var);
                                                aVar5.r(objY4);
                                            }
                                            r2y.d(v3a0Var3, h0sVarA, z, function8, function7, (Function1) ((chp) objY4), aVar5, 70);
                                            return unit;
                                        }
                                    }, true), 254);
                                    hhx.b(ghxVar, "PROMOTIONS", null, new op8(317533695, new iaj() { // from class: q0y
                                        @Override // defpackage.iaj
                                        public final Object d(Object obj5, Object obj6, Object obj7, Object obj8) {
                                            a aVar5 = (a) obj7;
                                            ((Integer) obj8).getClass();
                                            ((pf0) obj5).getClass();
                                            ((ifx) obj6).getClass();
                                            w8i0 w8i0VarA = zdt.a(aVar5);
                                            if (w8i0VarA == null) {
                                                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                                return null;
                                            }
                                            n32 n32Var = (n32) p8i0.a(jq40.a(p3x.class), w8i0VarA, null, cll.a(w8i0VarA, aVar5), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, aVar5);
                                            h0s h0sVarA = k0s.a(n32Var.i, aVar5);
                                            Context context = (Context) aVar5.O(AndroidCompositionLocals_androidKt.b);
                                            Unit unit = Unit.a;
                                            boolean zA = aVar5.A(n32Var) | aVar5.A(context);
                                            Object objY3 = aVar5.y();
                                            a.C0041a.C0042a c0042a = a.C0041a.a;
                                            if (zA || objY3 == c0042a) {
                                                objY3 = new a1y(n32Var, context, null);
                                                aVar5.r(objY3);
                                            }
                                            xvf.e(aVar5, unit, (Function2) objY3);
                                            boolean z = n32Var.a == f4x.i;
                                            boolean zA2 = aVar5.A(n32Var);
                                            Object objY4 = aVar5.y();
                                            if (zA2 || objY4 == c0042a) {
                                                objY4 = new b1y(n32Var);
                                                aVar5.r(objY4);
                                            }
                                            r2y.d(v3a0Var3, h0sVarA, z, function8, function7, (Function1) ((chp) objY4), aVar5, 70);
                                            return unit;
                                        }
                                    }, true), 254);
                                    hhx.b(ghxVar, "MESSAGE", null, new op8(1412360128, new iaj() { // from class: r0y
                                        @Override // defpackage.iaj
                                        public final Object d(Object obj5, Object obj6, Object obj7, Object obj8) {
                                            a aVar5 = (a) obj7;
                                            ((Integer) obj8).getClass();
                                            ((pf0) obj5).getClass();
                                            ((ifx) obj6).getClass();
                                            w8i0 w8i0VarA = zdt.a(aVar5);
                                            if (w8i0VarA == null) {
                                                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                                return null;
                                            }
                                            n32 n32Var = (n32) p8i0.a(jq40.a(l3x.class), w8i0VarA, null, cll.a(w8i0VarA, aVar5), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, aVar5);
                                            h0s h0sVarA = k0s.a(n32Var.i, aVar5);
                                            Context context = (Context) aVar5.O(AndroidCompositionLocals_androidKt.b);
                                            Unit unit = Unit.a;
                                            boolean zA = aVar5.A(n32Var) | aVar5.A(context);
                                            Object objY3 = aVar5.y();
                                            a.C0041a.C0042a c0042a = a.C0041a.a;
                                            if (zA || objY3 == c0042a) {
                                                objY3 = new a1y(n32Var, context, null);
                                                aVar5.r(objY3);
                                            }
                                            xvf.e(aVar5, unit, (Function2) objY3);
                                            boolean z = n32Var.a == f4x.i;
                                            boolean zA2 = aVar5.A(n32Var);
                                            Object objY4 = aVar5.y();
                                            if (zA2 || objY4 == c0042a) {
                                                objY4 = new b1y(n32Var);
                                                aVar5.r(objY4);
                                            }
                                            r2y.d(v3a0Var3, h0sVarA, z, function8, function7, (Function1) ((chp) objY4), aVar5, 70);
                                            return unit;
                                        }
                                    }, true), 254);
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY2);
                        }
                        uix.c(phxVarC, strName, dVarE2, null, null, null, null, null, (Function1) objY2, aVar2, 384, 1016);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 805309488, 309);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function1, function2, function3, function4, i) { // from class: u0y
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function1 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    c1y.a(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
