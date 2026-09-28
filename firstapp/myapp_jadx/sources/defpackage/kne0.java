package defpackage;

import androidx.compose.runtime.a;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class kne0 {
    public static ene0 a(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, a aVar, int i) {
        long jH;
        long jH2;
        long jH3;
        long jH4;
        long jH5;
        long jH6;
        long jH7;
        long j17 = (i & 4) != 0 ? j58.l : j3;
        long jD = (i & 8) != 0 ? g68.d(soe0.q, aVar) : j4;
        long jD2 = (i & 64) != 0 ? g68.d(soe0.x, aVar) : j7;
        long jD3 = (i & 128) != 0 ? g68.d(soe0.A, aVar) : j8;
        if ((i & 256) != 0) {
            jH = r58.h(j58.c(soe0.b, g68.d(soe0.a, aVar)), ((d68) aVar.O(g68.a)).p);
        } else {
            jH = j9;
        }
        if ((i & 512) != 0) {
            jH2 = r58.h(j58.c(soe0.f, g68.d(soe0.e, aVar)), ((d68) aVar.O(g68.a)).p);
        } else {
            jH2 = j10;
        }
        long j18 = (i & 1024) != 0 ? j58.l : j11;
        if ((i & 2048) != 0) {
            jH3 = r58.h(j58.c(soe0.d, g68.d(soe0.c, aVar)), ((d68) aVar.O(g68.a)).p);
        } else {
            jH3 = j12;
        }
        if ((i & 4096) != 0) {
            jH4 = r58.h(j58.c(soe0.h, g68.d(soe0.g, aVar)), ((d68) aVar.O(g68.a)).p);
        } else {
            jH4 = j13;
        }
        if ((i & 8192) != 0) {
            jH5 = r58.h(j58.c(soe0.f, g68.d(soe0.k, aVar)), ((d68) aVar.O(g68.a)).p);
        } else {
            jH5 = j14;
        }
        if ((i & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            jH6 = r58.h(j58.c(soe0.f, g68.d(soe0.l, aVar)), ((d68) aVar.O(g68.a)).p);
        } else {
            jH6 = j15;
        }
        if ((i & 32768) != 0) {
            jH7 = r58.h(j58.c(soe0.j, g68.d(soe0.i, aVar)), ((d68) aVar.O(g68.a)).p);
        } else {
            jH7 = j16;
        }
        return new ene0(j, j2, j17, jD, j5, j6, jD2, jD3, jH, jH2, j18, jH3, jH4, jH5, jH6, jH7);
    }
}
