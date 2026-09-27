package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzibj extends AbstractMap implements Serializable {
    private static final Comparator zze = new zzibc();
    zzibi zza;
    int zzb;
    int zzc;
    final zzibi zzd;
    private final Comparator zzf;
    private final boolean zzg;
    private zzibe zzh;
    private zzibg zzi;

    public zzibj() {
        this(zze, true);
    }

    private final void zzf(zzibi zzibiVar, zzibi zzibiVar2) {
        zzibi zzibiVar3 = zzibiVar.zza;
        zzibiVar.zza = null;
        if (zzibiVar2 != null) {
            zzibiVar2.zza = zzibiVar3;
        }
        if (zzibiVar3 == null) {
            this.zza = zzibiVar2;
        } else if (zzibiVar3.zzb == zzibiVar) {
            zzibiVar3.zzb = zzibiVar2;
        } else {
            zzibiVar3.zzc = zzibiVar2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0080 A[SYNTHETIC] */
    private final void zzg(zzibi zzibiVar, boolean z10) {
        while (zzibiVar != null) {
            zzibi zzibiVar2 = zzibiVar.zzb;
            zzibi zzibiVar3 = zzibiVar.zzc;
            boolean z11 = false;
            int i10 = zzibiVar2 != null ? zzibiVar2.zzi : 0;
            int i11 = zzibiVar3 != null ? zzibiVar3.zzi : 0;
            int i12 = i10 - i11;
            boolean z12 = true;
            if (i12 == -2) {
                zzibi zzibiVar4 = zzibiVar3.zzb;
                zzibi zzibiVar5 = zzibiVar3.zzc;
                int i13 = (zzibiVar4 != null ? zzibiVar4.zzi : 0) - (zzibiVar5 != null ? zzibiVar5.zzi : 0);
                if (i13 != -1) {
                    if (i13 == 0) {
                        if (!z10) {
                        }
                        if (z12) {
                            return;
                        }
                    } else {
                        z12 = z10;
                    }
                    zzi(zzibiVar3);
                    zzh(zzibiVar);
                    if (z12) {
                        return;
                    }
                } else {
                    z11 = z10;
                }
                zzh(zzibiVar);
                z12 = z11;
                if (z12) {
                    return;
                }
            } else if (i12 == 2) {
                zzibi zzibiVar6 = zzibiVar2.zzb;
                zzibi zzibiVar7 = zzibiVar2.zzc;
                int i14 = (zzibiVar6 != null ? zzibiVar6.zzi : 0) - (zzibiVar7 != null ? zzibiVar7.zzi : 0);
                if (i14 != 1) {
                    if (i14 == 0) {
                        if (!z10) {
                        }
                        if (z12) {
                            return;
                        }
                    } else {
                        z12 = z10;
                    }
                    zzh(zzibiVar2);
                    zzi(zzibiVar);
                    if (z12) {
                        return;
                    }
                } else {
                    z11 = z10;
                }
                zzi(zzibiVar);
                z12 = z11;
                if (z12) {
                    return;
                }
            } else if (i12 == 0) {
                zzibiVar.zzi = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                zzibiVar.zzi = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            zzibiVar = zzibiVar.zza;
        }
    }

    private final void zzh(zzibi zzibiVar) {
        zzibi zzibiVar2 = zzibiVar.zzb;
        zzibi zzibiVar3 = zzibiVar.zzc;
        zzibi zzibiVar4 = zzibiVar3.zzb;
        zzibi zzibiVar5 = zzibiVar3.zzc;
        zzibiVar.zzc = zzibiVar4;
        if (zzibiVar4 != null) {
            zzibiVar4.zza = zzibiVar;
        }
        zzf(zzibiVar, zzibiVar3);
        zzibiVar3.zzb = zzibiVar;
        zzibiVar.zza = zzibiVar3;
        int iMax = Math.max(zzibiVar2 != null ? zzibiVar2.zzi : 0, zzibiVar4 != null ? zzibiVar4.zzi : 0) + 1;
        zzibiVar.zzi = iMax;
        zzibiVar3.zzi = Math.max(iMax, zzibiVar5 != null ? zzibiVar5.zzi : 0) + 1;
    }

    private final void zzi(zzibi zzibiVar) {
        zzibi zzibiVar2 = zzibiVar.zzb;
        zzibi zzibiVar3 = zzibiVar.zzc;
        zzibi zzibiVar4 = zzibiVar2.zzb;
        zzibi zzibiVar5 = zzibiVar2.zzc;
        zzibiVar.zzb = zzibiVar5;
        if (zzibiVar5 != null) {
            zzibiVar5.zza = zzibiVar;
        }
        zzf(zzibiVar, zzibiVar2);
        zzibiVar2.zzc = zzibiVar;
        zzibiVar.zza = zzibiVar2;
        int iMax = Math.max(zzibiVar3 != null ? zzibiVar3.zzi : 0, zzibiVar5 != null ? zzibiVar5.zzi : 0) + 1;
        zzibiVar.zzi = iMax;
        zzibiVar2.zzi = Math.max(iMax, zzibiVar4 != null ? zzibiVar4.zzi : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.zza = null;
        this.zzb = 0;
        this.zzc++;
        zzibi zzibiVar = this.zzd;
        zzibiVar.zze = zzibiVar;
        zzibiVar.zzd = zzibiVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return zzb(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        zzibe zzibeVar = this.zzh;
        if (zzibeVar != null) {
            return zzibeVar;
        }
        zzibe zzibeVar2 = new zzibe(this);
        this.zzh = zzibeVar2;
        return zzibeVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        zzibi zzibiVarZzb = zzb(obj);
        if (zzibiVarZzb != null) {
            return zzibiVarZzb.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        zzibg zzibgVar = this.zzi;
        if (zzibgVar != null) {
            return zzibgVar;
        }
        zzibg zzibgVar2 = new zzibg(this);
        this.zzi = zzibgVar2;
        return zzibgVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.zzg) {
            throw new NullPointerException("value == null");
        }
        zzibi zzibiVarZza = zza(obj, true);
        Object obj3 = zzibiVarZza.zzh;
        zzibiVarZza.zzh = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzibi zzibiVarZze = zze(obj);
        if (zzibiVarZze != null) {
            return zzibiVarZze.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb;
    }

    public final zzibi zza(Object obj, boolean z10) {
        int iCompareTo;
        zzibi zzibiVar;
        Comparator comparator = this.zzf;
        zzibi zzibiVar2 = this.zza;
        if (zzibiVar2 != null) {
            Comparable comparable = comparator == zze ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(zzibiVar2.zzf) : comparator.compare(obj, zzibiVar2.zzf);
                if (iCompareTo == 0) {
                    return zzibiVar2;
                }
                zzibi zzibiVar3 = iCompareTo < 0 ? zzibiVar2.zzb : zzibiVar2.zzc;
                if (zzibiVar3 == null) {
                    break;
                }
                zzibiVar2 = zzibiVar3;
            }
        } else {
            iCompareTo = 0;
        }
        int i10 = iCompareTo;
        if (!z10) {
            return null;
        }
        zzibi zzibiVar4 = this.zzd;
        if (zzibiVar2 != null) {
            zzibi zzibiVar5 = zzibiVar2;
            zzibiVar = new zzibi(this.zzg, zzibiVar5, obj, zzibiVar4, zzibiVar4.zze);
            if (i10 < 0) {
                zzibiVar5.zzb = zzibiVar;
            } else {
                zzibiVar5.zzc = zzibiVar;
            }
            zzg(zzibiVar5, true);
        } else {
            if (comparator == zze && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            zzibiVar = new zzibi(this.zzg, null, obj, zzibiVar4, zzibiVar4.zze);
            this.zza = zzibiVar;
        }
        this.zzb++;
        this.zzc++;
        return zzibiVar;
    }

    public final zzibi zzb(Object obj) {
        if (obj != null) {
            try {
                return zza(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public final zzibi zzc(Map.Entry entry) {
        zzibi zzibiVarZzb = zzb(entry.getKey());
        if (zzibiVarZzb == null || !Objects.equals(zzibiVarZzb.zzh, entry.getValue())) {
            return null;
        }
        return zzibiVarZzb;
    }

    public final void zzd(zzibi zzibiVar, boolean z10) {
        zzibi zzibiVar2;
        zzibi zzibiVar3;
        int i10;
        if (z10) {
            zzibi zzibiVar4 = zzibiVar.zze;
            zzibiVar4.zzd = zzibiVar.zzd;
            zzibiVar.zzd.zze = zzibiVar4;
        }
        zzibi zzibiVar5 = zzibiVar.zzb;
        zzibi zzibiVar6 = zzibiVar.zzc;
        zzibi zzibiVar7 = zzibiVar.zza;
        int i11 = 0;
        if (zzibiVar5 == null || zzibiVar6 == null) {
            if (zzibiVar5 != null) {
                zzf(zzibiVar, zzibiVar5);
                zzibiVar.zzb = null;
            } else if (zzibiVar6 != null) {
                zzf(zzibiVar, zzibiVar6);
                zzibiVar.zzc = null;
            } else {
                zzf(zzibiVar, null);
            }
            zzg(zzibiVar7, false);
            this.zzb--;
            this.zzc++;
            return;
        }
        if (zzibiVar5.zzi > zzibiVar6.zzi) {
            do {
                zzibiVar3 = zzibiVar5;
                zzibiVar5 = zzibiVar5.zzc;
            } while (zzibiVar5 != null);
        } else {
            do {
                zzibiVar2 = zzibiVar6;
                zzibiVar6 = zzibiVar6.zzb;
            } while (zzibiVar6 != null);
            zzibiVar3 = zzibiVar2;
        }
        zzd(zzibiVar3, false);
        zzibi zzibiVar8 = zzibiVar.zzb;
        if (zzibiVar8 != null) {
            i10 = zzibiVar8.zzi;
            zzibiVar3.zzb = zzibiVar8;
            zzibiVar8.zza = zzibiVar3;
            zzibiVar.zzb = null;
        } else {
            i10 = 0;
        }
        zzibi zzibiVar9 = zzibiVar.zzc;
        if (zzibiVar9 != null) {
            i11 = zzibiVar9.zzi;
            zzibiVar3.zzc = zzibiVar9;
            zzibiVar9.zza = zzibiVar3;
            zzibiVar.zzc = null;
        }
        zzibiVar3.zzi = Math.max(i10, i11) + 1;
        zzf(zzibiVar, zzibiVar3);
    }

    public final zzibi zze(Object obj) {
        zzibi zzibiVarZzb = zzb(obj);
        if (zzibiVarZzb != null) {
            zzd(zzibiVarZzb, true);
        }
        return zzibiVarZzb;
    }

    public zzibj(Comparator comparator, boolean z10) {
        this.zzb = 0;
        this.zzc = 0;
        this.zzf = comparator;
        this.zzg = z10;
        this.zzd = new zzibi(z10);
    }

    public zzibj(boolean z10) {
        this(zze, false);
    }
}
