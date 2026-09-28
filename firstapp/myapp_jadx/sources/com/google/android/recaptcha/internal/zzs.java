package com.google.android.recaptcha.internal;

import android.app.Application;
import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.recaptchabase.InitRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.o5f0;
import defpackage.sl0;
import defpackage.tje0;
import defpackage.u4l;
import defpackage.uel0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.y5b;
import defpackage.yyk0;
import defpackage.z550;
import defpackage.zi50;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzs extends tje0 implements Function2 {
    final /* synthetic */ zzu zza;
    final /* synthetic */ zzxn zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzu zzuVar, zzxn zzxnVar, v1b v1bVar) {
        super(2, v1bVar);
        this.zza = zzuVar;
        this.zzb = zzxnVar;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        return new zzs(this.zza, this.zzb, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((zzhk) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        zzu zzuVar = this.zza;
        if (!zzuVar.zza.zzb(zzu.zzl(zzuVar))) {
            zi50.a aVar = zi50.b;
            return new zi50(new zi50.b(new zzcg(zzce.zzb, zzcd.zzar, null, null, 12, null)));
        }
        zzxn zzxnVar = this.zzb;
        if (!zzxnVar.zzR() || zzxnVar.zzg().zzf().zzn()) {
            zi50.a aVar2 = zi50.b;
            return new zi50(new zi50.b(new zzcg(zzce.zzb, zzcd.zzaD, null, null, 12, null)));
        }
        zzuVar.zzb = zzxnVar.zzg().zzf().zzm();
        final InitRequest initRequest = new InitRequest();
        Application applicationZzl = zzu.zzl(zzuVar);
        applicationZzl.getClass();
        uel0 uel0Var = new uel0(applicationZzl, null, uel0.k, sl0.d.g, u4l.a.c);
        o5f0.a aVarA = o5f0.a();
        aVarA.c = new Feature[]{yyk0.b};
        aVarA.a = new z550() { // from class: s5l0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.z550
            public final void accept(Object obj2, Object obj3) {
                sl0 sl0Var = uel0.k;
                ocl0 ocl0Var = new ocl0((TaskCompletionSource) obj3);
                k1l0 k1l0Var = (k1l0) ((fhl0) obj2).v();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i = nuk0.a;
                parcelObtain.writeStrongBinder(ocl0Var);
                parcelObtain.writeInt(1);
                initRequest.writeToParcel(parcelObtain, 0);
                k1l0Var.a(parcelObtain, 1);
            }
        };
        aVarA.d = 34001;
        Task taskC = uel0Var.c(0, aVarA.a());
        taskC.getClass();
        zzuVar.zzc = zzdf.zza(taskC);
        zi50.a aVar3 = zi50.b;
        return new zi50(Unit.a);
    }
}
