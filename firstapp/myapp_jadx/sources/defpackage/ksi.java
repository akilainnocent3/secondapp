package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.foryou.presentation.ForYouFeedViewModel$onShareCode$4", f = "ForYouFeedViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ksi extends tje0 implements gaj<myh<? super uha0>, Throwable, v1b<? super Unit>, Object> {
    public final /* synthetic */ bsi a;
    public final /* synthetic */ kl00 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ksi(bsi bsiVar, kl00 kl00Var, v1b<? super ksi> v1bVar) {
        super(3, v1bVar);
        this.a = bsiVar;
        this.b = kl00Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super uha0> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        return new ksi(this.a, this.b, v1bVar).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.C1(this.b, new jsi(0));
        return Unit.a;
    }
}
