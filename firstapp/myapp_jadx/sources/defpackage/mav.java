package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class mav implements lyh<qye> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ nav b;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ nav b;

        /* JADX INFO: renamed from: mav$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.piggybash.data.repository.matchmaking.MatchmakingRepository$special$$inlined$map$1$2", f = "MatchmakingRepository.kt", l = {50}, m = "emit", v = 1)
        public static final class C0864a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0864a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(myh myhVar, nav navVar) {
            this.a = myhVar;
            this.b = navVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
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
            C0864a c0864a;
            Object eVar;
            Object cVar;
            if (v1bVar instanceof C0864a) {
                c0864a = (C0864a) v1bVar;
                int i = c0864a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0864a.b = i - Integer.MIN_VALUE;
                } else {
                    c0864a = new C0864a(v1bVar);
                }
            } else {
                c0864a = new C0864a(v1bVar);
            }
            Object obj2 = c0864a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0864a.b;
            if (i2 == 0) {
                uj50.b(obj2);
                lav lavVar = (lav) obj;
                String countryCurrency = this.b.a.getCountryCurrency();
                if (countryCurrency == null) {
                    countryCurrency = "";
                }
                String str = countryCurrency;
                lavVar.getClass();
                if (lavVar instanceof lav.c) {
                    lav.c cVar2 = (lav.c) lavVar;
                    cVar = new qye.b(cVar2.getPlayerId(), cVar2.getNickname(), cVar2.getEmoji());
                } else if (lavVar instanceof lav.b) {
                    cVar = new qye.a(((lav.b) lavVar).getRefundAmount());
                } else if (lavVar instanceof lav.f) {
                    lav.f fVar = (lav.f) lavVar;
                    cVar = new qye.c(fVar.getEstimatedWaitTimeSeconds(), fVar.getQueueStartedAt(), fVar.getElapsedSeconds());
                } else {
                    if (lavVar instanceof lav.e) {
                        lav.e eVar2 = (lav.e) lavVar;
                        eVar = new qye.d(eVar2.getCurrentPlayers(), eVar2.getMaxPlayers(), eVar2.getUpperBound(), eVar2.getPrizePoolAmount(), str);
                    } else {
                        if (!(lavVar instanceof lav.d)) {
                            uhc.a();
                            return null;
                        }
                        lav.d dVar = (lav.d) lavVar;
                        long roundId = dVar.getRoundId();
                        List<String> listF = dVar.f();
                        List<dq10> listC = dVar.c();
                        ArrayList arrayList = new ArrayList(l48.r(listC, 10));
                        for (dq10 dq10Var : listC) {
                            arrayList.add(new rye(dq10Var.getPlayerId(), dq10Var.getNickname()));
                        }
                        eVar = new qye.e(roundId, listF, arrayList, dVar.getPlayerId(), dVar.getHits(), dVar.getTotalPrizePool(), dVar.getRoundEndSeconds());
                    }
                    cVar = eVar;
                }
                c0864a.b = 1;
                if (this.a.emit(cVar, c0864a) == y5bVar) {
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

    public mav(a390 a390Var, nav navVar) {
        this.a = a390Var;
        this.b = navVar;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super qye> myhVar, v1b v1bVar) {
        Object objCollect = this.a.collect(new a(myhVar, this.b), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
