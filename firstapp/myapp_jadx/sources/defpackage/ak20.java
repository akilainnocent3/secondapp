package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.prematch.stateholder.PreMatchSectionViewModel$collectPreMatchEventsLoadedFlow$2", f = "PreMatchSectionViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ak20 extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public final /* synthetic */ jk20 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak20(jk20 jk20Var, v1b<? super ak20> v1bVar) {
        super(2, v1bVar);
        this.a = jk20Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ak20(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((ak20) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.H1();
        return Unit.a;
    }
}
