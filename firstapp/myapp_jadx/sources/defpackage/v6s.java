package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class v6s {
    public static final v6s a;
    public static final v6s b;
    public static final v6s c;
    public static final v6s d;
    public static final v6s e;
    public static final /* synthetic */ v6s[] f;

    static {
        v6s v6sVar = new v6s("DEBUG", 0);
        a = v6sVar;
        v6s v6sVar2 = new v6s("INFO", 1);
        b = v6sVar2;
        v6s v6sVar3 = new v6s("WARNING", 2);
        c = v6sVar3;
        v6s v6sVar4 = new v6s("ERROR", 3);
        d = v6sVar4;
        v6s v6sVar5 = new v6s("NONE", 4);
        e = v6sVar5;
        f = new v6s[]{v6sVar, v6sVar2, v6sVar3, v6sVar4, v6sVar5};
    }

    public v6s() {
        throw null;
    }

    public static v6s valueOf(String str) {
        return (v6s) Enum.valueOf(v6s.class, str);
    }

    public static v6s[] values() {
        return (v6s[]) f.clone();
    }
}
