package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface B1 {
    /* synthetic */ void a(Intent intent);

    /* synthetic */ void a(Intent intent, int i10);

    /* synthetic */ void a(Intent intent, int i10, int i11);

    /* synthetic */ void b(Intent intent);

    /* synthetic */ void c(Intent intent);

    /* synthetic */ void onConfigurationChanged(Configuration configuration);

    /* synthetic */ void onCreate();

    /* synthetic */ void onDestroy();

    void pauseUserSession(@NonNull Bundle bundle);

    void reportData(int i10, Bundle bundle);

    void resumeUserSession(@NonNull Bundle bundle);
}
