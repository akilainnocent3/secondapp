package d5;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public abstract class a extends u4.y4 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f77722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s5.w1 f77723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f77724g;

    public a(boolean z10, s5.w1 w1Var) {
        this.f77724g = z10;
        this.f77723f = w1Var;
        this.f77722e = w1Var.getLength();
    }

    public static Object G(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object H(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object J(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    public abstract int D(Object obj);

    public abstract int E(int i10);

    public abstract int F(int i10);

    public abstract Object I(int i10);

    public abstract int K(int i10);

    public abstract int L(int i10);

    public final int M(int i10, boolean z10) {
        if (z10) {
            return this.f77723f.getNextIndex(i10);
        }
        if (i10 < this.f77722e - 1) {
            return i10 + 1;
        }
        return -1;
    }

    public final int N(int i10, boolean z10) {
        if (z10) {
            return this.f77723f.getPreviousIndex(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    public abstract u4.y4 O(int i10);

    @Override // u4.y4
    public int h(boolean z10) {
        if (this.f77722e == 0) {
            return -1;
        }
        if (this.f77724g) {
            z10 = false;
        }
        int firstIndex = z10 ? this.f77723f.getFirstIndex() : 0;
        while (O(firstIndex).z()) {
            firstIndex = M(firstIndex, z10);
            if (firstIndex == -1) {
                return -1;
            }
        }
        return L(firstIndex) + O(firstIndex).h(z10);
    }

    @Override // u4.y4
    public final int i(Object obj) {
        int i10;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objH = H(obj);
        Object objG = G(obj);
        int iD = D(objH);
        if (iD == -1 || (i10 = O(iD).i(objG)) == -1) {
            return -1;
        }
        return K(iD) + i10;
    }

    @Override // u4.y4
    public int j(boolean z10) {
        int i10 = this.f77722e;
        if (i10 == 0) {
            return -1;
        }
        if (this.f77724g) {
            z10 = false;
        }
        int lastIndex = z10 ? this.f77723f.getLastIndex() : i10 - 1;
        while (O(lastIndex).z()) {
            lastIndex = N(lastIndex, z10);
            if (lastIndex == -1) {
                return -1;
            }
        }
        return L(lastIndex) + O(lastIndex).j(z10);
    }

    @Override // u4.y4
    public int l(int i10, int i11, boolean z10) {
        if (this.f77724g) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iF = F(i10);
        int iL = L(iF);
        int iL2 = O(iF).l(i10 - iL, i11 != 2 ? i11 : 0, z10);
        if (iL2 != -1) {
            return iL + iL2;
        }
        int iM = M(iF, z10);
        while (iM != -1 && O(iM).z()) {
            iM = M(iM, z10);
        }
        if (iM != -1) {
            return L(iM) + O(iM).h(z10);
        }
        if (i11 == 2) {
            return h(z10);
        }
        return -1;
    }

    @Override // u4.y4
    public final u4.y4.b n(int i10, u4.y4.b bVar, boolean z10) {
        int iE = E(i10);
        int iL = L(iE);
        O(iE).n(i10 - K(iE), bVar, z10);
        bVar.f139111c += iL;
        if (z10) {
            bVar.f139110b = J(I(iE), zi.l0.E(bVar.f139110b));
        }
        return bVar;
    }

    @Override // u4.y4
    public final u4.y4.b o(Object obj, u4.y4.b bVar) {
        Object objH = H(obj);
        Object objG = G(obj);
        int iD = D(objH);
        int iL = L(iD);
        O(iD).o(objG, bVar);
        bVar.f139111c += iL;
        bVar.f139110b = obj;
        return bVar;
    }

    @Override // u4.y4
    public int u(int i10, int i11, boolean z10) {
        if (this.f77724g) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iF = F(i10);
        int iL = L(iF);
        int iU = O(iF).u(i10 - iL, i11 != 2 ? i11 : 0, z10);
        if (iU != -1) {
            return iL + iU;
        }
        int iN = N(iF, z10);
        while (iN != -1 && O(iN).z()) {
            iN = N(iN, z10);
        }
        if (iN != -1) {
            return L(iN) + O(iN).j(z10);
        }
        if (i11 == 2) {
            return j(z10);
        }
        return -1;
    }

    @Override // u4.y4
    public final Object v(int i10) {
        int iE = E(i10);
        return J(I(iE), O(iE).v(i10 - K(iE)));
    }

    @Override // u4.y4
    public final u4.y4.d x(int i10, u4.y4.d dVar, long j10) {
        int iF = F(i10);
        int iL = L(iF);
        int iK = K(iF);
        O(iF).x(i10 - iL, dVar, j10);
        Object objI = I(iF);
        if (!u4.y4.d.f139120q.equals(dVar.f139130a)) {
            objI = J(objI, dVar.f139130a);
        }
        dVar.f139130a = objI;
        dVar.f139143n += iK;
        dVar.f139144o += iK;
        return dVar;
    }
}
