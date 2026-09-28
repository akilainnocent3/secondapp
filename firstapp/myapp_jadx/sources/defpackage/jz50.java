package defpackage;

import com.sportygames.crash.remote.models.Coefficients;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.components.history.RoundItemDialogUIKt$RoundItemUI$1$1", f = "RoundItemDialogUI.kt", l = {118}, m = "invokeSuspend", v = 1)
public final class jz50 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ Coefficients b;
    public final /* synthetic */ ytw<Boolean> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz50(Coefficients coefficients, ytw<Boolean> ytwVar, v1b<? super jz50> v1bVar) {
        super(2, v1bVar);
        this.b = coefficients;
        this.c = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new jz50(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((jz50) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        Coefficients coefficients = this.b;
        if (i == 0) {
            uj50.b(obj);
            if (coefficients.isNew()) {
                this.a = 1;
                if (hkd.b(50L, this) == y5bVar) {
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
        this.c.setValue(Boolean.TRUE);
        coefficients.setNew(false);
        return Unit.a;
    }
}
