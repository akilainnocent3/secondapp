package yads;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class jq1 {
    public static ih2 a(String str, Exception exc) {
        zg2 zg2Var;
        if (exc instanceof jv.y3) {
            zg2Var = zg2.f158807d;
        } else if (exc instanceof IllegalArgumentException) {
            zg2Var = zg2.f158808e;
        } else {
            zg2Var = exc instanceof NoSuchElementException ? zg2.f158809f : zg2.f158810g;
        }
        boolean z10 = ad1.f146762a;
        return jh2.a(str, zg2Var.b(), Integer.valueOf(zg2Var.a()));
    }

    public static ih2 a(String str) {
        zg2 zg2Var = zg2.f158809f;
        boolean z10 = ad1.f146762a;
        return jh2.a(str, zg2Var.b(), Integer.valueOf(zg2Var.a()));
    }

    public static ih2 a() {
        zg2.f158809f.b();
        boolean z10 = ad1.f146762a;
        return jh2.a();
    }
}
