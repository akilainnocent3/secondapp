package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.antest.RebetRemixCombineAnTestHelper$resolveRemixStrategySelections$1", f = "RebetRemixCombineAnTestHelper.kt", l = {119}, m = "invokeSuspend", v = 2)
public final class fc40 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public qs30 a;
    public int b;
    public final /* synthetic */ qs30 c;
    public final /* synthetic */ hc40 d;
    public final /* synthetic */ nas e;
    public final /* synthetic */ String f;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc40(qs30 qs30Var, hc40 hc40Var, nas nasVar, String str, boolean z, v1b v1bVar) {
        super(2, v1bVar);
        this.c = qs30Var;
        this.d = hc40Var;
        this.e = nasVar;
        this.f = str;
        this.i = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new fc40(this.c, this.d, this.e, this.f, this.i, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((fc40) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        qs30 qs30Var;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            qs30 qs30Var2 = this.c;
            this.a = qs30Var2;
            this.b = 1;
            Enum enumG = this.d.g(this.e, this.f, this.i, this);
            if (enumG == y5bVar) {
                return y5bVar;
            }
            obj = enumG;
            qs30Var = qs30Var2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qs30Var = this.a;
            uj50.b(obj);
        }
        qs30Var.accept(obj);
        return Unit.a;
    }
}
