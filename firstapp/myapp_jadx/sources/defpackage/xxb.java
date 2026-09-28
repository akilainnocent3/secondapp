package defpackage;

import com.sportybet.android.instantwin.newtork.model.error.ErrorBody;
import kotlin.text.StringsKt;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes5.dex */
public final class xxb {
    public final wwd0 a = xwd0.a(zs.a.a);
    public final wwd0 b = xwd0.a(null);

    public final void a() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.b;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, null));
    }

    public final wwd0 b() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    public final void c(String str, Throwable th) {
        wwd0 wwd0Var;
        Object value;
        Object hVar;
        Object bVar;
        ResponseBody responseBody;
        str.getClass();
        th.getClass();
        do {
            wwd0Var = this.b;
            value = wwd0Var.getValue();
            if (th instanceof tom) {
                bi50<?> bi50Var = ((tom) th).c;
                String strA = (bi50Var == null || (responseBody = bi50Var.c) == null) ? null : ci50.a(responseBody);
                if (strA == null || StringsKt.U(strA)) {
                    hVar = new uxb.h(str);
                } else {
                    try {
                        zi50.a aVar = zi50.b;
                        bVar = (ErrorBody) new eal().e(strA, ErrorBody.class);
                    } catch (Throwable th2) {
                        zi50.a aVar2 = zi50.b;
                        bVar = new zi50.b(th2);
                    }
                    if (zi50.a(bVar) == null) {
                        ErrorBody errorBody = (ErrorBody) bVar;
                        int errorCode = errorBody.getErrorCode();
                        if (errorCode == 19000) {
                            hVar = new uxb.f(str);
                        } else if (errorCode == 19106) {
                            hVar = new uxb.g(str);
                        } else if (errorCode == 19110) {
                            hVar = new uxb.a(str);
                        } else if (errorCode == 19400) {
                            hVar = yxb.a(errorCode, str, errorBody.getCauseMessage());
                        } else if (errorCode == 19101) {
                            hVar = new uxb.i(str);
                        } else if (errorCode == 19102) {
                            hVar = new uxb.e(str);
                        } else if (errorCode == 19201) {
                            hVar = new uxb.c(str);
                        } else if (errorCode != 19202) {
                            hVar = new uxb.h(str);
                        } else {
                            hVar = yxb.a(errorCode, str, errorBody.getCauseMessage());
                        }
                    } else {
                        hVar = new uxb.h(str);
                    }
                }
            } else {
                hVar = new uxb.h(str);
            }
        } while (!wwd0Var.g(value, hVar));
    }

    public final void d(et7 et7Var) {
        kzh.d(new g1i(new vxb(this.b, this), new wxb(this, null)), et7Var);
    }
}
