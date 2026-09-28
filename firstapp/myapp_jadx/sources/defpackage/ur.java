package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class ur {
    public static final /* synthetic */ ur[] a = {new ur("DELTA", 0), new ur("CUMULATIVE", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    ur EF5;

    public ur() {
        throw null;
    }

    public static ur valueOf(String str) {
        return (ur) Enum.valueOf(ur.class, str);
    }

    public static ur[] values() {
        return (ur[]) a.clone();
    }
}
