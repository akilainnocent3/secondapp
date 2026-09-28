package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class c380 {
    public static final /* synthetic */ c380[] a = {new c380("None", 0), new c380("Top", 1), new c380("Bottom", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    c380 EF5;

    public c380() {
        throw null;
    }

    public static c380 valueOf(String str) {
        return (c380) Enum.valueOf(c380.class, str);
    }

    public static c380[] values() {
        return (c380[]) a.clone();
    }
}
