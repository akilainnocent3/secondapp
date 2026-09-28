package defpackage;

import android.util.Pair;
import com.sporty.android.common.network.data.SprThrowable;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.PersonalCodeViewModel$onShareCode$1", f = "PersonalCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class al00 extends tje0 implements Function2<Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;
    public final /* synthetic */ el00 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al00(String str, el00 el00Var, v1b<? super al00> v1bVar) {
        super(2, v1bVar);
        this.b = str;
        this.c = el00Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        al00 al00Var = new al00(this.b, this.c, v1bVar);
        al00Var.a = obj;
        return al00Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Throwable th, v1b<? super Unit> v1bVar) {
        return ((al00) create(th, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = (Throwable) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        w950.a("PersonalCodeViewModel", "ShareUseCase.getSocialShareCode", th, a.c(new Pair("shareCode", this.b)));
        SprThrowable sprThrowable = (SprThrowable) (!(th instanceof SprThrowable) ? null : th);
        wuw<z7a0> wuwVar = this.c.z;
        z7a0.d dVar = new z7a0.d(this.b, false, null, sprThrowable != null ? new Integer(sprThrowable.getD()) : null, sprThrowable != null ? sprThrowable.getE() : null, th, 6);
        wuwVar.getClass();
        wuwVar.a.c(dVar);
        return Unit.a;
    }
}
