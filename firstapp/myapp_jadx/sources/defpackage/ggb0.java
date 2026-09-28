package defpackage;

import com.sporty.android.book.domain.entity.Tournament;
import com.sporty.android.book.domain.entity.UIState;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.book.presentation.sportsmenu.SportsMenuViewModel$toggleTournamentFavorite$1", f = "SportsMenuViewModel.kt", l = {225}, m = "invokeSuspend", v = 2)
public final class ggb0 extends tje0 implements Function2<Unit, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ dgb0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Tournament d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggb0(dgb0 dgb0Var, boolean z, Tournament tournament, v1b<? super ggb0> v1bVar) {
        super(2, v1bVar);
        this.b = dgb0Var;
        this.c = z;
        this.d = tournament;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ggb0(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, v1b<? super Unit> v1bVar) {
        return ((ggb0) create(unit, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            boolean z = this.c;
            Tournament tournament = this.d;
            dgb0 dgb0Var = this.b;
            dgb0Var.y = z ? CollectionsKt.g0(dgb0Var.y, tournament.getId()) : CollectionsKt.j0(dgb0Var.y, tournament.getId());
            dgb0Var.A1();
            b390 b390Var = dgb0Var.N;
            UIState.Success success = new UIState.Success(new Pair(tournament, Boolean.valueOf(!z)));
            this.a = 1;
            if (b390Var.emit(success, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
