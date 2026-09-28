package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.network.SocialNetworkFollowScreenKt$SocialNetworkFollowScreen$10$1", f = "SocialNetworkFollowScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class lca0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ h0s<d9a0> a;
    public final /* synthetic */ ytw<Boolean> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lca0(h0s<d9a0> h0sVar, ytw<Boolean> ytwVar, v1b<? super lca0> v1bVar) {
        super(2, v1bVar);
        this.a = h0sVar;
        this.b = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new lca0(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((lca0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        h0s<d9a0> h0sVar = this.a;
        if (h0sVar.d().f || h0sVar.d().g || h0sVar.c() != 0) {
            this.b.setValue(Boolean.TRUE);
        }
        return Unit.a;
    }
}
