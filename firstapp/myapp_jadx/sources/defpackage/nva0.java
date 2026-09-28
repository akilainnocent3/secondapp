package defpackage;

import com.sportybet.android.globalpay.stp.spei.SpeiByStpDepositFragment;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.stp.spei.SpeiByStpDepositFragment$initView$1$2$4$1", f = "SpeiByStpDepositFragment.kt", l = {170}, m = "invokeSuspend", v = 2)
public final class nva0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ SpeiByStpDepositFragment b;
    public final /* synthetic */ v3a0 c;

    public static final class a<T> implements myh {
        public final /* synthetic */ v3a0 a;
        public final /* synthetic */ SpeiByStpDepositFragment b;

        /* JADX INFO: renamed from: nva0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.globalpay.stp.spei.SpeiByStpDepositFragment$initView$1$2$4$1$1", f = "SpeiByStpDepositFragment.kt", l = {171}, m = "emit", v = 2)
        public static final class C0906a extends x1b {
            public /* synthetic */ Object a;
            public final /* synthetic */ a<T> b;
            public int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0906a(a<? super T> aVar, v1b<? super C0906a> v1bVar) {
                super(v1bVar);
                this.b = aVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.c |= Integer.MIN_VALUE;
                return this.b.emit(null, this);
            }
        }

        public a(v3a0 v3a0Var, SpeiByStpDepositFragment speiByStpDepositFragment) {
            this.a = v3a0Var;
            this.b = speiByStpDepositFragment;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0014  */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object emit(ca90 ca90Var, v1b<? super Unit> v1bVar) {
            C0906a c0906a;
            if (v1bVar instanceof C0906a) {
                c0906a = (C0906a) v1bVar;
                int i = c0906a.c;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0906a.c = i - Integer.MIN_VALUE;
                } else {
                    c0906a = new C0906a(this, v1bVar);
                }
            } else {
                c0906a = new C0906a(this, v1bVar);
            }
            C0906a c0906a2 = c0906a;
            Object obj = c0906a2.a;
            y5b y5bVar = y5b.a;
            int i2 = c0906a2.c;
            if (i2 == 0) {
                uj50.b(obj);
                String strD = sn5.d(this.b, R.string.page_payment__vnum_complete_a_pending_deposit_first, new Integer(ca90Var.a));
                c0906a2.c = 1;
                if (v3a0.b(this.a, strD, null, false, null, c0906a2, 14) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nva0(SpeiByStpDepositFragment speiByStpDepositFragment, v3a0 v3a0Var, v1b<? super nva0> v1bVar) {
        super(2, v1bVar);
        this.b = speiByStpDepositFragment;
        this.c = v3a0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new nva0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((nva0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return Unit.a;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        ohp<Object>[] ohpVarArr = SpeiByStpDepositFragment.m0;
        SpeiByStpDepositFragment speiByStpDepositFragment = this.b;
        ku90 ku90Var = speiByStpDepositFragment.E1().J;
        a aVar = new a(this.c, speiByStpDepositFragment);
        this.a = 1;
        ku90Var.collect(aVar, this);
        return y5bVar;
    }
}
