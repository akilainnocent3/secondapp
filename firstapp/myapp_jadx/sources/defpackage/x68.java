package defpackage;

import com.google.android.gms.common.annotation.LjLk.llGRV;
import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;

/* JADX INFO: loaded from: classes.dex */
public final class x68 {
    public static final float[] a;
    public static final float[] b;
    public static final prg0 c;
    public static final prg0 d;
    public static final ws50 e;
    public static final ws50 f;
    public static final ws50 g;
    public static final ws50 h;
    public static final ws50 i;
    public static final ws50 j;
    public static final ws50 k;
    public static final ws50 l;
    public static final ws50 m;
    public static final ws50 n;
    public static final ws50 o;
    public static final ws50 p;
    public static final ws50 q;
    public static final ws50 r;
    public static final r8k0 s;
    public static final llr t;
    public static final ws50 u;
    public static final ws50 v;
    public static final ws50 w;
    public static final umy x;
    public static final h68[] y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        prg0 prg0Var = new prg0(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        prg0 prg0Var2 = new prg0(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        prg0 prg0Var3 = new prg0(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = prg0Var3;
        prg0 prg0Var4 = new prg0(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = prg0Var4;
        r6j0 r6j0Var = s7n.d;
        ws50 ws50Var = new ws50("sRGB IEC61966-2.1", fArr, r6j0Var, prg0Var, 0);
        e = ws50Var;
        ws50 ws50Var2 = new ws50("sRGB IEC61966-2.1 (Linear)", fArr, r6j0Var, 1.0d, 0.0f, 1.0f, 1);
        f = ws50Var2;
        ws50 ws50Var3 = new ws50("scRGB-nl IEC 61966-2-2:2003", fArr, r6j0Var, null, new r68(), new s68(), -0.799f, 2.399f, prg0Var, 2);
        g = ws50Var3;
        ws50 ws50Var4 = new ws50("scRGB IEC 61966-2-2:2003", fArr, r6j0Var, 1.0d, -0.5f, 7.499f, 3);
        h = ws50Var4;
        ws50 ws50Var5 = new ws50("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, r6j0Var, new prg0(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = ws50Var5;
        ws50 ws50Var6 = new ws50("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, r6j0Var, new prg0(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = ws50Var6;
        ws50 ws50Var7 = new ws50("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new r6j0(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = ws50Var7;
        ws50 ws50Var8 = new ws50("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, r6j0Var, prg0Var, 7);
        l = ws50Var8;
        ws50 ws50Var9 = new ws50("NTSC (1953)", fArr2, s7n.a, new prg0(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        m = ws50Var9;
        ws50 ws50Var10 = new ws50(llGRV.lAhCkJUQEK, new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, r6j0Var, new prg0(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        n = ws50Var10;
        ws50 ws50Var11 = new ws50("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, r6j0Var, 2.2d, 0.0f, 1.0f, 10);
        o = ws50Var11;
        ws50 ws50Var12 = new ws50("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, s7n.b, new prg0(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = ws50Var12;
        r6j0 r6j0Var2 = s7n.c;
        ws50 ws50Var13 = new ws50("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, r6j0Var2, 1.0d, -65504.0f, 65504.0f, 12);
        q = ws50Var13;
        ws50 ws50Var14 = new ws50("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, r6j0Var2, 1.0d, -65504.0f, 65504.0f, 13);
        r = ws50Var14;
        r8k0 r8k0Var = new r8k0("Generic XYZ", 12884901889L, 14);
        s = r8k0Var;
        llr llrVar = new llr("Generic L*a*b*", 12884901890L, 15);
        t = llrVar;
        ws50 ws50Var15 = new ws50("None", fArr, r6j0Var, prg0Var2, 16);
        u = ws50Var15;
        ws50 ws50Var16 = new ws50(yFmFZvuWxAYfEj.zxecgkNxzhxCtC, fArr3, r6j0Var, null, new t68(), new u68(), 0.0f, 1.0f, prg0Var3, 17);
        v = ws50Var16;
        ws50 ws50Var17 = new ws50("Perceptual Quantizer encoding", fArr3, r6j0Var, null, new v68(), new w68(), 0.0f, 1.0f, prg0Var4, 18);
        w = ws50Var17;
        umy umyVar = new umy("Oklab", 12884901890L, 19);
        x = umyVar;
        y = new h68[]{ws50Var, ws50Var2, ws50Var3, ws50Var4, ws50Var5, ws50Var6, ws50Var7, ws50Var8, ws50Var9, ws50Var10, ws50Var11, ws50Var12, ws50Var13, ws50Var14, r8k0Var, llrVar, ws50Var15, ws50Var16, ws50Var17, umyVar};
    }

    public static double a(prg0 prg0Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = prg0Var.b;
        double d6 = prg0Var.c;
        double d7 = prg0Var.d;
        double d8 = prg0Var.e;
        double d9 = prg0Var.f;
        double d10 = d5 * d4;
        return (prg0Var.g + 1.0d) * d3 * (d10 <= 1.0d ? Math.pow(d10, d6) : Math.exp((d4 - d9) * d7) + d8);
    }

    public static double b(prg0 prg0Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = 1.0d / prg0Var.b;
        double d5 = 1.0d / prg0Var.c;
        double d6 = 1.0d / prg0Var.d;
        double d7 = prg0Var.e;
        double d8 = prg0Var.f;
        double d9 = (d2 * d3) / (prg0Var.g + 1.0d);
        return d3 * (d9 <= 1.0d ? Math.pow(d9, d5) * d4 : (Math.log(d9 - d7) * d6) + d8);
    }

    public static double c(prg0 prg0Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = prg0Var.b;
        double d6 = prg0Var.d;
        double dPow = (Math.pow(d4, d6) * prg0Var.c) + d5;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d4, d6) * prg0Var.f) + prg0Var.e), prg0Var.g) * d3;
    }

    public static double d(prg0 prg0Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = -prg0Var.b;
        double d6 = prg0Var.e;
        double d7 = 1.0d / prg0Var.g;
        return Math.pow(Math.max((Math.pow(d4, d7) * d6) + d5, 0.0d) / ((Math.pow(d4, d7) * (-prg0Var.f)) + prg0Var.c), 1.0d / prg0Var.d) * d3;
    }
}
