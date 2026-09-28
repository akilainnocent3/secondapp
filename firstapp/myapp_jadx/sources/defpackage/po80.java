package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class po80<T> {
    public final xa50 a;
    public final Object b;
    public ea50<T> c;
    public final lo80 d;
    public hb50 e;
    public wa50<T> f;

    public po80(xa50 xa50Var, Object obj, ea50<T> ea50Var, lo80 lo80Var) {
        xa50Var.getClass();
        ea50Var.getClass();
        this.a = xa50Var;
        this.b = obj;
        this.c = ea50Var;
        this.d = lo80Var;
        this.e = new hb50();
    }

    public final void a(hb50 hb50Var) {
        hb50Var.getClass();
        this.e = this.e.a(hb50Var).clone();
        ea50<T> ea50VarA = this.c.a(hb50Var);
        ea50VarA.getClass();
        this.c = ea50VarA;
    }

    public final ea50<T> b() {
        ea50<T> ea50VarJ;
        String strD;
        ea50<Drawable> ea50VarP;
        try {
            zi50.a aVar = zi50.b;
            Object obj = this.b;
            if (obj instanceof String) {
                strD = (String) obj;
            } else if (obj instanceof Uri) {
                strD = ((Uri) obj).toString();
            } else {
                strD = obj instanceof d0l ? ((d0l) obj).d() : null;
            }
            if (strD == null || StringsKt.U(strD)) {
                ea50VarJ = this.c;
            } else {
                x8n.a.getClass();
                if (x8n.a() && x8n.c(strD) && x8n.b(strD)) {
                    String strE = x8n.e(strD);
                    if (strE.equals(strD)) {
                        ea50VarJ = this.c;
                    } else {
                        hb50 hb50VarV = this.e.clone().v(new acy(x8n.d(strD)));
                        hb50VarV.getClass();
                        hb50 hb50Var = hb50VarV;
                        wa50<T> wa50Var = this.f;
                        no80 no80Var = new no80(wa50Var, new oo80());
                        no80 no80Var2 = new no80(wa50Var, new oo80());
                        int iOrdinal = this.d.ordinal();
                        xa50 xa50Var = this.a;
                        if (iOrdinal == 0) {
                            ea50VarP = xa50Var.p(strE);
                            ea50VarP.getClass();
                        } else if (iOrdinal == 1) {
                            ea50VarP = xa50Var.f(thk.class).a(xa50.A).P(strE);
                            ea50VarP.getClass();
                        } else {
                            if (iOrdinal != 2) {
                                throw new uwx();
                            }
                            ea50VarP = xa50Var.k().P(strE);
                            ea50VarP.getClass();
                        }
                        ea50<Drawable> ea50VarN = ea50VarP.a(hb50Var).N(no80Var2);
                        ea50VarN.getClass();
                        ea50VarJ = this.c.a(hb50Var).N(no80Var).J(ea50VarN);
                        ea50VarJ.getClass();
                    }
                } else {
                    ea50VarJ = this.c;
                }
            }
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            ea50VarJ = (ea50<T>) new zi50.b(th);
        }
        if (zi50.a(ea50VarJ) != null) {
            ea50VarJ = this.c;
        }
        return ea50VarJ;
    }

    public final void c(hre hreVar) {
        hreVar.getClass();
        hb50 hb50VarE = new hb50().e(hreVar);
        hb50VarE.getClass();
        a(hb50VarE);
    }

    public final void d() {
        hb50 hb50VarF = new hb50().f();
        hb50VarF.getClass();
        a(hb50VarF);
    }

    public final void e(ImageView imageView) {
        imageView.getClass();
        b().M(imageView);
    }

    public final void f(int i) {
        hb50 hb50VarO = new hb50().o(i);
        hb50VarO.getClass();
        a(hb50VarO);
    }

    public final void g(Drawable drawable) {
        hb50 hb50VarP = new hb50().p(drawable);
        hb50VarP.getClass();
        a(hb50VarP);
    }

    public final void h() {
        hb50 hb50VarX = new hb50().x(true);
        hb50VarX.getClass();
        a(hb50VarX);
    }
}
