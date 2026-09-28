package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.MyLog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.ui.txdetails.TxDetailsViewModel$init$2", f = "TxDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class w4h0 extends tje0 implements Function2<lk50<? extends Unit>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ e5h0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4h0(e5h0 e5h0Var, v1b<? super w4h0> v1bVar) {
        super(2, v1bVar);
        this.b = e5h0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        w4h0 w4h0Var = new w4h0(this.b, v1bVar);
        w4h0Var.a = obj;
        return w4h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Unit> lk50Var, v1b<? super Unit> v1bVar) {
        return ((w4h0) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean zG = Intrinsics.g(lk50Var, lk50.b.a);
        e5h0 e5h0Var = this.b;
        if (zG) {
            e5h0Var.y.setValue(wgn.c.a);
        } else if (lk50Var instanceof lk50.c) {
            e5h0Var.y.setValue(wgn.b.a);
        } else {
            if (!(lk50Var instanceof lk50.a)) {
                uhc.a();
                return null;
            }
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            lk50.a aVar2 = (lk50.a) lk50Var;
            aVar.n(aVar2.toString(), new Object[0]);
            Throwable th = aVar2.a;
            SprThrowable sprThrowable = th instanceof SprThrowable ? (SprThrowable) th : null;
            wwd0 wwd0Var = e5h0Var.y;
            wgn.a aVar3 = new wgn.a(sprThrowable != null ? sprThrowable.b() : vch0.b);
            wwd0Var.getClass();
            wwd0Var.k(null, aVar3);
        }
        return Unit.a;
    }
}
