package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class bkt implements xr<Object> {
    public final d3c a;
    public final amv b;

    public static final class a extends zr<Object> {
        public final AtomicReference<Long> c;

        public a(d3c d3cVar, amv amvVar) {
            super(d3cVar, false);
            this.c = new AtomicReference<>(null);
            if (amvVar == amv.a) {
                Comparator<e21<?>> comparator = vw0.c;
                List list = Collections.EMPTY_LIST;
            }
        }

        @Override // defpackage.zr
        public final void b(long j) {
            this.c.set(Long.valueOf(j));
        }
    }

    public bkt(d3c d3cVar, amv amvVar) {
        this.a = d3cVar;
        this.b = amvVar;
    }

    @Override // defpackage.xr
    public final zr<Object> b() {
        return new a(this.a, this.b);
    }
}
