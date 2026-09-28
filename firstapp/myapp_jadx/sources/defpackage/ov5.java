package defpackage;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class ov5 implements Runnable {
    public final /* synthetic */ v9i.c a;
    public final /* synthetic */ Typeface b;

    public ov5(v9i.c cVar, Typeface typeface) {
        this.a = cVar;
        this.b = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b(this.b);
    }
}
