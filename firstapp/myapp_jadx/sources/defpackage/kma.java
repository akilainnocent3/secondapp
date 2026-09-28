package defpackage;

import androidx.media3.exoplayer.g;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kma implements xc80 {
    public final c150 a;
    public long b;

    public static final class a implements xc80 {
        public final xc80 a;
        public final pcn<Integer> b;

        public a(xc80 xc80Var, List<Integer> list) {
            this.a = xc80Var;
            this.b = pcn.j(list);
        }

        @Override // defpackage.xc80
        public final boolean a() {
            return this.a.a();
        }

        @Override // defpackage.xc80
        public final boolean b(g gVar) {
            return this.a.b(gVar);
        }

        @Override // defpackage.xc80
        public final long d() {
            return this.a.d();
        }

        @Override // defpackage.xc80
        public final long s() {
            return this.a.s();
        }

        @Override // defpackage.xc80
        public final void v(long j) {
            this.a.v(j);
        }
    }

    public kma(List<? extends xc80> list, List<List<Integer>> list2) {
        pcn.b bVar = pcn.b;
        pcn.a aVar = new pcn.a();
        ly0.b(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            aVar.c(new a(list.get(i), list2.get(i)));
        }
        this.a = aVar.g();
        this.b = -9223372036854775807L;
    }

    @Override // defpackage.xc80
    public final boolean a() {
        int i = 0;
        while (true) {
            c150 c150Var = this.a;
            if (i >= c150Var.d) {
                return false;
            }
            if (((a) c150Var.get(i)).a.a()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.xc80
    public final boolean b(g gVar) {
        boolean zB;
        boolean z = false;
        do {
            long jD = d();
            if (jD == Long.MIN_VALUE) {
                return z;
            }
            int i = 0;
            zB = false;
            while (true) {
                c150 c150Var = this.a;
                if (i >= c150Var.d) {
                    break;
                }
                long jD2 = ((a) c150Var.get(i)).a.d();
                boolean z2 = jD2 != Long.MIN_VALUE && jD2 <= gVar.a;
                if (jD2 == jD || z2) {
                    zB |= ((a) c150Var.get(i)).a.b(gVar);
                }
                i++;
            }
            z |= zB;
        } while (zB);
        return z;
    }

    @Override // defpackage.xc80
    public final long d() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            c150 c150Var = this.a;
            if (i >= c150Var.d) {
                break;
            }
            long jD = ((a) c150Var.get(i)).a.d();
            if (jD != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jD);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // defpackage.xc80
    public final long s() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            c150 c150Var = this.a;
            if (i >= c150Var.d) {
                break;
            }
            a aVar = (a) c150Var.get(i);
            long jS = aVar.a.s();
            pcn<Integer> pcnVar = aVar.b;
            if ((pcnVar.contains(1) || pcnVar.contains(2) || pcnVar.contains(4)) && jS != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jS);
            }
            if (jS != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jS);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.b;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // defpackage.xc80
    public final void v(long j) {
        int i = 0;
        while (true) {
            c150 c150Var = this.a;
            if (i >= c150Var.d) {
                return;
            }
            ((a) c150Var.get(i)).v(j);
            i++;
        }
    }
}
