package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class x88 {
    public static final /* synthetic */ x88[] a = {new x88("MOST_POPULAR", 0), new x88("NEWEST", 1), new x88("SHARE_BET", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    x88 EF5;

    public static x88 valueOf(String str) {
        return (x88) Enum.valueOf(x88.class, str);
    }

    public static x88[] values() {
        return (x88[]) a.clone();
    }
}
