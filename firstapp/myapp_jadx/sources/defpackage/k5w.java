package defpackage;

import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes8.dex */
public final class k5w<T> implements y2b<ResponseBody, T> {
    public static final rl5 b;
    public final ybp<T> a;

    static {
        rl5 rl5Var = rl5.d;
        b = rl5.a.b("EFBBBF");
    }

    public k5w(ybp<T> ybpVar) {
        this.a = ybpVar;
    }

    @Override // defpackage.y2b
    public final Object convert(ResponseBody responseBody) {
        ResponseBody responseBody2 = responseBody;
        cc5 d = responseBody2.getD();
        try {
            rl5 rl5Var = b;
            if (d.y(0L, rl5Var)) {
                d.skip(rl5Var.a.length);
            }
            gfp gfpVar = new gfp(d);
            T tA = this.a.a(gfpVar);
            if (gfpVar.J() != jep.b.y) {
                throw new lcp("JSON document was not fully consumed.");
            }
            responseBody2.close();
            return tA;
        } catch (Throwable th) {
            responseBody2.close();
            throw th;
        }
    }
}
