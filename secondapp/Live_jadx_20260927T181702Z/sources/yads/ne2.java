package yads;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ne2 implements xq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f153022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f153023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fm1 f153024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f153025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f153026f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f153027g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f153028h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f153029i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f153030j;

    static {
        new wq() { // from class: yads.n64
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return ne2.a(bundle);
            }
        };
    }

    public ne2(Object obj, int i10, fm1 fm1Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        this.f153022b = obj;
        this.f153023c = i10;
        this.f153024d = fm1Var;
        this.f153025e = obj2;
        this.f153026f = i11;
        this.f153027g = j10;
        this.f153028h = j11;
        this.f153029i = i12;
        this.f153030j = i13;
    }

    public static ne2 a(Bundle bundle) {
        int i10 = bundle.getInt(Integer.toString(0, 36), -1);
        Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
        return new ne2(null, i10, bundle2 == null ? null : (fm1) fm1.f149163h.fromBundle(bundle2), null, bundle.getInt(Integer.toString(2, 36), -1), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getLong(Integer.toString(4, 36), -9223372036854775807L), bundle.getInt(Integer.toString(5, 36), -1), bundle.getInt(Integer.toString(6, 36), -1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ne2.class == obj.getClass()) {
            ne2 ne2Var = (ne2) obj;
            if (this.f153023c == ne2Var.f153023c && this.f153026f == ne2Var.f153026f && this.f153027g == ne2Var.f153027g && this.f153028h == ne2Var.f153028h && this.f153029i == ne2Var.f153029i && this.f153030j == ne2Var.f153030j && l92.a(this.f153022b, ne2Var.f153022b) && l92.a(this.f153025e, ne2Var.f153025e) && l92.a(this.f153024d, ne2Var.f153024d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f153022b, Integer.valueOf(this.f153023c), this.f153024d, this.f153025e, Integer.valueOf(this.f153026f), Long.valueOf(this.f153027g), Long.valueOf(this.f153028h), Integer.valueOf(this.f153029i), Integer.valueOf(this.f153030j)});
    }
}
