package ks;

import java.util.Random;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class c extends Random {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @l
    public static final a f102873d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f102874e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    public final f f102875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f102876c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(x xVar) {
            this();
        }

        public a() {
        }
    }

    public c(@l f impl) {
        m0.p(impl, "impl");
        this.f102875b = impl;
    }

    @l
    public final f d() {
        return this.f102875b;
    }

    @Override // java.util.Random
    public int next(int i10) {
        return this.f102875b.e(i10);
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return this.f102875b.g();
    }

    @Override // java.util.Random
    public void nextBytes(@l byte[] bytes) {
        m0.p(bytes, "bytes");
        this.f102875b.i(bytes);
    }

    @Override // java.util.Random
    public double nextDouble() {
        return this.f102875b.l();
    }

    @Override // java.util.Random
    public float nextFloat() {
        return this.f102875b.o();
    }

    @Override // java.util.Random
    public int nextInt() {
        return this.f102875b.p();
    }

    @Override // java.util.Random
    public long nextLong() {
        return this.f102875b.s();
    }

    @Override // java.util.Random
    public void setSeed(long j10) {
        if (this.f102876c) {
            throw new UnsupportedOperationException("Setting seed is not supported.");
        }
        this.f102876c = true;
    }

    @Override // java.util.Random
    public int nextInt(int i10) {
        return this.f102875b.q(i10);
    }
}
