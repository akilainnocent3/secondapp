package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel$3", f = "LoyaltyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class w2u extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ boolean a;
    public final /* synthetic */ b3u b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2u(v1b v1bVar, b3u b3uVar) {
        super(2, v1bVar);
        this.b = b3uVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        w2u w2uVar = new w2u(v1bVar, this.b);
        w2uVar.a = ((Boolean) obj).booleanValue();
        return w2uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((w2u) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        b3u b3uVar = this.b;
        f0u f0uVar = b3uVar.c;
        if (z) {
            jvd0 jvd0Var = b3uVar.U;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            b3uVar.W = true;
            if (f0uVar.d.a.getValue() == null) {
                f0uVar.a(tyt.a.d);
            }
            b3uVar.b.l.setValue(lk50.b.a);
            b3uVar.J1();
            b3uVar.D1();
        } else {
            jvd0 jvd0Var2 = b3uVar.T;
            if (jvd0Var2 != null) {
                jvd0Var2.cancel((CancellationException) null);
            }
            jvd0 jvd0Var3 = b3uVar.V;
            if (jvd0Var3 != null) {
                jvd0Var3.cancel((CancellationException) null);
            }
            jvd0 jvd0Var4 = b3uVar.U;
            if (jvd0Var4 != null) {
                jvd0Var4.cancel((CancellationException) null);
            }
            svt svtVar = b3uVar.a;
            svtVar.getClass();
            b3uVar.U = kzh.d(new g1i(bm50.a(new or60(new rvt(svtVar, null))), new y3u(null, b3uVar)), o8i0.d(b3uVar));
        }
        jvd0 jvd0Var5 = b3uVar.S;
        if (jvd0Var5 != null) {
            jvd0Var5.cancel((CancellationException) null);
        }
        if (f0uVar.d.a.getValue() == null) {
            b3uVar.S = ej5.c(o8i0.d(b3uVar), null, null, new a4u(b3uVar, (lk50) b3uVar.P.getValue(), (jwv) b3uVar.b0.a.getValue(), null), 3);
        }
        return Unit.a;
    }
}
