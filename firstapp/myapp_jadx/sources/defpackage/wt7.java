package defpackage;

import com.sporty.android.core.model.crypto.IURC.iKBWavCysVP;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.common.cloudflare.CloudflareViewModel$resetCloudflareJsLoadingState$2", f = "CloudflareViewModel.kt", l = {67}, m = "invokeSuspend", v = 2)
public final class wt7 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ au7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt7(au7 au7Var, v1b<? super wt7> v1bVar) {
        super(2, v1bVar);
        this.b = au7Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wt7(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wt7) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            m2l m2lVar = this.b.a;
            qt7 qt7Var = qt7.a;
            this.a = 1;
            if (m2lVar.a.putString("cloudflare_loading_state", iKBWavCysVP.XqIrQnsWkPTO, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
