package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class n82 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o82 f152930a;

    public n82(o82 o82Var) {
        this.f152930a = o82Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int iB = o82.b(context);
        if (ib3.f150516a < 31 || iB != 5) {
            this.f152930a.a(iB);
        } else {
            l82.a(context, this.f152930a);
        }
    }
}
