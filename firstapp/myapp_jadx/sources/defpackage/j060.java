package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j060 {
    public static final i060 a = b(50);

    public static final i060 a(float f) {
        xa30 xa30Var = new xa30(f);
        return new i060(xa30Var, xa30Var, xa30Var, xa30Var);
    }

    public static final i060 b(int i) {
        md00 md00Var = new md00(i);
        return new i060(md00Var, md00Var, md00Var, md00Var);
    }

    public static final i060 c(float f) {
        h7f h7fVar = new h7f(f);
        return new i060(h7fVar, h7fVar, h7fVar, h7fVar);
    }

    public static final i060 d(float f, float f2, float f3, float f4) {
        return new i060(new h7f(f), new h7f(f2), new h7f(f3), new h7f(f4));
    }

    public static i060 e(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return d(f, f2, f3, f4);
    }
}
