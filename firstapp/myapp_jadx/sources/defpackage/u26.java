package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class u26 implements q26.b {
    public final CameraManager a;
    public final Object b;

    public static final class a {
        public final HashMap a = new HashMap();
        public final Handler b;

        public a(Handler handler) {
            this.b = handler;
        }
    }

    public u26(Context context, a aVar) {
        this.a = (CameraManager) context.getSystemService("camera");
        this.b = aVar;
    }

    @Override // q26.b
    public void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        q26.a aVar;
        if (executor == null) {
            hb5.a("executor was null");
            return;
        }
        a aVar2 = (a) this.b;
        synchronized (aVar2.a) {
            try {
                aVar = (q26.a) aVar2.a.get(availabilityCallback);
                if (aVar == null) {
                    aVar = new q26.a(executor, availabilityCallback);
                    aVar2.a.put(availabilityCallback, aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.registerAvailabilityCallback(aVar, aVar2.b);
    }

    @Override // q26.b
    public CameraCharacteristics b(String str) throws rz5 {
        try {
            return this.a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw new rz5(e);
        }
    }

    @Override // q26.b
    public Set<Set<String>> c() {
        return Collections.EMPTY_SET;
    }

    @Override // q26.b
    public void d(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws rz5 {
        executor.getClass();
        stateCallback.getClass();
        try {
            this.a.openCamera(str, new p16.b(executor, stateCallback), ((a) this.b).b);
        } catch (CameraAccessException e) {
            throw new rz5(e);
        }
    }

    @Override // q26.b
    public void e(CameraManager.AvailabilityCallback availabilityCallback) {
        q26.a aVar;
        if (availabilityCallback != null) {
            a aVar2 = (a) this.b;
            synchronized (aVar2.a) {
                aVar = (q26.a) aVar2.a.remove(availabilityCallback);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            synchronized (aVar.c) {
                aVar.d = true;
            }
        }
        this.a.unregisterAvailabilityCallback(aVar);
    }
}
