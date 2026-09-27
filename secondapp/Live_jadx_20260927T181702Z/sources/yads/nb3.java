package yads;

import android.util.Log;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class nb3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f152976a = fr.h0.Q("The integrated version of the Yandex Mobile Ads SDK is outdated.", "Please update com.yandex.android:mobileads to the latest version.");

    public static String a(int i10, String str) {
        return "* " + str + cv.k0.v2(" ", i10 - str.length()) + " *";
    }

    public static void b() {
        Integer numValueOf;
        List listI4 = fr.r0.I4(fr.r0.I4(f152976a, fr.h0.Q("Learn more about the latest version of the SDK here:", "https://yandex.ru/dev/mobile-ads/doc/android/quick-start/android-ads-component.html")), a());
        Iterator it = listI4.iterator();
        String strR3 = null;
        if (it.hasNext()) {
            numValueOf = Integer.valueOf(((String) it.next()).length());
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((String) it.next()).length());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            String strV2 = cv.k0.v2("*", iIntValue + 4);
            ArrayList arrayList = new ArrayList(fr.i0.d0(listI4, 10));
            Iterator it2 = listI4.iterator();
            while (it2.hasNext()) {
                arrayList.add(a(iIntValue, (String) it2.next()));
            }
            strR3 = fr.r0.r3(fr.r0.J4(fr.r0.I4(fr.g0.l(strV2), arrayList), strV2), IOUtils.LINE_SEPARATOR_UNIX, null, null, 0, null, null, 62, null);
        }
        Log.e("Yandex Mobile Ads", "Yandex Mobile Ads version validation\n" + strR3 + IOUtils.LINE_SEPARATOR_UNIX);
    }

    public static List a() {
        if (tq.a() != null) {
            return fr.g0.l("Changelog: " + tq.a());
        }
        return fr.h0.J();
    }
}
