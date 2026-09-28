package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.InstantWinRepoImpl", f = "InstantWinRepoImpl.kt", l = {298}, m = "getWorldCupSettledEventsByLeague-0E7RQCE", v = 2)
public final class zko extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ fko b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zko(fko fkoVar, x1b x1bVar) {
        super(x1bVar);
        this.b = fkoVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Serializable serializableY = this.b.y(null, null, this);
        return serializableY == y5b.a ? serializableY : new zi50(serializableY);
    }
}
