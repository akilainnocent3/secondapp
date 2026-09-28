package defpackage;

import com.sporty.android.core.model.patron.UserPhone;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class ymj0 implements lyh<Unit> {
    public final /* synthetic */ lyh[] a;
    public final /* synthetic */ dnj0 b;

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawMomoViewModel$initDetectPhoneChannelJob$$inlined$combine$1", f = "WithdrawMomoViewModel.kt", l = {109}, m = "collect", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return ymj0.this.collect(null, this);
        }
    }

    public static final class b implements Function0<Object[]> {
        public final /* synthetic */ lyh[] a;

        public b(lyh[] lyhVarArr) {
            this.a = lyhVarArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object[] invoke() {
            return new Object[this.a.length];
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawMomoViewModel$initDetectPhoneChannelJob$$inlined$combine$1$3", f = "WithdrawMomoViewModel.kt", l = {288}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super Unit>, Object[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;
        public final /* synthetic */ dnj0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, dnj0 dnj0Var) {
            super(3, v1bVar);
            this.d = dnj0Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super Unit> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
            c cVar = new c(v1bVar, this.d);
            cVar.b = myhVar;
            cVar.c = objArr;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Unit unit;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                Object objC = ay0.C(0, this.c);
                UserPhone userPhone = objC instanceof UserPhone ? (UserPhone) objC : null;
                if (userPhone == null) {
                    unit = Unit.a;
                } else {
                    dnj0 dnj0Var = this.d;
                    dnj0Var.E0.setValue(null);
                    dnj0Var.t0.setValue(null);
                    dnj0Var.v0.setValue(null);
                    jvd0 jvd0Var = dnj0Var.I0;
                    if (jvd0Var != null) {
                        jvd0Var.cancel((CancellationException) null);
                    }
                    dnj0Var.I0 = ej5.c(o8i0.d(dnj0Var), null, null, new xmj0(dnj0Var, userPhone, null), 3);
                    unit = Unit.a;
                }
                this.b = null;
                this.c = null;
                this.a = 1;
                if (myhVar.emit(unit, this) == y5bVar) {
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

    public ymj0(lyh[] lyhVarArr, dnj0 dnj0Var) {
        this.a = lyhVarArr;
        this.b = dnj0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super Unit> myhVar, v1b v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.b = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.b;
        if (i2 == 0) {
            uj50.b(obj);
            lyh[] lyhVarArr = this.a;
            b bVar = new b(lyhVarArr);
            c cVar = new c(null, this.b);
            aVar.b = 1;
            if (r78.a(aVar, myhVar, cVar, bVar, lyhVarArr) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
