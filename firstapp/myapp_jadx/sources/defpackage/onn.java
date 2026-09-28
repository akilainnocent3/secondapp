package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class onn implements InstallReferrerStateListener {
    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
        itf0.a aVar = itf0.a;
        aVar.q("InstallReferrer");
        aVar.a("onInstallReferrerServiceDisconnected", new Object[0]);
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i) {
        if (i != 0) {
            if (i == 1) {
                itf0.a aVar = itf0.a;
                aVar.q("InstallReferrer");
                aVar.a("InstallReferrerResponse = SERVICE_UNAVAILABLE", new Object[0]);
                return;
            } else {
                if (i != 2) {
                    return;
                }
                itf0.a aVar2 = itf0.a;
                aVar2.q("InstallReferrer");
                aVar2.a("InstallReferrerResponse = FEATURE_NOT_SUPPORTED", new Object[0]);
                return;
            }
        }
        itf0.a aVar3 = itf0.a;
        aVar3.q("InstallReferrer");
        aVar3.a("InstallReferrerResponse = OK", new Object[0]);
        try {
            try {
                InstallReferrerClient installReferrerClient = nnn.b;
                if (installReferrerClient == null) {
                    Intrinsics.n("referrerClient");
                    throw null;
                }
                String strA = nnn.a(installReferrerClient.getInstallReferrer().getInstallReferrer());
                nnn.d = strA;
                nnn.a aVar4 = nnn.c;
                if (aVar4 == null) {
                    Intrinsics.n("configPreferences");
                    throw null;
                }
                aVar4.e.a(nnn.a.f[0], strA);
                InstallReferrerClient installReferrerClient2 = nnn.b;
                if (installReferrerClient2 != null) {
                    installReferrerClient2.endConnection();
                } else {
                    Intrinsics.n("referrerClient");
                    throw null;
                }
            } catch (Exception e) {
                itf0.a aVar5 = itf0.a;
                aVar5.q("InstallReferrer");
                aVar5.c(e, "Could not get installReferrer data", new Object[0]);
                InstallReferrerClient installReferrerClient3 = nnn.b;
                if (installReferrerClient3 != null) {
                    installReferrerClient3.endConnection();
                } else {
                    Intrinsics.n("referrerClient");
                    throw null;
                }
            }
        } catch (Throwable th) {
            InstallReferrerClient installReferrerClient4 = nnn.b;
            if (installReferrerClient4 == null) {
                Intrinsics.n("referrerClient");
                throw null;
            }
            installReferrerClient4.endConnection();
            throw th;
        }
    }
}
