package defpackage;

import android.os.Build;
import android.util.Pair;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uhe implements qya {
    @Override // defpackage.qya
    public final void accept(Object obj) {
        boolean z;
        vj30 vj30Var = (vj30) obj;
        ArrayList arrayList = new ArrayList();
        String str = Build.BRAND;
        boolean z2 = false;
        if (("HUAWEI".equalsIgnoreCase(str) && "SNE-LX1".equalsIgnoreCase(Build.MODEL)) || (LGxrN.AjsS.equalsIgnoreCase(str) && "STK-LX1".equalsIgnoreCase(Build.MODEL))) {
            z = true;
        } else {
            String str2 = Build.FINGERPRINT;
            if (!str2.startsWith("generic") && !str2.startsWith("unknown")) {
                String str3 = Build.MODEL;
                if (!str3.contains("google_sdk") && !str3.contains("Emulator") && !str3.contains("Cuttlefish") && !str3.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!str.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !Build.PRODUCT.equals("google_sdk"))) {
                    Build.HARDWARE.contains("ranchu");
                }
            }
            z = false;
        }
        if (vj30Var.a(ImageCaptureRotationOptionQuirk.class, z)) {
            arrayList.add(new ImageCaptureRotationOptionQuirk());
        }
        if (vj30Var.a(SurfaceOrderQuirk.class, true)) {
            arrayList.add(new SurfaceOrderQuirk());
        }
        HashSet hashSet = CaptureFailedRetryQuirk.a;
        Locale locale = Locale.US;
        String upperCase = str.toUpperCase(locale);
        String str4 = Build.MODEL;
        if (vj30Var.a(CaptureFailedRetryQuirk.class, CaptureFailedRetryQuirk.a.contains(Pair.create(upperCase, str4.toUpperCase(locale))))) {
            arrayList.add(new CaptureFailedRetryQuirk());
        }
        if (vj30Var.a(LowMemoryQuirk.class, LowMemoryQuirk.a.contains(str4.toUpperCase(locale)))) {
            arrayList.add(new LowMemoryQuirk());
        }
        HashSet hashSet2 = LargeJpegImageQuirk.a;
        if (vj30Var.a(LargeJpegImageQuirk.class, "Samsung".equalsIgnoreCase(str) || LargeJpegImageQuirk.c())) {
            arrayList.add(new LargeJpegImageQuirk());
        }
        HashSet hashSet3 = IncorrectJpegMetadataQuirk.a;
        if (vj30Var.a(IncorrectJpegMetadataQuirk.class, "Samsung".equalsIgnoreCase(str) && IncorrectJpegMetadataQuirk.a.contains(Build.DEVICE.toUpperCase(locale)))) {
            arrayList.add(new IncorrectJpegMetadataQuirk());
        }
        HashSet hashSet4 = ImageCaptureFailedForSpecificCombinationQuirk.a;
        if (vj30Var.a(ImageCaptureFailedForSpecificCombinationQuirk.class, ("oneplus".equalsIgnoreCase(str) && "cph2583".equalsIgnoreCase(str4)) || ("google".equalsIgnoreCase(str) && ImageCaptureFailedForSpecificCombinationQuirk.a.contains(str4.toLowerCase())))) {
            arrayList.add(new ImageCaptureFailedForSpecificCombinationQuirk());
        }
        PreviewGreenTintQuirk previewGreenTintQuirk = PreviewGreenTintQuirk.a;
        previewGreenTintQuirk.getClass();
        if ("motorola".equalsIgnoreCase(str) && "moto e20".equalsIgnoreCase(str4)) {
            z2 = true;
        }
        if (vj30Var.a(PreviewGreenTintQuirk.class, z2)) {
            arrayList.add(previewGreenTintQuirk);
        }
        xhe.a = new yj30(arrayList);
        pgt.a("DeviceQuirks", "core DeviceQuirks = ".concat(yj30.d(xhe.a)));
    }
}
