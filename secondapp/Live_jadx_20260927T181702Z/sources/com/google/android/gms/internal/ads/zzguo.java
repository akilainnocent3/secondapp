package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
class zzguo extends zzgum implements List {
    final /* synthetic */ zzgup zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzguo(zzgup zzgupVar, Object obj, List list, zzgum zzgumVar) {
        super(zzgupVar, obj, list, zzgumVar);
        Objects.requireNonNull(zzgupVar);
        this.zzf = zzgupVar;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        zza();
        boolean zIsEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i10, obj);
        zzgup zzgupVar = this.zzf;
        zzgupVar.zzq(zzgupVar.zzp() + 1);
        if (zIsEmpty) {
            zzc();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.zzb).addAll(i10, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.zzb.size();
        zzgup zzgupVar = this.zzf;
        zzgupVar.zzq(zzgupVar.zzp() + (size2 - size));
        if (size != 0) {
            return zAddAll;
        }
        zzc();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zza();
        return ((List) this.zzb).get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zza();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zza();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zza();
        return new zzgun(this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        zza();
        Object objRemove = ((List) this.zzb).remove(i10);
        zzgup zzgupVar = this.zzf;
        zzgupVar.zzq(zzgupVar.zzp() - 1);
        zzb();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        zza();
        return ((List) this.zzb).set(i10, obj);
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        zza();
        List listSubList = ((List) this.zzb).subList(i10, i11);
        zzgum zzgumVar = this.zzc;
        if (zzgumVar == null) {
            zzgumVar = this;
        }
        return this.zzf.zzg(this.zza, listSubList, zzgumVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        zza();
        return new zzgun(this, i10);
    }
}
