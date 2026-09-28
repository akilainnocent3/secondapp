package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betsucc.presentation.viewmodel.BetSuccessViewModel$shouldShowNotificationDialog$2", f = "BetSuccessViewModel.kt", l = {182, 183, 187}, m = "invokeSuspend", v = 2)
public final class s93 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public boolean a;
    public int b;
    public final /* synthetic */ u93 c;
    public final /* synthetic */ ka3 d;

    @c0d(c = "com.sportybet.plugin.realsports.betsucc.presentation.viewmodel.BetSuccessViewModel$shouldShowNotificationDialog$2$1", f = "BetSuccessViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ ka3 a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ka3 ka3Var, boolean z, v1b v1bVar) {
            super(2, v1bVar);
            this.a = ka3Var;
            this.b = z;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.a.invoke(Boolean.valueOf(this.b));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s93(u93 u93Var, ka3 ka3Var, v1b v1bVar) {
        super(2, v1bVar);
        this.c = u93Var;
        this.d = ka3Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new s93(this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((s93) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if (r9.a.putLong("notification_dialog_time", r5, r8) == r0) goto L21;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r8.b
            r2 = 0
            u93 r3 = r8.c
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L26
            if (r1 == r6) goto L22
            if (r1 == r5) goto L1c
            if (r1 != r4) goto L16
            defpackage.uj50.b(r9)
            goto L6a
        L16:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r2
        L1c:
            boolean r1 = r8.a
            defpackage.uj50.b(r9)
            goto L4e
        L22:
            defpackage.uj50.b(r9)
            goto L32
        L26:
            defpackage.uj50.b(r9)
            r8.b = r6
            java.lang.Object r9 = r3.z1(r8)
            if (r9 != r0) goto L32
            goto L69
        L32:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r1 = r9.booleanValue()
            pfd r9 = defpackage.fse.a
            wcl r9 = defpackage.gku.a
            s93$a r6 = new s93$a
            ka3 r7 = r8.d
            r6.<init>(r7, r1, r2)
            r8.a = r1
            r8.b = r5
            java.lang.Object r9 = defpackage.ej5.d(r9, r6, r8)
            if (r9 != r0) goto L4e
            goto L69
        L4e:
            if (r1 == 0) goto L6a
            m2l r9 = r3.d
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r2)
            r8.a = r1
            r8.b = r4
            zed r9 = r9.a
            java.lang.String r1 = "notification_dialog_time"
            java.lang.Object r8 = r9.putLong(r1, r5, r8)
            if (r8 != r0) goto L6a
        L69:
            return r0
        L6a:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s93.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
