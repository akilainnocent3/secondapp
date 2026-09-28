package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public class hpe0 extends ape0.b implements ape0 {
    public final uf6 b;
    public final Handler c;
    public final od80 d;
    public final adl e;
    public lpe0 f;
    public g06 g;
    public nv5.d h;
    public nv5.a<Void> i;
    public dbj j;
    public final Object a = new Object();
    public List<ijd> k = null;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;

    public hpe0(uf6 uf6Var, od80 od80Var, adl adlVar, Handler handler) {
        this.b = uf6Var;
        this.c = handler;
        this.d = od80Var;
        this.e = adlVar;
    }

    @Override // defpackage.ape0
    public final void a() throws CameraAccessException {
        km20.f(this.g, "Need to call openCaptureSession before using this API.");
        this.g.a.a.stopRepeating();
    }

    @Override // defpackage.ape0
    public void b() {
        throw null;
    }

    @Override // defpackage.ape0
    public final CameraDevice e() {
        this.g.getClass();
        return this.g.a.a.getDevice();
    }

    @Override // defpackage.ape0
    public final List<CaptureRequest> g(CaptureRequest captureRequest) {
        g06 g06Var = this.g;
        g06Var.getClass();
        CameraCaptureSession cameraCaptureSession = g06Var.a.a;
        return cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession ? ((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession).createHighSpeedRequestList(captureRequest) : Collections.EMPTY_LIST;
    }

    @Override // defpackage.ape0
    public final int h(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        km20.f(this.g, "Need to call openCaptureSession before using this API.");
        g06 g06Var = this.g;
        return g06Var.a.b(list, this.d, captureCallback);
    }

    @Override // defpackage.ape0
    public final g06 i() {
        this.g.getClass();
        return this.g;
    }

    @Override // ape0.b
    public final void l(ape0 ape0Var) {
        Objects.requireNonNull(this.f);
        this.f.l(ape0Var);
    }

    @Override // ape0.b
    public final void m(ape0 ape0Var) {
        Objects.requireNonNull(this.f);
        this.f.m(ape0Var);
    }

    @Override // ape0.b
    public void n(ape0 ape0Var) {
        throw null;
    }

    @Override // ape0.b
    public final void o(ape0 ape0Var) {
        Objects.requireNonNull(this.f);
        b();
        uf6 uf6Var = this.b;
        ArrayList arrayListB = uf6Var.b();
        int size = arrayListB.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListB.get(i);
            i++;
            ape0 ape0Var2 = (ape0) obj;
            if (ape0Var2 == this) {
                break;
            } else {
                ape0Var2.b();
            }
        }
        synchronized (uf6Var.b) {
            uf6Var.e.remove(this);
        }
        this.f.o(ape0Var);
    }

    @Override // ape0.b
    public void p(ape0 ape0Var) {
        throw null;
    }

    @Override // ape0.b
    public final void q(ape0 ape0Var) {
        Objects.requireNonNull(this.f);
        this.f.q(ape0Var);
    }

    @Override // ape0.b
    public final void r(final ape0 ape0Var) {
        nv5.d dVar;
        synchronized (this.a) {
            try {
                if (this.n) {
                    dVar = null;
                } else {
                    this.n = true;
                    km20.f(this.h, "Need to call openCaptureSession before using this API.");
                    dVar = this.h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (dVar != null) {
            dVar.b.k(new Runnable() { // from class: bpe0
                @Override // java.lang.Runnable
                public final void run() {
                    hpe0 hpe0Var = this.a;
                    Objects.requireNonNull(hpe0Var.f);
                    hpe0Var.f.r(ape0Var);
                }
            }, nqe.a());
        }
    }

    @Override // ape0.b
    public final void s(ape0 ape0Var, Surface surface) {
        Objects.requireNonNull(this.f);
        this.f.s(ape0Var, surface);
    }

    public final void t(CameraCaptureSession cameraCaptureSession) {
        if (this.g == null) {
            this.g = new g06(cameraCaptureSession, this.c);
        }
    }

    public final boolean u() {
        boolean z;
        synchronized (this.a) {
            z = this.h != null;
        }
        return z;
    }

    public qis v(ArrayList arrayList) {
        synchronized (this.a) {
            try {
                if (this.m) {
                    return new fcn.a(new CancellationException("Opener is disabled"));
                }
                pw6 pw6VarG = obj.g(dbj.a(mjd.c(arrayList, this.d, this.e)), new ota(this, arrayList), this.d);
                this.j = pw6VarG;
                return obj.d(pw6VarG);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ape0
    public final hpe0 j() {
        return this;
    }
}
