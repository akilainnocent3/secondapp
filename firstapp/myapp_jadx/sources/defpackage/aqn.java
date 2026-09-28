package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class aqn {
    public static final aqn a;
    public static final aqn b;
    public static final aqn c;
    public static final /* synthetic */ aqn[] d;

    static {
        aqn aqnVar = new aqn("DEFAULT", 0);
        a = aqnVar;
        aqn aqnVar2 = new aqn("BOTTOM", 1);
        b = aqnVar2;
        aqn aqnVar3 = new aqn("FLOATING", 2);
        c = aqnVar3;
        d = new aqn[]{aqnVar, aqnVar2, aqnVar3};
    }

    public aqn() {
        throw null;
    }

    public static aqn valueOf(String str) {
        return (aqn) Enum.valueOf(aqn.class, str);
    }

    public static aqn[] values() {
        return (aqn[]) d.clone();
    }
}
