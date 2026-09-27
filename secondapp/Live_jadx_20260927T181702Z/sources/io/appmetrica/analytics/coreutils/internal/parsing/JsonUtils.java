package io.appmetrica.analytics.coreutils.internal.parsing;

import cs.o;
import fr.f1;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.m0;
import ms.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import oy.l;
import oy.m;
import zu.k0;
import zu.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class JsonUtils {

    @l
    public static final JsonUtils INSTANCE = new JsonUtils();

    private JsonUtils() {
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:? A[LOOP:0: B:6:0x002c->B:30:?, LOOP_END, SYNTHETIC] */
    @o
    public static final boolean isEqualTo(@l JSONObject jSONObject, @l JSONObject jSONObject2) throws JSONException {
        boolean zEquals;
        if (!m0.g(k0.L3(x.j(jSONObject.keys())), k0.L3(x.j(jSONObject2.keys())))) {
            return false;
        }
        for (String str : x.j(jSONObject.keys())) {
            Object obj = jSONObject.get(str);
            Object obj2 = jSONObject2.get(str);
            if (!(obj instanceof JSONObject)) {
                if (!(obj instanceof JSONArray)) {
                    zEquals = obj.equals(obj2);
                } else if (obj2 instanceof JSONArray) {
                    zEquals = isEqualTo((JSONArray) obj, (JSONArray) obj2);
                }
                if (!zEquals) {
                }
            } else if (obj2 instanceof JSONObject) {
                zEquals = isEqualTo((JSONObject) obj, (JSONObject) obj2);
                if (!zEquals) {
                }
            }
            return false;
        }
        return true;
    }

    @o
    public static final boolean optBooleanOrDefault(@m JSONObject jSONObject, @l String str, boolean z10) {
        Boolean boolOptBooleanOrNull = optBooleanOrNull(jSONObject, str);
        return boolOptBooleanOrNull != null ? boolOptBooleanOrNull.booleanValue() : z10;
    }

    @o
    @m
    public static final Boolean optBooleanOrNull(@m JSONObject jSONObject, @l String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    @o
    @m
    public static final Boolean optBooleanOrNullable(@m JSONObject jSONObject, @l String str, @m Boolean bool) {
        Boolean boolOptBooleanOrNull = optBooleanOrNull(jSONObject, str);
        return boolOptBooleanOrNull == null ? bool : boolOptBooleanOrNull;
    }

    @o
    public static final float optFloatOrDefault(@m JSONObject jSONObject, @l String str, float f10) {
        Float fOptFloatOrNull = optFloatOrNull(jSONObject, str);
        return fOptFloatOrNull != null ? fOptFloatOrNull.floatValue() : f10;
    }

    @o
    @m
    public static final Float optFloatOrNull(@m JSONObject jSONObject, @l String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Float.valueOf((float) jSONObject.getDouble(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    @o
    @m
    public static final byte[] optHexByteArray(@m JSONObject jSONObject, @l String str, @m byte[] bArr) {
        String strOptStringOrNull;
        byte[] bArrHexToBytes;
        if (jSONObject == null || (strOptStringOrNull = optStringOrNull(jSONObject, str)) == null) {
            return bArr;
        }
        try {
            bArrHexToBytes = StringUtils.hexToBytes(strOptStringOrNull);
        } catch (Throwable unused) {
            bArrHexToBytes = null;
        }
        return bArrHexToBytes != null ? bArrHexToBytes : bArr;
    }

    public static /* synthetic */ byte[] optHexByteArray$default(JSONObject jSONObject, String str, byte[] bArr, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bArr = null;
        }
        return optHexByteArray(jSONObject, str, bArr);
    }

    @o
    @m
    public static final Integer optIntOrDefault(@m JSONObject jSONObject, @l String str, @m Integer num) {
        Integer numOptIntOrNull = optIntOrNull(jSONObject, str);
        return numOptIntOrNull == null ? num : numOptIntOrNull;
    }

    @o
    @m
    public static final Integer optIntOrNull(@m JSONObject jSONObject, @l String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Integer.valueOf(jSONObject.getInt(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    @l
    @o
    public static final JSONObject optJsonObjectOrDefault(@m JSONObject jSONObject, @l String str, @l JSONObject jSONObject2) {
        JSONObject jSONObjectOptJsonObjectOrNull = optJsonObjectOrNull(jSONObject, str);
        return jSONObjectOptJsonObjectOrNull == null ? jSONObject2 : jSONObjectOptJsonObjectOrNull;
    }

    @o
    @m
    public static final JSONObject optJsonObjectOrNull(@m JSONObject jSONObject, @l String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    @o
    @m
    public static final JSONObject optJsonObjectOrNullable(@m JSONObject jSONObject, @l String str, @m JSONObject jSONObject2) {
        JSONObject jSONObjectOptJsonObjectOrNull = optJsonObjectOrNull(jSONObject, str);
        return jSONObjectOptJsonObjectOrNull == null ? jSONObject2 : jSONObjectOptJsonObjectOrNull;
    }

    @o
    @m
    public static final Long optLongOrDefault(@m JSONObject jSONObject, @l String str, @m Long l10) {
        Long lOptLongOrNull = optLongOrNull(jSONObject, str);
        return lOptLongOrNull == null ? l10 : lOptLongOrNull;
    }

    @o
    @m
    public static final Long optLongOrNull(@m JSONObject jSONObject, @l String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Long.valueOf(jSONObject.getLong(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    @o
    @m
    public static final String optStringOrNull(@m JSONObject jSONObject, @l String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return jSONObject.getString(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    @o
    @m
    public static final String optStringOrNullable(@m JSONObject jSONObject, @l String str, @m String str2) {
        String strOptStringOrNull = optStringOrNull(jSONObject, str);
        return strOptStringOrNull == null ? str2 : strOptStringOrNull;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:? A[LOOP:0: B:11:0x0026->B:35:?, LOOP_END, SYNTHETIC] */
    @o
    public static final boolean isEqualTo(@l JSONArray jSONArray, @l JSONArray jSONArray2) throws JSONException {
        boolean zEquals;
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        Iterable iterableW1 = u.W1(0, jSONArray.length());
        if ((iterableW1 instanceof Collection) && ((Collection) iterableW1).isEmpty()) {
            return true;
        }
        Iterator it = iterableW1.iterator();
        while (it.hasNext()) {
            int iNextInt = ((f1) it).nextInt();
            Object obj = jSONArray.get(iNextInt);
            Object obj2 = jSONArray2.get(iNextInt);
            if (obj instanceof JSONObject) {
                if (obj2 instanceof JSONObject) {
                    zEquals = isEqualTo((JSONObject) obj, (JSONObject) obj2);
                    if (!zEquals) {
                    }
                }
            } else {
                if (obj instanceof JSONArray) {
                    if (obj2 instanceof JSONArray) {
                        zEquals = isEqualTo((JSONArray) obj, (JSONArray) obj2);
                    }
                } else {
                    zEquals = obj.equals(obj2);
                }
                if (!zEquals) {
                }
            }
            return false;
        }
        return true;
    }
}
