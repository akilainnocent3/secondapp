package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.time.b;
import kotlin.time.c;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel$special$$inlined$flatMapLatest$1", f = "LoyaltyViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class e4u extends tje0 implements gaj<myh<? super jwv>, Boolean, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ b3u d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4u(v1b v1bVar, b3u b3uVar) {
        super(3, v1bVar);
        this.d = b3uVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super jwv> myhVar, Boolean bool, v1b<? super Unit> v1bVar) {
        e4u e4uVar = new e4u(v1bVar, this.d);
        e4uVar.b = myhVar;
        e4uVar.c = bool;
        return e4uVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            boolean zBooleanValue = ((Boolean) this.c).booleanValue();
            b3u b3uVar = this.d;
            nvv nvvVar = b3uVar.b;
            et7 et7VarD = o8i0.d(b3uVar);
            nvvVar.getClass();
            jvd0 jvd0Var = nvvVar.f;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            b390 b390Var = nvvVar.e;
            b.a aVar = b.b;
            nvvVar.f = kzh.d(new g1i(szh.a(b390Var, hkd.e(c.i(500L, rgf.MILLISECONDS))), new lvv(nvvVar, et7VarD, null)), et7VarD);
            m1i m1iVarC = r1i.c(zBooleanValue ? nvvVar.a.a.d() : new gzh(lk50.b.a), nvvVar.l, nvvVar.i, nvvVar.j, nvvVar.k, new jvv(nvvVar, zBooleanValue, null));
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, m1iVarC, this) == y5bVar) {
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
