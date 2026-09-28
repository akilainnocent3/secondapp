package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class x1o {
    public static final x1o a;
    public static final x1o b;
    public static final /* synthetic */ x1o[] c;

    static {
        x1o x1oVar = new x1o("RUNNING", 0);
        a = x1oVar;
        x1o x1oVar2 = new x1o("FINISHED", 1);
        b = x1oVar2;
        c = new x1o[]{x1oVar, x1oVar2};
    }

    public x1o() {
        throw null;
    }

    public static x1o valueOf(String str) {
        return (x1o) Enum.valueOf(x1o.class, str);
    }

    public static x1o[] values() {
        return (x1o[]) c.clone();
    }
}
