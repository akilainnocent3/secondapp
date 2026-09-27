package f6;

import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public class j0 implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f83513a;

    public j0(w0 w0Var) {
        this.f83513a = w0Var;
    }

    @Override // f6.w0
    public boolean e() {
        return this.f83513a.e();
    }

    @Override // f6.w0
    public long getDurationUs() {
        return this.f83513a.getDurationUs();
    }

    @Override // f6.w0
    public w0.a getSeekPoints(long j10) {
        return this.f83513a.getSeekPoints(j10);
    }

    @Override // f6.w0
    public boolean isSeekable() {
        return this.f83513a.isSeekable();
    }
}
