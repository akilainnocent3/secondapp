package defpackage;

import com.sportygames.commons.SportyGamesManager;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.views.RainV2Fragment$observeRainSocket$1$2", f = "RainV2Fragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class iw30 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ gw30 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw30(gw30 gw30Var, v1b<? super iw30> v1bVar) {
        super(2, v1bVar);
        this.a = gw30Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new iw30(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((iw30) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String lowerCase;
        String country;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        gw30 gw30Var = this.a;
        String str = gw30Var.d;
        if (str == null || str.length() == 0) {
            gw30Var.o0();
            gw30Var.r0();
            oxi oxiVar = gw30Var.a;
            if (oxiVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            oxiVar.b.setVisibility(8);
            oxi oxiVar2 = gw30Var.a;
            if (oxiVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            oxiVar2.N.setVisibility(8);
            oxi oxiVar3 = gw30Var.a;
            if (oxiVar3 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            oxiVar3.Q.setVisibility(8);
            oxi oxiVar4 = gw30Var.a;
            if (oxiVar4 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            oxiVar4.P.setVisibility(8);
            oxi oxiVar5 = gw30Var.a;
            if (oxiVar5 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            oxiVar5.R.setVisibility(0);
            oxi oxiVar6 = gw30Var.a;
            if (oxiVar6 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            oxiVar6.O.setVisibility(8);
            oxi oxiVar7 = gw30Var.a;
            if (oxiVar7 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            oxiVar7.V.setVisibility(8);
            oxi oxiVar8 = gw30Var.a;
            if (oxiVar8 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            oxiVar8.W.setVisibility(0);
        } else {
            lw30 lw30VarN0 = gw30Var.n0();
            SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
            if (sportyGamesManager == null || (country = sportyGamesManager.getCountry()) == null) {
                lowerCase = null;
            } else {
                lowerCase = country.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            }
            if (lowerCase == null) {
                lowerCase = "";
            }
            String str2 = gw30Var.d;
            String str3 = str2 != null ? str2 : "";
            lw30VarN0.getClass();
            ej5.c(o8i0.d(lw30VarN0), null, null, new pw30(lw30VarN0, lowerCase, str3, null), 3);
        }
        return Unit.a;
    }
}
