package defpackage;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class l70 extends th50.c {
    public final /* synthetic */ bc6 a;
    public final /* synthetic */ dh50 b;

    public l70(bc6 bc6Var, dh50 dh50Var) {
        this.a = bc6Var;
        this.b = dh50Var;
    }

    @Override // th50.c
    public final void b(int i) {
        this.a.cancel(new IllegalStateException("Unable to load font " + this.b + " (reason=" + i + ')'));
    }

    @Override // th50.c
    public final void c(Typeface typeface) {
        zi50.a aVar = zi50.b;
        this.a.resumeWith(typeface);
    }
}
