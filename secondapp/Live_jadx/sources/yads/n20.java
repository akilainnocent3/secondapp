package yads;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.SpannableStringBuilder;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class n20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f152831a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f152832b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Layout.Alignment f152833c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Layout.Alignment f152834d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f152835e = -3.4028235E38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f152836f = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f152837g = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f152838h = -3.4028235E38f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f152839i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f152840j = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f152841k = -3.4028235E38f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f152842l = -3.4028235E38f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f152843m = -3.4028235E38f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f152844n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f152845o = -16777216;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f152846p = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f152847q;

    public final n20 a(float f10) {
        this.f152835e = f10;
        this.f152836f = 0;
        return this;
    }

    public final n20 b(float f10) {
        this.f152838h = f10;
        return this;
    }

    public final void c(int i10) {
        this.f152845o = i10;
        this.f152844n = true;
    }

    public final n20 b(int i10) {
        this.f152839i = i10;
        return this;
    }

    public final n20 a(int i10) {
        this.f152837g = i10;
        return this;
    }

    public final n20 b() {
        this.f152842l = -3.4028235E38f;
        return this;
    }

    public final n20 a(SpannableStringBuilder spannableStringBuilder) {
        this.f152831a = spannableStringBuilder;
        return this;
    }

    public final n20 a(Layout.Alignment alignment) {
        this.f152833c = alignment;
        return this;
    }

    public final o20 a() {
        return new o20(this.f152831a, this.f152833c, this.f152834d, this.f152832b, this.f152835e, this.f152836f, this.f152837g, this.f152838h, this.f152839i, this.f152840j, this.f152841k, this.f152842l, this.f152843m, this.f152844n, this.f152845o, this.f152846p, this.f152847q);
    }
}
