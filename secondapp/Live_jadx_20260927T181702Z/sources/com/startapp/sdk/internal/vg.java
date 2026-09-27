package com.startapp.sdk.internal;

import android.content.pm.PackageInfo;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class vg implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long j10 = ((PackageInfo) obj).firstInstallTime;
        long j11 = ((PackageInfo) obj2).firstInstallTime;
        if (j10 > j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }
}
