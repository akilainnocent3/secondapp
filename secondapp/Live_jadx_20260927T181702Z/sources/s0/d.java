package s0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final boolean f128177j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f128178k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f128180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f128181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f128182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f128183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f128184f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i0.i f128187i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet<d> f128179a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f128185g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f128186h = Integer.MIN_VALUE;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, a aVar) {
        this.f128182d = eVar;
        this.f128183e = aVar;
    }

    public void A(int i10) {
        this.f128180b = i10;
        this.f128181c = true;
    }

    public void B(int i10) {
        if (p()) {
            this.f128186h = i10;
        }
    }

    public void C(int i10) {
        if (p()) {
            this.f128185g = i10;
        }
    }

    public boolean a(d dVar, int i10) {
        return b(dVar, i10, Integer.MIN_VALUE, false);
    }

    public boolean b(d dVar, int i10, int i11, boolean z10) {
        if (dVar == null) {
            x();
            return true;
        }
        if (!z10 && !v(dVar)) {
            return false;
        }
        this.f128184f = dVar;
        if (dVar.f128179a == null) {
            dVar.f128179a = new HashSet<>();
        }
        HashSet<d> hashSet = this.f128184f.f128179a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f128185g = i10;
        this.f128186h = i11;
        return true;
    }

    public void c(d dVar, HashMap<e, e> map) {
        HashSet<d> hashSet;
        d dVar2 = this.f128184f;
        if (dVar2 != null && (hashSet = dVar2.f128179a) != null) {
            hashSet.remove(this);
        }
        d dVar3 = dVar.f128184f;
        if (dVar3 != null) {
            this.f128184f = map.get(dVar.f128184f.f128182d).r(dVar3.l());
        } else {
            this.f128184f = null;
        }
        d dVar4 = this.f128184f;
        if (dVar4 != null) {
            if (dVar4.f128179a == null) {
                dVar4.f128179a = new HashSet<>();
            }
            this.f128184f.f128179a.add(this);
        }
        this.f128185g = dVar.f128185g;
        this.f128186h = dVar.f128186h;
    }

    public void d(int i10, ArrayList<t0.o> arrayList, t0.o oVar) {
        HashSet<d> hashSet = this.f128179a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                t0.i.a(it.next().f128182d, i10, arrayList, oVar);
            }
        }
    }

    public HashSet<d> e() {
        return this.f128179a;
    }

    public int f() {
        if (this.f128181c) {
            return this.f128180b;
        }
        return 0;
    }

    public int g() {
        d dVar;
        if (this.f128182d.l0() == 8) {
            return 0;
        }
        return (this.f128186h == Integer.MIN_VALUE || (dVar = this.f128184f) == null || dVar.f128182d.l0() != 8) ? this.f128185g : this.f128186h;
    }

    public final d h() {
        switch (this.f128183e) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return null;
            case LEFT:
                return this.f128182d.S;
            case TOP:
                return this.f128182d.T;
            case RIGHT:
                return this.f128182d.Q;
            case BOTTOM:
                return this.f128182d.R;
            default:
                throw new AssertionError(this.f128183e.name());
        }
    }

    public e i() {
        return this.f128182d;
    }

    public i0.i j() {
        return this.f128187i;
    }

    public d k() {
        return this.f128184f;
    }

    public a l() {
        return this.f128183e;
    }

    public boolean m() {
        HashSet<d> hashSet = this.f128179a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().h().p()) {
                return true;
            }
        }
        return false;
    }

    public boolean n() {
        HashSet<d> hashSet = this.f128179a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean o() {
        return this.f128181c;
    }

    public boolean p() {
        return this.f128184f != null;
    }

    public boolean q(e eVar) {
        if (s(eVar, new HashSet<>())) {
            return false;
        }
        e eVarU = i().U();
        return eVarU == eVar || eVar.U() == eVarU;
    }

    public boolean r(e eVar, d dVar) {
        return q(eVar);
    }

    public final boolean s(e eVar, HashSet<e> hashSet) {
        if (hashSet.contains(eVar)) {
            return false;
        }
        hashSet.add(eVar);
        if (eVar == i()) {
            return true;
        }
        ArrayList<d> arrayListS = eVar.s();
        int size = arrayListS.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = arrayListS.get(i10);
            if (dVar.u(this) && dVar.p() && s(dVar.k().i(), hashSet)) {
                return true;
            }
        }
        return false;
    }

    public boolean t() {
        switch (this.f128183e) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return false;
            case LEFT:
            case TOP:
            case RIGHT:
            case BOTTOM:
                return true;
            default:
                throw new AssertionError(this.f128183e.name());
        }
    }

    public String toString() {
        return this.f128182d.y() + ":" + this.f128183e.toString();
    }

    public boolean u(d dVar) {
        a aVarL = dVar.l();
        a aVar = this.f128183e;
        if (aVarL == aVar) {
            return true;
        }
        switch (aVar) {
            case NONE:
                return false;
            case LEFT:
            case RIGHT:
            case CENTER_X:
                return aVarL == a.LEFT || aVarL == a.RIGHT || aVarL == a.CENTER_X;
            case TOP:
            case BOTTOM:
            case BASELINE:
            case CENTER_Y:
                return aVarL == a.TOP || aVarL == a.BOTTOM || aVarL == a.CENTER_Y || aVarL == a.BASELINE;
            case CENTER:
                return aVarL != a.BASELINE;
            default:
                throw new AssertionError(this.f128183e.name());
        }
    }

    public boolean v(d dVar) {
        if (dVar == null) {
            return false;
        }
        a aVarL = dVar.l();
        a aVar = this.f128183e;
        if (aVarL == aVar) {
            return aVar != a.BASELINE || (dVar.i().q0() && i().q0());
        }
        switch (aVar) {
            case NONE:
            case CENTER_X:
            case CENTER_Y:
                return false;
            case LEFT:
            case RIGHT:
                boolean z10 = aVarL == a.LEFT || aVarL == a.RIGHT;
                if (dVar.i() instanceof h) {
                    return z10 || aVarL == a.CENTER_X;
                }
                return z10;
            case TOP:
            case BOTTOM:
                boolean z11 = aVarL == a.TOP || aVarL == a.BOTTOM;
                if (dVar.i() instanceof h) {
                    return z11 || aVarL == a.CENTER_Y;
                }
                return z11;
            case BASELINE:
                return (aVarL == a.LEFT || aVarL == a.RIGHT) ? false : true;
            case CENTER:
                return (aVarL == a.BASELINE || aVarL == a.CENTER_X || aVarL == a.CENTER_Y) ? false : true;
            default:
                throw new AssertionError(this.f128183e.name());
        }
    }

    public boolean w() {
        switch (this.f128183e) {
            case NONE:
            case TOP:
            case BOTTOM:
            case BASELINE:
            case CENTER_Y:
                return true;
            case LEFT:
            case RIGHT:
            case CENTER:
            case CENTER_X:
                return false;
            default:
                throw new AssertionError(this.f128183e.name());
        }
    }

    public void x() {
        HashSet<d> hashSet;
        d dVar = this.f128184f;
        if (dVar != null && (hashSet = dVar.f128179a) != null) {
            hashSet.remove(this);
            if (this.f128184f.f128179a.size() == 0) {
                this.f128184f.f128179a = null;
            }
        }
        this.f128179a = null;
        this.f128184f = null;
        this.f128185g = 0;
        this.f128186h = Integer.MIN_VALUE;
        this.f128181c = false;
        this.f128180b = 0;
    }

    public void y() {
        this.f128181c = false;
        this.f128180b = 0;
    }

    public void z(i0.c cVar) {
        i0.i iVar = this.f128187i;
        if (iVar == null) {
            this.f128187i = new i0.i(i0.i.a.UNRESTRICTED, (String) null);
        } else {
            iVar.h();
        }
    }
}
