package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class i3z {
    public static final i3z a;
    public static final i3z b;
    public static final /* synthetic */ i3z[] c;

    static {
        i3z i3zVar = new i3z("Vertical", 0);
        a = i3zVar;
        i3z i3zVar2 = new i3z("Horizontal", 1);
        b = i3zVar2;
        c = new i3z[]{i3zVar, i3zVar2};
    }

    public i3z() {
        throw null;
    }

    public static i3z valueOf(String str) {
        return (i3z) Enum.valueOf(i3z.class, str);
    }

    public static i3z[] values() {
        return (i3z[]) c.clone();
    }
}
