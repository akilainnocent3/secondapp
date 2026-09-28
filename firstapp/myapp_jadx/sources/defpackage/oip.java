package defpackage;

import com.sporty.android.core.model.common.Range;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.pay.BountyAndTaxConfigs;
import java.math.BigDecimal;
import java.util.List;
import kotlin.collections.a;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class oip implements mip {
    public final sr10 a;
    public final alp b;
    public final j1b c;
    public final v340 d;

    public oip(sr10 sr10Var, alp alpVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        sr10Var.getClass();
        this.a = sr10Var;
        this.b = alpVar;
        j1b j1bVarA = w5b.a(CoroutineContext.Element.a.d(lfe0.a(), k5bVar));
        this.c = j1bVarA;
        this.d = e1i.e(bm50.f(sr10Var.h0(pu0.b.a)), j1bVarA, q490.a.a, null);
    }

    @Override // defpackage.mip
    public final uwd0<BountyAndTaxConfigs> N() {
        return this.d;
    }

    @Override // defpackage.mip
    public final List<lyh<lk50<Object>>> a1() {
        return a.c(this.a.h0(pu0.b.a));
    }

    @Override // defpackage.mip
    public final List<c9p> h() {
        return a.c(ej5.c(this.c, null, null, new nip(this, null), 3));
    }

    @Override // defpackage.mip
    public final long u(BigDecimal bigDecimal, List<? extends Range> list) {
        bigDecimal.getClass();
        list.getClass();
        BigDecimal.ZERO.getClass();
        return alp.a(this.b, bigDecimal, list);
    }
}
