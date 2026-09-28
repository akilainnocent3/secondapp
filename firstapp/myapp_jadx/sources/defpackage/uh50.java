package defpackage;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uh50 implements Runnable {
    public final /* synthetic */ th50.c a;
    public final /* synthetic */ Typeface b;

    public /* synthetic */ uh50(th50.c cVar, Typeface typeface) {
        this.a = cVar;
        this.b = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this.b);
    }
}
