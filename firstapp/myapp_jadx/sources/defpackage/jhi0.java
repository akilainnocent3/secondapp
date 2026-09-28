package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jhi0 {
    public static final /* synthetic */ jhi0[] a = {new jhi0("ALL", 0), new jhi0("NON_LOGIN_USER", 1), new jhi0("LOGIN_USER", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    jhi0 EF5;

    public static jhi0 valueOf(String str) {
        return (jhi0) Enum.valueOf(jhi0.class, str);
    }

    public static jhi0[] values() {
        return (jhi0[]) a.clone();
    }
}
