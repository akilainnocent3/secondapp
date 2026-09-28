package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportykick.components.OngoingComponentKt$OngoingComponent$7$1$observer$1$1", f = "OngoingComponent.kt", l = {642}, m = "invokeSuspend", v = 1)
public final class ywy extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ goj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywy(goj gojVar, v1b<? super ywy> v1bVar) {
        super(2, v1bVar);
        this.b = gojVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ywy(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ywy) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        goj gojVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            ((x5a0) gojVar.a0).setValue(Boolean.FALSE);
            this.a = 1;
            if (hkd.b(1100L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        ((x5a0) gojVar.a0).setValue(Boolean.TRUE);
        return Unit.a;
    }
}
