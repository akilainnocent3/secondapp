package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.home.MainViewModel$fetchFirebaseRemoteConfig$1", f = "MainViewModel.kt", l = {350, 352}, m = "invokeSuspend", v = 2)
public final class tku extends tje0 implements Function2<hih, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ oku c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tku(v1b v1bVar, oku okuVar) {
        super(2, v1bVar);
        this.c = okuVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        tku tkuVar = new tku(v1bVar, this.c);
        tkuVar.b = obj;
        return tkuVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(hih hihVar, v1b<? super Unit> v1bVar) {
        return ((tku) create(hihVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r10.a.putLong("firebase_remote_config_last_fetch_time", r0, r9) == r1) goto L20;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.b
            hih r0 = (defpackage.hih) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r9.a
            r3 = 0
            r4 = 2
            r5 = 1
            oku r6 = r9.c
            if (r2 == 0) goto L21
            if (r2 == r5) goto L1d
            if (r2 != r4) goto L17
            defpackage.uj50.b(r10)
            goto L65
        L17:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r3
        L1d:
            defpackage.uj50.b(r10)
            goto L48
        L21:
            defpackage.uj50.b(r10)
            hih$a r10 = hih.a.a
            boolean r10 = kotlin.jvm.internal.Intrinsics.g(r0, r10)
            if (r10 == 0) goto L30
            r6.C1()
            goto L65
        L30:
            boolean r10 = r0 instanceof hih.b
            if (r10 == 0) goto L68
            r9.b = r0
            r9.a = r5
            k650 r10 = r6.A
            java.lang.String r2 = "high_lights_update_interval"
            long r7 = r10.c(r2)
            defpackage.vn20.h(r7, r2, r5)
            kotlin.Unit r10 = kotlin.Unit.a
            if (r10 != r1) goto L48
            goto L64
        L48:
            r6.C1()
            m2l r10 = r6.i
            hih$b r0 = (hih.b) r0
            long r5 = r0.a
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r5)
            r9.b = r3
            r9.a = r4
            zed r10 = r10.a
            java.lang.String r2 = "firebase_remote_config_last_fetch_time"
            java.lang.Object r9 = r10.putLong(r2, r0, r9)
            if (r9 != r1) goto L65
        L64:
            return r1
        L65:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L68:
            defpackage.uhc.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tku.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
