package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class udv {
    public static final /* synthetic */ udv[] a = {new udv("NONE", 0), new udv("TOP", 1), new udv("BOTTOM", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    udv EF5;

    public udv() {
        throw null;
    }

    public static udv valueOf(String str) {
        return (udv) Enum.valueOf(udv.class, str);
    }

    public static udv[] values() {
        return (udv[]) a.clone();
    }
}
