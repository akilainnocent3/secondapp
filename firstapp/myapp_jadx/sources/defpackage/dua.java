package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class dua {
    public static final dua a;
    public static final dua b;
    public static final /* synthetic */ dua[] c;

    static {
        dua duaVar = new dua("Back", 0);
        a = duaVar;
        dua duaVar2 = new dua("Cancel", 1);
        b = duaVar2;
        c = new dua[]{duaVar, duaVar2};
    }

    public dua() {
        throw null;
    }

    public static dua valueOf(String str) {
        return (dua) Enum.valueOf(dua.class, str);
    }

    public static dua[] values() {
        return (dua[]) c.clone();
    }
}
