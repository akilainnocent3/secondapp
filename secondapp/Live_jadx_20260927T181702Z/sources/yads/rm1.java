package yads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public class rm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f155021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f155022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f155023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f155024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f155025e;

    public rm1(int i10, long j10, Object obj) {
        this(obj, -1, -1, j10, i10);
    }

    public final boolean a() {
        return this.f155022b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm1)) {
            return false;
        }
        rm1 rm1Var = (rm1) obj;
        return this.f155021a.equals(rm1Var.f155021a) && this.f155022b == rm1Var.f155022b && this.f155023c == rm1Var.f155023c && this.f155024d == rm1Var.f155024d && this.f155025e == rm1Var.f155025e;
    }

    public final int hashCode() {
        return ((((((((this.f155021a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f155022b) * 31) + this.f155023c) * 31) + ((int) this.f155024d)) * 31) + this.f155025e;
    }

    public rm1(Object obj) {
        this(obj, -1L);
    }

    public rm1(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    public rm1(Object obj, int i10, int i11, long j10, int i12) {
        this.f155021a = obj;
        this.f155022b = i10;
        this.f155023c = i11;
        this.f155024d = j10;
        this.f155025e = i12;
    }

    public rm1(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public rm1(rm1 rm1Var) {
        this.f155021a = rm1Var.f155021a;
        this.f155022b = rm1Var.f155022b;
        this.f155023c = rm1Var.f155023c;
        this.f155024d = rm1Var.f155024d;
        this.f155025e = rm1Var.f155025e;
    }
}
