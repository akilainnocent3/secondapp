package va;

import android.annotation.TargetApi;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@TargetApi(19)
public class l implements n, j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f140562d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bb.j f140564f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f140559a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f140560b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f140561c = new Path();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<n> f140563e = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f140565a;

        static {
            int[] iArr = new int[bb.j.a.values().length];
            f140565a = iArr;
            try {
                iArr[bb.j.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f140565a[bb.j.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f140565a[bb.j.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f140565a[bb.j.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f140565a[bb.j.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(bb.j jVar) {
        this.f140562d = jVar.c();
        this.f140564f = jVar;
    }

    public final void a() {
        for (int i10 = 0; i10 < this.f140563e.size(); i10++) {
            this.f140561c.addPath(this.f140563e.get(i10).getPath());
        }
    }

    @TargetApi(19)
    public final void b(Path.Op op2) {
        this.f140560b.reset();
        this.f140559a.reset();
        for (int size = this.f140563e.size() - 1; size >= 1; size--) {
            n nVar = this.f140563e.get(size);
            if (nVar instanceof d) {
                d dVar = (d) nVar;
                List<n> listL = dVar.l();
                for (int size2 = listL.size() - 1; size2 >= 0; size2--) {
                    Path path = listL.get(size2).getPath();
                    path.transform(dVar.m());
                    this.f140560b.addPath(path);
                }
            } else {
                this.f140560b.addPath(nVar.getPath());
            }
        }
        n nVar2 = this.f140563e.get(0);
        if (nVar2 instanceof d) {
            d dVar2 = (d) nVar2;
            List<n> listL2 = dVar2.l();
            for (int i10 = 0; i10 < listL2.size(); i10++) {
                Path path2 = listL2.get(i10).getPath();
                path2.transform(dVar2.m());
                this.f140559a.addPath(path2);
            }
        } else {
            this.f140559a.set(nVar2.getPath());
        }
        this.f140561c.op(this.f140559a, this.f140560b, op2);
    }

    @Override // va.j
    public void d(ListIterator<c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c cVarPrevious = listIterator.previous();
            if (cVarPrevious instanceof n) {
                this.f140563e.add((n) cVarPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // va.c
    public void f(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < this.f140563e.size(); i10++) {
            this.f140563e.get(i10).f(list, list2);
        }
    }

    @Override // va.c
    public String getName() {
        return this.f140562d;
    }

    @Override // va.n
    public Path getPath() {
        this.f140561c.reset();
        if (this.f140564f.d()) {
            return this.f140561c;
        }
        int i10 = a.f140565a[this.f140564f.b().ordinal()];
        if (i10 == 1) {
            a();
        } else if (i10 == 2) {
            b(Path.Op.UNION);
        } else if (i10 == 3) {
            b(Path.Op.REVERSE_DIFFERENCE);
        } else if (i10 == 4) {
            b(Path.Op.INTERSECT);
        } else if (i10 == 5) {
            b(Path.Op.XOR);
        }
        return this.f140561c;
    }
}
