package defpackage;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class uf6 {
    public final od80 a;
    public final Object b = new Object();
    public final LinkedHashSet c = new LinkedHashSet();
    public final LinkedHashSet d = new LinkedHashSet();
    public final LinkedHashSet e = new LinkedHashSet();
    public final a f = new a();

    public uf6(od80 od80Var) {
        this.a = od80Var;
    }

    public final ArrayList a() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList(this.c);
        }
        return arrayList;
    }

    public final ArrayList b() {
        ArrayList arrayList;
        ArrayList arrayList2;
        synchronized (this.b) {
            arrayList = new ArrayList();
            arrayList.addAll(a());
            synchronized (this.b) {
                arrayList2 = new ArrayList(this.e);
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    public class a extends CameraDevice.StateCallback {
        public a() {
        }

        public final void a() {
            ArrayList arrayListB;
            synchronized (uf6.this.b) {
                arrayListB = uf6.this.b();
                uf6.this.e.clear();
                uf6.this.c.clear();
                uf6.this.d.clear();
            }
            int size = arrayListB.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListB.get(i);
                i++;
                ((ape0) obj).b();
            }
        }

        public final void b() {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (uf6.this.b) {
                linkedHashSet.addAll(uf6.this.e);
                linkedHashSet.addAll(uf6.this.c);
            }
            uf6.this.a.execute(new Runnable() { // from class: sf6
                @Override // java.lang.Runnable
                public final void run() {
                    for (ape0 ape0Var : linkedHashSet) {
                        ape0Var.j().n(ape0Var);
                    }
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(CameraDevice cameraDevice) {
            b();
            a();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
            b();
            a();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, final int i) {
            b();
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (uf6.this.b) {
                linkedHashSet.addAll(uf6.this.e);
                linkedHashSet.addAll(uf6.this.c);
            }
            uf6.this.a.execute(new Runnable() { // from class: tf6
                @Override // java.lang.Runnable
                public final void run() {
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        ((ape0) it.next()).d(i);
                    }
                }
            });
            a();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
        }
    }
}
