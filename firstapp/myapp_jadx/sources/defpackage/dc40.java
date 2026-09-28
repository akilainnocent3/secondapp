package defpackage;

import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.antest.RebetRemixCombineAnTestHelper$resolveRebetStrategySelections$1", f = "RebetRemixCombineAnTestHelper.kt", l = {108}, m = "invokeSuspend", v = 2)
public final class dc40 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public Consumer a;
    public int b;
    public final /* synthetic */ Consumer<lws> c;
    public final /* synthetic */ hc40 d;
    public final /* synthetic */ nas e;
    public final /* synthetic */ String f;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc40(Consumer consumer, hc40 hc40Var, nas nasVar, String str, boolean z, v1b v1bVar) {
        super(2, v1bVar);
        this.c = consumer;
        this.d = hc40Var;
        this.e = nasVar;
        this.f = str;
        this.i = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new dc40(this.c, this.d, this.e, this.f, this.i, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((dc40) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Consumer consumer;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            Consumer<lws> consumer2 = this.c;
            this.a = consumer2;
            this.b = 1;
            Enum enumF = this.d.f(this.e, this.f, this.i, this);
            if (enumF == y5bVar) {
                return y5bVar;
            }
            obj = enumF;
            consumer = consumer2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            consumer = this.a;
            uj50.b(obj);
        }
        consumer.accept(obj);
        return Unit.a;
    }
}
