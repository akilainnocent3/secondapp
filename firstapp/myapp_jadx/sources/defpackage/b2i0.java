package defpackage;

import com.sporty.android.core.model.appupdate.VersionAutoUpdateConfig;
import com.sporty.android.core.model.config.VersionData;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.update.viewmodel.VersionCheckViewModel", f = "VersionCheckViewModel.kt", l = {96, 98, 100}, m = "startDownloadProcess", v = 2)
public final class b2i0 extends x1b {
    public VersionData a;
    public kkh0 b;
    public VersionAutoUpdateConfig c;
    public /* synthetic */ Object d;
    public final /* synthetic */ y1i0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2i0(y1i0 y1i0Var, x1b x1bVar) {
        super(x1bVar);
        this.e = y1i0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.z1(null, null, this);
    }
}
