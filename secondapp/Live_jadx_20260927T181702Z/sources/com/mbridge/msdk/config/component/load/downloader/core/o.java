package com.mbridge.msdk.config.component.load.downloader.core;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class o implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f65453a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f65454a;

        public a(Runnable runnable) {
            this.f65454a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.setThreadPriority(o.this.f65453a);
            } catch (Throwable unused) {
            }
            try {
                this.f65454a.run();
            } catch (Exception unused2) {
            }
        }
    }

    public o(int i10) {
        this.f65453a = i10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(new a(runnable));
        thread.setName("mb_download_thread");
        return thread;
    }
}
