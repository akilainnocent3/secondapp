package androidx.media3.exoplayer;

import defpackage.cft;
import defpackage.d580;
import defpackage.jrh0;
import defpackage.ly0;
import defpackage.oyg;
import defpackage.sp10;
import defpackage.tf;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c implements f {
    public final tf a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public final HashMap<sp10, a> h;
    public long i;

    public static class a {
        public boolean a;
        public int b;
    }

    public c(tf tfVar) {
        k(1000, 0, "bufferForPlaybackMs", "0");
        k(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        k(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        k(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        k(50000, 50000, "maxBufferMs", "minBufferMs");
        k(0, 0, "backBufferDurationMs", "0");
        this.a = tfVar;
        long jO = jrh0.O(50000L);
        this.b = jO;
        this.c = jO;
        this.d = jrh0.O(1000L);
        this.e = jrh0.O(2000L);
        this.f = -1;
        this.g = jrh0.O(0L);
        this.h = new HashMap<>();
        this.i = -1L;
    }

    public static void k(int i, int i2, String str, String str2) {
        ly0.a(str + " cannot be less than " + str2, i >= i2);
    }

    @Override // androidx.media3.exoplayer.f
    public final boolean a(f.a aVar) {
        int i;
        long jB = jrh0.B(aVar.c, aVar.b);
        long jMin = aVar.d ? this.e : this.d;
        long j = aVar.e;
        if (j != -9223372036854775807L) {
            jMin = Math.min(j / 2, jMin);
        }
        if (jMin <= 0 || jB >= jMin) {
            return true;
        }
        tf tfVar = this.a;
        synchronized (tfVar) {
            i = tfVar.c * 65536;
        }
        return i >= l();
    }

    @Override // androidx.media3.exoplayer.f
    public final boolean b() {
        return false;
    }

    @Override // androidx.media3.exoplayer.f
    public final long c() {
        return this.g;
    }

    @Override // androidx.media3.exoplayer.f
    public final tf d() {
        return this.a;
    }

    @Override // androidx.media3.exoplayer.f
    public final boolean e(f.a aVar) {
        int i;
        long j = this.c;
        a aVar2 = this.h.get(aVar.a);
        aVar2.getClass();
        tf tfVar = this.a;
        synchronized (tfVar) {
            i = tfVar.c * 65536;
        }
        boolean z = i >= l();
        long jMin = this.b;
        float f = aVar.c;
        if (f > 1.0f) {
            jMin = Math.min(jrh0.z(f, jMin), j);
        }
        long jMax = Math.max(jMin, 500000L);
        long j2 = aVar.b;
        if (j2 < jMax) {
            aVar2.a = !z;
            if (z && j2 < 500000) {
                cft.g("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= j || z) {
            aVar2.a = false;
        }
        return aVar2.a;
    }

    @Override // androidx.media3.exoplayer.f
    public final boolean f() {
        Iterator<a> it = this.h.values().iterator();
        while (it.hasNext()) {
            if (it.next().a) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.f
    public final void g(sp10 sp10Var) {
        HashMap<sp10, a> map = this.h;
        if (map.remove(sp10Var) != null) {
            m();
        }
        if (map.isEmpty()) {
            this.i = -1L;
        }
    }

    @Override // androidx.media3.exoplayer.f
    public final void h(sp10 sp10Var) {
        if (this.h.remove(sp10Var) != null) {
            m();
        }
    }

    @Override // androidx.media3.exoplayer.f
    public final void i(sp10 sp10Var) {
        long id = Thread.currentThread().getId();
        long j = this.i;
        ly0.e("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        this.i = id;
        HashMap<sp10, a> map = this.h;
        if (!map.containsKey(sp10Var)) {
            map.put(sp10Var, new a());
        }
        a aVar = map.get(sp10Var);
        aVar.getClass();
        int i = this.f;
        if (i == -1) {
            i = 13107200;
        }
        aVar.b = i;
        aVar.a = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.media3.exoplayer.f
    public final void j(f.a aVar, oyg[] oygVarArr) {
        a aVar2 = this.h.get(aVar.a);
        aVar2.getClass();
        int iMax = this.f;
        if (iMax == -1) {
            int length = oygVarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i < length) {
                    oyg oygVar = oygVarArr[i];
                    if (oygVar != null) {
                        switch (oygVar.m().c) {
                            case -2:
                                i3 = 0;
                                i2 += i3;
                                break;
                            case -1:
                            case 1:
                                i2 += i3;
                                break;
                            case 0:
                                i3 = 144310272;
                                i2 += i3;
                                break;
                            case 2:
                                i3 = 131072000;
                                i2 += i3;
                                break;
                            case 3:
                            case 5:
                            case 6:
                                i3 = 131072;
                                i2 += i3;
                                break;
                            case 4:
                                i3 = 26214400;
                                i2 += i3;
                                break;
                            default:
                                d580.a();
                                break;
                        }
                        return;
                    }
                    i++;
                } else {
                    iMax = Math.max(13107200, i2);
                }
            }
        }
        aVar2.b = iMax;
        m();
    }

    public final int l() {
        Iterator<a> it = this.h.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().b;
        }
        return i;
    }

    public final void m() {
        boolean zIsEmpty = this.h.isEmpty();
        tf tfVar = this.a;
        if (!zIsEmpty) {
            tfVar.c(l());
        } else {
            synchronized (tfVar) {
                tfVar.c(0);
            }
        }
    }

    public c() {
        this(new tf(1));
    }
}
