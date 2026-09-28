package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class k9u {
    public static final k9u a;
    public static final k9u b;
    public static final k9u c;
    public static final k9u d;
    public static final k9u e;
    public static final /* synthetic */ k9u[] f;

    static {
        k9u k9uVar = new k9u("Idle", 0);
        a = k9uVar;
        k9u k9uVar2 = new k9u("On", 1);
        b = k9uVar2;
        k9u k9uVar3 = new k9u("Circle", 2);
        c = k9uVar3;
        k9u k9uVar4 = new k9u("SpinStarted", 3);
        d = k9uVar4;
        k9u k9uVar5 = new k9u("ResultStarted", 4);
        e = k9uVar5;
        f = new k9u[]{k9uVar, k9uVar2, k9uVar3, k9uVar4, k9uVar5};
    }

    public k9u() {
        throw null;
    }

    public static k9u valueOf(String str) {
        return (k9u) Enum.valueOf(k9u.class, str);
    }

    public static k9u[] values() {
        return (k9u[]) f.clone();
    }
}
