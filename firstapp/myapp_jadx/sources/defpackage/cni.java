package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.loyalty.FootballClaim;
import com.sporty.android.core.model.loyalty.LoyaltyActivityData;
import com.sporty.android.platform.features.loyalty.footballgame.FootballData;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.FootballViewModel$claimFlow$2", f = "FootballViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class cni extends tje0 implements Function2<FootballClaim, v1b<? super lyh<? extends Pair<? extends kp7, ? extends Long>>>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ dni b;
    public final /* synthetic */ String c;

    public static final class a implements lyh<Pair<? extends kp7, ? extends Long>> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ dni b;
        public final /* synthetic */ FootballClaim c;
        public final /* synthetic */ String d;

        /* JADX INFO: renamed from: cni$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.FootballViewModel$claimFlow$2$invokeSuspend$$inlined$map$1", f = "FootballViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0180a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0180a(v1b v1bVar) {
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
            public final /* synthetic */ dni b;
            public final /* synthetic */ FootballClaim c;
            public final /* synthetic */ String d;

            /* JADX INFO: renamed from: cni$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.FootballViewModel$claimFlow$2$invokeSuspend$$inlined$map$1$2", f = "FootballViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0181a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0181a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, dni dniVar, FootballClaim footballClaim, String str) {
                this.a = myhVar;
                this.b = dniVar;
                this.c = footballClaim;
                this.d = str;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0181a c0181a;
                T next;
                if (v1bVar instanceof C0181a) {
                    c0181a = (C0181a) v1bVar;
                    int i = c0181a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0181a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0181a = new C0181a(v1bVar);
                    }
                } else {
                    c0181a = new C0181a(v1bVar);
                }
                Object obj2 = c0181a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0181a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    FootballClaim footballClaim = this.c;
                    String strA = oxc.a(footballClaim.getCurrency(), " ", bjb0.L(new BigDecimal(footballClaim.getRewardAmount()).divide(new BigDecimal(10000)), Locale.US));
                    List<LoyaltyActivityData> list = (List) n52.b((BaseResponse) obj);
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = (T) null;
                            break;
                        }
                        next = it.next();
                        LoyaltyActivityData loyaltyActivityData = (LoyaltyActivityData) next;
                        if (loyaltyActivityData.getStatus() == 3 && !loyaltyActivityData.isDailyReward() && !Intrinsics.g(loyaltyActivityData.getBatchId(), this.d)) {
                            break;
                        }
                    }
                    LoyaltyActivityData loyaltyActivityData2 = next;
                    dni dniVar = this.b;
                    FootballData footballData = loyaltyActivityData2 != null ? new FootballData(w0u.b1(loyaltyActivityData2.getStartTime(), loyaltyActivityData2.getEndTime()), oxc.a(loyaltyActivityData2.getCurrency(), " ", bjb0.L(new BigDecimal(loyaltyActivityData2.getPotentialReward()).divide(new BigDecimal(10000)), Locale.US)), loyaltyActivityData2.getBatchId(), dniVar.B.d) : null;
                    dniVar.z.a(list);
                    Pair pair = new Pair(new kp7(strA, footballData), new Long(footballClaim.getRewardAmount()));
                    c0181a.b = 1;
                    if (this.a.emit(pair, c0181a) == y5bVar) {
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

        public a(lyh lyhVar, dni dniVar, FootballClaim footballClaim, String str) {
            this.a = lyhVar;
            this.b = dniVar;
            this.c = footballClaim;
            this.d = str;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Pair<? extends kp7, ? extends Long>> myhVar, v1b v1bVar) {
            C0180a c0180a;
            if (v1bVar instanceof C0180a) {
                c0180a = (C0180a) v1bVar;
                int i = c0180a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0180a.b = i - Integer.MIN_VALUE;
                } else {
                    c0180a = new C0180a(v1bVar);
                }
            } else {
                c0180a = new C0180a(v1bVar);
            }
            Object obj = c0180a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0180a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar, this.b, this.c, this.d);
                c0180a.b = 1;
                if (this.a.collect(bVar, c0180a) == y5bVar) {
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
    public cni(dni dniVar, String str, v1b<? super cni> v1bVar) {
        super(2, v1bVar);
        this.b = dniVar;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        cni cniVar = new cni(this.b, this.c, v1bVar);
        cniVar.a = obj;
        return cniVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FootballClaim footballClaim, v1b<? super lyh<? extends Pair<? extends kp7, ? extends Long>>> v1bVar) {
        return ((cni) create(footballClaim, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        FootballClaim footballClaim = (FootballClaim) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        dni dniVar = this.b;
        return ozh.c(new a(dniVar.a.l(), dniVar, footballClaim, this.c), dniVar.c);
    }
}
