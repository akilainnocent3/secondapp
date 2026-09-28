package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spin2win.view.Spin2WinFragment$observeAllLiveData$14$1", f = "Spin2WinFragment.kt", l = {2263}, m = "invokeSuspend", v = 1)
public final class e1b0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ a1b0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1b0(a1b0 a1b0Var, v1b<? super e1b0> v1bVar) {
        super(2, v1bVar);
        this.b = a1b0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new e1b0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((e1b0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        a1b0 a1b0Var = this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(1000L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        try {
            if (!a1b0Var.isRemoving()) {
                a1b0Var.z0().x1();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Unit.a;
    }
}
