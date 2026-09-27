package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class G1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4939ba f95847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f95848b;

    public G1() {
        this(new C4939ba());
    }

    public final synchronized long a(Context context) {
        String strA;
        try {
            this.f95847a.getClass();
            strA = Ka.a(FileUtils.getFileFromAppStorage(context, "metrica_service_settings.dat"));
        } catch (Throwable unused) {
        }
        return !TextUtils.isEmpty(strA) ? new JSONObject(strA).optLong("delay") : 0L;
    }

    public final void b(Context context) {
        synchronized (this) {
        }
        if (this.f95848b) {
            return;
        }
        long jA = a(context);
        if (jA > 0) {
            try {
                Thread.sleep(jA);
            } catch (Throwable unused) {
            }
        }
        this.f95848b = true;
    }

    public G1(C4939ba c4939ba) {
        this.f95848b = false;
        this.f95847a = c4939ba;
    }
}
