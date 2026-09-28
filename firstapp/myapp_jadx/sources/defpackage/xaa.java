package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class xaa {
    public static final void a(final Context context, final String str, final lcg lcgVar, final Function0<Unit> function0, final boolean z, a aVar, final int i) {
        String str2 = lcgVar.b;
        context.getClass();
        str.getClass();
        function0.getClass();
        b bVarI = aVar.i(1980172725);
        int i2 = i | (bVarI.A(context) ? 4 : 2) | (bVarI.M(str) ? 32 : 16) | (bVarI.M(lcgVar) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024) | (bVarI.b(z) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            boolean zM = bVarI.M(str2);
            Object objY = bVarI.y();
            if (zM || objY == a.C0041a.a) {
                objY = Boolean.valueOf(Intrinsics.g(str2, context.getString(R.string.label_dialog_add_money)));
                bVarI.r(objY);
            }
            final boolean zBooleanValue = ((Boolean) objY).booleanValue();
            if (z) {
                bVarI.N(-49732376);
                u60.a(function0, new yle(false, false, false), pp8.b(2101541991, new Function2() { // from class: paa
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        final lcg lcgVar2 = lcgVar;
                        String str3 = lcgVar2.a;
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            d.a aVar3 = d.a.b;
                            d dVarE = j.e(aVar3, 1.0f);
                            long jD = r58.d(2281701376L);
                            zk40.a aVar4 = zk40.a;
                            d dVarH = h.h(androidx.compose.foundation.a.b(dVarE, jD, aVar4), 16.0f, 0.0f, 2);
                            n54 n54Var = ht.a.e;
                            aiv aivVarC = g75.c(n54Var, false);
                            int iHashCode = Long.hashCode(aVar2.m());
                            ne00 ne00VarO = aVar2.o();
                            d dVarC = c.c(aVar2, dVarH);
                            yka.k.getClass();
                            tsr.a aVar5 = yka.a.b;
                            if (aVar2.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar5);
                            } else {
                                aVar2.p();
                            }
                            yka.a.b bVar = yka.a.f;
                            hlh0.a(aVar2, aivVarC, bVar);
                            yka.a.d dVar = yka.a.e;
                            hlh0.a(aVar2, ne00VarO, dVar);
                            yka.a.C1350a c1350a = yka.a.g;
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                            }
                            yka.a.c cVar = yka.a.d;
                            hlh0.a(aVar2, dVarC, cVar);
                            d dVarA = ls7.a(aVar3, j060.c(16.0f));
                            long j = j58.f;
                            d dVarJ = h.j(androidx.compose.foundation.a.b(dVarA, j, aVar4), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                            i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar2, 48);
                            int iHashCode2 = Long.hashCode(aVar2.m());
                            ne00 ne00VarO2 = aVar2.o();
                            d dVarC2 = c.c(aVar2, dVarJ);
                            if (aVar2.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar5);
                            } else {
                                aVar2.p();
                            }
                            hlh0.a(aVar2, i78VarA, bVar);
                            hlh0.a(aVar2, ne00VarO2, dVar);
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                                j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                            }
                            hlh0.a(aVar2, dVarC2, cVar);
                            op5 op5Var = op5.a;
                            Context context2 = context;
                            HashMap mapA = pcg.a(context2);
                            String str4 = lcgVar2.b;
                            String str5 = (String) mapA.get(str3);
                            if (str5 == null) {
                                str5 = "";
                            }
                            op5Var.getClass();
                            String strB = op5.b(str5, str3, null);
                            qyd0 qyd0Var = ni60.b;
                            wf1.a(strB, h.j(j.g(aVar3, 1.0f), 48.0f, 0.0f, 48.0f, 24.0f, 2), imf0.b(ni60.g(((sfd0) aVar2.O(qyd0Var)).c, R.dimen._12ssp, aVar2), 0L, 0L, null, null, null, 0L, null, null, null, 0, d2l.f(25), null, null, 16646143), 3, 0L, null, 3, null, r58.d(4280361249L), aVar2, 100666368, 176);
                            d dVarB = androidx.compose.foundation.a.b(j.k(ls7.a(j.g(aVar3, 1.0f), j060.d(0.0f, 0.0f, 16.0f, 16.0f)), 52.0f, 0.0f, 2), lcgVar2.e, aVar4);
                            final String str6 = str;
                            boolean zM2 = aVar2.M(str6) | aVar2.M(lcgVar2);
                            final Function0 function1 = function0;
                            boolean zM3 = zM2 | aVar2.M(function1);
                            Object objY2 = aVar2.y();
                            a.C0041a.C0042a c0042a = a.C0041a.a;
                            if (zM3 || objY2 == c0042a) {
                                objY2 = new Function0() { // from class: taa
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        lcg lcgVar3 = lcgVar2;
                                        xaa.b(str6, lcgVar3.b);
                                        lcgVar3.c.invoke();
                                        function1.invoke();
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY2);
                            }
                            d dVarD = androidx.compose.foundation.d.d(dVarB, false, null, null, (Function0) objY2, 15);
                            aiv aivVarC2 = g75.c(n54Var, false);
                            int iHashCode3 = Long.hashCode(aVar2.m());
                            ne00 ne00VarO3 = aVar2.o();
                            d dVarC3 = c.c(aVar2, dVarD);
                            if (aVar2.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar5);
                            } else {
                                aVar2.p();
                            }
                            hlh0.a(aVar2, aivVarC2, bVar);
                            hlh0.a(aVar2, ne00VarO3, dVar);
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode3))) {
                                j3c.a(iHashCode3, aVar2, iHashCode3, c1350a);
                            }
                            hlh0.a(aVar2, dVarC3, cVar);
                            String str7 = (String) pcg.a(context2).get(str4);
                            if (str7 == null) {
                                str7 = "";
                            }
                            lkf0.b(op5.b(str7, str4, null), null, j, 0L, null, null, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, ni60.d(((sfd0) aVar2.O(qyd0Var)).c), aVar2, 384, 0, 65018);
                            a aVar6 = aVar2;
                            aVar6.s();
                            aVar6.s();
                            if (zBooleanValue) {
                                aVar6.N(1732808526);
                                d dVarJ2 = h.j(androidx.compose.foundation.layout.d.a.b(aVar3, ht.a.h), 0.0f, 0.0f, 0.0f, 32.0f, 7);
                                boolean zM4 = aVar6.M(str6) | aVar6.M(lcgVar2) | aVar6.M(function1);
                                Object objY3 = aVar6.y();
                                if (zM4 || objY3 == c0042a) {
                                    objY3 = new Function0() { // from class: vaa
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            xaa.b(str6, AnalyticsParam.STORY_SKIP_REASON_CLOSE);
                                            lcgVar2.d.invoke();
                                            function1.invoke();
                                            return Unit.a;
                                        }
                                    };
                                    aVar6.r(objY3);
                                }
                                ayh.a((Function0) objY3, dVarJ2, null, j, 0L, null, ev8.a, aVar6, 12585984, 116);
                                aVar6 = aVar6;
                            } else {
                                aVar6.N(1727810613);
                            }
                            aVar6.H();
                            aVar6.s();
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, ((i2 >> 9) & 14) | 432, 0);
            } else {
                bVarI.N(-51858387);
            }
            bVarI.X(false);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(context, str, lcgVar, function0, z, i) { // from class: raa
                public final /* synthetic */ Context a;
                public final /* synthetic */ String b;
                public final /* synthetic */ lcg c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ boolean e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    xaa.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(String str, String str2) {
        zj60 bridge;
        String str3 = SportyGamesManager.getInstance().getUser() != null ? "logged-in" : "non logged-in";
        Bundle bundleA = whs.a("popup_name", AnalyticsEvent.BI_TRACKING_KIND_ERROR, "button_name", str2);
        bundleA.putString(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, str);
        bundleA.putString("user_state", str3);
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        if (sportyGamesManager == null || (bridge = sportyGamesManager.getBridge()) == null) {
            return;
        }
        ((bk60) bridge).a("popup_action", bundleA);
    }
}
