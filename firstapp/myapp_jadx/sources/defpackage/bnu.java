package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.ManageAccountUiManagerImpl$onManageAccountAction$4", f = "ManageAccountUiManager.kt", l = {316}, m = "invokeSuspend", v = 2)
public final class bnu extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ xmu b;
    public final /* synthetic */ tmu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnu(xmu xmuVar, tmu tmuVar, v1b<? super bnu> v1bVar) {
        super(2, v1bVar);
        this.b = xmuVar;
        this.c = tmuVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bnu(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bnu) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            tmu.a aVar = (tmu.a) this.c;
            Object obj2 = aVar.a;
            boolean z = aVar.b;
            this.a = 1;
            if (this.b.a(obj2, z, this) == y5bVar) {
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
