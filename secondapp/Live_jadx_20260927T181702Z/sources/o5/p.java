package o5;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.List;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public class p implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f118792a;

    public p(y yVar) {
        this.f118792a = yVar;
    }

    @Override // o5.y
    public void a(Bundle bundle) {
        this.f118792a.a(bundle);
    }

    @Override // o5.y
    @k.t0(26)
    public PersistableBundle b() {
        return this.f118792a.b();
    }

    @Override // o5.y
    public void c(int i10, int i11, int i12, long j10, int i13) {
        this.f118792a.c(i10, i11, i12, j10, i13);
    }

    @Override // o5.y
    public boolean d() {
        return this.f118792a.d();
    }

    @Override // o5.y
    public void e(int i10, long j10) {
        this.f118792a.e(i10, j10);
    }

    @Override // o5.y
    public int f(MediaCodec.BufferInfo bufferInfo) {
        return this.f118792a.f(bufferInfo);
    }

    @Override // o5.y
    public void flush() {
        this.f118792a.flush();
    }

    @Override // o5.y
    public void g(int i10, boolean z10) {
        this.f118792a.g(i10, z10);
    }

    @Override // o5.y
    public MediaFormat h() {
        return this.f118792a.h();
    }

    @Override // o5.y
    @Nullable
    public ByteBuffer i(int i10) {
        return this.f118792a.i(i10);
    }

    @Override // o5.y
    public void j(Surface surface) {
        this.f118792a.j(surface);
    }

    @Override // o5.y
    public int k() {
        return this.f118792a.k();
    }

    @Override // o5.y
    public void l(int i10, int i11, c5.d dVar, long j10, int i12) {
        this.f118792a.l(i10, i11, dVar, j10, i12);
    }

    @Override // o5.y
    @Nullable
    public ByteBuffer m(int i10) {
        return this.f118792a.m(i10);
    }

    @Override // o5.y
    @k.t0(31)
    public void n(List<String> list) {
        this.f118792a.n(list);
    }

    @Override // o5.y
    public boolean o(y.c cVar) {
        return this.f118792a.o(cVar);
    }

    @Override // o5.y
    public void p(Runnable runnable) {
        this.f118792a.p(runnable);
    }

    @Override // o5.y
    public void q(y.d dVar, Handler handler) {
        this.f118792a.q(dVar, handler);
    }

    @Override // o5.y
    @k.t0(35)
    public void r() {
        this.f118792a.r();
    }

    @Override // o5.y
    public void release() {
        this.f118792a.release();
    }

    @Override // o5.y
    @k.t0(31)
    public void s(List<String> list) {
        this.f118792a.s(list);
    }

    @Override // o5.y
    public void setVideoScalingMode(int i10) {
        this.f118792a.setVideoScalingMode(i10);
    }
}
