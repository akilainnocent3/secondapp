package defpackage;

import com.sporty.android.core.model.bookingcode.BookingCodeFilterDto;
import com.sporty.android.core.model.worldcuptournament.WorldCupTeam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.codehub.viewmodel.CodeHubViewmodel$observeWorldCupSelectedTeamChanges$1", f = "CodeHubViewmodel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class uz7 extends tje0 implements Function2<WorldCupTeam, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ mz7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz7(mz7 mz7Var, v1b<? super uz7> v1bVar) {
        super(2, v1bVar);
        this.b = mz7Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        uz7 uz7Var = new uz7(this.b, v1bVar);
        uz7Var.a = obj;
        return uz7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WorldCupTeam worldCupTeam, v1b<? super Unit> v1bVar) {
        return ((uz7) create(worldCupTeam, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        WorldCupTeam worldCupTeam = (WorldCupTeam) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        BookingCodeFilterDto bookingCodeFilterDto = mz7.h0;
        mz7 mz7Var = this.b;
        if (mz7Var.z1(worldCupTeam) && mz7Var.g0) {
            mz7Var.C1();
        }
        return Unit.a;
    }
}
