package defpackage;

import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public abstract class oug0 {
    public abstract String a();

    public abstract byte[] b();

    public abstract kw20 c();

    public final ml1 d(kw20 kw20Var) {
        String strA = a();
        if (strA == null) {
            bmy.a("Null backendName");
            return null;
        }
        if (kw20Var != null) {
            return new ml1(strA, b(), kw20Var);
        }
        bmy.a("Null priority");
        return null;
    }

    public final String toString() {
        String strA = a();
        kw20 kw20VarC = c();
        String strEncodeToString = b() == null ? "" : Base64.encodeToString(b(), 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(strA);
        sb.append(", ");
        sb.append(kw20VarC);
        sb.append(", ");
        return uf80.a(sb, strEncodeToString, ")");
    }
}
