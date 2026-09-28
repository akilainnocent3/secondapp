package defpackage;

import android.os.SystemClock;
import com.google.protobuf.Reader;

/* JADX INFO: loaded from: classes.dex */
public final class xcs implements ael {
    public final kgt a;

    public xcs(kgt kgtVar) {
        this.a = kgtVar;
    }

    @Override // defpackage.ael
    public final boolean a(ww90 ww90Var) {
        dqe dqeVar = ww90Var.a;
        boolean z = dqeVar instanceof dqe.a;
        int i = Reader.READ_DONE;
        if ((z ? ((dqe.a) dqeVar).a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        dqe dqeVar2 = ww90Var.b;
        if (dqeVar2 instanceof dqe.a) {
            i = ((dqe.a) dqeVar2).a;
        }
        return i > 100;
    }

    @Override // defpackage.ael
    public final boolean b() {
        boolean z;
        xjh xjhVar = xjh.a;
        kgt kgtVar = this.a;
        synchronized (xjhVar) {
            try {
                int i = xjh.c;
                xjh.c = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > xjh.d + 30000) {
                    xjh.c = 0;
                    xjh.d = SystemClock.uptimeMillis();
                    String[] list = xjh.b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    int length = list.length;
                    boolean z2 = length < 800;
                    xjh.e = z2;
                    if (!z2 && kgtVar != null) {
                        kgt.a aVar = kgt.a.d;
                        if (kgtVar.a().compareTo(aVar) <= 0) {
                            kgtVar.b("FileDescriptorCounter", aVar, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, null);
                        }
                    }
                }
                z = xjh.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
