package com.google.android.exoplayer2.source.rtsp;

import ah.d0;
import android.net.Uri;
import androidx.annotation.Nullable;
import eh.o1;
import java.util.Arrays;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class j extends ah.g implements a, g.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f49103j = "RTP/AVP/TCP;unicast;interleaved=%d-%d";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedBlockingQueue<byte[]> f49104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f49105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f49106h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f49107i;

    public j(long j10) {
        super(true);
        this.f49105g = j10;
        this.f49104f = new LinkedBlockingQueue<>();
        this.f49106h = new byte[0];
        this.f49107i = -1;
    }

    @Override // ah.v
    public long a(d0 d0Var) {
        this.f49107i = d0Var.f5063a.getPort();
        return -1L;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a
    public int c() {
        return this.f49107i;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a
    public String e() {
        eh.a.i(this.f49107i != -1);
        return o1.M(f49103j, Integer.valueOf(this.f49107i), Integer.valueOf(this.f49107i + 1));
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a
    public boolean f() {
        return false;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.g.b
    public void g(byte[] bArr) {
        this.f49104f.add(bArr);
    }

    @Override // ah.v
    @Nullable
    public Uri getUri() {
        return null;
    }

    @Override // ah.r
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int iMin = Math.min(i11, this.f49106h.length);
        System.arraycopy(this.f49106h, 0, bArr, i10, iMin);
        byte[] bArr2 = this.f49106h;
        this.f49106h = Arrays.copyOfRange(bArr2, iMin, bArr2.length);
        if (iMin == i11) {
            return iMin;
        }
        try {
            byte[] bArrPoll = this.f49104f.poll(this.f49105g, TimeUnit.MILLISECONDS);
            if (bArrPoll == null) {
                return -1;
            }
            int iMin2 = Math.min(i11 - iMin, bArrPoll.length);
            System.arraycopy(bArrPoll, 0, bArr, i10 + iMin, iMin2);
            if (iMin2 < bArrPoll.length) {
                this.f49106h = Arrays.copyOfRange(bArrPoll, iMin2, bArrPoll.length);
            }
            return iMin + iMin2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }

    @Override // ah.v
    public void close() {
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a
    public g.b h() {
        return this;
    }
}
