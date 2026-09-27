package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f70197d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f70198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f70199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f70200c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends t {
        @Override // com.mbridge.msdk.thrid.okio.t
        public t a(long j10) {
            return this;
        }

        @Override // com.mbridge.msdk.thrid.okio.t
        public t a(long j10, TimeUnit timeUnit) {
            return this;
        }

        @Override // com.mbridge.msdk.thrid.okio.t
        public void e() throws IOException {
        }
    }

    public t a(long j10, TimeUnit timeUnit) {
        if (j10 >= 0) {
            if (timeUnit == null) {
                throw new IllegalArgumentException("unit == null");
            }
            this.f70200c = timeUnit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException("timeout < 0: " + j10);
    }

    public t b() {
        this.f70200c = 0L;
        return this;
    }

    public long c() {
        if (this.f70198a) {
            return this.f70199b;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean d() {
        return this.f70198a;
    }

    public void e() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f70198a && this.f70199b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public long f() {
        return this.f70200c;
    }

    public t a(long j10) {
        this.f70198a = true;
        this.f70199b = j10;
        return this;
    }

    public t a() {
        this.f70198a = false;
        return this;
    }
}
