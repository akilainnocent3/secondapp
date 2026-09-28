package defpackage;

import com.sportybet.android.virtual.presentation.activity.VirtualLobbyActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cgi0 implements i2i0.b {
    public final /* synthetic */ VirtualLobbyActivity a;

    public cgi0(VirtualLobbyActivity virtualLobbyActivity) {
        this.a = virtualLobbyActivity;
    }

    @Override // i2i0.b
    public final void a() {
        VirtualLobbyActivity virtualLobbyActivity = this.a;
        yi5 yi5Var = virtualLobbyActivity.D;
        if (yi5Var != null) {
            yrh0.o(virtualLobbyActivity, yi5Var);
        } else {
            Intrinsics.n("buildConfiguration");
            throw null;
        }
    }
}
