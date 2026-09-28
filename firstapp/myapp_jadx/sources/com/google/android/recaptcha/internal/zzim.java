package com.google.android.recaptcha.internal;

import defpackage.s75;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.w5b;
import defpackage.y5b;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzim extends tje0 implements Function2 {
    public static final /* synthetic */ int zze = 0;
    int zza;
    final /* synthetic */ zziz zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzip zzd;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzim(zziz zzizVar, List list, zzip zzipVar, v1b v1bVar) {
        super(2, v1bVar);
        this.zzb = zzizVar;
        this.zzc = list;
        this.zzd = zzipVar;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        zzim zzimVar = new zzim(this.zzb, this.zzc, this.zzd, v1bVar);
        zzimVar.zzf = obj;
        return zzimVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzim) create((v5b) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.zza;
        uj50.b(obj);
        if (i == 0) {
            v5b v5bVar = (v5b) this.zzf;
            while (true) {
                zziz zzizVar = this.zzb;
                if (zzizVar.zza() < 0) {
                    break;
                }
                List list = this.zzc;
                if (zzizVar.zza() >= list.size() || !w5b.e(v5bVar)) {
                    break;
                }
                zzzu zzzuVar = (zzzu) list.get(zzizVar.zza());
                try {
                    zzip.zzf(this.zzd, zzzuVar, zzizVar);
                } catch (Exception e) {
                    zzzuVar.zzk();
                    s75.a(zzzuVar.zzg());
                    List listZzj = zzzuVar.zzj();
                    final zzip zzipVar = this.zzd;
                    CollectionsKt.a0(listZzj, null, null, null, new Function1(zzipVar) { // from class: com.google.android.recaptcha.internal.zzil
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            ((zzzt) obj2).getClass();
                            return "";
                        }
                    }, 31);
                    zziz zzizVar2 = this.zzb;
                    this.zza = 1;
                    if (zzipVar.zzh(e, zzizVar2, this) == y5bVar) {
                        return y5bVar;
                    }
                }
            }
            return Unit.a;
        }
        return Unit.a;
    }
}
