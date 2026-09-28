package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class que {
    public static final que a;
    public static final que b;
    public static final que c;
    public static final que d;
    public static final que e;
    public static final /* synthetic */ que[] f;

    static {
        que queVar = new que("Unqualified", 0);
        a = queVar;
        que queVar2 = new que("Qualified", 1);
        b = queVar2;
        que queVar3 = new que("QualifiedLocked", 2);
        c = queVar3;
        que queVar4 = new que("QualifiedUnVerified", 3);
        d = queVar4;
        que queVar5 = new que("None", 4);
        e = queVar5;
        f = new que[]{queVar, queVar2, queVar3, queVar4, queVar5};
    }

    public que() {
        throw null;
    }

    public static que valueOf(String str) {
        return (que) Enum.valueOf(que.class, str);
    }

    public static que[] values() {
        return (que[]) f.clone();
    }
}
