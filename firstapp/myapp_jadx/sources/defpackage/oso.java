package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public abstract class oso {
    public static final /* synthetic */ int a = 0;

    static {
        a("", null, null, vw0.d);
    }

    public static ej1 a(String str, String str2, String str3, m21 m21Var) {
        Objects.requireNonNull(str, "name");
        Objects.requireNonNull(m21Var, "attributes");
        return new ej1(str, str2, str3, m21Var);
    }

    public abstract m21 b();

    public abstract String c();

    public abstract String d();

    public abstract String e();
}
