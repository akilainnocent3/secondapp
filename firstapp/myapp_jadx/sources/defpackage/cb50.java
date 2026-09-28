package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class cb50 {
    public final boolean a;
    public final List<qis<Void>> b = Collections.synchronizedList(new ArrayList());

    public static class a extends CameraCaptureSession.CaptureCallback {
        public final nv5.d a;
        public nv5.a<Void> b;

        public a() {
            nv5.a<Void> aVar = new nv5.a<>();
            nv5.d<T> dVar = new nv5.d<>(aVar);
            aVar.b = dVar;
            aVar.a = ew5.class;
            try {
                this.b = aVar;
                aVar.a = "RequestCompleteListener[" + this + "]";
            } catch (Exception e) {
                dVar.a(e);
            }
            this.a = dVar;
        }

        public final void a() {
            nv5.a<Void> aVar = this.b;
            if (aVar != null) {
                aVar.b(null);
                this.b = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
            a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            a();
        }
    }

    public cb50(boolean z) {
        this.a = z;
    }

    public final CameraCaptureSession.CaptureCallback a(CameraCaptureSession.CaptureCallback captureCallback) {
        if (!this.a) {
            return captureCallback;
        }
        final a aVar = new a();
        List<qis<Void>> list = this.b;
        final nv5.d dVar = aVar.a;
        list.add(dVar);
        Log.d("RequestMonitor", "RequestListener " + aVar + " monitoring " + this);
        dVar.b.k(new Runnable() { // from class: ab50
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sb = new StringBuilder("RequestListener ");
                sb.append(aVar);
                sb.append(" done ");
                cb50 cb50Var = this.a;
                sb.append(cb50Var);
                Log.d("RequestMonitor", sb.toString());
                cb50Var.b.remove(dVar);
            }
        }, nqe.a());
        return new yx5(Arrays.asList(aVar, captureCallback));
    }

    public final qis<Void> b() {
        List<qis<Void>> list = this.b;
        if (list.isEmpty()) {
            return fcn.c.b;
        }
        vhs vhsVar = new vhs(new ArrayList(new ArrayList(list)), false, nqe.a());
        bb50 bb50Var = new bb50();
        return obj.d(obj.g(vhsVar, new nbj(bb50Var), nqe.a()));
    }

    public final void c() {
        LinkedList linkedList = new LinkedList(this.b);
        while (!linkedList.isEmpty()) {
            qis qisVar = (qis) linkedList.poll();
            Objects.requireNonNull(qisVar);
            qisVar.cancel(true);
        }
    }
}
