package yads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class va0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mx0 f156880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mx0 f156881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f156882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f156883e;

    public va0(String str, mx0 mx0Var, mx0 mx0Var2, int i10, int i11) {
        ni.a(i10 == 0 || i11 == 0);
        this.f156879a = ni.a(str);
        this.f156880b = (mx0) ni.a(mx0Var);
        this.f156881c = (mx0) ni.a(mx0Var2);
        this.f156882d = i10;
        this.f156883e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && va0.class == obj.getClass()) {
            va0 va0Var = (va0) obj;
            if (this.f156882d == va0Var.f156882d && this.f156883e == va0Var.f156883e && this.f156879a.equals(va0Var.f156879a) && this.f156880b.equals(va0Var.f156880b) && this.f156881c.equals(va0Var.f156881c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f156881c.hashCode() + ((this.f156880b.hashCode() + k4.a(this.f156879a, (((this.f156882d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f156883e) * 31, 31)) * 31);
    }
}
