package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.domain.PixDepositStatusPollingUseCase$invoke$2", f = "PixDepositStatusPollingUseCase.kt", l = {38}, m = "invokeSuspend", v = 2)
public final class be10 extends tje0 implements Function2<v5b, v1b<? super yd10.a>, Object> {
    public int a;
    public final /* synthetic */ yd10 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be10(yd10 yd10Var, String str, long j, v1b<? super be10> v1bVar) {
        super(2, v1bVar);
        this.b = yd10Var;
        this.c = str;
        this.d = j;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new be10(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super yd10.a> v1bVar) {
        return ((be10) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            Enum enumC = this.b.c(this.d, this, this.c);
            return enumC == y5bVar ? y5bVar : enumC;
        }
        if (i == 1) {
            uj50.b(obj);
            return obj;
        }
        ib5.a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
