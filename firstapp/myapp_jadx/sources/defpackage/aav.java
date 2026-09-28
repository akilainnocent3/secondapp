package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.dedicatedteampage.team.ui.components.MatchesSectionKt$MatchesSection$5$1", f = "MatchesSection.kt", l = {}, m = "invokeSuspend", v = 2)
public final class aav extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ Function0<Unit> a;
    public final /* synthetic */ twd0<Boolean> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aav(Function0<Unit> function0, twd0<Boolean> twd0Var, v1b<? super aav> v1bVar) {
        super(2, v1bVar);
        this.a = function0;
        this.b = twd0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new aav(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((aav) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (this.b.getValue().booleanValue()) {
            this.a.invoke();
        }
        return Unit.a;
    }
}
