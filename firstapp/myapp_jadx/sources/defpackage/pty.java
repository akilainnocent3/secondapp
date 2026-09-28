package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.MarketExtend;
import com.sportybet.plugin.realsports.data.MarketHotTags;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class pty implements oty {
    public final ksy a;
    public final iuy b;
    public final b c;

    @c0d(c = "com.sportybet.plugin.realsports.oneuppromo.presentation.OneUpPromoTagStateResolver$eligibilityUpdates$1", f = "OneUpPromoSurfacePresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<qsy, vvy, v1b<? super Pair<? extends qsy, ? extends vvy>>, Object> {
        public /* synthetic */ qsy a;
        public /* synthetic */ vvy b;

        @Override // defpackage.gaj
        public final Object invoke(qsy qsyVar, vvy vvyVar, v1b<? super Pair<? extends qsy, ? extends vvy>> v1bVar) {
            a aVar = new a(3, v1bVar);
            aVar.a = qsyVar;
            aVar.b = vvyVar;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            qsy qsyVar = this.a;
            vvy vvyVar = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new Pair(qsyVar, vvyVar);
        }
    }

    public static final class b implements lyh<Unit> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sportybet.plugin.realsports.oneuppromo.presentation.OneUpPromoTagStateResolver$special$$inlined$map$1", f = "OneUpPromoSurfacePresenter.kt", l = {109}, m = "collect", v = 2)
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

        /* JADX INFO: renamed from: pty$b$b, reason: collision with other inner class name */
        public static final class C0984b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: pty$b$b$a */
            @c0d(c = "com.sportybet.plugin.realsports.oneuppromo.presentation.OneUpPromoTagStateResolver$special$$inlined$map$1$2", f = "OneUpPromoSurfacePresenter.kt", l = {50}, m = "emit", v = 2)
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
                    return C0984b.this.emit(null, this);
                }
            }

            public C0984b(myh myhVar) {
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
                    Unit unit = Unit.a;
                    aVar.b = 1;
                    if (this.a.emit(unit, aVar) == y5bVar) {
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

        public b(lyh lyhVar) {
            this.a = lyhVar;
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
                C0984b c0984b = new C0984b(myhVar);
                aVar.b = 1;
                if (this.a.collect(c0984b, aVar) == y5bVar) {
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

    public pty(ksy ksyVar, iuy iuyVar) {
        ksyVar.getClass();
        iuyVar.getClass();
        this.a = ksyVar;
        this.b = iuyVar;
        this.c = new b(uzh.b(new n1i(ksyVar.f, iuyVar.d(), new a(3, null))));
    }

    @Override // defpackage.oty
    public final nty a(gty gtyVar, Event event, RegularMarketRule regularMarketRule) {
        List<Market> list;
        int i;
        Sport sport;
        Object value = this.b.d().a.getValue();
        vvy.b bVar = value instanceof vvy.b ? (vvy.b) value : null;
        if (bVar == null) {
            return nty.a.a;
        }
        uvy uvyVar = bVar.a;
        qsy qsyVar = (qsy) this.a.f.a.getValue();
        boolean z = uvyVar.a;
        qsyVar.getClass();
        if (qsyVar.b && qsyVar.a == rsy.VARIANT) {
            int iOrdinal = gtyVar.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
                if (Intrinsics.g((event == null || (sport = event.sport) == null) ? null : sport.id, "sr:sport:1") && (list = event.markets) != null && !list.isEmpty()) {
                    for (Market market : list) {
                        if (Intrinsics.g(market.id, "60200") && market.product == 3 && ((i = market.status) == 0 || i == 1)) {
                            MarketExtend marketExtendA = xvy.a(market);
                            if (marketExtendA != null && !marketExtendA.notSupport) {
                                MarketHotTags marketHotTags = event.marketHotTags;
                                if (!(marketHotTags != null ? Intrinsics.g(marketHotTags.getOneXTwoOneUp(), Boolean.TRUE) : false) || !z || !uvyVar.b) {
                                    break;
                                    break;
                                    break;
                                }
                                String str = regularMarketRule != null ? regularMarketRule.a : null;
                                if (str != null) {
                                    int iHashCode = str.hashCode();
                                    if (iHashCode != 49) {
                                        if (iHashCode == 51349688 && str.equals("60200")) {
                                            return nty.b.a;
                                        }
                                    } else if (str.equals("1")) {
                                        return nty.c.a;
                                    }
                                }
                                return nty.a.a;
                            }
                        }
                    }
                }
            } else if (iOrdinal != 5) {
                uhc.a();
                return null;
            }
        }
        return nty.a.a;
    }

    @Override // defpackage.oty
    public final b b() {
        return this.c;
    }
}
