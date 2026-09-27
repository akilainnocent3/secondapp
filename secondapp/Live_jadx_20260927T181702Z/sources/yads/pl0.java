package yads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class pl0 implements ul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f153976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m73[] f153977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f153978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f153979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f153980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f153981f = -9223372036854775807L;

    public pl0(List list) {
        this.f153976a = list;
        this.f153977b = new m73[list.size()];
    }

    @Override // yads.ul0
    public final void a(jb2 jb2Var) {
        if (this.f153978c) {
            if (this.f153979d == 2) {
                if (jb2Var.f151003c - jb2Var.f151002b == 0) {
                    return;
                }
                if (jb2Var.m() != 32) {
                    this.f153978c = false;
                }
                this.f153979d--;
                if (!this.f153978c) {
                    return;
                }
            }
            if (this.f153979d == 1) {
                if (jb2Var.f151003c - jb2Var.f151002b == 0) {
                    return;
                }
                if (jb2Var.m() != 0) {
                    this.f153978c = false;
                }
                this.f153979d--;
                if (!this.f153978c) {
                    return;
                }
            }
            int i10 = jb2Var.f151002b;
            int i11 = jb2Var.f151003c - i10;
            for (m73 m73Var : this.f153977b) {
                jb2Var.e(i10);
                m73Var.a(i11, jb2Var);
            }
            this.f153980e += i11;
        }
    }

    @Override // yads.ul0
    public final void b() {
        if (this.f153978c) {
            if (this.f153981f != -9223372036854775807L) {
                for (m73 m73Var : this.f153977b) {
                    m73Var.a(this.f153981f, 1, this.f153980e, 0, null);
                }
            }
            this.f153978c = false;
        }
    }

    @Override // yads.ul0
    public final void a(pq0 pq0Var, l93 l93Var) {
        for (int i10 = 0; i10 < this.f153977b.length; i10++) {
            i93 i93Var = (i93) this.f153976a.get(i10);
            l93Var.a();
            l93Var.b();
            m73 m73VarA = pq0Var.a(l93Var.f151906d, 3);
            lx0 lx0Var = new lx0();
            l93Var.b();
            lx0Var.f152182a = l93Var.f151907e;
            lx0Var.f152192k = "application/dvbsubs";
            lx0Var.f152194m = Collections.singletonList(i93Var.f150483b);
            lx0Var.f152184c = i93Var.f150482a;
            m73VarA.a(new mx0(lx0Var));
            this.f153977b[i10] = m73VarA;
        }
    }

    @Override // yads.ul0
    public final void a(int i10, long j10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f153978c = true;
        if (j10 != -9223372036854775807L) {
            this.f153981f = j10;
        }
        this.f153980e = 0;
        this.f153979d = 2;
    }

    @Override // yads.ul0
    public final void a() {
        this.f153978c = false;
        this.f153981f = -9223372036854775807L;
    }
}
