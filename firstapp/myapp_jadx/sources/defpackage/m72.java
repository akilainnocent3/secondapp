package defpackage;

import com.sporty.android.core.model.MyLog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.presentation.viewmodel.BaseTradingViewModel$init$2", f = "BaseTradingViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m72 extends tje0 implements Function2<lk50<? extends Unit>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ k72 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m72(k72 k72Var, v1b<? super m72> v1bVar) {
        super(2, v1bVar);
        this.b = k72Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        m72 m72Var = new m72(this.b, v1bVar);
        m72Var.a = obj;
        return m72Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Unit> lk50Var, v1b<? super Unit> v1bVar) {
        return ((m72) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        wwd0 wwd0Var = this.b.C;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (Intrinsics.g(lk50Var, lk50.b.a)) {
            wwd0Var.setValue(wgn.c.a);
        } else if (lk50Var instanceof lk50.c) {
            wwd0Var.setValue(wgn.b.a);
        } else {
            if (!(lk50Var instanceof lk50.a)) {
                uhc.a();
                return null;
            }
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            lk50.a aVar2 = (lk50.a) lk50Var;
            aVar.n(aVar2.toString(), new Object[0]);
            wgn.a aVar3 = new wgn.a(ppf0.a(aVar2.a));
            wwd0Var.getClass();
            wwd0Var.k(null, aVar3);
        }
        return Unit.a;
    }
}
