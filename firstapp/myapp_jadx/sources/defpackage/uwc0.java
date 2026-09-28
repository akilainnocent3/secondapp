package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.penalty.component.SportyPenaltyMarketCategoryInfoKt$SportyPenaltyMarketCategoryInfo$2$1", f = "SportyPenaltyMarketCategoryInfo.kt", l = {52}, m = "invokeSuspend", v = 2)
public final class uwc0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ved c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwc0(int i, v1b v1bVar, ved vedVar) {
        super(2, v1bVar);
        this.b = i;
        this.c = vedVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new uwc0(this.b, v1bVar, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((uwc0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ved vedVar = this.c;
            int iK = vedVar.k();
            int i2 = this.b;
            if (i2 == iK) {
                return Unit.a;
            }
            this.a = 1;
            if (vedVar.f(i2, yi0.d(0.0f, 0.0f, null, 7), this) == y5bVar) {
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
