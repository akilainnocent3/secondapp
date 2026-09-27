package com.bytedance.sdk.openadsdk.bs;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq {

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    public static int f35508hv = 3;
    public static int hww = -1;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public static int f35509sd = 1;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public static int f35510tq = 0;
    public static int vy = 2;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private int f35511hu = hww;
    private long vgm = 0;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private long f35512ok = 0;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private final List<sd> f35513rs = new ArrayList();
    private long nod = 0;

    public void hww(long j10) {
        this.f35511hu = f35510tq;
        this.vgm = j10;
    }

    public void sd(long j10) {
        int i10;
        int i11 = this.f35511hu;
        if (i11 == hww || i11 == (i10 = vy) || i11 == f35508hv) {
            return;
        }
        this.f35511hu = i10;
        this.nod = j10;
    }

    public void tq(long j10) {
        int i10;
        int i11 = this.f35511hu;
        if (i11 == hww || i11 == (i10 = f35508hv)) {
            return;
        }
        this.f35511hu = i10;
        this.f35512ok = j10;
    }

    public void vy(long j10) {
        int i10 = this.f35511hu;
        if (i10 == hww || i10 != vy) {
            return;
        }
        this.f35511hu = f35509sd;
        this.f35513rs.add(new sd(this.nod, j10));
        this.nod = 0L;
    }

    public long hww(long j10, long j11) {
        long j12;
        long j13;
        long jTq;
        long j14 = this.f35512ok;
        if (j14 != 0 && j10 > j14) {
            return 0L;
        }
        int i10 = 0;
        for (sd sdVar : this.f35513rs) {
            if (sdVar.tq() > j10) {
                if (j10 < sdVar.hww()) {
                    j13 = i10;
                    jTq = sdVar.tq() - sdVar.hww();
                } else {
                    j13 = i10;
                    jTq = sdVar.tq() - j10;
                }
                i10 = (int) (j13 + jTq);
            }
        }
        long j15 = this.vgm;
        if (j15 < j10) {
            long j16 = this.nod;
            if (j16 == 0) {
                j16 = this.f35512ok;
                if (j16 == 0) {
                    j12 = j11 - j10;
                }
            } else if (j16 <= j10) {
                return 0L;
            }
            return (j16 - j10) - ((long) i10);
        }
        long j17 = this.nod;
        if (j17 == 0) {
            j17 = this.f35512ok;
            if (j17 == 0) {
                j12 = j11 - j15;
            }
        } else if (j17 <= j15) {
            return 0L;
        }
        return (j17 - j15) - ((long) i10);
        return j12 - ((long) i10);
    }

    public int hww() {
        return this.f35511hu;
    }
}
