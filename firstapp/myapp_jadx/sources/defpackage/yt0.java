package defpackage;

import com.sporty.android.core.model.appupdate.VersionAutoUpdateConfig;
import com.sporty.android.core.model.config.VersionData;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.domain.AppUpdateCoordinator", f = "AppUpdateCoordinator.kt", l = {138, 153, 158}, m = "handleUpdateAvailable", v = 2)
public final class yt0 extends x1b {
    public VersionData a;
    public VersionAutoUpdateConfig b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ cu0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt0(cu0 cu0Var, x1b x1bVar) {
        super(x1bVar);
        this.e = cu0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, false, this);
    }
}
