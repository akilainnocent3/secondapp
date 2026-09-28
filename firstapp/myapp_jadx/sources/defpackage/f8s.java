package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class f8s {
    public static final f8s a;
    public static final f8s b;
    public static final f8s c;
    public static final /* synthetic */ f8s[] d;

    static {
        f8s f8sVar = new f8s("Completed", 0);
        a = f8sVar;
        f8s f8sVar2 = new f8s("Active", 1);
        b = f8sVar2;
        f8s f8sVar3 = new f8s("Locked", 2);
        c = f8sVar3;
        d = new f8s[]{f8sVar, f8sVar2, f8sVar3};
    }

    public f8s() {
        throw null;
    }

    public static f8s valueOf(String str) {
        return (f8s) Enum.valueOf(f8s.class, str);
    }

    public static f8s[] values() {
        return (f8s[]) d.clone();
    }
}
