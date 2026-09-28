package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class jsl0 extends jok0 {
    public final t6l0 c;

    public jsl0(t6l0 t6l0Var) {
        super("internal.logger");
        this.c = t6l0Var;
        this.b.put("log", new xrl0(this, false, true));
        this.b.put("silent", new rnl0("silent"));
        ((jok0) this.b.get("silent")).e("log", new xrl0(this, true, true));
        this.b.put("unmonitored", new npl0("unmonitored"));
        ((jok0) this.b.get("unmonitored")).e("log", new xrl0(this, false, false));
    }

    @Override // defpackage.jok0
    public final ipk0 g(g3l0 g3l0Var, List list) {
        return ipk0.o;
    }
}
