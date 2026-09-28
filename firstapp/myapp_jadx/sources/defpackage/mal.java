package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class mal {
    public static final mal a;
    public static final mal b;
    public static final mal c;
    public static final /* synthetic */ mal[] d;

    static {
        mal malVar = new mal("WEBSITE", 0);
        a = malVar;
        mal malVar2 = new mal("MOBILE", 1);
        b = malVar2;
        mal malVar3 = new mal("USSD", 2);
        c = malVar3;
        d = new mal[]{malVar, malVar2, malVar3};
    }

    public mal() {
        throw null;
    }

    public static mal valueOf(String str) {
        return (mal) Enum.valueOf(mal.class, str);
    }

    public static mal[] values() {
        return (mal[]) d.clone();
    }
}
