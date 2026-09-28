package defpackage;

import com.sportybet.android.globalpay.stp.spei.b;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.stp.spei.SpeiByStpDepositViewModel", f = "SpeiByStpDepositViewModel.kt", l = {248, 253}, m = "getClabe", v = 2)
public final class tva0 extends x1b {
    public v5b a;
    public /* synthetic */ Object b;
    public final /* synthetic */ b c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tva0(b bVar, x1b x1bVar) {
        super(x1bVar);
        this.c = bVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.y1(null, this);
    }
}
