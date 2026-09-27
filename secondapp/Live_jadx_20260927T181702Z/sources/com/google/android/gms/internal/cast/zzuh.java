package com.google.android.gms.internal.cast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzuh extends zzul {
    private static final Class zza = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public /* synthetic */ zzuh(zzug zzugVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.cast.zzul
    public final void zza(Object obj, long j10) {
        Object objUnmodifiableList;
        List list = (List) zzwj.zzf(obj, j10);
        if (list instanceof zzuf) {
            objUnmodifiableList = ((zzuf) list).zzd();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzve) && (list instanceof zztx)) {
                zztx zztxVar = (zztx) list;
                if (zztxVar.zzc()) {
                    zztxVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzwj.zzs(obj, j10, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.cast.zzul
    public final void zzb(Object obj, Object obj2, long j10) {
        List list;
        List list2;
        List listZzg;
        List list3 = (List) zzwj.zzf(obj2, j10);
        int size = list3.size();
        List list4 = (List) zzwj.zzf(obj, j10);
        if (list4.isEmpty()) {
            if (list4 instanceof zzuf) {
                listZzg = new zzue(size);
            } else {
                listZzg = ((list4 instanceof zzve) && (list4 instanceof zztx)) ? ((zztx) list4).zzg(size) : new ArrayList(size);
            }
            zzwj.zzs(obj, j10, listZzg);
            list2 = listZzg;
        } else {
            if (zza.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                zzwj.zzs(obj, j10, arrayList);
                list = arrayList;
            } else if (list4 instanceof zzwe) {
                zzue zzueVar = new zzue(list4.size() + size);
                zzueVar.addAll(zzueVar.size(), (zzwe) list4);
                zzwj.zzs(obj, j10, zzueVar);
                list = zzueVar;
            } else if ((list4 instanceof zzve) && (list4 instanceof zztx)) {
                zztx zztxVar = (zztx) list4;
                if (!zztxVar.zzc()) {
                    list2 = list4;
                    list2 = list4;
                    list2 = list4;
                    zztx zztxVarZzg = zztxVar.zzg(list4.size() + size);
                    zzwj.zzs(obj, j10, zztxVarZzg);
                    list2 = zztxVarZzg;
                }
            }
            list2 = list;
        }
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        zzwj.zzs(obj, j10, list3);
    }

    private zzuh() {
        super(null);
    }
}
