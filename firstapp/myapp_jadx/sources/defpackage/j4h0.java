package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.MyLog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.transaction.presentation.viewmodel.TxDetailsV2ViewModel$init$5", f = "TxDetailsV2ViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j4h0 extends tje0 implements Function2<lk50<? extends Unit>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ r4h0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4h0(v1b v1bVar, r4h0 r4h0Var) {
        super(2, v1bVar);
        this.b = r4h0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        j4h0 j4h0Var = new j4h0(v1bVar, this.b);
        j4h0Var.a = obj;
        return j4h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Unit> lk50Var, v1b<? super Unit> v1bVar) {
        return ((j4h0) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean zG = Intrinsics.g(lk50Var, lk50.b.a);
        r4h0 r4h0Var = this.b;
        if (zG) {
            r4h0Var.y1().setValue(t3h0.a(r4h0Var.y1().getValue(), wgn.c.a, null, null, null, null, 30));
        } else if (lk50Var instanceof lk50.c) {
            r4h0Var.y1().setValue(t3h0.a(r4h0Var.y1().getValue(), wgn.b.a, null, null, null, null, 30));
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
            r4h0Var.y1().setValue(t3h0.a(r4h0Var.y1().getValue(), new wgn.a(sprThrowable != null ? sprThrowable.b() : vch0.b), null, null, null, null, 30));
        }
        return Unit.a;
    }
}
