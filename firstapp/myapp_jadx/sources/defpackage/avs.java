package defpackage;

import com.sportybet.plugin.realsports.live.livetournament.LiveTournamentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.live.livetournament.LiveTournamentActivity$updateSubscribers$1", f = "LiveTournamentActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class avs extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ LiveTournamentActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avs(LiveTournamentActivity liveTournamentActivity, v1b<? super avs> v1bVar) {
        super(2, v1bVar);
        this.a = liveTournamentActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new avs(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((avs) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        int i = LiveTournamentActivity.I;
        this.a.D1().C1();
        return Unit.a;
    }
}
