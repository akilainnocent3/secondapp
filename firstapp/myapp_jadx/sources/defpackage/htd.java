package defpackage;

import com.sportybet.feature.payment.impl.deposit.domain.model.DepositDropAlertStatus;
import com.sportygames.goldmine.data.dto.oBji.dLRYz;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositCardViewModel$clickNewCardDialogNext$1", f = "DepositCardViewModel.kt", l = {736, 741, 754}, m = "invokeSuspend", v = 2)
public final class htd extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ tud b;

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositCardViewModel$clickNewCardDialogNext$1$1", f = "DepositCardViewModel.kt", l = {737}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function1<v1b<? super ds>, Object> {
        public int a;
        public final /* synthetic */ tud b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(tud tudVar, v1b<? super a> v1bVar) {
            super(1, v1bVar);
            this.b = tudVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super ds> v1bVar) {
            return ((a) create(v1bVar)).invokeSuspend(Unit.a);
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
            tud tudVar = this.b;
            DepositDropAlertStatus depositDropAlertStatus = (DepositDropAlertStatus) tudVar.C0.a.getValue();
            this.a = 1;
            Object objM = tudVar.z0.M(depositDropAlertStatus, this);
            return objM == y5bVar ? y5bVar : objM;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositCardViewModel$clickNewCardDialogNext$1$2", f = "DepositCardViewModel.kt", l = {742}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function1<v1b<? super ds>, Object> {
        public int a;
        public final /* synthetic */ tud b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(tud tudVar, v1b<? super b> v1bVar) {
            super(1, v1bVar);
            this.b = tudVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return new b(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super ds> v1bVar) {
            return ((b) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a(dLRYz.kRQjSHpqjwsZ);
                return null;
            }
            uj50.b(obj);
            tud tudVar = this.b;
            xi7 xi7Var = (xi7) tudVar.q1.a.getValue();
            this.a = 1;
            Object objL1 = tudVar.L1(xi7Var, this);
            return objL1 == y5bVar ? y5bVar : objL1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htd(tud tudVar, v1b<? super htd> v1bVar) {
        super(2, v1bVar);
        this.b = tudVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new htd(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((htd) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x008e  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
    
        if (r8 == r0) goto L36;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r7.a
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            tud r6 = r7.b
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L17
            defpackage.uj50.b(r8)
            goto L97
        L17:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r5
        L1d:
            defpackage.uj50.b(r8)
            goto L59
        L21:
            defpackage.uj50.b(r8)
            goto L3e
        L25:
            defpackage.uj50.b(r8)
            r6.M1()
            r6.K1()
            htd$a r8 = new htd$a
            r8.<init>(r6, r5)
            r7.a = r4
            java.lang.String r1 = "system_maintenance"
            java.lang.Object r8 = r6.G1(r1, r8, r7)
            if (r8 != r0) goto L3e
            goto L96
        L3e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L49
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L49:
            htd$b r8 = new htd$b
            r8.<init>(r6, r5)
            r7.a = r3
            java.lang.String r1 = "insufficient_fund"
            java.lang.Object r8 = r6.G1(r1, r8, r7)
            if (r8 != r0) goto L59
            goto L96
        L59:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L64
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L64:
            zyx r8 = r6.P0
            boolean r8 = r8.a()
            if (r8 != 0) goto L79
            wwd0 r7 = r6.R0
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r7.getClass()
            r7.k(r5, r8)
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L79:
            yyx r8 = r6.U0
            boolean r8 = r8.b()
            if (r8 == 0) goto L8e
            wwd0 r7 = r6.W0
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r7.getClass()
            r7.k(r5, r8)
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L8e:
            r7.a = r2
            java.lang.Object r8 = r6.T1(r7)
            if (r8 != r0) goto L97
        L96:
            return r0
        L97:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 != 0) goto La2
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        La2:
            r6.X1()
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.htd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
