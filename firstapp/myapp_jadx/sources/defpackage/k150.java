package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.sportynews.groupieitem.RelatedArticle$bind$1$2", f = "RelatedArticle.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k150 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ueb0 a;
    public final /* synthetic */ nan b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k150(ueb0 ueb0Var, nan nanVar, v1b<? super k150> v1bVar) {
        super(2, v1bVar);
        this.a = ueb0Var;
        this.b = nanVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new k150(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((k150) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
