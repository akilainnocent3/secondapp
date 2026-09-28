package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class zjf {
    public static final zjf a;
    public static final zjf b;
    public static final /* synthetic */ zjf[] c;

    static {
        zjf zjfVar = new zjf("LIVE", 0);
        a = zjfVar;
        zjf zjfVar2 = new zjf("PRE_MATCH", 1);
        b = zjfVar2;
        c = new zjf[]{zjfVar, zjfVar2};
    }

    public zjf() {
        throw null;
    }

    public static zjf valueOf(String str) {
        return (zjf) Enum.valueOf(zjf.class, str);
    }

    public static zjf[] values() {
        return (zjf[]) c.clone();
    }
}
