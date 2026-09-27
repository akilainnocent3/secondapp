package com.mbridge.msdk.thrid.okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class k implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f70169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Inflater f70170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f70171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f70172d;

    public k(e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f70169a = eVar;
        this.f70170b = inflater;
    }

    private void h() throws IOException {
        int i10 = this.f70171c;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f70170b.getRemaining();
        this.f70171c -= remaining;
        this.f70169a.skip(remaining);
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public long b(c cVar, long j10) throws IOException {
        boolean zD;
        if (j10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        }
        if (this.f70172d) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        do {
            zD = d();
            try {
                o oVarB = cVar.b(1);
                int iInflate = this.f70170b.inflate(oVarB.f70186a, oVarB.f70188c, (int) Math.min(j10, 8192 - oVarB.f70188c));
                if (iInflate > 0) {
                    oVarB.f70188c += iInflate;
                    long j11 = iInflate;
                    cVar.f70154b += j11;
                    return j11;
                }
                if (!this.f70170b.finished() && !this.f70170b.needsDictionary()) {
                }
                h();
                if (oVarB.f70187b != oVarB.f70188c) {
                    return -1L;
                }
                cVar.f70153a = oVarB.b();
                p.a(oVarB);
                return -1L;
            } catch (DataFormatException e10) {
                throw new IOException(e10);
            }
        } while (!zD);
        throw new EOFException("source exhausted prematurely");
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f70172d) {
            return;
        }
        this.f70170b.end();
        this.f70172d = true;
        this.f70169a.close();
    }

    public final boolean d() throws IOException {
        if (!this.f70170b.needsInput()) {
            return false;
        }
        h();
        if (this.f70170b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.f70169a.f()) {
            return true;
        }
        o oVar = this.f70169a.a().f70153a;
        int i10 = oVar.f70188c;
        int i11 = oVar.f70187b;
        int i12 = i10 - i11;
        this.f70171c = i12;
        this.f70170b.setInput(oVar.f70186a, i11, i12);
        return false;
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.f70169a.b();
    }
}
