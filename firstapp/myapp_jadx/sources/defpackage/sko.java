package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.InstantWinRepoImpl", f = "InstantWinRepoImpl.kt", l = {99}, m = "getIVTicketId", v = 2)
public final class sko extends x1b {
    public HashMap a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ fko d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sko(fko fkoVar, x1b x1bVar) {
        super(x1bVar);
        this.d = fkoVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.I(0, this, null);
    }
}
