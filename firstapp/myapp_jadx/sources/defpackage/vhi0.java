package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.virtual.domain.viewmodel.VirtualLobbyGameStatusHandlerImpl", f = "VirtualLobbyGameStatusHandlerImpl.kt", l = {207}, m = "createCmsRestoredEntranceCards", v = 2)
public final class vhi0 extends x1b {
    public Map a;
    public Collection b;
    public Iterator c;
    public Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ zhi0 f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vhi0(zhi0 zhi0Var, x1b x1bVar) {
        super(x1bVar);
        this.f = zhi0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        int i = zhi0.f;
        return this.f.b(null, null, this);
    }
}
