package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class nx2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f153252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m73[] f153253b;

    public nx2(List list) {
        this.f153252a = list;
        this.f153253b = new m73[list.size()];
    }

    public final void a(pq0 pq0Var, l93 l93Var) {
        for (int i10 = 0; i10 < this.f153253b.length; i10++) {
            l93Var.a();
            l93Var.b();
            m73 m73VarA = pq0Var.a(l93Var.f151906d, 3);
            mx0 mx0Var = (mx0) this.f153252a.get(i10);
            String str = mx0Var.f152729m;
            ni.a("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = mx0Var.f152718b;
            if (str2 == null) {
                l93Var.b();
                str2 = l93Var.f151907e;
            }
            lx0 lx0Var = new lx0();
            lx0Var.f152182a = str2;
            lx0Var.f152192k = str;
            lx0Var.f152185d = mx0Var.f152721e;
            lx0Var.f152184c = mx0Var.f152720d;
            lx0Var.C = mx0Var.E;
            lx0Var.f152194m = mx0Var.f152731o;
            m73VarA.a(new mx0(lx0Var));
            this.f153253b[i10] = m73VarA;
        }
    }
}
