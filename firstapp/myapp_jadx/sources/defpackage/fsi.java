package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.foryou.presentation.ForYouFeedViewModel$onShareCode$1", f = "ForYouFeedViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class fsi extends tje0 implements Function2<Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ bsi b;
    public final /* synthetic */ kl00 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsi(bsi bsiVar, kl00 kl00Var, v1b<? super fsi> v1bVar) {
        super(2, v1bVar);
        this.b = bsiVar;
        this.c = kl00Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        fsi fsiVar = new fsi(this.b, this.c, v1bVar);
        fsiVar.a = obj;
        return fsiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Throwable th, v1b<? super Unit> v1bVar) {
        return ((fsi) create(th, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = (Throwable) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        SprThrowable sprThrowable = (SprThrowable) (!(th instanceof SprThrowable) ? null : th);
        wuw<qqi> wuwVar = this.b.B;
        kl00 kl00Var = this.c;
        qqi.h hVar = new qqi.h(kl00Var.g, new z7a0.d(kl00Var.a, false, null, sprThrowable != null ? new Integer(sprThrowable.getD()) : null, sprThrowable != null ? sprThrowable.getE() : null, th, 6));
        wuwVar.getClass();
        wuwVar.a.c(hVar);
        return Unit.a;
    }
}
