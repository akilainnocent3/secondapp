package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.EventInRound;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d7v {
    public static final void a(String str, final String str2, a aVar, final int i) {
        final String str3 = str;
        b bVarI = aVar.i(-399694559);
        int i2 = i | (bVarI.M(str3) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new w6v(0);
                bVarI.r(objY);
            }
            d.a aVar2 = d.a.b;
            d dVarB = xa80.b(aVar2, false, (Function1) objY);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            lkf0.d(str2, g3w.h(aVar2, "match_header_away_team"), ((lib0) bVarI.O(oib0.a)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).i, bVarI, ((i2 >> 3) & 14) | 48, 0, 131064);
            str3 = str;
            bVarI = bVarI;
            mw90.a(str3, null, h.j(j.r(aVar2, 20.0f), 4.0f, 0.0f, 0.0f, 0.0f, 14), null, null, null, null, bVarI, (i2 & 14) | 432, 2040);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str3, str2, i) { // from class: x6v
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    d7v.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final String str, String str2, a aVar, final int i) {
        final String str3;
        b bVarI = aVar.i(-1114918830);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new a7v();
                bVarI.r(objY);
            }
            d.a aVar2 = d.a.b;
            d dVarB = xa80.b(aVar2, false, (Function1) objY);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            mw90.a(str, null, j.r(aVar2, 20.0f), null, null, null, null, bVarI, (i2 & 14) | 432, 2040);
            str3 = str2;
            lkf0.d(str3, g3w.h(h.j(aVar2, 4.0f, 0.0f, 0.0f, 0.0f, 14), "match_header_home_team"), ((lib0) bVarI.O(oib0.a)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).i, bVarI, ((i2 >> 3) & 14) | 48, 0, 131064);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            str3 = str2;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, str3, i) { // from class: b7v
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    d7v.b(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final String str, final String str2, a aVar, final int i) {
        b bVarI = aVar.i(1950546170);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            d dVarJ = h.j(aVar2, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            qyd0 qyd0Var = oib0.a;
            d dVarG = h.g(androidx.compose.foundation.a.b(dVarJ, ((lib0) bVarI.O(qyd0Var)).r0, j060.c(24.0f)), 6.0f, 4.0f);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new y6v();
                bVarI.r(objY);
            }
            d dVarB = xa80.b(dVarG, false, (Function1) objY);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            mw90.a(str2, null, j.r(aVar2, 14.0f), null, null, null, null, bVarI, ((i2 >> 3) & 14) | 432, 2040);
            lkf0.d(str, g3w.h(h.j(aVar2, 4.0f, 0.0f, 0.0f, 0.0f, 14), "match_header_league"), ((lib0) bVarI.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).q, bVarI, (i2 & 14) | 48, 0, 131064);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, str2, i) { // from class: z6v
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    d7v.c(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final EventInRound eventInRound, a aVar, final int i) {
        int i2;
        b bVar;
        b bVarI = aVar.i(287905228);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(eventInRound) : bVarI.A(eventInRound) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            float f = doc.a(bVarI) ? 4.0f : 6.0f;
            d.a aVar2 = d.a.b;
            d dVarI = h.i(aVar2, 8.0f, f, 8.0f, 2.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarI);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            String str = eventInRound.homeTeamLogo;
            String str2 = eventInRound.homeTeamName;
            if (str2 == null) {
                str2 = "";
            }
            b(str, str2, bVarI, 0);
            lkf0.d(cb40.a(R.string.bet_history__vs, new Object[0], bVarI), h.h(aVar2, 4.0f, 0.0f, 2), ((lib0) bVarI.O(oib0.a)).b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).i, bVarI, 48, 0, 131064);
            bVar = bVarI;
            String str3 = eventInRound.awayTeamLogo;
            String str4 = eventInRound.awayTeamName;
            if (str4 == null) {
                str4 = "";
            }
            a(str3, str4, bVar, 0);
            String str5 = eventInRound.leagueName;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = eventInRound.leagueUrl;
            if (str6 == null) {
                str6 = "";
            }
            c(str5, str6, bVar, 0);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: c7v
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    d7v.d(eventInRound, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
