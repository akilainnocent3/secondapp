package com.bytedance.adsdk.hww;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class vgm implements rs {
    @Override // com.bytedance.adsdk.hww.rs
    /* JADX INFO: renamed from: tq, reason: merged with bridge method [inline-methods] */
    public Number hww(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length < 3) {
            return null;
        }
        Number numberHww = hww(objArr[0]);
        int iHww = hww(objArr[1], 0);
        boolean zHww = hww(objArr[2], false);
        if (numberHww == null) {
            return null;
        }
        return hww(numberHww, iHww, zHww);
    }

    public Number hww(Number number, int i10, boolean z10) {
        if (number == null) {
            return null;
        }
        int iMax = Math.max(i10, 0);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(number.doubleValue());
        BigDecimal scale = z10 ? bigDecimalValueOf.setScale(iMax, RoundingMode.HALF_UP) : bigDecimalValueOf.setScale(iMax, RoundingMode.DOWN);
        return (iMax == 0 || a.a(scale).scale() <= 0) ? Long.valueOf(scale.longValue()) : Double.valueOf(scale.doubleValue());
    }

    private Number hww(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    private int hww(Object obj, int i10) {
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    private boolean hww(Object obj, boolean z10) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return obj instanceof String ? Boolean.parseBoolean((String) obj) : z10;
    }
}
