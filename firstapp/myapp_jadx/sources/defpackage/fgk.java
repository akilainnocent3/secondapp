package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.home.GetUnreadUseCase$clearAllData$1", f = "GetUnreadUseCase.kt", l = {95, 96, 97}, m = "invokeSuspend", v = 2)
public final class fgk extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ jgk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgk(jgk jgkVar, v1b<? super fgk> v1bVar) {
        super(2, v1bVar);
        this.b = jgkVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new fgk(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((fgk) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r0.a.putString("key_loyalty_unread", "", r7) == r1) goto L20;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            jgk r0 = r7.b
            m2l r0 = r0.c
            y5b r1 = defpackage.y5b.a
            int r2 = r7.a
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L26
            if (r2 == r5) goto L22
            if (r2 == r4) goto L1e
            if (r2 != r3) goto L17
            defpackage.uj50.b(r8)
            goto L56
        L17:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            r7 = 0
            return r7
        L1e:
            defpackage.uj50.b(r8)
            goto L47
        L22:
            defpackage.uj50.b(r8)
            goto L38
        L26:
            defpackage.uj50.b(r8)
            r7.a = r5
            zed r8 = r0.a
            java.lang.String r2 = "nc_check_any_unread_timestamp"
            r5 = 0
            java.lang.Object r8 = r8.getLong(r2, r5, r7)
            if (r8 != r1) goto L38
            goto L55
        L38:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r7.a = r4
            zed r2 = r0.a
            java.lang.String r4 = "notification_center_any_unread"
            java.lang.Object r8 = r2.putBoolean(r4, r8, r7)
            if (r8 != r1) goto L47
            goto L55
        L47:
            r7.a = r3
            zed r8 = r0.a
            java.lang.String r0 = "key_loyalty_unread"
            java.lang.String r2 = ""
            java.lang.Object r7 = r8.putString(r0, r2, r7)
            if (r7 != r1) goto L56
        L55:
            return r1
        L56:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
