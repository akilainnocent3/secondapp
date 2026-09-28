package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.devicemanagement.impl.domain.usecase.hint.GetShouldShowDeviceManagementHintInSettingsUseCaseImpl$invoke$1", f = "GetShouldShowDeviceManagementHintInSettingsUseCaseImpl.kt", l = {19, 19}, m = "invokeSuspend", v = 2)
public final class ydk extends tje0 implements Function2<myh<? super Boolean>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ bek d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydk(bek bekVar, v1b<? super ydk> v1bVar) {
        super(2, v1bVar);
        this.d = bekVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ydk ydkVar = new ydk(this.d, v1bVar);
        ydkVar.c = obj;
        return ydkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super Boolean> myhVar, v1b<? super Unit> v1bVar) {
        return ((ydk) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L18;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.c
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r6.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L21
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r7)
            goto L53
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L1b:
            myh r0 = r6.a
            defpackage.uj50.b(r7)
            goto L46
        L21:
            defpackage.uj50.b(r7)
            bek r7 = r6.d
            java.lang.Object r7 = r7.a
            ej7 r7 = (defpackage.ej7) r7
            r6.c = r5
            r6.a = r0
            r6.b = r4
            mgb0 r2 = r7.b
            boolean r2 = r2.isLogin()
            if (r2 == 0) goto L41
            byz r7 = r7.a
            com.sporty.android.core.model.patron.TooltipType r2 = com.sporty.android.core.model.patron.TooltipType.DeviceManagement
            java.lang.Object r7 = r7.e(r2, r6)
            goto L43
        L41:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
        L43:
            if (r7 != r1) goto L46
            goto L52
        L46:
            r6.c = r5
            r6.a = r5
            r6.b = r3
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r1) goto L53
        L52:
            return r1
        L53:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ydk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
