package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.home.CenterTabViewModel$init$2", f = "CenterTabViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class nv6 extends tje0 implements Function2<jox<? extends iv6>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ov6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv6(ov6 ov6Var, v1b<? super nv6> v1bVar) {
        super(2, v1bVar);
        this.b = ov6Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        nv6 nv6Var = new nv6(this.b, v1bVar);
        nv6Var.a = obj;
        return nv6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(jox<? extends iv6> joxVar, v1b<? super Unit> v1bVar) {
        return ((nv6) create(joxVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        jox<iv6> joxVar = (jox) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.c.m(joxVar);
        return Unit.a;
    }
}
