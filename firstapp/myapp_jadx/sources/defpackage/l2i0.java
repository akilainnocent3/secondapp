package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.update.VersionUpdateDialogViewModel$updateWifiAutoUpdateStatus$1", f = "VersionUpdateDialogViewModel.kt", l = {16}, m = "invokeSuspend", v = 2)
public final class l2i0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ m2i0 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2i0(m2i0 m2i0Var, boolean z, v1b<? super l2i0> v1bVar) {
        super(2, v1bVar);
        this.b = m2i0Var;
        this.c = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new l2i0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((l2i0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wm20<Boolean> wm20VarA = this.b.a.a();
            Boolean boolValueOf = Boolean.valueOf(this.c);
            this.a = 1;
            if (wm20VarA.g(this, boolValueOf) == y5bVar) {
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
