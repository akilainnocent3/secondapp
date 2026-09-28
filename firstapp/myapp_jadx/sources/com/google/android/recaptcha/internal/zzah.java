package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.v1b;
import defpackage.v5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzah extends tje0 implements Function2 {
    Object zza;
    Object zzb;
    Object zzc;
    int zzd;
    final /* synthetic */ zzxn zze;
    final /* synthetic */ zzaj zzf;
    final /* synthetic */ zzhk zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzah(zzxn zzxnVar, zzaj zzajVar, zzhk zzhkVar, v1b v1bVar) {
        super(2, v1bVar);
        this.zze = zzxnVar;
        this.zzf = zzajVar;
        this.zzg = zzhkVar;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        return new zzah(this.zze, this.zzf, this.zzg, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzah) create((v5b) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x008c  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b8 -> B:16:0x0086). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r8.zzd
            r2 = 1
            if (r1 == 0) goto L26
            if (r1 == r2) goto L15
            java.lang.Object r1 = r8.zzb
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r8.zza
            com.google.android.recaptcha.internal.zzxp r3 = (com.google.android.recaptcha.internal.zzxp) r3
            defpackage.uj50.b(r9)
            goto L86
        L15:
            java.lang.Object r1 = r8.zzc
            com.google.android.recaptcha.internal.zzhk r1 = (com.google.android.recaptcha.internal.zzhk) r1
            java.lang.Object r3 = r8.zzb
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r4 = r8.zza
            com.google.android.recaptcha.internal.zzxp r4 = (com.google.android.recaptcha.internal.zzxp) r4
            defpackage.uj50.b(r9)
            goto La6
        L26:
            defpackage.uj50.b(r9)
            com.google.android.recaptcha.internal.zzxn r9 = r8.zze
            boolean r1 = r9.zzU()
            if (r1 != 0) goto L4c
            zi50$a r8 = defpackage.zi50.b
            com.google.android.recaptcha.internal.zzcg r0 = new com.google.android.recaptcha.internal.zzcg
            com.google.android.recaptcha.internal.zzce r1 = com.google.android.recaptcha.internal.zzce.zzb
            com.google.android.recaptcha.internal.zzcd r2 = com.google.android.recaptcha.internal.zzcd.zzab
            r5 = 12
            r6 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            zi50$b r8 = new zi50$b
            r8.<init>(r0)
            zi50 r9 = new zi50
            r9.<init>(r8)
            return r9
        L4c:
            com.google.android.recaptcha.internal.zzxp r3 = r9.zzk()
            com.google.android.recaptcha.internal.zzqm r9 = r3.zzi()
            boolean r9 = r9.zzn()
            if (r9 == 0) goto L75
            zi50$a r8 = defpackage.zi50.b
            com.google.android.recaptcha.internal.zzcg r0 = new com.google.android.recaptcha.internal.zzcg
            com.google.android.recaptcha.internal.zzce r1 = com.google.android.recaptcha.internal.zzce.zzb
            com.google.android.recaptcha.internal.zzcd r2 = com.google.android.recaptcha.internal.zzcd.zzab
            r5 = 12
            r6 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            zi50$b r8 = new zi50$b
            r8.<init>(r0)
            zi50 r9 = new zi50
            r9.<init>(r8)
            return r9
        L75:
            com.google.android.recaptcha.internal.zzaj r9 = r8.zzf
            com.google.android.recaptcha.internal.zzqm r1 = r3.zzi()
            com.google.android.recaptcha.internal.zzaj.zzo(r9, r1)
            java.util.List r9 = com.google.android.recaptcha.internal.zzaj.zzm(r9)
            java.util.Iterator r1 = r9.iterator()
        L86:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto Lbc
            java.lang.Object r9 = r1.next()
            com.google.android.recaptcha.internal.zzar r9 = (com.google.android.recaptcha.internal.zzar) r9
            com.google.android.recaptcha.internal.zzhk r4 = r8.zzg
            r8.zza = r3
            r8.zzb = r1
            r8.zzc = r4
            r8.zzd = r2
            java.lang.Object r9 = r9.zzd(r3, r8)
            if (r9 == r0) goto Lbb
            r7 = r3
            r3 = r1
            r1 = r4
            r4 = r7
        La6:
            com.google.android.recaptcha.internal.zzhf r9 = (com.google.android.recaptcha.internal.zzhf) r9
            r8.zza = r4
            r8.zzb = r3
            r5 = 0
            r8.zzc = r5
            r5 = 2
            r8.zzd = r5
            java.lang.Object r9 = com.google.android.recaptcha.internal.zzhj.zzb(r1, r9, r8)
            if (r9 == r0) goto Lbb
            r1 = r3
            r3 = r4
            goto L86
        Lbb:
            return r0
        Lbc:
            zi50$a r8 = defpackage.zi50.b
            kotlin.Unit r8 = kotlin.Unit.a
            zi50 r9 = new zi50
            r9.<init>(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzah.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
