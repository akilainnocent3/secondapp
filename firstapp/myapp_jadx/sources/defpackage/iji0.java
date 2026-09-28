package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.VirtualLobbyGetStartedRepositoryImpl", f = "VirtualLobbyGetStartedRepositoryImpl.kt", l = {15}, m = "getVirtualLobbyGetStarted-IoAF18A", v = 2)
public final class iji0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ jji0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iji0(jji0 jji0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = jji0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Serializable serializableA = this.b.a(this);
        return serializableA == y5b.a ? serializableA : new zi50(serializableA);
    }
}
