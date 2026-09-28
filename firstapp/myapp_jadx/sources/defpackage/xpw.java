package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportyjet.components.MultiplierComponentsKt$MultiplierComponents$9$1", f = "MultiplierComponents.kt", l = {557}, m = "invokeSuspend", v = 1)
public final class xpw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ goj b;
    public final /* synthetic */ isw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpw(goj gojVar, isw iswVar, v1b<? super xpw> v1bVar) {
        super(2, v1bVar);
        this.b = gojVar;
        this.c = iswVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xpw(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xpw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(2350L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        ((x5a0) this.b.a0).setValue(Boolean.TRUE);
        this.c.A(0.0f);
        return Unit.a;
    }
}
