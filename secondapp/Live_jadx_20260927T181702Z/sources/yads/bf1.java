package yads;

import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class bf1 implements ur {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f147162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TreeSet f147163b = new TreeSet(new Comparator() { // from class: yads.yx3
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return bf1.a((zr) obj, (zr) obj2);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f147164c;

    public bf1(long j10) {
        this.f147162a = j10;
    }

    public static int a(zr zrVar, zr zrVar2) {
        long j10 = zrVar.f159003g;
        long j11 = zrVar2.f159003g;
        if (j10 - j11 != 0) {
            return j10 < j11 ? -1 : 1;
        }
        if (!zrVar.f158998b.equals(zrVar2.f158998b)) {
            return zrVar.f158998b.compareTo(zrVar2.f158998b);
        }
        long j12 = zrVar.f158999c - zrVar2.f158999c;
        if (j12 == 0) {
            return 0;
        }
        return j12 < 0 ? -1 : 1;
    }

    public final void a(nr nrVar, long j10) {
        while (this.f147164c + j10 > this.f147162a && !this.f147163b.isEmpty()) {
            zr zrVar = (zr) this.f147163b.first();
            vy2 vy2Var = (vy2) nrVar;
            synchronized (vy2Var) {
                vy2Var.b(zrVar);
            }
        }
    }
}
