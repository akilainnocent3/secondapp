package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class vg0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final vg0 f156955g = new vg0(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f156956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f156957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f156958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f156959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f156960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f156961f;

    public vg0(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f156956a = f10;
        this.f156957b = f11;
        this.f156958c = f12;
        this.f156959d = f13;
        this.f156960e = f14;
        this.f156961f = f15;
    }

    public final float a() {
        return this.f156959d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg0)) {
            return false;
        }
        vg0 vg0Var = (vg0) obj;
        return Float.compare(this.f156956a, vg0Var.f156956a) == 0 && Float.compare(this.f156957b, vg0Var.f156957b) == 0 && Float.compare(this.f156958c, vg0Var.f156958c) == 0 && Float.compare(this.f156959d, vg0Var.f156959d) == 0 && Float.compare(this.f156960e, vg0Var.f156960e) == 0 && Float.compare(this.f156961f, vg0Var.f156961f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f156961f) + ((Float.floatToIntBits(this.f156960e) + ((Float.floatToIntBits(this.f156959d) + ((Float.floatToIntBits(this.f156958c) + ((Float.floatToIntBits(this.f156957b) + (Float.floatToIntBits(this.f156956a) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DisplayInsetsF(left=" + this.f156956a + ", top=" + this.f156957b + ", right=" + this.f156958c + ", bottom=" + this.f156959d + ", cutoutTop=" + this.f156960e + ", cutoutBottom=" + this.f156961f + gi.j.f86771d;
    }
}
