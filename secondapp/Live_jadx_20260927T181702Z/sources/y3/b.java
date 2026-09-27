package y3;

import com.ironsource.C4235d4;
import java.util.ArrayList;
import java.util.Iterator;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY_GROUP_PREFIX})
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f145872d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f145873e = "StateMachine";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f145874f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f145875g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<c> f145876a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<c> f145877b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<c> f145878c = new ArrayList<>();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f145879a;

        public a(String str) {
            this.f145879a = str;
        }

        public boolean a() {
            return true;
        }
    }

    /* JADX INFO: renamed from: y3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C1537b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f145880a;

        public C1537b(String str) {
            this.f145880a = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f145881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f145882b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f145883c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f145884d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f145885e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ArrayList<d> f145886f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ArrayList<d> f145887g;

        public c(String str) {
            this(str, false, true);
        }

        public void a(d dVar) {
            if (this.f145886f == null) {
                this.f145886f = new ArrayList<>();
            }
            this.f145886f.add(dVar);
        }

        public void b(d dVar) {
            if (this.f145887g == null) {
                this.f145887g = new ArrayList<>();
            }
            this.f145887g.add(dVar);
        }

        public final boolean c() {
            ArrayList<d> arrayList = this.f145886f;
            if (arrayList == null) {
                return true;
            }
            if (this.f145883c) {
                Iterator<d> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().f145892e != 1) {
                        return false;
                    }
                }
                return true;
            }
            Iterator<d> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (it2.next().f145892e == 1) {
                    return true;
                }
            }
            return false;
        }

        public final int d() {
            return this.f145884d;
        }

        public final boolean f() {
            if (this.f145884d == 1 || !c()) {
                return false;
            }
            this.f145884d = 1;
            e();
            g();
            return true;
        }

        public final void g() {
            a aVar;
            ArrayList<d> arrayList = this.f145887g;
            if (arrayList != null) {
                for (d dVar : arrayList) {
                    if (dVar.f145890c == null && ((aVar = dVar.f145891d) == null || aVar.a())) {
                        this.f145885e++;
                        dVar.f145892e = 1;
                        if (!this.f145882b) {
                            return;
                        }
                    }
                }
            }
        }

        public String toString() {
            return C4235d4.j.f61460d + this.f145881a + " " + this.f145884d + C4235d4.j.f61462e;
        }

        public c(String str, boolean z10, boolean z11) {
            this.f145884d = 0;
            this.f145885e = 0;
            this.f145881a = str;
            this.f145882b = z10;
            this.f145883c = z11;
        }

        public void e() {
        }
    }

    public void a(c cVar) {
        if (this.f145876a.contains(cVar)) {
            return;
        }
        this.f145876a.add(cVar);
    }

    public void b(c cVar, c cVar2) {
        d dVar = new d(cVar, cVar2);
        cVar2.a(dVar);
        cVar.b(dVar);
    }

    public void c(c cVar, c cVar2, a aVar) {
        d dVar = new d(cVar, cVar2, aVar);
        cVar2.a(dVar);
        cVar.b(dVar);
    }

    public void d(c cVar, c cVar2, C1537b c1537b) {
        d dVar = new d(cVar, cVar2, c1537b);
        cVar2.a(dVar);
        cVar.b(dVar);
    }

    public void e(C1537b c1537b) {
        for (int i10 = 0; i10 < this.f145877b.size(); i10++) {
            c cVar = this.f145877b.get(i10);
            ArrayList<d> arrayList = cVar.f145887g;
            if (arrayList != null && (cVar.f145882b || cVar.f145885e <= 0)) {
                for (d dVar : arrayList) {
                    if (dVar.f145892e != 1 && dVar.f145890c == c1537b) {
                        dVar.f145892e = 1;
                        cVar.f145885e++;
                        if (!cVar.f145882b) {
                            break;
                        }
                    }
                }
            }
        }
        g();
    }

    public void f() {
        this.f145878c.clear();
        this.f145877b.clear();
        for (c cVar : this.f145876a) {
            cVar.f145884d = 0;
            cVar.f145885e = 0;
            ArrayList<d> arrayList = cVar.f145887g;
            if (arrayList != null) {
                Iterator<d> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().f145892e = 0;
                }
            }
        }
    }

    public void g() {
        boolean z10;
        do {
            z10 = false;
            for (int size = this.f145878c.size() - 1; size >= 0; size--) {
                c cVar = this.f145878c.get(size);
                if (cVar.f()) {
                    this.f145878c.remove(size);
                    this.f145877b.add(cVar);
                    z10 = true;
                }
            }
        } while (z10);
    }

    public void h() {
        this.f145878c.addAll(this.f145876a);
        g();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f145888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f145889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C1537b f145890c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a f145891d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f145892e;

        public d(c cVar, c cVar2, C1537b c1537b) {
            this.f145892e = 0;
            if (c1537b == null) {
                throw new IllegalArgumentException();
            }
            this.f145888a = cVar;
            this.f145889b = cVar2;
            this.f145890c = c1537b;
            this.f145891d = null;
        }

        public String toString() {
            String str;
            C1537b c1537b = this.f145890c;
            if (c1537b != null) {
                str = c1537b.f145880a;
            } else {
                a aVar = this.f145891d;
                str = aVar != null ? aVar.f145879a : "auto";
            }
            return C4235d4.j.f61460d + this.f145888a.f145881a + " -> " + this.f145889b.f145881a + " <" + str + ">]";
        }

        public d(c cVar, c cVar2) {
            this.f145892e = 0;
            this.f145888a = cVar;
            this.f145889b = cVar2;
            this.f145890c = null;
            this.f145891d = null;
        }

        public d(c cVar, c cVar2, a aVar) {
            this.f145892e = 0;
            if (aVar != null) {
                this.f145888a = cVar;
                this.f145889b = cVar2;
                this.f145890c = null;
                this.f145891d = aVar;
                return;
            }
            throw new IllegalArgumentException();
        }
    }
}
