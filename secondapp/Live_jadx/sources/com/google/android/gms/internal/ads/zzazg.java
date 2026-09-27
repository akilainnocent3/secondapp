package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzazg implements Runnable {
    private zzazg() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzazh.zzd = MessageDigest.getInstance("MD5");
            countDownLatch = zzazh.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzazh.zzb;
        } catch (Throwable th2) {
            zzazh.zzb.countDown();
            throw th2;
        }
        countDownLatch.countDown();
    }

    public /* synthetic */ zzazg(byte[] bArr) {
    }
}
