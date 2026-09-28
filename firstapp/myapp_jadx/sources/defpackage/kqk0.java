package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class kqk0 {
    public final ArrayList a = new ArrayList();

    public abstract ipk0 a(String str, g3l0 g3l0Var, ArrayList arrayList);

    public final void b(String str) {
        if (!this.a.contains(r5l0.e(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}
