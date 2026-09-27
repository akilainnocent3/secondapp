package kf;

import af.n;
import af.p;
import eh.t0;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f102176a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f102177b = new t0(new byte[65025], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f102178c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f102179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f102180e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.f102179d = 0;
        do {
            int i13 = this.f102179d;
            int i14 = i10 + i13;
            f fVar = this.f102176a;
            if (i14 >= fVar.f102193g) {
                break;
            }
            int[] iArr = fVar.f102196j;
            this.f102179d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public f b() {
        return this.f102176a;
    }

    public t0 c() {
        return this.f102177b;
    }

    public boolean d(n nVar) throws IOException {
        int i10;
        eh.a.i(nVar != null);
        if (this.f102180e) {
            this.f102180e = false;
            this.f102177b.U(0);
        }
        while (!this.f102180e) {
            if (this.f102178c < 0) {
                if (!this.f102176a.c(nVar) || !this.f102176a.a(nVar, true)) {
                    return false;
                }
                f fVar = this.f102176a;
                int iA = fVar.f102194h;
                if ((fVar.f102188b & 1) == 1 && this.f102177b.g() == 0) {
                    iA += a(0);
                    i10 = this.f102179d;
                } else {
                    i10 = 0;
                }
                if (!p.e(nVar, iA)) {
                    return false;
                }
                this.f102178c = i10;
            }
            int iA2 = a(this.f102178c);
            int i11 = this.f102178c + this.f102179d;
            if (iA2 > 0) {
                t0 t0Var = this.f102177b;
                t0Var.c(t0Var.g() + iA2);
                if (!p.d(nVar, this.f102177b.e(), this.f102177b.g(), iA2)) {
                    return false;
                }
                t0 t0Var2 = this.f102177b;
                t0Var2.X(t0Var2.g() + iA2);
                this.f102180e = this.f102176a.f102196j[i11 + (-1)] != 255;
            }
            if (i11 == this.f102176a.f102193g) {
                i11 = -1;
            }
            this.f102178c = i11;
        }
        return true;
    }

    public void e() {
        this.f102176a.b();
        this.f102177b.U(0);
        this.f102178c = -1;
        this.f102180e = false;
    }

    public void f() {
        if (this.f102177b.e().length == 65025) {
            return;
        }
        t0 t0Var = this.f102177b;
        t0Var.W(Arrays.copyOf(t0Var.e(), Math.max(65025, this.f102177b.g())), this.f102177b.g());
    }
}
