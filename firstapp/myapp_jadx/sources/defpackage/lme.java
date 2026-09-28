package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class lme {
    public static final lme a;
    public static final lme b;
    public static final lme c;
    public static final lme d;
    public static final /* synthetic */ lme[] e;

    static {
        lme lmeVar = new lme("NONE", 0);
        a = lmeVar;
        lme lmeVar2 = new lme("LEFT1", 1);
        b = lmeVar2;
        lme lmeVar3 = new lme("RIGHT", 2);
        c = lmeVar3;
        lme lmeVar4 = new lme("LEFT2", 3);
        d = lmeVar4;
        e = new lme[]{lmeVar, lmeVar2, lmeVar3, lmeVar4};
    }

    public lme() {
        throw null;
    }

    public static lme valueOf(String str) {
        return (lme) Enum.valueOf(lme.class, str);
    }

    public static lme[] values() {
        return (lme[]) e.clone();
    }
}
