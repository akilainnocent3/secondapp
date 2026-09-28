package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class lhy {
    public static final lhy a;
    public static final lhy b;
    public static final lhy c;
    public static final /* synthetic */ lhy[] d;

    static {
        lhy lhyVar = new lhy("DISABLED", 0);
        a = lhyVar;
        lhy lhyVar2 = new lhy("UNSELECTED", 1);
        b = lhyVar2;
        lhy lhyVar3 = new lhy("SELECTED", 2);
        c = lhyVar3;
        d = new lhy[]{lhyVar, lhyVar2, lhyVar3};
    }

    public lhy() {
        throw null;
    }

    public static lhy valueOf(String str) {
        return (lhy) Enum.valueOf(lhy.class, str);
    }

    public static lhy[] values() {
        return (lhy[]) d.clone();
    }
}
