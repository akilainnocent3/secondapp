package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import androidx.media3.session.fe;
import com.fyber.inneractive.sdk.player.exoplayer2.util.p;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f46942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f46943b = 10485760;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46944c = 20480;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.k f46945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public File f46946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public OutputStream f46947f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FileOutputStream f46948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f46949h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f46950i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p f46951j;

    public c(l lVar) {
        this.f46942a = lVar;
    }

    public final void a() {
        OutputStream outputStream = this.f46947f;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            this.f46948g.getFD().sync();
            z.a(this.f46947f);
            this.f46947f = null;
            File file = this.f46946e;
            this.f46946e = null;
            l lVar = this.f46942a;
            synchronized (lVar) {
                m mVarA = m.a(file, lVar.f46998d);
                if (mVarA == null) {
                    throw new IllegalStateException();
                }
                if (!lVar.f46997c.containsKey(mVarA.f46974a)) {
                    throw new IllegalStateException();
                }
                if (file.exists()) {
                    if (file.length() == 0) {
                        file.delete();
                        return;
                    }
                    long jA = lVar.a(mVarA.f46974a);
                    if (jA != -1 && mVarA.f46975b + mVarA.f46976c > jA) {
                        throw new IllegalStateException();
                    }
                    lVar.a(mVarA);
                    lVar.f46998d.b();
                    lVar.notifyAll();
                }
            }
        } catch (Throwable th2) {
            z.a(this.f46947f);
            this.f46947f = null;
            File file2 = this.f46946e;
            this.f46946e = null;
            file2.delete();
            throw th2;
        }
    }

    public final void b() {
        File file;
        long j10 = this.f46945d.f47035d;
        long jMin = j10 == -1 ? this.f46943b : Math.min(j10 - this.f46950i, this.f46943b);
        l lVar = this.f46942a;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = this.f46945d;
        String str = kVar.f47036e;
        long j11 = kVar.f47033b + this.f46950i;
        synchronized (lVar) {
            try {
                if (!lVar.f46997c.containsKey(str)) {
                    throw new IllegalStateException();
                }
                if (!lVar.f46995a.exists()) {
                    lVar.a();
                    lVar.f46995a.mkdirs();
                }
                lVar.f46996b.a(lVar, jMin);
                File file2 = lVar.f46995a;
                i iVar = lVar.f46998d;
                h hVarA = (h) iVar.f46984a.get(str);
                if (hVarA == null) {
                    hVarA = iVar.a(str, -1L);
                }
                int i10 = hVarA.f46980a;
                long jCurrentTimeMillis = System.currentTimeMillis();
                Pattern pattern = m.f47001g;
                file = new File(file2, i10 + fe.F + j11 + fe.F + jCurrentTimeMillis + ".v3.exo");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f46946e = file;
        FileOutputStream fileOutputStream = new FileOutputStream(this.f46946e);
        this.f46948g = fileOutputStream;
        if (this.f46944c > 0) {
            p pVar = this.f46951j;
            if (pVar == null) {
                this.f46951j = new p(this.f46948g, this.f46944c);
            } else {
                pVar.a(fileOutputStream);
            }
            this.f46947f = this.f46951j;
        } else {
            this.f46947f = fileOutputStream;
        }
        this.f46949h = 0L;
    }
}
