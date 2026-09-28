package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.SportyPenaltyRepoImpl", f = "SportyPenaltyRepoImpl.kt", l = {74}, m = "createTicket-0E7RQCE", v = 2)
public final class rzc0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ yzc0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rzc0(yzc0 yzc0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = yzc0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Serializable serializableA = this.b.a(null, null, this);
        return serializableA == y5b.a ? serializableA : new zi50(serializableA);
    }
}
