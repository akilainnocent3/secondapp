package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class zkq {
    public static final zkq a;
    public static final zkq b;
    public static final zkq c;
    public static final /* synthetic */ zkq[] d;

    static {
        zkq zkqVar = new zkq("HOT", 0);
        a = zkqVar;
        zkq zkqVar2 = new zkq("COLD", 1);
        b = zkqVar2;
        zkq zkqVar3 = new zkq("NORMAL", 2);
        c = zkqVar3;
        d = new zkq[]{zkqVar, zkqVar2, zkqVar3};
    }

    public zkq() {
        throw null;
    }

    public static zkq valueOf(String str) {
        return (zkq) Enum.valueOf(zkq.class, str);
    }

    public static zkq[] values() {
        return (zkq[]) d.clone();
    }
}
