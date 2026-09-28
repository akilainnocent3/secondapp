package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.components.bet.generic.StakeSelectorGenericComponentKt$StakeSelectorGenericComponent$2$1", f = "StakeSelectorGenericComponent.kt", l = {}, m = "invokeSuspend", v = 1)
public final class wtd0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ osw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wtd0(boolean z, osw oswVar, v1b<? super wtd0> v1bVar) {
        super(2, v1bVar);
        this.a = z;
        this.b = oswVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wtd0(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wtd0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (this.a) {
            this.b.k(-1);
        }
        return Unit.a;
    }
}
