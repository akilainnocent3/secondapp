package defpackage;

import android.util.Size;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class gcn extends ijd {
    public final Surface o;

    public gcn(Surface surface, Size size, int i) {
        super(size, i);
        this.o = surface;
    }

    @Override // defpackage.ijd
    public final qis<Surface> f() {
        return obj.c(this.o);
    }

    public gcn(Surface surface) {
        this.o = surface;
    }
}
