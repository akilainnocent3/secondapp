package a5;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public final class w1 implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f3809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f3810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f3812d;

    public w1(r rVar, p pVar) {
        this.f3809a = (r) zi.l0.E(rVar);
        this.f3810b = (p) zi.l0.E(pVar);
    }

    @Override // a5.r
    public void addTransferListener(x1 x1Var) {
        zi.l0.E(x1Var);
        this.f3809a.addTransferListener(x1Var);
    }

    @Override // a5.r
    public void close() throws IOException {
        try {
            this.f3809a.close();
        } finally {
            if (this.f3811c) {
                this.f3811c = false;
                this.f3810b.close();
            }
        }
    }

    @Override // a5.r
    public Map<String, List<String>> getResponseHeaders() {
        return this.f3809a.getResponseHeaders();
    }

    @Override // a5.r
    @Nullable
    public Uri getUri() {
        return this.f3809a.getUri();
    }

    @Override // a5.r
    public long open(z zVar) throws IOException {
        long jOpen = this.f3809a.open(zVar);
        this.f3812d = jOpen;
        if (jOpen == 0) {
            return 0L;
        }
        if (zVar.f3841h == -1 && jOpen != -1) {
            zVar = zVar.f(0L, jOpen);
        }
        this.f3811c = true;
        this.f3810b.open(zVar);
        return this.f3812d;
    }

    @Override // u4.c0
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f3812d == 0) {
            return -1;
        }
        int i12 = this.f3809a.read(bArr, i10, i11);
        if (i12 > 0) {
            this.f3810b.write(bArr, i10, i12);
            long j10 = this.f3812d;
            if (j10 != -1) {
                this.f3812d = j10 - ((long) i12);
            }
        }
        return i12;
    }
}
