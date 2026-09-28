package defpackage;

import com.sporty.android.core.model.worldcuptournament.WorldCupTournamentPageGroup;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a7k0 extends saj implements Function1<String, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String groupTournamentId;
        String str2 = str;
        str2.getClass();
        f7k0 f7k0Var = (f7k0) this.receiver;
        f7k0Var.getClass();
        WorldCupTournamentPageGroup worldCupTournamentPageGroup = f7k0Var.w.get(str2);
        if (worldCupTournamentPageGroup != null && (groupTournamentId = worldCupTournamentPageGroup.getGroupTournamentId()) != null) {
            f7k0Var.i.f(wae.TOURNAMENT_HOST, b.k(new Pair("sportId", "sr:sport:1"), new Pair("tournamentId", groupTournamentId)));
            f7k0Var.v.a.a(new qw2(0), k00.d);
        }
        return Unit.a;
    }
}
