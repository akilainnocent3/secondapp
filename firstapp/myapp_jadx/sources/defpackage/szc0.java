package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.SportyPenaltyRepoImpl", f = "SportyPenaltyRepoImpl.kt", l = {46, 48, 57, 59}, m = "getDetails-0E7RQCE", v = 2)
public final class szc0 extends x1b {
    public String a;
    public yzc0 b;
    public List c;
    public String d;
    public boolean e;
    public /* synthetic */ Object f;
    public final /* synthetic */ yzc0 i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public szc0(yzc0 yzc0Var, x1b x1bVar) {
        super(x1bVar);
        this.i = yzc0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        Object objB = this.i.b(null, false, this);
        return objB == y5b.a ? objB : new zi50(objB);
    }
}
