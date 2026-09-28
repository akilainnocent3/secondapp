package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class sre0 {
    public static final /* synthetic */ sre0[] a = {new sre0("CAVE", 0), new sre0("CHARACTER", 1), new sre0("SYMBOL", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    sre0 EF5;

    public static sre0 valueOf(String str) {
        return (sre0) Enum.valueOf(sre0.class, str);
    }

    public static sre0[] values() {
        return (sre0[]) a.clone();
    }
}
