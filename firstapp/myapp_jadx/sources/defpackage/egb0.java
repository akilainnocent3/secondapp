package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sporty.android.book.presentation.sportsmenu.SportsMenuViewModel$getFavoriteTournaments$1", f = "SportsMenuViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class egb0 extends tje0 implements Function2<List<? extends String>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ dgb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egb0(dgb0 dgb0Var, v1b<? super egb0> v1bVar) {
        super(2, v1bVar);
        this.b = dgb0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        egb0 egb0Var = new egb0(this.b, v1bVar);
        egb0Var.a = obj;
        return egb0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends String> list, v1b<? super Unit> v1bVar) {
        return ((egb0) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List<String> list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        dgb0 dgb0Var = this.b;
        dgb0Var.y = list;
        dgb0Var.A1();
        return Unit.a;
    }
}
