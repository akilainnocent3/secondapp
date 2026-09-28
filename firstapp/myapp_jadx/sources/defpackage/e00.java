package defpackage;

import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class e00 {
    public volatile g00 a;
    public volatile aa5 b;
    public final ArrayList c;

    public e00(njd<yz> njdVar) {
        are areVar = new are();
        wen wenVar = new wen();
        this.b = areVar;
        this.c = new ArrayList();
        this.a = wenVar;
        ((q2z) njdVar).a(new njd.a() { // from class: d00
            @Override // njd.a
            public final void a(n730 n730Var) {
                e00 e00Var = this.a;
                ngt ngtVar = ngt.a;
                ngtVar.b("AnalyticsConnector now available.");
                yz yzVar = (yz) n730Var.get();
                htb htbVar = new htb(yzVar);
                srb srbVar = new srb();
                zz zzVarF = yzVar.f("clx", srbVar);
                if (zzVarF == null) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
                    }
                    zzVarF = yzVar.f("crash", srbVar);
                    if (zzVarF != null) {
                        Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
                    }
                }
                if (zzVarF == null) {
                    ngtVar.d("Could not register Firebase Analytics listener; a listener is already registered.", null);
                    return;
                }
                ngtVar.b("Registered Firebase Analytics listener.");
                v95 v95Var = new v95();
                wf4 wf4Var = new wf4(htbVar);
                synchronized (e00Var) {
                    try {
                        ArrayList arrayList = e00Var.c;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            v95Var.a((w95) obj);
                        }
                        srbVar.b = v95Var;
                        srbVar.a = wf4Var;
                        e00Var.b = v95Var;
                        e00Var.a = wf4Var;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }
}
