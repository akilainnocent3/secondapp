package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class qi10 {
    public static final s80 a;
    public static final iq40 b;
    public static final gj5 c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            a = null;
            b = new iq40();
            c = new gj5();
        } else if (property.equals("Dalvik")) {
            a = new s80();
            b = new iq40.a();
            c = new gj5.a();
        } else {
            a = null;
            b = new iq40.b();
            c = new gj5.a();
        }
    }
}
