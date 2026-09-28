package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.MyLog;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.PartnerWithdrawRequestDetailsViewModel$init$1", f = "PartnerWithdrawRequestDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wtz extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ buz a;
    public final /* synthetic */ String b;

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.PartnerWithdrawRequestDetailsViewModel$init$1$2", f = "PartnerWithdrawRequestDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<lk50<? extends Unit>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ buz b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(buz buzVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = buzVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends Unit> lk50Var, v1b<? super Unit> v1bVar) {
            return ((a) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            wwd0 wwd0Var = this.b.f;
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (Intrinsics.g(lk50Var, lk50.b.a)) {
                wwd0Var.setValue(wgn.c.a);
            } else if (lk50Var instanceof lk50.c) {
                wwd0Var.setValue(wgn.b.a);
            } else {
                if (!(lk50Var instanceof lk50.a)) {
                    uhc.a();
                    return null;
                }
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_COMMON);
                lk50.a aVar2 = (lk50.a) lk50Var;
                aVar.n(aVar2.toString(), new Object[0]);
                Throwable th = aVar2.a;
                SprThrowable sprThrowable = th instanceof SprThrowable ? (SprThrowable) th : null;
                wgn.a aVar3 = new wgn.a(sprThrowable != null ? sprThrowable.b() : vch0.b);
                wwd0Var.getClass();
                wwd0Var.k(null, aVar3);
            }
            return Unit.a;
        }
    }

    public static final class b implements lyh<lk50<? extends Unit>> {
        public final /* synthetic */ lyh[] a;

        @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.PartnerWithdrawRequestDetailsViewModel$init$1$invokeSuspend$$inlined$combine$1", f = "PartnerWithdrawRequestDetailsViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return b.this.collect(null, this);
            }
        }

        /* JADX INFO: renamed from: wtz$b$b, reason: collision with other inner class name */
        public static final class C1267b implements Function0<lk50<? extends Object>[]> {
            public final /* synthetic */ lyh[] a;

            public C1267b(lyh[] lyhVarArr) {
                this.a = lyhVarArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final lk50<? extends Object>[] invoke() {
                return new lk50[this.a.length];
            }
        }

        @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.PartnerWithdrawRequestDetailsViewModel$init$1$invokeSuspend$$inlined$combine$1$3", f = "PartnerWithdrawRequestDetailsViewModel.kt", l = {288}, m = "invokeSuspend", v = 2)
        public static final class c extends tje0 implements gaj<myh<? super lk50<? extends Unit>>, lk50<? extends Object>[], v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ myh b;
            public /* synthetic */ Object[] c;

            @Override // defpackage.gaj
            public final Object invoke(myh<? super lk50<? extends Unit>> myhVar, lk50<? extends Object>[] lk50VarArr, v1b<? super Unit> v1bVar) {
                c cVar = new c(3, v1bVar);
                cVar.b = myhVar;
                cVar.c = lk50VarArr;
                return cVar.invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                lk50 lk50Var;
                lk50 cVar;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    myh myhVar = this.b;
                    lk50[] lk50VarArr = (lk50[]) this.c;
                    int length = lk50VarArr.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            lk50Var = null;
                            break;
                        }
                        lk50Var = lk50VarArr[i3];
                        if (lk50Var instanceof lk50.a) {
                            break;
                        }
                        i3++;
                    }
                    lk50.a aVar = lk50Var instanceof lk50.a ? (lk50.a) lk50Var : null;
                    int length2 = lk50VarArr.length;
                    while (true) {
                        if (i2 >= length2) {
                            if (aVar == null) {
                                cVar = new lk50.c(Unit.a);
                                break;
                            }
                            cVar = new lk50.a(aVar.a);
                            break;
                        }
                        if (lk50VarArr[i2] instanceof lk50.b) {
                            cVar = lk50.b.a;
                            break;
                        }
                        i2++;
                    }
                    this.b = null;
                    this.c = null;
                    this.a = 1;
                    if (myhVar.emit(cVar, this) == y5bVar) {
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

        public b(lyh[] lyhVarArr) {
            this.a = lyhVarArr;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super lk50<? extends Unit>> myhVar, v1b v1bVar) {
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
                C1267b c1267b = new C1267b(lyhVarArr);
                c cVar = new c(3, null);
                aVar.b = 1;
                if (r78.a(aVar, myhVar, cVar, c1267b, lyhVarArr) == y5bVar) {
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
    public wtz(buz buzVar, String str, v1b<? super wtz> v1bVar) {
        super(2, v1bVar);
        this.a = buzVar;
        this.b = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wtz(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wtz) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String str = this.b;
        buz buzVar = this.a;
        buzVar.D = str;
        kzh.d(new g1i(new b((lyh[]) CollectionsKt.A0(buzVar.E).toArray(new lyh[0])), new a(buzVar, null)), o8i0.d(buzVar));
        buzVar.x1();
        return Unit.a;
    }
}
