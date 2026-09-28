package com.google.android.recaptcha.internal;

import defpackage.jb5;
import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzov implements Closeable {
    private static final ThreadLocal zza = new zzou();
    private int zzb = 0;

    public static int zza() {
        return ((zzov) zza.get()).zzb;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.zzb;
        if (i > 0) {
            this.zzb = i - 1;
        } else {
            jb5.a("Mismatched calls to RecursionDepth (possible error in core library)");
        }
    }
}
