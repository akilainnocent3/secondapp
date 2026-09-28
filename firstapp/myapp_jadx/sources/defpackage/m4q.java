package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class m4q {
    public static final m4q a;
    public static final m4q b;
    public static final m4q c;
    public static final /* synthetic */ m4q[] d;

    static {
        m4q m4qVar = new m4q("Hidden", 0);
        a = m4qVar;
        m4q m4qVar2 = new m4q("PartiallyExpanded", 1);
        b = m4qVar2;
        m4q m4qVar3 = new m4q("Expanded", 2);
        c = m4qVar3;
        d = new m4q[]{m4qVar, m4qVar2, m4qVar3};
    }

    public m4q() {
        throw null;
    }

    public static m4q valueOf(String str) {
        return (m4q) Enum.valueOf(m4q.class, str);
    }

    public static m4q[] values() {
        return (m4q[]) d.clone();
    }
}
