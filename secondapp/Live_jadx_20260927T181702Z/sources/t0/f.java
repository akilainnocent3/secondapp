package t0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p f135897d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f135899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f135900g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f135894a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f135895b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f135896c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f135898e = a.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f135901h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f135902i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f135903j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<d> f135904k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<f> f135905l = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f135897d = pVar;
    }

    @Override // t0.d
    public void a(d dVar) {
        Iterator<f> it = this.f135905l.iterator();
        while (it.hasNext()) {
            if (!it.next().f135903j) {
                return;
            }
        }
        this.f135896c = true;
        d dVar2 = this.f135894a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f135895b) {
            this.f135897d.a(this);
            return;
        }
        f fVar = null;
        int i10 = 0;
        for (f fVar2 : this.f135905l) {
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f135903j) {
            g gVar = this.f135902i;
            if (gVar != null) {
                if (!gVar.f135903j) {
                    return;
                } else {
                    this.f135899f = this.f135901h * gVar.f135900g;
                }
            }
            e(fVar.f135900g + this.f135899f);
        }
        d dVar3 = this.f135894a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f135904k.add(dVar);
        if (this.f135903j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f135905l.clear();
        this.f135904k.clear();
        this.f135903j = false;
        this.f135900g = 0;
        this.f135896c = false;
        this.f135895b = false;
    }

    public String d() {
        String str;
        String strY = this.f135897d.f135958b.y();
        a aVar = this.f135898e;
        if (aVar == a.LEFT || aVar == a.RIGHT) {
            str = strY + "_HORIZONTAL";
        } else {
            str = strY + "_VERTICAL";
        }
        return str + ":" + this.f135898e.name();
    }

    public void e(int i10) {
        if (this.f135903j) {
            return;
        }
        this.f135903j = true;
        this.f135900g = i10;
        for (d dVar : this.f135904k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f135897d.f135958b.y());
        sb2.append(":");
        sb2.append(this.f135898e);
        sb2.append(gi.j.f86770c);
        sb2.append(this.f135903j ? Integer.valueOf(this.f135900g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f135905l.size());
        sb2.append(":d=");
        sb2.append(this.f135904k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
