package re;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class a extends y7 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f125313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zf.k1 f125314h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f125315i;

    public a(boolean z10, zf.k1 k1Var) {
        this.f125315i = z10;
        this.f125314h = k1Var;
        this.f125313g = k1Var.getLength();
    }

    public static Object C(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object D(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object F(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    public abstract int A(int i10);

    public abstract int B(int i10);

    public abstract Object E(int i10);

    public abstract int G(int i10);

    public abstract int H(int i10);

    public final int I(int i10, boolean z10) {
        if (z10) {
            return this.f125314h.getNextIndex(i10);
        }
        if (i10 < this.f125313g - 1) {
            return i10 + 1;
        }
        return -1;
    }

    public final int J(int i10, boolean z10) {
        if (z10) {
            return this.f125314h.getPreviousIndex(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    public abstract y7 K(int i10);

    @Override // re.y7
    public int e(boolean z10) {
        if (this.f125313g == 0) {
            return -1;
        }
        if (this.f125315i) {
            z10 = false;
        }
        int firstIndex = z10 ? this.f125314h.getFirstIndex() : 0;
        while (K(firstIndex).w()) {
            firstIndex = I(firstIndex, z10);
            if (firstIndex == -1) {
                return -1;
            }
        }
        return H(firstIndex) + K(firstIndex).e(z10);
    }

    @Override // re.y7
    public final int f(Object obj) {
        int iF;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objD = D(obj);
        Object objC = C(obj);
        int iZ = z(objD);
        if (iZ == -1 || (iF = K(iZ).f(objC)) == -1) {
            return -1;
        }
        return G(iZ) + iF;
    }

    @Override // re.y7
    public int g(boolean z10) {
        int i10 = this.f125313g;
        if (i10 == 0) {
            return -1;
        }
        if (this.f125315i) {
            z10 = false;
        }
        int lastIndex = z10 ? this.f125314h.getLastIndex() : i10 - 1;
        while (K(lastIndex).w()) {
            lastIndex = J(lastIndex, z10);
            if (lastIndex == -1) {
                return -1;
            }
        }
        return H(lastIndex) + K(lastIndex).g(z10);
    }

    @Override // re.y7
    public int i(int i10, int i11, boolean z10) {
        if (this.f125315i) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iB = B(i10);
        int iH = H(iB);
        int i12 = K(iB).i(i10 - iH, i11 != 2 ? i11 : 0, z10);
        if (i12 != -1) {
            return iH + i12;
        }
        int I = I(iB, z10);
        while (I != -1 && K(I).w()) {
            I = I(I, z10);
        }
        if (I != -1) {
            return H(I) + K(I).e(z10);
        }
        if (i11 == 2) {
            return e(z10);
        }
        return -1;
    }

    @Override // re.y7
    public final y7.b k(int i10, y7.b bVar, boolean z10) {
        int iA = A(i10);
        int iH = H(iA);
        K(iA).k(i10 - G(iA), bVar, z10);
        bVar.f127211d += iH;
        if (z10) {
            bVar.f127210c = F(E(iA), eh.a.g(bVar.f127210c));
        }
        return bVar;
    }

    @Override // re.y7
    public final y7.b l(Object obj, y7.b bVar) {
        Object objD = D(obj);
        Object objC = C(obj);
        int iZ = z(objD);
        int iH = H(iZ);
        K(iZ).l(objC, bVar);
        bVar.f127211d += iH;
        bVar.f127210c = obj;
        return bVar;
    }

    @Override // re.y7
    public int r(int i10, int i11, boolean z10) {
        if (this.f125315i) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iB = B(i10);
        int iH = H(iB);
        int iR = K(iB).r(i10 - iH, i11 != 2 ? i11 : 0, z10);
        if (iR != -1) {
            return iH + iR;
        }
        int iJ = J(iB, z10);
        while (iJ != -1 && K(iJ).w()) {
            iJ = J(iJ, z10);
        }
        if (iJ != -1) {
            return H(iJ) + K(iJ).g(z10);
        }
        if (i11 == 2) {
            return g(z10);
        }
        return -1;
    }

    @Override // re.y7
    public final Object s(int i10) {
        int iA = A(i10);
        return F(E(iA), K(iA).s(i10 - G(iA)));
    }

    @Override // re.y7
    public final y7.d u(int i10, y7.d dVar, long j10) {
        int iB = B(i10);
        int iH = H(iB);
        int iG = G(iB);
        K(iB).u(i10 - iH, dVar, j10);
        Object objE = E(iB);
        if (!y7.d.f127220s.equals(dVar.f127228b)) {
            objE = F(objE, dVar.f127228b);
        }
        dVar.f127228b = objE;
        dVar.f127242p += iG;
        dVar.f127243q += iG;
        return dVar;
    }

    public abstract int z(Object obj);
}
