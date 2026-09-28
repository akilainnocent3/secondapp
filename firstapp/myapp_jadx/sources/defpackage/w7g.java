package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class w7g {
    public static final w7g a;
    public static final w7g b;
    public static final w7g c;
    public static final /* synthetic */ w7g[] d;

    static {
        w7g w7gVar = new w7g("PreEnter", 0);
        a = w7gVar;
        w7g w7gVar2 = new w7g("Visible", 1);
        b = w7gVar2;
        w7g w7gVar3 = new w7g("PostExit", 2);
        c = w7gVar3;
        d = new w7g[]{w7gVar, w7gVar2, w7gVar3};
    }

    public w7g() {
        throw null;
    }

    public static w7g valueOf(String str) {
        return (w7g) Enum.valueOf(w7g.class, str);
    }

    public static w7g[] values() {
        return (w7g[]) d.clone();
    }
}
