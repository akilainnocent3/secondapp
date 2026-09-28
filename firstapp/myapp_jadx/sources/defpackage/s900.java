package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.payment.common.domain.PaymentSecurityUtilImpl$redirectToDepositAnTestManagerProcessCampaignConversion$1$1", f = "PaymentSecurityUtilImpl.kt", l = {198}, m = "invokeSuspend", v = 2)
public final class s900 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ q900 b;
    public final /* synthetic */ List<x66<i4j0>> c;

    @c0d(c = "com.sportybet.android.payment.common.domain.PaymentSecurityUtilImpl$redirectToDepositAnTestManagerProcessCampaignConversion$1$1$1", f = "PaymentSecurityUtilImpl.kt", l = {211}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ List<x66<i4j0>> c;
        public final /* synthetic */ q900 d;

        /* JADX INFO: renamed from: s900$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.payment.common.domain.PaymentSecurityUtilImpl$redirectToDepositAnTestManagerProcessCampaignConversion$1$1$1$deferredList$1$1", f = "PaymentSecurityUtilImpl.kt", l = {202}, m = "invokeSuspend", v = 2)
        public static final class C1081a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ q900 b;
            public final /* synthetic */ x66<i4j0> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1081a(q900 q900Var, x66<i4j0> x66Var, v1b<? super C1081a> v1bVar) {
                super(2, v1bVar);
                this.b = q900Var;
                this.c = x66Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C1081a(this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1081a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                x66<i4j0> x66Var = this.c;
                try {
                    if (i == 0) {
                        uj50.b(obj);
                        yqm yqmVar = this.b.b;
                        String str = x66Var.a;
                        String str2 = (String) CollectionsKt.T(x66Var.b);
                        this.a = 1;
                        if (yqmVar.c(str, str2, null, this) == y5bVar) {
                            return y5bVar;
                        }
                    } else {
                        if (i != 1) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uj50.b(obj);
                    }
                } catch (Exception e) {
                    itf0.a aVar = itf0.a;
                    aVar.q("Welcome Reward An Test");
                    aVar.a(oxc.a(x66Var.a, " convert failed: ", e.getMessage()), new Object[0]);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, q900 q900Var, List list) {
            super(2, v1bVar);
            this.c = list;
            this.d = q900Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(v1bVar, this.d, this.c);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                List<x66<i4j0>> list = this.c;
                ArrayList arrayList = new ArrayList(l48.r(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(ej5.a(v5bVar, null, new C1081a(this.d, (x66) it.next(), null), 3));
                }
                this.b = null;
                this.a = 1;
                if (up1.a(arrayList, this) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s900(v1b v1bVar, q900 q900Var, List list) {
        super(2, v1bVar);
        this.b = q900Var;
        this.c = list;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new s900(v1bVar, this.b, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((s900) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            q900 q900Var = this.b;
            k5b k5bVar = q900Var.d;
            a aVar = new a(null, q900Var, this.c);
            this.a = 1;
            if (ej5.d(k5bVar, aVar, this) == y5bVar) {
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
