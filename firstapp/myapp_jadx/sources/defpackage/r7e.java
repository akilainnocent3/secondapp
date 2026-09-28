package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class r7e {
    public static final r7e a;
    public static final r7e b;
    public static final r7e c;
    public static final /* synthetic */ r7e[] d;

    static {
        r7e r7eVar = new r7e("Undecided", 0);
        a = r7eVar;
        r7e r7eVar2 = new r7e("Shown", 1);
        b = r7eVar2;
        r7e r7eVar3 = new r7e("Hidden", 2);
        c = r7eVar3;
        d = new r7e[]{r7eVar, r7eVar2, r7eVar3};
    }

    public r7e() {
        throw null;
    }

    public static r7e valueOf(String str) {
        return (r7e) Enum.valueOf(r7e.class, str);
    }

    public static r7e[] values() {
        return (r7e[]) d.clone();
    }
}
