package defpackage;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class crk0 {
    public static final crk0 f = new crk0((Boolean) null, 100, (Boolean) null, (String) null);
    public final int a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final EnumMap e;

    public crk0(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(hbl0.class);
        this.e = enumMap;
        enumMap.put(hbl0.AD_USER_DATA, bool == null ? dbl0.UNINITIALIZED : bool.booleanValue() ? dbl0.GRANTED : dbl0.DENIED);
        this.a = i;
        this.b = d();
        this.c = bool2;
        this.d = str;
    }

    public static crk0 b(String str) {
        if (str == null || str.length() <= 0) {
            return f;
        }
        String[] strArrSplit = str.split(":");
        int i = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(hbl0.class);
        hbl0[] hbl0VarArr = fbl0.DMA.a;
        int length = hbl0VarArr.length;
        int i2 = 1;
        int i3 = 0;
        while (i3 < length) {
            enumMap.put(hbl0VarArr[i3], jbl0.e(strArrSplit[i2].charAt(0)));
            i3++;
            i2++;
        }
        return new crk0(enumMap, i, (Boolean) null, (String) null);
    }

    public static crk0 c(int i, Bundle bundle) {
        if (bundle == null) {
            return new crk0((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(hbl0.class);
        for (hbl0 hbl0Var : fbl0.DMA.a) {
            enumMap.put(hbl0Var, jbl0.d(bundle.getString(hbl0Var.a)));
        }
        return new crk0(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public final dbl0 a() {
        dbl0 dbl0Var = (dbl0) this.e.get(hbl0.AD_USER_DATA);
        return dbl0Var == null ? dbl0.UNINITIALIZED : dbl0Var;
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        for (hbl0 hbl0Var : fbl0.DMA.a) {
            sb.append(":");
            sb.append(jbl0.h((dbl0) this.e.get(hbl0Var)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof crk0)) {
            return false;
        }
        crk0 crk0Var = (crk0) obj;
        if (this.b.equalsIgnoreCase(crk0Var.b) && Objects.equals(this.c, crk0Var.c)) {
            return Objects.equals(this.d, crk0Var.d);
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Boolean bool = this.c;
        if (bool == null) {
            i = 3;
        } else {
            i = true != bool.booleanValue() ? 13 : 7;
        }
        String str = this.d;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.b.hashCode() + (i * 29);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(jbl0.a(this.a));
        for (hbl0 hbl0Var : fbl0.DMA.a) {
            sb.append(",");
            sb.append(hbl0Var.a);
            sb.append("=");
            dbl0 dbl0Var = (dbl0) this.e.get(hbl0Var);
            if (dbl0Var == null) {
                sb.append("uninitialized");
            } else {
                int iOrdinal = dbl0Var.ordinal();
                if (iOrdinal == 0) {
                    sb.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb.append("denied");
                } else if (iOrdinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public crk0(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(hbl0.class);
        this.e = enumMap2;
        enumMap2.putAll(enumMap);
        this.a = i;
        this.b = d();
        this.c = bool;
        this.d = str;
    }
}
