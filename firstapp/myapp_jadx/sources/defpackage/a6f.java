package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class a6f extends kni0 {
    public final d3c b;
    public final amv c;

    public static final class a extends zr<Object> {
        public final wye c;

        public a(d3c d3cVar, amv amvVar) {
            super(d3cVar, true);
            this.c = kl.a ? new tbp() : new v11();
            if (amvVar == amv.a) {
                Comparator<e21<?>> comparator = vw0.c;
                List list = Collections.EMPTY_LIST;
            }
        }

        @Override // defpackage.zr
        public final void a(double d) {
            this.c.add(d);
        }
    }

    public a6f(bj1 bj1Var, d3c d3cVar, amv amvVar) {
        this.b = d3cVar;
        this.c = amvVar;
    }

    @Override // defpackage.xr
    public final zr<Object> b() {
        return new a(this.b, this.c);
    }
}
