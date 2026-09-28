package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SEfl.gvQvkPPtA;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes.dex */
public final class yq60 {
    public e0 a = null;
    public final yq5.p b = new yq5.p();
    public final HashMap c = new HashMap();

    public static class a0 extends k {
        public o o;
        public o p;
        public o q;
        public o r;
        public o s;
        public o t;

        @Override // yq60.m0
        public final String n() {
            return "rect";
        }
    }

    public interface a1 {
    }

    public static class b {
        public o a;
        public o b;
        public o c;
        public o d;
    }

    public static class b1 extends m0 implements w0 {
        public String c;

        @Override // yq60.w0
        public final a1 c() {
            return null;
        }

        public final String toString() {
            return uf80.a(new StringBuilder("TextChild: '"), this.c, "'");
        }
    }

    public static class c extends k {
        public o o;
        public o p;
        public o q;

        @Override // yq60.m0
        public final String n() {
            return "circle";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c1 {
        public static final c1 a;
        public static final c1 b;
        public static final c1 c;
        public static final c1 d;
        public static final c1 e;
        public static final /* synthetic */ c1[] f;

        static {
            c1 c1Var = new c1("px", 0);
            a = c1Var;
            c1 c1Var2 = new c1("em", 1);
            b = c1Var2;
            c1 c1Var3 = new c1("ex", 2);
            c = c1Var3;
            c1 c1Var4 = new c1("in", 3);
            c1 c1Var5 = new c1("cm", 4);
            c1 c1Var6 = new c1("mm", 5);
            c1 c1Var7 = new c1("pt", 6);
            d = c1Var7;
            c1 c1Var8 = new c1("pc", 7);
            c1 c1Var9 = new c1("percent", 8);
            e = c1Var9;
            f = new c1[]{c1Var, c1Var2, c1Var3, c1Var4, c1Var5, c1Var6, c1Var7, c1Var8, c1Var9};
        }

        public c1() {
            throw null;
        }

        public static c1 valueOf(String str) {
            return (c1) Enum.valueOf(c1.class, str);
        }

        public static c1[] values() {
            return (c1[]) f.clone();
        }
    }

    public static class d extends l implements s {
        public Boolean o;

        @Override // yq60.l, yq60.m0
        public final String n() {
            return "clipPath";
        }
    }

    public static class d0 implements Cloneable {
        public o A;
        public Float B;
        public e C;
        public ArrayList D;
        public o E;
        public Integer F;
        public b G;
        public g H;
        public h I;
        public f J;
        public Boolean K;
        public b L;
        public String M;
        public String N;
        public String O;
        public Boolean P;
        public Boolean Q;
        public n0 R;
        public Float S;
        public String T;
        public a U;
        public String V;
        public n0 W;
        public Float X;
        public n0 Y;
        public Float Z;
        public long a = 0;
        public i a0;
        public n0 b;
        public e b0;
        public a c;
        public Float d;
        public n0 e;
        public Float f;
        public o i;
        public c v;
        public d w;
        public Float y;
        public o[] z;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            public static final a a;
            public static final a b;
            public static final /* synthetic */ a[] c;

            static {
                a aVar = new a("NonZero", 0);
                a = aVar;
                a aVar2 = new a("EvenOdd", 1);
                b = aVar2;
                c = new a[]{aVar, aVar2};
            }

            public a() {
                throw null;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) c.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class b {
            public static final b a;
            public static final b b;
            public static final b c;
            public static final /* synthetic */ b[] d;

            static {
                b bVar = new b("Normal", 0);
                a = bVar;
                b bVar2 = new b("Italic", 1);
                b = bVar2;
                b bVar3 = new b("Oblique", 2);
                c = bVar3;
                d = new b[]{bVar, bVar2, bVar3};
            }

            public b() {
                throw null;
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) d.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class c {
            public static final c a;
            public static final c b;
            public static final c c;
            public static final /* synthetic */ c[] d;

            static {
                c cVar = new c("Butt", 0);
                a = cVar;
                c cVar2 = new c("Round", 1);
                b = cVar2;
                c cVar3 = new c("Square", 2);
                c = cVar3;
                d = new c[]{cVar, cVar2, cVar3};
            }

            public c() {
                throw null;
            }

            public static c valueOf(String str) {
                return (c) Enum.valueOf(c.class, str);
            }

            public static c[] values() {
                return (c[]) d.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class d {
            public static final d a;
            public static final d b;
            public static final d c;
            public static final /* synthetic */ d[] d;

            static {
                d dVar = new d("Miter", 0);
                a = dVar;
                d dVar2 = new d("Round", 1);
                b = dVar2;
                d dVar3 = new d("Bevel", 2);
                c = dVar3;
                d = new d[]{dVar, dVar2, dVar3};
            }

            public d() {
                throw null;
            }

            public static d valueOf(String str) {
                return (d) Enum.valueOf(d.class, str);
            }

            public static d[] values() {
                return (d[]) d.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class e {
            public static final e a;
            public static final e b;
            public static final e c;
            public static final /* synthetic */ e[] d;

            static {
                e eVar = new e(StompClient.DEFAULT_ACK, 0);
                a = eVar;
                e eVar2 = new e("optimizeQuality", 1);
                b = eVar2;
                e eVar3 = new e("optimizeSpeed", 2);
                c = eVar3;
                d = new e[]{eVar, eVar2, eVar3};
            }

            public e() {
                throw null;
            }

            public static e valueOf(String str) {
                return (e) Enum.valueOf(e.class, str);
            }

            public static e[] values() {
                return (e[]) d.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class f {
            public static final f a;
            public static final f b;
            public static final f c;
            public static final /* synthetic */ f[] d;

            static {
                f fVar = new f("Start", 0);
                a = fVar;
                f fVar2 = new f("Middle", 1);
                b = fVar2;
                f fVar3 = new f("End", 2);
                c = fVar3;
                d = new f[]{fVar, fVar2, fVar3};
            }

            public f() {
                throw null;
            }

            public static f valueOf(String str) {
                return (f) Enum.valueOf(f.class, str);
            }

            public static f[] values() {
                return (f[]) d.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class g {
            public static final g a;
            public static final g b;
            public static final g c;
            public static final g d;
            public static final g e;
            public static final /* synthetic */ g[] f;

            static {
                g gVar = new g("None", 0);
                a = gVar;
                g gVar2 = new g("Underline", 1);
                b = gVar2;
                g gVar3 = new g("Overline", 2);
                c = gVar3;
                g gVar4 = new g("LineThrough", 3);
                d = gVar4;
                g gVar5 = new g("Blink", 4);
                e = gVar5;
                f = new g[]{gVar, gVar2, gVar3, gVar4, gVar5};
            }

            public g() {
                throw null;
            }

            public static g valueOf(String str) {
                return (g) Enum.valueOf(g.class, str);
            }

            public static g[] values() {
                return (g[]) f.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class h {
            public static final h a;
            public static final h b;
            public static final /* synthetic */ h[] c;

            static {
                h hVar = new h("LTR", 0);
                a = hVar;
                h hVar2 = new h("RTL", 1);
                b = hVar2;
                c = new h[]{hVar, hVar2};
            }

            public h() {
                throw null;
            }

            public static h valueOf(String str) {
                return (h) Enum.valueOf(h.class, str);
            }

            public static h[] values() {
                return (h[]) c.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class i {
            public static final i a;
            public static final i b;
            public static final /* synthetic */ i[] c;

            public i() {
                throw null;
            }

            public static i valueOf(String str) {
                return (i) Enum.valueOf(i.class, str);
            }

            public static i[] values() {
                return (i[]) c.clone();
            }

            static {
                i iVar = new i(QWvyvNzGsBpRT.zbrnFkbCR, 0);
                a = iVar;
                i iVar2 = new i("NonScalingStroke", 1);
                b = iVar2;
                c = new i[]{iVar, iVar2};
            }
        }

        public static d0 a() {
            d0 d0Var = new d0();
            d0Var.a = -1L;
            e eVar = e.b;
            d0Var.b = eVar;
            a aVar = a.a;
            d0Var.c = aVar;
            Float fValueOf = Float.valueOf(1.0f);
            d0Var.d = fValueOf;
            d0Var.e = null;
            d0Var.f = fValueOf;
            d0Var.i = new o(1.0f);
            d0Var.v = c.a;
            d0Var.w = d.a;
            d0Var.y = Float.valueOf(4.0f);
            d0Var.z = null;
            d0Var.A = new o(0.0f);
            d0Var.B = fValueOf;
            d0Var.C = eVar;
            d0Var.D = null;
            d0Var.E = new o(12.0f, c1.d);
            d0Var.F = 400;
            d0Var.G = b.a;
            d0Var.H = g.a;
            d0Var.I = h.a;
            d0Var.J = f.a;
            Boolean bool = Boolean.TRUE;
            d0Var.K = bool;
            d0Var.L = null;
            d0Var.M = null;
            d0Var.N = null;
            d0Var.O = null;
            d0Var.P = bool;
            d0Var.Q = bool;
            d0Var.R = eVar;
            d0Var.S = fValueOf;
            d0Var.T = null;
            d0Var.U = aVar;
            d0Var.V = null;
            d0Var.W = null;
            d0Var.X = fValueOf;
            d0Var.Y = null;
            d0Var.Z = fValueOf;
            d0Var.a0 = i.a;
            d0Var.b0 = e.a;
            return d0Var;
        }

        public final Object clone() {
            d0 d0Var = (d0) super.clone();
            o[] oVarArr = this.z;
            if (oVarArr != null) {
                d0Var.z = (o[]) oVarArr.clone();
            }
            return d0Var;
        }
    }

    public static class d1 extends l {
        public String o;
        public o p;
        public o q;
        public o r;
        public o s;

        @Override // yq60.l, yq60.m0
        public final String n() {
            return "use";
        }
    }

    public static class e extends n0 {
        public static final e b = new e(-16777216);
        public static final e c = new e(0);
        public final int a;

        public e(int i) {
            this.a = i;
        }

        public final String toString() {
            return String.format("#%08x", Integer.valueOf(this.a));
        }
    }

    public static class e0 extends q0 {
        public o p;
        public o q;
        public o r;
        public o s;

        @Override // yq60.m0
        public final String n() {
            return "svg";
        }
    }

    public static class e1 extends q0 implements s {
        @Override // yq60.m0
        public final String n() {
            return "view";
        }
    }

    public static class f extends n0 {
        public static final f a = new f();
    }

    public interface f0 {
        Set<String> a();

        String b();

        void d(HashSet hashSet);

        Set<String> e();

        void f(HashSet hashSet);

        void h(HashSet hashSet);

        void i(String str);

        void j(HashSet hashSet);

        Set<String> l();

        Set<String> m();
    }

    public static class g extends l implements s {
        @Override // yq60.l, yq60.m0
        public final String n() {
            return "defs";
        }
    }

    public static class h extends k {
        public o o;
        public o p;
        public o q;
        public o r;

        @Override // yq60.m0
        public final String n() {
            return "ellipse";
        }
    }

    public static abstract class h0 extends j0 implements f0 {
        public HashSet i;
        public String j;
        public HashSet k;
        public HashSet l;
        public HashSet m;

        @Override // yq60.f0
        public final Set<String> a() {
            return this.k;
        }

        @Override // yq60.f0
        public final String b() {
            return this.j;
        }

        @Override // yq60.f0
        public final void d(HashSet hashSet) {
            this.i = hashSet;
        }

        @Override // yq60.f0
        public final Set<String> e() {
            return this.i;
        }

        @Override // yq60.f0
        public final void f(HashSet hashSet) {
            this.k = hashSet;
        }

        @Override // yq60.f0
        public final void h(HashSet hashSet) {
            this.m = hashSet;
        }

        @Override // yq60.f0
        public final void i(String str) {
            this.j = str;
        }

        @Override // yq60.f0
        public final void j(HashSet hashSet) {
            this.l = hashSet;
        }

        @Override // yq60.f0
        public final Set<String> l() {
            return this.l;
        }

        @Override // yq60.f0
        public final Set<String> m() {
            return this.m;
        }
    }

    public static abstract class i extends k0 implements i0 {
        public List<m0> h = new ArrayList();
        public Boolean i;
        public Matrix j;
        public j k;
        public String l;

        @Override // yq60.i0
        public final void g(m0 m0Var) throws ar60 {
            if (m0Var instanceof c0) {
                this.h.add(m0Var);
                return;
            }
            throw new ar60("Gradient elements cannot contain " + m0Var + " elements.");
        }

        @Override // yq60.i0
        public final List<m0> getChildren() {
            return this.h;
        }
    }

    public interface i0 {
        void g(m0 m0Var);

        List<m0> getChildren();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class j {
        public static final j a;
        public static final j b;
        public static final /* synthetic */ j[] c;

        /* JADX INFO: Fake field, exist only in values array */
        j EF0;

        static {
            j jVar = new j("pad", 0);
            j jVar2 = new j("reflect", 1);
            a = jVar2;
            j jVar3 = new j("repeat", 2);
            b = jVar3;
            c = new j[]{jVar, jVar2, jVar3};
        }

        public j() {
            throw null;
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) c.clone();
        }
    }

    public static abstract class j0 extends k0 {
        public a h = null;
    }

    public static abstract class k extends h0 implements m {
        public Matrix n;

        public k() {
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = null;
        }

        @Override // yq60.m
        public final void k(Matrix matrix) {
            this.n = matrix;
        }
    }

    public static abstract class k0 extends m0 {
        public String c = null;
        public Boolean d = null;
        public d0 e = null;
        public d0 f = null;
        public ArrayList g = null;

        public final String toString() {
            return n();
        }
    }

    public static class l extends g0 implements m {
        public Matrix n;

        @Override // yq60.m
        public final void k(Matrix matrix) {
            this.n = matrix;
        }

        @Override // yq60.m0
        public String n() {
            return EventKeys.EVENT_GROUP;
        }
    }

    public static class l0 extends i {
        public o m;
        public o n;
        public o o;
        public o p;

        @Override // yq60.m0
        public final String n() {
            return "linearGradient";
        }
    }

    public interface m {
        void k(Matrix matrix);
    }

    public static class m0 {
        public yq60 a;
        public i0 b;

        public String n() {
            return "";
        }
    }

    public static class n extends o0 implements m {
        public String o;
        public o p;
        public o q;
        public o r;
        public o s;
        public Matrix t;

        @Override // yq60.m
        public final void k(Matrix matrix) {
            this.t = matrix;
        }

        @Override // yq60.m0
        public final String n() {
            return "image";
        }
    }

    public static abstract class n0 implements Cloneable {
    }

    public static abstract class o0 extends g0 {
        public hp20 n = null;
    }

    public static class p extends k {
        public o o;
        public o p;
        public o q;
        public o r;

        @Override // yq60.m0
        public final String n() {
            return "line";
        }
    }

    public static class p0 extends i {
        public o m;
        public o n;
        public o o;
        public o p;
        public o q;

        @Override // yq60.m0
        public final String n() {
            return "radialGradient";
        }
    }

    public static class q extends q0 implements s {
        public boolean p;
        public o q;
        public o r;
        public o s;
        public o t;
        public Float u;

        @Override // yq60.m0
        public final String n() {
            return "marker";
        }
    }

    public static abstract class q0 extends o0 {
        public a o;
    }

    public static class r extends g0 implements s {
        public Boolean n;
        public Boolean o;
        public o p;
        public o q;

        @Override // yq60.m0
        public final String n() {
            return "mask";
        }
    }

    public static class r0 extends l {
        @Override // yq60.l, yq60.m0
        public final String n() {
            return "switch";
        }
    }

    public interface s {
    }

    public static class s0 extends q0 implements s {
        @Override // yq60.m0
        public final String n() {
            return "symbol";
        }
    }

    public static class t extends n0 {
        public final String a;
        public final n0 b;

        public t(String str, n0 n0Var) {
            this.a = str;
            this.b = n0Var;
        }

        public final String toString() {
            return this.a + " " + this.b;
        }
    }

    public static class t0 extends x0 implements w0 {
        public String n;
        public a1 o;

        @Override // yq60.w0
        public final a1 c() {
            return this.o;
        }

        @Override // yq60.m0
        public final String n() {
            return "tref";
        }
    }

    public static class u extends k {
        public v o;

        @Override // yq60.m0
        public final String n() {
            return AnalyticsParam.EVENT_PATH;
        }
    }

    public static class u0 extends z0 implements w0 {
        public a1 r;

        @Override // yq60.w0
        public final a1 c() {
            return this.r;
        }

        @Override // yq60.m0
        public final String n() {
            return "tspan";
        }
    }

    public static class v implements w {
        public byte[] a;
        public int b;
        public float[] c;
        public int d;

        @Override // yq60.w
        public final void a(float f, float f2) {
            f((byte) 0);
            g(2);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            this.d = i + 2;
            fArr[i2] = f2;
        }

        @Override // yq60.w
        public final void b(float f, float f2, float f3, float f4, float f5, float f6) {
            f((byte) 2);
            g(6);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.d = i3;
            fArr[i2] = f2;
            int i4 = i + 3;
            this.d = i4;
            fArr[i3] = f3;
            int i5 = i + 4;
            this.d = i5;
            fArr[i4] = f4;
            int i6 = i + 5;
            this.d = i6;
            fArr[i5] = f5;
            this.d = i + 6;
            fArr[i6] = f6;
        }

        @Override // yq60.w
        public final void c(float f, float f2) {
            f((byte) 1);
            g(2);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            this.d = i + 2;
            fArr[i2] = f2;
        }

        @Override // yq60.w
        public final void close() {
            f((byte) 8);
        }

        @Override // yq60.w
        public final void d(float f, float f2, float f3, float f4) {
            f((byte) 3);
            g(4);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.d = i3;
            fArr[i2] = f2;
            int i4 = i + 3;
            this.d = i4;
            fArr[i3] = f3;
            this.d = i + 4;
            fArr[i4] = f4;
        }

        @Override // yq60.w
        public final void e(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            f((byte) ((z ? 2 : 0) | 4 | (z2 ? 1 : 0)));
            g(5);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.d = i3;
            fArr[i2] = f2;
            int i4 = i + 3;
            this.d = i4;
            fArr[i3] = f3;
            int i5 = i + 4;
            this.d = i5;
            fArr[i4] = f4;
            this.d = i + 5;
            fArr[i5] = f5;
        }

        public final void f(byte b) {
            int i = this.b;
            byte[] bArr = this.a;
            if (i == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.a = bArr2;
                bArr = bArr2;
            }
            int i2 = this.b;
            this.b = i2 + 1;
            bArr[i2] = b;
        }

        public final void g(int i) {
            float[] fArr = this.c;
            if (fArr.length < this.d + i) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.c = fArr2;
            }
        }

        public final void h(w wVar) {
            int i = 0;
            for (int i2 = 0; i2 < this.b; i2++) {
                byte b = this.a[i2];
                if (b == 0) {
                    float[] fArr = this.c;
                    int i3 = i + 1;
                    float f = fArr[i];
                    i += 2;
                    wVar.a(f, fArr[i3]);
                } else if (b == 1) {
                    float[] fArr2 = this.c;
                    int i4 = i + 1;
                    float f2 = fArr2[i];
                    i += 2;
                    wVar.c(f2, fArr2[i4]);
                } else if (b == 2) {
                    float[] fArr3 = this.c;
                    wVar.b(fArr3[i], fArr3[i + 1], fArr3[i + 2], fArr3[i + 3], fArr3[i + 4], fArr3[i + 5]);
                    i += 6;
                } else if (b == 3) {
                    float[] fArr4 = this.c;
                    float f3 = fArr4[i];
                    float f4 = fArr4[i + 1];
                    int i5 = i + 3;
                    float f5 = fArr4[i + 2];
                    i += 4;
                    wVar.d(f3, f4, f5, fArr4[i5]);
                } else if (b != 8) {
                    boolean z = (b & 2) != 0;
                    boolean z2 = (b & 1) != 0;
                    float[] fArr5 = this.c;
                    wVar.e(fArr5[i], fArr5[i + 1], fArr5[i + 2], z, z2, fArr5[i + 3], fArr5[i + 4]);
                    i += 5;
                } else {
                    wVar.close();
                }
            }
        }
    }

    public static class v0 extends z0 implements a1, m {
        public Matrix r;

        @Override // yq60.m
        public final void k(Matrix matrix) {
            this.r = matrix;
        }

        @Override // yq60.m0
        public final String n() {
            return "text";
        }
    }

    public interface w {
        void a(float f, float f2);

        void b(float f, float f2, float f3, float f4, float f5, float f6);

        void c(float f, float f2);

        void close();

        void d(float f, float f2, float f3, float f4);

        void e(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5);
    }

    public interface w0 {
        a1 c();
    }

    public static class x extends q0 implements s {
        public Boolean p;
        public Boolean q;
        public Matrix r;
        public o s;
        public o t;
        public o u;
        public o v;
        public String w;

        @Override // yq60.m0
        public final String n() {
            return "pattern";
        }
    }

    public static abstract class x0 extends g0 {
        @Override // yq60.g0, yq60.i0
        public final void g(m0 m0Var) throws ar60 {
            if (m0Var instanceof w0) {
                this.i.add(m0Var);
                return;
            }
            throw new ar60("Text content elements cannot contain " + m0Var + " elements.");
        }
    }

    public static class y extends k {
        public float[] o;

        @Override // yq60.m0
        public String n() {
            return "polyline";
        }
    }

    public static class y0 extends x0 implements w0 {
        public String n;
        public o o;
        public a1 p;

        @Override // yq60.w0
        public final a1 c() {
            return this.p;
        }

        @Override // yq60.m0
        public final String n() {
            return "textPath";
        }
    }

    public static class z extends y {
        @Override // yq60.y, yq60.m0
        public final String n() {
            return "polygon";
        }
    }

    public static abstract class z0 extends x0 {
        public ArrayList n;
        public ArrayList o;
        public ArrayList p;
        public ArrayList q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static k0 b(i0 i0Var, String str) {
        k0 k0VarB;
        k0 k0Var = (k0) i0Var;
        if (str.equals(k0Var.c)) {
            return k0Var;
        }
        for (Object obj : i0Var.getChildren()) {
            if (obj instanceof k0) {
                k0 k0Var2 = (k0) obj;
                if (str.equals(k0Var2.c)) {
                    return k0Var2;
                }
                if ((obj instanceof i0) && (k0VarB = b((i0) obj, str)) != null) {
                    return k0VarB;
                }
            }
        }
        return null;
    }

    public final a a() {
        c1 c1Var;
        c1 c1Var2;
        c1 c1Var3;
        c1 c1Var4;
        float fA;
        c1 c1Var5;
        e0 e0Var = this.a;
        o oVar = e0Var.r;
        o oVar2 = e0Var.s;
        if (oVar == null || oVar.g() || (c1Var = oVar.b) == (c1Var2 = c1.e) || c1Var == (c1Var3 = c1.b) || c1Var == (c1Var4 = c1.c)) {
            return new a(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fA2 = oVar.a();
        if (oVar2 == null) {
            a aVar = this.a.o;
            fA = aVar != null ? (aVar.d * fA2) / aVar.c : fA2;
        } else {
            if (oVar2.g() || (c1Var5 = oVar2.b) == c1Var2 || c1Var5 == c1Var3 || c1Var5 == c1Var4) {
                return new a(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fA = oVar2.a();
        }
        return new a(0.0f, 0.0f, fA2, fA);
    }

    public final Picture c(int i2, int i3, z750 z750Var) {
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(i2, i3);
        if (z750Var == null || z750Var.b == null) {
            if (z750Var == null) {
                z750Var = new z750();
            } else {
                z750 z750Var2 = new z750();
                z750Var2.a = null;
                z750Var2.b = null;
                z750Var2.a = z750Var.a;
                z750Var2.b = z750Var.b;
                z750Var = z750Var2;
            }
            z750Var.b = new a(0.0f, 0.0f, i2, i3);
        }
        new zq60(canvasBeginRecording).I(this, z750Var);
        picture.endRecording();
        return picture;
    }

    public final k0 d(String str) {
        String strSubstring;
        if (str == null) {
            return null;
        }
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        String strReplace = str.replace("\\\n", "").replace("\\A", "\n");
        if (strReplace.length() <= 1 || !strReplace.startsWith(gvQvkPPtA.XUgdqUYDnABG) || (strSubstring = strReplace.substring(1)) == null || strSubstring.length() == 0) {
            return null;
        }
        if (strSubstring.equals(this.a.c)) {
            return this.a;
        }
        HashMap map = this.c;
        if (map.containsKey(strSubstring)) {
            return (k0) map.get(strSubstring);
        }
        k0 k0VarB = b(this.a, strSubstring);
        map.put(strSubstring, k0VarB);
        return k0VarB;
    }

    public static class o implements Cloneable {
        public final float a;
        public final c1 b;

        public o(float f) {
            this.a = f;
            this.b = c1.a;
        }

        public final float a() {
            float f;
            float f2;
            int iOrdinal = this.b.ordinal();
            float f3 = this.a;
            if (iOrdinal == 0) {
                return f3;
            }
            if (iOrdinal == 3) {
                return f3 * 96.0f;
            }
            if (iOrdinal == 4) {
                f = f3 * 96.0f;
                f2 = 2.54f;
            } else if (iOrdinal == 5) {
                f = f3 * 96.0f;
                f2 = 25.4f;
            } else if (iOrdinal == 6) {
                f = f3 * 96.0f;
                f2 = 72.0f;
            } else {
                if (iOrdinal != 7) {
                    return f3;
                }
                f = f3 * 96.0f;
                f2 = 6.0f;
            }
            return f / f2;
        }

        public final float b(zq60 zq60Var) {
            if (this.b != c1.e) {
                return d(zq60Var);
            }
            zq60.g gVar = zq60Var.c;
            a aVar = gVar.g;
            if (aVar == null) {
                aVar = gVar.f;
            }
            float f = this.a;
            if (aVar == null) {
                return f;
            }
            float fSqrt = aVar.c;
            float f2 = aVar.d;
            if (fSqrt != f2) {
                fSqrt = (float) (Math.sqrt((f2 * f2) + (fSqrt * fSqrt)) / 1.414213562373095d);
            }
            return (f * fSqrt) / 100.0f;
        }

        public final float c(zq60 zq60Var, float f) {
            return this.b == c1.e ? (this.a * f) / 100.0f : d(zq60Var);
        }

        public final float d(zq60 zq60Var) {
            float textSize;
            int iOrdinal = this.b.ordinal();
            float f = this.a;
            switch (iOrdinal) {
                case 1:
                    textSize = zq60Var.c.d.getTextSize();
                    break;
                case 2:
                    textSize = zq60Var.c.d.getTextSize() / 2.0f;
                    break;
                case 3:
                    zq60Var.getClass();
                    return f * 96.0f;
                case 4:
                    zq60Var.getClass();
                    return (f * 96.0f) / 2.54f;
                case 5:
                    zq60Var.getClass();
                    return (f * 96.0f) / 25.4f;
                case 6:
                    zq60Var.getClass();
                    return (f * 96.0f) / 72.0f;
                case 7:
                    zq60Var.getClass();
                    return (f * 96.0f) / 6.0f;
                case 8:
                    zq60.g gVar = zq60Var.c;
                    a aVar = gVar.g;
                    if (aVar == null) {
                        aVar = gVar.f;
                    }
                    if (aVar != null) {
                        return (f * aVar.c) / 100.0f;
                    }
                default:
                    return f;
            }
            return textSize * f;
        }

        public final float e(zq60 zq60Var) {
            if (this.b != c1.e) {
                return d(zq60Var);
            }
            zq60.g gVar = zq60Var.c;
            a aVar = gVar.g;
            if (aVar == null) {
                aVar = gVar.f;
            }
            float f = this.a;
            return aVar == null ? f : (f * aVar.d) / 100.0f;
        }

        public final boolean f() {
            return this.a < 0.0f;
        }

        public final boolean g() {
            return this.a == 0.0f;
        }

        public final String toString() {
            return String.valueOf(this.a) + this.b;
        }

        public o(float f, c1 c1Var) {
            this.a = f;
            this.b = c1Var;
        }
    }

    public static class a {
        public float a;
        public float b;
        public float c;
        public float d;

        public a(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
        }

        public final float a() {
            return this.a + this.c;
        }

        public final float b() {
            return this.b + this.d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("[");
            sb.append(this.a);
            sb.append(" ");
            sb.append(this.b);
            sb.append(" ");
            sb.append(this.c);
            sb.append(" ");
            return wi1.a(this.d, "]", sb);
        }

        public a(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }
    }

    public static class b0 extends k0 implements i0 {
        @Override // yq60.i0
        public final List<m0> getChildren() {
            return Collections.EMPTY_LIST;
        }

        @Override // yq60.m0
        public final String n() {
            return "solidColor";
        }

        @Override // yq60.i0
        public final void g(m0 m0Var) {
        }
    }

    public static class c0 extends k0 implements i0 {
        public Float h;

        @Override // yq60.i0
        public final List<m0> getChildren() {
            return Collections.EMPTY_LIST;
        }

        @Override // yq60.m0
        public final String n() {
            return "stop";
        }

        @Override // yq60.i0
        public final void g(m0 m0Var) {
        }
    }

    public static abstract class g0 extends j0 implements i0, f0 {
        public List<m0> i = new ArrayList();
        public HashSet j = null;
        public String k = null;
        public HashSet l = null;
        public HashSet m = null;

        @Override // yq60.f0
        public final Set<String> a() {
            return null;
        }

        @Override // yq60.f0
        public final String b() {
            return this.k;
        }

        @Override // yq60.f0
        public final void d(HashSet hashSet) {
            this.j = hashSet;
        }

        @Override // yq60.f0
        public final Set<String> e() {
            return this.j;
        }

        @Override // yq60.i0
        public void g(m0 m0Var) {
            this.i.add(m0Var);
        }

        @Override // yq60.i0
        public final List<m0> getChildren() {
            return this.i;
        }

        @Override // yq60.f0
        public final void h(HashSet hashSet) {
            this.m = hashSet;
        }

        @Override // yq60.f0
        public final void i(String str) {
            this.k = str;
        }

        @Override // yq60.f0
        public final void j(HashSet hashSet) {
            this.l = hashSet;
        }

        @Override // yq60.f0
        public final Set<String> l() {
            return this.l;
        }

        @Override // yq60.f0
        public final Set<String> m() {
            return this.m;
        }

        @Override // yq60.f0
        public final void f(HashSet hashSet) {
        }
    }
}
