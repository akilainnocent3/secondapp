package com.google.android.recaptcha.internal;

import defpackage.ay0;
import defpackage.itg0;
import defpackage.l48;
import defpackage.m2g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes4.dex */
public final class zzju implements zzjt {
    public static final zzju zza = new zzju();

    private zzju() {
    }

    private static final List zzc(Object obj) {
        int i = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            if (length == 0) {
                return m2g.a;
            }
            if (length == 1) {
                return a.c(Byte.valueOf(bArr[0]));
            }
            ArrayList arrayList = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i < length2) {
                arrayList.add(Byte.valueOf(bArr[i]));
                i++;
            }
            return arrayList;
        }
        if (!(obj instanceof short[])) {
            if (obj instanceof int[]) {
                return ay0.Q((int[]) obj);
            }
            if (obj instanceof long[]) {
                return ay0.R((long[]) obj);
            }
            if (obj instanceof float[]) {
                return ay0.P((float[]) obj);
            }
            if (obj instanceof double[]) {
                return ay0.O((double[]) obj);
            }
            return null;
        }
        short[] sArr = (short[]) obj;
        int length3 = sArr.length;
        if (length3 == 0) {
            return m2g.a;
        }
        if (length3 == 1) {
            return a.c(Short.valueOf(sArr[0]));
        }
        ArrayList arrayList2 = new ArrayList(sArr.length);
        int length4 = sArr.length;
        while (i < length4) {
            arrayList2.add(Short.valueOf(sArr[i]));
            i++;
        }
        return arrayList2;
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
        if (zzztVarArr.length != 2) {
            itg0.b(4, 3, null);
            return;
        }
        Object objZza = zzizVar.zzc().zza(zzztVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            itg0.b(4, 5, null);
            return;
        }
        Object objZza2 = zzizVar.zzc().zza(zzztVarArr[1]);
        if (true != Objects.nonNull(objZza2)) {
            objZza2 = null;
        }
        if (objZza2 != null) {
            zzizVar.zzc().zze(i, zzb(objZza, objZza2));
        } else {
            itg0.b(4, 5, null);
        }
    }

    public final Object zzb(Object obj, Object obj2) throws zzdm {
        List listZzc = zzc(obj);
        List listZzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (listZzc2 != null) {
                ArrayList arrayList = new ArrayList(l48.r(listZzc2, 10));
                Iterator it = listZzc2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Double.valueOf(Math.pow(((Number) it.next()).doubleValue(), ((Number) obj).doubleValue())));
                }
                return arrayList.toArray(new Double[0]);
            }
        }
        if (listZzc != null && (obj2 instanceof Number)) {
            ArrayList arrayList2 = new ArrayList(l48.r(listZzc, 10));
            Iterator it2 = listZzc.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(Math.pow(((Number) it2.next()).doubleValue(), ((Number) obj2).doubleValue())));
            }
            return arrayList2.toArray(new Double[0]);
        }
        if (listZzc == null || listZzc2 == null) {
            itg0.b(4, 5, null);
            return null;
        }
        zzjs.zza(this, listZzc.size(), listZzc2.size());
        int size = listZzc.size();
        Double[] dArr = new Double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = Double.valueOf(Math.pow(((Number) listZzc.get(i)).doubleValue(), ((Number) listZzc2.get(i)).doubleValue()));
        }
        return dArr;
    }
}
