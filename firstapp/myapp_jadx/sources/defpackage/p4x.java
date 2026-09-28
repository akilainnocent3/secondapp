package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class p4x {
    public static final p4x a;
    public static final p4x b;
    public static final p4x c;
    public static final /* synthetic */ p4x[] d;

    static {
        p4x p4xVar = new p4x("ConfirmAndSkip", 0);
        a = p4xVar;
        p4x p4xVar2 = new p4x("Confirm", 1);
        b = p4xVar2;
        p4x p4xVar3 = new p4x("Ok", 2);
        c = p4xVar3;
        d = new p4x[]{p4xVar, p4xVar2, p4xVar3};
    }

    public p4x() {
        throw null;
    }

    public static p4x valueOf(String str) {
        return (p4x) Enum.valueOf(p4x.class, str);
    }

    public static p4x[] values() {
        return (p4x[]) d.clone();
    }
}
