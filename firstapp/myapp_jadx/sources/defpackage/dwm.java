package defpackage;

import com.sportybet.core.injection.opentelemetry.PageMeta;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldwm;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dwm extends j8i0 {
    public final lwm a;
    public final t47 b;
    public final rx20 c;
    public final rdd0 d;
    public final mgb0 e;
    public final wwd0 f;
    public final wwd0 i;

    public dwm(lwm lwmVar, t47 t47Var, rx20 rx20Var, rdd0 rdd0Var, mgb0 mgb0Var) {
        lwmVar.getClass();
        rdd0Var.getClass();
        mgb0Var.getClass();
        this.a = lwmVar;
        this.b = t47Var;
        this.c = rx20Var;
        this.d = rdd0Var;
        this.e = mgb0Var;
        Boolean bool = Boolean.FALSE;
        this.f = xwd0.a(bool);
        this.i = xwd0.a(bool);
    }

    public static void y1(dwm dwmVar, String str, Integer num, Throwable th, int i) {
        Integer num2 = (i & 2) != 0 ? null : num;
        if ((i & 4) != 0) {
            th = null;
        }
        dwmVar.getClass();
        mit mitVarA = th != null ? oit.a(th) : null;
        rdd0 rdd0Var = dwmVar.d;
        String str2 = mitVarA != null ? mitVarA.a : null;
        String str3 = mitVarA != null ? mitVarA.b : null;
        PageMeta.INSTANCE.getClass();
        rdd0Var.a(new xit(str, "password", num2, str2, str3, new PageMeta("int_login", null)), k00.d);
    }

    public final r5b x1(String str, String str2) {
        str.getClass();
        str2.getClass();
        return i2i.c(new yzh(new xzh(new zvm(this.a.m(str, this.c.a(str2))), new awm(2, null)), new bwm(this, null)), o8i0.d(this).a, 2);
    }
}
