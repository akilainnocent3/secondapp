package og;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import eh.o1;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import zi.f0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b implements re.j {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 1;
    public static final int E = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final float f119008t = -3.4028235E38f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f119009u = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f119010v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f119011w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f119012x = 2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f119013y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f119014z = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final CharSequence f119015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Layout.Alignment f119016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Layout.Alignment f119017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Bitmap f119018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f119019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f119020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f119021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f119022i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f119023j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f119024k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f119025l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f119026m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f119027n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f119028o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f119029p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f119030q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f119031r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f119007s = new c().A("").a();
    public static final String F = o1.R0(0);
    public static final String G = o1.R0(1);
    public static final String H = o1.R0(2);
    public static final String I = o1.R0(3);
    public static final String J = o1.R0(4);
    public static final String K = o1.R0(5);
    public static final String L = o1.R0(6);
    public static final String M = o1.R0(7);
    public static final String N = o1.R0(8);
    public static final String O = o1.R0(9);
    public static final String P = o1.R0(10);
    public static final String Q = o1.R0(11);
    public static final String R = o1.R0(12);
    public static final String S = o1.R0(13);
    public static final String T = o1.R0(14);
    public static final String U = o1.R0(15);
    public static final String V = o1.R0(16);
    public static final re.j.a<b> W = new re.j.a() { // from class: og.a
        @Override // re.j.a
        public final re.j fromBundle(Bundle bundle) {
            return b.c(bundle);
        }
    };

    /* JADX INFO: renamed from: og.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC1114b {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public CharSequence f119032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Bitmap f119033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Layout.Alignment f119034c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Layout.Alignment f119035d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f119036e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f119037f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f119038g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f119039h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f119040i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f119041j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f119042k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f119043l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f119044m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f119045n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @k.k
        public int f119046o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f119047p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public float f119048q;

        @qj.a
        public c A(CharSequence charSequence) {
            this.f119032a = charSequence;
            return this;
        }

        @qj.a
        public c B(@Nullable Layout.Alignment alignment) {
            this.f119034c = alignment;
            return this;
        }

        @qj.a
        public c C(float f10, int i10) {
            this.f119042k = f10;
            this.f119041j = i10;
            return this;
        }

        @qj.a
        public c D(int i10) {
            this.f119047p = i10;
            return this;
        }

        @qj.a
        public c E(@k.k int i10) {
            this.f119046o = i10;
            this.f119045n = true;
            return this;
        }

        public b a() {
            return new b(this.f119032a, this.f119034c, this.f119035d, this.f119033b, this.f119036e, this.f119037f, this.f119038g, this.f119039h, this.f119040i, this.f119041j, this.f119042k, this.f119043l, this.f119044m, this.f119045n, this.f119046o, this.f119047p, this.f119048q);
        }

        @qj.a
        public c b() {
            this.f119045n = false;
            return this;
        }

        @Nullable
        @ky.d
        public Bitmap c() {
            return this.f119033b;
        }

        @ky.d
        public float d() {
            return this.f119044m;
        }

        @ky.d
        public float e() {
            return this.f119036e;
        }

        @ky.d
        public int f() {
            return this.f119038g;
        }

        @ky.d
        public int g() {
            return this.f119037f;
        }

        @ky.d
        public float h() {
            return this.f119039h;
        }

        @ky.d
        public int i() {
            return this.f119040i;
        }

        @ky.d
        public float j() {
            return this.f119043l;
        }

        @Nullable
        @ky.d
        public CharSequence k() {
            return this.f119032a;
        }

        @Nullable
        @ky.d
        public Layout.Alignment l() {
            return this.f119034c;
        }

        @ky.d
        public float m() {
            return this.f119042k;
        }

        @ky.d
        public int n() {
            return this.f119041j;
        }

        @ky.d
        public int o() {
            return this.f119047p;
        }

        @k.k
        @ky.d
        public int p() {
            return this.f119046o;
        }

        public boolean q() {
            return this.f119045n;
        }

        @qj.a
        public c r(Bitmap bitmap) {
            this.f119033b = bitmap;
            return this;
        }

        @qj.a
        public c s(float f10) {
            this.f119044m = f10;
            return this;
        }

        @qj.a
        public c t(float f10, int i10) {
            this.f119036e = f10;
            this.f119037f = i10;
            return this;
        }

        @qj.a
        public c u(int i10) {
            this.f119038g = i10;
            return this;
        }

        @qj.a
        public c v(@Nullable Layout.Alignment alignment) {
            this.f119035d = alignment;
            return this;
        }

        @qj.a
        public c w(float f10) {
            this.f119039h = f10;
            return this;
        }

        @qj.a
        public c x(int i10) {
            this.f119040i = i10;
            return this;
        }

        @qj.a
        public c y(float f10) {
            this.f119048q = f10;
            return this;
        }

        @qj.a
        public c z(float f10) {
            this.f119043l = f10;
            return this;
        }

        public c() {
            this.f119032a = null;
            this.f119033b = null;
            this.f119034c = null;
            this.f119035d = null;
            this.f119036e = -3.4028235E38f;
            this.f119037f = Integer.MIN_VALUE;
            this.f119038g = Integer.MIN_VALUE;
            this.f119039h = -3.4028235E38f;
            this.f119040i = Integer.MIN_VALUE;
            this.f119041j = Integer.MIN_VALUE;
            this.f119042k = -3.4028235E38f;
            this.f119043l = -3.4028235E38f;
            this.f119044m = -3.4028235E38f;
            this.f119045n = false;
            this.f119046o = -16777216;
            this.f119047p = Integer.MIN_VALUE;
        }

        public c(b bVar) {
            this.f119032a = bVar.f119015b;
            this.f119033b = bVar.f119018e;
            this.f119034c = bVar.f119016c;
            this.f119035d = bVar.f119017d;
            this.f119036e = bVar.f119019f;
            this.f119037f = bVar.f119020g;
            this.f119038g = bVar.f119021h;
            this.f119039h = bVar.f119022i;
            this.f119040i = bVar.f119023j;
            this.f119041j = bVar.f119028o;
            this.f119042k = bVar.f119029p;
            this.f119043l = bVar.f119024k;
            this.f119044m = bVar.f119025l;
            this.f119045n = bVar.f119026m;
            this.f119046o = bVar.f119027n;
            this.f119047p = bVar.f119030q;
            this.f119048q = bVar.f119031r;
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

    public static final b c(Bundle bundle) {
        c cVar = new c();
        CharSequence charSequence = bundle.getCharSequence(F);
        if (charSequence != null) {
            cVar.A(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(G);
        if (alignment != null) {
            cVar.B(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(H);
        if (alignment2 != null) {
            cVar.v(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(I);
        if (bitmap != null) {
            cVar.r(bitmap);
        }
        String str = J;
        if (bundle.containsKey(str)) {
            String str2 = K;
            if (bundle.containsKey(str2)) {
                cVar.t(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = L;
        if (bundle.containsKey(str3)) {
            cVar.u(bundle.getInt(str3));
        }
        String str4 = M;
        if (bundle.containsKey(str4)) {
            cVar.w(bundle.getFloat(str4));
        }
        String str5 = N;
        if (bundle.containsKey(str5)) {
            cVar.x(bundle.getInt(str5));
        }
        String str6 = P;
        if (bundle.containsKey(str6)) {
            String str7 = O;
            if (bundle.containsKey(str7)) {
                cVar.C(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = Q;
        if (bundle.containsKey(str8)) {
            cVar.z(bundle.getFloat(str8));
        }
        String str9 = R;
        if (bundle.containsKey(str9)) {
            cVar.s(bundle.getFloat(str9));
        }
        String str10 = S;
        if (bundle.containsKey(str10)) {
            cVar.E(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(T, false)) {
            cVar.b();
        }
        String str11 = U;
        if (bundle.containsKey(str11)) {
            cVar.D(bundle.getInt(str11));
        }
        String str12 = V;
        if (bundle.containsKey(str12)) {
            cVar.y(bundle.getFloat(str12));
        }
        return cVar.a();
    }

    public c b() {
        return new c();
    }

    public boolean equals(@Nullable Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (TextUtils.equals(this.f119015b, bVar.f119015b) && this.f119016c == bVar.f119016c && this.f119017d == bVar.f119017d && ((bitmap = this.f119018e) != null ? !((bitmap2 = bVar.f119018e) == null || !bitmap.sameAs(bitmap2)) : bVar.f119018e == null) && this.f119019f == bVar.f119019f && this.f119020g == bVar.f119020g && this.f119021h == bVar.f119021h && this.f119022i == bVar.f119022i && this.f119023j == bVar.f119023j && this.f119024k == bVar.f119024k && this.f119025l == bVar.f119025l && this.f119026m == bVar.f119026m && this.f119027n == bVar.f119027n && this.f119028o == bVar.f119028o && this.f119029p == bVar.f119029p && this.f119030q == bVar.f119030q && this.f119031r == bVar.f119031r) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return f0.b(this.f119015b, this.f119016c, this.f119017d, this.f119018e, Float.valueOf(this.f119019f), Integer.valueOf(this.f119020g), Integer.valueOf(this.f119021h), Float.valueOf(this.f119022i), Integer.valueOf(this.f119023j), Float.valueOf(this.f119024k), Float.valueOf(this.f119025l), Boolean.valueOf(this.f119026m), Integer.valueOf(this.f119027n), Integer.valueOf(this.f119028o), Float.valueOf(this.f119029p), Integer.valueOf(this.f119030q), Float.valueOf(this.f119031r));
    }

    @Override // re.j
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(F, this.f119015b);
        bundle.putSerializable(G, this.f119016c);
        bundle.putSerializable(H, this.f119017d);
        bundle.putParcelable(I, this.f119018e);
        bundle.putFloat(J, this.f119019f);
        bundle.putInt(K, this.f119020g);
        bundle.putInt(L, this.f119021h);
        bundle.putFloat(M, this.f119022i);
        bundle.putInt(N, this.f119023j);
        bundle.putInt(O, this.f119028o);
        bundle.putFloat(P, this.f119029p);
        bundle.putFloat(Q, this.f119024k);
        bundle.putFloat(R, this.f119025l);
        bundle.putBoolean(T, this.f119026m);
        bundle.putInt(S, this.f119027n);
        bundle.putInt(U, this.f119030q);
        bundle.putFloat(V, this.f119031r);
        return bundle;
    }

    public b(@Nullable CharSequence charSequence, @Nullable Layout.Alignment alignment, @Nullable Layout.Alignment alignment2, @Nullable Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            eh.a.g(bitmap);
        } else {
            eh.a.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f119015b = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f119015b = charSequence.toString();
        } else {
            this.f119015b = null;
        }
        this.f119016c = alignment;
        this.f119017d = alignment2;
        this.f119018e = bitmap;
        this.f119019f = f10;
        this.f119020g = i10;
        this.f119021h = i11;
        this.f119022i = f11;
        this.f119023j = i12;
        this.f119024k = f13;
        this.f119025l = f14;
        this.f119026m = z10;
        this.f119027n = i14;
        this.f119028o = i13;
        this.f119029p = f12;
        this.f119030q = i15;
        this.f119031r = f15;
    }
}
