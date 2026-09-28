package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.CrashFragment$callWalletApi$1", f = "CrashFragment.kt", l = {3140}, m = "invokeSuspend", v = 1)
public final class ggb extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ fgb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggb(fgb fgbVar, v1b<? super ggb> v1bVar) {
        super(2, v1bVar);
        this.b = fgbVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ggb(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ggb) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        fgb fgbVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            fgbVar.n0 = true;
            this.a = 1;
            if (hkd.b(5000L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        fgbVar.n1().z1();
        fgbVar.n0 = false;
        return Unit.a;
    }
}
