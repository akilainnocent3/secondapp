package defpackage;

import com.sportybet.android.data.SimpleConverterResponseWrapper;
import com.sportybet.plugin.realsports.activities.OfflineRequestListActivity;

/* JADX INFO: loaded from: classes5.dex */
public final class aly extends SimpleConverterResponseWrapper<Object, String> {
    public final /* synthetic */ OfflineRequestListActivity a;

    public aly(OfflineRequestListActivity offlineRequestListActivity) {
        this.a = offlineRequestListActivity;
    }

    @Override // com.sportybet.android.data.SimpleConverterResponseWrapper
    public final String convert(bcp bcpVar) {
        if (bcpVar != null) {
            return dc8.f(0, bcpVar, this.a.z);
        }
        return null;
    }

    @Override // com.sportybet.android.data.SimpleConverterResponseWrapper
    public final String getIdentifier() {
        return "OfflineRequestListActivity";
    }

    @Override // com.sportybet.android.data.SimpleConverterResponseWrapper
    public final void onSuccessData(String str) {
        OfflineRequestListActivity offlineRequestListActivity = this.a;
        offlineRequestListActivity.z = str;
        offlineRequestListActivity.A1();
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onFailure(Throwable th) {
    }
}
