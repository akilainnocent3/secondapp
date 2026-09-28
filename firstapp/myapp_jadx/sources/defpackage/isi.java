package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.foryou.presentation.ForYouFeedViewModel$onShareCode$3", f = "ForYouFeedViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class isi extends tje0 implements Function2<myh<? super uha0>, v1b<? super Unit>, Object> {
    public final /* synthetic */ bsi a;
    public final /* synthetic */ kl00 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isi(bsi bsiVar, kl00 kl00Var, v1b<? super isi> v1bVar) {
        super(2, v1bVar);
        this.a = bsiVar;
        this.b = kl00Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new isi(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super uha0> myhVar, v1b<? super Unit> v1bVar) {
        return ((isi) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.C1(this.b, new hsi(0));
        return Unit.a;
    }
}
