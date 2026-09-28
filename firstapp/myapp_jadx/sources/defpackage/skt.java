package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class skt extends kni0 {
    public final d3c b;
    public final amv c;

    public static final class a extends zr<Object> {
        public final ijt c;

        public a(d3c d3cVar, amv amvVar) {
            super(d3cVar, false);
            this.c = kl.a ? new ubp() : new w11();
            if (amvVar == amv.a) {
                Comparator<e21<?>> comparator = vw0.c;
                List list = Collections.EMPTY_LIST;
            }
        }

        @Override // defpackage.zr
        public final void b(long j) {
            this.c.add(j);
        }
    }

    public skt(bj1 bj1Var, d3c d3cVar, amv amvVar) {
        this.b = d3cVar;
        this.c = amvVar;
    }

    @Override // defpackage.xr
    public final zr<Object> b() {
        return new a(this.b, this.c);
    }
}
