package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.PersonalCodeViewModel$onEditCode$1", f = "PersonalCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class vk00 extends tje0 implements Function2<Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ el00 b;
    public final /* synthetic */ kl00 c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk00(v1b v1bVar, el00 el00Var, kl00 kl00Var, boolean z) {
        super(2, v1bVar);
        this.b = el00Var;
        this.c = kl00Var;
        this.d = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vk00 vk00Var = new vk00(v1bVar, this.b, this.c, this.d);
        vk00Var.a = obj;
        return vk00Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Throwable th, v1b<? super Unit> v1bVar) {
        return ((vk00) create(th, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        g08 g08Var = g08.UNKNOWN;
        Throwable th = (Throwable) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        SprThrowable sprThrowable = (SprThrowable) (!(th instanceof SprThrowable) ? null : th);
        wuw<z7a0> wuwVar = this.b.z;
        z7a0.b bVar = new z7a0.b(this.c.a, null, sprThrowable != null ? new Integer(sprThrowable.getD()) : null, sprThrowable != null ? sprThrowable.getE() : null, th, 10);
        wuwVar.getClass();
        wuwVar.a.c(bVar);
        return Unit.a;
    }
}
