package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.swipebet.viewmodel.SwipeBetViewModel$onLoadMore$1", f = "SwipeBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jle0 extends tje0 implements Function2<myh<? super List<? extends Event>>, v1b<? super Unit>, Object> {
    public final /* synthetic */ ile0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jle0(ile0 ile0Var, v1b<? super jle0> v1bVar) {
        super(2, v1bVar);
        this.a = ile0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new jle0(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super List<? extends Event>> myhVar, v1b<? super Unit> v1bVar) {
        return ((jle0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.e.m(new lqc());
        return Unit.a;
    }
}
