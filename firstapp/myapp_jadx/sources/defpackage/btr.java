package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class btr {
    public static final btr a;
    public static final /* synthetic */ btr[] b;

    static {
        btr btrVar = new btr("Horizontal", 0);
        a = btrVar;
        b = new btr[]{btrVar, new btr("Vertical", 1)};
    }

    public btr() {
        throw null;
    }

    public static btr valueOf(String str) {
        return (btr) Enum.valueOf(btr.class, str);
    }

    public static btr[] values() {
        return (btr[]) b.clone();
    }
}
