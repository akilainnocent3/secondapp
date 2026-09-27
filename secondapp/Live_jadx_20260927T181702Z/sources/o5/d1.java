package o5;

import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class d1 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f118665a;

    public d1(MediaCodec mediaCodec) {
        this.f118665a = mediaCodec;
    }

    @Override // o5.b0
    public void a(Bundle bundle) {
        this.f118665a.setParameters(bundle);
    }

    @Override // o5.b0
    public void c(int i10, int i11, int i12, long j10, int i13) {
        this.f118665a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // o5.b0
    public void l(int i10, int i11, c5.d dVar, long j10, int i12) {
        this.f118665a.queueSecureInputBuffer(i10, i11, dVar.a(), j10, i12);
    }

    @Override // o5.b0
    public void b() {
    }

    @Override // o5.b0
    public void d() {
    }

    @Override // o5.b0
    public void flush() {
    }

    @Override // o5.b0
    public void shutdown() {
    }

    @Override // o5.b0
    public void start() {
    }
}
