package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum wr5 {
    c("ENABLED", true),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("READ_ONLY", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("WRITE_ONLY", true),
    d("DISABLED", false);

    public final boolean a;
    public final boolean b;

    wr5(String str, boolean z) {
        this.a = z;
        this.b = z;
    }
}
