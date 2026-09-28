package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.PersonalCodeViewModel$onAddCode$1", f = "PersonalCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class qk00 extends tje0 implements Function2<Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ el00 b;
    public final /* synthetic */ kl00 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk00(v1b v1bVar, el00 el00Var, kl00 kl00Var) {
        super(2, v1bVar);
        this.b = el00Var;
        this.c = kl00Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        qk00 qk00Var = new qk00(v1bVar, this.b, this.c);
        qk00Var.a = obj;
        return qk00Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Throwable th, v1b<? super Unit> v1bVar) {
        return ((qk00) create(th, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = (Throwable) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        SprThrowable sprThrowable = (SprThrowable) (!(th instanceof SprThrowable) ? null : th);
        wuw<z7a0> wuwVar = this.b.z;
        String str = this.c.a;
        g08 g08Var = g08.UNKNOWN;
        z7a0.a aVar = new z7a0.a(str, null, sprThrowable != null ? new Integer(sprThrowable.getD()) : null, sprThrowable != null ? sprThrowable.getE() : null, th, null, 138);
        wuwVar.getClass();
        wuwVar.a.c(aVar);
        return Unit.a;
    }
}
