package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.swipebet.viewmodel.SwipeBetViewModel$onLoadMore$3", f = "SwipeBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class lle0 extends tje0 implements gaj<myh<? super List<? extends Event>>, Throwable, v1b<? super Unit>, Object> {
    public final /* synthetic */ ile0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lle0(ile0 ile0Var, v1b<? super lle0> v1bVar) {
        super(3, v1bVar);
        this.a = ile0Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super List<? extends Event>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        return new lle0(this.a, v1bVar).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.e.m(new kqc());
        return Unit.a;
    }
}
