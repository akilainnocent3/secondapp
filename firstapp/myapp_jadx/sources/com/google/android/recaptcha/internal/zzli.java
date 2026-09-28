package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzli extends tje0 implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzly zzc;
    final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzli(zzly zzlyVar, String str, v1b v1bVar) {
        super(2, v1bVar);
        this.zzc = zzlyVar;
        this.zzd = str;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        return new zzli(this.zzc, this.zzd, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzli) create((zzgr) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws zzcg {
        String strZza;
        y5b y5bVar = y5b.a;
        try {
            if (this.zzb != 0) {
                String str = (String) this.zza;
                uj50.b(obj);
                strZza = str;
            } else {
                uj50.b(obj);
                zzly zzlyVar = this.zzc;
                strZza = zzly.zzm(zzlyVar).zza();
                this.zza = strZza;
                this.zzb = 1;
                obj = zzlyVar.zzv(this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            }
            ((WebView) obj).loadDataWithBaseURL(strZza, this.zzd, "text/html", "utf-8", null);
            return Unit.a;
        } catch (Exception e) {
            zzcg zzcgVar = new zzcg(zzce.zzb, zzcd.zzU, e.getMessage(), null, 8, null);
            this.zzc.zzz().F(zzcgVar);
            throw zzcgVar;
        }
    }
}
