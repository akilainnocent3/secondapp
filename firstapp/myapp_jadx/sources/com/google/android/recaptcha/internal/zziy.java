package com.google.android.recaptcha.internal;

import defpackage.hwr;
import defpackage.itg0;

/* JADX INFO: loaded from: classes4.dex */
public final class zziy {
    public static final Class zza(Object obj) throws zzdm {
        Class cls;
        if (obj instanceof Class) {
            return (Class) obj;
        }
        if (!(obj instanceof Integer)) {
            if (!(obj instanceof String)) {
                itg0.b(4, 5, null);
                return null;
            }
            try {
                String str = (String) obj;
                Class<?> cls2 = Class.forName(str);
                int i = zzby.zza;
                if (((zziq) hwr.b(zzix.zza).getValue()).zzb(str)) {
                    return cls2;
                }
                itg0.b(6, 47, null);
                return null;
            } catch (Exception e) {
                itg0.b(6, 8, e);
                return null;
            }
        }
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue == 1) {
            cls = Integer.TYPE;
        } else if (iIntValue == 2) {
            cls = Short.TYPE;
        } else if (iIntValue == 3) {
            cls = Byte.TYPE;
        } else if (iIntValue == 4) {
            cls = Long.TYPE;
        } else if (iIntValue == 5) {
            cls = Character.TYPE;
        } else if (iIntValue == 6) {
            cls = Float.TYPE;
        } else if (iIntValue == 7) {
            cls = Double.TYPE;
        } else {
            cls = iIntValue == 8 ? Boolean.TYPE : null;
        }
        if (cls != null) {
            return cls;
        }
        itg0.b(4, 6, null);
        return null;
    }
}
