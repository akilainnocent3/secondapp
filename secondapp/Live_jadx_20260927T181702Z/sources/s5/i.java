package s5;

import cj.v6;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@x4.m1
public final class i implements u1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v6<a> f129263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f129264c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements u1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u1 f129265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v6<Integer> f129266c;

        public a(u1 u1Var, List<Integer> list) {
            this.f129265b = u1Var;
            this.f129266c = v6.u(list);
        }

        public v6<Integer> c() {
            return this.f129266c;
        }

        @Override // s5.u1
        public boolean d(androidx.media3.exoplayer.j jVar) {
            return this.f129265b.d(jVar);
        }

        @Override // s5.u1
        public long getBufferedPositionUs() {
            return this.f129265b.getBufferedPositionUs();
        }

        @Override // s5.u1
        public long getNextLoadPositionUs() {
            return this.f129265b.getNextLoadPositionUs();
        }

        @Override // s5.u1
        public boolean isLoading() {
            return this.f129265b.isLoading();
        }

        @Override // s5.u1
        public void reevaluateBuffer(long j10) {
            this.f129265b.reevaluateBuffer(j10);
        }
    }

    @Deprecated
    public i(u1[] u1VarArr) {
        this(v6.w(u1VarArr), Collections.nCopies(u1VarArr.length, v6.A(-1)));
    }

    @Override // s5.u1
    public boolean d(androidx.media3.exoplayer.j jVar) {
        boolean zD;
        boolean z10 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return z10;
            }
            zD = false;
            for (int i10 = 0; i10 < this.f129263b.size(); i10++) {
                long nextLoadPositionUs2 = this.f129263b.get(i10).getNextLoadPositionUs();
                boolean z11 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= jVar.f14206a;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z11) {
                    zD |= this.f129263b.get(i10).d(jVar);
                }
            }
            z10 |= zD;
        } while (zD);
        return z10;
    }

    @Override // s5.u1
    public long getBufferedPositionUs() {
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f129263b.size(); i10++) {
            a aVar = this.f129263b.get(i10);
            long bufferedPositionUs = aVar.getBufferedPositionUs();
            if ((aVar.c().contains(1) || aVar.c().contains(2) || aVar.c().contains(4)) && bufferedPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, bufferedPositionUs);
            }
            if (bufferedPositionUs != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, bufferedPositionUs);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            this.f129264c = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f129264c;
        return j10 != -9223372036854775807L ? j10 : jMin2;
    }

    @Override // s5.u1
    public long getNextLoadPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f129263b.size(); i10++) {
            long nextLoadPositionUs = this.f129263b.get(i10).getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, nextLoadPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // s5.u1
    public boolean isLoading() {
        for (int i10 = 0; i10 < this.f129263b.size(); i10++) {
            if (this.f129263b.get(i10).isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // s5.u1
    public void reevaluateBuffer(long j10) {
        for (int i10 = 0; i10 < this.f129263b.size(); i10++) {
            this.f129263b.get(i10).reevaluateBuffer(j10);
        }
    }

    public i(List<? extends u1> list, List<List<Integer>> list2) {
        v6.a aVarQ = v6.q();
        zi.l0.d(list.size() == list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarQ.g(new a(list.get(i10), list2.get(i10)));
        }
        this.f129263b = aVarQ.e();
        this.f129264c = -9223372036854775807L;
    }
}
