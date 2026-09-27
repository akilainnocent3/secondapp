package androidx.work;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public UUID f20080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public a f20081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public e f20082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public Set<String> f20083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public e f20084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20085f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean d() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    @y0({y0.a.LIBRARY_GROUP})
    public e0(@NonNull UUID id2, @NonNull a state, @NonNull e outputData, @NonNull List<String> tags, @NonNull e progress, int runAttemptCount) {
        this.f20080a = id2;
        this.f20081b = state;
        this.f20082c = outputData;
        this.f20083d = new HashSet(tags);
        this.f20084e = progress;
        this.f20085f = runAttemptCount;
    }

    @NonNull
    public UUID a() {
        return this.f20080a;
    }

    @NonNull
    public e b() {
        return this.f20082c;
    }

    @NonNull
    public e c() {
        return this.f20084e;
    }

    @k.e0(from = 0)
    public int d() {
        return this.f20085f;
    }

    @NonNull
    public a e() {
        return this.f20081b;
    }

    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (o10 == null || e0.class != o10.getClass()) {
            return false;
        }
        e0 e0Var = (e0) o10;
        if (this.f20085f == e0Var.f20085f && this.f20080a.equals(e0Var.f20080a) && this.f20081b == e0Var.f20081b && this.f20082c.equals(e0Var.f20082c) && this.f20083d.equals(e0Var.f20083d)) {
            return this.f20084e.equals(e0Var.f20084e);
        }
        return false;
    }

    @NonNull
    public Set<String> f() {
        return this.f20083d;
    }

    public int hashCode() {
        return (((((((((this.f20080a.hashCode() * 31) + this.f20081b.hashCode()) * 31) + this.f20082c.hashCode()) * 31) + this.f20083d.hashCode()) * 31) + this.f20084e.hashCode()) * 31) + this.f20085f;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.f20080a + "', mState=" + this.f20081b + ", mOutputData=" + this.f20082c + ", mTags=" + this.f20083d + ", mProgress=" + this.f20084e + fw.b.f85383j;
    }
}
