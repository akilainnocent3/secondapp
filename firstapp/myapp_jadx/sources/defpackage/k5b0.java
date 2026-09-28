package defpackage;

import com.sportygames.spin2win.components.Spin2WinWheel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spin2win.components.Spin2WinWheel$startBgAnimation$2", f = "Spin2WinWheel.kt", l = {147}, m = "invokeSuspend", v = 1)
public final class k5b0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ Spin2WinWheel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5b0(Spin2WinWheel spin2WinWheel, v1b<? super k5b0> v1bVar) {
        super(2, v1bVar);
        this.b = spin2WinWheel;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new k5b0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((k5b0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        Spin2WinWheel spin2WinWheel = this.b;
        if (i == 0) {
            uj50.b(obj);
            hq80 binding = spin2WinWheel.getBinding();
            spin2WinWheel.G(binding != null ? binding.J : null);
            this.a = 1;
            if (hkd.b(2000L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        hq80 binding2 = spin2WinWheel.getBinding();
        spin2WinWheel.G(binding2 != null ? binding2.K : null);
        return Unit.a;
    }
}
