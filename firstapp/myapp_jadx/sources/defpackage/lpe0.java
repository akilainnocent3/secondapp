package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lpe0 extends ape0.b {
    public final ArrayList a;

    public lpe0(List<ape0.b> list) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.addAll(list);
    }

    @Override // ape0.b
    public final void l(ape0 ape0Var) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ape0.b) obj).l(ape0Var);
        }
    }

    @Override // ape0.b
    public final void m(ape0 ape0Var) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ape0.b) obj).m(ape0Var);
        }
    }

    @Override // ape0.b
    public final void n(ape0 ape0Var) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ape0.b) obj).n(ape0Var);
        }
    }

    @Override // ape0.b
    public final void o(ape0 ape0Var) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ape0.b) obj).o(ape0Var);
        }
    }

    @Override // ape0.b
    public final void p(ape0 ape0Var) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ape0.b) obj).p(ape0Var);
        }
    }

    @Override // ape0.b
    public final void q(ape0 ape0Var) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ape0.b) obj).q(ape0Var);
        }
    }

    @Override // ape0.b
    public final void r(ape0 ape0Var) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ape0.b) obj).r(ape0Var);
        }
    }

    @Override // ape0.b
    public final void s(ape0 ape0Var, Surface surface) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ape0.b) obj).s(ape0Var, surface);
        }
    }

    public static class a extends ape0.b {
        public final CameraCaptureSession.StateCallback a;

        public a(List<CameraCaptureSession.StateCallback> list) {
            this.a = list.isEmpty() ? new y06() : list.size() == 1 ? list.get(0) : new x06(list);
        }

        @Override // ape0.b
        public final void l(ape0 ape0Var) {
            this.a.onActive(ape0Var.i().a.a);
        }

        @Override // ape0.b
        public final void m(ape0 ape0Var) {
            lm0.a(this.a, ape0Var.i().a.a);
        }

        @Override // ape0.b
        public final void n(ape0 ape0Var) {
            this.a.onClosed(ape0Var.i().a.a);
        }

        @Override // ape0.b
        public final void o(ape0 ape0Var) {
            this.a.onConfigureFailed(ape0Var.i().a.a);
        }

        @Override // ape0.b
        public final void p(ape0 ape0Var) {
            this.a.onConfigured(ape0Var.i().a.a);
        }

        @Override // ape0.b
        public final void q(ape0 ape0Var) {
            this.a.onReady(ape0Var.i().a.a);
        }

        @Override // ape0.b
        public final void s(ape0 ape0Var, Surface surface) {
            this.a.onSurfacePrepared(ape0Var.i().a.a, surface);
        }

        @Override // ape0.b
        public final void r(ape0 ape0Var) {
        }
    }
}
