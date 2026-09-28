package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.zzpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class wlk0 extends puk0 {
    public final k8l0 a;
    public final nfl0 b;

    public wlk0(k8l0 k8l0Var) {
        hm20.h(k8l0Var);
        this.a = k8l0Var;
        nfl0 nfl0Var = k8l0Var.m;
        k8l0.l(nfl0Var);
        this.b = nfl0Var;
    }

    @Override // defpackage.pfl0
    public final void a(String str, String str2, Bundle bundle) {
        nfl0 nfl0Var = this.b;
        nfl0Var.a.k.getClass();
        nfl0Var.l(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // defpackage.pfl0
    public final void b(Bundle bundle) {
        nfl0 nfl0Var = this.b;
        nfl0Var.a.k.getClass();
        nfl0Var.t(bundle, System.currentTimeMillis());
    }

    @Override // defpackage.pfl0
    public final void c(String str) {
        k8l0 k8l0Var = this.a;
        hwk0 hwk0Var = k8l0Var.n;
        k8l0.j(hwk0Var);
        k8l0Var.k.getClass();
        hwk0Var.i(SystemClock.elapsedRealtime(), str);
    }

    @Override // defpackage.pfl0
    public final void d(String str) {
        k8l0 k8l0Var = this.a;
        hwk0 hwk0Var = k8l0Var.n;
        k8l0.j(hwk0Var);
        k8l0Var.k.getClass();
        hwk0Var.h(SystemClock.elapsedRealtime(), str);
    }

    @Override // defpackage.pfl0
    public final int e(String str) {
        nfl0 nfl0Var = this.b;
        nfl0Var.getClass();
        hm20.e(str);
        wok0 wok0Var = nfl0Var.a.d;
        return 25;
    }

    @Override // defpackage.pfl0
    public final Map f(String str, String str2, boolean z) {
        nfl0 nfl0Var = this.b;
        k8l0 k8l0Var = nfl0Var.a;
        p7l0 p7l0Var = k8l0Var.g;
        y4l0 y4l0Var = k8l0Var.f;
        k8l0.m(p7l0Var);
        if (p7l0Var.m()) {
            k8l0.m(y4l0Var);
            y4l0Var.f.a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (l9c.c()) {
            k8l0.m(y4l0Var);
            y4l0Var.f.a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        p7l0 p7l0Var2 = k8l0Var.g;
        k8l0.m(p7l0Var2);
        p7l0Var2.q(atomicReference, 5000L, "get user properties", new mdl0(nfl0Var, atomicReference, str, str2, z));
        List<zzpl> list = (List) atomicReference.get();
        if (list == null) {
            k8l0.m(y4l0Var);
            y4l0Var.f.b(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        ox0 ox0Var = new ox0(list.size());
        for (zzpl zzplVar : list) {
            Object objG0 = zzplVar.G0();
            if (objG0 != null) {
                ox0Var.put(zzplVar.b, objG0);
            }
        }
        return ox0Var;
    }

    @Override // defpackage.pfl0
    public final void g(String str, String str2, Bundle bundle) {
        nfl0 nfl0Var = this.a.m;
        k8l0.l(nfl0Var);
        nfl0Var.u(str, str2, bundle);
    }

    @Override // defpackage.pfl0
    public final List h(String str, String str2) {
        nfl0 nfl0Var = this.b;
        k8l0 k8l0Var = nfl0Var.a;
        p7l0 p7l0Var = k8l0Var.g;
        y4l0 y4l0Var = k8l0Var.f;
        k8l0.m(p7l0Var);
        if (p7l0Var.m()) {
            k8l0.m(y4l0Var);
            y4l0Var.f.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (l9c.c()) {
            k8l0.m(y4l0Var);
            y4l0Var.f.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        p7l0 p7l0Var2 = k8l0Var.g;
        k8l0.m(p7l0Var2);
        p7l0Var2.q(atomicReference, 5000L, "get conditional user properties", new ldl0(nfl0Var, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return yol0.W(list);
        }
        k8l0.m(y4l0Var);
        y4l0Var.f.b(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // defpackage.pfl0
    public final String zzh() {
        khl0 khl0Var = this.b.a.l;
        k8l0.l(khl0Var);
        igl0 igl0Var = khl0Var.c;
        if (igl0Var != null) {
            return igl0Var.a;
        }
        return null;
    }

    @Override // defpackage.pfl0
    public final String zzi() {
        khl0 khl0Var = this.b.a.l;
        k8l0.l(khl0Var);
        igl0 igl0Var = khl0Var.c;
        if (igl0Var != null) {
            return igl0Var.b;
        }
        return null;
    }

    @Override // defpackage.pfl0
    public final String zzj() {
        return (String) this.b.g.get();
    }

    @Override // defpackage.pfl0
    public final String zzk() {
        return this.b.v();
    }

    @Override // defpackage.pfl0
    public final long zzl() {
        yol0 yol0Var = this.a.i;
        k8l0.k(yol0Var);
        return yol0Var.d0();
    }
}
