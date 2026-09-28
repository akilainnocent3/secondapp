package com.google.android.recaptcha.internal;

import defpackage.hb5;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
public final class zzmj extends zzmn implements Serializable {
    final int zza;
    private final Queue zzb;

    private zzmj(int i) {
        if (i < 0) {
            hb5.a(zzmg.zza("maxSize (%s) must >= 0", Integer.valueOf(i)));
            throw null;
        }
        this.zzb = new ArrayDeque(i);
        this.zza = i;
    }

    public static zzmj zza(int i) {
        return new zzmj(i);
    }

    @Override // com.google.android.recaptcha.internal.zzml, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        int i = this.zza;
        if (i == 0) {
            return true;
        }
        if (size() == i) {
            this.zzb.remove();
        }
        this.zzb.add(obj);
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzml, java.util.Collection
    public final boolean addAll(Collection collection) {
        int size = collection.size();
        int i = this.zza;
        if (size < i) {
            return zzmq.zza(this, collection.iterator());
        }
        clear();
        int i2 = size - i;
        zzmd.zzb(i2 >= 0, "number to skip cannot be negative");
        return zzmq.zza(this, new zzmp(collection, i2).iterator());
    }

    @Override // com.google.android.recaptcha.internal.zzmn, java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzml, com.google.android.recaptcha.internal.zzmm
    public final /* synthetic */ Object zzb() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzmn, com.google.android.recaptcha.internal.zzml
    public final /* synthetic */ Collection zzc() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzmn
    public final Queue zzd() {
        return this.zzb;
    }
}
