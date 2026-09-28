package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class gay {
    public static final gay a;
    public static final gay b;
    public static final /* synthetic */ gay[] c;

    static {
        gay gayVar = new gay("INCORRECT_CODE", 0);
        a = gayVar;
        gay gayVar2 = new gay("CODE_EXPIRED", 1);
        b = gayVar2;
        c = new gay[]{gayVar, gayVar2, new gay("RATE_LIMIT", 2), new gay("OTP_METHOD_DAILY_LIMIT_REACHED", 3)};
    }

    public static gay valueOf(String str) {
        return (gay) Enum.valueOf(gay.class, str);
    }

    public static gay[] values() {
        return (gay[]) c.clone();
    }
}
