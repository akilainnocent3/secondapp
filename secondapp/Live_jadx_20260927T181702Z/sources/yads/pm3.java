package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class pm3 {
    public static be3 a(im3 im3Var) {
        if (im3Var instanceof zl0) {
            return ae3.a((zl0) im3Var);
        }
        if (im3Var instanceof lb2) {
            return ae3.a();
        }
        e82 e82Var = im3Var.f150705b;
        if (e82Var == null) {
            return ae3.a(im3Var.getMessage());
        }
        int i10 = e82Var.f148571a;
        if (i10 >= 500) {
            return ae3.b();
        }
        String str = ("Network Error.  Code: " + i10 + androidx.media3.session.fe.F) + " Data: \n" + new String(e82Var.f148572b, cv.g.f77202b);
        boolean z10 = ad1.f146762a;
        return ae3.b(str);
    }
}
