package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class asr {
    public static final asr a;
    public static final asr b;
    public static final /* synthetic */ asr[] c;

    static {
        asr asrVar = new asr("Ltr", 0);
        a = asrVar;
        asr asrVar2 = new asr("Rtl", 1);
        b = asrVar2;
        c = new asr[]{asrVar, asrVar2};
    }

    public asr() {
        throw null;
    }

    public static asr valueOf(String str) {
        return (asr) Enum.valueOf(asr.class, str);
    }

    public static asr[] values() {
        return (asr[]) c.clone();
    }
}
