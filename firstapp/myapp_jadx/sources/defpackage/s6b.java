package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class s6b {
    public static final s6b a;
    public static final s6b b;
    public static final s6b c;
    public static final s6b d;
    public static final /* synthetic */ s6b[] e;

    static {
        s6b s6bVar = new s6b("HOME_INCREASE", 0);
        a = s6bVar;
        s6b s6bVar2 = new s6b("HOME_DECREASE", 1);
        b = s6bVar2;
        s6b s6bVar3 = new s6b("AWAY_INCREASE", 2);
        c = s6bVar3;
        s6b s6bVar4 = new s6b("AWAY_DECREASE", 3);
        d = s6bVar4;
        e = new s6b[]{s6bVar, s6bVar2, s6bVar3, s6bVar4};
    }

    public s6b() {
        throw null;
    }

    public static s6b valueOf(String str) {
        return (s6b) Enum.valueOf(s6b.class, str);
    }

    public static s6b[] values() {
        return (s6b[]) e.clone();
    }
}
