package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class tlq {
    public static final tlq a;
    public static final tlq b;
    public static final tlq c;
    public static final /* synthetic */ tlq[] d;

    static {
        tlq tlqVar = new tlq("End", 0);
        a = tlqVar;
        tlq tlqVar2 = new tlq("HasNext", 1);
        b = tlqVar2;
        tlq tlqVar3 = new tlq("Error", 2);
        c = tlqVar3;
        d = new tlq[]{tlqVar, tlqVar2, tlqVar3};
    }

    public tlq() {
        throw null;
    }

    public static tlq valueOf(String str) {
        return (tlq) Enum.valueOf(tlq.class, str);
    }

    public static tlq[] values() {
        return (tlq[]) d.clone();
    }
}
