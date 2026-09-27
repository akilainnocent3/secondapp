package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.da, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4991da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Boolean f97185a;

    public final void a(Context context) {
        if (this.f97185a == null) {
            synchronized (this) {
                try {
                    if (this.f97185a == null) {
                        boolean z10 = false;
                        try {
                            File fileFromAppStorage = FileUtils.getFileFromAppStorage(context, "uuid.dat");
                            boolean zExists = fileFromAppStorage != null ? fileFromAppStorage.exists() : false;
                            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(context, "uuid.dat");
                            boolean zExists2 = fileFromSdkStorage != null ? fileFromSdkStorage.exists() : false;
                            if (zExists || zExists2) {
                                z10 = true;
                            }
                        } catch (Throwable unused) {
                        }
                        this.f97185a = Boolean.valueOf(z10);
                    }
                    dr.w2 w2Var = dr.w2.f79517a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
