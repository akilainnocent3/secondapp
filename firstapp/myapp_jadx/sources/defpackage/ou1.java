package defpackage;

import android.content.Context;
import androidx.fragment.app.e;
import com.sporty.android.core.model.welcomereward.BalanceButtonPage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ou1 {
    public final mgb0 a;
    public final psm b;
    public final iym c;
    public final tta d;
    public final azm e;

    @c0d(c = "com.sportybet.android.util.BalanceActionHandlerImpl$onBalanceButtonClicked$1$1", f = "BalanceActionHandlerImpl.kt", l = {41, 47}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long c;
        public final /* synthetic */ BalanceButtonPage d;
        public final /* synthetic */ Context e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, BalanceButtonPage balanceButtonPage, Context context, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = j;
            this.d = balanceButtonPage;
            this.e = context;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ou1.this.new a(this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
        
            if (r11.c(r0, r1, r10) == r4) goto L26;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                ou1 r0 = defpackage.ou1.this
                iym r1 = r0.c
                psm r2 = r0.b
                azm r3 = r0.e
                y5b r4 = defpackage.y5b.a
                int r5 = r10.a
                r6 = 1
                r7 = 2
                if (r5 == 0) goto L23
                if (r5 == r6) goto L1f
                if (r5 != r7) goto L18
                defpackage.uj50.b(r11)
                goto L83
            L18:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r10)
                r10 = 0
                return r10
            L1f:
                defpackage.uj50.b(r11)
                goto L31
            L23:
                defpackage.uj50.b(r11)
                mgb0 r11 = r0.a
                r10.a = r6
                java.lang.Object r11 = r11.getUserCertStatus(r10)
                if (r11 != r4) goto L31
                goto L75
            L31:
                java.lang.Number r11 = (java.lang.Number) r11
                int r11 = r11.intValue()
                long r5 = r10.c
                r8 = 0
                int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
                if (r5 == 0) goto L45
                wae r10 = defpackage.wae.ME
                r3.d(r10)
                goto L83
            L45:
                boolean r5 = r2.x()
                com.sporty.android.core.model.welcomereward.BalanceButtonPage r6 = r10.d
                if (r5 == 0) goto L51
                r5 = 310(0x136, float:4.34E-43)
                if (r11 == r5) goto L5d
            L51:
                boolean r2 = r2.n()
                if (r2 == 0) goto L76
                boolean r11 = com.sporty.android.core.model.patron.UserCertStatusRules.isNgNameConfirmRequired(r11)
                if (r11 == 0) goto L76
            L5d:
                x0j0$c r11 = new x0j0$c
                r11.<init>(r6)
                defpackage.gym.a(r1, r11)
                tta r11 = r0.d
                android.content.Context r0 = r10.e
                androidx.fragment.app.e r0 = (androidx.fragment.app.e) r0
                vtp r1 = defpackage.vtp.ME_PAGE
                r10.a = r7
                java.lang.Object r10 = r11.c(r0, r1, r10)
                if (r10 != r4) goto L83
            L75:
                return r4
            L76:
                x0j0$b r10 = new x0j0$b
                r10.<init>(r6)
                defpackage.gym.a(r1, r10)
                wae r10 = defpackage.wae.DEPOSIT
                r3.d(r10)
            L83:
                kotlin.Unit r10 = kotlin.Unit.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: ou1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ou1(mgb0 mgb0Var, psm psmVar, iym iymVar, tta ttaVar, azm azmVar) {
        mgb0Var.getClass();
        psmVar.getClass();
        iymVar.getClass();
        ttaVar.getClass();
        azmVar.getClass();
        this.a = mgb0Var;
        this.b = psmVar;
        this.c = iymVar;
        this.d = ttaVar;
        this.e = azmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(long j, Context context, BalanceButtonPage balanceButtonPage) {
        balanceButtonPage.getClass();
        if ((context instanceof e ? (e) context : null) == null) {
            return;
        }
        ibs ibsVar = context instanceof ibs ? (ibs) context : null;
        if (ibsVar != null) {
            ej5.c(ebs.a(ibsVar.getLifecycle()), null, null, new a(j, balanceButtonPage, context, null), 3);
        }
    }
}
