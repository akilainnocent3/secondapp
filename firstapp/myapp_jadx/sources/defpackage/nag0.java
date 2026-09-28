package defpackage;

import com.sportygames.campaign.presentation.TournamentBannerConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.campaign.presentation.TournamentKt$Tournament$17$1", f = "Tournament.kt", l = {}, m = "invokeSuspend", v = 1)
public final class nag0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ Function1<Boolean, Unit> a;
    public final /* synthetic */ ytw<TournamentBannerConfig> b;
    public final /* synthetic */ ytw<TournamentBannerConfig> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public nag0(Function1<? super Boolean, Unit> function1, ytw<TournamentBannerConfig> ytwVar, ytw<TournamentBannerConfig> ytwVar2, v1b<? super nag0> v1bVar) {
        super(2, v1bVar);
        this.a = function1;
        this.b = ytwVar;
        this.c = ytwVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new nag0(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((nag0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        hfs hfsVar = kag0.a;
        this.a.invoke(Boolean.valueOf((this.b.getValue() == null && this.c.getValue() == null) ? false : true));
        return Unit.a;
    }
}
