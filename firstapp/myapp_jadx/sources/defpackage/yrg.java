package defpackage;

import com.sporty.android.book.domain.entity.MarketGroup;
import com.sporty.android.book.domain.entity.SimpleMarket;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Sport;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.event.EventUseCase$fetchRemoteEvent$5", f = "EventUseCase.kt", l = {116}, m = "invokeSuspend", v = 2)
public final class yrg extends tje0 implements Function2<Pair<? extends Event, ? extends Boolean>, v1b<? super lyh<? extends aqg>>, Object> {
    public Event a;
    public boolean b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ csg e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String i;
    public final /* synthetic */ int v;

    @c0d(c = "com.sportybet.plugin.event.EventUseCase$fetchRemoteEvent$5$1", f = "EventUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements iaj<List<? extends MarketGroup>, List<? extends Integer>, List<? extends SimpleMarket>, v1b<? super aqg>, Object> {
        public /* synthetic */ List a;
        public /* synthetic */ List b;
        public /* synthetic */ List c;
        public final /* synthetic */ Event d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Event event, v1b<? super a> v1bVar) {
            super(4, v1bVar);
            this.d = event;
        }

        @Override // defpackage.iaj
        public final Object d(List<? extends MarketGroup> list, List<? extends Integer> list2, List<? extends SimpleMarket> list3, v1b<? super aqg> v1bVar) {
            a aVar = new a(this.d, v1bVar);
            aVar.a = list;
            aVar.b = list2;
            aVar.c = list3;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            List list = this.a;
            List list2 = this.b;
            List list3 = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new aqg(this.d, list, list2, list3);
        }
    }

    @c0d(c = "com.sportybet.plugin.event.EventUseCase$fetchRemoteEvent$5$2", f = "EventUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<List<? extends MarketGroup>, List<? extends SimpleMarket>, v1b<? super aqg>, Object> {
        public /* synthetic */ List a;
        public /* synthetic */ List b;
        public final /* synthetic */ Event c;
        public final /* synthetic */ csg d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Event event, csg csgVar, v1b<? super b> v1bVar) {
            super(3, v1bVar);
            this.c = event;
            this.d = csgVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(List<? extends MarketGroup> list, List<? extends SimpleMarket> list2, v1b<? super aqg> v1bVar) {
            b bVar = new b(this.c, this.d, v1bVar);
            bVar.a = list;
            bVar.b = list2;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            List list = this.a;
            List list2 = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new aqg(this.c, list, ((aqg) this.d.i.getValue()).c, list2);
        }
    }

    public static final class c implements lyh<aqg> {
        public final /* synthetic */ or60 a;
        public final /* synthetic */ Event b;
        public final /* synthetic */ csg c;

        @c0d(c = "com.sportybet.plugin.event.EventUseCase$fetchRemoteEvent$5$invokeSuspend$$inlined$map$1", f = "EventUseCase.kt", l = {109}, m = "collect", v = 2)
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
            public final /* synthetic */ Event b;
            public final /* synthetic */ csg c;

            @c0d(c = "com.sportybet.plugin.event.EventUseCase$fetchRemoteEvent$5$invokeSuspend$$inlined$map$1$2", f = "EventUseCase.kt", l = {50}, m = "emit", v = 2)
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

            public b(myh myhVar, Event event, csg csgVar) {
                this.a = myhVar;
                this.b = event;
                this.c = csgVar;
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
                    csg csgVar = this.c;
                    List<MarketGroup> list = ((aqg) csgVar.i.getValue()).b;
                    List<SimpleMarket> list2 = ((aqg) csgVar.i.getValue()).d;
                    aqg aqgVar = new aqg(this.b, list, (List) obj, list2);
                    aVar.b = 1;
                    if (this.a.emit(aqgVar, aVar) == y5bVar) {
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

        public c(or60 or60Var, Event event, csg csgVar) {
            this.a = or60Var;
            this.b = event;
            this.c = csgVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super aqg> myhVar, v1b v1bVar) {
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
                b bVar = new b(myhVar, this.b, this.c);
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
    public yrg(csg csgVar, boolean z, String str, int i, v1b<? super yrg> v1bVar) {
        super(2, v1bVar);
        this.e = csgVar;
        this.f = z;
        this.i = str;
        this.v = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        yrg yrgVar = new yrg(this.e, this.f, this.i, this.v, v1bVar);
        yrgVar.d = obj;
        return yrgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends Event, ? extends Boolean> pair, v1b<? super lyh<? extends aqg>> v1bVar) {
        return ((yrg) create(pair, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Event event;
        boolean zBooleanValue;
        String str;
        Event event2;
        Sport sport;
        String str2;
        boolean z;
        Pair pair = (Pair) this.d;
        y5b y5bVar = y5b.a;
        int i = this.c;
        csg csgVar = this.e;
        if (i == 0) {
            uj50.b(obj);
            event = (Event) pair.a;
            zBooleanValue = ((Boolean) pair.b).booleanValue();
            if (csgVar.e.isLogin()) {
                mgb0 mgb0Var = csgVar.f;
                this.d = null;
                this.a = event;
                this.b = zBooleanValue;
                this.c = 1;
                Object userId = mgb0Var.getUserId(this);
                if (userId == y5bVar) {
                    return y5bVar;
                }
                event2 = event;
                obj = userId;
            } else {
                str = null;
            }
            sport = event.sport;
            if (sport != null) {
                str2 = sport.id;
            } else {
                str2 = null;
            }
            int i2 = this.v;
            String str3 = this.i;
            z = this.f;
            if (!z && str != null && !StringsKt.U(str) && str2 != null && !StringsKt.U(str2)) {
                return r1i.a(csgVar.a(i2, str2, str3), new or60(new fih(csgVar.b, false, str2, this.v, str, null)), zBooleanValue ? new or60(new rrg(csgVar, str2, null)) : new gzh(null), new a(event, null));
            }
            if (z || str2 == null || StringsKt.U(str2)) {
                return (str != null || StringsKt.U(str) || str2 == null || StringsKt.U(str2)) ? new gzh(aqg.a((aqg) csgVar.i.getValue(), event, null, null, 14)) : new c(new or60(new fih(csgVar.b, false, str2, this.v, str, null)), event, csgVar);
            }
            return new n1i(csgVar.a(i2, str2, str3), zBooleanValue ? new or60(new rrg(csgVar, str2, null)) : new gzh(null), new b(event, csgVar, null));
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        zBooleanValue = this.b;
        event2 = this.a;
        uj50.b(obj);
        str = (String) obj;
        event = event2;
        sport = event.sport;
        if (sport != null) {
            str2 = sport.id;
        } else {
            str2 = null;
        }
        int i3 = this.v;
        String str4 = this.i;
        z = this.f;
        if (!z) {
        }
        if (z) {
        }
        if (str != null) {
        }
    }
}
