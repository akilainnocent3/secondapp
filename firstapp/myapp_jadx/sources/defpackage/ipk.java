package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ipk {
    public static final ipk a;
    public static final ipk b;
    public static final ipk c;
    public static final /* synthetic */ ipk[] d;

    static {
        ipk ipkVar = new ipk("Loading", 0);
        a = ipkVar;
        ipk ipkVar2 = new ipk("Success", 1);
        b = ipkVar2;
        ipk ipkVar3 = new ipk("Error", 2);
        c = ipkVar3;
        d = new ipk[]{ipkVar, ipkVar2, ipkVar3};
    }

    public ipk() {
        throw null;
    }

    public static ipk valueOf(String str) {
        return (ipk) Enum.valueOf(ipk.class, str);
    }

    public static ipk[] values() {
        return (ipk[]) d.clone();
    }
}
