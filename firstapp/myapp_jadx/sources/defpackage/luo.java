package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class luo {
    public static final luo a;
    public static final luo b;
    public static final luo c;
    public static final /* synthetic */ luo[] d;

    static {
        luo luoVar = new luo("GONE", 0);
        a = luoVar;
        luo luoVar2 = new luo("VISIBLE_DISABLE", 1);
        b = luoVar2;
        luo luoVar3 = new luo("VISIBLE_ENABLE", 2);
        c = luoVar3;
        d = new luo[]{luoVar, luoVar2, luoVar3};
    }

    public luo() {
        throw null;
    }

    public static luo valueOf(String str) {
        return (luo) Enum.valueOf(luo.class, str);
    }

    public static luo[] values() {
        return (luo[]) d.clone();
    }
}
