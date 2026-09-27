package f6;

import androidx.annotation.Nullable;
import java.io.IOException;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f83475a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f83476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f83477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f83478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f83479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f83480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f83481g;

    public void a(f1 f1Var, @Nullable f1.a aVar) {
        if (this.f83477c > 0) {
            f1Var.b(this.f83478d, this.f83479e, this.f83480f, this.f83481g, aVar);
            this.f83477c = 0;
        }
    }

    public void b() {
        this.f83476b = false;
        this.f83477c = 0;
    }

    public void c(f1 f1Var, long j10, int i10, int i11, int i12, @Nullable f1.a aVar) {
        zi.l0.h0(this.f83481g <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f83476b) {
            int i13 = this.f83477c;
            int i14 = i13 + 1;
            this.f83477c = i14;
            if (i13 == 0) {
                this.f83478d = j10;
                this.f83479e = i10;
                this.f83480f = 0;
            }
            this.f83480f += i11;
            this.f83481g = i12;
            if (i14 >= 16) {
                a(f1Var, aVar);
            }
        }
    }

    public void d(v vVar) throws IOException {
        if (this.f83476b) {
            return;
        }
        vVar.peekFully(this.f83475a, 0, 10);
        vVar.resetPeekPosition();
        if (b.j(this.f83475a) == 0) {
            return;
        }
        this.f83476b = true;
    }
}
