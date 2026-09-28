package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.antest.RebetRemixCombineAnTestHelper$isVariantSelections$1", f = "RebetRemixCombineAnTestHelper.kt", l = {133}, m = "invokeSuspend", v = 2)
public final class wb40 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public dt30 a;
    public int b;
    public final /* synthetic */ dt30 c;
    public final /* synthetic */ hc40 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb40(dt30 dt30Var, hc40 hc40Var, String str, v1b v1bVar) {
        super(2, v1bVar);
        this.c = dt30Var;
        this.d = hc40Var;
        this.e = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wb40(this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wb40) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        dt30 dt30Var;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            dt30 dt30Var2 = this.c;
            this.a = dt30Var2;
            this.b = 1;
            Object objIsRebetRemixCombineVariant = this.d.c.isRebetRemixCombineVariant(this.e, this);
            if (objIsRebetRemixCombineVariant == y5bVar) {
                return y5bVar;
            }
            obj = objIsRebetRemixCombineVariant;
            dt30Var = dt30Var2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dt30Var = this.a;
            uj50.b(obj);
        }
        dt30Var.accept(obj);
        return Unit.a;
    }
}
