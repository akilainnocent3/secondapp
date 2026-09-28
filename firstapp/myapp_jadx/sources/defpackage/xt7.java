package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.common.cloudflare.CloudflareViewModel$setCaptchaAction$1", f = "CloudflareViewModel.kt", l = {58}, m = "invokeSuspend", v = 2)
public final class xt7 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ au7 b;
    public final /* synthetic */ j6c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt7(au7 au7Var, j6c j6cVar, v1b<? super xt7> v1bVar) {
        super(2, v1bVar);
        this.b = au7Var;
        this.c = j6cVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xt7(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xt7) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wwd0 wwd0Var = this.b.c;
            this.a = 1;
            wwd0Var.setValue(this.c);
            if (Unit.a == y5bVar) {
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
