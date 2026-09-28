package defpackage;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.zzoh;

/* JADX INFO: loaded from: classes4.dex */
public final class bcl0 {
    public final /* synthetic */ zzoh a;
    public final /* synthetic */ nfl0 b;

    public bcl0(nfl0 nfl0Var, zzoh zzohVar) {
        this.a = zzohVar;
        this.b = nfl0Var;
    }

    public final void a(Throwable th) {
        nfl0 nfl0Var = this.b;
        nfl0Var.g();
        nfl0Var.i = false;
        k8l0 k8l0Var = nfl0Var.a;
        wok0 wok0Var = k8l0Var.d;
        y4l0 y4l0Var = k8l0Var.f;
        int i = 2;
        if (wok0Var.q(null, v2l0.T0)) {
            String message = th.getMessage();
            nfl0Var.n = false;
            if (message != null) {
                if ((th instanceof IllegalStateException) || message.contains("garbage collected") || th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                    if (message.contains("Background")) {
                        nfl0Var.n = true;
                    }
                    i = 1;
                } else if ((th instanceof SecurityException) && !message.endsWith("READ_DEVICE_CONFIG")) {
                    i = 3;
                }
            }
        }
        int i2 = i - 1;
        zzoh zzohVar = this.a;
        if (i2 == 0) {
            k8l0.m(y4l0Var);
            y4l0Var.i.c(y4l0.k(k8l0Var.q().m()), "registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", y4l0.k(th.toString()));
            nfl0Var.j = 1;
            nfl0Var.E().add(zzohVar);
            return;
        }
        if (i2 != 1) {
            k8l0.m(y4l0Var);
            y4l0Var.f.c(y4l0.k(k8l0Var.q().m()), "registerTriggerAsync failed. Dropping URI. App ID, Throwable", th);
            b();
            nfl0Var.j = 1;
            nfl0Var.F();
            return;
        }
        nfl0Var.E().add(zzohVar);
        if (nfl0Var.j > ((Integer) v2l0.w0.a(null)).intValue()) {
            nfl0Var.j = 1;
            k8l0.m(y4l0Var);
            y4l0Var.i.c(y4l0.k(k8l0Var.q().m()), "registerTriggerAsync failed. May try later. App ID, throwable", y4l0.k(th.toString()));
            return;
        }
        k8l0.m(y4l0Var);
        y4l0Var.i.d(y4l0.k(k8l0Var.q().m()), "registerTriggerAsync failed. App ID, delay in seconds, throwable", y4l0.k(String.valueOf(nfl0Var.j)), y4l0.k(th.toString()));
        int i3 = nfl0Var.j;
        dcl0 dcl0Var = nfl0Var.k;
        if (dcl0Var == null) {
            dcl0Var = new dcl0(nfl0Var, k8l0Var);
            nfl0Var.k = dcl0Var;
        }
        dcl0Var.b(((long) i3) * 1000);
        int i4 = nfl0Var.j;
        nfl0Var.j = i4 + i4;
    }

    public final void b() {
        k8l0 k8l0Var = this.b.a;
        j6l0 j6l0Var = k8l0Var.e;
        k8l0.k(j6l0Var);
        SparseArray sparseArrayM = j6l0Var.m();
        zzoh zzohVar = this.a;
        sparseArrayM.put(zzohVar.c, Long.valueOf(zzohVar.b));
        j6l0 j6l0Var2 = k8l0Var.e;
        k8l0.k(j6l0Var2);
        int[] iArr = new int[sparseArrayM.size()];
        long[] jArr = new long[sparseArrayM.size()];
        for (int i = 0; i < sparseArrayM.size(); i++) {
            iArr[i] = sparseArrayM.keyAt(i);
            jArr[i] = ((Long) sparseArrayM.valueAt(i)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        j6l0Var2.n.b(bundle);
    }
}
