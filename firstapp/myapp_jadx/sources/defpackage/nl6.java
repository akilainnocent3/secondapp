package defpackage;

import com.sportybet.android.cashoutphase3.b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutFragment", f = "CashOutFragment.kt", l = {1739}, m = "toShareBet", v = 2)
public final class nl6 extends x1b {
    public ez80 a;
    public zha0 b;
    public ArrayList c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ b f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl6(b bVar, x1b x1bVar) {
        super(x1bVar);
        this.f = bVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.M0(null, null, this);
    }
}
