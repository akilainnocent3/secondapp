package defpackage;

import com.sportybet.plugin.realsports.activities.OfflineRequestListActivity;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wky implements Runnable {
    public final /* synthetic */ OfflineRequestListActivity a;

    @Override // java.lang.Runnable
    public final void run() {
        int i = OfflineRequestListActivity.E;
        OfflineRequestListActivity offlineRequestListActivity = this.a;
        if (offlineRequestListActivity.isFinishing() || offlineRequestListActivity.f == null) {
            return;
        }
        offlineRequestListActivity.B = true;
        offlineRequestListActivity.v = null;
        offlineRequestListActivity.A1();
    }
}
