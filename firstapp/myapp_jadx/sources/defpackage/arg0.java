package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class arg0 {
    public static final /* synthetic */ arg0[] a = {new arg0("DEPOSIT", 0), new arg0("WITHDRAWAL", 1), new arg0("BET", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    arg0 EF5;

    public static arg0 valueOf(String str) {
        return (arg0) Enum.valueOf(arg0.class, str);
    }

    public static arg0[] values() {
        return (arg0[]) a.clone();
    }
}
