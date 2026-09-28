package defpackage;

import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class al1 extends tge0.a {
    public final List<Size> a;
    public final List<Size> b;
    public final int c;
    public final int d;
    public final int e;

    public al1(List<Size> list, List<Size> list2, int i, int i2, int i3) {
        this.a = list;
        this.b = list2;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    @Override // tge0.a
    public final List<Size> a() {
        return this.a;
    }

    @Override // tge0.a
    public final List<Size> b() {
        return this.b;
    }

    @Override // tge0.a
    public final int c() {
        return this.e;
    }

    @Override // tge0.a
    public final int d() {
        return this.c;
    }

    @Override // tge0.a
    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tge0.a)) {
            return false;
        }
        tge0.a aVar = (tge0.a) obj;
        List<Size> list = this.a;
        if (list == null) {
            if (aVar.a() != null) {
                return false;
            }
        } else if (!list.equals(aVar.a())) {
            return false;
        }
        List<Size> list2 = this.b;
        if (list2 == null) {
            if (aVar.b() != null) {
                return false;
            }
        } else if (!list2.equals(aVar.b())) {
            return false;
        }
        return this.c == aVar.d() && this.d == aVar.e() && this.e == aVar.c();
    }

    public final int hashCode() {
        List<Size> list = this.a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        List<Size> list2 = this.b;
        return this.e ^ (((((((list2 != null ? list2.hashCode() : 0) ^ iHashCode) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BestSizesAndMaxFpsForConfigs{bestSizes=");
        sb.append(this.a);
        sb.append(", bestSizesForStreamUseCase=");
        sb.append(this.b);
        sb.append(", maxFpsForBestSizes=");
        sb.append(this.c);
        sb.append(", maxFpsForStreamUseCase=");
        sb.append(this.d);
        sb.append(", maxFpsForAllSizes=");
        return zk1.a(this.e, "}", sb);
    }
}
