package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class gsp {
    public static final gsp a;
    public static final gsp b;
    public static final gsp c;
    public static final gsp d;
    public static final /* synthetic */ gsp[] e;

    static {
        gsp gspVar = new gsp("COMMON_CONFIRM_NAME", 0);
        a = gspVar;
        gsp gspVar2 = new gsp("CONFIRM_ACCOUNT_INFO", 1);
        b = gspVar2;
        gsp gspVar3 = new gsp("ZA_AGENT", 2);
        c = gspVar3;
        gsp gspVar4 = new gsp("KYC_WEBVIEW", 3);
        d = gspVar4;
        e = new gsp[]{gspVar, gspVar2, gspVar3, gspVar4};
    }

    public gsp() {
        throw null;
    }

    public static gsp valueOf(String str) {
        return (gsp) Enum.valueOf(gsp.class, str);
    }

    public static gsp[] values() {
        return (gsp[]) e.clone();
    }
}
