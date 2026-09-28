package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class va50 {
    public long a;
    public int b;

    public final synchronized boolean a() {
        return this.b == 0 || System.currentTimeMillis() > this.a;
    }

    public final synchronized void b(int i) {
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.b = 0;
            }
            return;
        } else {
            this.b++;
            synchronized (this) {
                this.a = System.currentTimeMillis() + ((i == 429 || (i >= 500 && i < 600)) ? (long) Math.min(Math.pow(2.0d, this.b) + ((long) (Math.random() * 1000.0d)), 1800000.0d) : 86400000L);
            }
            return;
        }
        throw th;
    }
}
