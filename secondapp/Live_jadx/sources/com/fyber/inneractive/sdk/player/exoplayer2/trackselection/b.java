package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f46921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f46923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o[] f46924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f46925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f46926f;

    public b(y yVar, int... iArr) {
        if (iArr.length <= 0) {
            throw new IllegalStateException();
        }
        yVar.getClass();
        this.f46921a = yVar;
        int length = iArr.length;
        this.f46922b = length;
        this.f46924d = new o[length];
        int i10 = 0;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f46924d[i11] = yVar.f46910b[iArr[i11]];
        }
        Arrays.sort(this.f46924d, new a());
        this.f46923c = new int[this.f46922b];
        while (true) {
            int i12 = this.f46922b;
            if (i10 >= i12) {
                this.f46925e = new long[i12];
                return;
            } else {
                this.f46923c[i10] = yVar.a(this.f46924d[i10]);
                i10++;
            }
        }
    }

    public abstract int a();

    public final boolean a(int i10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.f46925e[i10] > jElapsedRealtime;
        int i11 = 0;
        while (i11 < this.f46922b && !z10) {
            z10 = i11 != i10 && this.f46925e[i11] <= jElapsedRealtime;
            i11++;
        }
        if (!z10) {
            return false;
        }
        long[] jArr = this.f46925e;
        jArr[i10] = Math.max(jArr[i10], jElapsedRealtime + 60000);
        return true;
    }

    public abstract Object b();

    public abstract int c();

    public abstract void d();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f46921a == bVar.f46921a && Arrays.equals(this.f46923c, bVar.f46923c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f46926f == 0) {
            this.f46926f = Arrays.hashCode(this.f46923c) + (System.identityHashCode(this.f46921a) * 31);
        }
        return this.f46926f;
    }
}
