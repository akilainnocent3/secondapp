package defpackage;

import android.content.Context;
import android.os.Trace;
import com.google.android.gms.recaptchabase.WnDZ.CaxEybC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class fas {
    public dbj b;
    public final gas d;
    public c46 e;
    public Context f;
    public final HashMap g;
    public final HashSet<gas.a> h;
    public final Object a = new Object();
    public qis<Void> c = fcn.c.b;

    public fas() {
        gas gasVar;
        synchronized (gas.f) {
            try {
                gasVar = gas.g;
                if (gasVar == null) {
                    gasVar = new gas();
                    gas.g = gasVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d = gasVar;
        this.g = new HashMap();
        this.h = new HashSet<>();
    }

    public static z9s a(fas fasVar, ibs ibsVar, k36 k36Var, e6s e6sVar) {
        z9s z9sVarB;
        Collection collectionUnmodifiableCollection;
        boolean zContains;
        ona onaVar = ona.c;
        Trace.beginSection(sig0.d("CX:bindToLifecycle-internal"));
        try {
            kpf0.a();
            c46 c46Var = fasVar.e;
            c46Var.getClass();
            n26 n26VarC = k36Var.c(c46Var.a.c());
            n26VarC.getClass();
            n26VarC.p(true);
            rf rfVarC = fasVar.c(k36Var);
            pi1 pi1Var = ((j16.a) rfVarC.d).N;
            String strD = rfVarC.a.d();
            strD.getClass();
            k26 k26Var = new k26(b.l(strD), pi1Var);
            gas gasVar = fasVar.d;
            synchronized (gasVar.a) {
                z9sVarB = (z9s) gasVar.b.get(new ij1(System.identityHashCode(ibsVar), k26Var));
            }
            gas gasVar2 = fasVar.d;
            synchronized (gasVar2.a) {
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(gasVar2.b.values());
            }
            for (pnh0 pnh0Var : e6sVar.e) {
                for (Object obj : collectionUnmodifiableCollection) {
                    obj.getClass();
                    z9s z9sVar = (z9s) obj;
                    synchronized (z9sVar.a) {
                        zContains = ((ArrayList) z9sVar.c.x()).contains(pnh0Var);
                    }
                    if (zContains && !z9sVar.j().equals(ibsVar)) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{pnh0Var}, 1)));
                    }
                }
            }
            if (z9sVarB == null) {
                gas gasVar3 = fasVar.d;
                c46 c46Var2 = fasVar.e;
                c46Var2.getClass();
                w36 w36Var = c46Var2.k;
                if (w36Var == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                z9sVarB = gasVar3.b(ibsVar, new v36(n26VarC, null, rfVarC, null, onaVar, onaVar, w36Var.b, w36Var.d, w36Var.c));
            }
            if (!e6sVar.e.isEmpty()) {
                gas gasVar4 = fasVar.d;
                c46 c46Var3 = fasVar.e;
                c46Var3.getClass();
                g26 g26Var = c46Var3.g;
                if (g26Var == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                gasVar4.a(z9sVarB, e6sVar, g26Var.f());
                fasVar.h.add(new ij1(System.identityHashCode(ibsVar), k26Var));
            }
            Trace.endSection();
            return z9sVarB;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final h16 b(k36 k36Var, m26 m26Var) {
        Iterator<h26> it = k36Var.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().getClass();
            pi1 pi1Var = h26.a;
            if (!Intrinsics.g(pi1Var, pi1Var)) {
                synchronized (e2h.a) {
                }
                this.f.getClass();
            }
        }
        return j16.a;
    }

    public final void d(int i) {
        c46 c46Var = this.e;
        if (c46Var == null) {
            return;
        }
        g26 g26Var = c46Var.g;
        if (g26Var == null) {
            ib5.a("CameraX not initialized yet.");
            return;
        }
        qw5 qw5VarF = g26Var.f();
        synchronized (qw5VarF.a) {
            try {
                int i2 = qw5VarF.g;
                if (i == i2) {
                    return;
                }
                qw5VarF.g = i;
                ArrayList arrayList = new ArrayList(qw5VarF.c);
                if (i2 == 2 && i != 2) {
                    qw5VarF.f.clear();
                }
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((o16.a) obj).a(i2, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        Trace.beginSection(sig0.d("CX:unbindAll"));
        try {
            kpf0.a();
            d(0);
            this.d.i(this.h);
            Unit unit = Unit.a;
        } finally {
            Trace.endSection();
        }
    }

    public final rf c(k36 k36Var) {
        Object rfVar;
        Trace.beginSection(sig0.d(CaxEybC.dpwMplqCE));
        try {
            c46 c46Var = this.e;
            c46Var.getClass();
            m26 m26VarH = k36Var.c(c46Var.a.c()).h();
            m26VarH.getClass();
            h16 h16VarB = b(k36Var, m26VarH);
            String strD = m26VarH.d();
            strD.getClass();
            k26 k26Var = new k26(b.l(strD), ((j16.a) h16VarB).N);
            synchronized (this.a) {
                try {
                    rfVar = this.g.get(k26Var);
                    if (rfVar == null) {
                        rfVar = new rf(m26VarH, h16VarB);
                        this.g.put(k26Var, rfVar);
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            rf rfVar2 = (rf) rfVar;
            Trace.endSection();
            return rfVar2;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }
}
