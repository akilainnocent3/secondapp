package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class esy {
    public static final esy a;
    public static final esy b;
    public static final esy c;
    public static final /* synthetic */ esy[] d;

    static {
        esy esyVar = new esy("DISABLED", 0);
        a = esyVar;
        esy esyVar2 = new esy("REPORT", 1);
        b = esyVar2;
        esy esyVar3 = new esy("SIMULATE", 2);
        c = esyVar3;
        d = new esy[]{esyVar, esyVar2, esyVar3};
    }

    public esy() {
        throw null;
    }

    public static esy valueOf(String str) {
        return (esy) Enum.valueOf(esy.class, str);
    }

    public static esy[] values() {
        return (esy[]) d.clone();
    }
}
