package com.google.android.recaptcha.internal;

import defpackage.zkh;

/* JADX INFO: loaded from: classes4.dex */
final class zztj implements zztq {
    private final zztq[] zza;

    public zztj(zztq... zztqVarArr) {
        this.zza = zztqVarArr;
    }

    @Override // com.google.android.recaptcha.internal.zztq
    public final zztp zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zztq zztqVar = this.zza[i];
            if (zztqVar.zzc(cls)) {
                return zztqVar.zzb(cls);
            }
        }
        zkh.a("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zztq
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
