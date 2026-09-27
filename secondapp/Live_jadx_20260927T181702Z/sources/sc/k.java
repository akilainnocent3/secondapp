package sc;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.util.Log;
import com.ironsource.C4235d4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.yandex.div.core.timer.TimerController;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class k {
    public static final long A = 16384;
    public static final long B = 32768;
    public static final long C = 65536;
    public static final long D = 131072;
    public static final long E = 262144;
    public static final long F = 524288;
    public static final long G = 1048576;
    public static final long H = 2097152;
    public static final long I = 4194304;
    public static final long J = 8388608;
    public static final long K = 16777216;
    public static final long L = 33554432;
    public static final long M = 67108864;
    public static final long N = 134217728;
    public static final long O = 268435456;
    public static final long P = 536870912;
    public static final long Q = 1073741824;
    public static final long R = 2147483648L;
    public static final long S = 4294967296L;
    public static final long T = 8589934592L;
    public static final long U = 17179869184L;
    public static final long V = 34359738368L;
    public static final long W = 68719476736L;
    public static final long X = 137438953472L;
    public static final long Y = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f129877g = "1.4";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f129878h = 512;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f129879i = 512;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final double f129880j = 1.414213562373095d;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static sc.m f129881k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f129882l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f129883m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f129884n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f129885o = 4;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f129886p = 8;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f129887q = 16;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f129888r = 32;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final long f129889s = 64;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f129890t = 128;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final long f129891u = 256;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final long f129892v = 512;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final long f129893w = 1024;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final long f129894x = 2048;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final long f129895y = 4096;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final long f129896z = 8192;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f0 f129897a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f129898b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f129899c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f129900d = 96.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public sc.c.r f129901e = new sc.c.r();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, l0> f129902f = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f129903a;

        static {
            int[] iArr = new int[d1.values().length];
            f129903a = iArr;
            try {
                iArr[d1.px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f129903a[d1.em.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f129903a[d1.ex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f129903a[d1.in.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f129903a[d1.cm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f129903a[d1.mm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f129903a[d1.pt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f129903a[d1.pc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f129903a[d1.percent.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a0 extends z {
        @Override // sc.k.z, sc.k.n0
        public String o() {
            return "polygon";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class a1 extends y0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public List<p> f129904o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public List<p> f129905p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public List<p> f129906q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public List<p> f129907r;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b0 extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f129912o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f129913p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f129914q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f129915r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f129916s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f129917t;

        @Override // sc.k.n0
        public String o() {
            return "rect";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b1 {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p f129918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p f129919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p f129920c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public p f129921d;

        public c(p pVar, p pVar2, p pVar3, p pVar4) {
            this.f129918a = pVar;
            this.f129919b = pVar2;
            this.f129920c = pVar3;
            this.f129921d = pVar4;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c1 extends n0 implements x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f129922c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public b1 f129923d;

        public c1(String str) {
            this.f129922c = str;
        }

        @Override // sc.k.x0
        public b1 c() {
            return this.f129923d;
        }

        @Override // sc.k.x0
        public void l(b1 b1Var) {
            this.f129923d = b1Var;
        }

        public String toString() {
            return "TextChild: '" + this.f129922c + "'";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f129924o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f129925p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f129926q;

        @Override // sc.k.n0
        public String o() {
            return "circle";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum d1 {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class e extends m implements t {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Boolean f129938p;

        @Override // sc.k.m, sc.k.n0
        public String o() {
            return "clipPath";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class e0 implements Cloneable {
        public static final int O = 400;
        public static final int P = 700;
        public static final int Q = -1;
        public static final int R = 1;
        public String A;
        public Boolean B;
        public Boolean C;
        public o0 D;
        public Float E;
        public String F;
        public a G;
        public String H;
        public o0 I;
        public Float J;
        public o0 K;
        public Float L;
        public i M;
        public e N;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f129939b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public o0 f129940c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a f129941d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Float f129942e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public o0 f129943f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Float f129944g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public p f129945h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public c f129946i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public d f129947j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Float f129948k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p[] f129949l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p f129950m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Float f129951n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public f f129952o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public List<String> f129953p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f129954q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Integer f129955r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public b f129956s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public g f129957t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public h f129958u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public f f129959v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Boolean f129960w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public c f129961x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public String f129962y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f129963z;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public enum a {
            NonZero,
            EvenOdd
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public enum b {
            Normal,
            Italic,
            Oblique
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public enum c {
            Butt,
            Round,
            Square
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public enum d {
            Miter,
            Round,
            Bevel
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public enum e {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public enum f {
            Start,
            Middle,
            End
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public enum g {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public enum h {
            LTR,
            RTL
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public enum i {
            None,
            NonScalingStroke
        }

        public static e0 a() {
            e0 e0Var = new e0();
            e0Var.f129939b = -1L;
            f fVar = f.f130004c;
            e0Var.f129940c = fVar;
            a aVar = a.NonZero;
            e0Var.f129941d = aVar;
            Float fValueOf = Float.valueOf(1.0f);
            e0Var.f129942e = fValueOf;
            e0Var.f129943f = null;
            e0Var.f129944g = fValueOf;
            e0Var.f129945h = new p(1.0f);
            e0Var.f129946i = c.Butt;
            e0Var.f129947j = d.Miter;
            e0Var.f129948k = Float.valueOf(4.0f);
            e0Var.f129949l = null;
            e0Var.f129950m = new p(0.0f);
            e0Var.f129951n = fValueOf;
            e0Var.f129952o = fVar;
            e0Var.f129953p = null;
            e0Var.f129954q = new p(12.0f, d1.pt);
            e0Var.f129955r = 400;
            e0Var.f129956s = b.Normal;
            e0Var.f129957t = g.None;
            e0Var.f129958u = h.LTR;
            e0Var.f129959v = f.Start;
            Boolean bool = Boolean.TRUE;
            e0Var.f129960w = bool;
            e0Var.f129961x = null;
            e0Var.f129962y = null;
            e0Var.f129963z = null;
            e0Var.A = null;
            e0Var.B = bool;
            e0Var.C = bool;
            e0Var.D = fVar;
            e0Var.E = fValueOf;
            e0Var.F = null;
            e0Var.G = aVar;
            e0Var.H = null;
            e0Var.I = null;
            e0Var.J = fValueOf;
            e0Var.K = null;
            e0Var.L = fValueOf;
            e0Var.M = i.None;
            e0Var.N = e.auto;
            return e0Var;
        }

        public void b(boolean z10) {
            Float fValueOf = Float.valueOf(1.0f);
            Boolean bool = Boolean.TRUE;
            this.B = bool;
            if (!z10) {
                bool = Boolean.FALSE;
            }
            this.f129960w = bool;
            this.f129961x = null;
            this.F = null;
            this.f129951n = fValueOf;
            this.D = f.f130004c;
            this.E = fValueOf;
            this.H = null;
            this.I = null;
            this.J = fValueOf;
            this.K = null;
            this.L = fValueOf;
            this.M = i.None;
        }

        public Object clone() throws CloneNotSupportedException {
            e0 e0Var = (e0) super.clone();
            p[] pVarArr = this.f129949l;
            if (pVarArr != null) {
                e0Var.f129949l = (p[]) pVarArr.clone();
            }
            return e0Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class e1 extends m {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public String f129999p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f130000q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f130001r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f130002s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f130003t;

        @Override // sc.k.m, sc.k.n0
        public String o() {
            return "use";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class f extends o0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f130004c = new f(-16777216);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final f f130005d = new f(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f130006b;

        public f(int i10) {
            this.f130006b = i10;
        }

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.f130006b));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class f0 extends r0 {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f130007q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f130008r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f130009s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f130010t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public String f130011u;

        @Override // sc.k.n0
        public String o() {
            return "svg";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class f1 extends r0 implements t {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f130012q = "view";

        @Override // sc.k.n0
        public String o() {
            return "view";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class g extends o0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static g f130013b = new g();

        public static g a() {
            return f130013b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface g0 {
        String a();

        void b(Set<String> set);

        void e(Set<String> set);

        Set<String> f();

        Set<String> g();

        Set<String> getRequiredFeatures();

        void i(Set<String> set);

        void j(Set<String> set);

        void k(String str);

        Set<String> n();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class h extends m implements t {
        @Override // sc.k.m, sc.k.n0
        public String o() {
            return "defs";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class h0 extends k0 implements j0, g0 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public List<n0> f130014i = new ArrayList();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Set<String> f130015j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f130016k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Set<String> f130017l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Set<String> f130018m = null;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Set<String> f130019n = null;

        @Override // sc.k.g0
        public String a() {
            return this.f130016k;
        }

        @Override // sc.k.g0
        public void b(Set<String> set) {
            this.f130019n = set;
        }

        @Override // sc.k.j0
        public void d(n0 n0Var) throws sc.o {
            this.f130014i.add(n0Var);
        }

        @Override // sc.k.g0
        public void e(Set<String> set) {
            this.f130017l = set;
        }

        @Override // sc.k.g0
        public Set<String> f() {
            return this.f130018m;
        }

        @Override // sc.k.g0
        public Set<String> g() {
            return null;
        }

        @Override // sc.k.g0
        public Set<String> getRequiredFeatures() {
            return this.f130015j;
        }

        @Override // sc.k.j0
        public List<n0> h() {
            return this.f130014i;
        }

        @Override // sc.k.g0
        public void i(Set<String> set) {
            this.f130015j = set;
        }

        @Override // sc.k.g0
        public void j(Set<String> set) {
            this.f130018m = set;
        }

        @Override // sc.k.g0
        public void k(String str) {
            this.f130016k = str;
        }

        @Override // sc.k.g0
        public Set<String> n() {
            return this.f130019n;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class i extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f130020o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f130021p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f130022q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f130023r;

        @Override // sc.k.n0
        public String o() {
            return "ellipse";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class i0 extends k0 implements g0 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Set<String> f130024i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f130025j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Set<String> f130026k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Set<String> f130027l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Set<String> f130028m = null;

        @Override // sc.k.g0
        public String a() {
            return this.f130025j;
        }

        @Override // sc.k.g0
        public void b(Set<String> set) {
            this.f130028m = set;
        }

        @Override // sc.k.g0
        public void e(Set<String> set) {
            this.f130026k = set;
        }

        @Override // sc.k.g0
        public Set<String> f() {
            return this.f130027l;
        }

        @Override // sc.k.g0
        public Set<String> g() {
            return this.f130026k;
        }

        @Override // sc.k.g0
        public Set<String> getRequiredFeatures() {
            return this.f130024i;
        }

        @Override // sc.k.g0
        public void i(Set<String> set) {
            this.f130024i = set;
        }

        @Override // sc.k.g0
        public void j(Set<String> set) {
            this.f130027l = set;
        }

        @Override // sc.k.g0
        public void k(String str) {
            this.f130025j = str;
        }

        @Override // sc.k.g0
        public Set<String> n() {
            return this.f130028m;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class j extends l0 implements j0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List<n0> f130029h = new ArrayList();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Boolean f130030i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Matrix f130031j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public EnumC1284k f130032k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f130033l;

        @Override // sc.k.j0
        public void d(n0 n0Var) throws sc.o {
            if (n0Var instanceof d0) {
                this.f130029h.add(n0Var);
                return;
            }
            throw new sc.o("Gradient elements cannot contain " + n0Var + " elements.");
        }

        @Override // sc.k.j0
        public List<n0> h() {
            return this.f130029h;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface j0 {
        void d(n0 n0Var) throws sc.o;

        List<n0> h();
    }

    /* JADX INFO: renamed from: sc.k$k, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum EnumC1284k {
        pad,
        reflect,
        repeat
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class k0 extends l0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public b f130038h = null;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class l extends i0 implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Matrix f130039n;

        @Override // sc.k.n
        public void m(Matrix matrix) {
            this.f130039n = matrix;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class l0 extends n0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f130040c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f130041d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public e0 f130042e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public e0 f130043f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List<String> f130044g = null;

        public String toString() {
            return o();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class m extends h0 implements n {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Matrix f130045o;

        @Override // sc.k.n
        public void m(Matrix matrix) {
            this.f130045o = matrix;
        }

        @Override // sc.k.n0
        public String o() {
            return "group";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class m0 extends j {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p f130046m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p f130047n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f130048o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f130049p;

        @Override // sc.k.n0
        public String o() {
            return "linearGradient";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface n {
        void m(Matrix matrix);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public k f130050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public j0 f130051b;

        public String o() {
            return "";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class o extends p0 implements n {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public String f130052p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f130053q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f130054r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f130055s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f130056t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Matrix f130057u;

        @Override // sc.k.n
        public void m(Matrix matrix) {
            this.f130057u = matrix;
        }

        @Override // sc.k.n0
        public String o() {
            return "image";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class o0 implements Cloneable {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class p0 extends h0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public sc.h f130060o = null;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class q extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f130061o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f130062p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f130063q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f130064r;

        @Override // sc.k.n0
        public String o() {
            return "line";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class q0 extends j {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p f130065m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p f130066n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f130067o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f130068p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f130069q;

        @Override // sc.k.n0
        public String o() {
            return "radialGradient";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class r extends r0 implements t {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f130070q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f130071r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f130072s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f130073t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public p f130074u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Float f130075v;

        @Override // sc.k.n0
        public String o() {
            return "marker";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class r0 extends p0 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public b f130076p;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class s extends h0 implements t {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Boolean f130077o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Boolean f130078p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f130079q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f130080r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f130081s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f130082t;

        @Override // sc.k.n0
        public String o() {
            return "mask";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class s0 extends m {
        @Override // sc.k.m, sc.k.n0
        public String o() {
            return "switch";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface t {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class t0 extends r0 implements t {
        @Override // sc.k.n0
        public String o() {
            return "symbol";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class u extends o0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f130083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public o0 f130084c;

        public u(String str, o0 o0Var) {
            this.f130083b = str;
            this.f130084c = o0Var;
        }

        public String toString() {
            return this.f130083b + " " + this.f130084c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class u0 extends y0 implements x0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f130085o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public b1 f130086p;

        @Override // sc.k.x0
        public b1 c() {
            return this.f130086p;
        }

        @Override // sc.k.x0
        public void l(b1 b1Var) {
            this.f130086p = b1Var;
        }

        @Override // sc.k.n0
        public String o() {
            return "tref";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class v extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public w f130087o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Float f130088p;

        @Override // sc.k.n0
        public String o() {
            return "path";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class v0 extends a1 implements x0 {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public b1 f130089s;

        @Override // sc.k.x0
        public b1 c() {
            return this.f130089s;
        }

        @Override // sc.k.x0
        public void l(b1 b1Var) {
            this.f130089s = b1Var;
        }

        @Override // sc.k.n0
        public String o() {
            return "tspan";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class w implements x {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final byte f130090e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final byte f130091f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final byte f130092g = 2;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final byte f130093h = 3;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final byte f130094i = 4;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final byte f130095j = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f130097b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f130099d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f130096a = new byte[8];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float[] f130098c = new float[16];

        @Override // sc.k.x
        public void a(float f10, float f11) {
            f((byte) 0);
            g(2);
            float[] fArr = this.f130098c;
            int i10 = this.f130099d;
            int i11 = i10 + 1;
            this.f130099d = i11;
            fArr[i10] = f10;
            this.f130099d = i10 + 2;
            fArr[i11] = f11;
        }

        @Override // sc.k.x
        public void b(float f10, float f11) {
            f((byte) 1);
            g(2);
            float[] fArr = this.f130098c;
            int i10 = this.f130099d;
            int i11 = i10 + 1;
            this.f130099d = i11;
            fArr[i10] = f10;
            this.f130099d = i10 + 2;
            fArr[i11] = f11;
        }

        @Override // sc.k.x
        public void c(float f10, float f11, float f12, float f13) {
            f((byte) 3);
            g(4);
            float[] fArr = this.f130098c;
            int i10 = this.f130099d;
            int i11 = i10 + 1;
            this.f130099d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f130099d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f130099d = i13;
            fArr[i12] = f12;
            this.f130099d = i10 + 4;
            fArr[i13] = f13;
        }

        @Override // sc.k.x
        public void close() {
            f((byte) 8);
        }

        @Override // sc.k.x
        public void d(float f10, float f11, float f12, float f13, float f14, float f15) {
            f((byte) 2);
            g(6);
            float[] fArr = this.f130098c;
            int i10 = this.f130099d;
            int i11 = i10 + 1;
            this.f130099d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f130099d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f130099d = i13;
            fArr[i12] = f12;
            int i14 = i10 + 4;
            this.f130099d = i14;
            fArr[i13] = f13;
            int i15 = i10 + 5;
            this.f130099d = i15;
            fArr[i14] = f14;
            this.f130099d = i10 + 6;
            fArr[i15] = f15;
        }

        @Override // sc.k.x
        public void e(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            f((byte) ((z10 ? 2 : 0) | 4 | (z11 ? 1 : 0)));
            g(5);
            float[] fArr = this.f130098c;
            int i10 = this.f130099d;
            int i11 = i10 + 1;
            this.f130099d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f130099d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f130099d = i13;
            fArr[i12] = f12;
            int i14 = i10 + 4;
            this.f130099d = i14;
            fArr[i13] = f13;
            this.f130099d = i10 + 5;
            fArr[i14] = f14;
        }

        public final void f(byte b10) {
            int i10 = this.f130097b;
            byte[] bArr = this.f130096a;
            if (i10 == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f130096a = bArr2;
            }
            byte[] bArr3 = this.f130096a;
            int i11 = this.f130097b;
            this.f130097b = i11 + 1;
            bArr3[i11] = b10;
        }

        public final void g(int i10) {
            float[] fArr = this.f130098c;
            if (fArr.length < this.f130099d + i10) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f130098c = fArr2;
            }
        }

        public void h(x xVar) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.f130097b; i11++) {
                byte b10 = this.f130096a[i11];
                if (b10 == 0) {
                    float[] fArr = this.f130098c;
                    int i12 = i10 + 1;
                    float f10 = fArr[i10];
                    i10 += 2;
                    xVar.a(f10, fArr[i12]);
                } else if (b10 == 1) {
                    float[] fArr2 = this.f130098c;
                    int i13 = i10 + 1;
                    float f11 = fArr2[i10];
                    i10 += 2;
                    xVar.b(f11, fArr2[i13]);
                } else if (b10 == 2) {
                    float[] fArr3 = this.f130098c;
                    xVar.d(fArr3[i10], fArr3[i10 + 1], fArr3[i10 + 2], fArr3[i10 + 3], fArr3[i10 + 4], fArr3[i10 + 5]);
                    i10 += 6;
                } else if (b10 == 3) {
                    float[] fArr4 = this.f130098c;
                    float f12 = fArr4[i10];
                    float f13 = fArr4[i10 + 1];
                    int i14 = i10 + 3;
                    float f14 = fArr4[i10 + 2];
                    i10 += 4;
                    xVar.c(f12, f13, f14, fArr4[i14]);
                } else if (b10 != 8) {
                    boolean z10 = (b10 & 2) != 0;
                    boolean z11 = (b10 & 1) != 0;
                    float[] fArr5 = this.f130098c;
                    xVar.e(fArr5[i10], fArr5[i10 + 1], fArr5[i10 + 2], z10, z11, fArr5[i10 + 3], fArr5[i10 + 4]);
                    i10 += 5;
                } else {
                    xVar.close();
                }
            }
        }

        public boolean i() {
            return this.f130097b == 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class w0 extends a1 implements b1, n {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Matrix f130100s;

        @Override // sc.k.n
        public void m(Matrix matrix) {
            this.f130100s = matrix;
        }

        @Override // sc.k.n0
        public String o() {
            return "text";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface x {
        void a(float f10, float f11);

        void b(float f10, float f11);

        void c(float f10, float f11, float f12, float f13);

        void close();

        void d(float f10, float f11, float f12, float f13, float f14, float f15);

        void e(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface x0 {
        b1 c();

        void l(b1 b1Var);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class y extends r0 implements t {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Boolean f130101q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Boolean f130102r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Matrix f130103s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f130104t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public p f130105u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public p f130106v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public p f130107w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public String f130108x;

        @Override // sc.k.n0
        public String o() {
            return "pattern";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class y0 extends h0 {
        @Override // sc.k.h0, sc.k.j0
        public void d(n0 n0Var) throws sc.o {
            if (n0Var instanceof x0) {
                this.f130014i.add(n0Var);
                return;
            }
            throw new sc.o("Text content elements cannot contain " + n0Var + " elements.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class z extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float[] f130109o;

        @Override // sc.k.n0
        public String o() {
            return "polyline";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class z0 extends y0 implements x0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f130110o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f130111p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public b1 f130112q;

        @Override // sc.k.x0
        public b1 c() {
            return this.f130112q;
        }

        @Override // sc.k.x0
        public void l(b1 b1Var) {
            this.f130112q = b1Var;
        }

        @Override // sc.k.n0
        public String o() {
            return "textPath";
        }
    }

    public static String A() {
        return f129877g;
    }

    public static boolean D() {
        return f129882l;
    }

    public static void E(sc.m mVar) {
        f129881k = mVar;
    }

    public static void X(boolean z10) {
        f129882l = z10;
    }

    public static void d() {
        f129881k = null;
    }

    public static sc.m s() {
        return f129881k;
    }

    public static k t(AssetManager assetManager, String str) throws sc.o, IOException {
        sc.p pVar = new sc.p();
        InputStream inputStreamOpen = assetManager.open(str);
        try {
            return pVar.A(inputStreamOpen, f129882l);
        } finally {
            try {
                inputStreamOpen.close();
            } catch (IOException unused) {
            }
        }
    }

    public static k u(InputStream inputStream) throws sc.o {
        return new sc.p().A(inputStream, f129882l);
    }

    public static k v(Context context, int i10) throws sc.o {
        return w(context.getResources(), i10);
    }

    public static k w(Resources resources, int i10) throws sc.o {
        sc.p pVar = new sc.p();
        InputStream inputStreamOpenRawResource = resources.openRawResource(i10);
        try {
            return pVar.A(inputStreamOpenRawResource, f129882l);
        } finally {
            try {
                inputStreamOpenRawResource.close();
            } catch (IOException unused) {
            }
        }
    }

    public static k x(String str) throws sc.o {
        return new sc.p().A(new ByteArrayInputStream(str.getBytes()), f129882l);
    }

    public Set<String> B() {
        if (this.f129897a == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        List<n0> listQ = q("view");
        HashSet hashSet = new HashSet(listQ.size());
        Iterator<n0> it = listQ.iterator();
        while (it.hasNext()) {
            String str = ((f1) it.next()).f130040c;
            if (str != null) {
                hashSet.add(str);
            } else {
                Log.w("AndroidSVG", "getViewList(): found a <view> without an id attribute");
            }
        }
        return hashSet;
    }

    public boolean C() {
        return !this.f129901e.d();
    }

    public void F(Canvas canvas) {
        H(canvas, null);
    }

    public void G(Canvas canvas, RectF rectF) {
        sc.j jVar = new sc.j();
        if (rectF != null) {
            jVar.m(rectF.left, rectF.top, rectF.width(), rectF.height());
        } else {
            jVar.m(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new sc.l(canvas, this.f129900d).O0(this, jVar);
    }

    public void H(Canvas canvas, sc.j jVar) {
        if (jVar == null) {
            jVar = new sc.j();
        }
        if (!jVar.h()) {
            jVar.m(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new sc.l(canvas, this.f129900d).O0(this, jVar);
    }

    public Picture I() {
        return L(null);
    }

    public Picture J(int i10, int i11) {
        return K(i10, i11, null);
    }

    public Picture K(int i10, int i11, sc.j jVar) {
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(i10, i11);
        if (jVar == null || jVar.f129876f == null) {
            jVar = jVar == null ? new sc.j() : new sc.j(jVar);
            jVar.m(0.0f, 0.0f, i10, i11);
        }
        new sc.l(canvasBeginRecording, this.f129900d).O0(this, jVar);
        picture.endRecording();
        return picture;
    }

    public Picture L(sc.j jVar) {
        p pVar;
        b bVar = (jVar == null || !jVar.g()) ? this.f129897a.f130076p : jVar.f129874d;
        if (jVar != null && jVar.h()) {
            return K((int) Math.ceil(jVar.f129876f.b()), (int) Math.ceil(jVar.f129876f.c()), jVar);
        }
        f0 f0Var = this.f129897a;
        p pVar2 = f0Var.f130009s;
        if (pVar2 != null) {
            d1 d1Var = pVar2.f130059c;
            d1 d1Var2 = d1.percent;
            if (d1Var != d1Var2 && (pVar = f0Var.f130010t) != null && pVar.f130059c != d1Var2) {
                return K((int) Math.ceil(pVar2.b(this.f129900d)), (int) Math.ceil(this.f129897a.f130010t.b(this.f129900d)), jVar);
            }
        }
        if (pVar2 != null && bVar != null) {
            float fB = pVar2.b(this.f129900d);
            return K((int) Math.ceil(fB), (int) Math.ceil((bVar.f129911d * fB) / bVar.f129910c), jVar);
        }
        p pVar3 = f0Var.f130010t;
        if (pVar3 == null || bVar == null) {
            return K(512, 512, jVar);
        }
        float fB2 = pVar3.b(this.f129900d);
        return K((int) Math.ceil((bVar.f129910c * fB2) / bVar.f129911d), (int) Math.ceil(fB2), jVar);
    }

    public void M(String str, Canvas canvas) {
        H(canvas, sc.j.a().k(str));
    }

    public void N(String str, Canvas canvas, RectF rectF) {
        sc.j jVarK = sc.j.a().k(str);
        if (rectF != null) {
            jVarK.m(rectF.left, rectF.top, rectF.width(), rectF.height());
        }
        H(canvas, jVarK);
    }

    public Picture O(String str, int i10, int i11) {
        sc.j jVar = new sc.j();
        jVar.k(str).m(0.0f, 0.0f, i10, i11);
        Picture picture = new Picture();
        new sc.l(picture.beginRecording(i10, i11), this.f129900d).O0(this, jVar);
        picture.endRecording();
        return picture;
    }

    public n0 P(String str) {
        if (str == null) {
            return null;
        }
        String strC = c(str);
        if (strC.length() <= 1 || !strC.startsWith("#")) {
            return null;
        }
        return o(strC.substring(1));
    }

    public void Q(String str) {
        this.f129899c = str;
    }

    public void R(float f10) {
        f0 f0Var = this.f129897a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f0Var.f130010t = new p(f10);
    }

    public void S(String str) throws sc.o {
        f0 f0Var = this.f129897a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f0Var.f130010t = sc.p.p0(str);
    }

    public void T(sc.h hVar) {
        f0 f0Var = this.f129897a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f0Var.f130060o = hVar;
    }

    public void U(float f10, float f11, float f12, float f13) {
        f0 f0Var = this.f129897a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f0Var.f130076p = new b(f10, f11, f12, f13);
    }

    public void V(float f10) {
        f0 f0Var = this.f129897a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f0Var.f130009s = new p(f10);
    }

    public void W(String str) throws sc.o {
        f0 f0Var = this.f129897a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f0Var.f130009s = sc.p.p0(str);
    }

    public void Y(float f10) {
        this.f129900d = f10;
    }

    public void Z(f0 f0Var) {
        this.f129897a = f0Var;
    }

    public void a(sc.c.r rVar) {
        this.f129901e.b(rVar);
    }

    public void a0(String str) {
        this.f129898b = str;
    }

    public void b() {
        this.f129901e.e(sc.c.u.RenderOptions);
    }

    public final String c(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", IOUtils.LINE_SEPARATOR_UNIX);
    }

    public List<sc.c.p> e() {
        return this.f129901e.c();
    }

    public float f() {
        f0 f0Var = this.f129897a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        p pVar = f0Var.f130009s;
        p pVar2 = f0Var.f130010t;
        if (pVar != null && pVar2 != null) {
            d1 d1Var = pVar.f130059c;
            d1 d1Var2 = d1.percent;
            if (d1Var != d1Var2 && pVar2.f130059c != d1Var2) {
                if (pVar.i() || pVar2.i()) {
                    return -1.0f;
                }
                return pVar.b(this.f129900d) / pVar2.b(this.f129900d);
            }
        }
        b bVar = f0Var.f130076p;
        if (bVar != null) {
            float f10 = bVar.f129910c;
            if (f10 != 0.0f) {
                float f11 = bVar.f129911d;
                if (f11 != 0.0f) {
                    return f10 / f11;
                }
            }
        }
        return -1.0f;
    }

    public String g() {
        if (this.f129897a != null) {
            return this.f129899c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public final b h(float f10) {
        d1 d1Var;
        d1 d1Var2;
        d1 d1Var3;
        d1 d1Var4;
        float fB;
        d1 d1Var5;
        f0 f0Var = this.f129897a;
        p pVar = f0Var.f130009s;
        p pVar2 = f0Var.f130010t;
        if (pVar == null || pVar.i() || (d1Var = pVar.f130059c) == (d1Var2 = d1.percent) || d1Var == (d1Var3 = d1.em) || d1Var == (d1Var4 = d1.ex)) {
            return new b(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fB2 = pVar.b(f10);
        if (pVar2 == null) {
            b bVar = this.f129897a.f130076p;
            fB = bVar != null ? (bVar.f129911d * fB2) / bVar.f129910c : fB2;
        } else {
            if (pVar2.i() || (d1Var5 = pVar2.f130059c) == d1Var2 || d1Var5 == d1Var3 || d1Var5 == d1Var4) {
                return new b(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fB = pVar2.b(f10);
        }
        return new b(0.0f, 0.0f, fB2, fB);
    }

    public float i() {
        if (this.f129897a != null) {
            return h(this.f129900d).f129911d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public sc.h j() {
        f0 f0Var = this.f129897a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        sc.h hVar = f0Var.f130060o;
        if (hVar == null) {
            return null;
        }
        return hVar;
    }

    public String k() {
        f0 f0Var = this.f129897a;
        if (f0Var != null) {
            return f0Var.f130011u;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public String l() {
        if (this.f129897a != null) {
            return this.f129898b;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public RectF m() {
        f0 f0Var = this.f129897a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        b bVar = f0Var.f130076p;
        if (bVar == null) {
            return null;
        }
        return bVar.d();
    }

    public float n() {
        if (this.f129897a != null) {
            return h(this.f129900d).f129910c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public l0 o(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.f129897a.f130040c)) {
            return this.f129897a;
        }
        if (this.f129902f.containsKey(str)) {
            return this.f129902f.get(str);
        }
        l0 l0VarP = p(this.f129897a, str);
        this.f129902f.put(str, l0VarP);
        return l0VarP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l0 p(j0 j0Var, String str) {
        l0 l0VarP;
        l0 l0Var = (l0) j0Var;
        if (str.equals(l0Var.f130040c)) {
            return l0Var;
        }
        for (Object obj : j0Var.h()) {
            if (obj instanceof l0) {
                l0 l0Var2 = (l0) obj;
                if (str.equals(l0Var2.f130040c)) {
                    return l0Var2;
                }
                if ((obj instanceof j0) && (l0VarP = p((j0) obj, str)) != null) {
                    return l0VarP;
                }
            }
        }
        return null;
    }

    public final List<n0> q(String str) {
        ArrayList arrayList = new ArrayList();
        r(arrayList, this.f129897a, str);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(List<n0> list, n0 n0Var, String str) {
        if (n0Var.o().equals(str)) {
            list.add(n0Var);
        }
        if (n0Var instanceof j0) {
            Iterator<n0> it = ((j0) n0Var).h().iterator();
            while (it.hasNext()) {
                r(list, it.next(), str);
            }
        }
    }

    public float y() {
        return this.f129900d;
    }

    public f0 z() {
        return this.f129897a;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class p implements Cloneable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f130058b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d1 f130059c;

        public p(float f10, d1 d1Var) {
            this.f130058b = f10;
            this.f130059c = d1Var;
        }

        public float a() {
            return this.f130058b;
        }

        public float b(float f10) {
            int i10 = a.f129903a[this.f130059c.ordinal()];
            if (i10 == 1) {
                return this.f130058b;
            }
            switch (i10) {
                case 4:
                    return this.f130058b * f10;
                case 5:
                    return (this.f130058b * f10) / 2.54f;
                case 6:
                    return (this.f130058b * f10) / 25.4f;
                case 7:
                    return (this.f130058b * f10) / 72.0f;
                case 8:
                    return (this.f130058b * f10) / 6.0f;
                default:
                    return this.f130058b;
            }
        }

        public float c(sc.l lVar) {
            if (this.f130059c != d1.percent) {
                return e(lVar);
            }
            b bVarA0 = lVar.a0();
            if (bVarA0 == null) {
                return this.f130058b;
            }
            float f10 = bVarA0.f129910c;
            float f11 = bVarA0.f129911d;
            if (f10 == f11) {
                return (this.f130058b * f10) / 100.0f;
            }
            return (this.f130058b * ((float) (Math.sqrt((f10 * f10) + (f11 * f11)) / 1.414213562373095d))) / 100.0f;
        }

        public float d(sc.l lVar, float f10) {
            return this.f130059c == d1.percent ? (this.f130058b * f10) / 100.0f : e(lVar);
        }

        public float e(sc.l lVar) {
            switch (a.f129903a[this.f130059c.ordinal()]) {
                case 1:
                    return this.f130058b;
                case 2:
                    return this.f130058b * lVar.Y();
                case 3:
                    return this.f130058b * lVar.Z();
                case 4:
                    return this.f130058b * lVar.b0();
                case 5:
                    return (this.f130058b * lVar.b0()) / 2.54f;
                case 6:
                    return (this.f130058b * lVar.b0()) / 25.4f;
                case 7:
                    return (this.f130058b * lVar.b0()) / 72.0f;
                case 8:
                    return (this.f130058b * lVar.b0()) / 6.0f;
                case 9:
                    b bVarA0 = lVar.a0();
                    return bVarA0 == null ? this.f130058b : (this.f130058b * bVarA0.f129910c) / 100.0f;
                default:
                    return this.f130058b;
            }
        }

        public float f(sc.l lVar) {
            if (this.f130059c != d1.percent) {
                return e(lVar);
            }
            b bVarA0 = lVar.a0();
            return bVarA0 == null ? this.f130058b : (this.f130058b * bVarA0.f129911d) / 100.0f;
        }

        public boolean g() {
            return this.f130058b < 0.0f;
        }

        public boolean i() {
            return this.f130058b == 0.0f;
        }

        public String toString() {
            return String.valueOf(this.f130058b) + this.f130059c;
        }

        public p(float f10) {
            this.f130058b = f10;
            this.f130059c = d1.px;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f129908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f129909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f129910c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f129911d;

        public b(float f10, float f11, float f12, float f13) {
            this.f129908a = f10;
            this.f129909b = f11;
            this.f129910c = f12;
            this.f129911d = f13;
        }

        public static b a(float f10, float f11, float f12, float f13) {
            return new b(f10, f11, f12 - f10, f13 - f11);
        }

        public float b() {
            return this.f129908a + this.f129910c;
        }

        public float c() {
            return this.f129909b + this.f129911d;
        }

        public RectF d() {
            return new RectF(this.f129908a, this.f129909b, b(), c());
        }

        public void e(b bVar) {
            float f10 = bVar.f129908a;
            if (f10 < this.f129908a) {
                this.f129908a = f10;
            }
            float f11 = bVar.f129909b;
            if (f11 < this.f129909b) {
                this.f129909b = f11;
            }
            if (bVar.b() > b()) {
                this.f129910c = bVar.b() - this.f129908a;
            }
            if (bVar.c() > c()) {
                this.f129911d = bVar.c() - this.f129909b;
            }
        }

        public String toString() {
            return C4235d4.j.f61460d + this.f129908a + " " + this.f129909b + " " + this.f129910c + " " + this.f129911d + C4235d4.j.f61462e;
        }

        public b(b bVar) {
            this.f129908a = bVar.f129908a;
            this.f129909b = bVar.f129909b;
            this.f129910c = bVar.f129910c;
            this.f129911d = bVar.f129911d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c0 extends l0 implements j0 {
        @Override // sc.k.j0
        public List<n0> h() {
            return Collections.EMPTY_LIST;
        }

        @Override // sc.k.n0
        public String o() {
            return "solidColor";
        }

        @Override // sc.k.j0
        public void d(n0 n0Var) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d0 extends l0 implements j0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Float f129927h;

        @Override // sc.k.j0
        public List<n0> h() {
            return Collections.EMPTY_LIST;
        }

        @Override // sc.k.n0
        public String o() {
            return TimerController.STOP_COMMAND;
        }

        @Override // sc.k.j0
        public void d(n0 n0Var) {
        }
    }
}
