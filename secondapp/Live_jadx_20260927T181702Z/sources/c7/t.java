package c7;

import f6.t0;
import java.io.IOException;
import java.util.List;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
@Deprecated
public class t implements f6.u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f6.u f22546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s.a f22547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u f22548f;

    public t(f6.u uVar, s.a aVar) {
        this.f22546d = uVar;
        this.f22547e = aVar;
    }

    @Override // f6.u
    public void c(f6.w wVar) {
        u uVar = new u(wVar, this.f22547e);
        this.f22548f = uVar;
        this.f22546d.c(uVar);
    }

    @Override // f6.u
    public boolean d(f6.v vVar) throws IOException {
        return this.f22546d.d(vVar);
    }

    @Override // f6.u
    public f6.u e() {
        return this.f22546d;
    }

    @Override // f6.u
    public /* synthetic */ List f() {
        return f6.t.a(this);
    }

    @Override // f6.u
    public int g(f6.v vVar, t0 t0Var) throws IOException {
        return this.f22546d.g(vVar, t0Var);
    }

    @Override // f6.u
    public void release() {
        this.f22546d.release();
    }

    @Override // f6.u
    public void seek(long j10, long j11) {
        u uVar = this.f22548f;
        if (uVar != null) {
            uVar.a();
        }
        this.f22546d.seek(j10, j11);
    }
}
