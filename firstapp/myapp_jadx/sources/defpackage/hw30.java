package defpackage;

import com.sportygames.commons.SportyGamesManager;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.views.RainV2Fragment$observeRainSocket$1$1", f = "RainV2Fragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class hw30 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ gw30 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw30(gw30 gw30Var, v1b<? super hw30> v1bVar) {
        super(2, v1bVar);
        this.a = gw30Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new hw30(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((hw30) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String lowerCase;
        String country;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        gw30 gw30Var = this.a;
        if (!gw30Var.c) {
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
            String str = gw30Var.d;
            String str2 = str != null ? str : "";
            lw30VarN0.getClass();
            ej5.c(o8i0.d(lw30VarN0), null, null, new ow30(lw30VarN0, lowerCase, str2, null), 3);
        }
        gw30Var.z = false;
        gw30Var.w = false;
        gw30Var.A = false;
        return Unit.a;
    }
}
