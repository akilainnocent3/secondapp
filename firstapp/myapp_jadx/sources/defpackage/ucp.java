package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class ucp {
    public static final skn a;

    static {
        hj5.b(k9e0.a);
        a = lk9.a("kotlinx.serialization.json.JsonUnquotedLiteral", gae0.a);
    }

    public static final bep a(Number number) {
        return new ndp(number, false, null);
    }

    public static final bep b(String str) {
        return str == null ? sdp.INSTANCE : new ndp(str, true, null);
    }

    public static final void c(scp scpVar, String str) {
        throw new IllegalArgumentException("Element " + jq40.a(scpVar.getClass()) + " is not a " + str);
    }

    public static final bep d(scp scpVar) {
        scpVar.getClass();
        bep bepVar = scpVar instanceof bep ? (bep) scpVar : null;
        if (bepVar != null) {
            return bepVar;
        }
        c(scpVar, "JsonPrimitive");
        throw null;
    }

    public static final long e(bep bepVar) {
        v9e0 v9e0Var = new v9e0(bepVar.b());
        long jH = v9e0Var.h();
        if (v9e0Var.e() == 10) {
            return jH;
        }
        int i = v9e0Var.a;
        int i2 = i - 1;
        String str = v9e0Var.e;
        v9e0.l(v9e0Var, tug.a("Expected input to contain a single valid number, but got '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' after it"), i2, null, 4);
        throw null;
    }
}
