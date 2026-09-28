package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class q26 {
    public final u26 a;
    public final ArrayMap b = new ArrayMap(4);

    public static final class a extends CameraManager.AvailabilityCallback {
        public final Executor a;
        public final CameraManager.AvailabilityCallback b;
        public final Object c = new Object();
        public boolean d = false;

        public a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.a = executor;
            this.b = availabilityCallback;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAccessPrioritiesChanged() {
            synchronized (this.c) {
                try {
                    if (!this.d) {
                        this.a.execute(new o26(this, 0));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAvailable(String str) {
            synchronized (this.c) {
                try {
                    if (!this.d) {
                        this.a.execute(new lq0(1, this, str));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraUnavailable(final String str) {
            synchronized (this.c) {
                try {
                    if (!this.d) {
                        final int i = 0;
                        this.a.execute(new Runnable() { // from class: p26
                            /* JADX WARN: Code duplicated, block: B:22:0x0044  */
                            /* JADX WARN: Code duplicated, block: B:23:0x0046  */
                            /* JADX WARN: Code duplicated, block: B:24:0x0048  */
                            /* JADX WARN: Code duplicated, block: B:26:0x004f  */
                            /* JADX WARN: Code duplicated, block: B:27:0x0051  */
                            /* JADX WARN: Code duplicated, block: B:29:0x0057  */
                            /* JADX WARN: Code duplicated, block: B:30:0x0059  */
                            /* JADX WARN: Code duplicated, block: B:31:0x005b  */
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i2 = i;
                                Object obj = str;
                                Object obj2 = this;
                                switch (i2) {
                                    case 0:
                                        ((q26.a) obj2).b.onCameraUnavailable((String) obj);
                                        break;
                                    default:
                                        Context context = (Context) obj;
                                        tox toxVar = tox.this;
                                        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                                        int i3 = 0;
                                        if (connectivityManager != null) {
                                            try {
                                                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                                                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                                                    i3 = 1;
                                                } else {
                                                    int type = activeNetworkInfo.getType();
                                                    if (type == 0) {
                                                        switch (activeNetworkInfo.getSubtype()) {
                                                            case 1:
                                                            case 2:
                                                                i3 = 3;
                                                                break;
                                                            case 3:
                                                            case 4:
                                                            case 5:
                                                            case 6:
                                                            case 7:
                                                            case 8:
                                                            case 9:
                                                            case 10:
                                                            case 11:
                                                            case 12:
                                                            case 14:
                                                            case 15:
                                                            case 17:
                                                                i3 = 4;
                                                                break;
                                                            case 13:
                                                                i3 = 5;
                                                                break;
                                                            case 16:
                                                            case 19:
                                                            default:
                                                                i3 = 6;
                                                                break;
                                                            case 18:
                                                                i3 = 2;
                                                                break;
                                                            case 20:
                                                                if (Build.VERSION.SDK_INT >= 29) {
                                                                    i3 = 9;
                                                                }
                                                                break;
                                                        }
                                                    } else if (type == 1) {
                                                        i3 = 2;
                                                    } else if (type == 4 || type == 5) {
                                                        switch (activeNetworkInfo.getSubtype()) {
                                                            case 1:
                                                            case 2:
                                                                i3 = 3;
                                                                break;
                                                            case 3:
                                                            case 4:
                                                            case 5:
                                                            case 6:
                                                            case 7:
                                                            case 8:
                                                            case 9:
                                                            case 10:
                                                            case 11:
                                                            case 12:
                                                            case 14:
                                                            case 15:
                                                            case 17:
                                                                i3 = 4;
                                                                break;
                                                            case 13:
                                                                i3 = 5;
                                                                break;
                                                            case 16:
                                                            case 19:
                                                            default:
                                                                i3 = 6;
                                                                break;
                                                            case 18:
                                                                i3 = 2;
                                                                break;
                                                            case 20:
                                                                if (Build.VERSION.SDK_INT >= 29) {
                                                                    i3 = 9;
                                                                }
                                                                break;
                                                        }
                                                    } else if (type != 6) {
                                                        i3 = type != 9 ? 8 : 7;
                                                    } else {
                                                        i3 = 5;
                                                    }
                                                }
                                            } catch (SecurityException unused) {
                                            }
                                        }
                                        if (Build.VERSION.SDK_INT >= 31 && i3 == 5) {
                                            tox.a.a(context, toxVar);
                                        } else {
                                            toxVar.c(i3);
                                        }
                                        break;
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public interface b {
        void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        CameraCharacteristics b(String str);

        Set<Set<String>> c();

        void d(String str, Executor executor, CameraDevice.StateCallback stateCallback);

        void e(CameraManager.AvailabilityCallback availabilityCallback);
    }

    public q26(u26 u26Var) {
        this.a = u26Var;
    }

    public static q26 a(Context context, Handler handler) {
        u26 r26Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            r26Var = new t26(context, null);
        } else if (i >= 29) {
            r26Var = new s26(context, null);
        } else {
            r26Var = i >= 28 ? new r26(context, null) : new u26(context, new u26.a(handler));
        }
        return new q26(r26Var);
    }

    public final e16 b(String str) {
        e16 e16Var;
        synchronized (this.b) {
            e16Var = (e16) this.b.get(str);
            if (e16Var == null) {
                try {
                    e16 e16Var2 = new e16(this.a.b(str), str);
                    this.b.put(str, e16Var2);
                    e16Var = e16Var2;
                } catch (AssertionError e) {
                    throw new rz5(e.getMessage(), e);
                }
            }
        }
        return e16Var;
    }

    public final String[] c() throws rz5 {
        try {
            return this.a.a.getCameraIdList();
        } catch (CameraAccessException e) {
            throw new rz5(e);
        }
    }
}
