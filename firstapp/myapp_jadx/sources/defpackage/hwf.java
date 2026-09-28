package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class hwf {
    public static final gzg0<g7f> a;
    public static final gzg0<g7f> b;
    public static final gzg0<g7f> c;

    static {
        f4c f4cVar = new f4c(0.4f, 0.0f, 0.6f, 1.0f);
        a = new gzg0<>(120, xkf.a, 2);
        b = new gzg0<>(150, f4cVar, 2);
        c = new gzg0<>(120, f4cVar, 2);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0009 A[PHI: r1
      0x0009: PHI (r1v3 gzg0<g7f>) = 
      (r1v0 gzg0<g7f>)
      (r1v0 gzg0<g7f>)
      (r1v0 gzg0<g7f>)
      (r1v4 gzg0<g7f>)
      (r1v4 gzg0<g7f>)
      (r1v4 gzg0<g7f>)
      (r1v4 gzg0<g7f>)
     binds: [B:19:0x0022, B:22:0x0027, B:28:0x0033, B:5:0x0007, B:8:0x000d, B:11:0x0012, B:14:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public static final Object a(wd0 wd0Var, float f, xxo xxoVar, xxo xxoVar2, x1b x1bVar) {
        gzg0<g7f> gzg0Var;
        gzg0<g7f> gzg0Var2 = null;
        if (xxoVar2 != null) {
            boolean z = xxoVar2 instanceof mp20.b;
            gzg0Var = a;
            if (z || (xxoVar2 instanceof i9f.b) || (xxoVar2 instanceof vkm) || (xxoVar2 instanceof c4i)) {
                gzg0Var2 = gzg0Var;
            }
        } else if (xxoVar != null) {
            boolean z2 = xxoVar instanceof mp20.b;
            gzg0Var = b;
            if (z2 || (xxoVar instanceof i9f.b)) {
                gzg0Var2 = gzg0Var;
            } else if (xxoVar instanceof vkm) {
                gzg0Var2 = c;
            } else if (xxoVar instanceof c4i) {
                gzg0Var2 = gzg0Var;
            }
        }
        gzg0<g7f> gzg0Var3 = gzg0Var2;
        if (gzg0Var3 != null) {
            Object objA = wd0.a(wd0Var, new g7f(f), gzg0Var3, null, null, x1bVar, 12);
            return objA == y5b.a ? objA : Unit.a;
        }
        Object objF = wd0Var.f(x1bVar, new g7f(f));
        return objF == y5b.a ? objF : Unit.a;
    }
}
