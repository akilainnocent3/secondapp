package yads;

import com.yandex.varioqub.appmetricaadapter.AppMetricaAdapter;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ou3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qg f153618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zg f153619b;

    public ou3(qg qgVar, zg zgVar) {
        this.f153618a = qgVar;
        this.f153619b = zgVar;
    }

    public final void a(String str) {
        if (this.f153619b.c()) {
            qg qgVar = this.f153618a;
            qgVar.getClass();
            try {
                AppMetricaAdapter appMetricaAdapter = qgVar.f154460a;
                if (appMetricaAdapter != null) {
                    appMetricaAdapter.setExperiments(str);
                }
            } catch (Throwable unused) {
                boolean z10 = ad1.f146762a;
            }
        }
    }

    public final void a(Set set) {
        if (this.f153619b.c()) {
            qg qgVar = this.f153618a;
            qgVar.getClass();
            try {
                AppMetricaAdapter appMetricaAdapter = qgVar.f154460a;
                if (appMetricaAdapter != null) {
                    appMetricaAdapter.setTriggeredTestIds(set);
                }
            } catch (Throwable unused) {
                set.toString();
                boolean z10 = ad1.f146762a;
            }
        }
    }
}
