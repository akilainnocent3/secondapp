package com.google.android.recaptcha.internal;

import android.app.Application;
import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.recaptchabase.ExecuteRequest;
import com.google.android.gms.recaptchabase.ExecuteResult;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.ib5;
import defpackage.o5f0;
import defpackage.ojd;
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
final class zzr extends tje0 implements Function2 {
    int zza;
    final /* synthetic */ zzu zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzr(zzu zzuVar, String str, v1b v1bVar) {
        super(2, v1bVar);
        this.zzb = zzuVar;
        this.zzc = str;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        return new zzr(this.zzb, this.zzc, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzr) create((zzhk) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ad  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str;
        y5b y5bVar = y5b.a;
        int i = this.zza;
        try {
            try {
                if (i == 0) {
                    uj50.b(obj);
                    ojd ojdVar = this.zzb.zzc;
                    if (ojdVar == null) {
                        ojdVar = null;
                    }
                    this.zza = 1;
                    obj = ojdVar.await(this);
                    if (obj != y5bVar) {
                    }
                    return y5bVar;
                }
                if (i != 1) {
                    uj50.b(obj);
                } else {
                    uj50.b(obj);
                }
                str = ((ExecuteResult) obj).a;
                if (str != null) {
                    ib5.a("Required value was null.");
                    return null;
                }
                String str2 = this.zzc;
                zzxw zzxwVarZzf = zzxx.zzf();
                zzxwVarZzf.zze(str2);
                zzxi zzxiVarZzf = zzxj.zzf();
                zzxiVarZzf.zze(str);
                zzxwVarZzf.zzf((zzxj) zzxiVarZzf.zzk());
                return new zi50((zzxx) zzxwVarZzf.zzk());
                final ExecuteRequest executeRequest = new ExecuteRequest();
                zzu zzuVar = this.zzb;
                String str3 = zzuVar.zzb;
                if (str3 == null) {
                    str3 = null;
                }
                executeRequest.a = str3;
                executeRequest.b = this.zzc;
                Application applicationZzl = zzu.zzl(zzuVar);
                applicationZzl.getClass();
                uel0 uel0Var = new uel0(applicationZzl, null, uel0.k, sl0.d.g, u4l.a.c);
                o5f0.a aVarA = o5f0.a();
                aVarA.c = new Feature[]{yyk0.a};
                aVarA.a = new z550() { // from class: h3l0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.z550
                    public final void accept(Object obj2, Object obj3) {
                        sl0 sl0Var = uel0.k;
                        ial0 ial0Var = new ial0((TaskCompletionSource) obj3);
                        k1l0 k1l0Var = (k1l0) ((fhl0) obj2).v();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                        int i2 = nuk0.a;
                        parcelObtain.writeStrongBinder(ial0Var);
                        parcelObtain.writeInt(1);
                        executeRequest.writeToParcel(parcelObtain, 0);
                        k1l0Var.a(parcelObtain, 2);
                    }
                };
                aVarA.d = 34002;
                Task taskC = uel0Var.c(0, aVarA.a());
                taskC.getClass();
                ojd ojdVarZza = zzdf.zza(taskC);
                this.zza = 2;
                obj = ojdVarZza.await(this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
                str = ((ExecuteResult) obj).a;
                if (str != null) {
                    ib5.a("Required value was null.");
                    return null;
                }
                String str4 = this.zzc;
                zzxw zzxwVarZzf2 = zzxx.zzf();
                zzxwVarZzf2.zze(str4);
                zzxi zzxiVarZzf2 = zzxj.zzf();
                zzxiVarZzf2.zze(str);
                zzxwVarZzf2.zzf((zzxj) zzxiVarZzf2.zzk());
                return new zi50((zzxx) zzxwVarZzf2.zzk());
            } catch (Exception unused) {
                zi50.a aVar = zi50.b;
                return new zi50(new zi50.b(new zzcg(zzce.zzb, zzcd.zzat, null, null, 12, null)));
            }
        } catch (Exception unused2) {
            zi50.a aVar2 = zi50.b;
            return new zi50(new zi50.b(new zzcg(zzce.zzb, zzcd.zzau, null, null, 12, null)));
        }
    }
}
