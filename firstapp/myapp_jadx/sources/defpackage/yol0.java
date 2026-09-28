package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import android.util.Log;
import androidx.recyclerview.widget.r;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.material.circularreveal.cardview.Kghu.xOgHBQVl;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.permission.location.KN.qUnCRF;
import com.sportybet.android.account.Qr.QQWMbKFOuTf;
import com.sportybet.plugin.realsports.data.CashOut;
import com.twilio.voice.PublisherMetadata;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes4.dex */
public final class yol0 extends xal0 {
    public static final String[] i = {"firebase_", "google_", "ga_"};
    public static final String[] j = {"_err"};
    public SecureRandom c;
    public final AtomicLong d;
    public int e;
    public kiv.a f;
    public Boolean g;
    public Integer h;

    public yol0(k8l0 k8l0Var) {
        super(k8l0Var);
        this.h = null;
        this.d = new AtomicLong(0L);
    }

    public static int B() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(CashOut.BIG_NUMBER);
    }

    public static boolean D(String str) {
        String str2 = (String) v2l0.r0.a(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    public static boolean F(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean G(String str, String[] strArr) {
        hm20.h(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] L(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static boolean X(Context context) {
        ActivityInfo receiverInfo;
        hm20.h(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static void Y(igl0 igl0Var, Bundle bundle, boolean z) {
        if (bundle != null && igl0Var != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = igl0Var.a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = igl0Var.b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", igl0Var.c);
                return;
            }
            z = false;
        }
        if (bundle != null && igl0Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static final boolean a0(int i2, Bundle bundle) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i2);
        return true;
    }

    public static boolean f0(String str) {
        hm20.e(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static String l(int i2, String str, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i2) {
            return str;
        }
        if (z) {
            return str.substring(0, str.offsetByCodePoints(0, i2)).concat("...");
        }
        return null;
    }

    public static boolean p0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static void w(wol0 wol0Var, String str, int i2, String str2, String str3, int i3) {
        Bundle bundle = new Bundle();
        a0(i2, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i2 == 6 || i2 == 7 || i2 == 2) {
            bundle.putLong("_el", i3);
        }
        wol0Var.a(str, "_err", bundle);
    }

    public static MessageDigest x() {
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static long y(byte[] bArr) {
        hm20.h(bArr);
        int length = bArr.length;
        long j2 = 0;
        if (length <= 0) {
            fm20.a();
            return 0L;
        }
        int i2 = 0;
        for (int i3 = length - 1; i3 >= 0 && i3 >= bArr.length - 8; i3--) {
            j2 += (((long) bArr[i3]) & 255) << i2;
            i2 += 8;
        }
        return j2;
    }

    public static boolean z(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final kiv A() {
        y3l jivVar;
        Object objInvoke;
        kiv.a aVar = this.f;
        if (aVar != null) {
            return aVar;
        }
        Context context = this.a.a;
        context.getClass();
        StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
        int i2 = Build.VERSION.SDK_INT;
        mf mfVar = mf.a;
        sb.append(i2 >= 33 ? mfVar.a() : 0);
        Log.d("MeasurementManager", sb.toString());
        if ((i2 >= 33 ? mfVar.a() : 0) >= 5) {
            jivVar = new jiv(context);
        } else {
            lf lfVar = lf.a;
            if (((i2 == 31 || i2 == 32) ? lfVar.a() : 0) >= 9) {
                try {
                    objInvoke = new hiv(context).invoke(context);
                } catch (NoClassDefFoundError unused) {
                    StringBuilder sb2 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                    int i3 = Build.VERSION.SDK_INT;
                    sb2.append((i3 == 31 || i3 == 32) ? lfVar.a() : 0);
                    Log.d("MeasurementManager", sb2.toString());
                    objInvoke = null;
                }
                jivVar = (y3l) objInvoke;
            } else {
                jivVar = null;
            }
        }
        kiv.a aVar2 = jivVar != null ? new kiv.a(jivVar) : null;
        this.f = aVar2;
        return aVar2;
    }

    public final long C() {
        long j2;
        boolean zBooleanValue;
        Object e;
        Integer num;
        g();
        k8l0 k8l0Var = this.a;
        b4l0 b4l0VarQ = k8l0Var.q();
        y4l0 y4l0Var = k8l0Var.f;
        if (!D(b4l0VarQ.m())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j2 = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j2 = 8;
        } else {
            j2 = B() < ((Integer) v2l0.l0.a(null)).intValue() ? 16L : 0L;
        }
        if (!E("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j2 |= 2;
        }
        if (j2 == 0) {
            if (this.g == null) {
                kiv kivVarA = A();
                zBooleanValue = false;
                if (kivVarA != null) {
                    try {
                        num = kivVarA.a().get(10000L, TimeUnit.MILLISECONDS);
                        if (num != null) {
                            try {
                                if (num.intValue() == 1) {
                                    zBooleanValue = true;
                                }
                            } catch (InterruptedException e2) {
                                e = e2;
                                k8l0.m(y4l0Var);
                                y4l0Var.i.b(e, "Measurement manager api exception");
                                this.g = Boolean.FALSE;
                            } catch (CancellationException e3) {
                                e = e3;
                                k8l0.m(y4l0Var);
                                y4l0Var.i.b(e, "Measurement manager api exception");
                                this.g = Boolean.FALSE;
                            } catch (ExecutionException e4) {
                                e = e4;
                                k8l0.m(y4l0Var);
                                y4l0Var.i.b(e, "Measurement manager api exception");
                                this.g = Boolean.FALSE;
                            } catch (TimeoutException e5) {
                                e = e5;
                                k8l0.m(y4l0Var);
                                y4l0Var.i.b(e, "Measurement manager api exception");
                                this.g = Boolean.FALSE;
                            }
                        }
                        this.g = Boolean.valueOf(zBooleanValue);
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e6) {
                        e = e6;
                        num = null;
                    }
                    k8l0.m(y4l0Var);
                    y4l0Var.n.b(num, "Measurement manager api status result");
                    zBooleanValue = this.g.booleanValue();
                }
            } else {
                zBooleanValue = this.g.booleanValue();
            }
            if (!zBooleanValue) {
                j2 = 64;
            }
        }
        if (j2 == 0) {
            return 1L;
        }
        return j2;
    }

    public final boolean E(String str) {
        g();
        k8l0 k8l0Var = this.a;
        if (r7k0.a(k8l0Var.a).a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        y4l0 y4l0Var = k8l0Var.f;
        k8l0.m(y4l0Var);
        y4l0Var.m.b(str, "Permission not granted");
        return false;
    }

    public final boolean H(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.a.d.k("debug.firebase.analytics.app").equals(str);
    }

    public final Bundle I(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objN = n(bundle.get(str), str);
                if (objN == null) {
                    k8l0 k8l0Var = this.a;
                    y4l0 y4l0Var = k8l0Var.f;
                    k8l0.m(y4l0Var);
                    y4l0Var.k.b(k8l0Var.j.b(str), "Param value can't be null");
                } else {
                    v(bundle2, str, objN);
                }
            }
        }
        return bundle2;
    }

    public final zzbg J(String str, Bundle bundle, String str2, long j2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (l0(str) != 0) {
            k8l0 k8l0Var = this.a;
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.b(k8l0Var.j.c(str), "Invalid conditional property event name");
            d580.a();
            return null;
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleO = o(str, bundle2, Collections.singletonList("_o"), true);
        if (z) {
            bundleO = I(bundleO);
        }
        hm20.h(bundleO);
        return new zzbg(str, new zzbe(bundleO), str2, j2);
    }

    public final boolean M(int i2) {
        Boolean bool = this.a.o().e;
        if (N() < i2 / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int N() {
        Integer numValueOf = this.h;
        if (numValueOf == null) {
            w4l w4lVar = w4l.b;
            Context context = this.a.a;
            w4lVar.getClass();
            AtomicBoolean atomicBoolean = m5l.a;
            int i2 = 0;
            try {
                i2 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            numValueOf = Integer.valueOf(i2 / 1000);
            this.h = numValueOf;
        }
        return numValueOf.intValue();
    }

    public final void O(Bundle bundle, long j2) {
        long j3 = bundle.getLong("_et");
        if (j3 != 0) {
            y4l0 y4l0Var = this.a.f;
            k8l0.m(y4l0Var);
            y4l0Var.i.b(Long.valueOf(j3), "Params already contained engagement");
        } else {
            j3 = 0;
        }
        bundle.putLong("_et", j2 + j3);
    }

    public final void P(String str, zvk0 zvk0Var) {
        try {
            zvk0Var.O(mll0.a("r", str));
        } catch (RemoteException e) {
            y4l0 y4l0Var = this.a.f;
            k8l0.m(y4l0Var);
            y4l0Var.i.b(e, "Error returning string value to wrapper");
        }
    }

    public final void Q(zvk0 zvk0Var, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j2);
        try {
            zvk0Var.O(bundle);
        } catch (RemoteException e) {
            y4l0 y4l0Var = this.a.f;
            k8l0.m(y4l0Var);
            y4l0Var.i.b(e, "Error returning long value to wrapper");
        }
    }

    public final void R(zvk0 zvk0Var, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i2);
        try {
            zvk0Var.O(bundle);
        } catch (RemoteException e) {
            y4l0 y4l0Var = this.a.f;
            k8l0.m(y4l0Var);
            y4l0Var.i.b(e, "Error returning int value to wrapper");
        }
    }

    public final void S(zvk0 zvk0Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zvk0Var.O(bundle);
        } catch (RemoteException e) {
            y4l0 y4l0Var = this.a.f;
            k8l0.m(y4l0Var);
            y4l0Var.i.b(e, "Error returning byte array to wrapper");
        }
    }

    public final void T(zvk0 zvk0Var, boolean z) {
        try {
            zvk0Var.O(x6.a("r", z));
        } catch (RemoteException e) {
            y4l0 y4l0Var = this.a.f;
            k8l0.m(y4l0Var);
            y4l0Var.i.b(e, "Error returning boolean value to wrapper");
        }
    }

    public final void U(zvk0 zvk0Var, Bundle bundle) {
        try {
            zvk0Var.O(bundle);
        } catch (RemoteException e) {
            y4l0 y4l0Var = this.a.f;
            k8l0.m(y4l0Var);
            y4l0Var.i.b(e, "Error returning bundle value to wrapper");
        }
    }

    public final void V(zvk0 zvk0Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zvk0Var.O(bundle);
        } catch (RemoteException e) {
            y4l0 y4l0Var = this.a.f;
            k8l0.m(y4l0Var);
            y4l0Var.i.b(e, "Error returning bundle list to wrapper");
        }
    }

    public final String Z() {
        byte[] bArr = new byte[16];
        e0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final Object b0(int i2, boolean z, boolean z2, Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return l(i2, obj.toString(), z);
        }
        if (!z2) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleI = I((Bundle) parcelable);
                if (!bundleI.isEmpty()) {
                    arrayList.add(bundleI);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int c0(String str) {
        boolean zEquals = "_ldl".equals(str);
        k8l0 k8l0Var = this.a;
        if (zEquals) {
            wok0 wok0Var = k8l0Var.d;
            return 2048;
        }
        if ("_id".equals(str)) {
            wok0 wok0Var2 = k8l0Var.d;
            return 256;
        }
        if ("_lgclid".equals(str)) {
            wok0 wok0Var3 = k8l0Var.d;
            return 100;
        }
        wok0 wok0Var4 = k8l0Var.d;
        return 36;
    }

    public final long d0() {
        long andIncrement;
        long j2;
        AtomicLong atomicLong = this.d;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.d;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNanoTime = System.nanoTime();
            this.a.k.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i2 = this.e + 1;
            this.e = i2;
            j2 = jNextLong + ((long) i2);
        }
        return j2;
    }

    public final SecureRandom e0() {
        g();
        SecureRandom secureRandom = this.c;
        if (secureRandom != null) {
            return secureRandom;
        }
        SecureRandom secureRandom2 = new SecureRandom();
        this.c = secureRandom2;
        return secureRandom2;
    }

    @Override // defpackage.xal0
    public final boolean h() {
        return true;
    }

    public final boolean h0(String str, String str2) {
        k8l0 k8l0Var = this.a;
        if (str2 == null) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.h.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            y4l0 y4l0Var2 = k8l0Var.f;
            k8l0.m(y4l0Var2);
            y4l0Var2.h.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            y4l0 y4l0Var3 = k8l0Var.f;
            k8l0.m(y4l0Var3);
            y4l0Var3.h.c(str, "Name must start with a letter. Type, name", str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                y4l0 y4l0Var4 = k8l0Var.f;
                k8l0.m(y4l0Var4);
                y4l0Var4.h.c(str, "Name must consist of letters, digits or _ (underscores). Type, name", str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean i0(String str, String str2) {
        k8l0 k8l0Var = this.a;
        if (str2 == null) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.h.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            y4l0 y4l0Var2 = k8l0Var.f;
            k8l0.m(y4l0Var2);
            y4l0Var2.h.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                y4l0 y4l0Var3 = k8l0Var.f;
                k8l0.m(y4l0Var3);
                y4l0Var3.h.c(str, "Name must start with a letter or _ (underscore). Type, name", str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                y4l0 y4l0Var4 = k8l0Var.f;
                k8l0.m(y4l0Var4);
                y4l0Var4.h.c(str, "Name must consist of letters, digits or _ (underscores). Type, name", str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean j0(String str, String[] strArr, String[] strArr2, String str2) {
        k8l0 k8l0Var = this.a;
        if (str2 == null) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.h.b(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i2 = 0; i2 < 3; i2++) {
            if (str2.startsWith(i[i2])) {
                y4l0 y4l0Var2 = k8l0Var.f;
                k8l0.m(y4l0Var2);
                y4l0Var2.h.c(str, "Name starts with reserved prefix. Type, name", str2);
                return false;
            }
        }
        if (strArr == null || !G(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && G(str2, strArr2)) {
            return true;
        }
        y4l0 y4l0Var3 = k8l0Var.f;
        k8l0.m(y4l0Var3);
        y4l0Var3.h.c(str, "Name is reserved. Type, name", str2);
        return false;
    }

    public final boolean k(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        k8l0 k8l0Var = this.a;
        if (zIsEmpty) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.h.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        hm20.h(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        y4l0 y4l0Var2 = k8l0Var.f;
        k8l0.m(y4l0Var2);
        y4l0Var2.h.b(y4l0.k(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    public final boolean k0(int i2, String str, String str2) {
        k8l0 k8l0Var = this.a;
        if (str2 == null) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.h.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i2) {
            return true;
        }
        y4l0 y4l0Var2 = k8l0Var.f;
        k8l0.m(y4l0Var2);
        y4l0Var2.h.d(str, "Name is too long. Type, maximum supported length, name", Integer.valueOf(i2), str2);
        return false;
    }

    public final int l0(String str) {
        if (!i0(AnalyticsEvent.BI_TRACKING_KIND_EVENT, str)) {
            return 2;
        }
        if (!j0(AnalyticsEvent.BI_TRACKING_KIND_EVENT, lbl0.a, lbl0.b, str)) {
            return 13;
        }
        wok0 wok0Var = this.a.d;
        return !k0(40, AnalyticsEvent.BI_TRACKING_KIND_EVENT, str) ? 2 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    public final int m(String str, String str2, Object obj, Bundle bundle, List list, boolean z, boolean z2) {
        int i2;
        int size;
        g();
        boolean zP0 = p0(obj);
        k8l0 k8l0Var = this.a;
        int i3 = 0;
        if (!zP0) {
            i2 = 0;
        } else {
            if (!z2) {
                return 21;
            }
            if (!G(str2, l29.d)) {
                return 20;
            }
            ikl0 ikl0VarO = k8l0Var.o();
            ikl0VarO.g();
            ikl0VarO.h();
            if (ikl0VarO.n()) {
                yol0 yol0Var = ikl0VarO.a.i;
                k8l0.k(yol0Var);
                if (yol0Var.N() < 200900) {
                    return 25;
                }
            }
            boolean z3 = obj instanceof Parcelable[];
            if (z3) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i2 = 0;
            }
            if (size > 200) {
                y4l0 y4l0Var = k8l0Var.f;
                k8l0.m(y4l0Var);
                y4l0Var.k.d("param", "Parameter array is too long; discarded. Value kind, name, array length", str2, Integer.valueOf(size));
                i2 = 17;
                if (z3) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, r.d.DEFAULT_DRAG_ANIMATION_DURATION));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, r.d.DEFAULT_DRAG_ANIMATION_DURATION)));
                    }
                }
            } else {
                i2 = 0;
            }
        }
        int iMax = 500;
        if (F(str) || F(str2)) {
            k8l0Var.d.getClass();
            iMax = Math.max(500, 256);
        } else {
            k8l0Var.d.getClass();
        }
        if (!q0("param", str2, iMax, obj)) {
            if (!z2) {
                return 4;
            }
            if (obj instanceof Bundle) {
                r0(str, str2, (Bundle) obj, list, z);
                return i2;
            }
            if (obj instanceof Parcelable[]) {
                Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                int length = parcelableArr2.length;
                while (i3 < length) {
                    Parcelable parcelable = parcelableArr2[i3];
                    if (!(parcelable instanceof Bundle)) {
                        y4l0 y4l0Var2 = k8l0Var.f;
                        k8l0.m(y4l0Var2);
                        y4l0Var2.k.c(parcelable.getClass(), "All Parcelable[] elements must be of type Bundle. Value type, name", str2);
                        return 4;
                    }
                    r0(str, str2, (Bundle) parcelable, list, z);
                    i3++;
                }
            } else {
                if (!(obj instanceof ArrayList)) {
                    return 4;
                }
                ArrayList arrayList2 = (ArrayList) obj;
                int size2 = arrayList2.size();
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    if (!(obj2 instanceof Bundle)) {
                        y4l0 y4l0Var3 = k8l0Var.f;
                        k8l0.m(y4l0Var3);
                        y4l0Var3.k.c(obj2 != null ? obj2.getClass() : "null", "All ArrayList elements must be of type Bundle. Value type, name", str2);
                        return 4;
                    }
                    r0(str, str2, (Bundle) obj2, list, z);
                    i3++;
                }
            }
        }
        return i2;
    }

    public final int m0(String str) {
        if (!i0("user property", str)) {
            return 6;
        }
        if (!j0("user property", obl0.a, null, str)) {
            return 15;
        }
        wok0 wok0Var = this.a.d;
        return !k0(24, "user property", str) ? 6 : 0;
    }

    public final Object n(Object obj, String str) {
        boolean zEquals = "_ev".equals(str);
        int iMax = 500;
        k8l0 k8l0Var = this.a;
        if (zEquals) {
            k8l0Var.d.getClass();
            return b0(Math.max(500, 256), true, true, obj);
        }
        if (F(str)) {
            k8l0Var.d.getClass();
            iMax = Math.max(500, 256);
        } else {
            k8l0Var.d.getClass();
        }
        return b0(iMax, false, true, obj);
    }

    public final int n0(String str) {
        if (!h0("event param", str)) {
            return 3;
        }
        if (!j0("event param", null, null, str)) {
            return 14;
        }
        wok0 wok0Var = this.a.d;
        return !k0(40, "event param", str) ? 3 : 0;
    }

    public final Bundle o(String str, Bundle bundle, List list, boolean z) {
        int iN0;
        list = list;
        boolean zG = G(str, lbl0.d);
        String str2 = null;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        k8l0 k8l0Var = this.a;
        wok0 wok0Var = k8l0Var.d;
        k4l0 k4l0Var = k8l0Var.j;
        yol0 yol0Var = wok0Var.a.i;
        k8l0.k(yol0Var);
        int i2 = yol0Var.M(201500000) ? 100 : 25;
        int i3 = 0;
        boolean z2 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                iN0 = !z ? n0(str3) : 0;
                if (iN0 == 0) {
                    iN0 = o0(str3);
                }
            } else {
                iN0 = 0;
            }
            if (iN0 != 0) {
                s(bundle2, iN0, str3, iN0 == 3 ? str3 : str2);
                bundle2.remove(str3);
            } else {
                int iM = m(str, str3, bundle.get(str3), bundle2, list, z, zG);
                if (iM == 17) {
                    s(bundle2, 17, str3, Boolean.FALSE);
                } else if (iM != 0 && !"_ev".equals(str3)) {
                    s(bundle2, iM, iM == 21 ? str : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (f0(str3)) {
                    i3++;
                    if (i3 > i2) {
                        if (!k8l0Var.d.q(str2, v2l0.e1) || !z2) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 37);
                            sb.append("Event can't contain more than ");
                            sb.append(i2);
                            sb.append(" params");
                            String string = sb.toString();
                            y4l0 y4l0Var = k8l0Var.f;
                            k8l0.m(y4l0Var);
                            y4l0Var.h.c(k4l0Var.a(str), string, k4l0Var.e(bundle));
                        }
                        a0(5, bundle2);
                        bundle2.remove(str3);
                        z2 = true;
                        str2 = str2;
                    }
                }
            }
            str2 = str2;
            str2 = str2;
        }
        return bundle2;
    }

    public final int o0(String str) {
        if (!i0("event param", str)) {
            return 3;
        }
        if (!j0("event param", null, null, str)) {
            return 14;
        }
        wok0 wok0Var = this.a.d;
        return !k0(40, "event param", str) ? 3 : 0;
    }

    public final void p(a5l0 a5l0Var, int i2) {
        Bundle bundle = a5l0Var.d;
        int i3 = 0;
        boolean z = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (f0(str) && (i3 = i3 + 1) > i2) {
                k8l0 k8l0Var = this.a;
                wok0 wok0Var = k8l0Var.d;
                k4l0 k4l0Var = k8l0Var.j;
                if (!wok0Var.q(null, v2l0.e1) || !z) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 37);
                    sb.append("Event can't contain more than ");
                    sb.append(i2);
                    sb.append(" params");
                    String string = sb.toString();
                    y4l0 y4l0Var = k8l0Var.f;
                    k8l0.m(y4l0Var);
                    y4l0Var.h.c(k4l0Var.a(a5l0Var.a), string, k4l0Var.e(bundle));
                    a0(5, bundle);
                }
                bundle.remove(str);
                z = true;
            }
        }
    }

    public final void q(Parcelable[] parcelableArr, int i2) {
        hm20.h(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i3 = 0;
            boolean z = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (f0(str) && !G(str, l29.e) && (i3 = i3 + 1) > i2) {
                    k8l0 k8l0Var = this.a;
                    wok0 wok0Var = k8l0Var.d;
                    k4l0 k4l0Var = k8l0Var.j;
                    if (!wok0Var.q(null, v2l0.e1) || !z) {
                        y4l0 y4l0Var = k8l0Var.f;
                        k8l0.m(y4l0Var);
                        u4l0 u4l0Var = y4l0Var.h;
                        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 60);
                        sb.append("Param can't contain more than ");
                        sb.append(i2);
                        sb.append(" item-scoped custom parameters");
                        u4l0Var.c(k4l0Var.b(str), sb.toString(), k4l0Var.e(bundle));
                    }
                    a0(28, bundle);
                    bundle.remove(str);
                    z = true;
                }
            }
        }
    }

    public final boolean q0(String str, String str2, int i2, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String string = obj.toString();
        if (string.codePointCount(0, string.length()) <= i2) {
            return true;
        }
        y4l0 y4l0Var = this.a.f;
        k8l0.m(y4l0Var);
        y4l0Var.k.d(str, "Value is too long; discarded. Value kind, name, value length", str2, Integer.valueOf(string.length()));
        return false;
    }

    public final void r(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                yol0 yol0Var = this.a.i;
                k8l0.k(yol0Var);
                yol0Var.v(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void r0(String str, String str2, Bundle bundle, List list, boolean z) {
        int iN0;
        int iM;
        list = list;
        k8l0 k8l0Var = this.a;
        wok0 wok0Var = k8l0Var.d;
        y4l0 y4l0Var = k8l0Var.f;
        k4l0 k4l0Var = k8l0Var.j;
        yol0 yol0Var = wok0Var.a.i;
        k8l0.k(yol0Var);
        int i2 = true != yol0Var.M(231100000) ? 0 : 35;
        int i3 = 0;
        boolean z2 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                iN0 = !z ? n0(str3) : 0;
                if (iN0 == 0) {
                    iN0 = o0(str3);
                }
            } else {
                iN0 = 0;
            }
            if (iN0 != 0) {
                s(bundle, iN0, str3, iN0 == 3 ? str3 : null);
                bundle.remove(str3);
            } else {
                if (p0(bundle.get(str3))) {
                    k8l0.m(y4l0Var);
                    y4l0Var.k.d(str, "Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3);
                    iM = 22;
                } else {
                    iM = m(str, str3, bundle.get(str3), bundle, list, z, false);
                }
                if (iM != 0 && !"_ev".equals(str3)) {
                    s(bundle, iM, str3, bundle.get(str3));
                    bundle.remove(str3);
                } else if (f0(str3) && !G(str3, l29.e)) {
                    int i4 = i3 + 1;
                    if (!M(231100000)) {
                        k8l0.m(y4l0Var);
                        y4l0Var.h.c(k4l0Var.a(str), "Item array not supported on client's version of Google Play Services (Android Only)", k4l0Var.e(bundle));
                        a0(23, bundle);
                        bundle.remove(str3);
                    } else if (i4 > i2) {
                        if (!k8l0Var.d.q(null, v2l0.e1) || !z2) {
                            k8l0.m(y4l0Var);
                            u4l0 u4l0Var = y4l0Var.h;
                            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 55);
                            sb.append("Item can't contain more than ");
                            sb.append(i2);
                            sb.append(" item-scoped custom params");
                            u4l0Var.c(k4l0Var.a(str), sb.toString(), k4l0Var.e(bundle));
                        }
                        a0(28, bundle);
                        bundle.remove(str3);
                        list = list;
                        i3 = i4;
                        z2 = true;
                    }
                    i3 = i4;
                }
            }
        }
    }

    public final void s(Bundle bundle, int i2, String str, Object obj) {
        if (a0(i2, bundle)) {
            wok0 wok0Var = this.a.d;
            bundle.putString("_ev", l(40, str, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final int t(Object obj, String str) {
        return "_ldl".equals(str) ? q0("user property referrer", str, c0(str), obj) : q0("user property", str, c0(str), obj) ? 0 : 7;
    }

    public final Object u(Object obj, String str) {
        return "_ldl".equals(str) ? b0(c0(str), true, false, obj) : b0(c0(str), false, false, obj);
    }

    public final void v(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            k8l0 k8l0Var = this.a;
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.k.c(k8l0Var.j.b(str), "Not putting event parameter. Invalid value type. name, type", simpleName);
        }
    }

    public static ArrayList W(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzah zzahVar = (zzah) it.next();
            Bundle bundle = new Bundle();
            bundle.putString(PublisherMetadata.APP_ID, zzahVar.a);
            bundle.putString("origin", zzahVar.b);
            bundle.putLong("creation_timestamp", zzahVar.d);
            bundle.putString("name", zzahVar.c.b);
            Object objG0 = zzahVar.c.G0();
            hm20.h(objG0);
            bbl0.a(bundle, objG0);
            bundle.putBoolean("active", zzahVar.e);
            String str = zzahVar.f;
            if (str != null) {
                bundle.putString(xOgHBQVl.xRCOakN, str);
            }
            zzbg zzbgVar = zzahVar.i;
            if (zzbgVar != null) {
                bundle.putString("timed_out_event_name", zzbgVar.a);
                zzbe zzbeVar = zzbgVar.b;
                if (zzbeVar != null) {
                    bundle.putBundle("timed_out_event_params", zzbeVar.b1());
                }
            }
            bundle.putLong("trigger_timeout", zzahVar.v);
            zzbg zzbgVar2 = zzahVar.w;
            if (zzbgVar2 != null) {
                bundle.putString("triggered_event_name", zzbgVar2.a);
                zzbe zzbeVar2 = zzbgVar2.b;
                if (zzbeVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzbeVar2.b1());
                }
            }
            bundle.putLong("triggered_timestamp", zzahVar.c.c);
            bundle.putLong("time_to_live", zzahVar.y);
            zzbg zzbgVar3 = zzahVar.z;
            if (zzbgVar3 != null) {
                bundle.putString("expired_event_name", zzbgVar3.a);
                zzbe zzbeVar3 = zzbgVar3.b;
                if (zzbeVar3 != null) {
                    bundle.putBundle("expired_event_params", zzbeVar3.b1());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public final boolean K(Context context, String str) {
        Signature[] signatureArr;
        k8l0 k8l0Var = this.a;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoB = r7k0.a(context).b(64, str);
            if (packageInfoB == null || (signatureArr = packageInfoB.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.b(e, "Package name not found");
            return true;
        } catch (CertificateException e2) {
            y4l0 y4l0Var2 = k8l0Var.f;
            k8l0.m(y4l0Var2);
            y4l0Var2.f.b(e2, qUnCRF.CqRHhMsXLkBXR);
            return true;
        }
    }

    public final Bundle g0(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        if (uri != null) {
            try {
                boolean zIsHierarchical = uri.isHierarchical();
                String str = QQWMbKFOuTf.cfnDuMmuyIeaYN;
                if (zIsHierarchical) {
                    queryParameter = uri.getQueryParameter("utm_campaign");
                    queryParameter2 = uri.getQueryParameter("utm_source");
                    queryParameter3 = uri.getQueryParameter("utm_medium");
                    queryParameter4 = uri.getQueryParameter("gclid");
                    queryParameter5 = uri.getQueryParameter("gbraid");
                    queryParameter6 = uri.getQueryParameter("utm_id");
                    queryParameter7 = uri.getQueryParameter(str);
                    queryParameter8 = uri.getQueryParameter("srsltid");
                    queryParameter9 = uri.getQueryParameter("sfmc_id");
                } else {
                    queryParameter = null;
                    queryParameter2 = null;
                    queryParameter3 = null;
                    queryParameter4 = null;
                    queryParameter5 = null;
                    queryParameter6 = null;
                    queryParameter7 = null;
                    queryParameter8 = null;
                    queryParameter9 = null;
                }
                if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("campaign", queryParameter);
                }
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("source", queryParameter2);
                }
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("medium", queryParameter3);
                }
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("gclid", queryParameter4);
                }
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("gbraid", queryParameter5);
                }
                String queryParameter10 = uri.getQueryParameter("gad_source");
                if (!TextUtils.isEmpty(queryParameter10)) {
                    bundle.putString("gad_source", queryParameter10);
                }
                String queryParameter11 = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter11)) {
                    bundle.putString("term", queryParameter11);
                }
                String queryParameter12 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter12)) {
                    bundle.putString("content", queryParameter12);
                }
                String queryParameter13 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter13)) {
                    bundle.putString("aclid", queryParameter13);
                }
                String queryParameter14 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter14)) {
                    bundle.putString("cp1", queryParameter14);
                }
                String queryParameter15 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter15)) {
                    bundle.putString("anid", queryParameter15);
                }
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString("campaign_id", queryParameter6);
                }
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString(str, queryParameter7);
                }
                String queryParameter16 = uri.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter16)) {
                    bundle.putString("source_platform", queryParameter16);
                }
                String queryParameter17 = uri.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter17)) {
                    bundle.putString("creative_format", queryParameter17);
                }
                String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter18)) {
                    bundle.putString("marketing_tactic", queryParameter18);
                }
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("srsltid", queryParameter8);
                }
                if (!TextUtils.isEmpty(queryParameter9)) {
                    bundle.putString("sfmc_id", queryParameter9);
                }
                for (String str2 : uri.getQueryParameterNames()) {
                    if (str2.startsWith("gad_")) {
                        String queryParameter19 = uri.getQueryParameter(str2);
                        if (!TextUtils.isEmpty(queryParameter19)) {
                            bundle.putString(str2, queryParameter19);
                        }
                    }
                }
                return bundle;
            } catch (UnsupportedOperationException e) {
                y4l0 y4l0Var = this.a.f;
                k8l0.m(y4l0Var);
                y4l0Var.i.b(e, "Install referrer url isn't a hierarchical URI");
            }
        }
        return null;
    }
}
