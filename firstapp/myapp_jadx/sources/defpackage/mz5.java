package defpackage;

import android.hardware.camera2.CameraManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class mz5 extends d2 {
    public final q26 f;
    public final Executor g;
    public a h;

    public static final class a extends CameraManager.AvailabilityCallback {
        public a() {
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAccessPrioritiesChanged() {
            Log.d("Camera2PresenceSrc", "System onCameraAccessPrioritiesChanged.");
            obj.h(mz5.this.a());
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAvailable(String str) {
            str.getClass();
            Log.d("Camera2PresenceSrc", "System onCameraAvailable: ".concat(str));
            obj.h(mz5.this.a());
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraUnavailable(String str) {
            str.getClass();
            Log.d("Camera2PresenceSrc", "System onCameraUnavailable: ".concat(str));
            obj.h(mz5.this.a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz5(List<String> list, q26 q26Var, Executor executor) {
        super(list);
        list.getClass();
        executor.getClass();
        this.f = q26Var;
        this.g = executor;
    }

    @Override // defpackage.tcy
    public final qis<List<k26>> a() {
        final nv5.a aVar = new nv5.a();
        nv5.d<T> dVar = new nv5.d<>(aVar);
        aVar.b = dVar;
        aVar.a = ew5.class;
        try {
            this.g.execute(new Runnable() { // from class: lz5
                @Override // java.lang.Runnable
                public final void run() {
                    mz5 mz5Var = this.a;
                    nv5.a aVar2 = aVar;
                    try {
                        String[] strArrC = mz5Var.f.c();
                        strArrC.getClass();
                        ArrayList arrayList = new ArrayList(strArrC.length);
                        for (String str : strArrC) {
                            str.getClass();
                            arrayList.add(new k26(b.l(str), null));
                        }
                        Log.d("Camera2PresenceSrc", "[FetchData] Refreshed camera list: " + CollectionsKt.a0(arrayList, null, null, null, null, 63));
                        mz5Var.f(arrayList, null);
                        aVar2.b(arrayList);
                    } catch (rz5 e) {
                        Log.e("Camera2PresenceSrc", "[FetchData] Failed to get camera list for refresh.", e);
                        r36 r36Var = new r36(e);
                        mz5Var.f(null, r36Var);
                        aVar2.d(r36Var);
                    }
                }
            });
            aVar.a = "FetchData for CameraAvailability";
        } catch (Exception e) {
            dVar.a(e);
        }
        return dVar;
    }

    @Override // defpackage.d2
    public final void d() {
        if (this.h != null) {
            Log.w("Camera2PresenceSrc", "Monitoring already started. Unregistering existing callback.");
            e();
        }
        Log.i("Camera2PresenceSrc", "Starting system availability monitoring.");
        a aVar = new a();
        this.h = aVar;
        this.f.a.a(this.g, aVar);
        obj.h(a());
    }

    @Override // defpackage.d2
    public final void e() {
        Log.i("Camera2PresenceSrc", "Stopping system availability monitoring.");
        a aVar = this.h;
        if (aVar != null) {
            try {
                this.f.a.e(aVar);
                Unit unit = Unit.a;
            } catch (Exception e) {
                Log.w("Camera2PresenceSrc", "Failed to unregister system availability callback.", e);
            } finally {
                this.h = null;
            }
        }
    }
}
