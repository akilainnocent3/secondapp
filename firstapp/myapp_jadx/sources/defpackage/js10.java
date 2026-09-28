package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.service.CountryCodeName;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.domain.repository.PocketRepositoryImpl$fetchRecentlyUsedMethod$1", f = "PocketRepositoryImpl.kt", l = {1334}, m = "invokeSuspend", v = 2)
public final class js10 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ms10 c;

    @c0d(c = "com.sportybet.feature.payment.impl.common.domain.repository.PocketRepositoryImpl$fetchRecentlyUsedMethod$1$1$1", f = "PocketRepositoryImpl.kt", l = {1338, 1343, 1349}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function1<v1b<? super Unit>, Object> {
        public String a;
        public int b;
        public final /* synthetic */ ms10 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ms10 ms10Var, v1b<? super a> v1bVar) {
            super(1, v1bVar);
            this.c = ms10Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return new a(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super Unit> v1bVar) {
            return ((a) create(v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x005e  */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
        
            if (r1.l(r0, r9, r8) == r2) goto L31;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                ms10 r0 = r8.c
                b700 r1 = r0.i
                y5b r2 = defpackage.y5b.a
                int r3 = r8.b
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r3 == 0) goto L28
                if (r3 == r6) goto L24
                if (r3 == r5) goto L1e
                if (r3 != r4) goto L18
                defpackage.uj50.b(r9)
                goto L72
            L18:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r8)
                return r7
            L1e:
                java.lang.String r0 = r8.a
                defpackage.uj50.b(r9)
                goto L5b
            L24:
                defpackage.uj50.b(r9)
                goto L36
            L28:
                defpackage.uj50.b(r9)
                pr10 r9 = r0.a
                r8.b = r6
                java.lang.Object r9 = r9.y(r8)
                if (r9 != r2) goto L36
                goto L71
            L36:
                com.sporty.android.common.network.data.BaseResponse r9 = (com.sporty.android.common.network.data.BaseResponse) r9
                T r9 = r9.data
                com.sporty.android.core.model.pocket.common.RecentlyUsedMethods r9 = (com.sporty.android.core.model.pocket.common.RecentlyUsedMethods) r9
                java.lang.String r0 = r9.getDeposit()
                java.lang.String r9 = r9.getWithdraw()
                if (r0 == 0) goto L5c
                boolean r3 = kotlin.text.StringsKt.U(r0)
                if (r3 == 0) goto L4d
                goto L5c
            L4d:
                log0 r3 = defpackage.log0.a
                r8.a = r9
                r8.b = r5
                java.lang.Object r0 = r1.l(r3, r0, r8)
                if (r0 != r2) goto L5a
                goto L71
            L5a:
                r0 = r9
            L5b:
                r9 = r0
            L5c:
                if (r9 == 0) goto L72
                boolean r0 = kotlin.text.StringsKt.U(r9)
                if (r0 == 0) goto L65
                goto L72
            L65:
                log0 r0 = defpackage.log0.b
                r8.a = r7
                r8.b = r4
                java.lang.Object r8 = r1.l(r0, r9, r8)
                if (r8 != r2) goto L72
            L71:
                return r2
            L72:
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: js10.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js10(ms10 ms10Var, v1b<? super js10> v1bVar) {
        super(2, v1bVar);
        this.c = ms10Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        js10 js10Var = new js10(this.c, v1bVar);
        js10Var.b = obj;
        return js10Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((js10) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                ms10 ms10Var = this.c;
                if (!ms10Var.b.isLogin() || !b.k(CountryCodeName.NIGERIA, CountryCodeName.GHANA).contains(ms10Var.d.getCountryCode())) {
                    return Unit.a;
                }
                zi50.a aVar = zi50.b;
                wsm wsmVar = ms10Var.v;
                a aVar2 = new a(ms10Var, null);
                this.b = null;
                this.a = 1;
                if (ctb.d(wsmVar, "PocketRepo", "fetchRecentlyUsedMethod", aVar2, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            bVar = Unit.a;
            zi50.a aVar3 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar4 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a aVar5 = itf0.a;
            aVar5.q(MyLog.TAG_COMMON);
            aVar5.o(thA);
        }
        return Unit.a;
    }
}
