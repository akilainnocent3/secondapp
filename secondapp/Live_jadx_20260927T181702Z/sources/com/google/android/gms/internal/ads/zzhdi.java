package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhdi {
    private final List zza = new ArrayList();
    private final Map zzb = new HashMap();
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzhdg) it.next()).zzd(false);
        }
    }

    public final zzhdi zza(zzhdg zzhdgVar) {
        if (zzhdgVar.zzh() != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzhdgVar.zzc()) {
            zzc();
        }
        zzhdgVar.zzi(this);
        this.zza.add(zzhdgVar);
        return this;
    }

    public final zzhdn zzb() throws GeneralSecurityException {
        int i10;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.zzc = true;
        List<zzhdg> list = this.zza;
        ArrayList arrayList = new ArrayList(list.size());
        int i11 = 0;
        while (i11 < list.size() - 1) {
            int i12 = i11 + 1;
            if (((zzhdg) list.get(i11)).zzg() == zzhdh.zza && ((zzhdg) list.get(i12)).zzg() != zzhdh.zza) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i11 = i12;
        }
        HashSet hashSet = new HashSet();
        byte[] bArr = null;
        Integer num = null;
        for (zzhdg zzhdgVar : list) {
            zzhdgVar.zze();
            if (zzhdgVar.zzg() == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            int i13 = 3;
            if (zzhdgVar.zzg() == zzhdh.zza) {
                int i14 = 0;
                while (true) {
                    if (i14 != 0 && !hashSet.contains(Integer.valueOf(i14))) {
                        break;
                    }
                    int i15 = zzhnq.zza;
                    i14 = 0;
                    while (i14 == 0) {
                        byte[] bArrZza = zzhnh.zza(4);
                        i14 = (bArrZza[3] & 255) | ((bArrZza[0] & 255) << 24) | ((bArrZza[1] & 255) << 16) | ((bArrZza[2] & 255) << 8);
                    }
                }
                i10 = i14;
            } else {
                zzhdgVar.zzg();
                i10 = 0;
            }
            Integer numValueOf = Integer.valueOf(i10);
            if (hashSet.contains(numValueOf)) {
                int i16 = i10;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i16).length() + 31);
                sb2.append("Id ");
                sb2.append(i16);
                sb2.append(" is used twice in the keyset");
                throw new GeneralSecurityException(sb2.toString());
            }
            hashSet.add(numValueOf);
            zzhdc zzhdcVarZzc = zzhma.zza().zzc(zzhdgVar.zzf(), true != zzhdgVar.zzf().zza() ? null : numValueOf);
            zzhde zzhdeVarZze = zzhdgVar.zze();
            zzhde zzhdeVar = zzhde.zza;
            if (!zzhdeVar.equals(zzhdeVarZze)) {
                if (zzhde.zzb.equals(zzhdeVarZze)) {
                    i13 = 4;
                } else {
                    if (!zzhde.zzc.equals(zzhdeVarZze)) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    i13 = 5;
                }
            }
            zzhdl zzhdlVar = new zzhdl(zzhdcVarZzc, i13, i10, zzhdgVar.zzc(), false, zzhdl.zza, null);
            if (zzhdgVar.zzc()) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (zzhdgVar.zze() != zzhdeVar) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = numValueOf;
            }
            arrayList.add(zzhdlVar);
        }
        if (num != null) {
            return zzhdn.zzi(new zzhdn(arrayList, this.zzb, bArr));
        }
        throw new GeneralSecurityException("No primary was set");
    }
}
