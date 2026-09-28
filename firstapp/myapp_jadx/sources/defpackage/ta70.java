package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ta70 {
    public static final void a(final String str, String str2, a aVar, final int i) {
        final String str3;
        b bVar;
        b bVarI = aVar.i(272265191);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            d dVarI = h.i(j.b(j.g(aVar2, 1.0f), 0.0f, 47.0f, 1), 12.0f, 15.0f, 12.0f, 12.0f);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new pa70();
                bVarI.r(objY);
            }
            d dVarB = xa80.b(dVarI, false, (Function1) objY);
            d160 d160VarA = b160.a(kw0.g, ht.a.k, bVarI, 54);
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
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            n54.a aVar4 = ht.a.n;
            kw0.i iVar = new kw0.i(4.0f, true, new iw0(aVar4));
            n54.b bVar3 = ht.a.j;
            d160 d160VarA2 = b160.a(iVar, bVar3, bVarI, 6);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            String strA = cb40.a(R.string.bet_history__stake, new Object[0], bVarI);
            qyd0 qyd0Var = oib0.a;
            long j = ((lib0) bVarI.O(qyd0Var)).a;
            qyd0 qyd0Var2 = kjb0.a;
            lkf0.d(strA, null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).j, bVarI, 0, 0, 131066);
            lkf0.d(str, g3w.h(aVar2, "stake_text"), ((lib0) bVarI.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).i, bVarI, (i2 & 14) | 48, 0, 131064);
            bVarI.X(true);
            d160 d160VarA3 = b160.a(new kw0.i(4.0f, true, new iw0(aVar4)), bVar3, bVarI, 6);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA3, bVar2);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            lkf0.d(cb40.a(R.string.component_betslip__to_win, new Object[0], bVarI), null, ((lib0) bVarI.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).j, bVarI, 0, 0, 131066);
            str3 = str2;
            lkf0.d(str3, g3w.h(aVar2, "winning_amount_text"), ((lib0) bVarI.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).i, bVarI, ((i2 >> 3) & 14) | 48, 0, 131064);
            bVar = bVarI;
            bVar.X(true);
            bVar.X(true);
        } else {
            str3 = str2;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, str3, i) { // from class: qa70
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ta70.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final ResourceUiText resourceUiText, final UiText uiText, a aVar, final int i) {
        b bVar;
        b bVarI = aVar.i(1075612341);
        int i2 = i | (bVarI.M(resourceUiText) ? 4 : 2) | (bVarI.M(uiText) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            d dVarF = h.f(j.b(j.g(aVar2, 1.0f), 0.0f, 62.0f, 1), 12.0f);
            i78 i78VarA = g78.a(new kw0.i(2.0f, false, new jw0(ht.a.k)), ht.a.m, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
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
            qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
            String strG = resourceUiText.g((Context) bVarI.O(qyd0Var));
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new ra70();
                bVarI.r(objY);
            }
            d dVarH = g3w.h(xa80.b(aVar2, false, (Function1) objY), "ticket_number_text");
            qyd0 qyd0Var2 = oib0.a;
            long j = ((lib0) bVarI.O(qyd0Var2)).b;
            qyd0 qyd0Var3 = kjb0.a;
            lkf0.d(strG, dVarH, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var3)).n, bVarI, 0, 0, 131064);
            uiText.getClass();
            lkf0.d(uiText.g((Context) bVarI.O(qyd0Var)), null, ((lib0) bVarI.O(qyd0Var2)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var3)).j, bVarI, 0, 0, 131066);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(uiText, i) { // from class: sa70
                public final /* synthetic */ UiText b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ta70.b(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final ua70 ua70Var, final Function1<? super String, Unit> function1, final Function0<Unit> function0, a aVar, final int i) {
        ua70Var.getClass();
        function1.getClass();
        function0.getClass();
        b bVarI = aVar.i(1445317380);
        int i2 = (bVarI.A(ua70Var) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d dVarA = ls7.a(j.g(d.a.b, 1.0f), j060.c(((zib0) bVarI.O(ajb0.a)).d));
            qyd0 qyd0Var = oib0.a;
            d dVarB = androidx.compose.foundation.a.b(dVarA, ((lib0) bVarI.O(qyd0Var)).i0, zk40.a);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new na70();
                bVarI.r(objY);
            }
            d dVarH = g3w.h(xa80.b(dVarB, false, (Function1) objY), "cell");
            i78 i78VarA = g78.a(kw0.e, ht.a.m, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
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
            b(ua70Var.a, ua70Var.b, bVarI, 0);
            ute.b(null, ((qhb0) bVarI.O(shb0.a)).a, ((lib0) bVarI.O(qyd0Var)).A, bVarI, 0, 1);
            bVarI.N(-1411720500);
            Iterator<sc70> it = ua70Var.c.iterator();
            while (it.hasNext()) {
                qc70.a(it.next(), function1, function0, bVarI, (i2 & 112) | 8 | (i2 & 896));
                ute.b(null, ((qhb0) bVarI.O(shb0.a)).a, ((lib0) bVarI.O(oib0.a)).A, bVarI, 0, 1);
            }
            bVarI.X(false);
            a(ua70Var.d, ua70Var.e, bVarI, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, function0, i) { // from class: oa70
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(9);
                    ta70.c(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
