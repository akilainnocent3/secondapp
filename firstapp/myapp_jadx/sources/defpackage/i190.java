package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class i190 {
    public static final i190 a;
    public static final i190 b;
    public static final /* synthetic */ i190[] c;

    static {
        i190 i190Var = new i190("WON_POPUP", 0);
        a = i190Var;
        i190 i190Var2 = new i190("TICKET_DETAIL", 1);
        b = i190Var2;
        c = new i190[]{i190Var, i190Var2, new i190("COMMENT_SHARE_BET", 2)};
    }

    public i190() {
        throw null;
    }

    public static i190 valueOf(String str) {
        return (i190) Enum.valueOf(i190.class, str);
    }

    public static i190[] values() {
        return (i190[]) c.clone();
    }
}
