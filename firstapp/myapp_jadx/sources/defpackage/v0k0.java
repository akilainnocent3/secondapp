package defpackage;

import com.sporty.android.core.model.bookingcode.BookingCodeInfoDto;
import com.sporty.android.core.model.worldcuptournament.WorldCupTeam;
import com.sportybet.feature.worldcup.config.domain.model.WorldCupTournamentConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.worldcuptournament.presentation.WorldCupPanelViewModel$loadSpecials$1", f = "WorldCupPanelViewModel.kt", l = {226}, m = "invokeSuspend", v = 2)
public final class v0k0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ t0k0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0k0(t0k0 t0k0Var, v1b<? super v0k0> v1bVar) {
        super(2, v1bVar);
        this.b = t0k0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new v0k0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((v0k0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String countryCode;
        Object objA;
        y5b y5bVar = y5b.a;
        int i = this.a;
        t0k0 t0k0Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            ehk ehkVar = t0k0Var.c;
            WorldCupTournamentConfig worldCupTournamentConfig = t0k0Var.D;
            if (worldCupTournamentConfig == null) {
                Intrinsics.n("config");
                throw null;
            }
            String tournamentId = worldCupTournamentConfig.getTournamentId();
            WorldCupTeam worldCupTeamA1 = t0k0Var.A1();
            if (worldCupTeamA1 == null || (countryCode = worldCupTeamA1.getCountryCode()) == null) {
                countryCode = "";
            }
            this.a = 1;
            objA = ehkVar.a(20, this, tournamentId, countryCode);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objA = ((zi50) obj).a;
        }
        if (zi50.a(objA) == null) {
            List<BookingCodeInfoDto> list = (List) objA;
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            for (BookingCodeInfoDto bookingCodeInfoDto : list) {
                arrayList.add(kz4.d(bookingCodeInfoDto, false, false, bookingCodeInfoDto.isBetBuilder() ? 76 : 120, null, null, null, 487));
            }
            t0k0Var.I = arrayList;
            t0k0Var.L1();
        } else {
            t0k0Var.K1(f1k0.a);
        }
        return Unit.a;
    }
}
