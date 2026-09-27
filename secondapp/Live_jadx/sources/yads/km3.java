package yads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class km3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f151607c = lm3.f152057a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f151608a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f151609b = false;

    public final synchronized void a(String str, long j10) {
        if (this.f151609b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f151608a.add(new jm3(str, j10, SystemClock.elapsedRealtime()));
    }

    public final void finalize() {
        if (this.f151609b) {
            return;
        }
        a();
        boolean z10 = ad1.f146762a;
    }

    public final synchronized void a() {
        long j10;
        this.f151609b = true;
        if (this.f151608a.size() == 0) {
            j10 = 0;
        } else {
            long j11 = ((jm3) this.f151608a.get(0)).f151187a;
            ArrayList arrayList = this.f151608a;
            j10 = ((jm3) arrayList.get(arrayList.size() - 1)).f151187a - j11;
        }
        if (j10 <= 0) {
            return;
        }
        long j12 = ((jm3) this.f151608a.get(0)).f151187a;
        boolean z10 = ad1.f146762a;
        Iterator it = this.f151608a.iterator();
        while (it.hasNext()) {
            long j13 = ((jm3) it.next()).f151187a;
            boolean z11 = ad1.f146762a;
        }
    }
}
