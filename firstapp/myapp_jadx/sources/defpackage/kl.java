package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class kl {
    public static final boolean a;

    static {
        boolean z;
        try {
            Class.forName("java.util.concurrent.atomic.DoubleAdder");
            Class.forName("java.util.concurrent.atomic.LongAdder");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
    }
}
