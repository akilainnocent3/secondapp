package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class dur {
    public volatile wnv a;
    public volatile ql5 b;

    static {
        r3h.a();
    }

    public final wnv a(wnv wnvVar) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = wnvVar;
                        this.b = ql5.b;
                    } catch (f0p unused) {
                        this.a = wnvVar;
                        this.b = ql5.b;
                    }
                }
            }
        }
        return this.a;
    }
}
