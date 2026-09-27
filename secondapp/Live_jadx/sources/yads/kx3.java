package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class kx3 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lx3 f151766a = lx3.f152212d;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z10;
        lx3 lx3Var;
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            lx3 lx3Var2 = this.f151766a;
            z10 = true;
            lx3Var2.a(true, lx3Var2.f152215c);
            lx3Var = this.f151766a;
        } else {
            if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                return;
            }
            lx3 lx3Var3 = this.f151766a;
            z10 = false;
            lx3Var3.a(false, lx3Var3.f152215c);
            lx3Var = this.f151766a;
        }
        lx3Var.f152214b = z10;
    }
}
