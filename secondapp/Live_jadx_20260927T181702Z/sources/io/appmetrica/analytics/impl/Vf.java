package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Vf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f96617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Consumer f96618b;

    public Vf(File file, C5090h6 c5090h6) {
        this.f96617a = file;
        this.f96618b = c5090h6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File[] fileArrListFiles;
        if (!this.f96617a.exists() || !this.f96617a.isDirectory() || (fileArrListFiles = this.f96617a.listFiles()) == null || fileArrListFiles.length == 0) {
            return;
        }
        for (File file : fileArrListFiles) {
            try {
                this.f96618b.consume(file);
            } catch (Throwable unused) {
            }
        }
    }
}
