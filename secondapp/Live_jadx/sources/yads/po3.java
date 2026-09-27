package yads;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class po3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f154038c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f154036a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f154037b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f154039d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f154040e = -3.4028235E38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f154041f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f154042g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f154043h = -3.4028235E38f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f154044i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f154045j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f154046k = Integer.MIN_VALUE;

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    public final n20 a() {
        Layout.Alignment alignment;
        float f10 = this.f154043h;
        float f11 = -3.4028235E38f;
        if (f10 == -3.4028235E38f) {
            int i10 = this.f154039d;
            if (i10 != 4) {
                f10 = i10 != 5 ? 0.5f : 1.0f;
            } else {
                f10 = 0.0f;
            }
        }
        int i11 = this.f154044i;
        if (i11 == Integer.MIN_VALUE) {
            int i12 = this.f154039d;
            if (i12 == 1) {
                i11 = 0;
            } else if (i12 == 3) {
                i11 = 2;
            } else if (i12 == 4) {
                i11 = 0;
            } else if (i12 != 5) {
                i11 = 1;
            } else {
                i11 = 2;
            }
        }
        n20 n20Var = new n20();
        int i13 = this.f154039d;
        if (i13 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i13 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i13 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i13 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i13 != 5) {
            kf1.a("Unknown textAlignment: ", i13, "WebvttCueParser");
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        n20Var.f152833c = alignment;
        float f12 = this.f154040e;
        int i14 = this.f154041f;
        if (f12 != -3.4028235E38f && i14 == 0 && (f12 < 0.0f || f12 > 1.0f)) {
            f11 = 1.0f;
        } else if (f12 != -3.4028235E38f) {
            f11 = f12;
        } else if (i14 == 0) {
            f11 = 1.0f;
        }
        n20Var.f152835e = f11;
        n20Var.f152836f = i14;
        n20Var.f152837g = this.f154042g;
        n20Var.f152838h = f10;
        n20Var.f152839i = i11;
        float f13 = this.f154045j;
        if (i11 == 0) {
            f10 = 1.0f - f10;
        } else if (i11 == 1) {
            f10 = f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
        } else if (i11 != 2) {
            throw new IllegalStateException(String.valueOf(i11));
        }
        n20Var.f152842l = Math.min(f13, f10);
        n20Var.f152846p = this.f154046k;
        CharSequence charSequence = this.f154038c;
        if (charSequence != null) {
            n20Var.f152831a = charSequence;
        }
        return n20Var;
    }
}
