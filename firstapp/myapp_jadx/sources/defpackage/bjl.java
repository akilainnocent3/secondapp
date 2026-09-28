package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.sportynews.groupieitem.HeroArticle$bind$1$3", f = "HeroArticle.kt", l = {}, m = "invokeSuspend", v = 2)
public final class bjl extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ peb0 a;
    public final /* synthetic */ nan b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bjl(peb0 peb0Var, nan nanVar, v1b<? super bjl> v1bVar) {
        super(2, v1bVar);
        this.a = peb0Var;
        this.b = nanVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bjl(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bjl) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Context context = this.a.a.getContext();
        context.getClass();
        qw90.a(context).a(this.b);
        return Unit.a;
    }
}
