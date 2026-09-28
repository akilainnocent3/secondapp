package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zti {
    public static final zti d = new zti("", "", false);
    public static final zti e = new zti("\n", "  ", true);
    public final String a;
    public final String b;
    public final boolean c;

    public zti(String str, String str2, boolean z) {
        if (!str.matches("[\r\n]*")) {
            hb5.a("Only combinations of \\n and \\r are allowed in newline.");
            throw null;
        }
        if (!str2.matches("[ \t]*")) {
            hb5.a("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
