package defpackage;

import java.util.concurrent.atomic.DoubleAdder;

/* JADX INFO: loaded from: classes8.dex */
public final class tbp implements wye {
    public final DoubleAdder a = new DoubleAdder();

    @Override // defpackage.wye
    public final void add(double d) {
        this.a.add(d);
    }

    public final String toString() {
        return this.a.toString();
    }
}
