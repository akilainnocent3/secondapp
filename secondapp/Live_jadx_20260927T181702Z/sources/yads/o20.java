package yads;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class o20 implements xq {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final o20 f153316s = new o20("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final wq f153317t = new wq() { // from class: yads.b74
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return o20.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f153318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f153319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Layout.Alignment f153320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bitmap f153321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f153322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f153323g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f153324h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f153325i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f153326j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f153327k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f153328l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f153329m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f153330n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f153331o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f153332p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f153333q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f153334r;

    public o20(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            ni.a(bitmap);
        } else {
            ni.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f153318b = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f153318b = charSequence.toString();
        } else {
            this.f153318b = null;
        }
        this.f153319c = alignment;
        this.f153320d = alignment2;
        this.f153321e = bitmap;
        this.f153322f = f10;
        this.f153323g = i10;
        this.f153324h = i11;
        this.f153325i = f11;
        this.f153326j = i12;
        this.f153327k = f13;
        this.f153328l = f14;
        this.f153329m = z10;
        this.f153330n = i14;
        this.f153331o = i13;
        this.f153332p = f12;
        this.f153333q = i15;
        this.f153334r = f15;
    }

    public static final o20 a(Bundle bundle) {
        float f10;
        int i10;
        float f11;
        int i11;
        int i12;
        boolean z10;
        CharSequence charSequence = bundle.getCharSequence(Integer.toString(0, 36));
        CharSequence charSequence2 = charSequence != null ? charSequence : null;
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(Integer.toString(1, 36));
        Layout.Alignment alignment2 = alignment != null ? alignment : null;
        Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(Integer.toString(2, 36));
        Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
        Bitmap bitmap = (Bitmap) bundle.getParcelable(Integer.toString(3, 36));
        Bitmap bitmap2 = bitmap != null ? bitmap : null;
        if (bundle.containsKey(Integer.toString(4, 36)) && bundle.containsKey(Integer.toString(5, 36))) {
            f10 = bundle.getFloat(Integer.toString(4, 36));
            i10 = bundle.getInt(Integer.toString(5, 36));
        } else {
            f10 = -3.4028235E38f;
            i10 = Integer.MIN_VALUE;
        }
        int i13 = bundle.containsKey(Integer.toString(6, 36)) ? bundle.getInt(Integer.toString(6, 36)) : Integer.MIN_VALUE;
        float f12 = bundle.containsKey(Integer.toString(7, 36)) ? bundle.getFloat(Integer.toString(7, 36)) : -3.4028235E38f;
        int i14 = bundle.containsKey(Integer.toString(8, 36)) ? bundle.getInt(Integer.toString(8, 36)) : Integer.MIN_VALUE;
        if (bundle.containsKey(Integer.toString(10, 36)) && bundle.containsKey(Integer.toString(9, 36))) {
            f11 = bundle.getFloat(Integer.toString(10, 36));
            i11 = bundle.getInt(Integer.toString(9, 36));
        } else {
            f11 = -3.4028235E38f;
            i11 = Integer.MIN_VALUE;
        }
        float f13 = bundle.containsKey(Integer.toString(11, 36)) ? bundle.getFloat(Integer.toString(11, 36)) : -3.4028235E38f;
        float f14 = bundle.containsKey(Integer.toString(12, 36)) ? bundle.getFloat(Integer.toString(12, 36)) : -3.4028235E38f;
        if (bundle.containsKey(Integer.toString(13, 36))) {
            i12 = bundle.getInt(Integer.toString(13, 36));
            z10 = true;
        } else {
            i12 = -16777216;
            z10 = false;
        }
        return new o20(charSequence2, alignment2, alignment4, bitmap2, f10, i10, i13, f12, i14, i11, f11, f13, f14, !bundle.getBoolean(Integer.toString(14, 36), false) ? false : z10, i12, bundle.containsKey(Integer.toString(15, 36)) ? bundle.getInt(Integer.toString(15, 36)) : Integer.MIN_VALUE, bundle.containsKey(Integer.toString(16, 36)) ? bundle.getFloat(Integer.toString(16, 36)) : 0.0f);
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && o20.class == obj.getClass()) {
            o20 o20Var = (o20) obj;
            if (TextUtils.equals(this.f153318b, o20Var.f153318b) && this.f153319c == o20Var.f153319c && this.f153320d == o20Var.f153320d && ((bitmap = this.f153321e) != null ? !((bitmap2 = o20Var.f153321e) == null || !bitmap.sameAs(bitmap2)) : o20Var.f153321e == null) && this.f153322f == o20Var.f153322f && this.f153323g == o20Var.f153323g && this.f153324h == o20Var.f153324h && this.f153325i == o20Var.f153325i && this.f153326j == o20Var.f153326j && this.f153327k == o20Var.f153327k && this.f153328l == o20Var.f153328l && this.f153329m == o20Var.f153329m && this.f153330n == o20Var.f153330n && this.f153331o == o20Var.f153331o && this.f153332p == o20Var.f153332p && this.f153333q == o20Var.f153333q && this.f153334r == o20Var.f153334r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f153318b, this.f153319c, this.f153320d, this.f153321e, Float.valueOf(this.f153322f), Integer.valueOf(this.f153323g), Integer.valueOf(this.f153324h), Float.valueOf(this.f153325i), Integer.valueOf(this.f153326j), Float.valueOf(this.f153327k), Float.valueOf(this.f153328l), Boolean.valueOf(this.f153329m), Integer.valueOf(this.f153330n), Integer.valueOf(this.f153331o), Float.valueOf(this.f153332p), Integer.valueOf(this.f153333q), Float.valueOf(this.f153334r)});
    }
}
