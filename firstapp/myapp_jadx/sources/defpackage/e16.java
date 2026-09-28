package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e16 {
    public final a16 b;
    public final String c;
    public final HashMap a = new HashMap();
    public v7e0 d = null;

    public e16(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.b = new z06(cameraCharacteristics);
        } else {
            this.b = new a16(cameraCharacteristics);
        }
        this.c = str;
    }

    public final <T> T a(CameraCharacteristics.Key<T> key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return (T) this.b.a.get(key);
        }
        synchronized (this) {
            try {
                T t = (T) this.a.get(key);
                if (t != null) {
                    return t;
                }
                T t2 = (T) this.b.a.get(key);
                if (t2 != null) {
                    this.a.put(key, t2);
                }
                return t2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int b() {
        Integer num = (!d() || Build.VERSION.SDK_INT < 35) ? null : (Integer) a(CameraCharacteristics.FLASH_TORCH_STRENGTH_DEFAULT_LEVEL);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public final v7e0 c() {
        v7e0 v7e0Var = this.d;
        if (v7e0Var == null) {
            v7e0Var = null;
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    hb5.a("StreamConfigurationMap is null!");
                    return null;
                }
                v7e0 v7e0Var2 = new v7e0(streamConfigurationMap, new vaz(this.c));
                this.d = v7e0Var2;
                return v7e0Var2;
            } catch (AssertionError | NullPointerException e) {
                hb5.a(e.getMessage());
            }
        }
        return v7e0Var;
    }

    public final boolean d() {
        Boolean bool = (Boolean) a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        return bool != null && bool.booleanValue();
    }

    public final boolean e() {
        int i;
        if (!d() || (i = Build.VERSION.SDK_INT) < 35) {
            return false;
        }
        Integer num = (!d() || i < 35) ? null : (Integer) a(CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL);
        return (num == null ? 1 : num.intValue()) > 1;
    }

    public final boolean f() {
        if (Build.VERSION.SDK_INT >= 34) {
            int[] iArr = (int[]) this.b.a.get(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
