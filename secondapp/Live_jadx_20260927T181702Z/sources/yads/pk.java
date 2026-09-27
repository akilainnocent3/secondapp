package yads;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class pk implements xq {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final pk f153961h = new pk(0, 0, 1, 1, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f153962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f153963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f153964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f153965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f153966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ok f153967g;

    static {
        new wq() { // from class: yads.m84
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return pk.a(bundle);
            }
        };
    }

    public pk(int i10, int i11, int i12, int i13, int i14) {
        this.f153962b = i10;
        this.f153963c = i11;
        this.f153964d = i12;
        this.f153965e = i13;
        this.f153966f = i14;
    }

    public static pk a(Bundle bundle) {
        return new pk(bundle.containsKey(Integer.toString(0, 36)) ? bundle.getInt(Integer.toString(0, 36)) : 0, bundle.containsKey(Integer.toString(1, 36)) ? bundle.getInt(Integer.toString(1, 36)) : 0, bundle.containsKey(Integer.toString(2, 36)) ? bundle.getInt(Integer.toString(2, 36)) : 1, bundle.containsKey(Integer.toString(3, 36)) ? bundle.getInt(Integer.toString(3, 36)) : 1, bundle.containsKey(Integer.toString(4, 36)) ? bundle.getInt(Integer.toString(4, 36)) : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pk.class == obj.getClass()) {
            pk pkVar = (pk) obj;
            if (this.f153962b == pkVar.f153962b && this.f153963c == pkVar.f153963c && this.f153964d == pkVar.f153964d && this.f153965e == pkVar.f153965e && this.f153966f == pkVar.f153966f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f153962b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f153963c) * 31) + this.f153964d) * 31) + this.f153965e) * 31) + this.f153966f;
    }
}
