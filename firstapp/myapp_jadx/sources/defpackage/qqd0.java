package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.stacker.presentation.StackerViewModel$onSoundClick$1", f = "StackerViewModel.kt", l = {86}, m = "invokeSuspend", v = 1)
public final class qqd0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ tqd0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqd0(tqd0 tqd0Var, v1b<? super qqd0> v1bVar) {
        super(2, v1bVar);
        this.b = tqd0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qqd0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qqd0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            tqd0 tqd0Var = this.b;
            en20 en20Var = tqd0Var.a;
            boolean z = !((Boolean) tqd0Var.I.a.getValue()).booleanValue();
            this.a = 1;
            if (en20Var.a("STACKER_SOUND_KEY", z, this) == y5bVar) {
                return y5bVar;
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
