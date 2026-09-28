package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class rvk {
    public static final rvk a;
    public static final rvk b;
    public static final rvk c;
    public static final rvk d;
    public static final rvk e;
    public static final rvk f;
    public static final /* synthetic */ rvk[] i;

    static {
        rvk rvkVar = new rvk("Produced", 0);
        a = rvkVar;
        rvk rvkVar2 = new rvk("Delivered", 1);
        b = rvkVar2;
        rvk rvkVar3 = new rvk("Usable", 2);
        c = rvkVar3;
        rvk rvkVar4 = new rvk("FullyUsed", 3);
        d = rvkVar4;
        rvk rvkVar5 = new rvk("Expired", 4);
        e = rvkVar5;
        rvk rvkVar6 = new rvk("Recycled", 5);
        f = rvkVar6;
        i = new rvk[]{rvkVar, rvkVar2, rvkVar3, rvkVar4, rvkVar5, rvkVar6};
    }

    public rvk() {
        throw null;
    }

    public static rvk valueOf(String str) {
        return (rvk) Enum.valueOf(rvk.class, str);
    }

    public static rvk[] values() {
        return (rvk[]) i.clone();
    }
}
