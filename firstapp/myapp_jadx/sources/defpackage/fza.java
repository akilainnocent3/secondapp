package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class fza {
    public static final fza a;
    public static final fza b;
    public static final /* synthetic */ fza[] c;

    static {
        fza fzaVar = new fza("VIEW_APPEAR", 0);
        a = fzaVar;
        fza fzaVar2 = new fza("VIEW_DISAPPEAR", 1);
        b = fzaVar2;
        c = new fza[]{fzaVar, fzaVar2};
    }

    public fza() {
        throw null;
    }

    public static fza valueOf(String str) {
        return (fza) Enum.valueOf(fza.class, str);
    }

    public static fza[] values() {
        return (fza[]) c.clone();
    }
}
