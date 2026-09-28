package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ovp {
    public static final ovp a;
    public static final ovp b;
    public static final ovp c;
    public static final ovp d;
    public static final /* synthetic */ ovp[] e;

    static {
        ovp ovpVar = new ovp("Enable", 0);
        a = ovpVar;
        ovp ovpVar2 = new ovp("Disable", 1);
        b = ovpVar2;
        ovp ovpVar3 = new ovp("Gone", 2);
        c = ovpVar3;
        ovp ovpVar4 = new ovp("Loading", 3);
        d = ovpVar4;
        e = new ovp[]{ovpVar, ovpVar2, ovpVar3, ovpVar4};
    }

    public ovp() {
        throw null;
    }

    public static ovp valueOf(String str) {
        return (ovp) Enum.valueOf(ovp.class, str);
    }

    public static ovp[] values() {
        return (ovp[]) e.clone();
    }
}
