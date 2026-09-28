package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class x7z {
    public static final x7z a;
    public static final x7z b;
    public static final /* synthetic */ x7z[] c;

    static {
        x7z x7zVar = new x7z("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        a = x7zVar;
        x7z x7zVar2 = new x7z("DROP_WORK_REQUEST", 1);
        b = x7zVar2;
        c = new x7z[]{x7zVar, x7zVar2};
    }

    public x7z() {
        throw null;
    }

    public static x7z valueOf(String str) {
        return (x7z) Enum.valueOf(x7z.class, str);
    }

    public static x7z[] values() {
        return (x7z[]) c.clone();
    }
}
