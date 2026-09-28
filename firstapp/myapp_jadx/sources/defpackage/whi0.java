package defpackage;

import com.sportybet.android.virtual.domain.entity.BannerEntity;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.virtual.domain.viewmodel.VirtualLobbyGameStatusHandlerImpl", f = "VirtualLobbyGameStatusHandlerImpl.kt", l = {135, 139}, m = "createGameContentStatus", v = 2)
public final class whi0 extends x1b {
    public BannerEntity a;
    public Map b;
    public List c;
    public qcn d;
    public boolean e;
    public boolean f;
    public /* synthetic */ Object i;
    public final /* synthetic */ zhi0 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public whi0(zhi0 zhi0Var, x1b x1bVar) {
        super(x1bVar);
        this.v = zhi0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        int i = zhi0.f;
        return this.v.c(null, null, null, null, false, false, null, this);
    }
}
