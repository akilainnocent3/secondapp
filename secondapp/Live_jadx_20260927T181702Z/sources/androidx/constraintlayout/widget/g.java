package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.ironsource.C4235d4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import ew.b0;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import n0.w;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class g {
    public static final int A = 0;
    public static final int A0 = 28;
    public static final int A1 = 80;
    public static final int B = 1;
    public static final int B0 = 29;
    public static final int B1 = 81;
    public static final int C = 0;
    public static final int C0 = 30;
    public static final int C1 = 82;
    public static final int D = 1;
    public static final int D0 = 31;
    public static final int D1 = 83;
    public static final int E = 0;
    public static final int E0 = 32;
    public static final int E1 = 84;
    public static final int F = 4;
    public static final int F0 = 33;
    public static final int F1 = 85;
    public static final int G = 8;
    public static final int G0 = 34;
    public static final int G1 = 86;
    public static final int H = 1;
    public static final int H0 = 35;
    public static final int H1 = 87;
    public static final int I = 2;
    public static final int I0 = 36;
    public static final int I1 = 88;
    public static final int J = 3;
    public static final int J0 = 37;
    public static final int J1 = 89;
    public static final int K = 4;
    public static final int K0 = 38;
    public static final int K1 = 90;
    public static final int L = 5;
    public static final int L0 = 39;
    public static final int L1 = 91;
    public static final int M = 6;
    public static final int M0 = 40;
    public static final int M1 = 92;
    public static final int N = 7;
    public static final int N0 = 41;
    public static final int N1 = 93;
    public static final int O = 8;
    public static final int O0 = 42;
    public static final int O1 = 94;
    public static final int P = 0;
    public static final int P0 = 43;
    public static final int P1 = 95;
    public static final int Q = 1;
    public static final int Q0 = 44;
    public static final int Q1 = 96;
    public static final int R = 0;
    public static final int R0 = 45;
    public static final int R1 = 97;
    public static final int S = 1;
    public static final int S0 = 46;
    public static final int S1 = 98;
    public static final int T = 2;
    public static final int T0 = 47;
    public static final int T1 = 99;
    public static final boolean U = false;
    public static final int U0 = 48;
    public static final String U1 = "weight";
    public static final int V0 = 49;
    public static final String V1 = "ratio";
    public static final int W = 1;
    public static final int W0 = 50;
    public static final String W1 = "parent";
    public static final int X0 = 51;
    public static final int Y0 = 52;
    public static final int Z = 1;
    public static final int Z0 = 53;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f7966a0 = 2;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final int f7967a1 = 54;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f7968b0 = 3;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final int f7969b1 = 55;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f7970c0 = 4;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final int f7971c1 = 56;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f7972d0 = 5;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final int f7973d1 = 57;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f7974e0 = 6;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final int f7975e1 = 58;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f7976f0 = 7;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final int f7977f1 = 59;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f7978g0 = 8;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final int f7979g1 = 60;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f7980h0 = 9;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final int f7981h1 = 61;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f7982i = "ConstraintSet";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f7983i0 = 10;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final int f7984i1 = 62;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f7985j = "XML parser error must be within a Constraint ";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f7986j0 = 11;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final int f7987j1 = 63;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f7988k = -1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f7989k0 = 12;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final int f7990k1 = 64;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f7991l = -2;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int f7992l0 = 13;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final int f7993l1 = 65;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f7994m = -3;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f7995m0 = 14;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final int f7996m1 = 66;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f7997n = -4;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int f7998n0 = 15;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final int f7999n1 = 67;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f8000o = 0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final int f8001o0 = 16;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final int f8002o1 = 68;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f8003p = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f8004p0 = 17;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f8005p1 = 69;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f8006q = 2;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f8007q0 = 18;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final int f8008q1 = 70;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f8009r = 3;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f8010r0 = 19;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final int f8011r1 = 71;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f8012s = 4;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final int f8013s0 = 20;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final int f8014s1 = 72;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f8015t = -1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final int f8016t0 = 21;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final int f8017t1 = 73;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f8018u = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final int f8019u0 = 22;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final int f8020u1 = 74;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f8021v = -2;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final int f8022v0 = 23;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final int f8023v1 = 75;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f8024w = 1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final int f8025w0 = 24;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final int f8026w1 = 76;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f8027x = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final int f8028x0 = 25;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final int f8029x1 = 77;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f8030y = 2;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final int f8031y0 = 26;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final int f8032y1 = 78;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f8033z = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final int f8034z0 = 27;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static final int f8035z1 = 79;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f8037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f8038c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String[] f8039d = new String[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8040e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap<String, androidx.constraintlayout.widget.b> f8041f = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8042g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HashMap<Integer, a> f8043h = new HashMap<>();
    public static final int[] V = {0, 4, 8};
    public static SparseIntArray X = new SparseIntArray();
    public static SparseIntArray Y = new SparseIntArray();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f8045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f8046c = new d();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c f8047d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f8048e = new b();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e f8049f = new e();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.b> f8050g = new HashMap<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public C0038a f8051h;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class C0038a {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final int f8052m = 4;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final int f8053n = 10;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public static final int f8054o = 10;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public static final int f8055p = 5;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int[] f8056a = new int[10];

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int[] f8057b = new int[10];

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f8058c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int[] f8059d = new int[10];

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public float[] f8060e = new float[10];

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f8061f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int[] f8062g = new int[5];

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public String[] f8063h = new String[5];

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public int f8064i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int[] f8065j = new int[4];

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public boolean[] f8066k = new boolean[4];

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f8067l = 0;

            public void a(int i10, float f10) {
                int i11 = this.f8061f;
                int[] iArr = this.f8059d;
                if (i11 >= iArr.length) {
                    this.f8059d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f8060e;
                    this.f8060e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f8059d;
                int i12 = this.f8061f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f8060e;
                this.f8061f = i12 + 1;
                fArr2[i12] = f10;
            }

            public void b(int i10, int i11) {
                int i12 = this.f8058c;
                int[] iArr = this.f8056a;
                if (i12 >= iArr.length) {
                    this.f8056a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f8057b;
                    this.f8057b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f8056a;
                int i13 = this.f8058c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f8057b;
                this.f8058c = i13 + 1;
                iArr4[i13] = i11;
            }

            public void c(int i10, String str) {
                int i11 = this.f8064i;
                int[] iArr = this.f8062g;
                if (i11 >= iArr.length) {
                    this.f8062g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f8063h;
                    this.f8063h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f8062g;
                int i12 = this.f8064i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f8063h;
                this.f8064i = i12 + 1;
                strArr2[i12] = str;
            }

            public void d(int i10, boolean z10) {
                int i11 = this.f8067l;
                int[] iArr = this.f8065j;
                if (i11 >= iArr.length) {
                    this.f8065j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f8066k;
                    this.f8066k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f8065j;
                int i12 = this.f8067l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f8066k;
                this.f8067l = i12 + 1;
                zArr2[i12] = z10;
            }

            public void e(a aVar) {
                for (int i10 = 0; i10 < this.f8058c; i10++) {
                    g.V0(aVar, this.f8056a[i10], this.f8057b[i10]);
                }
                for (int i11 = 0; i11 < this.f8061f; i11++) {
                    g.U0(aVar, this.f8059d[i11], this.f8060e[i11]);
                }
                for (int i12 = 0; i12 < this.f8064i; i12++) {
                    g.W0(aVar, this.f8062g[i12], this.f8063h[i12]);
                }
                for (int i13 = 0; i13 < this.f8067l; i13++) {
                    g.X0(aVar, this.f8065j[i13], this.f8066k[i13]);
                }
            }

            @SuppressLint({"LogConditional"})
            public void f(String str) {
                Log.v(str, "int");
                for (int i10 = 0; i10 < this.f8058c; i10++) {
                    Log.v(str, this.f8056a[i10] + " = " + this.f8057b[i10]);
                }
                Log.v(str, w.b.f115804c);
                for (int i11 = 0; i11 < this.f8061f; i11++) {
                    Log.v(str, this.f8059d[i11] + " = " + this.f8060e[i11]);
                }
                Log.v(str, "strings");
                for (int i12 = 0; i12 < this.f8064i; i12++) {
                    Log.v(str, this.f8062g[i12] + " = " + this.f8063h[i12]);
                }
                Log.v(str, "boolean");
                for (int i13 = 0; i13 < this.f8067l; i13++) {
                    Log.v(str, this.f8065j[i13] + " = " + this.f8066k[i13]);
                }
            }
        }

        public void h(a aVar) {
            C0038a c0038a = this.f8051h;
            if (c0038a != null) {
                c0038a.e(aVar);
            }
        }

        public void i(ConstraintLayout.b bVar) {
            b bVar2 = this.f8048e;
            bVar.f7794e = bVar2.f8121j;
            bVar.f7796f = bVar2.f8123k;
            bVar.f7798g = bVar2.f8125l;
            bVar.f7800h = bVar2.f8127m;
            bVar.f7802i = bVar2.f8129n;
            bVar.f7804j = bVar2.f8131o;
            bVar.f7806k = bVar2.f8133p;
            bVar.f7808l = bVar2.f8135q;
            bVar.f7810m = bVar2.f8137r;
            bVar.f7812n = bVar2.f8138s;
            bVar.f7814o = bVar2.f8139t;
            bVar.f7822s = bVar2.f8140u;
            bVar.f7824t = bVar2.f8141v;
            bVar.f7826u = bVar2.f8142w;
            bVar.f7828v = bVar2.f8143x;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.H;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.I;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.J;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.K;
            bVar.A = bVar2.T;
            bVar.B = bVar2.S;
            bVar.f7832x = bVar2.P;
            bVar.f7834z = bVar2.R;
            bVar.G = bVar2.f8144y;
            bVar.H = bVar2.f8145z;
            bVar.f7816p = bVar2.B;
            bVar.f7818q = bVar2.C;
            bVar.f7820r = bVar2.D;
            bVar.I = bVar2.A;
            bVar.X = bVar2.E;
            bVar.Y = bVar2.F;
            bVar.M = bVar2.V;
            bVar.L = bVar2.W;
            bVar.O = bVar2.Y;
            bVar.N = bVar2.X;
            bVar.f7787a0 = bVar2.f8130n0;
            bVar.f7789b0 = bVar2.f8132o0;
            bVar.P = bVar2.Z;
            bVar.Q = bVar2.f8104a0;
            bVar.T = bVar2.f8106b0;
            bVar.U = bVar2.f8108c0;
            bVar.R = bVar2.f8110d0;
            bVar.S = bVar2.f8112e0;
            bVar.V = bVar2.f8114f0;
            bVar.W = bVar2.f8116g0;
            bVar.Z = bVar2.G;
            bVar.f7790c = bVar2.f8117h;
            bVar.f7786a = bVar2.f8113f;
            bVar.f7788b = bVar2.f8115g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f8109d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f8111e;
            String str = bVar2.f8128m0;
            if (str != null) {
                bVar.f7791c0 = str;
            }
            bVar.f7793d0 = bVar2.f8136q0;
            bVar.setMarginStart(bVar2.M);
            bVar.setMarginEnd(this.f8048e.L);
            bVar.e();
        }

        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f8048e.a(this.f8048e);
            aVar.f8047d.a(this.f8047d);
            aVar.f8046c.a(this.f8046c);
            aVar.f8049f.a(this.f8049f);
            aVar.f8044a = this.f8044a;
            aVar.f8051h = this.f8051h;
            return aVar;
        }

        public final void k(int i10, ConstraintLayout.b bVar) {
            this.f8044a = i10;
            b bVar2 = this.f8048e;
            bVar2.f8121j = bVar.f7794e;
            bVar2.f8123k = bVar.f7796f;
            bVar2.f8125l = bVar.f7798g;
            bVar2.f8127m = bVar.f7800h;
            bVar2.f8129n = bVar.f7802i;
            bVar2.f8131o = bVar.f7804j;
            bVar2.f8133p = bVar.f7806k;
            bVar2.f8135q = bVar.f7808l;
            bVar2.f8137r = bVar.f7810m;
            bVar2.f8138s = bVar.f7812n;
            bVar2.f8139t = bVar.f7814o;
            bVar2.f8140u = bVar.f7822s;
            bVar2.f8141v = bVar.f7824t;
            bVar2.f8142w = bVar.f7826u;
            bVar2.f8143x = bVar.f7828v;
            bVar2.f8144y = bVar.G;
            bVar2.f8145z = bVar.H;
            bVar2.A = bVar.I;
            bVar2.B = bVar.f7816p;
            bVar2.C = bVar.f7818q;
            bVar2.D = bVar.f7820r;
            bVar2.E = bVar.X;
            bVar2.F = bVar.Y;
            bVar2.G = bVar.Z;
            bVar2.f8117h = bVar.f7790c;
            bVar2.f8113f = bVar.f7786a;
            bVar2.f8115g = bVar.f7788b;
            bVar2.f8109d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f8111e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.H = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.K = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.N = bVar.D;
            bVar2.V = bVar.M;
            bVar2.W = bVar.L;
            bVar2.Y = bVar.O;
            bVar2.X = bVar.N;
            bVar2.f8130n0 = bVar.f7787a0;
            bVar2.f8132o0 = bVar.f7789b0;
            bVar2.Z = bVar.P;
            bVar2.f8104a0 = bVar.Q;
            bVar2.f8106b0 = bVar.T;
            bVar2.f8108c0 = bVar.U;
            bVar2.f8110d0 = bVar.R;
            bVar2.f8112e0 = bVar.S;
            bVar2.f8114f0 = bVar.V;
            bVar2.f8116g0 = bVar.W;
            bVar2.f8128m0 = bVar.f7791c0;
            bVar2.P = bVar.f7832x;
            bVar2.R = bVar.f7834z;
            bVar2.O = bVar.f7830w;
            bVar2.Q = bVar.f7833y;
            bVar2.T = bVar.A;
            bVar2.S = bVar.B;
            bVar2.U = bVar.C;
            bVar2.f8136q0 = bVar.f7793d0;
            bVar2.L = bVar.getMarginEnd();
            this.f8048e.M = bVar.getMarginStart();
        }

        public final void l(int i10, h.a aVar) {
            k(i10, aVar);
            this.f8046c.f8175d = aVar.V0;
            e eVar = this.f8049f;
            eVar.f8190b = aVar.Y0;
            eVar.f8191c = aVar.Z0;
            eVar.f8192d = aVar.f8235a1;
            eVar.f8193e = aVar.f8236b1;
            eVar.f8194f = aVar.f8237c1;
            eVar.f8195g = aVar.f8238d1;
            eVar.f8196h = aVar.f8239e1;
            eVar.f8198j = aVar.f8240f1;
            eVar.f8199k = aVar.f8241g1;
            eVar.f8200l = aVar.f8242h1;
            eVar.f8202n = aVar.X0;
            eVar.f8201m = aVar.W0;
        }

        public final void m(androidx.constraintlayout.widget.c cVar, int i10, h.a aVar) {
            l(i10, aVar);
            if (cVar instanceof androidx.constraintlayout.widget.a) {
                b bVar = this.f8048e;
                bVar.f8122j0 = 1;
                androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) cVar;
                bVar.f8118h0 = aVar2.getType();
                this.f8048e.f8124k0 = aVar2.getReferencedIds();
                this.f8048e.f8120i0 = aVar2.getMargin();
            }
        }

        public final androidx.constraintlayout.widget.b n(String str, androidx.constraintlayout.widget.b.a aVar) {
            if (!this.f8050g.containsKey(str)) {
                androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b(str, aVar);
                this.f8050g.put(str, bVar);
                return bVar;
            }
            androidx.constraintlayout.widget.b bVar2 = this.f8050g.get(str);
            if (bVar2.j() == aVar) {
                return bVar2;
            }
            throw new IllegalArgumentException("ConstraintAttribute is already a " + bVar2.j().name());
        }

        public void o(String str) {
            C0038a c0038a = this.f8051h;
            if (c0038a != null) {
                c0038a.f(str);
            } else {
                Log.v(str, "DELTA IS NULL");
            }
        }

        public final void p(String str, int i10) {
            n(str, androidx.constraintlayout.widget.b.a.COLOR_TYPE).s(i10);
        }

        public final void q(String str, float f10) {
            n(str, androidx.constraintlayout.widget.b.a.FLOAT_TYPE).t(f10);
        }

        public final void r(String str, int i10) {
            n(str, androidx.constraintlayout.widget.b.a.INT_TYPE).u(i10);
        }

        public final void s(String str, String str2) {
            n(str, androidx.constraintlayout.widget.b.a.STRING_TYPE).v(str2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {
        public static final int A0 = 7;
        public static final int A1 = 82;
        public static final int B0 = 8;
        public static final int B1 = 83;
        public static final int C0 = 9;
        public static final int C1 = 84;
        public static final int D0 = 10;
        public static final int D1 = 85;
        public static final int E0 = 11;
        public static final int E1 = 86;
        public static final int F0 = 12;
        public static final int F1 = 87;
        public static final int G0 = 13;
        public static final int G1 = 88;
        public static final int H0 = 14;
        public static final int H1 = 89;
        public static final int I0 = 15;
        public static final int I1 = 90;
        public static final int J0 = 16;
        public static final int J1 = 91;
        public static final int K0 = 17;
        public static final int L0 = 18;
        public static final int M0 = 19;
        public static final int N0 = 20;
        public static final int O0 = 21;
        public static final int P0 = 22;
        public static final int Q0 = 23;
        public static final int R0 = 24;
        public static final int S0 = 25;
        public static final int T0 = 26;
        public static final int U0 = 27;
        public static final int V0 = 28;
        public static final int W0 = 29;
        public static final int X0 = 30;
        public static final int Y0 = 31;
        public static final int Z0 = 32;

        /* JADX INFO: renamed from: a1, reason: collision with root package name */
        public static final int f8068a1 = 33;

        /* JADX INFO: renamed from: b1, reason: collision with root package name */
        public static final int f8069b1 = 34;

        /* JADX INFO: renamed from: c1, reason: collision with root package name */
        public static final int f8070c1 = 35;

        /* JADX INFO: renamed from: d1, reason: collision with root package name */
        public static final int f8071d1 = 36;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        public static final int f8072e1 = 37;

        /* JADX INFO: renamed from: f1, reason: collision with root package name */
        public static final int f8073f1 = 38;

        /* JADX INFO: renamed from: g1, reason: collision with root package name */
        public static final int f8074g1 = 39;

        /* JADX INFO: renamed from: h1, reason: collision with root package name */
        public static final int f8075h1 = 40;

        /* JADX INFO: renamed from: i1, reason: collision with root package name */
        public static final int f8076i1 = 41;

        /* JADX INFO: renamed from: j1, reason: collision with root package name */
        public static final int f8077j1 = 42;

        /* JADX INFO: renamed from: k1, reason: collision with root package name */
        public static final int f8078k1 = 61;

        /* JADX INFO: renamed from: l1, reason: collision with root package name */
        public static final int f8079l1 = 62;

        /* JADX INFO: renamed from: m1, reason: collision with root package name */
        public static final int f8080m1 = 63;

        /* JADX INFO: renamed from: n1, reason: collision with root package name */
        public static final int f8081n1 = 69;

        /* JADX INFO: renamed from: o1, reason: collision with root package name */
        public static final int f8082o1 = 70;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        public static final int f8083p1 = 71;

        /* JADX INFO: renamed from: q1, reason: collision with root package name */
        public static final int f8084q1 = 72;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static final int f8085r0 = -1;

        /* JADX INFO: renamed from: r1, reason: collision with root package name */
        public static final int f8086r1 = 73;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static final int f8087s0 = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: s1, reason: collision with root package name */
        public static final int f8088s1 = 74;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static SparseIntArray f8089t0 = null;

        /* JADX INFO: renamed from: t1, reason: collision with root package name */
        public static final int f8090t1 = 75;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static final int f8091u0 = 1;

        /* JADX INFO: renamed from: u1, reason: collision with root package name */
        public static final int f8092u1 = 76;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        public static final int f8093v0 = 2;

        /* JADX INFO: renamed from: v1, reason: collision with root package name */
        public static final int f8094v1 = 77;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static final int f8095w0 = 3;

        /* JADX INFO: renamed from: w1, reason: collision with root package name */
        public static final int f8096w1 = 78;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static final int f8097x0 = 4;

        /* JADX INFO: renamed from: x1, reason: collision with root package name */
        public static final int f8098x1 = 79;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public static final int f8099y0 = 5;

        /* JADX INFO: renamed from: y1, reason: collision with root package name */
        public static final int f8100y1 = 80;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        public static final int f8101z0 = 6;

        /* JADX INFO: renamed from: z1, reason: collision with root package name */
        public static final int f8102z1 = 81;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f8109d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8111e;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public int[] f8124k0;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public String f8126l0;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public String f8128m0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f8103a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f8105b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f8107c = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f8113f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f8115g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f8117h = -1.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f8119i = true;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f8121j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f8123k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f8125l = -1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f8127m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f8129n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f8131o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f8133p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f8135q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f8137r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f8138s = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f8139t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f8140u = -1;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f8141v = -1;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f8142w = -1;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f8143x = -1;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public float f8144y = 0.5f;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public float f8145z = 0.5f;
        public String A = null;
        public int B = -1;
        public int C = 0;
        public float D = 0.0f;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public int U = Integer.MIN_VALUE;
        public float V = -1.0f;
        public float W = -1.0f;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public int f8104a0 = 0;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public int f8106b0 = 0;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public int f8108c0 = 0;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f8110d0 = 0;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public int f8112e0 = 0;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public float f8114f0 = 1.0f;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public float f8116g0 = 1.0f;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public int f8118h0 = -1;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public int f8120i0 = 0;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public int f8122j0 = -1;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public boolean f8130n0 = false;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public boolean f8132o0 = false;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public boolean f8134p0 = true;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f8136q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8089t0 = sparseIntArray;
            sparseIntArray.append(l.c.Vb, 24);
            f8089t0.append(l.c.Wb, 25);
            f8089t0.append(l.c.Yb, 28);
            f8089t0.append(l.c.Zb, 29);
            f8089t0.append(l.c.f8550ec, 35);
            f8089t0.append(l.c.f8533dc, 34);
            f8089t0.append(l.c.Cb, 4);
            f8089t0.append(l.c.Bb, 3);
            f8089t0.append(l.c.f8871xb, 1);
            f8089t0.append(l.c.f8702nc, 6);
            f8089t0.append(l.c.f8719oc, 7);
            f8089t0.append(l.c.Jb, 17);
            f8089t0.append(l.c.Kb, 18);
            f8089t0.append(l.c.Lb, 19);
            f8089t0.append(l.c.f8803tb, 90);
            f8089t0.append(l.c.f8549eb, 26);
            f8089t0.append(l.c.f8482ac, 31);
            f8089t0.append(l.c.f8499bc, 32);
            f8089t0.append(l.c.Ib, 10);
            f8089t0.append(l.c.Hb, 9);
            f8089t0.append(l.c.f8787sc, 13);
            f8089t0.append(l.c.f8838vc, 16);
            f8089t0.append(l.c.f8804tc, 14);
            f8089t0.append(l.c.f8753qc, 11);
            f8089t0.append(l.c.f8821uc, 15);
            f8089t0.append(l.c.f8770rc, 12);
            f8089t0.append(l.c.f8601hc, 38);
            f8089t0.append(l.c.Tb, 37);
            f8089t0.append(l.c.Sb, 39);
            f8089t0.append(l.c.f8584gc, 40);
            f8089t0.append(l.c.Rb, 20);
            f8089t0.append(l.c.f8567fc, 36);
            f8089t0.append(l.c.Gb, 5);
            f8089t0.append(l.c.Ub, 91);
            f8089t0.append(l.c.f8516cc, 91);
            f8089t0.append(l.c.Xb, 91);
            f8089t0.append(l.c.Ab, 91);
            f8089t0.append(l.c.f8854wb, 91);
            f8089t0.append(l.c.f8600hb, 23);
            f8089t0.append(l.c.f8633jb, 27);
            f8089t0.append(l.c.f8667lb, 30);
            f8089t0.append(l.c.f8684mb, 8);
            f8089t0.append(l.c.f8617ib, 33);
            f8089t0.append(l.c.f8650kb, 2);
            f8089t0.append(l.c.f8566fb, 22);
            f8089t0.append(l.c.f8583gb, 21);
            f8089t0.append(l.c.f8618ic, 41);
            f8089t0.append(l.c.Mb, 42);
            f8089t0.append(l.c.f8837vb, 87);
            f8089t0.append(l.c.f8820ub, 88);
            f8089t0.append(l.c.f8872xc, 76);
            f8089t0.append(l.c.Db, 61);
            f8089t0.append(l.c.Fb, 62);
            f8089t0.append(l.c.Eb, 63);
            f8089t0.append(l.c.f8685mc, 69);
            f8089t0.append(l.c.Qb, 70);
            f8089t0.append(l.c.f8752qb, 71);
            f8089t0.append(l.c.f8718ob, 72);
            f8089t0.append(l.c.f8735pb, 73);
            f8089t0.append(l.c.f8769rb, 74);
            f8089t0.append(l.c.f8701nb, 75);
            f8089t0.append(l.c.f8651kc, 84);
            f8089t0.append(l.c.f8668lc, 86);
            f8089t0.append(l.c.f8651kc, 83);
            f8089t0.append(l.c.Pb, 85);
            f8089t0.append(l.c.f8618ic, 87);
            f8089t0.append(l.c.Mb, 88);
            f8089t0.append(l.c.f8829v3, 89);
            f8089t0.append(l.c.f8803tb, 90);
        }

        public void a(b bVar) {
            this.f8103a = bVar.f8103a;
            this.f8109d = bVar.f8109d;
            this.f8105b = bVar.f8105b;
            this.f8111e = bVar.f8111e;
            this.f8113f = bVar.f8113f;
            this.f8115g = bVar.f8115g;
            this.f8117h = bVar.f8117h;
            this.f8119i = bVar.f8119i;
            this.f8121j = bVar.f8121j;
            this.f8123k = bVar.f8123k;
            this.f8125l = bVar.f8125l;
            this.f8127m = bVar.f8127m;
            this.f8129n = bVar.f8129n;
            this.f8131o = bVar.f8131o;
            this.f8133p = bVar.f8133p;
            this.f8135q = bVar.f8135q;
            this.f8137r = bVar.f8137r;
            this.f8138s = bVar.f8138s;
            this.f8139t = bVar.f8139t;
            this.f8140u = bVar.f8140u;
            this.f8141v = bVar.f8141v;
            this.f8142w = bVar.f8142w;
            this.f8143x = bVar.f8143x;
            this.f8144y = bVar.f8144y;
            this.f8145z = bVar.f8145z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f8104a0 = bVar.f8104a0;
            this.f8106b0 = bVar.f8106b0;
            this.f8108c0 = bVar.f8108c0;
            this.f8110d0 = bVar.f8110d0;
            this.f8112e0 = bVar.f8112e0;
            this.f8114f0 = bVar.f8114f0;
            this.f8116g0 = bVar.f8116g0;
            this.f8118h0 = bVar.f8118h0;
            this.f8120i0 = bVar.f8120i0;
            this.f8122j0 = bVar.f8122j0;
            this.f8128m0 = bVar.f8128m0;
            int[] iArr = bVar.f8124k0;
            if (iArr == null || bVar.f8126l0 != null) {
                this.f8124k0 = null;
            } else {
                this.f8124k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f8126l0 = bVar.f8126l0;
            this.f8130n0 = bVar.f8130n0;
            this.f8132o0 = bVar.f8132o0;
            this.f8134p0 = bVar.f8134p0;
            this.f8136q0 = bVar.f8136q0;
        }

        public void b(androidx.constraintlayout.motion.widget.b bVar, StringBuilder sb2) {
            Field[] declaredFields = getClass().getDeclaredFields();
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
            for (Field field : declaredFields) {
                String name = field.getName();
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        Object obj = field.get(this);
                        Class<?> type = field.getType();
                        if (type == Integer.TYPE) {
                            Integer num = (Integer) obj;
                            if (num.intValue() != -1) {
                                Object objY = bVar.Y(num.intValue());
                                sb2.append(b0.f81731a);
                                sb2.append(name);
                                sb2.append(" = \"");
                                sb2.append(objY == null ? num : objY);
                                sb2.append("\"\n");
                            }
                        } else if (type == Float.TYPE) {
                            Float f10 = (Float) obj;
                            if (f10.floatValue() != -1.0f) {
                                sb2.append(b0.f81731a);
                                sb2.append(name);
                                sb2.append(" = \"");
                                sb2.append(f10);
                                sb2.append("\"\n");
                            }
                        }
                    } catch (IllegalAccessException e10) {
                        Log.e("ConstraintSet", "Error accessing ConstraintSet field", e10);
                    }
                }
            }
        }

        public void c(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.c.f8532db);
            this.f8105b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = f8089t0.get(index);
                switch (i11) {
                    case 1:
                        this.f8137r = g.A0(typedArrayObtainStyledAttributes, index, this.f8137r);
                        break;
                    case 2:
                        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 3:
                        this.f8135q = g.A0(typedArrayObtainStyledAttributes, index, this.f8135q);
                        break;
                    case 4:
                        this.f8133p = g.A0(typedArrayObtainStyledAttributes, index, this.f8133p);
                        break;
                    case 5:
                        this.A = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 7:
                        this.F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                        break;
                    case 8:
                        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 9:
                        this.f8143x = g.A0(typedArrayObtainStyledAttributes, index, this.f8143x);
                        break;
                    case 10:
                        this.f8142w = g.A0(typedArrayObtainStyledAttributes, index, this.f8142w);
                        break;
                    case 11:
                        this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 12:
                        this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 13:
                        this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 14:
                        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 15:
                        this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        break;
                    case 16:
                        this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 17:
                        this.f8113f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8113f);
                        break;
                    case 18:
                        this.f8115g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8115g);
                        break;
                    case 19:
                        this.f8117h = typedArrayObtainStyledAttributes.getFloat(index, this.f8117h);
                        break;
                    case 20:
                        this.f8144y = typedArrayObtainStyledAttributes.getFloat(index, this.f8144y);
                        break;
                    case 21:
                        this.f8111e = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f8111e);
                        break;
                    case 22:
                        this.f8109d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f8109d);
                        break;
                    case 23:
                        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 24:
                        this.f8121j = g.A0(typedArrayObtainStyledAttributes, index, this.f8121j);
                        break;
                    case 25:
                        this.f8123k = g.A0(typedArrayObtainStyledAttributes, index, this.f8123k);
                        break;
                    case 26:
                        this.G = typedArrayObtainStyledAttributes.getInt(index, this.G);
                        break;
                    case 27:
                        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 28:
                        this.f8125l = g.A0(typedArrayObtainStyledAttributes, index, this.f8125l);
                        break;
                    case 29:
                        this.f8127m = g.A0(typedArrayObtainStyledAttributes, index, this.f8127m);
                        break;
                    case 30:
                        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 31:
                        this.f8140u = g.A0(typedArrayObtainStyledAttributes, index, this.f8140u);
                        break;
                    case 32:
                        this.f8141v = g.A0(typedArrayObtainStyledAttributes, index, this.f8141v);
                        break;
                    case 33:
                        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 34:
                        this.f8131o = g.A0(typedArrayObtainStyledAttributes, index, this.f8131o);
                        break;
                    case 35:
                        this.f8129n = g.A0(typedArrayObtainStyledAttributes, index, this.f8129n);
                        break;
                    case 36:
                        this.f8145z = typedArrayObtainStyledAttributes.getFloat(index, this.f8145z);
                        break;
                    case 37:
                        this.W = typedArrayObtainStyledAttributes.getFloat(index, this.W);
                        break;
                    case 38:
                        this.V = typedArrayObtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 39:
                        this.X = typedArrayObtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 40:
                        this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case 41:
                        g.D0(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        g.D0(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                this.B = g.A0(typedArrayObtainStyledAttributes, index, this.B);
                                break;
                            case 62:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            case 63:
                                this.D = typedArrayObtainStyledAttributes.getFloat(index, this.D);
                                break;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.f8114f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f8116g0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f8118h0 = typedArrayObtainStyledAttributes.getInt(index, this.f8118h0);
                                        break;
                                    case 73:
                                        this.f8120i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8120i0);
                                        break;
                                    case 74:
                                        this.f8126l0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f8134p0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f8134p0);
                                        break;
                                    case 76:
                                        this.f8136q0 = typedArrayObtainStyledAttributes.getInt(index, this.f8136q0);
                                        break;
                                    case 77:
                                        this.f8138s = g.A0(typedArrayObtainStyledAttributes, index, this.f8138s);
                                        break;
                                    case 78:
                                        this.f8139t = g.A0(typedArrayObtainStyledAttributes, index, this.f8139t);
                                        break;
                                    case 79:
                                        this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.U);
                                        break;
                                    case 80:
                                        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                                        break;
                                    case 81:
                                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 82:
                                        this.f8104a0 = typedArrayObtainStyledAttributes.getInt(index, this.f8104a0);
                                        break;
                                    case 83:
                                        this.f8108c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8108c0);
                                        break;
                                    case 84:
                                        this.f8106b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8106b0);
                                        break;
                                    case 85:
                                        this.f8112e0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8112e0);
                                        break;
                                    case 86:
                                        this.f8110d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8110d0);
                                        break;
                                    case 87:
                                        this.f8130n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f8130n0);
                                        break;
                                    case 88:
                                        this.f8132o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f8132o0);
                                        break;
                                    case 89:
                                        this.f8128m0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f8119i = typedArrayObtainStyledAttributes.getBoolean(index, this.f8119i);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f8089t0.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f8089t0.get(index));
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c {
        public static final int A = 9;
        public static final int B = 10;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f8146o = -2;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f8147p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f8148q = -3;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static SparseIntArray f8149r = null;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f8150s = 1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f8151t = 2;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f8152u = 3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f8153v = 4;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f8154w = 5;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f8155x = 6;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int f8156y = 7;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int f8157z = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f8158a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8159b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8160c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f8161d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8162e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f8163f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f8164g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f8165h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f8166i = Float.NaN;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f8167j = Float.NaN;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f8168k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f8169l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f8170m = -3;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f8171n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8149r = sparseIntArray;
            sparseIntArray.append(l.c.Nc, 1);
            f8149r.append(l.c.Pc, 2);
            f8149r.append(l.c.Tc, 3);
            f8149r.append(l.c.Mc, 4);
            f8149r.append(l.c.Lc, 5);
            f8149r.append(l.c.Kc, 6);
            f8149r.append(l.c.Oc, 7);
            f8149r.append(l.c.Sc, 8);
            f8149r.append(l.c.Rc, 9);
            f8149r.append(l.c.Qc, 10);
        }

        public void a(c cVar) {
            this.f8158a = cVar.f8158a;
            this.f8159b = cVar.f8159b;
            this.f8161d = cVar.f8161d;
            this.f8162e = cVar.f8162e;
            this.f8163f = cVar.f8163f;
            this.f8166i = cVar.f8166i;
            this.f8164g = cVar.f8164g;
            this.f8165h = cVar.f8165h;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.c.Jc);
            this.f8158a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f8149r.get(index)) {
                    case 1:
                        this.f8166i = typedArrayObtainStyledAttributes.getFloat(index, this.f8166i);
                        break;
                    case 2:
                        this.f8162e = typedArrayObtainStyledAttributes.getInt(index, this.f8162e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f8161d = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f8161d = n0.d.f115555o[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f8163f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f8159b = g.A0(typedArrayObtainStyledAttributes, index, this.f8159b);
                        break;
                    case 6:
                        this.f8160c = typedArrayObtainStyledAttributes.getInteger(index, this.f8160c);
                        break;
                    case 7:
                        this.f8164g = typedArrayObtainStyledAttributes.getFloat(index, this.f8164g);
                        break;
                    case 8:
                        this.f8168k = typedArrayObtainStyledAttributes.getInteger(index, this.f8168k);
                        break;
                    case 9:
                        this.f8167j = typedArrayObtainStyledAttributes.getFloat(index, this.f8167j);
                        break;
                    case 10:
                        int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f8171n = resourceId;
                            if (resourceId != -1) {
                                this.f8170m = -2;
                            }
                        } else if (i11 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f8169l = string;
                            if (string.indexOf(to.c.userBaseDel) > 0) {
                                this.f8171n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f8170m = -2;
                            } else {
                                this.f8170m = -1;
                            }
                        } else {
                            this.f8170m = typedArrayObtainStyledAttributes.getInteger(index, this.f8171n);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f8172a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8173b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8174c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f8175d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f8176e = Float.NaN;

        public void a(d dVar) {
            this.f8172a = dVar.f8172a;
            this.f8173b = dVar.f8173b;
            this.f8175d = dVar.f8175d;
            this.f8176e = dVar.f8176e;
            this.f8174c = dVar.f8174c;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.c.f8772re);
            this.f8172a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == l.c.f8806te) {
                    this.f8175d = typedArrayObtainStyledAttributes.getFloat(index, this.f8175d);
                } else if (index == l.c.f8789se) {
                    this.f8173b = typedArrayObtainStyledAttributes.getInt(index, this.f8173b);
                    this.f8173b = g.V[this.f8173b];
                } else if (index == l.c.f8857we) {
                    this.f8174c = typedArrayObtainStyledAttributes.getInt(index, this.f8174c);
                } else if (index == l.c.f8840ve) {
                    this.f8176e = typedArrayObtainStyledAttributes.getFloat(index, this.f8176e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class e {
        public static final int A = 12;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static SparseIntArray f8177o = null;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f8178p = 1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f8179q = 2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f8180r = 3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f8181s = 4;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f8182t = 5;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f8183u = 6;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f8184v = 7;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f8185w = 8;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f8186x = 9;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int f8187y = 10;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int f8188z = 11;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f8189a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f8190b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f8191c = 0.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f8192d = 0.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f8193e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f8194f = 1.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f8195g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f8196h = Float.NaN;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f8197i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f8198j = 0.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f8199k = 0.0f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f8200l = 0.0f;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f8201m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f8202n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8177o = sparseIntArray;
            sparseIntArray.append(l.c.Ye, 1);
            f8177o.append(l.c.Ze, 2);
            f8177o.append(l.c.f8485af, 3);
            f8177o.append(l.c.We, 4);
            f8177o.append(l.c.Xe, 5);
            f8177o.append(l.c.Se, 6);
            f8177o.append(l.c.Te, 7);
            f8177o.append(l.c.Ue, 8);
            f8177o.append(l.c.Ve, 9);
            f8177o.append(l.c.f8502bf, 10);
            f8177o.append(l.c.f8519cf, 11);
            f8177o.append(l.c.f8536df, 12);
        }

        public void a(e eVar) {
            this.f8189a = eVar.f8189a;
            this.f8190b = eVar.f8190b;
            this.f8191c = eVar.f8191c;
            this.f8192d = eVar.f8192d;
            this.f8193e = eVar.f8193e;
            this.f8194f = eVar.f8194f;
            this.f8195g = eVar.f8195g;
            this.f8196h = eVar.f8196h;
            this.f8197i = eVar.f8197i;
            this.f8198j = eVar.f8198j;
            this.f8199k = eVar.f8199k;
            this.f8200l = eVar.f8200l;
            this.f8201m = eVar.f8201m;
            this.f8202n = eVar.f8202n;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.c.Re);
            this.f8189a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f8177o.get(index)) {
                    case 1:
                        this.f8190b = typedArrayObtainStyledAttributes.getFloat(index, this.f8190b);
                        break;
                    case 2:
                        this.f8191c = typedArrayObtainStyledAttributes.getFloat(index, this.f8191c);
                        break;
                    case 3:
                        this.f8192d = typedArrayObtainStyledAttributes.getFloat(index, this.f8192d);
                        break;
                    case 4:
                        this.f8193e = typedArrayObtainStyledAttributes.getFloat(index, this.f8193e);
                        break;
                    case 5:
                        this.f8194f = typedArrayObtainStyledAttributes.getFloat(index, this.f8194f);
                        break;
                    case 6:
                        this.f8195g = typedArrayObtainStyledAttributes.getDimension(index, this.f8195g);
                        break;
                    case 7:
                        this.f8196h = typedArrayObtainStyledAttributes.getDimension(index, this.f8196h);
                        break;
                    case 8:
                        this.f8198j = typedArrayObtainStyledAttributes.getDimension(index, this.f8198j);
                        break;
                    case 9:
                        this.f8199k = typedArrayObtainStyledAttributes.getDimension(index, this.f8199k);
                        break;
                    case 10:
                        this.f8200l = typedArrayObtainStyledAttributes.getDimension(index, this.f8200l);
                        break;
                    case 11:
                        this.f8201m = true;
                        this.f8202n = typedArrayObtainStyledAttributes.getDimension(index, this.f8202n);
                        break;
                    case 12:
                        this.f8197i = g.A0(typedArrayObtainStyledAttributes, index, this.f8197i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class f {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f8203o = "       ";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Writer f8204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ConstraintLayout f8205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Context f8206c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f8207d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8208e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f8209f = "'left'";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f8210g = "'right'";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f8211h = "'baseline'";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f8212i = "'bottom'";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f8213j = "'top'";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String f8214k = "'start'";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f8215l = "'end'";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public HashMap<Integer, String> f8216m = new HashMap<>();

        public f(Writer writer, ConstraintLayout constraintLayout, int i10) throws IOException {
            this.f8204a = writer;
            this.f8205b = constraintLayout;
            this.f8206c = constraintLayout.getContext();
            this.f8207d = i10;
        }

        public String a(int i10) {
            if (this.f8216m.containsKey(Integer.valueOf(i10))) {
                return "'" + this.f8216m.get(Integer.valueOf(i10)) + "'";
            }
            if (i10 == 0) {
                return "'parent'";
            }
            String strB = b(i10);
            this.f8216m.put(Integer.valueOf(i10), strB);
            return "'" + strB + "'";
        }

        public String b(int i10) {
            try {
                if (i10 != -1) {
                    return this.f8206c.getResources().getResourceEntryName(i10);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unknown");
                int i11 = this.f8208e + 1;
                this.f8208e = i11;
                sb2.append(i11);
                return sb2.toString();
            } catch (Exception unused) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("unknown");
                int i12 = this.f8208e + 1;
                this.f8208e = i12;
                sb3.append(i12);
                return sb3.toString();
            }
        }

        public void c(int i10, float f10, int i11) throws IOException {
            if (i10 == -1) {
                return;
            }
            this.f8204a.write("       circle");
            this.f8204a.write(":[");
            this.f8204a.write(a(i10));
            this.f8204a.write(", " + f10);
            this.f8204a.write(i11 + C4235d4.j.f61462e);
        }

        public void d(String str, int i10, String str2, int i11, int i12) throws IOException {
            if (i10 == -1) {
                return;
            }
            this.f8204a.write(f8203o + str);
            this.f8204a.write(":[");
            this.f8204a.write(a(i10));
            this.f8204a.write(" , ");
            this.f8204a.write(str2);
            if (i11 != 0) {
                this.f8204a.write(" , " + i11);
            }
            this.f8204a.write("],\n");
        }

        public final void e(String str, int i10, int i11, float f10, int i12, int i13, boolean z10) throws IOException {
            if (i10 != 0) {
                if (i10 == -2) {
                    this.f8204a.write(f8203o + str + ": 'wrap'\n");
                    return;
                }
                if (i10 == -1) {
                    this.f8204a.write(f8203o + str + ": 'parent'\n");
                    return;
                }
                this.f8204a.write(f8203o + str + ": " + i10 + ",\n");
                return;
            }
            if (i13 == -1 && i12 == -1) {
                if (i11 == 1) {
                    this.f8204a.write(f8203o + str + ": '???????????',\n");
                    return;
                }
                if (i11 != 2) {
                    return;
                }
                this.f8204a.write(f8203o + str + ": '" + f10 + "%',\n");
                return;
            }
            if (i11 == 0) {
                this.f8204a.write(f8203o + str + ": {'spread' ," + i12 + ", " + i13 + "}\n");
                return;
            }
            if (i11 == 1) {
                this.f8204a.write(f8203o + str + ": {'wrap' ," + i12 + ", " + i13 + "}\n");
                return;
            }
            if (i11 != 2) {
                return;
            }
            this.f8204a.write(f8203o + str + ": {'" + f10 + "'% ," + i12 + ", " + i13 + "}\n");
        }

        public final void f(int i10, int i11, int i12, float f10) throws IOException {
            j("'orientation'", i10);
            j("'guideBegin'", i11);
            j("'guideEnd'", i12);
            h("'guidePercent'", f10);
        }

        public void g() throws IOException {
            this.f8204a.write("\n'ConstraintSet':{\n");
            for (Integer num : g.this.f8043h.keySet()) {
                a aVar = (a) g.this.f8043h.get(num);
                String strA = a(num.intValue());
                this.f8204a.write(strA + ":{\n");
                b bVar = aVar.f8048e;
                e("height", bVar.f8111e, bVar.f8104a0, bVar.f8116g0, bVar.f8112e0, bVar.f8108c0, bVar.f8132o0);
                e("width", bVar.f8109d, bVar.Z, bVar.f8114f0, bVar.f8110d0, bVar.f8106b0, bVar.f8130n0);
                d("'left'", bVar.f8121j, "'left'", bVar.H, bVar.O);
                d("'left'", bVar.f8123k, "'right'", bVar.H, bVar.O);
                d("'right'", bVar.f8125l, "'left'", bVar.I, bVar.Q);
                d("'right'", bVar.f8127m, "'right'", bVar.I, bVar.Q);
                d("'baseline'", bVar.f8137r, "'baseline'", -1, bVar.U);
                d("'baseline'", bVar.f8138s, "'top'", -1, bVar.U);
                d("'baseline'", bVar.f8139t, "'bottom'", -1, bVar.U);
                d("'top'", bVar.f8131o, "'bottom'", bVar.J, bVar.P);
                d("'top'", bVar.f8129n, "'top'", bVar.J, bVar.P);
                d("'bottom'", bVar.f8135q, "'bottom'", bVar.K, bVar.R);
                d("'bottom'", bVar.f8133p, "'top'", bVar.K, bVar.R);
                d("'start'", bVar.f8141v, "'start'", bVar.M, bVar.T);
                d("'start'", bVar.f8140u, "'end'", bVar.M, bVar.T);
                d("'end'", bVar.f8142w, "'start'", bVar.L, bVar.S);
                d("'end'", bVar.f8143x, "'end'", bVar.L, bVar.S);
                i("'horizontalBias'", bVar.f8144y, 0.5f);
                i("'verticalBias'", bVar.f8145z, 0.5f);
                c(bVar.B, bVar.D, bVar.C);
                f(bVar.G, bVar.f8113f, bVar.f8115g, bVar.f8117h);
                k("'dimensionRatio'", bVar.A);
                j("'barrierMargin'", bVar.f8120i0);
                j("'type'", bVar.f8122j0);
                k("'ReferenceId'", bVar.f8126l0);
                m("'mBarrierAllowsGoneWidgets'", bVar.f8134p0, true);
                j("'WrapBehavior'", bVar.f8136q0);
                h("'verticalWeight'", bVar.V);
                h("'horizontalWeight'", bVar.W);
                j("'horizontalChainStyle'", bVar.X);
                j("'verticalChainStyle'", bVar.Y);
                j("'barrierDirection'", bVar.f8118h0);
                int[] iArr = bVar.f8124k0;
                if (iArr != null) {
                    n("'ReferenceIds'", iArr);
                }
                this.f8204a.write("}\n");
            }
            this.f8204a.write("}\n");
        }

        public void h(String str, float f10) throws IOException {
            if (f10 == -1.0f) {
                return;
            }
            this.f8204a.write(f8203o + str);
            this.f8204a.write(": " + f10);
            this.f8204a.write(",\n");
        }

        public void i(String str, float f10, float f11) throws IOException {
            if (f10 == f11) {
                return;
            }
            this.f8204a.write(f8203o + str);
            this.f8204a.write(": " + f10);
            this.f8204a.write(",\n");
        }

        public void j(String str, int i10) throws IOException {
            if (i10 == 0 || i10 == -1) {
                return;
            }
            this.f8204a.write(f8203o + str);
            this.f8204a.write(":");
            this.f8204a.write(", " + i10);
            this.f8204a.write(IOUtils.LINE_SEPARATOR_UNIX);
        }

        public void k(String str, String str2) throws IOException {
            if (str2 == null) {
                return;
            }
            this.f8204a.write(f8203o + str);
            this.f8204a.write(":");
            this.f8204a.write(", " + str2);
            this.f8204a.write(IOUtils.LINE_SEPARATOR_UNIX);
        }

        public void l(String str, boolean z10) throws IOException {
            if (z10) {
                this.f8204a.write(f8203o + str);
                this.f8204a.write(": " + z10);
                this.f8204a.write(",\n");
            }
        }

        public void m(String str, boolean z10, boolean z11) throws IOException {
            if (z10 == z11) {
                return;
            }
            this.f8204a.write(f8203o + str);
            this.f8204a.write(": " + z10);
            this.f8204a.write(",\n");
        }

        public void n(String str, int[] iArr) throws IOException {
            if (iArr == null) {
                return;
            }
            this.f8204a.write(f8203o + str);
            this.f8204a.write(": ");
            int i10 = 0;
            while (i10 < iArr.length) {
                Writer writer = this.f8204a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10 == 0 ? C4235d4.j.f61460d : ", ");
                sb2.append(a(iArr[i10]));
                writer.write(sb2.toString());
                i10++;
            }
            this.f8204a.write("],\n");
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class C0039g {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f8218o = "\n       ";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Writer f8219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ConstraintLayout f8220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Context f8221c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f8222d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8223e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f8224f = "'left'";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f8225g = "'right'";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f8226h = "'baseline'";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f8227i = "'bottom'";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f8228j = "'top'";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String f8229k = "'start'";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f8230l = "'end'";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public HashMap<Integer, String> f8231m = new HashMap<>();

        public C0039g(Writer writer, ConstraintLayout constraintLayout, int i10) throws IOException {
            this.f8219a = writer;
            this.f8220b = constraintLayout;
            this.f8221c = constraintLayout.getContext();
            this.f8222d = i10;
        }

        public String a(int i10) {
            if (this.f8231m.containsKey(Integer.valueOf(i10))) {
                return "@+id/" + this.f8231m.get(Integer.valueOf(i10)) + "";
            }
            if (i10 == 0) {
                return g.W1;
            }
            String strB = b(i10);
            this.f8231m.put(Integer.valueOf(i10), strB);
            return "@+id/" + strB + "";
        }

        public String b(int i10) {
            try {
                if (i10 != -1) {
                    return this.f8221c.getResources().getResourceEntryName(i10);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unknown");
                int i11 = this.f8223e + 1;
                this.f8223e = i11;
                sb2.append(i11);
                return sb2.toString();
            } catch (Exception unused) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("unknown");
                int i12 = this.f8223e + 1;
                this.f8223e = i12;
                sb3.append(i12);
                return sb3.toString();
            }
        }

        public final void c(String str, int i10, int i11) throws IOException {
            if (i10 != i11) {
                if (i10 == -2) {
                    this.f8219a.write(f8218o + str + "=\"wrap_content\"");
                    return;
                }
                if (i10 == -1) {
                    this.f8219a.write(f8218o + str + "=\"match_parent\"");
                    return;
                }
                this.f8219a.write(f8218o + str + "=\"" + i10 + "dp\"");
            }
        }

        public final void d(String str, boolean z10, boolean z11) throws IOException {
            if (z10 != z11) {
                this.f8219a.write(f8218o + str + "=\"" + z10 + "dp\"");
            }
        }

        public void e(int i10, float f10, int i11) throws IOException {
            if (i10 == -1) {
                return;
            }
            this.f8219a.write("circle");
            this.f8219a.write(":[");
            this.f8219a.write(a(i10));
            this.f8219a.write(", " + f10);
            this.f8219a.write(i11 + C4235d4.j.f61462e);
        }

        public void f(String str, int i10, String str2, int i11, int i12) throws IOException {
            if (i10 == -1) {
                return;
            }
            this.f8219a.write(f8218o + str);
            this.f8219a.write(":[");
            this.f8219a.write(a(i10));
            this.f8219a.write(" , ");
            this.f8219a.write(str2);
            if (i11 != 0) {
                this.f8219a.write(" , " + i11);
            }
            this.f8219a.write("],\n");
        }

        public final void g(String str, int i10, int i11) throws IOException {
            if (i10 != i11) {
                this.f8219a.write(f8218o + str + "=\"" + i10 + "dp\"");
            }
        }

        public final void h(String str, int i10, String[] strArr, int i11) throws IOException {
            if (i10 != i11) {
                this.f8219a.write(f8218o + str + "=\"" + strArr[i10] + "\"");
            }
        }

        public void i() throws IOException {
            this.f8219a.write("\n<ConstraintSet>\n");
            for (Integer num : g.this.f8043h.keySet()) {
                a aVar = (a) g.this.f8043h.get(num);
                String strA = a(num.intValue());
                this.f8219a.write("  <Constraint");
                this.f8219a.write("\n       android:id=\"" + strA + "\"");
                b bVar = aVar.f8048e;
                c("android:layout_width", bVar.f8109d, -5);
                c("android:layout_height", bVar.f8111e, -5);
                j("app:layout_constraintGuide_begin", (float) bVar.f8113f, -1.0f);
                j("app:layout_constraintGuide_end", bVar.f8115g, -1.0f);
                j("app:layout_constraintGuide_percent", bVar.f8117h, -1.0f);
                j("app:layout_constraintHorizontal_bias", bVar.f8144y, 0.5f);
                j("app:layout_constraintVertical_bias", bVar.f8145z, 0.5f);
                m("app:layout_constraintDimensionRatio", bVar.A, null);
                o("app:layout_constraintCircle", bVar.B);
                j("app:layout_constraintCircleRadius", bVar.C, 0.0f);
                j("app:layout_constraintCircleAngle", bVar.D, 0.0f);
                j("android:orientation", bVar.G, -1.0f);
                j("app:layout_constraintVertical_weight", bVar.V, -1.0f);
                j("app:layout_constraintHorizontal_weight", bVar.W, -1.0f);
                j("app:layout_constraintHorizontal_chainStyle", bVar.X, 0.0f);
                j("app:layout_constraintVertical_chainStyle", bVar.Y, 0.0f);
                j("app:barrierDirection", bVar.f8118h0, -1.0f);
                j("app:barrierMargin", bVar.f8120i0, 0.0f);
                g("app:layout_marginLeft", bVar.H, 0);
                g("app:layout_goneMarginLeft", bVar.O, Integer.MIN_VALUE);
                g("app:layout_marginRight", bVar.I, 0);
                g("app:layout_goneMarginRight", bVar.Q, Integer.MIN_VALUE);
                g("app:layout_marginStart", bVar.M, 0);
                g("app:layout_goneMarginStart", bVar.T, Integer.MIN_VALUE);
                g("app:layout_marginEnd", bVar.L, 0);
                g("app:layout_goneMarginEnd", bVar.S, Integer.MIN_VALUE);
                g("app:layout_marginTop", bVar.J, 0);
                g("app:layout_goneMarginTop", bVar.P, Integer.MIN_VALUE);
                g("app:layout_marginBottom", bVar.K, 0);
                g("app:layout_goneMarginBottom", bVar.R, Integer.MIN_VALUE);
                g("app:goneBaselineMargin", bVar.U, Integer.MIN_VALUE);
                g("app:baselineMargin", bVar.N, 0);
                d("app:layout_constrainedWidth", bVar.f8130n0, false);
                d("app:layout_constrainedHeight", bVar.f8132o0, false);
                d("app:barrierAllowsGoneWidgets", bVar.f8134p0, true);
                j("app:layout_wrapBehaviorInParent", bVar.f8136q0, 0.0f);
                o("app:baselineToBaseline", bVar.f8137r);
                o("app:baselineToBottom", bVar.f8139t);
                o("app:baselineToTop", bVar.f8138s);
                o("app:layout_constraintBottom_toBottomOf", bVar.f8135q);
                o("app:layout_constraintBottom_toTopOf", bVar.f8133p);
                o("app:layout_constraintEnd_toEndOf", bVar.f8143x);
                o("app:layout_constraintEnd_toStartOf", bVar.f8142w);
                o("app:layout_constraintLeft_toLeftOf", bVar.f8121j);
                o("app:layout_constraintLeft_toRightOf", bVar.f8123k);
                o("app:layout_constraintRight_toLeftOf", bVar.f8125l);
                o("app:layout_constraintRight_toRightOf", bVar.f8127m);
                o("app:layout_constraintStart_toEndOf", bVar.f8140u);
                o("app:layout_constraintStart_toStartOf", bVar.f8141v);
                o("app:layout_constraintTop_toBottomOf", bVar.f8131o);
                o("app:layout_constraintTop_toTopOf", bVar.f8129n);
                String[] strArr = {"spread", "wrap", "percent"};
                h("app:layout_constraintHeight_default", bVar.f8104a0, strArr, 0);
                j("app:layout_constraintHeight_percent", bVar.f8116g0, 1.0f);
                g("app:layout_constraintHeight_min", bVar.f8112e0, 0);
                g("app:layout_constraintHeight_max", bVar.f8108c0, 0);
                d("android:layout_constrainedHeight", bVar.f8132o0, false);
                h("app:layout_constraintWidth_default", bVar.Z, strArr, 0);
                j("app:layout_constraintWidth_percent", bVar.f8114f0, 1.0f);
                g("app:layout_constraintWidth_min", bVar.f8110d0, 0);
                g("app:layout_constraintWidth_max", bVar.f8106b0, 0);
                d("android:layout_constrainedWidth", bVar.f8130n0, false);
                j("app:layout_constraintVertical_weight", bVar.V, -1.0f);
                j("app:layout_constraintHorizontal_weight", bVar.W, -1.0f);
                k("app:layout_constraintHorizontal_chainStyle", bVar.X);
                k("app:layout_constraintVertical_chainStyle", bVar.Y);
                h("app:barrierDirection", bVar.f8118h0, new String[]{"left", "right", "top", "bottom", "start", "end"}, -1);
                m("app:layout_constraintTag", bVar.f8128m0, null);
                int[] iArr = bVar.f8124k0;
                if (iArr != null) {
                    n("'ReferenceIds'", iArr);
                }
                this.f8219a.write(" />\n");
            }
            this.f8219a.write("</ConstraintSet>\n");
        }

        public void j(String str, float f10, float f11) throws IOException {
            if (f10 == f11) {
                return;
            }
            this.f8219a.write(f8218o + str);
            this.f8219a.write("=\"" + f10 + "\"");
        }

        public void k(String str, int i10) throws IOException {
            if (i10 == 0 || i10 == -1) {
                return;
            }
            this.f8219a.write(f8218o + str + "=\"" + i10 + "\"\n");
        }

        public void l(String str, String str2) throws IOException {
            if (str2 == null) {
                return;
            }
            this.f8219a.write(str);
            this.f8219a.write(":");
            this.f8219a.write(", " + str2);
            this.f8219a.write(IOUtils.LINE_SEPARATOR_UNIX);
        }

        public void m(String str, String str2, String str3) throws IOException {
            if (str2 == null || str2.equals(str3)) {
                return;
            }
            this.f8219a.write(f8218o + str);
            this.f8219a.write("=\"" + str2 + "\"");
        }

        public void n(String str, int[] iArr) throws IOException {
            if (iArr == null) {
                return;
            }
            this.f8219a.write(f8218o + str);
            this.f8219a.write(":");
            int i10 = 0;
            while (i10 < iArr.length) {
                Writer writer = this.f8219a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10 == 0 ? C4235d4.j.f61460d : ", ");
                sb2.append(a(iArr[i10]));
                writer.write(sb2.toString());
                i10++;
            }
            this.f8219a.write("],\n");
        }

        public void o(String str, int i10) throws IOException {
            if (i10 == -1) {
                return;
            }
            this.f8219a.write(f8218o + str);
            this.f8219a.write("=\"" + a(i10) + "\"");
        }
    }

    static {
        X.append(l.c.R0, 25);
        X.append(l.c.S0, 26);
        X.append(l.c.U0, 29);
        X.append(l.c.V0, 30);
        X.append(l.c.f8488b1, 36);
        X.append(l.c.f8471a1, 35);
        X.append(l.c.f8877y0, 4);
        X.append(l.c.f8860x0, 3);
        X.append(l.c.f8792t0, 1);
        X.append(l.c.f8826v0, 91);
        X.append(l.c.f8809u0, 92);
        X.append(l.c.f8640k1, 6);
        X.append(l.c.f8657l1, 7);
        X.append(l.c.F0, 17);
        X.append(l.c.G0, 18);
        X.append(l.c.H0, 19);
        X.append(l.c.f8724p0, 99);
        X.append(l.c.f8689n, 27);
        X.append(l.c.W0, 32);
        X.append(l.c.X0, 33);
        X.append(l.c.E0, 10);
        X.append(l.c.D0, 9);
        X.append(l.c.f8725p1, 13);
        X.append(l.c.f8776s1, 16);
        X.append(l.c.f8742q1, 14);
        X.append(l.c.f8691n1, 11);
        X.append(l.c.f8759r1, 15);
        X.append(l.c.f8708o1, 12);
        X.append(l.c.f8539e1, 40);
        X.append(l.c.P0, 39);
        X.append(l.c.O0, 41);
        X.append(l.c.f8522d1, 42);
        X.append(l.c.N0, 20);
        X.append(l.c.f8505c1, 37);
        X.append(l.c.C0, 5);
        X.append(l.c.Q0, 87);
        X.append(l.c.Z0, 87);
        X.append(l.c.T0, 87);
        X.append(l.c.f8843w0, 87);
        X.append(l.c.f8775s0, 87);
        X.append(l.c.f8774s, 24);
        X.append(l.c.f8808u, 28);
        X.append(l.c.K, 31);
        X.append(l.c.L, 8);
        X.append(l.c.f8791t, 34);
        X.append(l.c.f8825v, 2);
        X.append(l.c.f8740q, 23);
        X.append(l.c.f8757r, 21);
        X.append(l.c.f8556f1, 95);
        X.append(l.c.I0, 96);
        X.append(l.c.f8723p, 22);
        X.append(l.c.A, 43);
        X.append(l.c.N, 44);
        X.append(l.c.I, 45);
        X.append(l.c.J, 46);
        X.append(l.c.H, 60);
        X.append(l.c.F, 47);
        X.append(l.c.G, 48);
        X.append(l.c.B, 49);
        X.append(l.c.C, 50);
        X.append(l.c.D, 51);
        X.append(l.c.E, 52);
        X.append(l.c.M, 53);
        X.append(l.c.f8573g1, 54);
        X.append(l.c.J0, 55);
        X.append(l.c.f8590h1, 56);
        X.append(l.c.K0, 57);
        X.append(l.c.f8607i1, 58);
        X.append(l.c.L0, 59);
        X.append(l.c.f8894z0, 61);
        X.append(l.c.B0, 62);
        X.append(l.c.A0, 63);
        X.append(l.c.P, 64);
        X.append(l.c.E1, 65);
        X.append(l.c.W, 66);
        X.append(l.c.F1, 67);
        X.append(l.c.f8844w1, 79);
        X.append(l.c.f8706o, 38);
        X.append(l.c.f8827v1, 68);
        X.append(l.c.f8623j1, 69);
        X.append(l.c.M0, 70);
        X.append(l.c.f8810u1, 97);
        X.append(l.c.T, 71);
        X.append(l.c.R, 72);
        X.append(l.c.S, 73);
        X.append(l.c.U, 74);
        X.append(l.c.Q, 75);
        X.append(l.c.f8861x1, 76);
        X.append(l.c.Y0, 77);
        X.append(l.c.G1, 78);
        X.append(l.c.f8758r0, 80);
        X.append(l.c.f8741q0, 81);
        X.append(l.c.f8895z1, 82);
        X.append(l.c.D1, 83);
        X.append(l.c.C1, 84);
        X.append(l.c.B1, 85);
        X.append(l.c.A1, 86);
        Y.append(l.c.J5, 6);
        Y.append(l.c.J5, 7);
        Y.append(l.c.f8508c4, 27);
        Y.append(l.c.N5, 13);
        Y.append(l.c.Q5, 16);
        Y.append(l.c.O5, 14);
        Y.append(l.c.L5, 11);
        Y.append(l.c.P5, 15);
        Y.append(l.c.M5, 12);
        Y.append(l.c.C5, 40);
        Y.append(l.c.f8831v5, 39);
        Y.append(l.c.f8814u5, 41);
        Y.append(l.c.B5, 42);
        Y.append(l.c.f8797t5, 20);
        Y.append(l.c.A5, 37);
        Y.append(l.c.f8644k5, 5);
        Y.append(l.c.f8848w5, 87);
        Y.append(l.c.f8899z5, 87);
        Y.append(l.c.f8865x5, 87);
        Y.append(l.c.f8594h5, 87);
        Y.append(l.c.f8577g5, 87);
        Y.append(l.c.f8593h4, 24);
        Y.append(l.c.f8626j4, 28);
        Y.append(l.c.f8898z4, 31);
        Y.append(l.c.A4, 8);
        Y.append(l.c.f8610i4, 34);
        Y.append(l.c.f8643k4, 2);
        Y.append(l.c.f8559f4, 23);
        Y.append(l.c.f8576g4, 21);
        Y.append(l.c.D5, 95);
        Y.append(l.c.f8712o5, 96);
        Y.append(l.c.f8542e4, 22);
        Y.append(l.c.f8728p4, 43);
        Y.append(l.c.C4, 44);
        Y.append(l.c.f8864x4, 45);
        Y.append(l.c.f8881y4, 46);
        Y.append(l.c.f8847w4, 60);
        Y.append(l.c.f8813u4, 47);
        Y.append(l.c.f8830v4, 48);
        Y.append(l.c.f8745q4, 49);
        Y.append(l.c.f8762r4, 50);
        Y.append(l.c.f8779s4, 51);
        Y.append(l.c.f8796t4, 52);
        Y.append(l.c.B4, 53);
        Y.append(l.c.E5, 54);
        Y.append(l.c.f8729p5, 55);
        Y.append(l.c.F5, 56);
        Y.append(l.c.f8746q5, 57);
        Y.append(l.c.G5, 58);
        Y.append(l.c.f8763r5, 59);
        Y.append(l.c.f8627j5, 62);
        Y.append(l.c.f8611i5, 63);
        Y.append(l.c.E4, 64);
        Y.append(l.c.f8527d6, 65);
        Y.append(l.c.K4, 66);
        Y.append(l.c.f8544e6, 67);
        Y.append(l.c.U5, 79);
        Y.append(l.c.f8525d4, 38);
        Y.append(l.c.V5, 98);
        Y.append(l.c.T5, 68);
        Y.append(l.c.H5, 69);
        Y.append(l.c.f8780s5, 70);
        Y.append(l.c.I4, 71);
        Y.append(l.c.G4, 72);
        Y.append(l.c.H4, 73);
        Y.append(l.c.J4, 74);
        Y.append(l.c.F4, 75);
        Y.append(l.c.W5, 76);
        Y.append(l.c.f8882y5, 77);
        Y.append(l.c.f8561f6, 78);
        Y.append(l.c.f8560f5, 80);
        Y.append(l.c.f8543e5, 81);
        Y.append(l.c.Y5, 82);
        Y.append(l.c.f8510c6, 83);
        Y.append(l.c.f8493b6, 84);
        Y.append(l.c.f8476a6, 85);
        Y.append(l.c.Z5, 86);
        Y.append(l.c.S5, 97);
    }

    public static int A0(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:23:0x0038  */
    /* JADX WARN: Code duplicated, block: B:25:0x003d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0042  */
    /* JADX WARN: Code duplicated, block: B:29:0x0046  */
    /* JADX WARN: Code duplicated, block: B:31:0x004a  */
    /* JADX WARN: Code duplicated, block: B:33:0x004f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0054  */
    /* JADX WARN: Code duplicated, block: B:37:0x0058  */
    /* JADX WARN: Code duplicated, block: B:39:0x005c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0067  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    public static void D0(Object obj, TypedArray typedArray, int i10, int i11) {
        int dimensionPixelSize;
        boolean z10;
        a.C0038a c0038a;
        b bVar;
        ConstraintLayout.b bVar2;
        if (obj == null) {
            return;
        }
        int i12 = typedArray.peekValue(i10).type;
        if (i12 == 3) {
            E0(obj, typedArray.getString(i10), i11);
            return;
        }
        int i13 = 0;
        if (i12 != 5) {
            dimensionPixelSize = typedArray.getInt(i10, 0);
            if (dimensionPixelSize == -4) {
                z10 = true;
                i13 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z10 = false;
            }
            if (obj instanceof ConstraintLayout.b) {
                bVar2 = (ConstraintLayout.b) obj;
                if (i11 == 0) {
                    ((ViewGroup.MarginLayoutParams) bVar2).width = i13;
                    bVar2.f7787a0 = z10;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) bVar2).height = i13;
                    bVar2.f7789b0 = z10;
                    return;
                }
            }
            if (obj instanceof b) {
                bVar = (b) obj;
                if (i11 == 0) {
                    bVar.f8109d = i13;
                    bVar.f8130n0 = z10;
                    return;
                } else {
                    bVar.f8111e = i13;
                    bVar.f8132o0 = z10;
                    return;
                }
            }
            if (obj instanceof a.C0038a) {
                c0038a = (a.C0038a) obj;
                if (i11 == 0) {
                    c0038a.b(23, i13);
                    c0038a.d(80, z10);
                } else {
                    c0038a.b(21, i13);
                    c0038a.d(81, z10);
                }
            }
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i10, 0);
        i13 = dimensionPixelSize;
        z10 = false;
        if (obj instanceof ConstraintLayout.b) {
            bVar2 = (ConstraintLayout.b) obj;
            if (i11 == 0) {
                ((ViewGroup.MarginLayoutParams) bVar2).width = i13;
                bVar2.f7787a0 = z10;
                return;
            } else {
                ((ViewGroup.MarginLayoutParams) bVar2).height = i13;
                bVar2.f7789b0 = z10;
                return;
            }
        }
        if (obj instanceof b) {
            bVar = (b) obj;
            if (i11 == 0) {
                bVar.f8109d = i13;
                bVar.f8130n0 = z10;
                return;
            } else {
                bVar.f8111e = i13;
                bVar.f8132o0 = z10;
                return;
            }
        }
        if (obj instanceof a.C0038a) {
            c0038a = (a.C0038a) obj;
            if (i11 == 0) {
                c0038a.b(23, i13);
                c0038a.d(80, z10);
            } else {
                c0038a.b(21, i13);
                c0038a.d(81, z10);
            }
        }
    }

    public static void E0(Object obj, String str, int i10) {
        if (str == null) {
            return;
        }
        int iIndexOf = str.indexOf(61);
        int length = str.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if (V1.equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i10 == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                    F0(bVar, strTrim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).A = strTrim2;
                    return;
                } else {
                    if (obj instanceof a.C0038a) {
                        ((a.C0038a) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f10 = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                            bVar2.L = f10;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                            bVar2.M = f10;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i10 == 0) {
                            bVar3.f8109d = 0;
                            bVar3.W = f10;
                            return;
                        } else {
                            bVar3.f8111e = 0;
                            bVar3.V = f10;
                            return;
                        }
                    }
                    if (obj instanceof a.C0038a) {
                        a.C0038a c0038a = (a.C0038a) obj;
                        if (i10 == 0) {
                            c0038a.b(23, 0);
                            c0038a.a(39, f10);
                            return;
                        } else {
                            c0038a.b(21, 0);
                            c0038a.a(40, f10);
                            return;
                        }
                    }
                    return;
                }
                if (W1.equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.V = fMax;
                            bVar4.P = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.W = fMax;
                            bVar4.Q = 2;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar5 = (b) obj;
                        if (i10 == 0) {
                            bVar5.f8109d = 0;
                            bVar5.f8114f0 = fMax;
                            bVar5.Z = 2;
                            return;
                        } else {
                            bVar5.f8111e = 0;
                            bVar5.f8116g0 = fMax;
                            bVar5.f8104a0 = 2;
                            return;
                        }
                    }
                    if (obj instanceof a.C0038a) {
                        a.C0038a c0038a2 = (a.C0038a) obj;
                        if (i10 == 0) {
                            c0038a2.b(23, 0);
                            c0038a2.b(54, 2);
                        } else {
                            c0038a2.b(21, 0);
                            c0038a2.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void F0(ConstraintLayout.b bVar, String str) {
        float fAbs = Float.NaN;
        int i10 = -1;
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i11 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase(l3.a.T4)) {
                    i10 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i10 = 1;
                }
                i11 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i11);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i11, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f10 = Float.parseFloat(strSubstring3);
                        float f11 = Float.parseFloat(strSubstring4);
                        if (f10 > 0.0f && f11 > 0.0f) {
                            fAbs = i10 == 1 ? Math.abs(f11 / f10) : Math.abs(f10 / f11);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.I = str;
        bVar.J = fAbs;
        bVar.K = i10;
    }

    public static void K0(a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0038a c0038a = new a.C0038a();
        aVar.f8051h = c0038a;
        aVar.f8047d.f8158a = false;
        aVar.f8048e.f8105b = false;
        aVar.f8046c.f8172a = false;
        aVar.f8049f.f8189a = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            switch (Y.get(index)) {
                case 2:
                    c0038a.b(2, typedArray.getDimensionPixelSize(index, aVar.f8048e.K));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + X.get(index));
                    break;
                case 5:
                    c0038a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    c0038a.b(6, typedArray.getDimensionPixelOffset(index, aVar.f8048e.E));
                    break;
                case 7:
                    c0038a.b(7, typedArray.getDimensionPixelOffset(index, aVar.f8048e.F));
                    break;
                case 8:
                    c0038a.b(8, typedArray.getDimensionPixelSize(index, aVar.f8048e.L));
                    break;
                case 11:
                    c0038a.b(11, typedArray.getDimensionPixelSize(index, aVar.f8048e.R));
                    break;
                case 12:
                    c0038a.b(12, typedArray.getDimensionPixelSize(index, aVar.f8048e.S));
                    break;
                case 13:
                    c0038a.b(13, typedArray.getDimensionPixelSize(index, aVar.f8048e.O));
                    break;
                case 14:
                    c0038a.b(14, typedArray.getDimensionPixelSize(index, aVar.f8048e.Q));
                    break;
                case 15:
                    c0038a.b(15, typedArray.getDimensionPixelSize(index, aVar.f8048e.T));
                    break;
                case 16:
                    c0038a.b(16, typedArray.getDimensionPixelSize(index, aVar.f8048e.P));
                    break;
                case 17:
                    c0038a.b(17, typedArray.getDimensionPixelOffset(index, aVar.f8048e.f8113f));
                    break;
                case 18:
                    c0038a.b(18, typedArray.getDimensionPixelOffset(index, aVar.f8048e.f8115g));
                    break;
                case 19:
                    c0038a.a(19, typedArray.getFloat(index, aVar.f8048e.f8117h));
                    break;
                case 20:
                    c0038a.a(20, typedArray.getFloat(index, aVar.f8048e.f8144y));
                    break;
                case 21:
                    c0038a.b(21, typedArray.getLayoutDimension(index, aVar.f8048e.f8111e));
                    break;
                case 22:
                    c0038a.b(22, V[typedArray.getInt(index, aVar.f8046c.f8173b)]);
                    break;
                case 23:
                    c0038a.b(23, typedArray.getLayoutDimension(index, aVar.f8048e.f8109d));
                    break;
                case 24:
                    c0038a.b(24, typedArray.getDimensionPixelSize(index, aVar.f8048e.H));
                    break;
                case 27:
                    c0038a.b(27, typedArray.getInt(index, aVar.f8048e.G));
                    break;
                case 28:
                    c0038a.b(28, typedArray.getDimensionPixelSize(index, aVar.f8048e.I));
                    break;
                case 31:
                    c0038a.b(31, typedArray.getDimensionPixelSize(index, aVar.f8048e.M));
                    break;
                case 34:
                    c0038a.b(34, typedArray.getDimensionPixelSize(index, aVar.f8048e.J));
                    break;
                case 37:
                    c0038a.a(37, typedArray.getFloat(index, aVar.f8048e.f8145z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f8044a);
                    aVar.f8044a = resourceId;
                    c0038a.b(38, resourceId);
                    break;
                case 39:
                    c0038a.a(39, typedArray.getFloat(index, aVar.f8048e.W));
                    break;
                case 40:
                    c0038a.a(40, typedArray.getFloat(index, aVar.f8048e.V));
                    break;
                case 41:
                    c0038a.b(41, typedArray.getInt(index, aVar.f8048e.X));
                    break;
                case 42:
                    c0038a.b(42, typedArray.getInt(index, aVar.f8048e.Y));
                    break;
                case 43:
                    c0038a.a(43, typedArray.getFloat(index, aVar.f8046c.f8175d));
                    break;
                case 44:
                    c0038a.d(44, true);
                    c0038a.a(44, typedArray.getDimension(index, aVar.f8049f.f8202n));
                    break;
                case 45:
                    c0038a.a(45, typedArray.getFloat(index, aVar.f8049f.f8191c));
                    break;
                case 46:
                    c0038a.a(46, typedArray.getFloat(index, aVar.f8049f.f8192d));
                    break;
                case 47:
                    c0038a.a(47, typedArray.getFloat(index, aVar.f8049f.f8193e));
                    break;
                case 48:
                    c0038a.a(48, typedArray.getFloat(index, aVar.f8049f.f8194f));
                    break;
                case 49:
                    c0038a.a(49, typedArray.getDimension(index, aVar.f8049f.f8195g));
                    break;
                case 50:
                    c0038a.a(50, typedArray.getDimension(index, aVar.f8049f.f8196h));
                    break;
                case 51:
                    c0038a.a(51, typedArray.getDimension(index, aVar.f8049f.f8198j));
                    break;
                case 52:
                    c0038a.a(52, typedArray.getDimension(index, aVar.f8049f.f8199k));
                    break;
                case 53:
                    c0038a.a(53, typedArray.getDimension(index, aVar.f8049f.f8200l));
                    break;
                case 54:
                    c0038a.b(54, typedArray.getInt(index, aVar.f8048e.Z));
                    break;
                case 55:
                    c0038a.b(55, typedArray.getInt(index, aVar.f8048e.f8104a0));
                    break;
                case 56:
                    c0038a.b(56, typedArray.getDimensionPixelSize(index, aVar.f8048e.f8106b0));
                    break;
                case 57:
                    c0038a.b(57, typedArray.getDimensionPixelSize(index, aVar.f8048e.f8108c0));
                    break;
                case 58:
                    c0038a.b(58, typedArray.getDimensionPixelSize(index, aVar.f8048e.f8110d0));
                    break;
                case 59:
                    c0038a.b(59, typedArray.getDimensionPixelSize(index, aVar.f8048e.f8112e0));
                    break;
                case 60:
                    c0038a.a(60, typedArray.getFloat(index, aVar.f8049f.f8190b));
                    break;
                case 62:
                    c0038a.b(62, typedArray.getDimensionPixelSize(index, aVar.f8048e.C));
                    break;
                case 63:
                    c0038a.a(63, typedArray.getFloat(index, aVar.f8048e.D));
                    break;
                case 64:
                    c0038a.b(64, A0(typedArray, index, aVar.f8047d.f8159b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0038a.c(65, typedArray.getString(index));
                    } else {
                        c0038a.c(65, n0.d.f115555o[typedArray.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    c0038a.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0038a.a(67, typedArray.getFloat(index, aVar.f8047d.f8166i));
                    break;
                case 68:
                    c0038a.a(68, typedArray.getFloat(index, aVar.f8046c.f8176e));
                    break;
                case 69:
                    c0038a.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0038a.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0038a.b(72, typedArray.getInt(index, aVar.f8048e.f8118h0));
                    break;
                case 73:
                    c0038a.b(73, typedArray.getDimensionPixelSize(index, aVar.f8048e.f8120i0));
                    break;
                case 74:
                    c0038a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0038a.d(75, typedArray.getBoolean(index, aVar.f8048e.f8134p0));
                    break;
                case 76:
                    c0038a.b(76, typedArray.getInt(index, aVar.f8047d.f8162e));
                    break;
                case 77:
                    c0038a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0038a.b(78, typedArray.getInt(index, aVar.f8046c.f8174c));
                    break;
                case 79:
                    c0038a.a(79, typedArray.getFloat(index, aVar.f8047d.f8164g));
                    break;
                case 80:
                    c0038a.d(80, typedArray.getBoolean(index, aVar.f8048e.f8130n0));
                    break;
                case 81:
                    c0038a.d(81, typedArray.getBoolean(index, aVar.f8048e.f8132o0));
                    break;
                case 82:
                    c0038a.b(82, typedArray.getInteger(index, aVar.f8047d.f8160c));
                    break;
                case 83:
                    c0038a.b(83, A0(typedArray, index, aVar.f8049f.f8197i));
                    break;
                case 84:
                    c0038a.b(84, typedArray.getInteger(index, aVar.f8047d.f8168k));
                    break;
                case 85:
                    c0038a.a(85, typedArray.getFloat(index, aVar.f8047d.f8167j));
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f8047d.f8171n = typedArray.getResourceId(index, -1);
                        c0038a.b(89, aVar.f8047d.f8171n);
                        c cVar = aVar.f8047d;
                        if (cVar.f8171n != -1) {
                            cVar.f8170m = -2;
                            c0038a.b(88, -2);
                        }
                    } else if (i11 == 3) {
                        aVar.f8047d.f8169l = typedArray.getString(index);
                        c0038a.c(90, aVar.f8047d.f8169l);
                        if (aVar.f8047d.f8169l.indexOf(to.c.userBaseDel) > 0) {
                            aVar.f8047d.f8171n = typedArray.getResourceId(index, -1);
                            c0038a.b(89, aVar.f8047d.f8171n);
                            aVar.f8047d.f8170m = -2;
                            c0038a.b(88, -2);
                        } else {
                            aVar.f8047d.f8170m = -1;
                            c0038a.b(88, -1);
                        }
                    } else {
                        c cVar2 = aVar.f8047d;
                        cVar2.f8170m = typedArray.getInteger(index, cVar2.f8171n);
                        c0038a.b(88, aVar.f8047d.f8170m);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + X.get(index));
                    break;
                case N1 /* 93 */:
                    c0038a.b(93, typedArray.getDimensionPixelSize(index, aVar.f8048e.N));
                    break;
                case 94:
                    c0038a.b(94, typedArray.getDimensionPixelSize(index, aVar.f8048e.U));
                    break;
                case P1 /* 95 */:
                    D0(c0038a, typedArray, index, 0);
                    break;
                case 96:
                    D0(c0038a, typedArray, index, 1);
                    break;
                case R1 /* 97 */:
                    c0038a.b(97, typedArray.getInt(index, aVar.f8048e.f8136q0));
                    break;
                case S1 /* 98 */:
                    if (MotionLayout.f7534f1) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f8044a);
                        aVar.f8044a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.f8045b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f8045b = typedArray.getString(index);
                    } else {
                        aVar.f8044a = typedArray.getResourceId(index, aVar.f8044a);
                    }
                    break;
                case 99:
                    c0038a.d(99, typedArray.getBoolean(index, aVar.f8048e.f8119i));
                    break;
            }
        }
    }

    public static String[] L1(String str) {
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        boolean z10 = false;
        for (int i11 = 0; i11 < charArray.length; i11++) {
            char c10 = charArray[i11];
            if (c10 == ',' && !z10) {
                arrayList.add(new String(charArray, i10, i11 - i10));
                i10 = i11 + 1;
            } else if (c10 == '\"') {
                z10 = !z10;
            }
        }
        arrayList.add(new String(charArray, i10, charArray.length - i10));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static void U0(a aVar, int i10, float f10) {
        if (i10 == 19) {
            aVar.f8048e.f8117h = f10;
            return;
        }
        if (i10 == 20) {
            aVar.f8048e.f8144y = f10;
            return;
        }
        if (i10 == 37) {
            aVar.f8048e.f8145z = f10;
            return;
        }
        if (i10 == 60) {
            aVar.f8049f.f8190b = f10;
            return;
        }
        if (i10 == 63) {
            aVar.f8048e.D = f10;
            return;
        }
        if (i10 == 79) {
            aVar.f8047d.f8164g = f10;
            return;
        }
        if (i10 == 85) {
            aVar.f8047d.f8167j = f10;
            return;
        }
        if (i10 != 87) {
            if (i10 == 39) {
                aVar.f8048e.W = f10;
                return;
            }
            if (i10 == 40) {
                aVar.f8048e.V = f10;
                return;
            }
            switch (i10) {
                case 43:
                    aVar.f8046c.f8175d = f10;
                    break;
                case 44:
                    e eVar = aVar.f8049f;
                    eVar.f8202n = f10;
                    eVar.f8201m = true;
                    break;
                case 45:
                    aVar.f8049f.f8191c = f10;
                    break;
                case 46:
                    aVar.f8049f.f8192d = f10;
                    break;
                case 47:
                    aVar.f8049f.f8193e = f10;
                    break;
                case 48:
                    aVar.f8049f.f8194f = f10;
                    break;
                case 49:
                    aVar.f8049f.f8195g = f10;
                    break;
                case 50:
                    aVar.f8049f.f8196h = f10;
                    break;
                case 51:
                    aVar.f8049f.f8198j = f10;
                    break;
                case 52:
                    aVar.f8049f.f8199k = f10;
                    break;
                case 53:
                    aVar.f8049f.f8200l = f10;
                    break;
                default:
                    switch (i10) {
                        case 67:
                            aVar.f8047d.f8166i = f10;
                            break;
                        case 68:
                            aVar.f8046c.f8176e = f10;
                            break;
                        case 69:
                            aVar.f8048e.f8114f0 = f10;
                            break;
                        case 70:
                            aVar.f8048e.f8116g0 = f10;
                            break;
                        default:
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                            break;
                    }
                    break;
            }
        }
    }

    public static void V0(a aVar, int i10, int i11) {
        if (i10 == 6) {
            aVar.f8048e.E = i11;
            return;
        }
        if (i10 == 7) {
            aVar.f8048e.F = i11;
            return;
        }
        if (i10 == 8) {
            aVar.f8048e.L = i11;
            return;
        }
        if (i10 == 27) {
            aVar.f8048e.G = i11;
            return;
        }
        if (i10 == 28) {
            aVar.f8048e.I = i11;
            return;
        }
        if (i10 == 41) {
            aVar.f8048e.X = i11;
            return;
        }
        if (i10 == 42) {
            aVar.f8048e.Y = i11;
            return;
        }
        if (i10 == 61) {
            aVar.f8048e.B = i11;
            return;
        }
        if (i10 == 62) {
            aVar.f8048e.C = i11;
            return;
        }
        if (i10 == 72) {
            aVar.f8048e.f8118h0 = i11;
            return;
        }
        if (i10 == 73) {
            aVar.f8048e.f8120i0 = i11;
            return;
        }
        switch (i10) {
            case 2:
                aVar.f8048e.K = i11;
                break;
            case 11:
                aVar.f8048e.R = i11;
                break;
            case 12:
                aVar.f8048e.S = i11;
                break;
            case 13:
                aVar.f8048e.O = i11;
                break;
            case 14:
                aVar.f8048e.Q = i11;
                break;
            case 15:
                aVar.f8048e.T = i11;
                break;
            case 16:
                aVar.f8048e.P = i11;
                break;
            case 17:
                aVar.f8048e.f8113f = i11;
                break;
            case 18:
                aVar.f8048e.f8115g = i11;
                break;
            case 31:
                aVar.f8048e.M = i11;
                break;
            case 34:
                aVar.f8048e.J = i11;
                break;
            case 38:
                aVar.f8044a = i11;
                break;
            case 64:
                aVar.f8047d.f8159b = i11;
                break;
            case 66:
                aVar.f8047d.f8163f = i11;
                break;
            case 76:
                aVar.f8047d.f8162e = i11;
                break;
            case 78:
                aVar.f8046c.f8174c = i11;
                break;
            case N1 /* 93 */:
                aVar.f8048e.N = i11;
                break;
            case 94:
                aVar.f8048e.U = i11;
                break;
            case R1 /* 97 */:
                aVar.f8048e.f8136q0 = i11;
                break;
            default:
                switch (i10) {
                    case 21:
                        aVar.f8048e.f8111e = i11;
                        break;
                    case 22:
                        aVar.f8046c.f8173b = i11;
                        break;
                    case 23:
                        aVar.f8048e.f8109d = i11;
                        break;
                    case 24:
                        aVar.f8048e.H = i11;
                        break;
                    default:
                        switch (i10) {
                            case 54:
                                aVar.f8048e.Z = i11;
                                break;
                            case 55:
                                aVar.f8048e.f8104a0 = i11;
                                break;
                            case 56:
                                aVar.f8048e.f8106b0 = i11;
                                break;
                            case 57:
                                aVar.f8048e.f8108c0 = i11;
                                break;
                            case 58:
                                aVar.f8048e.f8110d0 = i11;
                                break;
                            case 59:
                                aVar.f8048e.f8112e0 = i11;
                                break;
                            default:
                                switch (i10) {
                                    case 82:
                                        aVar.f8047d.f8160c = i11;
                                        break;
                                    case 83:
                                        aVar.f8049f.f8197i = i11;
                                        break;
                                    case 84:
                                        aVar.f8047d.f8168k = i11;
                                        break;
                                    default:
                                        switch (i10) {
                                            case 87:
                                                break;
                                            case 88:
                                                aVar.f8047d.f8170m = i11;
                                                break;
                                            case 89:
                                                aVar.f8047d.f8171n = i11;
                                                break;
                                            default:
                                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }

    public static void W0(a aVar, int i10, String str) {
        if (i10 == 5) {
            aVar.f8048e.A = str;
            return;
        }
        if (i10 == 65) {
            aVar.f8047d.f8161d = str;
            return;
        }
        if (i10 == 74) {
            b bVar = aVar.f8048e;
            bVar.f8126l0 = str;
            bVar.f8124k0 = null;
        } else if (i10 == 77) {
            aVar.f8048e.f8128m0 = str;
        } else if (i10 != 87) {
            if (i10 != 90) {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            } else {
                aVar.f8047d.f8169l = str;
            }
        }
    }

    public static void X0(a aVar, int i10, boolean z10) {
        if (i10 == 44) {
            aVar.f8049f.f8201m = z10;
            return;
        }
        if (i10 == 75) {
            aVar.f8048e.f8134p0 = z10;
            return;
        }
        if (i10 != 87) {
            if (i10 == 80) {
                aVar.f8048e.f8130n0 = z10;
            } else if (i10 != 81) {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            } else {
                aVar.f8048e.f8132o0 = z10;
            }
        }
    }

    public static String m0(int i10) {
        for (Field field : g.class.getDeclaredFields()) {
            if (field.getName().contains(lk.e.f104695m) && field.getType() == Integer.TYPE && Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())) {
                try {
                    if (field.getInt(null) == i10) {
                        return field.getName();
                    }
                    continue;
                } catch (IllegalAccessException e10) {
                    Log.e("ConstraintSet", "Error accessing ConstraintSet field", e10);
                }
            }
        }
        return "UNKNOWN";
    }

    public static String p0(Context context, int i10, XmlPullParser xmlPullParser) {
        return ".(" + w0.c.i(context, i10) + ".xml:" + xmlPullParser.getLineNumber() + ") \"" + xmlPullParser.getName() + "\"";
    }

    public static a w(Context context, XmlPullParser xmlPullParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, l.c.f8491b4);
        K0(aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public void A(int i10, int i11) {
        if (i11 == 0) {
            x(i10, 0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            x(i10, i11, 7, 0, i11, 6, 0, 0.5f);
        }
    }

    public void A1(int i10, float f10, float f11) {
        e eVar = i0(i10).f8049f;
        eVar.f8198j = f10;
        eVar.f8199k = f11;
    }

    public void B(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10) {
        L(i10, 6, i11, i12, i13);
        L(i10, 7, i14, i15, i16);
        a aVar = this.f8043h.get(Integer.valueOf(i10));
        if (aVar != null) {
            aVar.f8048e.f8144y = f10;
        }
    }

    public boolean B0(String... strArr) {
        for (String str : strArr) {
            for (String str2 : this.f8039d) {
                if (str2.equals(str)) {
                }
            }
            return false;
        }
        return true;
    }

    public void B1(int i10, float f10) {
        i0(i10).f8049f.f8198j = f10;
    }

    public void C(int i10, int i11) {
        if (i11 == 0) {
            x(i10, 0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            x(i10, i11, 4, 0, i11, 3, 0, 0.5f);
        }
    }

    public void C0(a aVar, String str) {
        String[] strArrSplit = str.split(",");
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String[] strArrSplit2 = strArrSplit[i10].split(C4235d4.j.f61456b);
            if (strArrSplit2.length != 2) {
                Log.w("ConstraintSet", " Unable to parse " + strArrSplit[i10]);
            } else {
                aVar.p(strArrSplit2[0], Color.parseColor(strArrSplit2[1]));
            }
        }
    }

    public void C1(int i10, float f10) {
        i0(i10).f8049f.f8199k = f10;
    }

    public void D(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10) {
        L(i10, 3, i11, i12, i13);
        L(i10, 4, i14, i15, i16);
        a aVar = this.f8043h.get(Integer.valueOf(i10));
        if (aVar != null) {
            aVar.f8048e.f8145z = f10;
        }
    }

    public void D1(int i10, float f10) {
        i0(i10).f8049f.f8200l = f10;
    }

    public void E(int i10) {
        this.f8043h.remove(Integer.valueOf(i10));
    }

    public void E1(boolean z10) {
        this.f8036a = z10;
    }

    public void F(int i10, int i11) {
        a aVar;
        if (!this.f8043h.containsKey(Integer.valueOf(i10)) || (aVar = this.f8043h.get(Integer.valueOf(i10))) == null) {
            return;
        }
        switch (i11) {
            case 1:
                b bVar = aVar.f8048e;
                bVar.f8123k = -1;
                bVar.f8121j = -1;
                bVar.H = -1;
                bVar.O = Integer.MIN_VALUE;
                return;
            case 2:
                b bVar2 = aVar.f8048e;
                bVar2.f8127m = -1;
                bVar2.f8125l = -1;
                bVar2.I = -1;
                bVar2.Q = Integer.MIN_VALUE;
                return;
            case 3:
                b bVar3 = aVar.f8048e;
                bVar3.f8131o = -1;
                bVar3.f8129n = -1;
                bVar3.J = 0;
                bVar3.P = Integer.MIN_VALUE;
                return;
            case 4:
                b bVar4 = aVar.f8048e;
                bVar4.f8133p = -1;
                bVar4.f8135q = -1;
                bVar4.K = 0;
                bVar4.R = Integer.MIN_VALUE;
                return;
            case 5:
                b bVar5 = aVar.f8048e;
                bVar5.f8137r = -1;
                bVar5.f8138s = -1;
                bVar5.f8139t = -1;
                bVar5.N = 0;
                bVar5.U = Integer.MIN_VALUE;
                return;
            case 6:
                b bVar6 = aVar.f8048e;
                bVar6.f8140u = -1;
                bVar6.f8141v = -1;
                bVar6.M = 0;
                bVar6.T = Integer.MIN_VALUE;
                return;
            case 7:
                b bVar7 = aVar.f8048e;
                bVar7.f8142w = -1;
                bVar7.f8143x = -1;
                bVar7.L = 0;
                bVar7.S = Integer.MIN_VALUE;
                return;
            case 8:
                b bVar8 = aVar.f8048e;
                bVar8.D = -1.0f;
                bVar8.C = -1;
                bVar8.B = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void F1(int i10, float f10) {
        i0(i10).f8048e.f8145z = f10;
    }

    public void G(Context context, int i10) {
        H((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void G0(a aVar, String str) {
        String[] strArrSplit = str.split(",");
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String[] strArrSplit2 = strArrSplit[i10].split(C4235d4.j.f61456b);
            if (strArrSplit2.length != 2) {
                Log.w("ConstraintSet", " Unable to parse " + strArrSplit[i10]);
            } else {
                aVar.q(strArrSplit2[0], Float.parseFloat(strArrSplit2[1]));
            }
        }
    }

    public void G1(int i10, int i11) {
        i0(i10).f8048e.Y = i11;
    }

    public void H(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f8043h.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f8042g && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f8043h.containsKey(Integer.valueOf(id2))) {
                this.f8043h.put(Integer.valueOf(id2), new a());
            }
            a aVar = this.f8043h.get(Integer.valueOf(id2));
            if (aVar != null) {
                aVar.f8050g = androidx.constraintlayout.widget.b.d(this.f8041f, childAt);
                aVar.k(id2, bVar);
                aVar.f8046c.f8173b = childAt.getVisibility();
                aVar.f8046c.f8175d = childAt.getAlpha();
                aVar.f8049f.f8190b = childAt.getRotation();
                aVar.f8049f.f8191c = childAt.getRotationX();
                aVar.f8049f.f8192d = childAt.getRotationY();
                aVar.f8049f.f8193e = childAt.getScaleX();
                aVar.f8049f.f8194f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f8049f;
                    eVar.f8195g = pivotX;
                    eVar.f8196h = pivotY;
                }
                aVar.f8049f.f8198j = childAt.getTranslationX();
                aVar.f8049f.f8199k = childAt.getTranslationY();
                aVar.f8049f.f8200l = childAt.getTranslationZ();
                e eVar2 = aVar.f8049f;
                if (eVar2.f8201m) {
                    eVar2.f8202n = childAt.getElevation();
                }
                if (childAt instanceof androidx.constraintlayout.widget.a) {
                    androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                    aVar.f8048e.f8134p0 = aVar2.getAllowsGoneWidget();
                    aVar.f8048e.f8124k0 = aVar2.getReferencedIds();
                    aVar.f8048e.f8118h0 = aVar2.getType();
                    aVar.f8048e.f8120i0 = aVar2.getMargin();
                }
            }
        }
    }

    public void H0(a aVar, String str) {
        String[] strArrSplit = str.split(",");
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String[] strArrSplit2 = strArrSplit[i10].split(C4235d4.j.f61456b);
            if (strArrSplit2.length != 2) {
                Log.w("ConstraintSet", " Unable to parse " + strArrSplit[i10]);
            } else {
                aVar.q(strArrSplit2[0], Integer.decode(strArrSplit2[1]).intValue());
            }
        }
    }

    public void H1(int i10, float f10) {
        i0(i10).f8048e.V = f10;
    }

    public void I(g gVar) {
        this.f8043h.clear();
        for (Integer num : gVar.f8043h.keySet()) {
            a aVar = gVar.f8043h.get(num);
            if (aVar != null) {
                this.f8043h.put(num, aVar.clone());
            }
        }
    }

    public void I0(a aVar, String str) {
        String[] strArrL1 = L1(str);
        for (int i10 = 0; i10 < strArrL1.length; i10++) {
            String[] strArrSplit = strArrL1[i10].split(C4235d4.j.f61456b);
            Log.w("ConstraintSet", " Unable to parse " + strArrL1[i10]);
            aVar.s(strArrSplit[0], strArrSplit[1]);
        }
    }

    public void I1(int i10, int i11) {
        i0(i10).f8046c.f8173b = i11;
    }

    public void J(h hVar) {
        int childCount = hVar.getChildCount();
        this.f8043h.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = hVar.getChildAt(i10);
            h.a aVar = (h.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f8042g && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f8043h.containsKey(Integer.valueOf(id2))) {
                this.f8043h.put(Integer.valueOf(id2), new a());
            }
            a aVar2 = this.f8043h.get(Integer.valueOf(id2));
            if (aVar2 != null) {
                if (childAt instanceof androidx.constraintlayout.widget.c) {
                    aVar2.m((androidx.constraintlayout.widget.c) childAt, id2, aVar);
                }
                aVar2.l(id2, aVar);
            }
        }
    }

    public final void J0(a aVar, TypedArray typedArray, boolean z10) {
        if (z10) {
            K0(aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index != l.c.f8706o && l.c.K != index && l.c.L != index) {
                aVar.f8047d.f8158a = true;
                aVar.f8048e.f8105b = true;
                aVar.f8046c.f8172a = true;
                aVar.f8049f.f8189a = true;
            }
            switch (X.get(index)) {
                case 1:
                    b bVar = aVar.f8048e;
                    bVar.f8137r = A0(typedArray, index, bVar.f8137r);
                    break;
                case 2:
                    b bVar2 = aVar.f8048e;
                    bVar2.K = typedArray.getDimensionPixelSize(index, bVar2.K);
                    break;
                case 3:
                    b bVar3 = aVar.f8048e;
                    bVar3.f8135q = A0(typedArray, index, bVar3.f8135q);
                    break;
                case 4:
                    b bVar4 = aVar.f8048e;
                    bVar4.f8133p = A0(typedArray, index, bVar4.f8133p);
                    break;
                case 5:
                    aVar.f8048e.A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f8048e;
                    bVar5.E = typedArray.getDimensionPixelOffset(index, bVar5.E);
                    break;
                case 7:
                    b bVar6 = aVar.f8048e;
                    bVar6.F = typedArray.getDimensionPixelOffset(index, bVar6.F);
                    break;
                case 8:
                    b bVar7 = aVar.f8048e;
                    bVar7.L = typedArray.getDimensionPixelSize(index, bVar7.L);
                    break;
                case 9:
                    b bVar8 = aVar.f8048e;
                    bVar8.f8143x = A0(typedArray, index, bVar8.f8143x);
                    break;
                case 10:
                    b bVar9 = aVar.f8048e;
                    bVar9.f8142w = A0(typedArray, index, bVar9.f8142w);
                    break;
                case 11:
                    b bVar10 = aVar.f8048e;
                    bVar10.R = typedArray.getDimensionPixelSize(index, bVar10.R);
                    break;
                case 12:
                    b bVar11 = aVar.f8048e;
                    bVar11.S = typedArray.getDimensionPixelSize(index, bVar11.S);
                    break;
                case 13:
                    b bVar12 = aVar.f8048e;
                    bVar12.O = typedArray.getDimensionPixelSize(index, bVar12.O);
                    break;
                case 14:
                    b bVar13 = aVar.f8048e;
                    bVar13.Q = typedArray.getDimensionPixelSize(index, bVar13.Q);
                    break;
                case 15:
                    b bVar14 = aVar.f8048e;
                    bVar14.T = typedArray.getDimensionPixelSize(index, bVar14.T);
                    break;
                case 16:
                    b bVar15 = aVar.f8048e;
                    bVar15.P = typedArray.getDimensionPixelSize(index, bVar15.P);
                    break;
                case 17:
                    b bVar16 = aVar.f8048e;
                    bVar16.f8113f = typedArray.getDimensionPixelOffset(index, bVar16.f8113f);
                    break;
                case 18:
                    b bVar17 = aVar.f8048e;
                    bVar17.f8115g = typedArray.getDimensionPixelOffset(index, bVar17.f8115g);
                    break;
                case 19:
                    b bVar18 = aVar.f8048e;
                    bVar18.f8117h = typedArray.getFloat(index, bVar18.f8117h);
                    break;
                case 20:
                    b bVar19 = aVar.f8048e;
                    bVar19.f8144y = typedArray.getFloat(index, bVar19.f8144y);
                    break;
                case 21:
                    b bVar20 = aVar.f8048e;
                    bVar20.f8111e = typedArray.getLayoutDimension(index, bVar20.f8111e);
                    break;
                case 22:
                    d dVar = aVar.f8046c;
                    dVar.f8173b = typedArray.getInt(index, dVar.f8173b);
                    d dVar2 = aVar.f8046c;
                    dVar2.f8173b = V[dVar2.f8173b];
                    break;
                case 23:
                    b bVar21 = aVar.f8048e;
                    bVar21.f8109d = typedArray.getLayoutDimension(index, bVar21.f8109d);
                    break;
                case 24:
                    b bVar22 = aVar.f8048e;
                    bVar22.H = typedArray.getDimensionPixelSize(index, bVar22.H);
                    break;
                case 25:
                    b bVar23 = aVar.f8048e;
                    bVar23.f8121j = A0(typedArray, index, bVar23.f8121j);
                    break;
                case 26:
                    b bVar24 = aVar.f8048e;
                    bVar24.f8123k = A0(typedArray, index, bVar24.f8123k);
                    break;
                case 27:
                    b bVar25 = aVar.f8048e;
                    bVar25.G = typedArray.getInt(index, bVar25.G);
                    break;
                case 28:
                    b bVar26 = aVar.f8048e;
                    bVar26.I = typedArray.getDimensionPixelSize(index, bVar26.I);
                    break;
                case 29:
                    b bVar27 = aVar.f8048e;
                    bVar27.f8125l = A0(typedArray, index, bVar27.f8125l);
                    break;
                case 30:
                    b bVar28 = aVar.f8048e;
                    bVar28.f8127m = A0(typedArray, index, bVar28.f8127m);
                    break;
                case 31:
                    b bVar29 = aVar.f8048e;
                    bVar29.M = typedArray.getDimensionPixelSize(index, bVar29.M);
                    break;
                case 32:
                    b bVar30 = aVar.f8048e;
                    bVar30.f8140u = A0(typedArray, index, bVar30.f8140u);
                    break;
                case 33:
                    b bVar31 = aVar.f8048e;
                    bVar31.f8141v = A0(typedArray, index, bVar31.f8141v);
                    break;
                case 34:
                    b bVar32 = aVar.f8048e;
                    bVar32.J = typedArray.getDimensionPixelSize(index, bVar32.J);
                    break;
                case 35:
                    b bVar33 = aVar.f8048e;
                    bVar33.f8131o = A0(typedArray, index, bVar33.f8131o);
                    break;
                case 36:
                    b bVar34 = aVar.f8048e;
                    bVar34.f8129n = A0(typedArray, index, bVar34.f8129n);
                    break;
                case 37:
                    b bVar35 = aVar.f8048e;
                    bVar35.f8145z = typedArray.getFloat(index, bVar35.f8145z);
                    break;
                case 38:
                    aVar.f8044a = typedArray.getResourceId(index, aVar.f8044a);
                    break;
                case 39:
                    b bVar36 = aVar.f8048e;
                    bVar36.W = typedArray.getFloat(index, bVar36.W);
                    break;
                case 40:
                    b bVar37 = aVar.f8048e;
                    bVar37.V = typedArray.getFloat(index, bVar37.V);
                    break;
                case 41:
                    b bVar38 = aVar.f8048e;
                    bVar38.X = typedArray.getInt(index, bVar38.X);
                    break;
                case 42:
                    b bVar39 = aVar.f8048e;
                    bVar39.Y = typedArray.getInt(index, bVar39.Y);
                    break;
                case 43:
                    d dVar3 = aVar.f8046c;
                    dVar3.f8175d = typedArray.getFloat(index, dVar3.f8175d);
                    break;
                case 44:
                    e eVar = aVar.f8049f;
                    eVar.f8201m = true;
                    eVar.f8202n = typedArray.getDimension(index, eVar.f8202n);
                    break;
                case 45:
                    e eVar2 = aVar.f8049f;
                    eVar2.f8191c = typedArray.getFloat(index, eVar2.f8191c);
                    break;
                case 46:
                    e eVar3 = aVar.f8049f;
                    eVar3.f8192d = typedArray.getFloat(index, eVar3.f8192d);
                    break;
                case 47:
                    e eVar4 = aVar.f8049f;
                    eVar4.f8193e = typedArray.getFloat(index, eVar4.f8193e);
                    break;
                case 48:
                    e eVar5 = aVar.f8049f;
                    eVar5.f8194f = typedArray.getFloat(index, eVar5.f8194f);
                    break;
                case 49:
                    e eVar6 = aVar.f8049f;
                    eVar6.f8195g = typedArray.getDimension(index, eVar6.f8195g);
                    break;
                case 50:
                    e eVar7 = aVar.f8049f;
                    eVar7.f8196h = typedArray.getDimension(index, eVar7.f8196h);
                    break;
                case 51:
                    e eVar8 = aVar.f8049f;
                    eVar8.f8198j = typedArray.getDimension(index, eVar8.f8198j);
                    break;
                case 52:
                    e eVar9 = aVar.f8049f;
                    eVar9.f8199k = typedArray.getDimension(index, eVar9.f8199k);
                    break;
                case 53:
                    e eVar10 = aVar.f8049f;
                    eVar10.f8200l = typedArray.getDimension(index, eVar10.f8200l);
                    break;
                case 54:
                    b bVar40 = aVar.f8048e;
                    bVar40.Z = typedArray.getInt(index, bVar40.Z);
                    break;
                case 55:
                    b bVar41 = aVar.f8048e;
                    bVar41.f8104a0 = typedArray.getInt(index, bVar41.f8104a0);
                    break;
                case 56:
                    b bVar42 = aVar.f8048e;
                    bVar42.f8106b0 = typedArray.getDimensionPixelSize(index, bVar42.f8106b0);
                    break;
                case 57:
                    b bVar43 = aVar.f8048e;
                    bVar43.f8108c0 = typedArray.getDimensionPixelSize(index, bVar43.f8108c0);
                    break;
                case 58:
                    b bVar44 = aVar.f8048e;
                    bVar44.f8110d0 = typedArray.getDimensionPixelSize(index, bVar44.f8110d0);
                    break;
                case 59:
                    b bVar45 = aVar.f8048e;
                    bVar45.f8112e0 = typedArray.getDimensionPixelSize(index, bVar45.f8112e0);
                    break;
                case 60:
                    e eVar11 = aVar.f8049f;
                    eVar11.f8190b = typedArray.getFloat(index, eVar11.f8190b);
                    break;
                case 61:
                    b bVar46 = aVar.f8048e;
                    bVar46.B = A0(typedArray, index, bVar46.B);
                    break;
                case 62:
                    b bVar47 = aVar.f8048e;
                    bVar47.C = typedArray.getDimensionPixelSize(index, bVar47.C);
                    break;
                case 63:
                    b bVar48 = aVar.f8048e;
                    bVar48.D = typedArray.getFloat(index, bVar48.D);
                    break;
                case 64:
                    c cVar = aVar.f8047d;
                    cVar.f8159b = A0(typedArray, index, cVar.f8159b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f8047d.f8161d = typedArray.getString(index);
                    } else {
                        aVar.f8047d.f8161d = n0.d.f115555o[typedArray.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    aVar.f8047d.f8163f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f8047d;
                    cVar2.f8166i = typedArray.getFloat(index, cVar2.f8166i);
                    break;
                case 68:
                    d dVar4 = aVar.f8046c;
                    dVar4.f8176e = typedArray.getFloat(index, dVar4.f8176e);
                    break;
                case 69:
                    aVar.f8048e.f8114f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f8048e.f8116g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f8048e;
                    bVar49.f8118h0 = typedArray.getInt(index, bVar49.f8118h0);
                    break;
                case 73:
                    b bVar50 = aVar.f8048e;
                    bVar50.f8120i0 = typedArray.getDimensionPixelSize(index, bVar50.f8120i0);
                    break;
                case 74:
                    aVar.f8048e.f8126l0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f8048e;
                    bVar51.f8134p0 = typedArray.getBoolean(index, bVar51.f8134p0);
                    break;
                case 76:
                    c cVar3 = aVar.f8047d;
                    cVar3.f8162e = typedArray.getInt(index, cVar3.f8162e);
                    break;
                case 77:
                    aVar.f8048e.f8128m0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f8046c;
                    dVar5.f8174c = typedArray.getInt(index, dVar5.f8174c);
                    break;
                case 79:
                    c cVar4 = aVar.f8047d;
                    cVar4.f8164g = typedArray.getFloat(index, cVar4.f8164g);
                    break;
                case 80:
                    b bVar52 = aVar.f8048e;
                    bVar52.f8130n0 = typedArray.getBoolean(index, bVar52.f8130n0);
                    break;
                case 81:
                    b bVar53 = aVar.f8048e;
                    bVar53.f8132o0 = typedArray.getBoolean(index, bVar53.f8132o0);
                    break;
                case 82:
                    c cVar5 = aVar.f8047d;
                    cVar5.f8160c = typedArray.getInteger(index, cVar5.f8160c);
                    break;
                case 83:
                    e eVar12 = aVar.f8049f;
                    eVar12.f8197i = A0(typedArray, index, eVar12.f8197i);
                    break;
                case 84:
                    c cVar6 = aVar.f8047d;
                    cVar6.f8168k = typedArray.getInteger(index, cVar6.f8168k);
                    break;
                case 85:
                    c cVar7 = aVar.f8047d;
                    cVar7.f8167j = typedArray.getFloat(index, cVar7.f8167j);
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f8047d.f8171n = typedArray.getResourceId(index, -1);
                        c cVar8 = aVar.f8047d;
                        if (cVar8.f8171n != -1) {
                            cVar8.f8170m = -2;
                        }
                    } else if (i11 == 3) {
                        aVar.f8047d.f8169l = typedArray.getString(index);
                        if (aVar.f8047d.f8169l.indexOf(to.c.userBaseDel) > 0) {
                            aVar.f8047d.f8171n = typedArray.getResourceId(index, -1);
                            aVar.f8047d.f8170m = -2;
                        } else {
                            aVar.f8047d.f8170m = -1;
                        }
                    } else {
                        c cVar9 = aVar.f8047d;
                        cVar9.f8170m = typedArray.getInteger(index, cVar9.f8171n);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + X.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + X.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.f8048e;
                    bVar54.f8138s = A0(typedArray, index, bVar54.f8138s);
                    break;
                case 92:
                    b bVar55 = aVar.f8048e;
                    bVar55.f8139t = A0(typedArray, index, bVar55.f8139t);
                    break;
                case N1 /* 93 */:
                    b bVar56 = aVar.f8048e;
                    bVar56.N = typedArray.getDimensionPixelSize(index, bVar56.N);
                    break;
                case 94:
                    b bVar57 = aVar.f8048e;
                    bVar57.U = typedArray.getDimensionPixelSize(index, bVar57.U);
                    break;
                case P1 /* 95 */:
                    D0(aVar.f8048e, typedArray, index, 0);
                    break;
                case 96:
                    D0(aVar.f8048e, typedArray, index, 1);
                    break;
                case R1 /* 97 */:
                    b bVar58 = aVar.f8048e;
                    bVar58.f8136q0 = typedArray.getInt(index, bVar58.f8136q0);
                    break;
            }
        }
        b bVar59 = aVar.f8048e;
        if (bVar59.f8126l0 != null) {
            bVar59.f8124k0 = null;
        }
    }

    public void J1(int i10, int i11) {
        i0(i10).f8046c.f8174c = i11;
    }

    public void K(int i10, int i11, int i12, int i13) {
        if (!this.f8043h.containsKey(Integer.valueOf(i10))) {
            this.f8043h.put(Integer.valueOf(i10), new a());
        }
        a aVar = this.f8043h.get(Integer.valueOf(i10));
        if (aVar == null) {
            return;
        }
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    b bVar = aVar.f8048e;
                    bVar.f8121j = i12;
                    bVar.f8123k = -1;
                    return;
                } else if (i13 == 2) {
                    b bVar2 = aVar.f8048e;
                    bVar2.f8123k = i12;
                    bVar2.f8121j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + K1(i13) + " undefined");
                }
            case 2:
                if (i13 == 1) {
                    b bVar3 = aVar.f8048e;
                    bVar3.f8125l = i12;
                    bVar3.f8127m = -1;
                    return;
                } else if (i13 == 2) {
                    b bVar4 = aVar.f8048e;
                    bVar4.f8127m = i12;
                    bVar4.f8125l = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + K1(i13) + " undefined");
                }
            case 3:
                if (i13 == 3) {
                    b bVar5 = aVar.f8048e;
                    bVar5.f8129n = i12;
                    bVar5.f8131o = -1;
                    bVar5.f8137r = -1;
                    bVar5.f8138s = -1;
                    bVar5.f8139t = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + K1(i13) + " undefined");
                }
                b bVar6 = aVar.f8048e;
                bVar6.f8131o = i12;
                bVar6.f8129n = -1;
                bVar6.f8137r = -1;
                bVar6.f8138s = -1;
                bVar6.f8139t = -1;
                return;
            case 4:
                if (i13 == 4) {
                    b bVar7 = aVar.f8048e;
                    bVar7.f8135q = i12;
                    bVar7.f8133p = -1;
                    bVar7.f8137r = -1;
                    bVar7.f8138s = -1;
                    bVar7.f8139t = -1;
                    return;
                }
                if (i13 != 3) {
                    throw new IllegalArgumentException("right to " + K1(i13) + " undefined");
                }
                b bVar8 = aVar.f8048e;
                bVar8.f8133p = i12;
                bVar8.f8135q = -1;
                bVar8.f8137r = -1;
                bVar8.f8138s = -1;
                bVar8.f8139t = -1;
                return;
            case 5:
                if (i13 == 5) {
                    b bVar9 = aVar.f8048e;
                    bVar9.f8137r = i12;
                    bVar9.f8135q = -1;
                    bVar9.f8133p = -1;
                    bVar9.f8129n = -1;
                    bVar9.f8131o = -1;
                    return;
                }
                if (i13 == 3) {
                    b bVar10 = aVar.f8048e;
                    bVar10.f8138s = i12;
                    bVar10.f8135q = -1;
                    bVar10.f8133p = -1;
                    bVar10.f8129n = -1;
                    bVar10.f8131o = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + K1(i13) + " undefined");
                }
                b bVar11 = aVar.f8048e;
                bVar11.f8139t = i12;
                bVar11.f8135q = -1;
                bVar11.f8133p = -1;
                bVar11.f8129n = -1;
                bVar11.f8131o = -1;
                return;
            case 6:
                if (i13 == 6) {
                    b bVar12 = aVar.f8048e;
                    bVar12.f8141v = i12;
                    bVar12.f8140u = -1;
                    return;
                } else if (i13 == 7) {
                    b bVar13 = aVar.f8048e;
                    bVar13.f8140u = i12;
                    bVar13.f8141v = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + K1(i13) + " undefined");
                }
            case 7:
                if (i13 == 7) {
                    b bVar14 = aVar.f8048e;
                    bVar14.f8143x = i12;
                    bVar14.f8142w = -1;
                    return;
                } else if (i13 == 6) {
                    b bVar15 = aVar.f8048e;
                    bVar15.f8142w = i12;
                    bVar15.f8143x = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + K1(i13) + " undefined");
                }
            default:
                throw new IllegalArgumentException(K1(i11) + " to " + K1(i13) + " unknown");
        }
    }

    public final String K1(int i10) {
        switch (i10) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public void L(int i10, int i11, int i12, int i13, int i14) {
        if (!this.f8043h.containsKey(Integer.valueOf(i10))) {
            this.f8043h.put(Integer.valueOf(i10), new a());
        }
        a aVar = this.f8043h.get(Integer.valueOf(i10));
        if (aVar == null) {
            return;
        }
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    b bVar = aVar.f8048e;
                    bVar.f8121j = i12;
                    bVar.f8123k = -1;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("Left to " + K1(i13) + " undefined");
                    }
                    b bVar2 = aVar.f8048e;
                    bVar2.f8123k = i12;
                    bVar2.f8121j = -1;
                }
                aVar.f8048e.H = i14;
                return;
            case 2:
                if (i13 == 1) {
                    b bVar3 = aVar.f8048e;
                    bVar3.f8125l = i12;
                    bVar3.f8127m = -1;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("right to " + K1(i13) + " undefined");
                    }
                    b bVar4 = aVar.f8048e;
                    bVar4.f8127m = i12;
                    bVar4.f8125l = -1;
                }
                aVar.f8048e.I = i14;
                return;
            case 3:
                if (i13 == 3) {
                    b bVar5 = aVar.f8048e;
                    bVar5.f8129n = i12;
                    bVar5.f8131o = -1;
                    bVar5.f8137r = -1;
                    bVar5.f8138s = -1;
                    bVar5.f8139t = -1;
                } else {
                    if (i13 != 4) {
                        throw new IllegalArgumentException("right to " + K1(i13) + " undefined");
                    }
                    b bVar6 = aVar.f8048e;
                    bVar6.f8131o = i12;
                    bVar6.f8129n = -1;
                    bVar6.f8137r = -1;
                    bVar6.f8138s = -1;
                    bVar6.f8139t = -1;
                }
                aVar.f8048e.J = i14;
                return;
            case 4:
                if (i13 == 4) {
                    b bVar7 = aVar.f8048e;
                    bVar7.f8135q = i12;
                    bVar7.f8133p = -1;
                    bVar7.f8137r = -1;
                    bVar7.f8138s = -1;
                    bVar7.f8139t = -1;
                } else {
                    if (i13 != 3) {
                        throw new IllegalArgumentException("right to " + K1(i13) + " undefined");
                    }
                    b bVar8 = aVar.f8048e;
                    bVar8.f8133p = i12;
                    bVar8.f8135q = -1;
                    bVar8.f8137r = -1;
                    bVar8.f8138s = -1;
                    bVar8.f8139t = -1;
                }
                aVar.f8048e.K = i14;
                return;
            case 5:
                if (i13 == 5) {
                    b bVar9 = aVar.f8048e;
                    bVar9.f8137r = i12;
                    bVar9.f8135q = -1;
                    bVar9.f8133p = -1;
                    bVar9.f8129n = -1;
                    bVar9.f8131o = -1;
                    return;
                }
                if (i13 == 3) {
                    b bVar10 = aVar.f8048e;
                    bVar10.f8138s = i12;
                    bVar10.f8135q = -1;
                    bVar10.f8133p = -1;
                    bVar10.f8129n = -1;
                    bVar10.f8131o = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + K1(i13) + " undefined");
                }
                b bVar11 = aVar.f8048e;
                bVar11.f8139t = i12;
                bVar11.f8135q = -1;
                bVar11.f8133p = -1;
                bVar11.f8129n = -1;
                bVar11.f8131o = -1;
                return;
            case 6:
                if (i13 == 6) {
                    b bVar12 = aVar.f8048e;
                    bVar12.f8141v = i12;
                    bVar12.f8140u = -1;
                } else {
                    if (i13 != 7) {
                        throw new IllegalArgumentException("right to " + K1(i13) + " undefined");
                    }
                    b bVar13 = aVar.f8048e;
                    bVar13.f8140u = i12;
                    bVar13.f8141v = -1;
                }
                aVar.f8048e.M = i14;
                return;
            case 7:
                if (i13 == 7) {
                    b bVar14 = aVar.f8048e;
                    bVar14.f8143x = i12;
                    bVar14.f8142w = -1;
                } else {
                    if (i13 != 6) {
                        throw new IllegalArgumentException("right to " + K1(i13) + " undefined");
                    }
                    b bVar15 = aVar.f8048e;
                    bVar15.f8142w = i12;
                    bVar15.f8143x = -1;
                }
                aVar.f8048e.L = i14;
                return;
            default:
                throw new IllegalArgumentException(K1(i11) + " to " + K1(i13) + " unknown");
        }
    }

    public void L0(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f8042g && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f8043h.containsKey(Integer.valueOf(id2))) {
                this.f8043h.put(Integer.valueOf(id2), new a());
            }
            a aVar = this.f8043h.get(Integer.valueOf(id2));
            if (aVar != null) {
                if (!aVar.f8048e.f8105b) {
                    aVar.k(id2, bVar);
                    if (childAt instanceof androidx.constraintlayout.widget.c) {
                        aVar.f8048e.f8124k0 = ((androidx.constraintlayout.widget.c) childAt).getReferencedIds();
                        if (childAt instanceof androidx.constraintlayout.widget.a) {
                            androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                            aVar.f8048e.f8134p0 = aVar2.getAllowsGoneWidget();
                            aVar.f8048e.f8118h0 = aVar2.getType();
                            aVar.f8048e.f8120i0 = aVar2.getMargin();
                        }
                    }
                    aVar.f8048e.f8105b = true;
                }
                d dVar = aVar.f8046c;
                if (!dVar.f8172a) {
                    dVar.f8173b = childAt.getVisibility();
                    aVar.f8046c.f8175d = childAt.getAlpha();
                    aVar.f8046c.f8172a = true;
                }
                e eVar = aVar.f8049f;
                if (!eVar.f8189a) {
                    eVar.f8189a = true;
                    eVar.f8190b = childAt.getRotation();
                    aVar.f8049f.f8191c = childAt.getRotationX();
                    aVar.f8049f.f8192d = childAt.getRotationY();
                    aVar.f8049f.f8193e = childAt.getScaleX();
                    aVar.f8049f.f8194f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        e eVar2 = aVar.f8049f;
                        eVar2.f8195g = pivotX;
                        eVar2.f8196h = pivotY;
                    }
                    aVar.f8049f.f8198j = childAt.getTranslationX();
                    aVar.f8049f.f8199k = childAt.getTranslationY();
                    aVar.f8049f.f8200l = childAt.getTranslationZ();
                    e eVar3 = aVar.f8049f;
                    if (eVar3.f8201m) {
                        eVar3.f8202n = childAt.getElevation();
                    }
                }
            }
        }
    }

    public void M(int i10, int i11, int i12, float f10) {
        b bVar = i0(i10).f8048e;
        bVar.B = i11;
        bVar.C = i12;
        bVar.D = f10;
    }

    public void M0(g gVar) {
        for (Integer num : gVar.f8043h.keySet()) {
            num.intValue();
            a aVar = gVar.f8043h.get(num);
            if (!this.f8043h.containsKey(num)) {
                this.f8043h.put(num, new a());
            }
            a aVar2 = this.f8043h.get(num);
            if (aVar2 != null) {
                b bVar = aVar2.f8048e;
                if (!bVar.f8105b) {
                    bVar.a(aVar.f8048e);
                }
                d dVar = aVar2.f8046c;
                if (!dVar.f8172a) {
                    dVar.a(aVar.f8046c);
                }
                e eVar = aVar2.f8049f;
                if (!eVar.f8189a) {
                    eVar.a(aVar.f8049f);
                }
                c cVar = aVar2.f8047d;
                if (!cVar.f8158a) {
                    cVar.a(aVar.f8047d);
                }
                for (String str : aVar.f8050g.keySet()) {
                    if (!aVar2.f8050g.containsKey(str)) {
                        aVar2.f8050g.put(str, aVar.f8050g.get(str));
                    }
                }
            }
        }
    }

    public void M1(Writer writer, ConstraintLayout constraintLayout, int i10) throws IOException {
        writer.write("\n---------------------------------------------\n");
        if ((i10 & 1) == 1) {
            new C0039g(writer, constraintLayout, i10).i();
        } else {
            new f(writer, constraintLayout, i10).g();
        }
        writer.write("\n---------------------------------------------\n");
    }

    public void N(int i10, int i11) {
        i0(i10).f8048e.f8104a0 = i11;
    }

    public void N0(String str) {
        this.f8041f.remove(str);
    }

    public void O(int i10, int i11) {
        i0(i10).f8048e.Z = i11;
    }

    public void O0(int i10) {
        a aVar;
        if (!this.f8043h.containsKey(Integer.valueOf(i10)) || (aVar = this.f8043h.get(Integer.valueOf(i10))) == null) {
            return;
        }
        b bVar = aVar.f8048e;
        int i11 = bVar.f8123k;
        int i12 = bVar.f8125l;
        if (i11 != -1 || i12 != -1) {
            if (i11 == -1 || i12 == -1) {
                int i13 = bVar.f8127m;
                if (i13 != -1) {
                    L(i11, 2, i13, 2, 0);
                } else {
                    int i14 = bVar.f8121j;
                    if (i14 != -1) {
                        L(i12, 1, i14, 1, 0);
                    }
                }
            } else {
                L(i11, 2, i12, 1, 0);
                L(i12, 1, i11, 2, 0);
            }
            F(i10, 1);
            F(i10, 2);
            return;
        }
        int i15 = bVar.f8140u;
        int i16 = bVar.f8142w;
        if (i15 != -1 || i16 != -1) {
            if (i15 != -1 && i16 != -1) {
                L(i15, 7, i16, 6, 0);
                L(i16, 6, i11, 7, 0);
            } else if (i16 != -1) {
                int i17 = bVar.f8127m;
                if (i17 != -1) {
                    L(i11, 7, i17, 7, 0);
                } else {
                    int i18 = bVar.f8121j;
                    if (i18 != -1) {
                        L(i16, 6, i18, 6, 0);
                    }
                }
            }
        }
        F(i10, 6);
        F(i10, 7);
    }

    public void P(int i10, int i11) {
        i0(i10).f8048e.f8111e = i11;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    public void P0(int i10) {
        if (this.f8043h.containsKey(Integer.valueOf(i10))) {
            a aVar = this.f8043h.get(Integer.valueOf(i10));
            if (aVar == null) {
                return;
            }
            b bVar = aVar.f8048e;
            int i11 = bVar.f8131o;
            int i12 = bVar.f8133p;
            if (i11 != -1 || i12 != -1) {
                if (i11 == -1 || i12 == -1) {
                    int i13 = bVar.f8135q;
                    if (i13 != -1) {
                        L(i11, 4, i13, 4, 0);
                    } else {
                        int i14 = bVar.f8129n;
                        if (i14 != -1) {
                            L(i12, 3, i14, 3, 0);
                        }
                    }
                } else {
                    L(i11, 4, i12, 3, 0);
                    L(i12, 3, i11, 4, 0);
                }
            }
        }
        F(i10, 3);
        F(i10, 4);
    }

    public void Q(int i10, int i11) {
        i0(i10).f8048e.f8108c0 = i11;
    }

    public void Q0(int i10, float f10) {
        i0(i10).f8046c.f8175d = f10;
    }

    public void R(int i10, int i11) {
        i0(i10).f8048e.f8106b0 = i11;
    }

    public void R0(int i10, boolean z10) {
        i0(i10).f8049f.f8201m = z10;
    }

    public void S(int i10, int i11) {
        i0(i10).f8048e.f8112e0 = i11;
    }

    public void S0(int i10, int i11) {
        i0(i10).f8048e.f8122j0 = i11;
    }

    public void T(int i10, int i11) {
        i0(i10).f8048e.f8110d0 = i11;
    }

    public void T0(int i10, String str, int i11) {
        i0(i10).p(str, i11);
    }

    public void U(int i10, float f10) {
        i0(i10).f8048e.f8116g0 = f10;
    }

    public void V(int i10, float f10) {
        i0(i10).f8048e.f8114f0 = f10;
    }

    public void W(int i10, int i11) {
        i0(i10).f8048e.f8109d = i11;
    }

    public void X(int i10, boolean z10) {
        i0(i10).f8048e.f8132o0 = z10;
    }

    public void Y(int i10, boolean z10) {
        i0(i10).f8048e.f8130n0 = z10;
    }

    public void Y0(int i10, String str) {
        i0(i10).f8048e.A = str;
    }

    public final int[] Z(View view, String str) {
        int iIntValue;
        Object designInformation;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            try {
                iIntValue = l.b.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) {
                iIntValue = ((Integer) designInformation).intValue();
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    public void Z0(int i10, int i11) {
        i0(i10).f8048e.E = i11;
    }

    public void a0(int i10, int i11) {
        b bVar = i0(i10).f8048e;
        bVar.f8103a = true;
        bVar.G = i11;
    }

    public void a1(int i10, int i11) {
        i0(i10).f8048e.F = i11;
    }

    public void b0(int i10, int i11, int i12, int... iArr) {
        b bVar = i0(i10).f8048e;
        bVar.f8122j0 = 1;
        bVar.f8118h0 = i11;
        bVar.f8120i0 = i12;
        bVar.f8103a = false;
        bVar.f8124k0 = iArr;
    }

    public void b1(int i10, float f10) {
        i0(i10).f8049f.f8202n = f10;
        i0(i10).f8049f.f8201m = true;
    }

    public void c0(int i10, int i11, int i12, int i13, int[] iArr, float[] fArr, int i14) {
        d0(i10, i11, i12, i13, iArr, fArr, i14, 1, 2);
    }

    public void c1(int i10, String str, float f10) {
        i0(i10).q(str, f10);
    }

    public final void d0(int i10, int i11, int i12, int i13, int[] iArr, float[] fArr, int i14, int i15, int i16) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            i0(iArr[0]).f8048e.W = fArr[0];
        }
        i0(iArr[0]).f8048e.X = i14;
        L(iArr[0], i15, i10, i11, -1);
        for (int i17 = 1; i17 < iArr.length; i17++) {
            int i18 = i17 - 1;
            L(iArr[i17], i15, iArr[i18], i16, -1);
            L(iArr[i18], i16, iArr[i17], i15, -1);
            if (fArr != null) {
                i0(iArr[i17]).f8048e.W = fArr[i17];
            }
        }
        L(iArr[iArr.length - 1], i16, i12, i13, -1);
    }

    public void d1(boolean z10) {
        this.f8042g = z10;
    }

    public void e0(int i10, int i11, int i12, int i13, int[] iArr, float[] fArr, int i14) {
        d0(i10, i11, i12, i13, iArr, fArr, i14, 6, 7);
    }

    public void e1(int i10, int i11, int i12) {
        a aVarI0 = i0(i10);
        switch (i11) {
            case 1:
                aVarI0.f8048e.O = i12;
                return;
            case 2:
                aVarI0.f8048e.Q = i12;
                return;
            case 3:
                aVarI0.f8048e.P = i12;
                return;
            case 4:
                aVarI0.f8048e.R = i12;
                return;
            case 5:
                aVarI0.f8048e.U = i12;
                return;
            case 6:
                aVarI0.f8048e.T = i12;
                return;
            case 7:
                aVarI0.f8048e.S = i12;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void f0(int i10, int i11, int i12, int i13, int[] iArr, float[] fArr, int i14) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            i0(iArr[0]).f8048e.V = fArr[0];
        }
        i0(iArr[0]).f8048e.Y = i14;
        L(iArr[0], 3, i10, i11, 0);
        for (int i15 = 1; i15 < iArr.length; i15++) {
            int i16 = i15 - 1;
            L(iArr[i15], 3, iArr[i16], 4, 0);
            L(iArr[i16], 4, iArr[i15], 3, 0);
            if (fArr != null) {
                i0(iArr[i15]).f8048e.V = fArr[i15];
            }
        }
        L(iArr[iArr.length - 1], 4, i12, i13, 0);
    }

    public void f1(int i10, int i11) {
        i0(i10).f8048e.f8113f = i11;
        i0(i10).f8048e.f8115g = -1;
        i0(i10).f8048e.f8117h = -1.0f;
    }

    public void g0(androidx.constraintlayout.motion.widget.b bVar, int... iArr) {
        HashSet hashSet;
        Set<Integer> setKeySet = this.f8043h.keySet();
        if (iArr.length != 0) {
            hashSet = new HashSet();
            for (int i10 : iArr) {
                hashSet.add(Integer.valueOf(i10));
            }
        } else {
            hashSet = new HashSet(setKeySet);
        }
        System.out.println(hashSet.size() + " constraints");
        StringBuilder sb2 = new StringBuilder();
        for (Integer num : (Integer[]) hashSet.toArray(new Integer[0])) {
            a aVar = this.f8043h.get(num);
            if (aVar != null) {
                sb2.append("<Constraint id=");
                sb2.append(num);
                sb2.append(" \n");
                aVar.f8048e.b(bVar, sb2);
                sb2.append("/>\n");
            }
        }
        System.out.println(sb2.toString());
    }

    public void g1(int i10, int i11) {
        i0(i10).f8048e.f8115g = i11;
        i0(i10).f8048e.f8113f = -1;
        i0(i10).f8048e.f8117h = -1.0f;
    }

    public final void h(androidx.constraintlayout.widget.b.a aVar, String... strArr) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (this.f8041f.containsKey(strArr[i10])) {
                androidx.constraintlayout.widget.b bVar = this.f8041f.get(strArr[i10]);
                if (bVar != null && bVar.j() != aVar) {
                    throw new IllegalArgumentException("ConstraintAttribute is already a " + bVar.j().name());
                }
            } else {
                this.f8041f.put(strArr[i10], new androidx.constraintlayout.widget.b(strArr[i10], aVar));
            }
        }
    }

    public final a h0(Context context, AttributeSet attributeSet, boolean z10) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? l.c.f8491b4 : l.c.f8672m);
        J0(aVar, typedArrayObtainStyledAttributes, z10);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public void h1(int i10, float f10) {
        i0(i10).f8048e.f8117h = f10;
        i0(i10).f8048e.f8115g = -1;
        i0(i10).f8048e.f8113f = -1;
    }

    public void i(String... strArr) {
        h(androidx.constraintlayout.widget.b.a.COLOR_TYPE, strArr);
    }

    public final a i0(int i10) {
        if (!this.f8043h.containsKey(Integer.valueOf(i10))) {
            this.f8043h.put(Integer.valueOf(i10), new a());
        }
        return this.f8043h.get(Integer.valueOf(i10));
    }

    public void i1(int i10, float f10) {
        i0(i10).f8048e.f8144y = f10;
    }

    public void j(String... strArr) {
        h(androidx.constraintlayout.widget.b.a.FLOAT_TYPE, strArr);
    }

    public boolean j0(int i10) {
        return i0(i10).f8049f.f8201m;
    }

    public void j1(int i10, int i11) {
        i0(i10).f8048e.X = i11;
    }

    public void k(String... strArr) {
        h(androidx.constraintlayout.widget.b.a.INT_TYPE, strArr);
    }

    public a k0(int i10) {
        if (this.f8043h.containsKey(Integer.valueOf(i10))) {
            return this.f8043h.get(Integer.valueOf(i10));
        }
        return null;
    }

    public void k1(int i10, float f10) {
        i0(i10).f8048e.W = f10;
    }

    public void l(String... strArr) {
        h(androidx.constraintlayout.widget.b.a.STRING_TYPE, strArr);
    }

    public HashMap<String, androidx.constraintlayout.widget.b> l0() {
        return this.f8041f;
    }

    public void l1(int i10, String str, int i11) {
        i0(i10).r(str, i11);
    }

    public void m(int i10, int i11, int i12) {
        L(i10, 1, i11, i11 == 0 ? 1 : 2, 0);
        L(i10, 2, i12, i12 == 0 ? 2 : 1, 0);
        if (i11 != 0) {
            L(i11, 2, i10, 1, 0);
        }
        if (i12 != 0) {
            L(i12, 1, i10, 2, 0);
        }
    }

    public void m1(int i10, int i11) {
        if (i11 < 0 || i11 > 3) {
            return;
        }
        i0(i10).f8048e.f8136q0 = i11;
    }

    public void n(int i10, int i11, int i12) {
        L(i10, 6, i11, i11 == 0 ? 6 : 7, 0);
        L(i10, 7, i12, i12 == 0 ? 7 : 6, 0);
        if (i11 != 0) {
            L(i11, 7, i10, 6, 0);
        }
        if (i12 != 0) {
            L(i12, 6, i10, 7, 0);
        }
    }

    public int n0(int i10) {
        return i0(i10).f8048e.f8111e;
    }

    public void n1(int i10, int i11, int i12) {
        a aVarI0 = i0(i10);
        switch (i11) {
            case 1:
                aVarI0.f8048e.H = i12;
                return;
            case 2:
                aVarI0.f8048e.I = i12;
                return;
            case 3:
                aVarI0.f8048e.J = i12;
                return;
            case 4:
                aVarI0.f8048e.K = i12;
                return;
            case 5:
                aVarI0.f8048e.N = i12;
                return;
            case 6:
                aVarI0.f8048e.M = i12;
                return;
            case 7:
                aVarI0.f8048e.L = i12;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void o(int i10, int i11, int i12) {
        L(i10, 3, i11, i11 == 0 ? 3 : 4, 0);
        L(i10, 4, i12, i12 == 0 ? 4 : 3, 0);
        if (i11 != 0) {
            L(i11, 4, i10, 3, 0);
        }
        if (i12 != 0) {
            L(i12, 3, i10, 4, 0);
        }
    }

    public int[] o0() {
        Integer[] numArr = (Integer[]) this.f8043h.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = numArr[i10].intValue();
        }
        return iArr;
    }

    public void o1(int i10, int... iArr) {
        i0(i10).f8048e.f8124k0 = iArr;
    }

    public void p(ConstraintLayout constraintLayout) {
        a aVar;
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f8043h.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + w0.c.k(childAt));
            } else {
                if (this.f8042g && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.f8043h.containsKey(Integer.valueOf(id2)) && (aVar = this.f8043h.get(Integer.valueOf(id2))) != null) {
                    androidx.constraintlayout.widget.b.r(childAt, aVar.f8050g);
                }
            }
        }
    }

    public void p1(int i10, float f10) {
        i0(i10).f8049f.f8190b = f10;
    }

    public void q(g gVar) {
        for (a aVar : gVar.f8043h.values()) {
            if (aVar.f8051h != null) {
                if (aVar.f8045b == null) {
                    aVar.f8051h.e(k0(aVar.f8044a));
                } else {
                    Iterator<Integer> it = this.f8043h.keySet().iterator();
                    while (it.hasNext()) {
                        a aVarK0 = k0(it.next().intValue());
                        String str = aVarK0.f8048e.f8128m0;
                        if (str != null && aVar.f8045b.matches(str)) {
                            aVar.f8051h.e(aVarK0);
                            aVarK0.f8050g.putAll((HashMap) aVar.f8050g.clone());
                        }
                    }
                }
            }
        }
    }

    public a q0(int i10) {
        return i0(i10);
    }

    public void q1(int i10, float f10) {
        i0(i10).f8049f.f8191c = f10;
    }

    public void r(ConstraintLayout constraintLayout) {
        t(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public int[] r0(int i10) {
        int[] iArr = i0(i10).f8048e.f8124k0;
        return iArr == null ? new int[0] : Arrays.copyOf(iArr, iArr.length);
    }

    public void r1(int i10, float f10) {
        i0(i10).f8049f.f8192d = f10;
    }

    public void s(androidx.constraintlayout.widget.c cVar, s0.e eVar, ConstraintLayout.b bVar, SparseArray<s0.e> sparseArray) {
        a aVar;
        int id2 = cVar.getId();
        if (this.f8043h.containsKey(Integer.valueOf(id2)) && (aVar = this.f8043h.get(Integer.valueOf(id2))) != null && (eVar instanceof s0.j)) {
            cVar.B(aVar, (s0.j) eVar, bVar, sparseArray);
        }
    }

    public String[] s0() {
        String[] strArr = this.f8039d;
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public void s1(int i10, float f10) {
        i0(i10).f8049f.f8193e = f10;
    }

    public void t(ConstraintLayout constraintLayout, boolean z10) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f8043h.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f8043h.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + w0.c.k(childAt));
            } else {
                if (this.f8042g && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (this.f8043h.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = this.f8043h.get(Integer.valueOf(id2));
                        if (aVar != null) {
                            if (childAt instanceof androidx.constraintlayout.widget.a) {
                                aVar.f8048e.f8122j0 = 1;
                                androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                                aVar2.setId(id2);
                                aVar2.setType(aVar.f8048e.f8118h0);
                                aVar2.setMargin(aVar.f8048e.f8120i0);
                                aVar2.setAllowsGoneWidget(aVar.f8048e.f8134p0);
                                b bVar = aVar.f8048e;
                                int[] iArr = bVar.f8124k0;
                                if (iArr != null) {
                                    aVar2.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f8126l0;
                                    if (str != null) {
                                        bVar.f8124k0 = Z(aVar2, str);
                                        aVar2.setReferencedIds(aVar.f8048e.f8124k0);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.e();
                            aVar.i(bVar2);
                            if (z10) {
                                androidx.constraintlayout.widget.b.r(childAt, aVar.f8050g);
                            }
                            childAt.setLayoutParams(bVar2);
                            d dVar = aVar.f8046c;
                            if (dVar.f8174c == 0) {
                                childAt.setVisibility(dVar.f8173b);
                            }
                            childAt.setAlpha(aVar.f8046c.f8175d);
                            childAt.setRotation(aVar.f8049f.f8190b);
                            childAt.setRotationX(aVar.f8049f.f8191c);
                            childAt.setRotationY(aVar.f8049f.f8192d);
                            childAt.setScaleX(aVar.f8049f.f8193e);
                            childAt.setScaleY(aVar.f8049f.f8194f);
                            e eVar = aVar.f8049f;
                            if (eVar.f8197i != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(aVar.f8049f.f8197i);
                                if (viewFindViewById != null) {
                                    float top = (viewFindViewById.getTop() + viewFindViewById.getBottom()) / 2.0f;
                                    float left = (viewFindViewById.getLeft() + viewFindViewById.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float left2 = left - childAt.getLeft();
                                        float top2 = top - childAt.getTop();
                                        childAt.setPivotX(left2);
                                        childAt.setPivotY(top2);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f8195g)) {
                                    childAt.setPivotX(aVar.f8049f.f8195g);
                                }
                                if (!Float.isNaN(aVar.f8049f.f8196h)) {
                                    childAt.setPivotY(aVar.f8049f.f8196h);
                                }
                            }
                            childAt.setTranslationX(aVar.f8049f.f8198j);
                            childAt.setTranslationY(aVar.f8049f.f8199k);
                            childAt.setTranslationZ(aVar.f8049f.f8200l);
                            e eVar2 = aVar.f8049f;
                            if (eVar2.f8201m) {
                                childAt.setElevation(eVar2.f8202n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar3 = this.f8043h.get(num);
            if (aVar3 != null) {
                if (aVar3.f8048e.f8122j0 == 1) {
                    androidx.constraintlayout.widget.a aVar4 = new androidx.constraintlayout.widget.a(constraintLayout.getContext());
                    aVar4.setId(num.intValue());
                    b bVar3 = aVar3.f8048e;
                    int[] iArr2 = bVar3.f8124k0;
                    if (iArr2 != null) {
                        aVar4.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f8126l0;
                        if (str2 != null) {
                            bVar3.f8124k0 = Z(aVar4, str2);
                            aVar4.setReferencedIds(aVar3.f8048e.f8124k0);
                        }
                    }
                    aVar4.setType(aVar3.f8048e.f8118h0);
                    aVar4.setMargin(aVar3.f8048e.f8120i0);
                    ConstraintLayout.b bVarGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    aVar4.K();
                    aVar3.i(bVarGenerateDefaultLayoutParams);
                    constraintLayout.addView(aVar4, bVarGenerateDefaultLayoutParams);
                }
                if (aVar3.f8048e.f8103a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b bVarGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar3.i(bVarGenerateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, bVarGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof androidx.constraintlayout.widget.c) {
                ((androidx.constraintlayout.widget.c) childAt2).s(constraintLayout);
            }
        }
    }

    public int t0(int i10) {
        return i0(i10).f8046c.f8173b;
    }

    public void t1(int i10, float f10) {
        i0(i10).f8049f.f8194f = f10;
    }

    public void u(int i10, ConstraintLayout.b bVar) {
        a aVar;
        if (!this.f8043h.containsKey(Integer.valueOf(i10)) || (aVar = this.f8043h.get(Integer.valueOf(i10))) == null) {
            return;
        }
        aVar.i(bVar);
    }

    public int u0(int i10) {
        return i0(i10).f8046c.f8174c;
    }

    public void u1(String str) {
        this.f8039d = str.split(",");
        int i10 = 0;
        while (true) {
            String[] strArr = this.f8039d;
            if (i10 >= strArr.length) {
                return;
            }
            strArr[i10] = strArr[i10].trim();
            i10++;
        }
    }

    public void v(ConstraintLayout constraintLayout) {
        t(constraintLayout, false);
        constraintLayout.setConstraintSet(null);
    }

    public int v0(int i10) {
        return i0(i10).f8048e.f8109d;
    }

    public void v1(String... strArr) {
        this.f8039d = strArr;
        int i10 = 0;
        while (true) {
            String[] strArr2 = this.f8039d;
            if (i10 >= strArr2.length) {
                return;
            }
            strArr2[i10] = strArr2[i10].trim();
            i10++;
        }
    }

    public boolean w0() {
        return this.f8042g;
    }

    public void w1(int i10, String str, String str2) {
        i0(i10).s(str, str2);
    }

    public void x(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10) {
        if (i13 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (i16 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (f10 <= 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (i12 == 1 || i12 == 2) {
            L(i10, 1, i11, i12, i13);
            L(i10, 2, i14, i15, i16);
            a aVar = this.f8043h.get(Integer.valueOf(i10));
            if (aVar != null) {
                aVar.f8048e.f8144y = f10;
                return;
            }
            return;
        }
        if (i12 == 6 || i12 == 7) {
            L(i10, 6, i11, i12, i13);
            L(i10, 7, i14, i15, i16);
            a aVar2 = this.f8043h.get(Integer.valueOf(i10));
            if (aVar2 != null) {
                aVar2.f8048e.f8144y = f10;
                return;
            }
            return;
        }
        L(i10, 3, i11, i12, i13);
        L(i10, 4, i14, i15, i16);
        a aVar3 = this.f8043h.get(Integer.valueOf(i10));
        if (aVar3 != null) {
            aVar3.f8048e.f8145z = f10;
        }
    }

    public boolean x0() {
        return this.f8036a;
    }

    public void x1(int i10, float f10, float f11) {
        e eVar = i0(i10).f8049f;
        eVar.f8196h = f11;
        eVar.f8195g = f10;
    }

    public void y(int i10, int i11) {
        if (i11 == 0) {
            x(i10, 0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            x(i10, i11, 2, 0, i11, 1, 0, 0.5f);
        }
    }

    public void y0(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    a aVarH0 = h0(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarH0.f8048e.f8103a = true;
                    }
                    this.f8043h.put(Integer.valueOf(aVarH0.f8044a), aVarH0);
                }
            }
        } catch (IOException e10) {
            Log.e("ConstraintSet", "Error parsing resource: " + i10, e10);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintSet", "Error parsing resource: " + i10, e11);
        }
    }

    public void y1(int i10, float f10) {
        i0(i10).f8049f.f8195g = f10;
    }

    public void z(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10) {
        L(i10, 1, i11, i12, i13);
        L(i10, 2, i14, i15, i16);
        a aVar = this.f8043h.get(Integer.valueOf(i10));
        if (aVar != null) {
            aVar.f8048e.f8144y = f10;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void z0(Context context, XmlPullParser xmlPullParser) {
        try {
            int eventType = xmlPullParser.getEventType();
            a aVarH0 = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -2025855158:
                            if (!name.equals("Layout")) {
                                continue;
                            } else {
                                if (aVarH0 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarH0.f8048e.c(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -1984451626:
                            if (!name.equals("Motion")) {
                                continue;
                            } else {
                                if (aVarH0 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarH0.f8047d.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -1962203927:
                            if (!name.equals(androidx.constraintlayout.motion.widget.f.A)) {
                                continue;
                            } else {
                                aVarH0 = h0(context, Xml.asAttributeSet(xmlPullParser), true);
                            }
                            break;
                        case -1269513683:
                            if (!name.equals("PropertySet")) {
                                continue;
                            } else {
                                if (aVarH0 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarH0.f8046c.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -1238332596:
                            if (!name.equals("Transform")) {
                                continue;
                            } else {
                                if (aVarH0 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarH0.f8049f.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -71750448:
                            if (!name.equals("Guideline")) {
                                continue;
                            } else {
                                aVarH0 = h0(context, Xml.asAttributeSet(xmlPullParser), false);
                                b bVar = aVarH0.f8048e;
                                bVar.f8103a = true;
                                bVar.f8105b = true;
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                continue;
                            }
                            break;
                        case 1331510167:
                            if (!name.equals("Barrier")) {
                                continue;
                            } else {
                                aVarH0 = h0(context, Xml.asAttributeSet(xmlPullParser), false);
                                aVarH0.f8048e.f8122j0 = 1;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                continue;
                            }
                            break;
                        case 1803088381:
                            if (!name.equals("Constraint")) {
                                continue;
                            } else {
                                aVarH0 = h0(context, Xml.asAttributeSet(xmlPullParser), false);
                            }
                            break;
                        default:
                            continue;
                    }
                    if (aVarH0 == null) {
                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                    }
                    androidx.constraintlayout.widget.b.q(context, xmlPullParser, aVarH0.f8050g);
                } else if (eventType == 3) {
                    String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (!lowerCase.equals("guideline")) {
                                break;
                            }
                            break;
                        case -190376483:
                            if (!lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (!lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (!lowerCase.equals("constraintset")) {
                                continue;
                            } else {
                                return;
                            }
                            break;
                        default:
                            continue;
                    }
                    this.f8043h.put(Integer.valueOf(aVarH0.f8044a), aVarH0);
                    aVarH0 = null;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e10) {
            Log.e("ConstraintSet", "Error parsing XML resource", e10);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintSet", "Error parsing XML resource", e11);
        }
    }

    public void z1(int i10, float f10) {
        i0(i10).f8049f.f8196h = f10;
    }
}
