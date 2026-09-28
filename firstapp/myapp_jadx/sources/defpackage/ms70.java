package defpackage;

import java.util.function.Consumer;

/* JADX INFO: loaded from: classes8.dex */
public class ms70 implements xjt {
    public final jso a;

    public ms70(qs70 qs70Var, String str, String str2, String str3, fg1.a aVar) {
        jso jsoVar = new jso(str, lso.f, mso.a, qs70Var);
        jsoVar.f = str2;
        jsoVar.g = str3;
        jsoVar.e = aVar;
        this.a = jsoVar;
    }

    @Override // defpackage.xjt
    public final qdy c(Consumer<rdy> consumer) {
        return this.a.a(lso.e, consumer);
    }

    @Override // defpackage.xjt
    public final xjt d() {
        this.a.f = "The number of items queued";
        return this;
    }

    @Override // defpackage.xjt
    public final xjt e() {
        this.a.g = "1";
        return this;
    }

    public final String toString() {
        return this.a.d(getClass().getSimpleName());
    }
}
