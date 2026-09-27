package yads;

import android.content.Context;
import com.yandex.varioqub.appmetricaadapter.AppMetricaAdapter;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppMetricaAdapter f154460a;

    public qg(Context context, zg zgVar) {
        AppMetricaAdapter appMetricaAdapter = null;
        if (zgVar.c()) {
            try {
                appMetricaAdapter = new AppMetricaAdapter(context);
            } catch (Throwable th2) {
                th2.toString();
                boolean z10 = ad1.f146762a;
            }
        }
        this.f154460a = appMetricaAdapter;
    }
}
