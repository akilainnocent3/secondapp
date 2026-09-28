package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class uuy {
    public static final uuy a;
    public static final uuy b;
    public static final /* synthetic */ uuy[] c;

    static {
        uuy uuyVar = new uuy("LIVE", 0);
        a = uuyVar;
        uuy uuyVar2 = new uuy("PRE_MATCH", 1);
        b = uuyVar2;
        c = new uuy[]{uuyVar, uuyVar2};
    }

    public uuy() {
        throw null;
    }

    public static uuy valueOf(String str) {
        return (uuy) Enum.valueOf(uuy.class, str);
    }

    public static uuy[] values() {
        return (uuy[]) c.clone();
    }
}
