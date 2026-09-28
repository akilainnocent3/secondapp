package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.basepay.viewModel.GlobalDepositViewModel", f = "GlobalDepositViewModel.kt", l = {158, 163}, m = "processInitialTabsState", v = 2)
public final class h1l extends x1b {
    public List a;
    public /* synthetic */ Object b;
    public final /* synthetic */ a1l c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1l(a1l a1lVar, x1b x1bVar) {
        super(x1bVar);
        this.c = a1lVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.A1(this);
    }
}
