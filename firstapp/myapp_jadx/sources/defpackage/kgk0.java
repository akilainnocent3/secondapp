package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class kgk0 implements x4l.a, x4l.b {
    public final sl0.f b;
    public final qn0 c;
    public final tfk0 d;
    public final int k;
    public final ihk0 l;
    public boolean m;
    public final /* synthetic */ y4l q;
    public final LinkedList a = new LinkedList();
    public final HashSet e = new HashSet();
    public final HashMap f = new HashMap();
    public final ArrayList n = new ArrayList();
    public ConnectionResult o = null;
    public int p = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public kgk0(y4l y4lVar, u4l u4lVar) {
        this.q = y4lVar;
        Looper looper = y4lVar.C.getLooper();
        hs7.a aVarA = u4lVar.a();
        hs7 hs7Var = new hs7(aVarA.a, aVarA.b, aVarA.c, aVarA.d);
        sl0.f fVarA = u4lVar.c.a.a(u4lVar.a, looper, hs7Var, u4lVar.d, this, this);
        String str = u4lVar.b;
        if (str != null && (fVarA instanceof r12)) {
            ((r12) fVarA).s = str;
        }
        this.b = fVarA;
        this.c = u4lVar.e;
        this.d = new tfk0();
        this.k = u4lVar.g;
        if (!fVarA.f()) {
            this.l = null;
            return;
        }
        Context context = y4lVar.e;
        ljk0 ljk0Var = y4lVar.C;
        hs7.a aVarA2 = u4lVar.a();
        this.l = new ihk0(context, ljk0Var, new hs7(aVarA2.a, aVarA2.b, aVarA2.c, aVarA2.d));
    }

    @Override // defpackage.lua
    public final void a() {
        Looper looperMyLooper = Looper.myLooper();
        ljk0 ljk0Var = this.q.C;
        if (looperMyLooper == ljk0Var.getLooper()) {
            h();
        } else {
            ljk0Var.post(new ggk0(this));
        }
    }

    @Override // defpackage.lua
    public final void b(int i) {
        Looper looperMyLooper = Looper.myLooper();
        ljk0 ljk0Var = this.q.C;
        if (looperMyLooper == ljk0Var.getLooper()) {
            i(i);
        } else {
            ljk0Var.post(new hgk0(this, i));
        }
    }

    public final void c(ConnectionResult connectionResult) {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        rik0 rik0Var = (rik0) it.next();
        if (scy.a(connectionResult, ConnectionResult.e)) {
            this.b.d();
        }
        rik0Var.getClass();
        throw null;
    }

    @Override // defpackage.yny
    public final void d(ConnectionResult connectionResult) {
        p(connectionResult, null);
    }

    public final void e(Status status) {
        hm20.d(this.q.C);
        f(status, null, false);
    }

    public final void f(Status status, Exception exc, boolean z) {
        hm20.d(this.q.C);
        if ((status == null) == (exc == null)) {
            hb5.a("Status XOR exception should be null");
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            nik0 nik0Var = (nik0) it.next();
            if (!z || nik0Var.a == 2) {
                if (status != null) {
                    nik0Var.a(status);
                } else {
                    nik0Var.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void g() {
        LinkedList linkedList = this.a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            nik0 nik0Var = (nik0) arrayList.get(i);
            if (!this.b.isConnected()) {
                return;
            }
            if (k(nik0Var)) {
                linkedList.remove(nik0Var);
            }
        }
    }

    public final void h() {
        sl0.f fVar = this.b;
        y4l y4lVar = this.q;
        hm20.d(y4lVar.C);
        this.o = null;
        c(ConnectionResult.e);
        ljk0 ljk0Var = y4lVar.C;
        if (this.m) {
            qn0 qn0Var = this.c;
            ljk0Var.removeMessages(11, qn0Var);
            ljk0Var.removeMessages(9, qn0Var);
            this.m = false;
        }
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            ehk0 ehk0Var = ((chk0) it.next()).a;
            try {
                ehk0Var.b.a.accept(fVar, new TaskCompletionSource());
            } catch (DeadObjectException unused) {
                b(3);
                fVar.b("DeadObjectException thrown while calling register listener method.");
            } catch (RemoteException unused2) {
                it.remove();
            }
        }
        g();
        j();
    }

    public final void i(int i) {
        y4l y4lVar = this.q;
        ljk0 ljk0Var = y4lVar.C;
        hm20.d(y4lVar.C);
        this.o = null;
        this.m = true;
        String strN = this.b.n();
        tfk0 tfk0Var = this.d;
        tfk0Var.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strN != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strN);
        }
        tfk0Var.a(true, new Status(20, sb.toString(), null, null));
        qn0 qn0Var = this.c;
        ljk0Var.sendMessageDelayed(Message.obtain(ljk0Var, 9, qn0Var), 5000L);
        ljk0Var.sendMessageDelayed(Message.obtain(ljk0Var, 11, qn0Var), 120000L);
        y4lVar.i.a.clear();
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            ((chk0) it.next()).getClass();
        }
    }

    public final void j() {
        y4l y4lVar = this.q;
        ljk0 ljk0Var = y4lVar.C;
        qn0 qn0Var = this.c;
        ljk0Var.removeMessages(12, qn0Var);
        ljk0Var.sendMessageDelayed(ljk0Var.obtainMessage(12, qn0Var), y4lVar.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k(nik0 nik0Var) {
        Feature feature;
        if (!(nik0Var instanceof rgk0)) {
            tfk0 tfk0Var = this.d;
            sl0.f fVar = this.b;
            nik0Var.d(tfk0Var, fVar.f());
            try {
                nik0Var.c(this);
                return true;
            } catch (DeadObjectException unused) {
                b(1);
                fVar.b("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        rgk0 rgk0Var = (rgk0) nik0Var;
        Feature[] featureArrG = rgk0Var.g(this);
        if (featureArrG == null || featureArrG.length == 0) {
            feature = null;
            break;
        }
        Feature[] featureArrM = this.b.m();
        if (featureArrM == null) {
            featureArrM = new Feature[0];
        }
        ox0 ox0Var = new ox0(featureArrM.length);
        for (Feature feature2 : featureArrM) {
            ox0Var.put(feature2.a, Long.valueOf(feature2.G0()));
        }
        int length = featureArrG.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                feature = null;
                break;
            }
            feature = featureArrG[i];
            Long l = (Long) ox0Var.get(feature.a);
            if (l == null || l.longValue() < feature.G0()) {
                break;
            }
            i++;
        }
        if (feature == null) {
            tfk0 tfk0Var2 = this.d;
            sl0.f fVar2 = this.b;
            nik0Var.d(tfk0Var2, fVar2.f());
            try {
                nik0Var.c(this);
                return true;
            } catch (DeadObjectException unused2) {
                b(1);
                fVar2.b("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.b.getClass().getName() + " could not execute call because it requires feature (" + feature.a + ", " + feature.G0() + ").");
        if (!this.q.D || !rgk0Var.f(this)) {
            rgk0Var.b(new jhh0(feature));
            return true;
        }
        lgk0 lgk0Var = new lgk0(this.c, feature);
        int iIndexOf = this.n.indexOf(lgk0Var);
        ArrayList arrayList = this.n;
        if (iIndexOf >= 0) {
            lgk0 lgk0Var2 = (lgk0) arrayList.get(iIndexOf);
            this.q.C.removeMessages(15, lgk0Var2);
            ljk0 ljk0Var = this.q.C;
            ljk0Var.sendMessageDelayed(Message.obtain(ljk0Var, 15, lgk0Var2), 5000L);
        } else {
            arrayList.add(lgk0Var);
            ljk0 ljk0Var2 = this.q.C;
            ljk0Var2.sendMessageDelayed(Message.obtain(ljk0Var2, 15, lgk0Var), 5000L);
            ljk0 ljk0Var3 = this.q.C;
            ljk0Var3.sendMessageDelayed(Message.obtain(ljk0Var3, 16, lgk0Var), 120000L);
            ConnectionResult connectionResult = new ConnectionResult(2, null);
            if (!l(connectionResult)) {
                this.q.c(connectionResult, this.k);
            }
        }
        return false;
    }

    public final boolean l(ConnectionResult connectionResult) {
        AtomicReference atomicReference;
        synchronized (y4l.G) {
            try {
                y4l y4lVar = this.q;
                if (y4lVar.z == null || !y4lVar.A.contains(this.c)) {
                    return false;
                }
                ufk0 ufk0Var = this.q.z;
                int i = this.k;
                ufk0Var.getClass();
                uik0 uik0Var = new uik0(connectionResult, i);
                loop0: do {
                    atomicReference = ufk0Var.b;
                    do {
                        if (atomicReference.compareAndSet(null, uik0Var)) {
                            ufk0Var.c.post(new bjk0(ufk0Var, uik0Var));
                            break loop0;
                        }
                    } while (atomicReference.get() == null);
                } while (atomicReference.get() == null);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean m(boolean z) {
        hm20.d(this.q.C);
        sl0.f fVar = this.b;
        if (!fVar.isConnected() || !this.f.isEmpty()) {
            return false;
        }
        tfk0 tfk0Var = this.d;
        if (tfk0Var.a.isEmpty() && tfk0Var.b.isEmpty()) {
            fVar.b("Timing out service connection.");
            return true;
        }
        if (!z) {
            return false;
        }
        j();
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [sl0$f, xhk0] */
    public final void n() {
        y4l y4lVar = this.q;
        hm20.d(y4lVar.C);
        sl0.f fVar = this.b;
        if (fVar.isConnected() || fVar.c()) {
            return;
        }
        try {
            pik0 pik0Var = y4lVar.i;
            Context context = y4lVar.e;
            SparseIntArray sparseIntArray = pik0Var.a;
            hm20.h(context);
            int iC = 0;
            if (fVar.e()) {
                int iL = fVar.l();
                int i = pik0Var.a.get(iL, -1);
                if (i != -1) {
                    iC = i;
                } else {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= sparseIntArray.size()) {
                            iC = -1;
                            break;
                        }
                        int iKeyAt = sparseIntArray.keyAt(i2);
                        if (iKeyAt > iL && sparseIntArray.get(iKeyAt) == 0) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (iC == -1) {
                        iC = pik0Var.b.c(context, iL);
                    }
                    sparseIntArray.put(iL, iC);
                }
            }
            if (iC != 0) {
                ConnectionResult connectionResult = new ConnectionResult(iC, null);
                Log.w("GoogleApiManager", "The service for " + fVar.getClass().getName() + " is not available: " + connectionResult.toString());
                p(connectionResult, null);
                return;
            }
            ngk0 ngk0Var = new ngk0(y4lVar, fVar, this.c);
            if (fVar.f()) {
                ihk0 ihk0Var = this.l;
                hm20.h(ihk0Var);
                Handler handler = ihk0Var.b;
                hs7 hs7Var = ihk0Var.e;
                xhk0 xhk0Var = ihk0Var.f;
                if (xhk0Var != null) {
                    xhk0Var.a();
                }
                hs7Var.h = Integer.valueOf(System.identityHashCode(ihk0Var));
                ihk0Var.f = ihk0Var.c.a(ihk0Var.a, handler.getLooper(), hs7Var, hs7Var.g, ihk0Var, ihk0Var);
                ihk0Var.k = ngk0Var;
                Set set = ihk0Var.d;
                if (set == null || set.isEmpty()) {
                    handler.post(new ghk0(ihk0Var));
                } else {
                    ihk0Var.f.g();
                }
            }
            try {
                fVar.j(ngk0Var);
            } catch (SecurityException e) {
                p(new ConnectionResult(10), e);
            }
        } catch (IllegalStateException e2) {
            p(new ConnectionResult(10), e2);
        }
    }

    public final void o(nik0 nik0Var) {
        hm20.d(this.q.C);
        boolean zIsConnected = this.b.isConnected();
        LinkedList linkedList = this.a;
        if (zIsConnected) {
            if (k(nik0Var)) {
                j();
                return;
            } else {
                linkedList.add(nik0Var);
                return;
            }
        }
        linkedList.add(nik0Var);
        ConnectionResult connectionResult = this.o;
        if (connectionResult == null || connectionResult.b == 0 || connectionResult.c == null) {
            n();
        } else {
            p(connectionResult, null);
        }
    }

    public final void p(ConnectionResult connectionResult, RuntimeException runtimeException) {
        xhk0 xhk0Var;
        hm20.d(this.q.C);
        ihk0 ihk0Var = this.l;
        if (ihk0Var != null && (xhk0Var = ihk0Var.f) != null) {
            xhk0Var.a();
        }
        hm20.d(this.q.C);
        this.o = null;
        this.q.i.a.clear();
        c(connectionResult);
        if ((this.b instanceof djk0) && connectionResult.b != 24) {
            y4l y4lVar = this.q;
            y4lVar.b = true;
            ljk0 ljk0Var = y4lVar.C;
            ljk0Var.sendMessageDelayed(ljk0Var.obtainMessage(19), 300000L);
        }
        if (connectionResult.b == 4) {
            e(y4l.F);
            return;
        }
        if (this.a.isEmpty()) {
            this.o = connectionResult;
            return;
        }
        y4l y4lVar2 = this.q;
        if (runtimeException != null) {
            hm20.d(y4lVar2.C);
            f(null, runtimeException, false);
            return;
        }
        boolean z = y4lVar2.D;
        qn0 qn0Var = this.c;
        if (!z) {
            e(y4l.d(qn0Var, connectionResult));
            return;
        }
        f(y4l.d(qn0Var, connectionResult), null, true);
        if (this.a.isEmpty() || l(connectionResult) || this.q.c(connectionResult, this.k)) {
            return;
        }
        if (connectionResult.b == 18) {
            this.m = true;
        }
        if (!this.m) {
            e(y4l.d(this.c, connectionResult));
            return;
        }
        y4l y4lVar3 = this.q;
        qn0 qn0Var2 = this.c;
        ljk0 ljk0Var2 = y4lVar3.C;
        ljk0Var2.sendMessageDelayed(Message.obtain(ljk0Var2, 9, qn0Var2), 5000L);
    }

    public final void q(ConnectionResult connectionResult) {
        hm20.d(this.q.C);
        sl0.f fVar = this.b;
        fVar.b("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(connectionResult));
        p(connectionResult, null);
    }

    public final void r() {
        hm20.d(this.q.C);
        Status status = y4l.E;
        e(status);
        tfk0 tfk0Var = this.d;
        tfk0Var.getClass();
        tfk0Var.a(false, status);
        for (yis.a aVar : (yis.a[]) this.f.keySet().toArray(new yis.a[0])) {
            o(new kik0(aVar, new TaskCompletionSource()));
        }
        c(new ConnectionResult(4));
        sl0.f fVar = this.b;
        if (fVar.isConnected()) {
            fVar.k(new jgk0(this));
        }
    }
}
