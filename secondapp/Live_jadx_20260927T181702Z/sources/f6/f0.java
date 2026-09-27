package f6;

import java.io.IOException;
import java.util.List;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public class f0 implements u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f83459d;

    public f0(u uVar) {
        this.f83459d = uVar;
    }

    @Override // f6.u
    public void c(w wVar) {
        this.f83459d.c(wVar);
    }

    @Override // f6.u
    public boolean d(v vVar) throws IOException {
        return this.f83459d.d(vVar);
    }

    @Override // f6.u
    public u e() {
        return this.f83459d.e();
    }

    @Override // f6.u
    public List<a1> f() {
        return this.f83459d.f();
    }

    @Override // f6.u
    public int g(v vVar, t0 t0Var) throws IOException {
        return this.f83459d.g(vVar, t0Var);
    }

    @Override // f6.u
    public void release() {
        this.f83459d.release();
    }

    @Override // f6.u
    public void seek(long j10, long j11) {
        this.f83459d.seek(j10, j11);
    }
}
