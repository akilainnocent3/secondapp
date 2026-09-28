package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.InstantWinRepoImpl", f = "InstantWinRepoImpl.kt", l = {276}, m = "getAfricanCupSettledEventsByLeague-0E7RQCE", v = 2)
public final class hko extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ fko b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hko(fko fkoVar, x1b x1bVar) {
        super(x1bVar);
        this.b = fkoVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Serializable serializableF = this.b.F(null, null, this);
        return serializableF == y5b.a ? serializableF : new zi50(serializableF);
    }
}
