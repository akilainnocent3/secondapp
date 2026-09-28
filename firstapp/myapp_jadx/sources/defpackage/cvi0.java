package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.wheelanddeal.WDViewModel$bet$4", f = "WDViewModel.kt", l = {765}, m = "invokeSuspend", v = 1)
public final class cvi0 extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ Long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvi0(Long l, v1b<? super cvi0> v1bVar) {
        super(2, v1bVar);
        this.b = l;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new cvi0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((cvi0) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            Long l = this.b;
            if (l != null) {
                long jLongValue = l.longValue();
                this.a = 1;
                if (hkd.b(jLongValue, this) == y5bVar) {
                    return y5bVar;
                }
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
