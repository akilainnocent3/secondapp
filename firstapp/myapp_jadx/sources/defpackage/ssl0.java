package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ssl0 extends jok0 {
    public final a7l0 c;

    public ssl0(a7l0 a7l0Var) {
        super("internal.appMetadata");
        this.c = a7l0Var;
    }

    @Override // defpackage.jok0
    public final ipk0 g(g3l0 g3l0Var, List list) {
        try {
            return b8l0.a(this.c.call());
        } catch (Exception unused) {
            return ipk0.o;
        }
    }
}
