package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Pair;
import android.util.Size;
import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class xx5 implements m26 {
    public final String a;
    public final e16 b;
    public final wx5 c;
    public ow5 e;
    public final wp40<l36> f;
    public final yj30 h;
    public final Object d = new Object();
    public ArrayList g = null;

    @Override // defpackage.m26
    public final Set<dhf> a() {
        return ihf.a(this.b).a.a();
    }

    @Override // defpackage.l26
    public final njs<l36> b() {
        return this.f;
    }

    @Override // defpackage.l26
    public final int c() {
        return o(0);
    }

    @Override // defpackage.m26
    public final String d() {
        return this.a;
    }

    @Override // defpackage.m26
    public final Rect e() {
        Rect rect = (Rect) this.b.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        rect.getClass();
        return rect;
    }

    @Override // defpackage.l26
    public final int f() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.LENS_FACING);
        km20.a("Unable to get the lens facing of the camera.", num != null);
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return 0;
        }
        if (iIntValue == 1) {
            return 1;
        }
        if (iIntValue == 2) {
            return 2;
        }
        pgt.i("LensFacingUtil", "The given lens facing integer: " + iIntValue + " can not be recognized.");
        return -1;
    }

    @Override // defpackage.m26
    public final Object g() {
        return this.b.b.a;
    }

    @Override // defpackage.m26
    public final void h(Executor executor, qq20 qq20Var) {
        synchronized (this.d) {
            try {
                ow5 ow5Var = this.e;
                if (ow5Var != null) {
                    ow5Var.c.execute(new hw5(ow5Var, executor, qq20Var));
                    return;
                }
                ArrayList arrayList = this.g;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.g = arrayList;
                }
                arrayList.add(new Pair(qq20Var, executor));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.m26
    public final yj30 i() {
        return this.h;
    }

    @Override // defpackage.m26
    public final List<Size> j(int i) {
        Size[] sizeArrA = this.b.c().a(i);
        return sizeArrA != null ? Arrays.asList(sizeArrA) : Collections.EMPTY_LIST;
    }

    @Override // defpackage.m26
    public final Set<Integer> k() {
        HashSet hashSet = new HashSet();
        int[] iArr = (int[]) this.b.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i : iArr) {
                hashSet.add(Integer.valueOf(i));
            }
        }
        return hashSet;
    }

    @Override // defpackage.m26
    public final void l(final tz5 tz5Var) {
        synchronized (this.d) {
            try {
                final ow5 ow5Var = this.e;
                if (ow5Var != null) {
                    ow5Var.c.execute(new Runnable() { // from class: jw5
                        @Override // java.lang.Runnable
                        public final void run() {
                            ow5.a aVar = ow5Var.A;
                            HashSet hashSet = aVar.a;
                            tz5 tz5Var2 = tz5Var;
                            hashSet.remove(tz5Var2);
                            aVar.b.remove(tz5Var2);
                        }
                    });
                    return;
                }
                ArrayList arrayList = this.g;
                if (arrayList == null) {
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Pair) it.next()).first == tz5Var) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.l26
    public final String n() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        return num.intValue() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // defpackage.l26
    public final int o(int i) {
        Integer num = (Integer) this.b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        return x26.a(x26.b(i), num.intValue(), 1 == f());
    }

    @Override // defpackage.m26
    public final Set<Integer> r() {
        int[] outputFormats;
        try {
            outputFormats = this.b.c().a.a.getOutputFormats();
        } catch (IllegalArgumentException | NullPointerException e) {
            pgt.j("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e);
            outputFormats = null;
        }
        int[] iArr = outputFormats != null ? (int[]) outputFormats.clone() : null;
        if (iArr == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (int i : iArr) {
            hashSet.add(Integer.valueOf(i));
        }
        return hashSet;
    }

    public final void s(ow5 ow5Var) {
        String strA;
        synchronized (this.d) {
            try {
                this.e = ow5Var;
                ArrayList arrayList = this.g;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        Pair pair = (Pair) obj;
                        ow5 ow5Var2 = this.e;
                        ow5Var2.c.execute(new hw5(ow5Var2, (Executor) pair.second, (tz5) pair.first));
                    }
                    this.g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Integer num = (Integer) this.b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            strA = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (iIntValue == 1) {
            strA = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (iIntValue == 2) {
            strA = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (iIntValue != 3) {
            strA = iIntValue != 4 ? hce0.a(iIntValue, "Unknown value: ") : "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        } else {
            strA = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        }
        pgt.e("Camera2CameraInfo", "Device Level: ".concat(strA));
    }

    public xx5(String str, q26 q26Var, n8e0 n8e0Var) {
        str.getClass();
        this.a = str;
        e16 e16VarB = q26Var.b(str);
        this.b = e16VarB;
        wx5 wx5Var = new wx5();
        wx5Var.a = this;
        this.c = wx5Var;
        this.h = cr0.b(e16VarB);
        new HashMap();
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            pgt.i("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + LGxrN.nnpayl);
        }
        this.f = new wp40<>(new pg1(l36.b.e, null));
    }
}
