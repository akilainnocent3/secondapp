package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.pocket.deposit.sportybank.DedicatedAccountRetryResult;
import com.sporty.android.core.model.pocket.deposit.sportybank.SportyBankAccountDto;
import com.sporty.android.core.model.pocket.deposit.sportybank.SportyBankAccountStatus;
import com.sporty.android.core.model.pocket.deposit.sportybank.SportyBankDto;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyxd;", "Lm02;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class yxd extends m02 {
    public final wwd0 A0;
    public final wwd0 B0;
    public final sr10 l0;
    public final b700 m0;
    public jvd0 n0;
    public final a300.a.b o0;
    public final List<lyh<lk50<Object>>> p0;
    public final wwd0 q0;
    public final ku90<ech0> r0;
    public final ku90<hch0> s0;
    public final t340 t0;
    public final wwd0 u0;
    public final v340 v0;
    public final wwd0 w0;
    public final v340 x0;
    public final wwd0 y0;
    public final wwd0 z0;

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositDedicatedAccountViewModel$1", f = "DepositDedicatedAccountViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<List<? extends SportyBankAccountDto>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = yxd.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends SportyBankAccountDto> list, v1b<? super Unit> v1bVar) {
            return ((a) create(list, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object value;
            List list = (List) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            wwd0 wwd0Var = yxd.this.q0;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, list));
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositDedicatedAccountViewModel$2", f = "DepositDedicatedAccountViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements kaj<Boolean, tzs, k8, tzs, tzs, v1b<? super Unit>, Object> {
        public /* synthetic */ boolean a;
        public /* synthetic */ tzs b;
        public /* synthetic */ k8 c;
        public /* synthetic */ tzs d;
        public /* synthetic */ tzs e;

        public b(v1b<? super b> v1bVar) {
            super(6, v1bVar);
        }

        @Override // defpackage.kaj
        public final Object f(Boolean bool, tzs tzsVar, k8 k8Var, tzs tzsVar2, tzs tzsVar3, v1b<? super Unit> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            b bVar = yxd.this.new b(v1bVar);
            bVar.a = zBooleanValue;
            bVar.b = tzsVar;
            bVar.c = k8Var;
            bVar.d = tzsVar2;
            bVar.e = tzsVar3;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object value;
            boolean z = this.a;
            tzs tzsVar = this.b;
            k8 k8Var = this.c;
            tzs tzsVar2 = this.d;
            tzs tzsVar3 = this.e;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            wwd0 wwd0Var = yxd.this.w0;
            do {
                value = wwd0Var.getValue();
                ((tch0) value).getClass();
                k8Var.getClass();
                tzsVar2.getClass();
                tzsVar3.getClass();
                tzsVar.getClass();
            } while (!wwd0Var.g(value, new tch0(z, k8Var, tzsVar2, tzsVar3, tzsVar)));
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositDedicatedAccountViewModel$3", f = "DepositDedicatedAccountViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements iaj<Pair<? extends List<? extends SportyBankDto>, ? extends List<? extends q5d>>, List<? extends Integer>, Integer, v1b<? super Unit>, Object> {
        public /* synthetic */ Pair a;
        public /* synthetic */ List b;
        public /* synthetic */ int c;

        public c(v1b<? super c> v1bVar) {
            super(4, v1bVar);
        }

        @Override // defpackage.iaj
        public final Object d(Pair<? extends List<? extends SportyBankDto>, ? extends List<? extends q5d>> pair, List<? extends Integer> list, Integer num, v1b<? super Unit> v1bVar) {
            int iIntValue = num.intValue();
            c cVar = yxd.this.new c(v1bVar);
            cVar.a = pair;
            cVar.b = list;
            cVar.c = iIntValue;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object value;
            boolean z;
            Pair pair = this.a;
            List list = this.b;
            int i = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            List list2 = (List) pair.a;
            List list3 = (List) pair.b;
            wwd0 wwd0Var = yxd.this.u0;
            do {
                value = wwd0Var.getValue();
                sch0 sch0Var = (sch0) value;
                z = list3.size() + list.size() >= i;
                sch0Var.getClass();
                list2.getClass();
            } while (!wwd0Var.g(value, new sch0(z, i, list3, list2, list)));
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositDedicatedAccountViewModel$4", f = "DepositDedicatedAccountViewModel.kt", l = {299, 351}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<ech0, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositDedicatedAccountViewModel$4$2", f = "DepositDedicatedAccountViewModel.kt", l = {287}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ yxd b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(yxd yxdVar, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = yxdVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    this.a = 1;
                    if (this.b.Q1(this) == y5bVar) {
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

        @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositDedicatedAccountViewModel$4$3", f = "DepositDedicatedAccountViewModel.kt", l = {434, HttpStatusCodesKt.HTTP_PERM_REDIRECT}, m = "invokeSuspend", v = 2)
        public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ yxd b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(yxd yxdVar, v1b<? super b> v1bVar) {
                super(2, v1bVar);
                this.b = yxdVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new b(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
            
                if (r2.S1(r5) == r0) goto L19;
             */
            @Override // defpackage.pz1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
                /*
                    r5 = this;
                    y5b r0 = defpackage.y5b.a
                    int r1 = r5.a
                    yxd r2 = r5.b
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L1d
                    if (r1 == r4) goto L19
                    if (r1 != r3) goto L12
                    defpackage.uj50.b(r6)
                    goto L53
                L12:
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r5)
                    r5 = 0
                    return r5
                L19:
                    defpackage.uj50.b(r6)
                    goto L3f
                L1d:
                    defpackage.uj50.b(r6)
                    r5.a = r4
                    bc6 r6 = new bc6
                    v1b r1 = defpackage.yzo.b(r5)
                    r6.<init>(r4, r1)
                    r6.q()
                    ku90<hch0> r1 = r2.s0
                    hch0$a r4 = new hch0$a
                    r4.<init>(r6)
                    r1.a(r4)
                    java.lang.Object r6 = r6.o()
                    if (r6 != r0) goto L3f
                    goto L52
                L3f:
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    if (r6 != 0) goto L4a
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                L4a:
                    r5.a = r3
                    java.lang.Object r5 = r2.S1(r5)
                    if (r5 != r0) goto L53
                L52:
                    return r0
                L53:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: yxd.d.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositDedicatedAccountViewModel$4$4", f = "DepositDedicatedAccountViewModel.kt", l = {313}, m = "invokeSuspend", v = 2)
        public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ yxd b;
            public final /* synthetic */ ech0 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(yxd yxdVar, ech0 ech0Var, v1b<? super c> v1bVar) {
                super(2, v1bVar);
                this.b = yxdVar;
                this.c = ech0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new c(this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                yxd yxdVar = this.b;
                wwd0 wwd0Var = yxdVar.z0;
                y5b y5bVar = y5b.a;
                int i = this.a;
                StringUiText stringUiText = null;
                if (i == 0) {
                    uj50.b(obj);
                    wwd0Var.setValue(tzs.b.a);
                    sr10 sr10Var = yxdVar.l0;
                    long j = ((ech0.e) this.c).a;
                    this.a = 1;
                    obj = sr10Var.c(j, this);
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                DedicatedAccountRetryResult dedicatedAccountRetryResult = (DedicatedAccountRetryResult) obj;
                if (dedicatedAccountRetryResult instanceof DedicatedAccountRetryResult.Failed) {
                    String message = ((DedicatedAccountRetryResult.Failed) dedicatedAccountRetryResult).getMessage();
                    if (message != null) {
                        StringUiText stringUiText2 = vch0.a;
                        stringUiText = new StringUiText(message);
                    }
                    yxdVar.T1(stringUiText);
                } else if (dedicatedAccountRetryResult instanceof DedicatedAccountRetryResult.FetchFailed) {
                    StringUiText stringUiText3 = vch0.a;
                    yxdVar.T1(new ResourceUiText(R.string.page_payment__sporty_bank_fetch_data_failed_dialog_content));
                } else {
                    if (!Intrinsics.g(dedicatedAccountRetryResult, DedicatedAccountRetryResult.NeedBVN.INSTANCE) && !Intrinsics.g(dedicatedAccountRetryResult, DedicatedAccountRetryResult.Success.INSTANCE)) {
                        uhc.a();
                        return null;
                    }
                    yxdVar.O1();
                }
                wwd0Var.setValue(tzs.a.a);
                return Unit.a;
            }
        }

        /* JADX INFO: renamed from: yxd$d$d, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositDedicatedAccountViewModel$4$5", f = "DepositDedicatedAccountViewModel.kt", l = {333, 344}, m = "invokeSuspend", v = 2)
        public static final class C1370d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ yxd b;
            public final /* synthetic */ ech0 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1370d(yxd yxdVar, ech0 ech0Var, v1b<? super C1370d> v1bVar) {
                super(2, v1bVar);
                this.b = yxdVar;
                this.c = ech0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C1370d(this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1370d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
            
                if (r0.S1(r9) == r2) goto L26;
             */
            @Override // defpackage.pz1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    yxd r0 = r9.b
                    wwd0 r1 = r0.z0
                    y5b r2 = defpackage.y5b.a
                    int r3 = r9.a
                    r4 = 0
                    r5 = 2
                    r6 = 1
                    if (r3 == 0) goto L1f
                    if (r3 == r6) goto L1b
                    if (r3 != r5) goto L15
                    defpackage.uj50.b(r10)
                    goto L6c
                L15:
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r9)
                    return r4
                L1b:
                    defpackage.uj50.b(r10)
                    goto L38
                L1f:
                    defpackage.uj50.b(r10)
                    tzs$b r10 = tzs.b.a
                    r1.setValue(r10)
                    sr10 r10 = r0.l0
                    ech0 r3 = r9.c
                    ech0$f r3 = (ech0.f) r3
                    long r7 = r3.a
                    r9.a = r6
                    java.lang.Object r10 = r10.b0(r7, r9)
                    if (r10 != r2) goto L38
                    goto L6b
                L38:
                    com.sporty.android.core.model.pocket.deposit.sportybank.DedicatedAccountDeleteResult r10 = (com.sporty.android.core.model.pocket.deposit.sportybank.DedicatedAccountDeleteResult) r10
                    boolean r3 = r10 instanceof com.sporty.android.core.model.pocket.deposit.sportybank.DedicatedAccountDeleteResult.Failure
                    if (r3 == 0) goto L51
                    com.sporty.android.core.model.pocket.deposit.sportybank.DedicatedAccountDeleteResult$Failure r10 = (com.sporty.android.core.model.pocket.deposit.sportybank.DedicatedAccountDeleteResult.Failure) r10
                    java.lang.String r9 = r10.getMessage()
                    if (r9 == 0) goto L4d
                    com.sporty.android.common_ui.uitext.StringUiText r10 = defpackage.vch0.a
                    com.sporty.android.common_ui.uitext.StringUiText r4 = new com.sporty.android.common_ui.uitext.StringUiText
                    r4.<init>(r9)
                L4d:
                    r0.T1(r4)
                    goto L6c
                L51:
                    boolean r3 = r10 instanceof com.sporty.android.core.model.pocket.deposit.sportybank.DedicatedAccountDeleteResult.FetchFailure
                    if (r3 == 0) goto L5b
                    com.sporty.android.common_ui.uitext.ResourceUiText r9 = defpackage.vch0.b
                    r0.T1(r9)
                    goto L6c
                L5b:
                    com.sporty.android.core.model.pocket.deposit.sportybank.DedicatedAccountDeleteResult$Success r3 = com.sporty.android.core.model.pocket.deposit.sportybank.DedicatedAccountDeleteResult.Success.INSTANCE
                    boolean r10 = kotlin.jvm.internal.Intrinsics.g(r10, r3)
                    if (r10 == 0) goto L74
                    r9.a = r5
                    java.lang.Object r9 = r0.S1(r9)
                    if (r9 != r2) goto L6c
                L6b:
                    return r2
                L6c:
                    tzs$a r9 = tzs.a.a
                    r1.setValue(r9)
                    kotlin.Unit r9 = kotlin.Unit.a
                    return r9
                L74:
                    defpackage.uhc.a()
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: yxd.d.C1370d.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = yxd.this.new d(v1bVar);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ech0 ech0Var, v1b<? super Unit> v1bVar) {
            return ((d) create(ech0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00bd, code lost:
        
            if (r0.N1(r8) == r3) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
        
            if (r0.R1(r8) == r3) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x010a, code lost:
        
            return r3;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 274
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: yxd.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositDedicatedAccountViewModel$allBankListAndAccountListStateFlow$1", f = "DepositDedicatedAccountViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements gaj<List<? extends SportyBankDto>, List<? extends SportyBankAccountDto>, v1b<? super Pair<? extends List<? extends SportyBankDto>, ? extends List<? extends q5d>>>, Object> {
        public /* synthetic */ List a;
        public /* synthetic */ List b;

        @Override // defpackage.gaj
        public final Object invoke(List<? extends SportyBankDto> list, List<? extends SportyBankAccountDto> list2, v1b<? super Pair<? extends List<? extends SportyBankDto>, ? extends List<? extends q5d>>> v1bVar) {
            e eVar = new e(3, v1bVar);
            eVar.a = list;
            eVar.b = list2;
            return eVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            SportyBankAccountStatus next;
            List list = this.a;
            List<SportyBankAccountDto> list2 = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ArrayList arrayList = new ArrayList(l48.r(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                bki0.a(((SportyBankAccountDto) it.next()).getBankId(), arrayList);
            }
            ArrayList arrayList2 = new ArrayList(l48.r(list2, 10));
            for (SportyBankAccountDto sportyBankAccountDto : list2) {
                long id = sportyBankAccountDto.getId();
                String accountNumber = sportyBankAccountDto.getAccountNumber();
                if (accountNumber == null) {
                    str2 = "";
                    str = str2;
                } else {
                    str = accountNumber;
                    str2 = "";
                }
                int bankId = sportyBankAccountDto.getBankId();
                Iterator<SportyBankAccountStatus> it2 = SportyBankAccountStatus.getEntries().iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (next.getIntValue() != sportyBankAccountDto.getStatus());
                SportyBankAccountStatus sportyBankAccountStatus = next;
                if (sportyBankAccountStatus == null) {
                    sportyBankAccountStatus = SportyBankAccountStatus.UNSUPPORTED;
                }
                SportyBankAccountStatus sportyBankAccountStatus2 = sportyBankAccountStatus;
                String bankName = sportyBankAccountDto.getBankName();
                if (bankName == null) {
                    bankName = str2;
                }
                StringUiText stringUiText = vch0.a;
                arrayList2.add(new q5d(id, bankId, str, sportyBankAccountStatus2, bankName, new ConcatUiText(new UiText[]{new ResourceUiText(R.string.sporty_bank_prefix_title), new StringUiText(lx5.a(" ", sportyBankAccountDto.getUserFirstName(), " ", sportyBankAccountDto.getUserLastName()))}), sportyBankAccountDto.getBankIconUrl()));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (!arrayList.contains(new Integer(((SportyBankDto) obj2).getBankId()))) {
                    arrayList3.add(obj2);
                }
            }
            return new Pair(arrayList3, arrayList2);
        }
    }

    public static final class f implements lyh<Boolean> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositDedicatedAccountViewModel$special$$inlined$map$1", f = "DepositDedicatedAccountViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return f.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositDedicatedAccountViewModel$special$$inlined$map$1$2", f = "DepositDedicatedAccountViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
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
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Boolean boolValueOf = Boolean.valueOf(((Number) obj).intValue() > 0);
                    aVar.b = 1;
                    if (this.a.emit(boolValueOf, aVar) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public f(lyh lyhVar) {
            this.a = lyhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) {
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
                b bVar = new b(myhVar);
                aVar.b = 1;
                if (this.a.collect(bVar, aVar) == y5bVar) {
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
    public yxd(sr10 sr10Var, b700 b700Var, d100 d100Var, uyx uyxVar, eth0 eth0Var, rdd0 rdd0Var, lyz lyzVar, wl wlVar, psm psmVar, mgb0 mgb0Var, uqm uqmVar, uy0 uy0Var, u290 u290Var, cbg cbgVar, vu60 vu60Var) {
        super(uyxVar, eth0Var, rdd0Var, uy0Var, d100Var, lyzVar, wlVar, psmVar, mgb0Var, uqmVar, u290Var, cbgVar, vu60Var);
        sr10Var.getClass();
        b700Var.getClass();
        d100Var.getClass();
        rdd0Var.getClass();
        lyzVar.getClass();
        wlVar.getClass();
        psmVar.getClass();
        mgb0Var.getClass();
        uqmVar.getClass();
        uy0Var.getClass();
        u290Var.getClass();
        cbgVar.getClass();
        vu60Var.getClass();
        this.l0 = sr10Var;
        this.m0 = b700Var;
        this.o0 = new a300.a.b(psmVar.getCountryCode());
        pu0.b bVar = pu0.b.a;
        this.p0 = kotlin.collections.b.k(sr10Var.F(bVar), sr10Var.e0(bVar));
        vl50 vl50VarF = bm50.f(sr10Var.F(bVar));
        et7 et7VarD = o8i0.d(this);
        m2g m2gVar = m2g.a;
        v340 v340VarE = e1i.e(vl50VarF, et7VarD, q490.a.b, m2gVar);
        wwd0 wwd0VarA = xwd0.a(m2gVar);
        this.q0 = wwd0VarA;
        kzh.d(new g1i(bm50.f(sr10Var.e0(bVar)), new a(null)), o8i0.d(this));
        f fVar = new f(b700Var.f());
        ku90<ech0> ku90Var = new ku90<>();
        this.r0 = ku90Var;
        ku90<hch0> ku90Var2 = new ku90<>();
        this.s0 = ku90Var2;
        this.t0 = e1i.a(ku90Var2);
        wwd0 wwd0VarA2 = xwd0.a(new sch0(0));
        this.u0 = wwd0VarA2;
        this.v0 = e1i.b(wwd0VarA2);
        wwd0 wwd0VarA3 = xwd0.a(new tch0(0));
        this.w0 = wwd0VarA3;
        this.x0 = e1i.b(wwd0VarA3);
        wwd0 wwd0VarA4 = xwd0.a(k8.b.a);
        this.y0 = wwd0VarA4;
        tzs.a aVar = tzs.a.a;
        wwd0 wwd0VarA5 = xwd0.a(aVar);
        this.z0 = wwd0VarA5;
        wwd0 wwd0VarA6 = xwd0.a(aVar);
        this.A0 = wwd0VarA6;
        wwd0 wwd0VarA7 = xwd0.a(m2gVar);
        this.B0 = wwd0VarA7;
        v340 v340VarE2 = e1i.e(new n1i(v340VarE, wwd0VarA, new e(3, null)), o8i0.d(this), q490.a.a, new Pair(m2gVar, m2gVar));
        kzh.d(r1i.c(fVar, this.F, wwd0VarA4, wwd0VarA5, wwd0VarA6, new b(null)), o8i0.d(this));
        kzh.d(r1i.a(v340VarE2, wwd0VarA7, d100Var.M(), new c(null)), o8i0.d(this));
        kzh.d(new g1i(ku90Var, new d(null)), o8i0.d(this));
    }

    @Override // defpackage.k72
    public final List<lyh<lk50<Object>>> A1() {
        return this.p0;
    }

    @Override // defpackage.m02, defpackage.k72
    public final y200 B1() {
        return this.o0;
    }

    @Override // defpackage.k72
    public final List<c9p> E1() {
        return kotlin.collections.b.k(O1(), P1());
    }

    @Override // defpackage.m02
    /* JADX INFO: renamed from: J1 */
    public final a300 B1() {
        return this.o0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N1(x1b x1bVar) {
        zxd zxdVar;
        if (x1bVar instanceof zxd) {
            zxdVar = (zxd) x1bVar;
            int i = zxdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zxdVar.c = i - Integer.MIN_VALUE;
            } else {
                zxdVar = new zxd(this, x1bVar);
            }
        } else {
            zxdVar = new zxd(this, x1bVar);
        }
        Object objA = zxdVar.a;
        y5b y5bVar = y5b.a;
        int i2 = zxdVar.c;
        b700 b700Var = this.m0;
        if (i2 == 0) {
            uj50.b(objA);
            lyh<Integer> lyhVarF = b700Var.f();
            zxdVar.c = 1;
            objA = s0i.a(lyhVarF, zxdVar);
            if (objA != y5bVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(objA);
                return objA;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(objA);
        int iIntValue = ((Number) objA).intValue();
        if (iIntValue < 0) {
            return Unit.a;
        }
        zxdVar.c = 2;
        Object objO = b700Var.o(iIntValue - 1, zxdVar);
        return objO == y5bVar ? y5bVar : objO;
    }

    public final jvd0 O1() {
        return ej5.c(o8i0.d(this), null, null, new byd(this, null), 3);
    }

    public final jvd0 P1() {
        return ej5.c(o8i0.d(this), null, null, new cyd(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0131 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x0132 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fa, code lost:
    
        if (r13 == r1) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q1(defpackage.x1b r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yxd.Q1(x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object R1(x1b x1bVar) {
        eyd eydVar;
        if (x1bVar instanceof eyd) {
            eydVar = (eyd) x1bVar;
            int i = eydVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eydVar.c = i - Integer.MIN_VALUE;
            } else {
                eydVar = new eyd(this, x1bVar);
            }
        } else {
            eydVar = new eyd(this, x1bVar);
        }
        Object obj = eydVar.a;
        y5b y5bVar = y5b.a;
        int i2 = eydVar.c;
        wwd0 wwd0Var = this.z0;
        if (i2 == 0) {
            uj50.b(obj);
            wwd0Var.setValue(tzs.b.a);
            jvd0 jvd0VarP1 = P1();
            eydVar.c = 1;
            if (jvd0VarP1.join(eydVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        wwd0Var.setValue(tzs.a.a);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object S1(x1b x1bVar) {
        fyd fydVar;
        if (x1bVar instanceof fyd) {
            fydVar = (fyd) x1bVar;
            int i = fydVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fydVar.c = i - Integer.MIN_VALUE;
            } else {
                fydVar = new fyd(this, x1bVar);
            }
        } else {
            fydVar = new fyd(this, x1bVar);
        }
        Object obj = fydVar.a;
        y5b y5bVar = y5b.a;
        int i2 = fydVar.c;
        wwd0 wwd0Var = this.A0;
        wwd0 wwd0Var2 = this.z0;
        if (i2 == 0) {
            uj50.b(obj);
            tzs.b bVar = tzs.b.a;
            wwd0Var2.setValue(bVar);
            wwd0Var.setValue(bVar);
            List listK = kotlin.collections.b.k(O1(), P1());
            fydVar.c = 1;
            if (up1.c(listK, fydVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        tzs.a aVar = tzs.a.a;
        wwd0Var2.setValue(aVar);
        wwd0Var.setValue(aVar);
        return Unit.a;
    }

    public final void T1(UiText uiText) {
        StringUiText stringUiText = vch0.a;
        ResourceUiText resourceUiText = new ResourceUiText(R.string.page_payment__sporty_bank_fetch_data_failed_dialog_title);
        if (uiText == null) {
            uiText = new ResourceUiText(R.string.page_payment__sporty_bank_fetch_data_failed_dialog_content);
        }
        ResourceUiText resourceUiText2 = new ResourceUiText(R.string.common_functions__ok);
        com.sporty.android.common.uievent.b.e(this.f, resourceUiText, null, uiText, resourceUiText2, null, null, null, 498);
    }
}
