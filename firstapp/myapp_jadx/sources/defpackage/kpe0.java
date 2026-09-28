package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class kpe0 extends hpe0 {
    public final adl o;
    public final Object p;
    public ArrayList q;
    public vhs r;
    public final osi s;
    public final nsi t;
    public final cb50 u;
    public final bh80 v;
    public final AtomicBoolean w;

    public kpe0(uf6 uf6Var, adl adlVar, yj30 yj30Var, yj30 yj30Var2, od80 od80Var, Handler handler) {
        super(uf6Var, od80Var, adlVar, handler);
        this.p = new Object();
        this.w = new AtomicBoolean(false);
        this.s = new osi(yj30Var, yj30Var2);
        this.u = new cb50(yj30Var.a(CaptureSessionStuckQuirk.class) || yj30Var.a(IncorrectCaptureStateQuirk.class));
        this.t = new nsi(yj30Var2);
        this.v = new bh80(yj30Var2);
        this.o = adlVar;
    }

    @Override // defpackage.hpe0, defpackage.ape0
    public final void b() {
        synchronized (this.a) {
            try {
                List<ijd> list = this.k;
                if (list != null) {
                    mjd.a(list);
                    this.k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.u.c();
    }

    @Override // defpackage.ape0
    public final int c(List list, sz5 sz5Var) {
        CameraCaptureSession.CaptureCallback captureCallbackA = this.u.a(sz5Var);
        km20.f(this.g, "Need to call openCaptureSession before using this API.");
        g06 g06Var = this.g;
        return g06Var.a.c(list, this.d, captureCallbackA);
    }

    @Override // defpackage.ape0
    public final void close() {
        if (!this.w.compareAndSet(false, true)) {
            w("close() has been called. Skip this invocation.");
            return;
        }
        if (this.v.a) {
            try {
                w("Call abortCaptures() before closing session.");
                km20.f(this.g, "Need to call openCaptureSession before using this API.");
                this.g.a.a.abortCaptures();
            } catch (Exception e) {
                w("Exception when calling abortCaptures()" + e);
            }
        }
        w("Session call close()");
        this.u.b().k(new Runnable() { // from class: ipe0
            @Override // java.lang.Runnable
            public final void run() {
                final kpe0 kpe0Var = this.a;
                kpe0Var.w("Session call super.close()");
                km20.f(kpe0Var.g, "Need to call openCaptureSession before using this API.");
                uf6 uf6Var = kpe0Var.b;
                synchronized (uf6Var.b) {
                    uf6Var.d.add(kpe0Var);
                }
                kpe0Var.g.a.a.close();
                kpe0Var.d.execute(new Runnable() { // from class: cpe0
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // java.lang.Runnable
                    public final void run() {
                        hpe0 hpe0Var = kpe0Var;
                        hpe0Var.r(hpe0Var);
                    }
                });
            }
        }, this.d);
    }

    @Override // defpackage.ape0
    public final void d(int i) {
        if (i == 5) {
            synchronized (this.p) {
                try {
                    if (u() && this.q != null) {
                        w("Close DeferrableSurfaces for CameraDevice error.");
                        ArrayList arrayList = this.q;
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            ((ijd) obj).a();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.ape0
    public final int f(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        CameraCaptureSession.CaptureCallback captureCallbackA = this.u.a(captureCallback);
        km20.f(this.g, "Need to call openCaptureSession before using this API.");
        g06 g06Var = this.g;
        return g06Var.a.a(captureRequest, this.d, captureCallbackA);
    }

    @Override // defpackage.ape0
    public final nv5.d k() {
        return nv5.a(new hbj(this.u.b(), this.o, 1500L));
    }

    @Override // defpackage.hpe0, ape0.b
    public final void n(final ape0 ape0Var) {
        nv5.d dVar;
        synchronized (this.p) {
            this.s.a(this.q);
        }
        w("onClosed()");
        synchronized (this.a) {
            try {
                if (this.l) {
                    dVar = null;
                } else {
                    this.l = true;
                    km20.f(this.h, "Need to call openCaptureSession before using this API.");
                    dVar = this.h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        b();
        if (dVar != null) {
            dVar.b.k(new Runnable() { // from class: epe0
                @Override // java.lang.Runnable
                public final void run() {
                    hpe0 hpe0Var = this;
                    ape0 ape0Var2 = ape0Var;
                    uf6 uf6Var = hpe0Var.b;
                    synchronized (uf6Var.b) {
                        uf6Var.c.remove(hpe0Var);
                        uf6Var.d.remove(hpe0Var);
                    }
                    hpe0Var.r(ape0Var2);
                    if (hpe0Var.g != null) {
                        Objects.requireNonNull(hpe0Var.f);
                        hpe0Var.f.n(ape0Var2);
                    } else {
                        pgt.i("SyncCaptureSessionBase", "[" + hpe0Var + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
                    }
                }
            }, nqe.a());
        }
    }

    @Override // defpackage.hpe0, ape0.b
    public final void p(ape0 ape0Var) {
        ArrayList arrayList;
        w("Session onConfigured()");
        nsi nsiVar = this.t;
        uf6 uf6Var = this.b;
        synchronized (uf6Var.b) {
            arrayList = new ArrayList(uf6Var.e);
        }
        ArrayList arrayListA = this.b.a();
        int i = 0;
        if (nsiVar.a != null) {
            LinkedHashSet<ape0> linkedHashSet = new LinkedHashSet();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ape0 ape0Var2 = (ape0) obj;
                if (ape0Var2 == ape0Var) {
                    break;
                } else {
                    linkedHashSet.add(ape0Var2);
                }
            }
            for (ape0 ape0Var3 : linkedHashSet) {
                ape0Var3.j().o(ape0Var3);
            }
        }
        Objects.requireNonNull(this.f);
        uf6 uf6Var2 = this.b;
        synchronized (uf6Var2.b) {
            uf6Var2.c.add(this);
            uf6Var2.e.remove(this);
        }
        ArrayList arrayListB = uf6Var2.b();
        int size2 = arrayListB.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayListB.get(i3);
            i3++;
            ape0 ape0Var4 = (ape0) obj2;
            if (ape0Var4 == this) {
                break;
            } else {
                ape0Var4.b();
            }
        }
        this.f.p(ape0Var);
        if (nsiVar.a != null) {
            LinkedHashSet<ape0> linkedHashSet2 = new LinkedHashSet();
            int size3 = arrayListA.size();
            while (i < size3) {
                Object obj3 = arrayListA.get(i);
                i++;
                ape0 ape0Var5 = (ape0) obj3;
                if (ape0Var5 == ape0Var) {
                    break;
                } else {
                    linkedHashSet2.add(ape0Var5);
                }
            }
            for (ape0 ape0Var6 : linkedHashSet2) {
                ape0Var6.j().n(ape0Var6);
            }
        }
    }

    @Override // defpackage.hpe0
    public final qis v(ArrayList arrayList) {
        qis qisVarV;
        synchronized (this.p) {
            this.q = arrayList;
            qisVarV = super.v(arrayList);
        }
        return qisVarV;
    }

    public final void w(String str) {
        pgt.a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    public final qis<Void> x(final CameraDevice cameraDevice, final ag80 ag80Var, final List<ijd> list) {
        qis<Void> qisVarD;
        synchronized (this.p) {
            try {
                ArrayList arrayListA = this.b.a();
                ArrayList arrayList = new ArrayList();
                int size = arrayListA.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListA.get(i);
                    i++;
                    arrayList.add(((ape0) obj).k());
                }
                vhs vhsVar = new vhs(new ArrayList(arrayList), false, nqe.a());
                this.r = vhsVar;
                qisVarD = obj.d(obj.g(dbj.a(vhsVar), new wz0() { // from class: jpe0
                    @Override // defpackage.wz0
                    public final qis apply(Object obj2) {
                        final kpe0 kpe0Var = this.a;
                        CameraDevice cameraDevice2 = cameraDevice;
                        final ag80 ag80Var2 = ag80Var;
                        final List list2 = list;
                        if (kpe0Var.v.a) {
                            ArrayList arrayListA2 = kpe0Var.b.a();
                            int size2 = arrayListA2.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                Object obj3 = arrayListA2.get(i2);
                                i2++;
                                ((ape0) obj3).close();
                            }
                        }
                        kpe0Var.w("start openCaptureSession");
                        synchronized (kpe0Var.a) {
                            try {
                                if (kpe0Var.m) {
                                    return new fcn.a(new CancellationException("Opener is disabled"));
                                }
                                uf6 uf6Var = kpe0Var.b;
                                synchronized (uf6Var.b) {
                                    uf6Var.e.add(kpe0Var);
                                }
                                final p16 p16Var = new p16(cameraDevice2, kpe0Var.c);
                                nv5.d dVarA = nv5.a(new nv5.c() { // from class: dpe0
                                    @Override // nv5.c
                                    public final Object a(nv5.a aVar) {
                                        String str;
                                        hpe0 hpe0Var = kpe0Var;
                                        List<ijd> list3 = list2;
                                        p16 p16Var2 = p16Var;
                                        ag80 ag80Var3 = ag80Var2;
                                        synchronized (hpe0Var.a) {
                                            synchronized (hpe0Var.a) {
                                                synchronized (hpe0Var.a) {
                                                    try {
                                                        List<ijd> list4 = hpe0Var.k;
                                                        if (list4 != null) {
                                                            mjd.a(list4);
                                                            hpe0Var.k = null;
                                                        }
                                                    } catch (Throwable th) {
                                                        throw th;
                                                    }
                                                }
                                                mjd.b(list3);
                                                hpe0Var.k = list3;
                                            }
                                            km20.g("The openCaptureSessionCompleter can only set once!", hpe0Var.i == null);
                                            hpe0Var.i = aVar;
                                            p16Var2.a.a(ag80Var3);
                                            str = "openCaptureSession[session=" + hpe0Var + "]";
                                        }
                                        return str;
                                    }
                                });
                                kpe0Var.h = dVarA;
                                fpe0 fpe0Var = new fpe0(kpe0Var);
                                dVarA.k(new obj.b(dVarA, fpe0Var), nqe.a());
                                return obj.d(kpe0Var.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }, this.d));
            } catch (Throwable th) {
                throw th;
            }
        }
        return qisVarD;
    }

    public final boolean y() {
        boolean z;
        synchronized (this.p) {
            try {
                if (u()) {
                    this.s.a(this.q);
                } else {
                    vhs vhsVar = this.r;
                    if (vhsVar != null) {
                        vhsVar.cancel(true);
                    }
                }
                dbj dbjVar = null;
                try {
                    synchronized (this.a) {
                        try {
                            if (!this.m) {
                                dbj dbjVar2 = this.j;
                                dbjVar = dbjVar2 != null ? dbjVar2 : null;
                                this.m = true;
                            }
                            z = !u();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (dbjVar != null) {
                        dbjVar.cancel(true);
                    }
                } catch (Throwable th2) {
                    if (dbjVar != null) {
                        dbjVar.cancel(true);
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z;
    }
}
