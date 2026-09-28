package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class hci {
    public static final hci a;
    public static final hci b;
    public static final /* synthetic */ hci[] c;

    static {
        hci hciVar = new hci("EXPANDED", 0);
        a = hciVar;
        hci hciVar2 = new hci("COLLAPSED", 1);
        b = hciVar2;
        c = new hci[]{hciVar, hciVar2};
    }

    public hci() {
        throw null;
    }

    public static hci valueOf(String str) {
        return (hci) Enum.valueOf(hci.class, str);
    }

    public static hci[] values() {
        return (hci[]) c.clone();
    }

    public final boolean a() {
        return this == a;
    }
}
