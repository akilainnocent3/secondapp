package io.appmetrica.analytics.impl;

import android.location.Location;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface Ic {
    void a(Location location);

    void a(String str);

    void a(String str, String str2);

    void a(boolean z10);

    void a(boolean z10, boolean z11);

    void clearAppEnvironment();

    void putAppEnvironmentValue(String str, String str2);

    void setDataSendingEnabled(boolean z10);

    void setUserProfileID(String str);
}
