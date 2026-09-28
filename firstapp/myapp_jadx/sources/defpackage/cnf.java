package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.gp.tz.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cnf implements lyh<uf00<? extends vpf>> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ enf b;

    @c0d(c = "com.sportybet.android.editbet.presentation.viewmodel.EditBetHistoryPopupViewModel$getEditBetHistoryList$$inlined$map$1", f = "EditBetHistoryPopupViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return cnf.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ enf b;

        @c0d(c = "com.sportybet.android.editbet.presentation.viewmodel.EditBetHistoryPopupViewModel$getEditBetHistoryList$$inlined$map$1$2", f = "EditBetHistoryPopupViewModel.kt", l = {50}, m = "emit", v = 2)
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

        public b(myh myhVar, enf enfVar) {
            this.a = myhVar;
            this.b = enfVar;
        }

        /* JADX WARN: Code duplicated, block: B:101:0x018a  */
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
        public final Object emit(Object obj, v1b v1bVar) throws Throwable {
            a aVar;
            Object obj2;
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
            Object obj3 = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            Throwable th = null;
            if (i2 == 0) {
                uj50.b(obj3);
                List list = (List) n52.b((BaseResponse) obj);
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                int i3 = 0;
                while (true) {
                    boolean zHasNext = it.hasNext();
                    String str = "";
                    enf enfVar = this.b;
                    if (!zHasNext) {
                        Throwable th2 = th;
                        uf00<? extends vpf> uf00VarF = a4h.f(l48.s(arrayList));
                        enfVar.c = uf00VarF;
                        if (uf00VarF == null) {
                            Intrinsics.n("betHistoryDisplayList");
                            throw th2;
                        }
                        vpf vpfVar = (vpf) CollectionsKt.firstOrNull(uf00VarF);
                        Object objA = vpfVar != null ? vpfVar.a() : th2;
                        uf00<vpf> uf00VarX1 = enfVar.x1(objA != null ? objA : "", false);
                        aVar.b = 1;
                        if (this.a.emit(uf00VarX1, aVar) != y5bVar) {
                            break;
                        }
                        return y5bVar;
                    }
                    T next = it.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        Throwable th3 = th;
                        kotlin.collections.b.q();
                        throw th3;
                    }
                    nof.a aVar2 = (nof.a) CollectionsKt.firstOrNull(((nof) next).a());
                    if (aVar2 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        int i5 = i3 == 0 ? R.string.common_functions__current_bet : i3 == list.size() - 1 ? R.string.common_functions__original_bet : R.string.common_functions__edit_bet;
                        String str2 = aVar2.getCom.sporty.android.core.model.tracking.AnalyticsParam.EVENT_PARAM_ID java.lang.String();
                        String str3 = str2 == null ? "" : str2;
                        Long createTime = aVar2.getCreateTime();
                        Object obj4 = createTime != null ? ((SimpleDateFormat) enfVar.b.getValue()).format(Long.valueOf(createTime.longValue())) : th;
                        String str4 = obj4 == null ? "" : obj4;
                        String originStake = aVar2.getOriginStake();
                        String str5 = originStake == null ? "" : originStake;
                        List<nof.b> listE = aVar2.e();
                        arrayList2.add(new vpf.d(listE != null ? listE.size() : 0, i5, 224, str3, str4, str5));
                        List<nof.b> listE2 = aVar2.e();
                        if (listE2 != null) {
                            for (nof.b bVar : listE2) {
                                String str6 = aVar2.getCom.sporty.android.core.model.tracking.AnalyticsParam.EVENT_PARAM_ID java.lang.String();
                                String str7 = str6 == null ? "" : str6;
                                String str8 = bVar.getCom.sporty.android.core.model.tracking.AnalyticsParam.EVENT_PARAM_ID java.lang.String();
                                String str9 = str8 == null ? "" : str8;
                                String sportId = bVar.getSportId();
                                String str10 = sportId == null ? "" : sportId;
                                String outcomeDesc = bVar.getOutcomeDesc();
                                String str11 = outcomeDesc == null ? "" : outcomeDesc;
                                String odds = bVar.getOdds();
                                String str12 = odds == null ? "" : odds;
                                String marketDesc = bVar.getMarketDesc();
                                String str13 = marketDesc == null ? "" : marketDesc;
                                String home = bVar.getHome();
                                String str14 = home == null ? "" : home;
                                String away = bVar.getAway();
                                String str15 = away == null ? "" : away;
                                String str16 = bVar.getCom.sporty.android.core.model.tracking.AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID java.lang.String();
                                String str17 = str16 == null ? "" : str16;
                                String tournamentName = bVar.getTournamentName();
                                arrayList2.add(new vpf.a(str7, str9, str10, str11, str12, tournamentName == null ? "" : tournamentName, str17, str13, str14, str15));
                            }
                            if (listE2.size() > 3) {
                                String str18 = aVar2.getCom.sporty.android.core.model.tracking.AnalyticsParam.EVENT_PARAM_ID java.lang.String();
                                arrayList2.add(new vpf.b(str18 == null ? "" : str18, listE2.size() - 3));
                            }
                        }
                        String str19 = aVar2.getCom.sporty.android.core.model.tracking.AnalyticsParam.EVENT_PARAM_ID java.lang.String();
                        String str20 = str;
                        if (str19 != null) {
                            str20 = str19;
                        }
                        String originStake2 = aVar2.getOriginStake();
                        if (originStake2 == null) {
                            originStake2 = "0";
                        }
                        String potentialWinnings = aVar2.getPotentialWinnings();
                        arrayList2.add(new vpf.c(str20, originStake2, potentialWinnings != null ? potentialWinnings : "0"));
                        obj2 = arrayList2;
                    } else {
                        th = th;
                        obj2 = th;
                    }
                    if (obj2 != null) {
                        arrayList.add(obj2);
                    }
                    th = th;
                    i3 = i4;
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

    public cnf(lyh lyhVar, enf enfVar) {
        this.a = lyhVar;
        this.b = enfVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super uf00<? extends vpf>> myhVar, v1b v1bVar) {
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
