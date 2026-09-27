package a5;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public final class v1 implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f3803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f3805c = Uri.EMPTY;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<String, List<String>> f3806d = Collections.EMPTY_MAP;

    public v1(r rVar) {
        this.f3803a = (r) zi.l0.E(rVar);
    }

    public long a() {
        return this.f3804b;
    }

    @Override // a5.r
    public void addTransferListener(x1 x1Var) {
        zi.l0.E(x1Var);
        this.f3803a.addTransferListener(x1Var);
    }

    public Uri c() {
        return this.f3805c;
    }

    @Override // a5.r
    public void close() throws IOException {
        this.f3803a.close();
    }

    public Map<String, List<String>> d() {
        return this.f3806d;
    }

    public void e() {
        this.f3804b = 0L;
    }

    @Override // a5.r
    public Map<String, List<String>> getResponseHeaders() {
        return this.f3803a.getResponseHeaders();
    }

    @Override // a5.r
    @Nullable
    public Uri getUri() {
        return this.f3803a.getUri();
    }

    @Override // a5.r
    public long open(z zVar) throws IOException {
        this.f3805c = zVar.f3834a;
        this.f3806d = Collections.EMPTY_MAP;
        try {
            return this.f3803a.open(zVar);
        } finally {
            Uri uri = getUri();
            if (uri != null) {
                this.f3805c = uri;
            }
            this.f3806d = getResponseHeaders();
        }
    }

    @Override // u4.c0
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f3803a.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f3804b += (long) i12;
        }
        return i12;
    }
}
