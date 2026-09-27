package yads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class oj3 implements xq {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f153512f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f153513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f153514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f153515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f153516e;

    static {
        new wq() { // from class: yads.m74
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return oj3.a(bundle);
            }
        };
    }

    public oj3(int i10, int i11, int i12, float f10) {
        this.f153513b = i10;
        this.f153514c = i11;
        this.f153515d = i12;
        this.f153516e = f10;
    }

    public static oj3 a(Bundle bundle) {
        return new oj3(bundle.getInt(Integer.toString(0, 36), 0), bundle.getInt(Integer.toString(1, 36), 0), bundle.getInt(Integer.toString(2, 36), 0), bundle.getFloat(Integer.toString(3, 36), 1.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oj3) {
            oj3 oj3Var = (oj3) obj;
            if (this.f153513b == oj3Var.f153513b && this.f153514c == oj3Var.f153514c && this.f153515d == oj3Var.f153515d && this.f153516e == oj3Var.f153516e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f153516e) + ((((((this.f153513b + 217) * 31) + this.f153514c) * 31) + this.f153515d) * 31);
    }
}
