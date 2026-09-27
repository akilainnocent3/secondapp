package w4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import x4.b2;
import x4.m1;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 1;
    public static final int E = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final float f142194t = -3.4028235E38f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f142195u = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f142196v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f142197w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f142198x = 2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f142199y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f142200z = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final CharSequence f142201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Layout.Alignment f142202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Layout.Alignment f142203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Bitmap f142204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f142205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f142206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f142207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f142208h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f142209i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f142210j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f142211k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f142212l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f142213m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f142214n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f142215o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f142216p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f142217q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @m1
    public final int f142218r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final a f142193s = new c().B("").a();
    public static final String F = b2.k1(0);
    public static final String G = b2.k1(17);
    public static final String H = b2.k1(1);
    public static final String I = b2.k1(2);
    public static final String J = b2.k1(3);
    public static final String K = b2.k1(18);
    public static final String L = b2.k1(4);
    public static final String M = b2.k1(5);
    public static final String N = b2.k1(6);
    public static final String O = b2.k1(7);
    public static final String P = b2.k1(8);
    public static final String Q = b2.k1(9);
    public static final String R = b2.k1(10);
    public static final String S = b2.k1(11);
    public static final String T = b2.k1(12);
    public static final String U = b2.k1(13);
    public static final String V = b2.k1(14);
    public static final String W = b2.k1(15);
    public static final String X = b2.k1(16);
    public static final String Y = b2.k1(19);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @m1
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public CharSequence f142219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Bitmap f142220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Layout.Alignment f142221c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Layout.Alignment f142222d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f142223e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f142224f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f142225g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f142226h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f142227i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f142228j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f142229k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f142230l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f142231m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f142232n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @k.k
        public int f142233o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f142234p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public float f142235q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f142236r;

        @qj.a
        public c A(float f10) {
            this.f142230l = f10;
            return this;
        }

        @qj.a
        public c B(CharSequence charSequence) {
            this.f142219a = charSequence;
            this.f142220b = null;
            return this;
        }

        @qj.a
        public c C(@Nullable Layout.Alignment alignment) {
            this.f142221c = alignment;
            return this;
        }

        @qj.a
        public c D(float f10, int i10) {
            this.f142229k = f10;
            this.f142228j = i10;
            return this;
        }

        @qj.a
        public c E(int i10) {
            this.f142234p = i10;
            return this;
        }

        @qj.a
        public c F(@k.k int i10) {
            this.f142233o = i10;
            this.f142232n = true;
            return this;
        }

        @qj.a
        public c G(int i10) {
            this.f142236r = i10;
            return this;
        }

        public a a() {
            return new a(this.f142219a, this.f142221c, this.f142222d, this.f142220b, this.f142223e, this.f142224f, this.f142225g, this.f142226h, this.f142227i, this.f142228j, this.f142229k, this.f142230l, this.f142231m, this.f142232n, this.f142233o, this.f142234p, this.f142235q, this.f142236r);
        }

        @qj.a
        public c b() {
            this.f142232n = false;
            return this;
        }

        @Nullable
        @ky.d
        public Bitmap c() {
            return this.f142220b;
        }

        @ky.d
        public float d() {
            return this.f142231m;
        }

        @ky.d
        public float e() {
            return this.f142223e;
        }

        @ky.d
        public int f() {
            return this.f142225g;
        }

        @ky.d
        public int g() {
            return this.f142224f;
        }

        @ky.d
        public float h() {
            return this.f142226h;
        }

        @ky.d
        public int i() {
            return this.f142227i;
        }

        @ky.d
        public float j() {
            return this.f142230l;
        }

        @Nullable
        @ky.d
        public CharSequence k() {
            return this.f142219a;
        }

        @Nullable
        @ky.d
        public Layout.Alignment l() {
            return this.f142221c;
        }

        @ky.d
        public float m() {
            return this.f142229k;
        }

        @ky.d
        public int n() {
            return this.f142228j;
        }

        @ky.d
        public int o() {
            return this.f142234p;
        }

        @k.k
        @ky.d
        public int p() {
            return this.f142233o;
        }

        @ky.d
        public int q() {
            return this.f142236r;
        }

        public boolean r() {
            return this.f142232n;
        }

        @qj.a
        public c s(Bitmap bitmap) {
            this.f142220b = bitmap;
            this.f142219a = null;
            return this;
        }

        @qj.a
        public c t(float f10) {
            this.f142231m = f10;
            return this;
        }

        @qj.a
        public c u(float f10, int i10) {
            this.f142223e = f10;
            this.f142224f = i10;
            return this;
        }

        @qj.a
        public c v(int i10) {
            this.f142225g = i10;
            return this;
        }

        @qj.a
        public c w(@Nullable Layout.Alignment alignment) {
            this.f142222d = alignment;
            return this;
        }

        @qj.a
        public c x(float f10) {
            this.f142226h = f10;
            return this;
        }

        @qj.a
        public c y(int i10) {
            this.f142227i = i10;
            return this;
        }

        @qj.a
        public c z(float f10) {
            this.f142235q = f10;
            return this;
        }

        public c() {
            this.f142219a = null;
            this.f142220b = null;
            this.f142221c = null;
            this.f142222d = null;
            this.f142223e = -3.4028235E38f;
            this.f142224f = Integer.MIN_VALUE;
            this.f142225g = Integer.MIN_VALUE;
            this.f142226h = -3.4028235E38f;
            this.f142227i = Integer.MIN_VALUE;
            this.f142228j = Integer.MIN_VALUE;
            this.f142229k = -3.4028235E38f;
            this.f142230l = -3.4028235E38f;
            this.f142231m = -3.4028235E38f;
            this.f142232n = false;
            this.f142233o = -16777216;
            this.f142234p = Integer.MIN_VALUE;
        }

        public c(a aVar) {
            this.f142219a = aVar.f142201a;
            this.f142220b = aVar.f142204d;
            this.f142221c = aVar.f142202b;
            this.f142222d = aVar.f142203c;
            this.f142223e = aVar.f142205e;
            this.f142224f = aVar.f142206f;
            this.f142225g = aVar.f142207g;
            this.f142226h = aVar.f142208h;
            this.f142227i = aVar.f142209i;
            this.f142228j = aVar.f142214n;
            this.f142229k = aVar.f142215o;
            this.f142230l = aVar.f142210j;
            this.f142231m = aVar.f142211k;
            this.f142232n = aVar.f142212l;
            this.f142233o = aVar.f142213m;
            this.f142234p = aVar.f142216p;
            this.f142235q = aVar.f142217q;
            this.f142236r = aVar.f142218r;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    @m1
    public static a b(Bundle bundle) {
        c cVar = new c();
        CharSequence charSequence = bundle.getCharSequence(F);
        if (charSequence != null) {
            cVar.B(charSequence);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(G);
            if (parcelableArrayList != null) {
                SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    w4.f.c((Bundle) it.next(), spannableStringValueOf);
                }
                cVar.B(spannableStringValueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(H);
        if (alignment != null) {
            cVar.C(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(I);
        if (alignment2 != null) {
            cVar.w(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(J);
        if (bitmap != null) {
            cVar.s(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(K);
            if (byteArray != null) {
                cVar.s(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        String str = L;
        if (bundle.containsKey(str)) {
            String str2 = M;
            if (bundle.containsKey(str2)) {
                cVar.u(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = N;
        if (bundle.containsKey(str3)) {
            cVar.v(bundle.getInt(str3));
        }
        String str4 = O;
        if (bundle.containsKey(str4)) {
            cVar.x(bundle.getFloat(str4));
        }
        String str5 = P;
        if (bundle.containsKey(str5)) {
            cVar.y(bundle.getInt(str5));
        }
        String str6 = R;
        if (bundle.containsKey(str6)) {
            String str7 = Q;
            if (bundle.containsKey(str7)) {
                cVar.D(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = S;
        if (bundle.containsKey(str8)) {
            cVar.A(bundle.getFloat(str8));
        }
        String str9 = T;
        if (bundle.containsKey(str9)) {
            cVar.t(bundle.getFloat(str9));
        }
        String str10 = U;
        if (bundle.containsKey(str10)) {
            cVar.F(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(V, false)) {
            cVar.b();
        }
        String str11 = W;
        if (bundle.containsKey(str11)) {
            cVar.E(bundle.getInt(str11));
        }
        String str12 = X;
        if (bundle.containsKey(str12)) {
            cVar.z(bundle.getFloat(str12));
        }
        String str13 = Y;
        if (bundle.containsKey(str13)) {
            cVar.G(bundle.getInt(str13));
        }
        return cVar.a();
    }

    @m1
    public c a() {
        return new c();
    }

    @m1
    public Bundle c() {
        Bundle bundleE = e();
        Bitmap bitmap = this.f142204d;
        if (bitmap != null) {
            bundleE.putParcelable(J, bitmap);
        }
        return bundleE;
    }

    @m1
    @Deprecated
    public Bundle d() {
        return c();
    }

    public final Bundle e() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f142201a;
        if (charSequence != null) {
            bundle.putCharSequence(F, charSequence);
            CharSequence charSequence2 = this.f142201a;
            if (charSequence2 instanceof Spanned) {
                ArrayList<Bundle> arrayListA = w4.f.a((Spanned) charSequence2);
                if (!arrayListA.isEmpty()) {
                    bundle.putParcelableArrayList(G, arrayListA);
                }
            }
        }
        bundle.putSerializable(H, this.f142202b);
        bundle.putSerializable(I, this.f142203c);
        bundle.putFloat(L, this.f142205e);
        bundle.putInt(M, this.f142206f);
        bundle.putInt(N, this.f142207g);
        bundle.putFloat(O, this.f142208h);
        bundle.putInt(P, this.f142209i);
        bundle.putInt(Q, this.f142214n);
        bundle.putFloat(R, this.f142215o);
        bundle.putFloat(S, this.f142210j);
        bundle.putFloat(T, this.f142211k);
        bundle.putBoolean(V, this.f142212l);
        bundle.putInt(U, this.f142213m);
        bundle.putInt(W, this.f142216p);
        bundle.putFloat(X, this.f142217q);
        bundle.putInt(Y, this.f142218r);
        return bundle;
    }

    public boolean equals(@Nullable Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (TextUtils.equals(this.f142201a, aVar.f142201a) && this.f142202b == aVar.f142202b && this.f142203c == aVar.f142203c && ((bitmap = this.f142204d) != null ? !((bitmap2 = aVar.f142204d) == null || !bitmap.sameAs(bitmap2)) : aVar.f142204d == null) && this.f142205e == aVar.f142205e && this.f142206f == aVar.f142206f && this.f142207g == aVar.f142207g && this.f142208h == aVar.f142208h && this.f142209i == aVar.f142209i && this.f142210j == aVar.f142210j && this.f142211k == aVar.f142211k && this.f142212l == aVar.f142212l && this.f142213m == aVar.f142213m && this.f142214n == aVar.f142214n && this.f142215o == aVar.f142215o && this.f142216p == aVar.f142216p && this.f142217q == aVar.f142217q && this.f142218r == aVar.f142218r) {
                return true;
            }
        }
        return false;
    }

    @m1
    public Bundle f() {
        Bundle bundleE = e();
        if (this.f142204d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            l0.g0(this.f142204d.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundleE.putByteArray(K, byteArrayOutputStream.toByteArray());
        }
        return bundleE;
    }

    public int hashCode() {
        return Objects.hash(this.f142201a, this.f142202b, this.f142203c, this.f142204d, Float.valueOf(this.f142205e), Integer.valueOf(this.f142206f), Integer.valueOf(this.f142207g), Float.valueOf(this.f142208h), Integer.valueOf(this.f142209i), Float.valueOf(this.f142210j), Float.valueOf(this.f142211k), Boolean.valueOf(this.f142212l), Integer.valueOf(this.f142213m), Integer.valueOf(this.f142214n), Float.valueOf(this.f142215o), Integer.valueOf(this.f142216p), Float.valueOf(this.f142217q), Integer.valueOf(this.f142218r));
    }

    public a(@Nullable CharSequence charSequence, @Nullable Layout.Alignment alignment, @Nullable Layout.Alignment alignment2, @Nullable Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15, int i16) {
        if (charSequence == null) {
            l0.E(bitmap);
        } else {
            l0.d(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f142201a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f142201a = charSequence.toString();
        } else {
            this.f142201a = null;
        }
        this.f142202b = alignment;
        this.f142203c = alignment2;
        this.f142204d = bitmap;
        this.f142205e = f10;
        this.f142206f = i10;
        this.f142207g = i11;
        this.f142208h = f11;
        this.f142209i = i12;
        this.f142210j = f13;
        this.f142211k = f14;
        this.f142212l = z10;
        this.f142213m = i14;
        this.f142214n = i13;
        this.f142215o = f12;
        this.f142216p = i15;
        this.f142217q = f15;
        this.f142218r = i16;
    }
}
