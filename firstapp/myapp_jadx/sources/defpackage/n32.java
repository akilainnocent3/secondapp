package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class n32 extends j8i0 {
    public final f4x a;
    public final h4x b;
    public final azm c;
    public final ku90<String> d;
    public final t340 e;
    public final wwd0 f;
    public final lyh<kqz<j3x>> i;

    public n32(f4x f4xVar, k3x k3xVar, t3x t3xVar, odd oddVar, h4x h4xVar, azm azmVar) {
        t3xVar.getClass();
        h4xVar.getClass();
        azmVar.getClass();
        this.a = f4xVar;
        this.b = h4xVar;
        this.c = azmVar;
        ku90<String> ku90Var = new ku90<>();
        this.d = ku90Var;
        this.e = e1i.a(ku90Var);
        wwd0 wwd0VarA = xwd0.a(new LinkedHashMap());
        this.f = wwd0VarA;
        this.i = ozh.c(new n1i(rs5.a(ozh.c(new m32(t3xVar.a(f4xVar, k3xVar), this), oddVar), o8i0.d(this)), wwd0VarA, new l32(3, null)), oddVar);
    }
}
