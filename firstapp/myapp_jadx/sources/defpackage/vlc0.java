package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class vlc0 {
    public static final a a;
    public static final vlc0 b;
    public static final vlc0 c;
    public static final vlc0 d;
    public static final /* synthetic */ vlc0[] e;

    public static final class a {
    }

    static {
        vlc0 vlc0Var = new vlc0("RUNNING_PAGE", 0);
        c = vlc0Var;
        vlc0 vlc0Var2 = new vlc0("BET_RESULT", 1);
        d = vlc0Var2;
        e = new vlc0[]{vlc0Var, vlc0Var2};
        a = new a();
        b = vlc0Var;
    }

    public vlc0() {
        throw null;
    }

    public static vlc0 valueOf(String str) {
        return (vlc0) Enum.valueOf(vlc0.class, str);
    }

    public static vlc0[] values() {
        return (vlc0[]) e.clone();
    }
}
