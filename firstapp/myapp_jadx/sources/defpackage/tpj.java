package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class tpj implements lyh<pye> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ upj b;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ upj b;

        /* JADX INFO: renamed from: tpj$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.piggybash.data.repository.gameplay.GameplayRepository$special$$inlined$map$1$2", f = "GameplayRepository.kt", l = {50}, m = "emit", v = 1)
        public static final class C1143a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1143a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(myh myhVar, upj upjVar) {
            this.a = myhVar;
            this.b = upjVar;
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
            C1143a c1143a;
            Object gVar;
            up10 up10Var;
            String str;
            up10 up10Var2;
            String str2;
            T next;
            Object obj2;
            T next2;
            Object lVar;
            if (v1bVar instanceof C1143a) {
                c1143a = (C1143a) v1bVar;
                int i = c1143a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1143a.b = i - Integer.MIN_VALUE;
                } else {
                    c1143a = new C1143a(v1bVar);
                }
            } else {
                c1143a = new C1143a(v1bVar);
            }
            Object obj3 = c1143a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1143a.b;
            Object obj4 = null;
            if (i2 == 0) {
                uj50.b(obj3);
                npj npjVar = (npj) obj;
                upj upjVar = this.b;
                String countryCurrency = upjVar.b.getCountryCurrency();
                String str3 = "";
                String str4 = countryCurrency == null ? "" : countryCurrency;
                npjVar.getClass();
                if (npjVar instanceof npj.j) {
                    lVar = new pye.h(((npj.j) npjVar).getSecondsLeft());
                } else if (npjVar instanceof npj.b) {
                    npj.b bVar = (npj.b) npjVar;
                    lVar = new pye.a(bVar.getPlayerId(), bVar.getEmoji());
                } else if (npjVar instanceof npj.h) {
                    lVar = pye.f.a;
                } else if (npjVar instanceof npj.g) {
                    npj.g gVar2 = (npj.g) npjVar;
                    lVar = new pye.e(gVar2.getPlayerId(), gVar2.getActivePlayers());
                } else if (npjVar instanceof npj.n) {
                    lVar = new pye.j(str4, ((npj.n) npjVar).getPrizePoolAmount());
                } else if (npjVar instanceof npj.c) {
                    npj.c cVar = (npj.c) npjVar;
                    lVar = new pye.b(cVar.getHitsLeft(), cVar.getPlayerId(), cVar.getTotalHits());
                } else if (npjVar instanceof npj.e) {
                    npj.e eVar = (npj.e) npjVar;
                    lVar = new pye.d(eVar.getWinnerPlayerId(), eVar.getRewardAmount(), str4);
                } else if (npjVar instanceof npj.d) {
                    lVar = pye.c.a;
                } else if (npjVar instanceof npj.p) {
                    lVar = new pye.l(((npj.p) npjVar).getSecondsLeft());
                } else {
                    if (npjVar instanceof npj.o) {
                        npj.o oVar = (npj.o) npjVar;
                        boolean zG = Intrinsics.g(oVar.getStatus(), "ACTIVE");
                        int totalHits = oVar.getTotalHits();
                        List<npj.f> listA = oVar.a();
                        int iA = jpu.a(l48.r(listA, 10));
                        if (iA < 16) {
                            iA = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                        for (npj.f fVar : listA) {
                            linkedHashMap.put(Long.valueOf(fVar.getPlayerId()), Integer.valueOf(fVar.getLeftHits()));
                        }
                        gVar = new pye.k(zG, totalHits, linkedHashMap);
                    } else if (npjVar instanceof npj.l) {
                        npj.l lVar2 = (npj.l) npjVar;
                        String reason = lVar2.getReason();
                        Iterator<T> it = my50.d.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it.next();
                        } while (!((my50) next).a.equals(reason));
                        my50 my50Var = next;
                        if (my50Var == null) {
                            my50Var = my50.UNKNOWN;
                        }
                        List<npj.i> listA2 = lVar2.a();
                        ArrayList arrayList = new ArrayList(l48.r(listA2, 10));
                        for (npj.i iVar : listA2) {
                            long playerId = iVar.getPlayerId();
                            double paymentAmount = iVar.getPaymentAmount();
                            String type = iVar.getType();
                            Iterator<T> it2 = cs50.i.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj2 = obj4;
                                    next2 = (T) obj2;
                                    break;
                                }
                                next2 = it2.next();
                                obj2 = obj4;
                                if (((cs50) next2).a.equals(type)) {
                                    break;
                                }
                                obj4 = obj2;
                            }
                            cs50 cs50Var = next2;
                            if (cs50Var == null) {
                                cs50Var = cs50.UNKNOWN;
                            }
                            arrayList.add(new sye(playerId, paymentAmount, cs50Var, str4));
                            obj4 = obj2;
                        }
                        gVar = new pye.i(my50Var, arrayList);
                    } else if (npjVar instanceof npj.k) {
                        npj.k kVar = (npj.k) npjVar;
                        Long winnerId = kVar.getWinnerId();
                        if (winnerId != null) {
                            long jLongValue = winnerId.longValue();
                            mpj mpjVar = upjVar.c;
                            if (mpjVar != null && (up10Var2 = mpjVar.e.get(Long.valueOf(jLongValue))) != null && (str2 = up10Var2.a) != null) {
                                str3 = str2;
                            }
                        } else {
                            str3 = null;
                        }
                        Long winnerId2 = kVar.getWinnerId();
                        Double dValueOf = (winnerId2 != null && winnerId2.longValue() == kVar.getPlayerId()) ? null : Double.valueOf(kVar.getMajorAmount());
                        ArrayList arrayList2 = new ArrayList();
                        if (kVar.getGoldenRainAmount() != 0.0d) {
                            arrayList2.add(new sye(kVar.getPlayerId(), kVar.getGoldenRainAmount(), cs50.GOLDEN_RAIN, str4));
                        }
                        if (kVar.getMinorAmount() != 0.0d) {
                            arrayList2.add(new sye(kVar.getPlayerId(), kVar.getMinorAmount(), cs50.MINOR_WIN, str4));
                        }
                        Long winnerId3 = kVar.getWinnerId();
                        long playerId2 = kVar.getPlayerId();
                        if (winnerId3 != null && winnerId3.longValue() == playerId2 && kVar.getMajorAmount() != 0.0d) {
                            arrayList2.add(new sye(kVar.getPlayerId(), kVar.getMajorAmount(), cs50.MAJOR_WIN, str4));
                        }
                        Unit unit = Unit.a;
                        gVar = new pye.g(true, str3, dValueOf, arrayList2);
                    } else {
                        if (!(npjVar instanceof npj.m)) {
                            uhc.a();
                            return null;
                        }
                        npj.m mVar = (npj.m) npjVar;
                        Long winnerId4 = mVar.getWinnerId();
                        if (winnerId4 != null) {
                            long jLongValue2 = winnerId4.longValue();
                            mpj mpjVar2 = upjVar.c;
                            if (mpjVar2 != null && (up10Var = mpjVar2.e.get(Long.valueOf(jLongValue2))) != null && (str = up10Var.a) != null) {
                                str3 = str;
                            }
                        } else {
                            str3 = null;
                        }
                        Long winnerId5 = mVar.getWinnerId();
                        Double dValueOf2 = (winnerId5 != null && winnerId5.longValue() == mVar.getPlayerId()) ? null : Double.valueOf(mVar.getMajorAmount());
                        ArrayList arrayList3 = new ArrayList();
                        if (mVar.getGoldenRainAmount() != 0.0d) {
                            arrayList3.add(new sye(mVar.getPlayerId(), mVar.getGoldenRainAmount(), cs50.GOLDEN_RAIN, str4));
                        }
                        if (mVar.getMinorAmount() != 0.0d) {
                            arrayList3.add(new sye(mVar.getPlayerId(), mVar.getMinorAmount(), cs50.MINOR_WIN, str4));
                        }
                        Long winnerId6 = mVar.getWinnerId();
                        long playerId3 = mVar.getPlayerId();
                        if (winnerId6 != null && winnerId6.longValue() == playerId3 && mVar.getMajorAmount() != 0.0d) {
                            arrayList3.add(new sye(mVar.getPlayerId(), mVar.getMajorAmount(), cs50.MAJOR_WIN, str4));
                        }
                        Unit unit2 = Unit.a;
                        gVar = new pye.g(false, str3, dValueOf2, arrayList3);
                    }
                    lVar = gVar;
                }
                c1143a.b = 1;
                if (this.a.emit(lVar, c1143a) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj3);
            }
            return Unit.a;
        }
    }

    public tpj(a390 a390Var, upj upjVar) {
        this.a = a390Var;
        this.b = upjVar;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super pye> myhVar, v1b v1bVar) {
        Object objCollect = this.a.collect(new a(myhVar, this.b), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
