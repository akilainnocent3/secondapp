package z5;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;
import x4.d0;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class f implements b5.a.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f160326f = "CachedRegionTracker";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f160327g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f160328h = -2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b5.a f160329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f160330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f6.h f160331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TreeSet<a> f160332d = new TreeSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f160333e = new a(0, 0);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements Comparable<a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f160334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f160335c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f160336d;

        public a(long j10, long j11) {
            this.f160334b = j10;
            this.f160335c = j11;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Long.compare(this.f160334b, aVar.f160334b);
        }
    }

    public f(b5.a aVar, String str, f6.h hVar) {
        this.f160329a = aVar;
        this.f160330b = str;
        this.f160331c = hVar;
        synchronized (this) {
            try {
                Iterator<b5.j> itDescendingIterator = aVar.h(str, this).descendingIterator();
                while (itDescendingIterator.hasNext()) {
                    f(itDescendingIterator.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // b5.a.b
    public synchronized void a(b5.a aVar, b5.j jVar) {
        long j10 = jVar.f20691c;
        a aVar2 = new a(j10, jVar.f20692d + j10);
        a aVarFloor = this.f160332d.floor(aVar2);
        if (aVarFloor == null) {
            d0.d("CachedRegionTracker", "Removed a span we were not aware of");
            return;
        }
        this.f160332d.remove(aVarFloor);
        long j11 = aVarFloor.f160334b;
        long j12 = aVar2.f160334b;
        if (j11 < j12) {
            a aVar3 = new a(j11, j12);
            int iBinarySearch = Arrays.binarySearch(this.f160331c.f83484c, aVar3.f160335c);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            aVar3.f160336d = iBinarySearch;
            this.f160332d.add(aVar3);
        }
        long j13 = aVarFloor.f160335c;
        long j14 = aVar2.f160335c;
        if (j13 > j14) {
            a aVar4 = new a(j14 + 1, j13);
            aVar4.f160336d = aVarFloor.f160336d;
            this.f160332d.add(aVar4);
        }
    }

    @Override // b5.a.b
    public synchronized void d(b5.a aVar, b5.j jVar) {
        f(jVar);
    }

    public synchronized int e(long j10) {
        int i10;
        a aVar = this.f160333e;
        aVar.f160334b = j10;
        a aVarFloor = this.f160332d.floor(aVar);
        if (aVarFloor != null) {
            long j11 = aVarFloor.f160335c;
            if (j10 <= j11 && (i10 = aVarFloor.f160336d) != -1) {
                f6.h hVar = this.f160331c;
                if (i10 == hVar.f83482a - 1) {
                    if (j11 == hVar.f83484c[i10] + ((long) hVar.f83483b[i10])) {
                        return -2;
                    }
                }
                return (int) ((hVar.f83486e[i10] + ((hVar.f83485d[i10] * (j11 - hVar.f83484c[i10])) / ((long) hVar.f83483b[i10]))) / 1000);
            }
        }
        return -1;
    }

    public final void f(b5.j jVar) {
        long j10 = jVar.f20691c;
        a aVar = new a(j10, jVar.f20692d + j10);
        a aVarFloor = this.f160332d.floor(aVar);
        a aVarCeiling = this.f160332d.ceiling(aVar);
        boolean zG = g(aVarFloor, aVar);
        if (g(aVar, aVarCeiling)) {
            if (zG) {
                aVarFloor.f160335c = aVarCeiling.f160335c;
                aVarFloor.f160336d = aVarCeiling.f160336d;
            } else {
                aVar.f160335c = aVarCeiling.f160335c;
                aVar.f160336d = aVarCeiling.f160336d;
                this.f160332d.add(aVar);
            }
            this.f160332d.remove(aVarCeiling);
            return;
        }
        if (!zG) {
            int iBinarySearch = Arrays.binarySearch(this.f160331c.f83484c, aVar.f160335c);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            aVar.f160336d = iBinarySearch;
            this.f160332d.add(aVar);
            return;
        }
        aVarFloor.f160335c = aVar.f160335c;
        int i10 = aVarFloor.f160336d;
        while (true) {
            f6.h hVar = this.f160331c;
            if (i10 >= hVar.f83482a - 1) {
                break;
            }
            int i11 = i10 + 1;
            if (hVar.f83484c[i11] > aVarFloor.f160335c) {
                break;
            } else {
                i10 = i11;
            }
        }
        aVarFloor.f160336d = i10;
    }

    public final boolean g(@Nullable a aVar, @Nullable a aVar2) {
        return (aVar == null || aVar2 == null || aVar.f160335c != aVar2.f160334b) ? false : true;
    }

    public void h() {
        this.f160329a.i(this.f160330b, this);
    }

    @Override // b5.a.b
    public void b(b5.a aVar, b5.j jVar, b5.j jVar2) {
    }
}
