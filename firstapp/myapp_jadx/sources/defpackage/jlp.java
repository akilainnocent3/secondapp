package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.multilevel.common.components.KeepGettingExtraCashoutStripKt$KeepGettingExtraCashoutStrip$2$1", f = "KeepGettingExtraCashoutStrip.kt", l = {66}, m = "invokeSuspend", v = 1)
public final class jlp extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ytw<Boolean> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jlp(ytw<Boolean> ytwVar, v1b<? super jlp> v1bVar) {
        super(2, v1bVar);
        this.b = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new jlp(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((jlp) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        ytw<Boolean> ytwVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            if (ytwVar.getValue().booleanValue()) {
                this.a = 1;
                if (hkd.b(4000L, this) == y5bVar) {
                    return y5bVar;
                }
            }
            return Unit.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        ytwVar.setValue(Boolean.FALSE);
        return Unit.a;
    }
}
