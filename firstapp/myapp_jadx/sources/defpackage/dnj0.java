package defpackage;

import com.sporty.android.core.model.patron.UserPhone;
import com.sporty.android.core.model.pocket.common.ChannelAsset;
import com.sporty.android.core.model.pocket.common.PayHintData;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.feature.payment.impl.withdraw.domain.model.WithdrawAlertHintStatus;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Ldnj0;", "Lo82;", "", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public class dnj0 extends o82 {
    public static final /* synthetic */ int P0 = 0;
    public final c A0;
    public final wwd0 B0;
    public final wwd0 C0;
    public final v340 D0;
    public final wwd0 E0;
    public final wwd0 F0;
    public final wwd0 G0;
    public final wwd0 H0;
    public jvd0 I0;
    public final v340 J0;
    public final v340 K0;
    public final v340 L0;
    public final v340 M0;
    public final ngs N0;
    public final iwp O0;
    public final vh7 h0;
    public final rak i0;
    public final c4k j0;
    public final xqj0 k0;
    public final sr10 l0;
    public final lyz m0;
    public final psm n0;
    public final phj0 o0;
    public final i390 p0;
    public final y300.b q0;
    public boolean r0;
    public UserPhone s0;
    public final wwd0 t0;
    public final wwd0 u0;
    public final wwd0 v0;
    public final ku90<String> w0;
    public final ku90 x0;
    public final v340 y0;
    public final v340 z0;

    public static final class a implements lyh<UserPhone> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ dnj0 b;

        /* JADX INFO: renamed from: dnj0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawMomoViewModel$special$$inlined$map$1", f = "WithdrawMomoViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0493a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0493a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ dnj0 b;

            /* JADX INFO: renamed from: dnj0$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawMomoViewModel$special$$inlined$map$1$2", f = "WithdrawMomoViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0494a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0494a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, dnj0 dnj0Var) {
                this.a = myhVar;
                this.b = dnj0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0494a c0494a;
                T next;
                String phone;
                UserPhone userPhone;
                if (v1bVar instanceof C0494a) {
                    c0494a = (C0494a) v1bVar;
                    int i = c0494a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0494a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0494a = new C0494a(v1bVar);
                    }
                } else {
                    c0494a = new C0494a(v1bVar);
                }
                Object obj2 = c0494a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0494a.b;
                UserPhone userPhone2 = null;
                if (i2 == 0) {
                    uj50.b(obj2);
                    lk50 lk50Var = (lk50) obj;
                    boolean z = lk50Var instanceof lk50.c;
                    dnj0 dnj0Var = this.b;
                    if (z) {
                        T t = ((lk50.c) lk50Var).a;
                        Iterable iterable = (Iterable) t;
                        Iterator<T> it = iterable.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it.next();
                            phone = ((UserPhone) next).getPhone();
                            userPhone = dnj0Var.s0;
                        } while (!Intrinsics.g(phone, userPhone != null ? userPhone.getPhone() : null));
                        boolean z2 = next == null;
                        if (!dnj0Var.r0 || z2) {
                            dnj0Var.r0 = true;
                            for (T t2 : iterable) {
                                if (((UserPhone) t2).isPrimary()) {
                                    userPhone2 = t2;
                                    break;
                                }
                            }
                            UserPhone userPhone3 = userPhone2;
                            if (userPhone3 == null) {
                                userPhone3 = (UserPhone) CollectionsKt.firstOrNull((List) t);
                            }
                            dnj0Var.s0 = userPhone3;
                        }
                    }
                    UserPhone userPhone4 = dnj0Var.s0;
                    c0494a.b = 1;
                    if (this.a.emit(userPhone4, c0494a) == y5bVar) {
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

        public a(lyh lyhVar, dnj0 dnj0Var) {
            this.a = lyhVar;
            this.b = dnj0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super UserPhone> myhVar, v1b v1bVar) {
            C0493a c0493a;
            if (v1bVar instanceof C0493a) {
                c0493a = (C0493a) v1bVar;
                int i = c0493a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0493a.b = i - Integer.MIN_VALUE;
                } else {
                    c0493a = new C0493a(v1bVar);
                }
            } else {
                c0493a = new C0493a(v1bVar);
            }
            Object obj = c0493a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0493a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar, this.b);
                c0493a.b = 1;
                if (this.a.collect(bVar, c0493a) == y5bVar) {
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

    public static final class b implements lyh<Boolean> {
        public final /* synthetic */ wwd0 a;
        public final /* synthetic */ dnj0 b;

        @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawMomoViewModel$special$$inlined$map$2", f = "WithdrawMomoViewModel.kt", l = {109}, m = "collect", v = 2)
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

        /* JADX INFO: renamed from: dnj0$b$b, reason: collision with other inner class name */
        public static final class C0495b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ dnj0 b;

            /* JADX INFO: renamed from: dnj0$b$b$a */
            @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawMomoViewModel$special$$inlined$map$2$2", f = "WithdrawMomoViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    return C0495b.this.emit(null, this);
                }
            }

            public C0495b(myh myhVar, dnj0 dnj0Var) {
                this.a = myhVar;
                this.b = dnj0Var;
            }

            /* JADX WARN: Code duplicated, block: B:28:0x0060  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) throws Exception {
                a aVar;
                boolean z;
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
                    ChannelAsset.Channel channel = (ChannelAsset.Channel) obj;
                    CountryCodeName countryCodeName = this.b.q0.a;
                    int i3 = y300.b.a.a[countryCodeName.ordinal()];
                    if (i3 == 1) {
                        z = true;
                    } else {
                        if (i3 != 2 && i3 != 3 && i3 != 4) {
                            throw new Exception(l4j0.a("`isSwitchChannelAfter1stDepositAllowed` undefine for ", countryCodeName, " in PayMethodWithdraw.Momo"));
                        }
                        if (channel == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
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

        public b(wwd0 wwd0Var, dnj0 dnj0Var) {
            this.a = wwd0Var;
            this.b = dnj0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) throws Throwable {
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
            if (i2 != 0) {
                if (i2 == 1) {
                    uj50.b(obj);
                    return Unit.a;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            C0495b c0495b = new C0495b(myhVar, this.b);
            aVar.b = 1;
            this.a.collect(c0495b, aVar);
            return y5bVar;
        }
    }

    public static final class c implements lyh<String> {
        public final /* synthetic */ v340 a;
        public final /* synthetic */ dnj0 b;

        @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawMomoViewModel$special$$inlined$map$3", f = "WithdrawMomoViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return c.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ dnj0 b;

            @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawMomoViewModel$special$$inlined$map$3$2", f = "WithdrawMomoViewModel.kt", l = {50}, m = "emit", v = 2)
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

            public b(myh myhVar, dnj0 dnj0Var) {
                this.a = myhVar;
                this.b = dnj0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                String strA;
                String phone;
                String phoneCountryCode;
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
                    UserPhone userPhone = (UserPhone) obj;
                    String strM = (userPhone == null || (phoneCountryCode = userPhone.getPhoneCountryCode()) == null) ? this.b.n0.M() : "+".concat(phoneCountryCode);
                    if (userPhone == null || (phone = userPhone.getPhone()) == null || (strA = vtu.a(phone)) == null) {
                        strA = "--";
                    }
                    String strA2 = oxc.a(strM, "   ", strA);
                    aVar.b = 1;
                    if (this.a.emit(strA2, aVar) == y5bVar) {
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

        public c(v340 v340Var, dnj0 dnj0Var) {
            this.a = v340Var;
            this.b = dnj0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.lyh
        public final Object collect(myh<? super String> myhVar, v1b v1bVar) {
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
                b bVar = new b(myhVar, this.b);
                aVar.b = 1;
                if (this.a.a.collect(bVar, aVar) == y5bVar) {
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

    public static final class d implements lyh<Integer> {
        public final /* synthetic */ wwd0 a;

        @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawMomoViewModel$special$$inlined$mapNotNull$1", f = "WithdrawMomoViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return d.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawMomoViewModel$special$$inlined$mapNotNull$1$2", f = "WithdrawMomoViewModel.kt", l = {52}, m = "emit", v = 2)
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
                    ChannelAsset.Channel channel = (ChannelAsset.Channel) obj;
                    Integer num = channel != null ? new Integer(channel.getPayChId()) : null;
                    if (num != null) {
                        aVar.b = 1;
                        if (this.a.emit(num, aVar) == y5bVar) {
                            return y5bVar;
                        }
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

        public d(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Integer> myhVar, v1b v1bVar) throws Throwable {
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
            if (i2 != 0) {
                if (i2 == 1) {
                    uj50.b(obj);
                    return Unit.a;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            b bVar = new b(myhVar);
            aVar.b = 1;
            this.a.collect(bVar, aVar);
            return y5bVar;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawMomoViewModel$withdrawAlertConfigFlow$1", f = "WithdrawMomoViewModel.kt", l = {213}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<ChannelAsset.Channel, v1b<? super WithdrawAlertHintStatus>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ dnj0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(v1b v1bVar, dnj0 dnj0Var) {
            super(2, v1bVar);
            this.c = dnj0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = new e(v1bVar, this.c);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ChannelAsset.Channel channel, v1b<? super WithdrawAlertHintStatus> v1bVar) {
            return ((e) create(channel, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ChannelAsset.Channel channel = (ChannelAsset.Channel) this.b;
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
            phj0 phj0Var = this.c.o0;
            at.c cVar = new at.c(channel != null ? channel.getChannelSendName() : null, channel != null ? new Integer(channel.getPayChId()) : null, channel != null ? channel.getChannelSendName() : null);
            this.b = null;
            this.a = 1;
            Object objC = phj0Var.c(cVar, this);
            return objC == y5bVar ? y5bVar : objC;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawMomoViewModel$withdrawMainPageAlertConfigFlow$1", f = "WithdrawMomoViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements iaj<WithdrawAlertHintStatus, PayHintData, rr00, v1b<? super WithdrawAlertHintStatus>, Object> {
        public /* synthetic */ WithdrawAlertHintStatus a;
        public /* synthetic */ PayHintData b;
        public /* synthetic */ rr00 c;

        @Override // defpackage.iaj
        public final Object d(WithdrawAlertHintStatus withdrawAlertHintStatus, PayHintData payHintData, rr00 rr00Var, v1b<? super WithdrawAlertHintStatus> v1bVar) {
            f fVar = new f(4, v1bVar);
            fVar.a = withdrawAlertHintStatus;
            fVar.b = payHintData;
            fVar.c = rr00Var;
            return fVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            WithdrawAlertHintStatus withdrawAlertHintStatus = this.a;
            PayHintData payHintData = this.b;
            rr00 rr00Var = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            String str = payHintData != null ? payHintData.alert : null;
            return ((str == null || str.length() == 0) && !(rr00Var instanceof rr00.a)) ? withdrawAlertHintStatus : WithdrawAlertHintStatus.Gone.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawMomoViewModel$withdrawableStateFlow$1", f = "WithdrawMomoViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g extends tje0 implements iaj<xhj0, ChannelAsset.Channel, rr00, v1b<? super Boolean>, Object> {
        public /* synthetic */ xhj0 a;
        public /* synthetic */ ChannelAsset.Channel b;
        public /* synthetic */ rr00 c;

        @Override // defpackage.iaj
        public final Object d(xhj0 xhj0Var, ChannelAsset.Channel channel, rr00 rr00Var, v1b<? super Boolean> v1bVar) {
            g gVar = new g(4, v1bVar);
            gVar.a = xhj0Var;
            gVar.b = channel;
            gVar.c = rr00Var;
            return gVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            xhj0 xhj0Var = this.a;
            ChannelAsset.Channel channel = this.b;
            rr00 rr00Var = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (!Intrinsics.g(xhj0Var, xhj0.i.a)) {
                return Boolean.FALSE;
            }
            if (channel == null) {
                return Boolean.FALSE;
            }
            return rr00Var instanceof rr00.a ? Boolean.FALSE : Boolean.TRUE;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawMomoViewModel$withdrawableStateFlow$2", f = "WithdrawMomoViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class h extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public /* synthetic */ boolean a;
        public final /* synthetic */ dnj0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(v1b v1bVar, dnj0 dnj0Var) {
            super(2, v1bVar);
            this.b = dnj0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            h hVar = new h(v1bVar, this.b);
            hVar.a = ((Boolean) obj).booleanValue();
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((h) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            wwd0 wwd0Var = this.b.B0;
            if (wwd0Var.getValue() instanceof c330.a) {
                bkj0.a(z, null, wwd0Var, null);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnj0(uyx uyxVar, juh0 juh0Var, vh7 vh7Var, rak rakVar, c4k c4kVar, xqj0 xqj0Var, d100 d100Var, wl wlVar, uy0 uy0Var, sr10 sr10Var, lyz lyzVar, psm psmVar, mgb0 mgb0Var, shj0 shj0Var, phj0 phj0Var, i390 i390Var) throws Exception {
        super(uyxVar, juh0Var, uy0Var, sr10Var, d100Var, lyzVar, wlVar, psmVar, mgb0Var, shj0Var);
        d100Var.getClass();
        wlVar.getClass();
        uy0Var.getClass();
        sr10Var.getClass();
        lyzVar.getClass();
        psmVar.getClass();
        mgb0Var.getClass();
        i390Var.getClass();
        this.h0 = vh7Var;
        this.i0 = rakVar;
        this.j0 = c4kVar;
        this.k0 = xqj0Var;
        this.l0 = sr10Var;
        this.m0 = lyzVar;
        this.n0 = psmVar;
        this.o0 = phj0Var;
        this.p0 = i390Var;
        y300.b bVar = new y300.b(psmVar.getCountryCode());
        this.q0 = bVar;
        wwd0 wwd0VarA = xwd0.a(null);
        this.t0 = wwd0VarA;
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0VarA2 = xwd0.a(bool);
        this.u0 = wwd0VarA2;
        this.v0 = xwd0.a(null);
        ku90<String> ku90Var = new ku90<>();
        this.w0 = ku90Var;
        this.x0 = ku90Var;
        pu0.b bVar2 = pu0.b.a;
        a aVar = new a(lyzVar.y(bVar2), this);
        et7 et7VarD = o8i0.d(this);
        kwd0 kwd0Var = q490.a.a;
        v340 v340VarE = e1i.e(aVar, et7VarD, kwd0Var, null);
        this.y0 = v340VarE;
        this.z0 = e1i.e(uzh.b(new b(wwd0VarA, this)), o8i0.d(this), kwd0Var, bool);
        this.A0 = new c(v340VarE, this);
        wwd0 wwd0VarA3 = zjj0.a(null, false);
        this.B0 = wwd0VarA3;
        this.C0 = wwd0VarA3;
        v340 v340VarE2 = e1i.e(new wl50(sr10Var.q0(bVar2), new hwp(2)), o8i0.d(this), kwd0Var, lk50.b.a);
        this.D0 = v340VarE2;
        wwd0 wwd0VarA4 = xwd0.a(null);
        this.E0 = wwd0VarA4;
        this.F0 = wwd0VarA4;
        wwd0 wwd0VarA5 = xwd0.a(rr00.b.a);
        this.G0 = wwd0VarA5;
        this.H0 = wwd0VarA5;
        WithdrawAlertHintStatus.Gone gone = WithdrawAlertHintStatus.Gone.a;
        b77 b77VarB = nb4.b(wwd0VarA4, gone, new e(null, this));
        et7 et7VarD2 = o8i0.d(this);
        lwd0 lwd0Var = q490.a.b;
        v340 v340VarE3 = e1i.e(b77VarB, et7VarD2, lwd0Var, gone);
        this.J0 = v340VarE3;
        this.K0 = e1i.e(r1i.a(v340VarE3, this.O, wwd0VarA5, new f(4, null)), o8i0.d(this), lwd0Var, gone);
        this.L0 = e1i.e(new d(wwd0VarA4), o8i0.d(this), kwd0Var, 0);
        this.M0 = e1i.e(new g1i(r1i.a(H1(), wwd0VarA4, wwd0VarA5, new g(4, null)), new h(null, this)), o8i0.d(this), kwd0Var, bool);
        ngs ngsVarB = kotlin.collections.a.b();
        ngsVarB.add(v340VarE2);
        ngsVarB.add(this.P);
        ngsVarB.add(sr10Var.j0(bVar2));
        ngsVarB.add(d100Var.a(bVar2));
        ngsVarB.add(lyzVar.y(bVar2));
        x300 x300VarN = bVar.n();
        x300 x300Var = x300.a;
        if (x300VarN == x300Var) {
            ngsVarB.add(sr10Var.h(bVar2));
        }
        this.N0 = kotlin.collections.a.a(ngsVarB);
        ngs ngsVarB2 = kotlin.collections.a.b();
        ngsVarB2.add(new f1i(v340VarE));
        if (bVar.n() == x300Var) {
            ngsVarB2.add(sr10Var.h(bVar2));
        }
        kzh.d(new ymj0((lyh[]) CollectionsKt.A0(kotlin.collections.a.a(ngsVarB2)).toArray(new lyh[0]), this), o8i0.d(this));
        kzh.d(new g1i(wwd0VarA2, new zmj0(null, this)), o8i0.d(this));
        this.O0 = new iwp(this, 1);
    }

    @Override // defpackage.k72
    public List<lyh<lk50<Object>>> A1() {
        return this.N0;
    }

    @Override // defpackage.k72
    public final y200 B1() {
        return this.q0;
    }

    @Override // defpackage.k72
    public List<c9p> E1() {
        ngs ngsVarB = kotlin.collections.a.b();
        ngsVarB.add(ej5.c(o8i0.d(this), null, null, new anj0(null, this), 3));
        et7 et7VarD = o8i0.d(this);
        log0 log0Var = this.c0;
        log0Var.getClass();
        i390 i390Var = this.p0;
        ngsVarB.add(i390Var.c(et7VarD, log0Var));
        y300.b bVar = this.q0;
        if (bVar.n() == x300.a) {
            ngsVarB.add(i390Var.b(o8i0.d(this), log0Var));
        }
        if (bVar.o()) {
            ngsVarB.add(i390Var.a(o8i0.d(this)));
        }
        return kotlin.collections.a.a(ngsVarB);
    }

    @Override // defpackage.o82
    public final uwd0<Integer> G1() {
        return this.L0;
    }

    @Override // defpackage.o82
    public final jvd0 J1() {
        return ej5.c(o8i0.d(this), null, null, new bnj0(null, this), 3);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        if (r12 == r0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L1(defpackage.x1b r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.vmj0
            if (r0 == 0) goto L14
            r0 = r12
            vmj0 r0 = (defpackage.vmj0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            vmj0 r0 = new vmj0
            r0.<init>(r11, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r9.a
            y5b r0 = defpackage.y5b.a
            int r1 = r9.c
            r2 = 0
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L38
            if (r1 == r3) goto L34
            if (r1 != r4) goto L2e
            defpackage.uj50.b(r12)
            goto Lab
        L2e:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r11)
            return r2
        L34:
            defpackage.uj50.b(r12)
            goto L59
        L38:
            defpackage.uj50.b(r12)
            wwd0 r12 = r11.t0
            java.lang.Object r12 = r12.getValue()
            com.sporty.android.core.model.pocket.common.ChannelAsset$Channel r12 = (com.sporty.android.core.model.pocket.common.ChannelAsset.Channel) r12
            if (r12 == 0) goto Lba
            java.lang.String r12 = r12.getChannelSendName()
            if (r12 != 0) goto L4c
            goto Lba
        L4c:
            r9.c = r3
            c4k r1 = r11.j0
            log0 r3 = r11.c0
            java.lang.Object r12 = r1.d(r3, r12, r9)
            if (r12 != r0) goto L59
            goto Laa
        L59:
            com.sporty.android.core.model.pocket.common.ChannelAsset$Channel r12 = (com.sporty.android.core.model.pocket.common.ChannelAsset.Channel) r12
            if (r12 == 0) goto Lb7
            java.lang.String r12 = r12.getChannelShowName()
            if (r12 != 0) goto L64
            goto Lb7
        L64:
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            com.sporty.android.common_ui.uitext.StringUiText r1 = defpackage.vch0.a
            com.sporty.android.common_ui.uitext.ResourceUiText r3 = new com.sporty.android.common_ui.uitext.ResourceUiText
            java.util.List r12 = defpackage.ay0.S(r12)
            r1 = 2132022926(0x7f14168e, float:1.9684285E38)
            r3.<init>(r1, r12)
            com.sporty.android.common_ui.uitext.ResourceUiText r5 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r12 = 2132018532(0x7f140564, float:1.9675373E38)
            r5.<init>(r12)
            com.sporty.android.common_ui.uitext.ResourceUiText r12 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r1 = 2132018506(0x7f14054a, float:1.967532E38)
            r12.<init>(r1)
            java.lang.Integer r1 = new java.lang.Integer
            r6 = 2131101717(0x7f060815, float:1.7815852E38)
            r1.<init>(r6)
            com.sporty.android.common_ui.uitext.ColoredUiText r6 = new com.sporty.android.common_ui.uitext.ColoredUiText
            r6.<init>(r12, r1, r2)
            java.lang.Integer r7 = new java.lang.Integer
            r12 = 2132084280(0x7f150638, float:1.9808726E38)
            r7.<init>(r12)
            r9.c = r4
            ku90<com.sporty.android.common.uievent.a> r1 = r11.f
            r2 = 0
            r4 = 0
            r8 = 0
            r10 = 165(0xa5, float:2.31E-43)
            java.lang.Object r12 = com.sporty.android.common.uievent.b.f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r12 != r0) goto Lab
        Laa:
            return r0
        Lab:
            com.sporty.android.common.uievent.AlertDialogCallbackType r12 = (com.sporty.android.common.uievent.AlertDialogCallbackType) r12
            r12.getClass()
            boolean r11 = r12 instanceof com.sporty.android.common.uievent.AlertDialogCallbackType.Negative
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        Lb7:
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            return r11
        Lba:
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnj0.L1(x1b):java.lang.Object");
    }
}
