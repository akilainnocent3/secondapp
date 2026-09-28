package com.google.android.recaptcha.internal;

import defpackage.itg0;
import defpackage.l48;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzja {
    private final Map zza = new LinkedHashMap();
    private final Set zzb = new LinkedHashSet();

    private final List zzh(List list) {
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zza((zzzt) it.next()));
        }
        return arrayList;
    }

    public final Object zza(zzzt zzztVar) throws zzdm {
        int iZzS = zzztVar.zzS();
        int i = iZzS - 1;
        if (iZzS == 0) {
            throw null;
        }
        switch (i) {
            case 0:
                return this.zza.get(Integer.valueOf(zzztVar.zzi()));
            case 1:
                return Boolean.valueOf(zzztVar.zzQ());
            case 2:
                byte[] bArrZzo = zzztVar.zzM().zzo();
                if (bArrZzo.length == 1) {
                    return Byte.valueOf(bArrZzo[0]);
                }
                itg0.b(4, 6, null);
                return null;
            case 3:
                String strZzO = zzztVar.zzO();
                if (strZzO.length() == 1) {
                    return Character.valueOf(strZzO.charAt(0));
                }
                itg0.b(4, 6, null);
                return null;
            case 4:
                int iZzj = zzztVar.zzj();
                if (iZzj >= -32768 && iZzj <= 32767) {
                    return Short.valueOf((short) iZzj);
                }
                itg0.b(4, 6, null);
                return null;
            case 5:
                return Integer.valueOf(zzztVar.zzk());
            case 6:
            case 8:
                itg0.b(4, 6, null);
                return null;
            case 7:
                return Long.valueOf(zzztVar.zzl());
            case 9:
                return Float.valueOf(zzztVar.zzg());
            case 10:
                return Double.valueOf(zzztVar.zzf());
            case 11:
                return zzztVar.zzP();
            default:
                itg0.b(4, 5, null);
            case 12:
                return null;
        }
    }

    public final Object zzb(int i) {
        return this.zza.remove(Integer.valueOf(i));
    }

    public final void zzc() {
        this.zza.clear();
    }

    public final void zzd(int i, Object obj) {
        zze(173, obj);
        this.zzb.add(173);
    }

    public final void zze(int i, Object obj) {
        this.zza.put(Integer.valueOf(i), obj);
    }

    public final Class[] zzf(List list) {
        List listZzh = zzh(list);
        ArrayList arrayList = new ArrayList(l48.r(listZzh, 10));
        Iterator it = listZzh.iterator();
        while (it.hasNext()) {
            arrayList.add(zziy.zza(it.next()));
        }
        return (Class[]) arrayList.toArray(new Class[0]);
    }

    public final Object[] zzg(List list) {
        return zzh(list).toArray(new Object[0]);
    }
}
