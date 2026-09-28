package defpackage;

import android.media.metrics.PlaybackMetrics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bbm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bbm(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                qam.a aVar = ((fbm) obj2).c;
                qam.this.b.d.get(((nam) obj).m).c(true);
                break;
            default:
                ((yjv) obj2).s((PlaybackMetrics) obj);
                break;
        }
    }
}
