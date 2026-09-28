package defpackage;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public final class xs70 implements rdy {
    public static final Logger d = Logger.getLogger(xs70.class.getName());
    public final opf0 a = new opf0(d);
    public final bj1 b;
    public final ArrayList c;

    public xs70(bj1 bj1Var, ArrayList arrayList) {
        this.b = bj1Var;
        this.c = arrayList;
    }

    @Override // defpackage.rdy
    public final void a() {
        this.a.a(Level.FINE, uf80.a(new StringBuilder("Measurement recorded for instrument "), this.b.c, " outside callback registered to instrument. Dropping measurement."), null);
    }
}
