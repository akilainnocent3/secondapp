package yads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class xf2 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f157841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f157842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f157843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f157844i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s63[] f157845j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object[] f157846k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f157847l;

    public xf2(List list, sy2 sy2Var) {
        super(sy2Var);
        int size = list.size();
        this.f157843h = new int[size];
        this.f157844i = new int[size];
        this.f157845j = new s63[size];
        this.f157846k = new Object[size];
        this.f157847l = new HashMap();
        Iterator it = list.iterator();
        int iB = 0;
        int iA = 0;
        int i10 = 0;
        while (it.hasNext()) {
            dn1 dn1Var = (dn1) it.next();
            this.f157845j[i10] = dn1Var.a();
            this.f157844i[i10] = iB;
            this.f157843h[i10] = iA;
            iB += this.f157845j[i10].b();
            iA += this.f157845j[i10].a();
            this.f157846k[i10] = dn1Var.getUid();
            this.f157847l.put(this.f157846k[i10], Integer.valueOf(i10));
            i10++;
        }
        this.f157841f = iB;
        this.f157842g = iA;
    }

    @Override // yads.s63
    public final int a() {
        return this.f157842g;
    }

    @Override // yads.s63
    public final int b() {
        return this.f157841f;
    }
}
