package androidx.media3.common;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import cj.j8;
import cj.v6;
import com.ironsource.C4235d4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import lk.e;
import u4.a0;
import u4.b0;
import u4.b1;
import u4.k1;
import u4.l1;
import x4.b2;
import x4.j;
import x4.m1;
import zi.c0;
import zi.l0;
import zi.t;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    @m1
    public static final int S = 1;

    @m1
    public static final int T = 2;
    public static final int U = -1;

    @m1
    public static final long V = Long.MAX_VALUE;
    public final float A;

    @m1
    public final int B;
    public final float C;

    @Nullable
    @m1
    public final byte[] D;

    @m1
    public final int E;

    @Nullable
    @m1
    public final b0 F;

    @m1
    public final int G;
    public final int H;
    public final int I;
    public final int J;

    @m1
    public final int K;

    @m1
    public final int L;

    @m1
    public final int M;

    @m1
    public final int N;

    @m1
    public final int O;

    @m1
    public final int P;

    @m1
    public final int Q;
    public int R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f13627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f13628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @m1
    public final List<b1> f13629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f13630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @m1
    public final int f13633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @m1
    public final int f13634h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @m1
    public final int f13635i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @m1
    public final int f13636j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final String f13637k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    @m1
    public final k1 f13638l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    @m1
    public final Object f13639m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    @m1
    public final String f13640n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final String f13641o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final String f13642p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @m1
    public final int f13643q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @m1
    public final int f13644r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @m1
    public final List<byte[]> f13645s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    @m1
    public final DrmInitData f13646t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @m1
    public final long f13647u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @m1
    public final boolean f13648v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f13649w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f13650x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @m1
    public final int f13651y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @m1
    public final int f13652z;
    public static final a W = new b().Q();
    public static final String X = b2.k1(0);
    public static final String Y = b2.k1(1);
    public static final String Z = b2.k1(2);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f13601a0 = b2.k1(3);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f13602b0 = b2.k1(4);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f13603c0 = b2.k1(5);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f13604d0 = b2.k1(6);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f13605e0 = b2.k1(7);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f13606f0 = b2.k1(8);

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f13607g0 = b2.k1(9);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final String f13608h0 = b2.k1(10);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final String f13609i0 = b2.k1(11);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f13610j0 = b2.k1(12);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final String f13611k0 = b2.k1(13);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final String f13612l0 = b2.k1(14);

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final String f13613m0 = b2.k1(15);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final String f13614n0 = b2.k1(16);

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final String f13615o0 = b2.k1(17);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final String f13616p0 = b2.k1(18);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String f13617q0 = b2.k1(19);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final String f13618r0 = b2.k1(20);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String f13619s0 = b2.k1(21);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final String f13620t0 = b2.k1(22);

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final String f13621u0 = b2.k1(23);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final String f13622v0 = b2.k1(24);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final String f13623w0 = b2.k1(25);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final String f13624x0 = b2.k1(26);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final String f13625y0 = b2.k1(27);

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final String f13626z0 = b2.k1(28);
    public static final String A0 = b2.k1(29);
    public static final String B0 = b2.k1(30);
    public static final String C0 = b2.k1(31);
    public static final String D0 = b2.k1(32);
    public static final String E0 = b2.k1(33);
    public static final String F0 = b2.k1(34);
    public static final String G0 = b2.k1(35);
    public static final String H0 = b2.k1(36);
    public static final String I0 = b2.k1(37);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @m1
    public static final class b {
        public int A;
        public float B;

        @Nullable
        public byte[] C;
        public int D;

        @Nullable
        public b0 E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;

        @m1
        public int M;
        public int N;
        public int O;
        public int P;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public String f13653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public String f13654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<b1> f13655c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public String f13656d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13657e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f13658f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f13659g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f13660h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f13661i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public String f13662j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public k1 f13663k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        public Object f13664l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Nullable
        public String f13665m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Nullable
        public String f13666n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @Nullable
        public String f13667o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f13668p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f13669q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @Nullable
        public List<byte[]> f13670r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        public DrmInitData f13671s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f13672t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f13673u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f13674v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f13675w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f13676x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f13677y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public float f13678z;

        @qj.a
        public b A0(@Nullable String str) {
            this.f13667o = l1.x(str);
            return this;
        }

        @qj.a
        public b B0(int i10) {
            this.H = i10;
            return this;
        }

        @qj.a
        public b C0(int i10) {
            this.f13657e = i10;
            return this;
        }

        @qj.a
        public b D0(int i10) {
            this.D = i10;
            return this;
        }

        @qj.a
        public b E0(long j10) {
            this.f13672t = j10;
            return this;
        }

        @qj.a
        public b F0(int i10) {
            this.N = i10;
            return this;
        }

        @qj.a
        public b G0(int i10) {
            this.O = i10;
            return this;
        }

        @qj.a
        public b H0(int i10) {
            this.f13674v = i10;
            return this;
        }

        public a Q() {
            return new a(this);
        }

        @qj.a
        public b R(int i10) {
            this.L = i10;
            return this;
        }

        @qj.a
        public b S(int i10) {
            this.f13659g = i10;
            return this;
        }

        @qj.a
        public b T(int i10) {
            this.f13660h = i10;
            return this;
        }

        @qj.a
        public b U(int i10) {
            this.G = i10;
            return this;
        }

        @qj.a
        public b V(@Nullable String str) {
            this.f13662j = str;
            return this;
        }

        @qj.a
        public b W(@Nullable b0 b0Var) {
            this.E = b0Var;
            return this;
        }

        @qj.a
        public b X(@Nullable String str) {
            this.f13666n = l1.x(str);
            return this;
        }

        @qj.a
        public b Y(int i10) {
            this.P = i10;
            return this;
        }

        @qj.a
        public b Z(int i10) {
            this.M = i10;
            return this;
        }

        @qj.a
        @m1
        public b a0(@Nullable Object obj) {
            this.f13664l = obj;
            return this;
        }

        @qj.a
        public b b0(int i10) {
            this.f13677y = i10;
            return this;
        }

        @qj.a
        public b c0(int i10) {
            this.f13676x = i10;
            return this;
        }

        @qj.a
        public b d0(@Nullable DrmInitData drmInitData) {
            this.f13671s = drmInitData;
            return this;
        }

        @qj.a
        public b e0(int i10) {
            this.J = i10;
            return this;
        }

        @qj.a
        public b f0(int i10) {
            this.K = i10;
            return this;
        }

        @qj.a
        public b g0(float f10) {
            this.f13678z = f10;
            return this;
        }

        @qj.a
        public b h0(boolean z10) {
            this.f13673u = z10;
            return this;
        }

        @qj.a
        public b i0(int i10) {
            this.f13675w = i10;
            return this;
        }

        @qj.a
        public b j0(int i10) {
            this.f13653a = Integer.toString(i10);
            return this;
        }

        @qj.a
        public b k0(@Nullable String str) {
            this.f13653a = str;
            return this;
        }

        @qj.a
        public b l0(@Nullable List<byte[]> list) {
            this.f13670r = list;
            return this;
        }

        @qj.a
        public b m0(@Nullable String str) {
            this.f13654b = str;
            return this;
        }

        @qj.a
        public b n0(List<b1> list) {
            this.f13655c = v6.u(list);
            return this;
        }

        @qj.a
        public b o0(@Nullable String str) {
            this.f13656d = str;
            return this;
        }

        @qj.a
        public b p0(int i10) {
            this.f13668p = i10;
            return this;
        }

        @qj.a
        public b q0(int i10) {
            this.f13669q = i10;
            return this;
        }

        @qj.a
        public b r0(int i10) {
            this.F = i10;
            return this;
        }

        @qj.a
        public b s0(@Nullable k1 k1Var) {
            this.f13663k = k1Var;
            return this;
        }

        @qj.a
        public b t0(int i10) {
            this.I = i10;
            return this;
        }

        @qj.a
        public b u0(int i10) {
            this.f13661i = i10;
            return this;
        }

        @qj.a
        public b v0(float f10) {
            this.B = f10;
            return this;
        }

        @qj.a
        @m1
        public b w0(@Nullable String str) {
            this.f13665m = str;
            return this;
        }

        @qj.a
        public b x0(@Nullable byte[] bArr) {
            this.C = bArr;
            return this;
        }

        @qj.a
        public b y0(int i10) {
            this.f13658f = i10;
            return this;
        }

        @qj.a
        public b z0(int i10) {
            this.A = i10;
            return this;
        }

        public b() {
            this.f13655c = v6.z();
            this.f13660h = -1;
            this.f13661i = -1;
            this.f13668p = -1;
            this.f13669q = -1;
            this.f13672t = Long.MAX_VALUE;
            this.f13674v = -1;
            this.f13675w = -1;
            this.f13676x = -1;
            this.f13677y = -1;
            this.f13678z = -1.0f;
            this.B = 1.0f;
            this.D = -1;
            this.F = -1;
            this.G = -1;
            this.H = -1;
            this.I = -1;
            this.L = -1;
            this.M = 1;
            this.N = -1;
            this.O = -1;
            this.P = 0;
            this.f13659g = 0;
        }

        public b(a aVar) {
            this.f13653a = aVar.f13627a;
            this.f13654b = aVar.f13628b;
            this.f13655c = aVar.f13629c;
            this.f13656d = aVar.f13630d;
            this.f13657e = aVar.f13631e;
            this.f13658f = aVar.f13632f;
            this.f13660h = aVar.f13634h;
            this.f13661i = aVar.f13635i;
            this.f13662j = aVar.f13637k;
            this.f13663k = aVar.f13638l;
            this.f13664l = aVar.f13639m;
            this.f13665m = aVar.f13640n;
            this.f13666n = aVar.f13641o;
            this.f13667o = aVar.f13642p;
            this.f13668p = aVar.f13643q;
            this.f13669q = aVar.f13644r;
            this.f13670r = aVar.f13645s;
            this.f13671s = aVar.f13646t;
            this.f13672t = aVar.f13647u;
            this.f13673u = aVar.f13648v;
            this.f13674v = aVar.f13649w;
            this.f13675w = aVar.f13650x;
            this.f13676x = aVar.f13651y;
            this.f13677y = aVar.f13652z;
            this.f13678z = aVar.A;
            this.A = aVar.B;
            this.B = aVar.C;
            this.C = aVar.D;
            this.D = aVar.E;
            this.E = aVar.F;
            this.F = aVar.G;
            this.G = aVar.H;
            this.H = aVar.I;
            this.I = aVar.J;
            this.J = aVar.K;
            this.K = aVar.L;
            this.L = aVar.M;
            this.M = aVar.N;
            this.N = aVar.O;
            this.O = aVar.P;
            this.P = aVar.Q;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @m1
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public static /* synthetic */ String a(b1 b1Var) {
        return b1Var.f138122a + ": " + b1Var.f138123b;
    }

    @Nullable
    public static <T> T d(@Nullable T t10, @Nullable T t11) {
        return t10 != null ? t10 : t11;
    }

    @m1
    public static a e(Bundle bundle) {
        b bVar = new b();
        j.c(bundle);
        String string = bundle.getString(X);
        a aVar = W;
        bVar.k0((String) d(string, aVar.f13627a)).m0((String) d(bundle.getString(Y), aVar.f13628b));
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(D0);
        bVar.n0(parcelableArrayList == null ? v6.z() : j.d(new t() { // from class: u4.n0
            @Override // zi.t
            public final Object apply(Object obj) {
                return b1.a((Bundle) obj);
            }
        }, parcelableArrayList)).o0((String) d(bundle.getString(Z), aVar.f13630d)).C0(bundle.getInt(f13601a0, aVar.f13631e)).y0(bundle.getInt(f13602b0, aVar.f13632f)).S(bundle.getInt(E0, aVar.f13633g)).T(bundle.getInt(f13603c0, aVar.f13634h)).u0(bundle.getInt(f13604d0, aVar.f13635i)).V((String) d(bundle.getString(f13605e0), aVar.f13637k)).w0((String) d(bundle.getString(I0), aVar.f13640n)).X((String) d(bundle.getString(f13607g0), aVar.f13641o)).A0((String) d(bundle.getString(f13608h0), aVar.f13642p)).p0(bundle.getInt(f13609i0, aVar.f13643q));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            byte[] byteArray = bundle.getByteArray(j(i10));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i10++;
        }
        b bVarD0 = bVar.l0(arrayList).d0((DrmInitData) bundle.getParcelable(f13611k0));
        String str = f13612l0;
        a aVar2 = W;
        bVarD0.E0(bundle.getLong(str, aVar2.f13647u)).H0(bundle.getInt(f13613m0, aVar2.f13649w)).i0(bundle.getInt(f13614n0, aVar2.f13650x)).c0(bundle.getInt(G0, aVar2.f13651y)).b0(bundle.getInt(H0, aVar2.f13652z)).g0(bundle.getFloat(f13615o0, aVar2.A)).z0(bundle.getInt(f13616p0, aVar2.B)).v0(bundle.getFloat(f13617q0, aVar2.C)).x0(bundle.getByteArray(f13618r0)).D0(bundle.getInt(f13619s0, aVar2.E)).r0(bundle.getInt(F0, aVar2.G));
        Bundle bundle2 = bundle.getBundle(f13620t0);
        if (bundle2 != null) {
            bVar.W(b0.i(bundle2));
        }
        bVar.U(bundle.getInt(f13621u0, aVar2.H)).B0(bundle.getInt(f13622v0, aVar2.I)).t0(bundle.getInt(f13623w0, aVar2.J)).e0(bundle.getInt(f13624x0, aVar2.K)).f0(bundle.getInt(f13625y0, aVar2.L)).R(bundle.getInt(f13626z0, aVar2.M)).F0(bundle.getInt(B0, aVar2.O)).G0(bundle.getInt(C0, aVar2.P)).Y(bundle.getInt(A0, aVar2.Q));
        return bVar.Q();
    }

    public static String f(List<b1> list, @Nullable String str) {
        for (b1 b1Var : list) {
            if (TextUtils.equals(b1Var.f138122a, str)) {
                return b1Var.f138123b;
            }
        }
        return list.get(0).f138123b;
    }

    public static boolean i(b bVar) {
        if (bVar.f13655c.isEmpty() && bVar.f13654b == null) {
            return true;
        }
        for (int i10 = 0; i10 < bVar.f13655c.size(); i10++) {
            if (((b1) bVar.f13655c.get(i10)).f138123b.equals(bVar.f13654b)) {
                return true;
            }
        }
        return false;
    }

    public static String j(int i10) {
        return f13610j0 + e.f104695m + Integer.toString(i10, 36);
    }

    @m1
    public static String l(@Nullable a aVar) {
        if (aVar == null) {
            return fw.b.f85379f;
        }
        c0 c0VarO = c0.o(fw.b.f85380g);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("id=");
        sb2.append(aVar.f13627a);
        sb2.append(", mimeType=");
        sb2.append(aVar.f13642p);
        if (aVar.f13641o != null) {
            sb2.append(", container=");
            sb2.append(aVar.f13641o);
        }
        if (aVar.f13640n != null) {
            sb2.append(", primaryGroupId=");
            sb2.append(aVar.f13640n);
        }
        if (aVar.f13636j != -1) {
            sb2.append(", bitrate=");
            sb2.append(aVar.f13636j);
        }
        if (aVar.f13637k != null) {
            sb2.append(", codecs=");
            sb2.append(aVar.f13637k);
        }
        if (aVar.f13646t != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i10 = 0;
            while (true) {
                DrmInitData drmInitData = aVar.f13646t;
                if (i10 >= drmInitData.f13589e) {
                    break;
                }
                UUID uuid = drmInitData.f(i10).f13591c;
                if (uuid.equals(a0.f138005t2)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(a0.f138010u2)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(a0.f138020w2)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(a0.f138015v2)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(a0.f138000s2)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + gi.j.f86771d);
                }
                i10++;
            }
            sb2.append(", drm=[");
            c0VarO.f(sb2, linkedHashSet);
            sb2.append(fw.b.f85385l);
        }
        if (aVar.f13649w != -1 && aVar.f13650x != -1) {
            sb2.append(", res=");
            sb2.append(aVar.f13649w);
            sb2.append("x");
            sb2.append(aVar.f13650x);
        }
        if (aVar.f13651y != -1 && aVar.f13652z != -1) {
            sb2.append(", decRes=");
            sb2.append(aVar.f13651y);
            sb2.append("x");
            sb2.append(aVar.f13652z);
        }
        if (!jj.c.d(aVar.C, 1.0d, 0.001d)) {
            sb2.append(", par=");
            sb2.append(b2.V("%.3f", Float.valueOf(aVar.C)));
        }
        b0 b0Var = aVar.F;
        if (b0Var != null && b0Var.n()) {
            sb2.append(", color=");
            sb2.append(aVar.F.s());
        }
        if (aVar.A != -1.0f) {
            sb2.append(", fps=");
            sb2.append(aVar.A);
        }
        if (aVar.G != -1) {
            sb2.append(", maxSubLayers=");
            sb2.append(aVar.G);
        }
        if (aVar.H != -1) {
            sb2.append(", channels=");
            sb2.append(aVar.H);
        }
        if (aVar.I != -1) {
            sb2.append(", sample_rate=");
            sb2.append(aVar.I);
        }
        if (aVar.f13630d != null) {
            sb2.append(", language=");
            sb2.append(aVar.f13630d);
        }
        if (!aVar.f13629c.isEmpty()) {
            sb2.append(", labels=[");
            c0VarO.f(sb2, j8.D(aVar.f13629c, new t() { // from class: u4.o0
                @Override // zi.t
                public final Object apply(Object obj) {
                    return androidx.media3.common.a.a((b1) obj);
                }
            }));
            sb2.append(C4235d4.j.f61462e);
        }
        if (aVar.f13631e != 0) {
            sb2.append(", selectionFlags=[");
            c0VarO.f(sb2, b2.O0(aVar.f13631e));
            sb2.append(C4235d4.j.f61462e);
        }
        if (aVar.f13632f != 0) {
            sb2.append(", roleFlags=[");
            c0VarO.f(sb2, b2.N0(aVar.f13632f));
            sb2.append(C4235d4.j.f61462e);
        }
        if (aVar.f13639m != null) {
            sb2.append(", customData=");
            sb2.append(aVar.f13639m);
        }
        if ((aVar.f13632f & 32768) != 0) {
            sb2.append(", auxiliaryTrackType=");
            sb2.append(b2.f0(aVar.f13633g));
        }
        return sb2.toString();
    }

    @m1
    public b b() {
        return new b();
    }

    @m1
    public a c(int i10) {
        return b().Y(i10).Q();
    }

    public boolean equals(@Nullable Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            int i11 = this.R;
            if ((i11 == 0 || (i10 = aVar.R) == 0 || i11 == i10) && this.f13631e == aVar.f13631e && this.f13632f == aVar.f13632f && this.f13633g == aVar.f13633g && this.f13634h == aVar.f13634h && this.f13635i == aVar.f13635i && this.f13643q == aVar.f13643q && this.f13647u == aVar.f13647u && this.f13649w == aVar.f13649w && this.f13650x == aVar.f13650x && this.f13651y == aVar.f13651y && this.f13652z == aVar.f13652z && this.B == aVar.B && this.E == aVar.E && this.G == aVar.G && this.H == aVar.H && this.I == aVar.I && this.J == aVar.J && this.K == aVar.K && this.L == aVar.L && this.M == aVar.M && this.O == aVar.O && this.P == aVar.P && this.Q == aVar.Q && Float.compare(this.A, aVar.A) == 0 && Float.compare(this.C, aVar.C) == 0 && Objects.equals(this.f13627a, aVar.f13627a) && Objects.equals(this.f13628b, aVar.f13628b) && this.f13629c.equals(aVar.f13629c) && Objects.equals(this.f13637k, aVar.f13637k) && Objects.equals(this.f13640n, aVar.f13640n) && Objects.equals(this.f13641o, aVar.f13641o) && Objects.equals(this.f13642p, aVar.f13642p) && Objects.equals(this.f13630d, aVar.f13630d) && Arrays.equals(this.D, aVar.D) && Objects.equals(this.f13638l, aVar.f13638l) && Objects.equals(this.F, aVar.F) && Objects.equals(this.f13646t, aVar.f13646t) && h(aVar) && Objects.equals(this.f13639m, aVar.f13639m)) {
                return true;
            }
        }
        return false;
    }

    @m1
    public int g() {
        int i10;
        int i11 = this.f13649w;
        if (i11 == -1 || (i10 = this.f13650x) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    @m1
    public boolean h(a aVar) {
        if (this.f13645s.size() != aVar.f13645s.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f13645s.size(); i10++) {
            if (!Arrays.equals(this.f13645s.get(i10), aVar.f13645s.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (this.R == 0) {
            String str = this.f13627a;
            int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f13628b;
            int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f13629c.hashCode()) * 31;
            String str3 = this.f13630d;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f13631e) * 31) + this.f13632f) * 31) + this.f13633g) * 31) + this.f13634h) * 31) + this.f13635i) * 31;
            String str4 = this.f13637k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            k1 k1Var = this.f13638l;
            int iHashCode5 = (iHashCode4 + (k1Var == null ? 0 : k1Var.hashCode())) * 31;
            Object obj = this.f13639m;
            int iHashCode6 = (iHashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
            String str5 = this.f13640n;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f13641o;
            int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f13642p;
            this.R = ((((((((((((((((((((((((((((((((((((((((iHashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.f13643q) * 31) + ((int) this.f13647u)) * 31) + this.f13649w) * 31) + this.f13650x) * 31) + this.f13651y) * 31) + this.f13652z) * 31) + Float.floatToIntBits(this.A)) * 31) + this.B) * 31) + Float.floatToIntBits(this.C)) * 31) + this.E) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.O) * 31) + this.P) * 31) + this.Q;
        }
        return this.R;
    }

    @m1
    public Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putString(X, this.f13627a);
        bundle.putString(Y, this.f13628b);
        bundle.putParcelableArrayList(D0, j.i(this.f13629c, new t() { // from class: u4.m0
            @Override // zi.t
            public final Object apply(Object obj) {
                return ((b1) obj).b();
            }
        }));
        bundle.putString(Z, this.f13630d);
        bundle.putInt(f13601a0, this.f13631e);
        bundle.putInt(f13602b0, this.f13632f);
        int i10 = this.f13633g;
        if (i10 != W.f13633g) {
            bundle.putInt(E0, i10);
        }
        bundle.putInt(f13603c0, this.f13634h);
        bundle.putInt(f13604d0, this.f13635i);
        bundle.putString(f13605e0, this.f13637k);
        String str = this.f13640n;
        if (str != null) {
            bundle.putString(I0, str);
        }
        bundle.putString(f13607g0, this.f13641o);
        bundle.putString(f13608h0, this.f13642p);
        bundle.putInt(f13609i0, this.f13643q);
        for (int i11 = 0; i11 < this.f13645s.size(); i11++) {
            bundle.putByteArray(j(i11), this.f13645s.get(i11));
        }
        bundle.putParcelable(f13611k0, this.f13646t);
        bundle.putLong(f13612l0, this.f13647u);
        bundle.putInt(f13613m0, this.f13649w);
        bundle.putInt(f13614n0, this.f13650x);
        bundle.putInt(G0, this.f13651y);
        bundle.putInt(H0, this.f13652z);
        bundle.putFloat(f13615o0, this.A);
        bundle.putInt(f13616p0, this.B);
        bundle.putFloat(f13617q0, this.C);
        bundle.putByteArray(f13618r0, this.D);
        bundle.putInt(f13619s0, this.E);
        b0 b0Var = this.F;
        if (b0Var != null) {
            bundle.putBundle(f13620t0, b0Var.r());
        }
        bundle.putInt(F0, this.G);
        bundle.putInt(f13621u0, this.H);
        bundle.putInt(f13622v0, this.I);
        bundle.putInt(f13623w0, this.J);
        bundle.putInt(f13624x0, this.K);
        bundle.putInt(f13625y0, this.L);
        bundle.putInt(f13626z0, this.M);
        bundle.putInt(B0, this.O);
        bundle.putInt(C0, this.P);
        bundle.putInt(A0, this.Q);
        return bundle;
    }

    @m1
    public a m(a aVar) {
        String str;
        if (this == aVar) {
            return this;
        }
        int iN = l1.n(this.f13642p);
        String str2 = aVar.f13627a;
        int i10 = aVar.O;
        int i11 = aVar.P;
        String str3 = aVar.f13628b;
        if (str3 == null) {
            str3 = this.f13628b;
        }
        List<b1> list = !aVar.f13629c.isEmpty() ? aVar.f13629c : this.f13629c;
        String str4 = this.f13630d;
        if ((iN == 3 || iN == 1) && (str = aVar.f13630d) != null) {
            str4 = str;
        }
        int i12 = this.f13634h;
        if (i12 == -1) {
            i12 = aVar.f13634h;
        }
        int i13 = this.f13635i;
        if (i13 == -1) {
            i13 = aVar.f13635i;
        }
        String str5 = this.f13637k;
        if (str5 == null) {
            String strM0 = b2.m0(aVar.f13637k, iN);
            if (b2.B2(strM0).length == 1) {
                str5 = strM0;
            }
        }
        String str6 = this.f13640n;
        if (str6 == null) {
            str6 = aVar.f13640n;
        }
        k1 k1Var = this.f13638l;
        k1 k1VarB = k1Var == null ? aVar.f13638l : k1Var.b(aVar.f13638l);
        float f10 = this.A;
        if (f10 == -1.0f && iN == 2) {
            f10 = aVar.A;
        }
        return b().k0(str2).m0(str3).n0(list).o0(str4).C0(this.f13631e | aVar.f13631e).y0(this.f13632f | aVar.f13632f).T(i12).u0(i13).V(str5).s0(k1VarB).w0(str6).d0(DrmInitData.e(aVar.f13646t, this.f13646t)).g0(f10).F0(i10).G0(i11).Q();
    }

    public String toString() {
        return "Format(" + this.f13627a + ", " + this.f13628b + ", " + this.f13641o + ", " + this.f13642p + ", " + this.f13637k + ", " + this.f13636j + ", " + this.f13630d + ", [" + this.f13649w + ", " + this.f13650x + ", " + this.A + ", " + this.F + "], [" + this.H + ", " + this.I + "])";
    }

    public a(b bVar) {
        this.f13627a = bVar.f13653a;
        String strQ1 = b2.Q1(bVar.f13656d);
        this.f13630d = strQ1;
        if (bVar.f13655c.isEmpty() && bVar.f13654b != null) {
            this.f13629c = v6.A(new b1(strQ1, bVar.f13654b));
            this.f13628b = bVar.f13654b;
        } else if (bVar.f13655c.isEmpty() || bVar.f13654b != null) {
            l0.g0(i(bVar));
            this.f13629c = bVar.f13655c;
            this.f13628b = bVar.f13654b;
        } else {
            this.f13629c = bVar.f13655c;
            this.f13628b = f(bVar.f13655c, strQ1);
        }
        this.f13631e = bVar.f13657e;
        l0.h0(bVar.f13659g == 0 || (bVar.f13658f & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.f13632f = bVar.f13658f;
        this.f13633g = bVar.f13659g;
        int i10 = bVar.f13660h;
        this.f13634h = i10;
        int i11 = bVar.f13661i;
        this.f13635i = i11;
        this.f13636j = i11 != -1 ? i11 : i10;
        this.f13637k = bVar.f13662j;
        this.f13638l = bVar.f13663k;
        this.f13639m = bVar.f13664l;
        this.f13640n = bVar.f13665m;
        this.f13641o = bVar.f13666n;
        this.f13642p = bVar.f13667o;
        this.f13643q = bVar.f13668p;
        this.f13644r = bVar.f13669q;
        this.f13645s = bVar.f13670r == null ? Collections.EMPTY_LIST : bVar.f13670r;
        DrmInitData drmInitData = bVar.f13671s;
        this.f13646t = drmInitData;
        this.f13647u = bVar.f13672t;
        this.f13648v = bVar.f13673u;
        this.f13649w = bVar.f13674v;
        this.f13650x = bVar.f13675w;
        this.f13651y = bVar.f13676x;
        this.f13652z = bVar.f13677y;
        this.A = bVar.f13678z;
        this.B = bVar.A == -1 ? 0 : bVar.A;
        this.C = bVar.B == -1.0f ? 1.0f : bVar.B;
        this.D = bVar.C;
        this.E = bVar.D;
        this.F = bVar.E;
        this.G = bVar.F;
        this.H = bVar.G;
        this.I = bVar.H;
        this.J = bVar.I;
        this.K = bVar.J == -1 ? 0 : bVar.J;
        this.L = bVar.K != -1 ? bVar.K : 0;
        this.M = bVar.L;
        this.N = bVar.M;
        this.O = bVar.N;
        this.P = bVar.O;
        if (bVar.P != 0 || drmInitData == null) {
            this.Q = bVar.P;
        } else {
            this.Q = 1;
        }
    }
}
