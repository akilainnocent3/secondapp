package bh;

import androidx.annotation.Nullable;
import eh.h0;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f21404f = "CachedContent";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TreeSet<w> f21407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<a> f21408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q f21409e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f21410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f21411b;

        public a(long j10, long j11) {
            this.f21410a = j10;
            this.f21411b = j11;
        }

        public boolean a(long j10, long j11) {
            long j12 = this.f21411b;
            if (j12 == -1) {
                return j10 >= this.f21410a;
            }
            if (j11 == -1) {
                return false;
            }
            long j13 = this.f21410a;
            return j13 <= j10 && j10 + j11 <= j13 + j12;
        }

        public boolean b(long j10, long j11) {
            long j12 = this.f21410a;
            if (j12 > j10) {
                return j11 == -1 || j10 + j11 > j12;
            }
            long j13 = this.f21411b;
            return j13 == -1 || j12 + j13 > j10;
        }
    }

    public l(int i10, String str) {
        this(i10, str, q.f21450f);
    }

    public void a(w wVar) {
        this.f21407c.add(wVar);
    }

    public boolean b(p pVar) {
        q qVar = this.f21409e;
        q qVarC = qVar.c(pVar);
        this.f21409e = qVarC;
        return !qVarC.equals(qVar);
    }

    public long c(long j10, long j11) {
        eh.a.a(j10 >= 0);
        eh.a.a(j11 >= 0);
        w wVarE = e(j10, j11);
        if (wVarE.b()) {
            return -Math.min(wVarE.c() ? Long.MAX_VALUE : wVarE.f21389d, j11);
        }
        long j12 = j10 + j11;
        long j13 = j12 >= 0 ? j12 : Long.MAX_VALUE;
        long jMax = wVarE.f21388c + wVarE.f21389d;
        if (jMax < j13) {
            for (w wVar : this.f21407c.tailSet(wVarE, false)) {
                long j14 = wVar.f21388c;
                if (j14 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j14 + wVar.f21389d);
                if (jMax >= j13) {
                    break;
                }
            }
        }
        return Math.min(jMax - j10, j11);
    }

    public q d() {
        return this.f21409e;
    }

    public w e(long j10, long j11) {
        w wVarH = w.h(this.f21406b, j10);
        w wVarFloor = this.f21407c.floor(wVarH);
        if (wVarFloor != null && wVarFloor.f21388c + wVarFloor.f21389d > j10) {
            return wVarFloor;
        }
        w wVarCeiling = this.f21407c.ceiling(wVarH);
        if (wVarCeiling != null) {
            long j12 = wVarCeiling.f21388c - j10;
            j11 = j11 == -1 ? j12 : Math.min(j12, j11);
        }
        return w.g(this.f21406b, j10, j11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f21405a == lVar.f21405a && this.f21406b.equals(lVar.f21406b) && this.f21407c.equals(lVar.f21407c) && this.f21409e.equals(lVar.f21409e)) {
                return true;
            }
        }
        return false;
    }

    public TreeSet<w> f() {
        return this.f21407c;
    }

    public boolean g() {
        return this.f21407c.isEmpty();
    }

    public boolean h(long j10, long j11) {
        for (int i10 = 0; i10 < this.f21408d.size(); i10++) {
            if (this.f21408d.get(i10).a(j10, j11)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f21405a * 31) + this.f21406b.hashCode()) * 31) + this.f21409e.hashCode();
    }

    public boolean i() {
        return this.f21408d.isEmpty();
    }

    public boolean j(long j10, long j11) {
        for (int i10 = 0; i10 < this.f21408d.size(); i10++) {
            if (this.f21408d.get(i10).b(j10, j11)) {
                return false;
            }
        }
        this.f21408d.add(new a(j10, j11));
        return true;
    }

    public boolean k(j jVar) {
        if (!this.f21407c.remove(jVar)) {
            return false;
        }
        File file = jVar.f21391f;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public w l(w wVar, long j10, boolean z10) {
        long j11;
        eh.a.i(this.f21407c.remove(wVar));
        File file = (File) eh.a.g(wVar.f21391f);
        if (z10) {
            j11 = j10;
            File fileI = w.i((File) eh.a.g(file.getParentFile()), this.f21405a, wVar.f21388c, j11);
            if (file.renameTo(fileI)) {
                file = fileI;
            } else {
                h0.n("CachedContent", "Failed to rename " + file + " to " + fileI);
            }
        } else {
            j11 = j10;
        }
        w wVarD = wVar.d(file, j11);
        this.f21407c.add(wVarD);
        return wVarD;
    }

    public void m(long j10) {
        for (int i10 = 0; i10 < this.f21408d.size(); i10++) {
            if (this.f21408d.get(i10).f21410a == j10) {
                this.f21408d.remove(i10);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public l(int i10, String str, q qVar) {
        this.f21405a = i10;
        this.f21406b = str;
        this.f21409e = qVar;
        this.f21407c = new TreeSet<>();
        this.f21408d = new ArrayList<>();
    }
}
