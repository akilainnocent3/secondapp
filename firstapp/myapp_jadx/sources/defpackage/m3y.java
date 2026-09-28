package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class m3y {
    public static final a a;
    public static final m3y b;
    public static final m3y c;
    public static final /* synthetic */ m3y[] d;

    public static final class a {
    }

    static {
        m3y m3yVar = new m3y("Enabled", 0);
        b = m3yVar;
        m3y m3yVar2 = new m3y("Disabled", 1);
        c = m3yVar2;
        d = new m3y[]{m3yVar, m3yVar2};
        a = new a();
    }

    public m3y() {
        throw null;
    }

    public static m3y valueOf(String str) {
        return (m3y) Enum.valueOf(m3y.class, str);
    }

    public static m3y[] values() {
        return (m3y[]) d.clone();
    }
}
