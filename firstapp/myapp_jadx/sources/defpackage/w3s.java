package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.leaguestats.NetworkInstantVirtualLeagueStats;
import com.sportybet.android.instantwin.newtork.model.response.leaguestats.NetworkInstantVirtualLeagueStatsTeamValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lw3s;", "Lj8i0;", "a", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class w3s extends j8i0 {
    public final String a;
    public final eko b;
    public final int c;
    public final wwd0 d;
    public final v340 e;

    /* JADX INFO: loaded from: classes6.dex */
    public interface a {
        w3s a(String str);
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CountryCodeName.values().length];
            try {
                iArr[CountryCodeName.SOUTH_AFRICA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    @c0d(c = "com.sportybet.android.instantwin.presentation.viewmodel.LeagueStatsViewModel$special$$inlined$flatMapLatest$1", f = "LeagueStatsViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super y3s>, Long, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object c;
        public final /* synthetic */ w3s d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, w3s w3sVar) {
            super(3, v1bVar);
            this.d = w3sVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super y3s> myhVar, Long l, v1b<? super Unit> v1bVar) {
            c cVar = new c(v1bVar, this.d);
            cVar.b = myhVar;
            cVar.c = l;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                ((Number) this.c).longValue();
                w3s w3sVar = this.d;
                d dVar = new d(bm50.a(w3sVar.b.g(w3sVar.a)), w3sVar);
                this.b = null;
                this.c = null;
                this.a = 1;
                if (kzh.c(myhVar, dVar, this) == y5bVar) {
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

    public static final class d implements lyh<y3s> {
        public final /* synthetic */ yzh a;
        public final /* synthetic */ w3s b;

        @c0d(c = "com.sportybet.android.instantwin.presentation.viewmodel.LeagueStatsViewModel$viewState$lambda$0$$inlined$map$1", f = "LeagueStatsViewModel.kt", l = {109}, m = "collect", v = 2)
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

        /* JADX INFO: loaded from: classes5.dex */
        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ w3s b;

            @c0d(c = "com.sportybet.android.instantwin.presentation.viewmodel.LeagueStatsViewModel$viewState$lambda$0$$inlined$map$1$2", f = "LeagueStatsViewModel.kt", l = {50}, m = "emit", v = 2)
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

            public b(myh myhVar, w3s w3sVar) {
                this.a = myhVar;
                this.b = w3sVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v3, types: [m2g] */
            /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                y3s bVar;
                ?? arrayList;
                Object obj2;
                List list;
                Object obj3;
                v3s v3sVar;
                T next;
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
                Object obj4 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                Object obj5 = null;
                if (i2 == 0) {
                    uj50.b(obj4);
                    lk50 lk50Var = (lk50) obj;
                    if (lk50Var instanceof lk50.b) {
                        bVar = y3s.c.a;
                    } else if (lk50Var instanceof lk50.c) {
                        List<NetworkInstantVirtualLeagueStats> list2 = (List) ((lk50.c) lk50Var).a;
                        if (list2 != null) {
                            int i3 = 10;
                            arrayList = new ArrayList(l48.r(list2, 10));
                            for (NetworkInstantVirtualLeagueStats networkInstantVirtualLeagueStats : list2) {
                                networkInstantVirtualLeagueStats.getClass();
                                List<NetworkInstantVirtualLeagueStatsTeamValue> values = networkInstantVirtualLeagueStats.getValues();
                                String str = "";
                                if (values != null) {
                                    ArrayList arrayList2 = new ArrayList(l48.r(values, i3));
                                    for (NetworkInstantVirtualLeagueStatsTeamValue networkInstantVirtualLeagueStatsTeamValue : values) {
                                        String trend = networkInstantVirtualLeagueStatsTeamValue.getTrend();
                                        if (trend != null) {
                                            v3s.b.getClass();
                                            Iterator<T> it = v3s.e.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    obj3 = obj5;
                                                    next = (T) obj3;
                                                    break;
                                                }
                                                next = it.next();
                                                obj3 = obj5;
                                                String str2 = ((v3s) next).a;
                                                Locale locale = Locale.ROOT;
                                                String lowerCase = str2.toLowerCase(locale);
                                                lowerCase.getClass();
                                                String lowerCase2 = trend.toLowerCase(locale);
                                                lowerCase2.getClass();
                                                if (lowerCase.equals(lowerCase2)) {
                                                    break;
                                                }
                                                obj5 = obj3;
                                            }
                                            v3sVar = next;
                                            if (v3sVar == null) {
                                                v3sVar = v3s.FLAT;
                                            }
                                        } else {
                                            obj3 = obj5;
                                            v3sVar = v3s.FLAT;
                                        }
                                        v3s v3sVar2 = v3sVar;
                                        int pop = networkInstantVirtualLeagueStatsTeamValue.getPop();
                                        String teamLogo = networkInstantVirtualLeagueStatsTeamValue.getTeamLogo();
                                        String str3 = teamLogo == null ? "" : teamLogo;
                                        String teamName = networkInstantVirtualLeagueStatsTeamValue.getTeamName();
                                        arrayList2.add(new u3s(pop, v3sVar2, str3, teamName == null ? "" : teamName, networkInstantVirtualLeagueStatsTeamValue.getPlayed(), networkInstantVirtualLeagueStatsTeamValue.getWon(), networkInstantVirtualLeagueStatsTeamValue.getDraw(), networkInstantVirtualLeagueStatsTeamValue.getLose(), networkInstantVirtualLeagueStatsTeamValue.getPts()));
                                        obj5 = obj3;
                                    }
                                    obj2 = obj5;
                                    list = arrayList2;
                                } else {
                                    obj2 = obj5;
                                    list = m2g.a;
                                }
                                String leagueName = networkInstantVirtualLeagueStats.getLeagueName();
                                if (leagueName != null) {
                                    str = leagueName;
                                }
                                arrayList.add(new u2s(str, list));
                                obj5 = obj2;
                                i3 = 10;
                            }
                        } else {
                            arrayList = m2g.a;
                        }
                        bVar = new y3s.b(arrayList, this.b.c);
                    } else {
                        if (!(lk50Var instanceof lk50.a)) {
                            uhc.a();
                            return null;
                        }
                        bVar = y3s.a.a;
                    }
                    aVar.b = 1;
                    if (this.a.emit(bVar, aVar) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj4);
                }
                return Unit.a;
            }
        }

        public d(yzh yzhVar, w3s w3sVar) {
            this.a = yzhVar;
            this.b = w3sVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super y3s> myhVar, v1b v1bVar) {
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

    public w3s(String str, eko ekoVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar, psm psmVar) {
        ekoVar.getClass();
        psmVar.getClass();
        this.a = str;
        this.b = ekoVar;
        this.c = b.a[psmVar.getCountryCode().ordinal()] == 1 ? R.string.page_instant_virtual__stats_popup_reference_claim__ZA : R.string.page_instant_virtual__stats_popup_reference_claim;
        wwd0 wwd0VarA = xwd0.a(Long.valueOf(System.currentTimeMillis()));
        this.d = wwd0VarA;
        this.e = e1i.e(ozh.c(r0i.f(wwd0VarA, new c(null, this)), k5bVar), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), y3s.c.a);
    }
}
