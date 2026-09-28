package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class eur {
    public volatile xnv a;
    public volatile pl5 b;

    public final xnv a(xnv xnvVar) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = xnvVar;
                        this.b = pl5.b;
                    } catch (e0p unused) {
                        this.a = xnvVar;
                        this.b = pl5.b;
                    }
                }
            }
        }
        return this.a;
    }
}
