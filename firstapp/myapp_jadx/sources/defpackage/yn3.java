package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.settings.betslip.BetslipCustomizationSettingsViewModel$apply$1", f = "BetslipCustomizationSettingsViewModel.kt", l = {74, 80}, m = "invokeSuspend", v = 2)
public final class yn3 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ao3 b;
    public final /* synthetic */ long c;

    @c0d(c = "com.sporty.android.platform.features.settings.betslip.BetslipCustomizationSettingsViewModel$apply$1$result$1", f = "BetslipCustomizationSettingsViewModel.kt", l = {74}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super lk50<? extends iw3>>, Object> {
        public int a;
        public final /* synthetic */ ao3 b;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ao3 ao3Var, long j, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = ao3Var;
            this.c = j;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super lk50<? extends iw3>> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            gy3 gy3Var = this.b.a;
            this.a = 1;
            Object objD = gy3Var.d(this.c, this);
            return objD == y5bVar ? y5bVar : objD;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn3(ao3 ao3Var, long j, v1b<? super yn3> v1bVar) {
        super(2, v1bVar);
        this.b = ao3Var;
        this.c = j;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new yn3(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((yn3) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f1, code lost:
    
        if (r1.reloadAccountInfo(r24) == r3) goto L38;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yn3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
