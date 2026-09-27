package af;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f4934a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4940g;

    public void a(g0 g0Var, @Nullable g0.a aVar) {
        if (this.f4936c > 0) {
            g0Var.b(this.f4937d, this.f4938e, this.f4939f, this.f4940g, aVar);
            this.f4936c = 0;
        }
    }

    public void b() {
        this.f4935b = false;
        this.f4936c = 0;
    }

    public void c(g0 g0Var, long j10, int i10, int i11, int i12, @Nullable g0.a aVar) {
        eh.a.j(this.f4940g <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f4935b) {
            int i13 = this.f4936c;
            int i14 = i13 + 1;
            this.f4936c = i14;
            if (i13 == 0) {
                this.f4937d = j10;
                this.f4938e = i10;
                this.f4939f = 0;
            }
            this.f4939f += i11;
            this.f4940g = i12;
            if (i14 >= 16) {
                a(g0Var, aVar);
            }
        }
    }

    public void d(n nVar) throws IOException {
        if (this.f4935b) {
            return;
        }
        nVar.peekFully(this.f4934a, 0, 10);
        nVar.resetPeekPosition();
        if (te.b.j(this.f4934a) == 0) {
            return;
        }
        this.f4935b = true;
    }
}
