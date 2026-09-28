package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class ykf {
    public static final ykf a;
    public static final ykf b;
    public static final /* synthetic */ ykf[] c;

    static {
        ykf ykfVar = new ykf("Left", 0);
        a = ykfVar;
        ykf ykfVar2 = new ykf("Right", 1);
        b = ykfVar2;
        c = new ykf[]{ykfVar, ykfVar2};
    }

    public ykf() {
        throw null;
    }

    public static ykf valueOf(String str) {
        return (ykf) Enum.valueOf(ykf.class, str);
    }

    public static ykf[] values() {
        return (ykf[]) c.clone();
    }
}
