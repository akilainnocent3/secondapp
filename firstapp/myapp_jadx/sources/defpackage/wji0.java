package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.virtual.domain.viewmodel.VirtualLobbyMissionStatusHandlerImpl", f = "VirtualLobbyMissionStatusHandlerImpl.kt", l = {181}, m = "createMissionContentStatus", v = 2)
public final class wji0 extends x1b {
    public Set a;
    public Set b;
    public /* synthetic */ Object c;
    public final /* synthetic */ gki0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wji0(gki0 gki0Var, x1b x1bVar) {
        super(x1bVar);
        this.d = gki0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, null, null, this);
    }
}
