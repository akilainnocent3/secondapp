package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzan extends zzai implements zzak {

    @yi.e
    protected final List zza;

    @yi.e
    protected final List zzb;

    @yi.e
    protected zzg zzc;

    private zzan(zzan zzanVar) {
        super(zzanVar.zzd);
        ArrayList arrayList = new ArrayList(zzanVar.zza.size());
        this.zza = arrayList;
        arrayList.addAll(zzanVar.zza);
        ArrayList arrayList2 = new ArrayList(zzanVar.zzb.size());
        this.zzb = arrayList2;
        arrayList2.addAll(zzanVar.zzb);
        this.zzc = zzanVar.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao zza(zzg zzgVar, List list) {
        zzg zzgVarZzc = this.zzc.zzc();
        int i10 = 0;
        while (true) {
            List list2 = this.zza;
            if (i10 >= list2.size()) {
                break;
            }
            if (i10 < list.size()) {
                zzgVarZzc.zzf((String) list2.get(i10), zzgVar.zza((zzao) list.get(i10)));
            } else {
                zzgVarZzc.zzf((String) list2.get(i10), zzao.zzf);
            }
            i10++;
        }
        for (zzao zzaoVar : this.zzb) {
            zzao zzaoVarZza = zzgVarZzc.zza(zzaoVar);
            if (zzaoVarZza instanceof zzap) {
                zzaoVarZza = zzgVarZzc.zza(zzaoVar);
            }
            if (zzaoVarZza instanceof zzag) {
                return ((zzag) zzaoVarZza).zzb();
            }
        }
        return zzao.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzai, com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        return new zzan(this);
    }

    public zzan(String str, List list, List list2, zzg zzgVar) {
        super(str);
        this.zza = new ArrayList();
        this.zzc = zzgVar;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.zza.add(((zzao) it.next()).zzc());
            }
        }
        this.zzb = new ArrayList(list2);
    }
}
