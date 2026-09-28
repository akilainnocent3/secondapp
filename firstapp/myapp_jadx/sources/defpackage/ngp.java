package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.jumpbank.JumpBankViewModel$onViewCreated$1", f = "JumpBankViewModel.kt", l = {38}, m = "invokeSuspend", v = 2)
public final class ngp extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ogp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ngp(ogp ogpVar, v1b<? super ngp> v1bVar) {
        super(2, v1bVar);
        this.b = ogpVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ngp(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ngp) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(30000L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        wwd0 wwd0Var = this.b.b;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, kgp.a((kgp) value, 3)));
        return Unit.a;
    }
}
