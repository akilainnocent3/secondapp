package defpackage;

import com.sportybet.android.instantwin.newtork.model.NetworkKeyMappedPayload;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballEventResult;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballEventResultEnvelop;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballMatchday;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballMatchdaySocketData;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballMatchdaySocketDataEnvelop;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class ag70 implements lyh<l970> {
    public final /* synthetic */ jv5 a;
    public final /* synthetic */ mg70 b;

    @c0d(c = "com.sportybet.android.instantwin.data.repository.ScheduledFootballRepoImpl$matchdayUpdateDataFlow$$inlined$map$1", f = "ScheduledFootballRepoImpl.kt", l = {109}, m = "collect", v = 2)
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
            return ag70.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;

        @c0d(c = "com.sportybet.android.instantwin.data.repository.ScheduledFootballRepoImpl$matchdayUpdateDataFlow$$inlined$map$1$2", f = "ScheduledFootballRepoImpl.kt", l = {50}, m = "emit", v = 2)
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

        public b(myh myhVar, mg70 mg70Var) {
            this.a = myhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r7v6, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r7v7, types: [m2g] */
        /* JADX WARN: Type inference failed for: r7v8, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r9v1, types: [myh] */
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
            Object bVar;
            List<NetworkScheduledFootballMatchdaySocketData> data;
            NetworkScheduledFootballMatchdaySocketData networkScheduledFootballMatchdaySocketData;
            String leagueId;
            T next;
            Object bVar2;
            NetworkScheduledFootballMatchday networkScheduledFootballMatchday;
            Object aVar2;
            Object bVar3;
            ?? arrayList;
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
            Object obj3 = null;
            if (i2 == 0) {
                uj50.b(obj2);
                String str = (String) obj;
                eal ealVar = new eal();
                try {
                    zi50.a aVar3 = zi50.b;
                    bVar = (NetworkScheduledFootballMatchdaySocketDataEnvelop) ealVar.e(str, NetworkScheduledFootballMatchdaySocketDataEnvelop.class);
                } catch (Throwable th) {
                    zi50.a aVar4 = zi50.b;
                    bVar = new zi50.b(th);
                }
                if (bVar instanceof zi50.b) {
                    bVar = null;
                }
                NetworkScheduledFootballMatchdaySocketDataEnvelop networkScheduledFootballMatchdaySocketDataEnvelop = (NetworkScheduledFootballMatchdaySocketDataEnvelop) bVar;
                if (networkScheduledFootballMatchdaySocketDataEnvelop != null && (data = networkScheduledFootballMatchdaySocketDataEnvelop.getData()) != null && (networkScheduledFootballMatchdaySocketData = (NetworkScheduledFootballMatchdaySocketData) CollectionsKt.firstOrNull(data)) != null && (leagueId = networkScheduledFootballMatchdaySocketData.getLeagueId()) != null) {
                    m970.a aVar5 = m970.b;
                    String status = networkScheduledFootballMatchdaySocketData.getStatus();
                    aVar5.getClass();
                    Iterator<T> it = m970.d.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = (T) null;
                            break;
                        }
                        next = it.next();
                    } while (!((m970) next).a.equalsIgnoreCase(status));
                    m970 m970Var = next;
                    if (m970Var != null) {
                        int iOrdinal = m970Var.ordinal();
                        if (iOrdinal == 0) {
                            try {
                                zi50.a aVar6 = zi50.b;
                                bVar2 = (NetworkKeyMappedPayload) ealVar.b(networkScheduledFootballMatchdaySocketData.getData(), NetworkKeyMappedPayload.class);
                            } catch (Throwable th2) {
                                zi50.a aVar7 = zi50.b;
                                bVar2 = new zi50.b(th2);
                            }
                            if (bVar2 instanceof zi50.b) {
                                bVar2 = null;
                            }
                            NetworkKeyMappedPayload networkKeyMappedPayload = (NetworkKeyMappedPayload) bVar2;
                            if (networkKeyMappedPayload != null) {
                                tcp value = networkKeyMappedPayload.getValue();
                                xdp xdpVar = value instanceof xdp ? (xdp) value : null;
                                if (xdpVar != null && (networkScheduledFootballMatchday = (NetworkScheduledFootballMatchday) ealVar.b(p5p.b(xdpVar, networkKeyMappedPayload.getKeys()), NetworkScheduledFootballMatchday.class)) != null) {
                                    aVar2 = new l970.a(leagueId, g970.a(networkScheduledFootballMatchday, leagueId));
                                    obj3 = aVar2;
                                }
                            }
                        } else {
                            if (iOrdinal != 1) {
                                uhc.a();
                                return null;
                            }
                            try {
                                zi50.a aVar8 = zi50.b;
                                bVar3 = (NetworkScheduledFootballEventResultEnvelop) ealVar.b(networkScheduledFootballMatchdaySocketData.getData(), NetworkScheduledFootballEventResultEnvelop.class);
                            } catch (Throwable th3) {
                                zi50.a aVar9 = zi50.b;
                                bVar3 = new zi50.b(th3);
                            }
                            if (bVar3 instanceof zi50.b) {
                                bVar3 = null;
                            }
                            NetworkScheduledFootballEventResultEnvelop networkScheduledFootballEventResultEnvelop = (NetworkScheduledFootballEventResultEnvelop) bVar3;
                            if (networkScheduledFootballEventResultEnvelop != null) {
                                long kickoffTime = networkScheduledFootballEventResultEnvelop.getKickoffTime();
                                List<NetworkScheduledFootballEventResult> results = networkScheduledFootballEventResultEnvelop.getResults();
                                if (results != null) {
                                    arrayList = new ArrayList(l48.r(results, 10));
                                    Iterator<T> it2 = results.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add(p470.a((NetworkScheduledFootballEventResult) it2.next(), kickoffTime));
                                    }
                                } else {
                                    arrayList = 0;
                                }
                                if (arrayList == 0) {
                                    arrayList = m2g.a;
                                }
                                if (!arrayList.isEmpty()) {
                                    aVar2 = new l970.b(leagueId + "_" + networkScheduledFootballEventResultEnvelop.getSeason() + "_" + networkScheduledFootballEventResultEnvelop.getMatchday(), arrayList);
                                    obj3 = aVar2;
                                }
                            }
                        }
                    }
                }
                aVar.b = 1;
                if (this.a.emit(obj3, aVar) == y5bVar) {
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

    public ag70(jv5 jv5Var, mg70 mg70Var) {
        this.a = jv5Var;
        this.b = mg70Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super l970> myhVar, v1b v1bVar) {
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
