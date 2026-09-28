package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class m8s {
    public static final m8s a;
    public static final m8s b;
    public static final /* synthetic */ m8s[] c;

    static {
        m8s m8sVar = new m8s("PLACE_BET", 0);
        a = m8sVar;
        m8s m8sVar2 = new m8s("LIABILITY_CHECK", 1);
        b = m8sVar2;
        c = new m8s[]{m8sVar, m8sVar2};
    }

    public m8s() {
        throw null;
    }

    public static m8s valueOf(String str) {
        return (m8s) Enum.valueOf(m8s.class, str);
    }

    public static m8s[] values() {
        return (m8s[]) c.clone();
    }
}
