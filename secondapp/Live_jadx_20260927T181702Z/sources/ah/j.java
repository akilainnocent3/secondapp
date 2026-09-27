package ah;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class j extends g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f5194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Uri f5195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5196h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5197i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5198j;

    public j(byte[] bArr) {
        super(false);
        eh.a.g(bArr);
        eh.a.a(bArr.length > 0);
        this.f5194f = bArr;
    }

    @Override // ah.v
    public long a(d0 d0Var) throws IOException {
        this.f5195g = d0Var.f5063a;
        k(d0Var);
        long j10 = d0Var.f5069g;
        byte[] bArr = this.f5194f;
        if (j10 > bArr.length) {
            throw new a0(2008);
        }
        this.f5196h = (int) j10;
        int length = bArr.length - ((int) j10);
        this.f5197i = length;
        long j11 = d0Var.f5070h;
        if (j11 != -1) {
            this.f5197i = (int) Math.min(length, j11);
        }
        this.f5198j = true;
        l(d0Var);
        long j12 = d0Var.f5070h;
        return j12 != -1 ? j12 : this.f5197i;
    }

    @Override // ah.v
    public void close() {
        if (this.f5198j) {
            this.f5198j = false;
            j();
        }
        this.f5195g = null;
    }

    @Override // ah.v
    @Nullable
    public Uri getUri() {
        return this.f5195g;
    }

    @Override // ah.r
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f5197i;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        System.arraycopy(this.f5194f, this.f5196h, bArr, i10, iMin);
        this.f5196h += iMin;
        this.f5197i -= iMin;
        i(iMin);
        return iMin;
    }
}
