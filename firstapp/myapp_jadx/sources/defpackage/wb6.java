package defpackage;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes4.dex */
public final class wb6 extends bjb0 {
    public final Typeface b;
    public final a c;
    public boolean d;

    public interface a {
        void a(Typeface typeface);
    }

    public wb6(a aVar, Typeface typeface) {
        this.b = typeface;
        this.c = aVar;
    }

    @Override // defpackage.bjb0
    public final void b0(int i) {
        if (this.d) {
            return;
        }
        this.c.a(this.b);
    }

    @Override // defpackage.bjb0
    public final void c0(Typeface typeface, boolean z) {
        if (this.d) {
            return;
        }
        this.c.a(typeface);
    }
}
