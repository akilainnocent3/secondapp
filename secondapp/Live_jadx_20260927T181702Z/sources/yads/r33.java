package yads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class r33 implements p30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p30 f154737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f154738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f154739c = Uri.EMPTY;

    public r33(p30 p30Var) {
        this.f154737a = (p30) ni.a(p30Var);
    }

    @Override // yads.p30
    public final void a(r83 r83Var) {
        r83Var.getClass();
        this.f154737a.a(r83Var);
    }

    @Override // yads.p30
    public final void close() {
        this.f154737a.close();
    }

    @Override // yads.p30
    public final Map getResponseHeaders() {
        return this.f154737a.getResponseHeaders();
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f154737a.getUri();
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f154737a.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f154738b += (long) i12;
        }
        return i12;
    }

    @Override // yads.p30
    public final long a(u30 u30Var) {
        this.f154739c = u30Var.f156234a;
        long jA = this.f154737a.a(u30Var);
        Uri uri = this.f154737a.getUri();
        uri.getClass();
        this.f154739c = uri;
        this.f154737a.getResponseHeaders();
        return jA;
    }
}
