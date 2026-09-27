package zf;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f161236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f161237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f161238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f161239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f161240e;

    public i0(Object obj) {
        this(obj, -1L);
    }

    public i0 a(Object obj) {
        return this.f161236a.equals(obj) ? this : new i0(obj, this.f161237b, this.f161238c, this.f161239d, this.f161240e);
    }

    public i0 b(long j10) {
        return this.f161239d == j10 ? this : new i0(this.f161236a, this.f161237b, this.f161238c, j10, this.f161240e);
    }

    public boolean c() {
        return this.f161237b != -1;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f161236a.equals(i0Var.f161236a) && this.f161237b == i0Var.f161237b && this.f161238c == i0Var.f161238c && this.f161239d == i0Var.f161239d && this.f161240e == i0Var.f161240e;
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f161236a.hashCode()) * 31) + this.f161237b) * 31) + this.f161238c) * 31) + ((int) this.f161239d)) * 31) + this.f161240e;
    }

    public i0(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public i0(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }

    public i0(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    public i0(i0 i0Var) {
        this.f161236a = i0Var.f161236a;
        this.f161237b = i0Var.f161237b;
        this.f161238c = i0Var.f161238c;
        this.f161239d = i0Var.f161239d;
        this.f161240e = i0Var.f161240e;
    }

    public i0(Object obj, int i10, int i11, long j10, int i12) {
        this.f161236a = obj;
        this.f161237b = i10;
        this.f161238c = i11;
        this.f161239d = j10;
        this.f161240e = i12;
    }
}
