package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class x3z {
    public static final /* synthetic */ x3z[] a = {new x3z("TITLE", 0), new x3z("SUB_TITLE", 1), new x3z("CONTENT_DIRECT_BANK", 2), new x3z("CONTENT_QUICKTELLER", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    x3z EF5;

    public x3z() {
        throw null;
    }

    public static x3z valueOf(String str) {
        return (x3z) Enum.valueOf(x3z.class, str);
    }

    public static x3z[] values() {
        return (x3z[]) a.clone();
    }
}
