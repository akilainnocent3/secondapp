package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.presentation.MeViewModel$bindBirthdayGiftHintState$1", f = "MeViewModel.kt", l = {460}, m = "invokeSuspend", v = 2)
public final class pgv extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ rhv b;

    @c0d(c = "com.sportybet.feature.profile.me.presentation.MeViewModel$bindBirthdayGiftHintState$1$1", f = "MeViewModel.kt", l = {462, 464}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<AccountInfo, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ rhv c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rhv rhvVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = rhvVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountInfo accountInfo, v1b<? super Unit> v1bVar) {
            return ((a) create(accountInfo, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
        
            if (r9 == r3) goto L24;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                rhv r0 = r8.c
                nev r1 = r0.b
                java.lang.Object r2 = r8.b
                com.sporty.android.core.model.account.AccountInfo r2 = (com.sporty.android.core.model.account.AccountInfo) r2
                y5b r3 = defpackage.y5b.a
                int r4 = r8.a
                r5 = 2
                r6 = 1
                r7 = 0
                if (r4 == 0) goto L23
                if (r4 == r6) goto L1f
                if (r4 != r5) goto L19
                defpackage.uj50.b(r9)
                goto L62
            L19:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r8)
                return r7
            L1f:
                defpackage.uj50.b(r9)
                goto L38
            L23:
                defpackage.uj50.b(r9)
                if (r2 != 0) goto L2b
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            L2b:
                r8.b = r2
                r8.a = r6
                mgb0 r9 = r1.b
                java.lang.Object r9 = r9.getLastUserId(r8)
                if (r9 != r3) goto L38
                goto L61
            L38:
                java.lang.String r9 = (java.lang.String) r9
                mgb0 r4 = r1.b
                boolean r4 = r4.isLogin()
                if (r4 == 0) goto L6b
                if (r9 == 0) goto L6b
                boolean r4 = r2.getDobVerifiedByNin()
                if (r4 == 0) goto L6b
                java.lang.String r2 = r2.getBirthday()
                r8.b = r7
                r8.a = r5
                z3k r1 = r1.g
                odd r4 = r1.c
                y3k r5 = new y3k
                r5.<init>(r2, r1, r9, r7)
                java.lang.Object r9 = defpackage.ej5.d(r4, r5, r8)
                if (r9 != r3) goto L62
            L61:
                return r3
            L62:
                com.sportybet.core.gift.domain.DobGift r9 = (com.sportybet.core.gift.domain.DobGift) r9
                if (r9 == 0) goto L6b
                ku90<com.sportybet.core.gift.domain.DobGift> r8 = r0.Q
                r8.a(r9)
            L6b:
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: pgv.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgv(rhv rhvVar, v1b<? super pgv> v1bVar) {
        super(2, v1bVar);
        this.b = rhvVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pgv(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pgv) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            rhv rhvVar = this.b;
            lyh<AccountInfo> lyhVar = rhvVar.H;
            a aVar = new a(rhvVar, null);
            this.a = 1;
            if (kzh.b(lyhVar, aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
