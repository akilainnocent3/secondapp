package defpackage;

import com.sportygames.crash.models.BetData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.components.bet.generic.CancelButtonGenericKt$CancelButtonGeneric$2$1", f = "CancelButtonGeneric.kt", l = {}, m = "invokeSuspend", v = 1)
public final class kb6 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ Function1<BetData, Unit> a;
    public final /* synthetic */ fsw b;
    public final /* synthetic */ zp40 c;
    public final /* synthetic */ ytw<Boolean> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kb6(Function1<? super BetData, Unit> function1, fsw fswVar, zp40 zp40Var, ytw<Boolean> ytwVar, v1b<? super kb6> v1bVar) {
        super(2, v1bVar);
        this.a = function1;
        this.b = fswVar;
        this.c = zp40Var;
        this.d = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kb6(this.a, this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((kb6) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        try {
            this.a.invoke(new BetData(new Double(this.b.getDoubleValue()), new Double(this.c.a)));
        } catch (Exception unused) {
            this.d.setValue(Boolean.FALSE);
        }
        return Unit.a;
    }
}
