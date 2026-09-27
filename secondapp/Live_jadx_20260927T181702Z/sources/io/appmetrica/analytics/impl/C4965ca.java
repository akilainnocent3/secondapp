package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ca, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4965ca implements Co {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f97083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97084b;

    public C4965ca(@oy.l Context context, @oy.l String str) {
        this.f97083a = context;
        this.f97084b = str;
    }

    @Override // io.appmetrica.analytics.impl.Co
    @oy.m
    public final String a() {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f97083a, this.f97084b);
            if (fileFromSdkStorage == null) {
                return null;
            }
            fileFromSdkStorage.exists();
            File fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f97083a, this.f97084b);
            if (fileFromAppStorage != null) {
                FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
            }
            return xr.p.D(fileFromSdkStorage, null, 1, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.appmetrica.analytics.impl.Co
    public final void a(@oy.l String str) {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f97083a, this.f97084b);
            if (fileFromSdkStorage != null) {
                xr.p.K(fileFromSdkStorage, str, null, 2, null);
            }
        } catch (Throwable unused) {
        }
    }
}
