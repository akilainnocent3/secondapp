package com.google.android.gms.cast.internal;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@KeepForSdk
public final class CastUtils {
    public static final /* synthetic */ int zza = 0;
    private static final Pattern zzb = Pattern.compile("urn:x-cast:[-A-Za-z0-9_]+(\\.[-A-Za-z0-9_]+)*");
    private static final Random zzc = new Random(SystemClock.elapsedRealtime());

    private CastUtils() {
    }

    @Nullable
    @KeepForSdk
    public static JSONObject jsonStringToJsonObject(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    @KeepForSdk
    public static double millisecToSec(long j10) {
        return j10 / 1000.0d;
    }

    @Nullable
    @KeepForSdk
    public static String optStringOrNull(@NonNull JSONObject jSONObject, @NonNull String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    @KeepForSdk
    public static long secToMillisec(double d10) {
        return (long) (d10 * 1000.0d);
    }

    @KeepForSdk
    public static void throwIfInvalidNamespace(@NonNull String str) throws IllegalArgumentException {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Namespace cannot be null or empty");
        }
        if (str.length() > 128) {
            throw new IllegalArgumentException("Invalid namespace length");
        }
        if (!str.startsWith("urn:x-cast:")) {
            throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\"");
        }
        if (str.length() == 11) {
            throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix");
        }
    }

    @NonNull
    @KeepForSdk
    public static long[] toLongArray(@NonNull Collection<Long> collection) {
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }

    @Nullable
    @KeepForSdk
    public static long[] toLongArraySafely(@Nullable JSONArray jSONArray) {
        try {
            return zzg(jSONArray);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static long zza() {
        return zzc.nextLong();
    }

    @NonNull
    public static String zzb(@NonNull Locale locale) {
        StringBuilder sb2 = new StringBuilder(20);
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb2.append('-');
            sb2.append(country);
        }
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant)) {
            sb2.append('-');
            sb2.append(variant);
        }
        return sb2.toString();
    }

    @NonNull
    public static String zzc(@NonNull String str) {
        if (zzb.matcher(str).matches()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '_' || cCharAt == '-' || cCharAt == '.' || cCharAt == ':'))) {
                sb2.append(String.format("%%%04x", Integer.valueOf(cCharAt)));
            } else {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }

    @NonNull
    public static List zzd(@NonNull int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    public static boolean zze(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        return (obj == null || obj2 == null || !obj.equals(obj2)) ? false : true;
    }

    @NonNull
    public static int[] zzf(@NonNull Collection collection) {
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Integer) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    @Nullable
    public static long[] zzg(@Nullable JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        long[] jArr = new long[jSONArray.length()];
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            jArr[i10] = jSONArray.getLong(i10);
        }
        return jArr;
    }

    @KeepForSdk
    public static long secToMillisec(long j10) {
        return j10 * 1000;
    }
}
