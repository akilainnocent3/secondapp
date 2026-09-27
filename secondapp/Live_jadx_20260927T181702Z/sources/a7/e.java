package a7;

import f6.v;
import f6.x;
import java.io.IOException;
import java.util.Arrays;
import x4.v0;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f3930a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f3931b = new v0(new byte[65025], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3932c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3934e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.f3933d = 0;
        do {
            int i13 = this.f3933d;
            int i14 = i10 + i13;
            f fVar = this.f3930a;
            if (i14 >= fVar.f3947g) {
                break;
            }
            int[] iArr = fVar.f3950j;
            this.f3933d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public f b() {
        return this.f3930a;
    }

    public v0 c() {
        return this.f3931b;
    }

    public boolean d(v vVar) throws IOException {
        int i10;
        l0.g0(vVar != null);
        if (this.f3934e) {
            this.f3934e = false;
            this.f3931b.f0(0);
        }
        while (!this.f3934e) {
            if (this.f3932c < 0) {
                if (!this.f3930a.c(vVar) || !this.f3930a.a(vVar, true)) {
                    return false;
                }
                f fVar = this.f3930a;
                int iA = fVar.f3948h;
                if ((fVar.f3942b & 1) == 1 && this.f3931b.j() == 0) {
                    iA += a(0);
                    i10 = this.f3933d;
                } else {
                    i10 = 0;
                }
                if (!x.f(vVar, iA)) {
                    return false;
                }
                this.f3932c = i10;
            }
            int iA2 = a(this.f3932c);
            int i11 = this.f3932c + this.f3933d;
            if (iA2 > 0) {
                v0 v0Var = this.f3931b;
                v0Var.d(v0Var.j() + iA2);
                if (!x.e(vVar, this.f3931b.f(), this.f3931b.j(), iA2)) {
                    return false;
                }
                v0 v0Var2 = this.f3931b;
                v0Var2.i0(v0Var2.j() + iA2);
                this.f3934e = this.f3930a.f3950j[i11 + (-1)] != 255;
            }
            if (i11 == this.f3930a.f3947g) {
                i11 = -1;
            }
            this.f3932c = i11;
        }
        return true;
    }

    public void e() {
        this.f3930a.b();
        this.f3931b.f0(0);
        this.f3932c = -1;
        this.f3934e = false;
    }

    public void f() {
        if (this.f3931b.f().length == 65025) {
            return;
        }
        v0 v0Var = this.f3931b;
        v0Var.h0(Arrays.copyOf(v0Var.f(), Math.max(65025, this.f3931b.j())), this.f3931b.j());
    }
}
