package defpackage;

import com.sporty.android.core.model.instantwin.BuildAndGoTabConfig;
import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.newtork.model.response.Sports;
import com.sportybet.plugin.realsports.data.FeaturedDisplayData;
import com.sportybet.plugin.realsports.data.FeaturedMatchData;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$1", f = "HomeViewModel.kt", l = {383}, m = "invokeSuspend", v = 2)
public final class zhm extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ iim b;

    @c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$1$1", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<lk50<? extends FeaturedMatchData>, lk50<? extends Boolean>, v1b<? super Pair<? extends lk50<? extends FeaturedMatchData>, ? extends lk50<? extends Boolean>>>, Object> {
        public /* synthetic */ lk50 a;
        public /* synthetic */ lk50 b;

        @Override // defpackage.gaj
        public final Object invoke(lk50<? extends FeaturedMatchData> lk50Var, lk50<? extends Boolean> lk50Var2, v1b<? super Pair<? extends lk50<? extends FeaturedMatchData>, ? extends lk50<? extends Boolean>>> v1bVar) {
            a aVar = new a(3, v1bVar);
            aVar.a = lk50Var;
            aVar.b = lk50Var2;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50 lk50Var = this.a;
            lk50 lk50Var2 = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new Pair(lk50Var, lk50Var2);
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$1$2", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements kaj<Pair<? extends lk50<? extends FeaturedMatchData>, ? extends lk50<? extends Boolean>>, lk50<? extends Sports>, lk50<? extends Round>, lk50<? extends BuildAndGoTabConfig>, q7q, v1b<? super FeaturedDisplayData>, Object> {
        public /* synthetic */ Pair a;
        public /* synthetic */ lk50 b;
        public /* synthetic */ lk50 c;
        public /* synthetic */ lk50 d;
        public /* synthetic */ q7q e;
        public final /* synthetic */ iim f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(iim iimVar, v1b<? super b> v1bVar) {
            super(6, v1bVar);
            this.f = iimVar;
        }

        @Override // defpackage.kaj
        public final Object f(Pair<? extends lk50<? extends FeaturedMatchData>, ? extends lk50<? extends Boolean>> pair, lk50<? extends Sports> lk50Var, lk50<? extends Round> lk50Var2, lk50<? extends BuildAndGoTabConfig> lk50Var3, q7q q7qVar, v1b<? super FeaturedDisplayData> v1bVar) {
            b bVar = new b(this.f, v1bVar);
            bVar.a = pair;
            bVar.b = lk50Var;
            bVar.c = lk50Var2;
            bVar.d = lk50Var3;
            bVar.e = q7qVar;
            return bVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0061  */
        /* JADX WARN: Code duplicated, block: B:23:0x007a  */
        /* JADX WARN: Code duplicated, block: B:26:0x008f  */
        /* JADX WARN: Code duplicated, block: B:27:0x0092  */
        /* JADX WARN: Code duplicated, block: B:29:0x0095  */
        /* JADX WARN: Code duplicated, block: B:30:0x009a  */
        /* JADX WARN: Code duplicated, block: B:64:0x0100  */
        /* JADX WARN: Code duplicated, block: B:80:0x0132  */
        /* JADX WARN: Code duplicated, block: B:84:0x013b  */
        /* JADX WARN: Code duplicated, block: B:86:0x0141  */
        /* JADX WARN: Code duplicated, block: B:88:0x0145  */
        /* JADX WARN: Code duplicated, block: B:89:0x014a  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            vgh vghVar;
            lk50.c cVar;
            BuildAndGoTabConfig buildAndGoTabConfig;
            boolean z;
            boolean z2;
            List<String> userIdSuffixes;
            boolean zEquals;
            int length;
            List<String> exactUserIds;
            Sports sports;
            Pair pair = this.a;
            lk50 lk50Var = this.b;
            lk50 lk50Var2 = this.c;
            lk50 lk50Var3 = this.d;
            q7q q7qVar = this.e;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            lk50 lk50Var4 = (lk50) pair.a;
            lk50 lk50Var5 = (lk50) pair.b;
            List listK = kotlin.collections.b.k(lk50Var4, lk50Var5, lk50Var, lk50Var2, lk50Var3);
            q7q.b bVar = null;
            if (listK == null || !listK.isEmpty()) {
                Iterator it = listK.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.g((lk50) it.next(), lk50.b.a)) {
                    }
                }
                if (!Intrinsics.g(q7qVar, q7q.c.a)) {
                    if ((lk50Var instanceof lk50.c) || (sports = (Sports) ((lk50.c) lk50Var).a) == null || !sports.getActive()) {
                        vghVar = new vgh(lk50Var, new lk50.a(new Throwable("Sports config failed or inactive")));
                    } else {
                        vghVar = new vgh(lk50Var, lk50Var2);
                    }
                    if (lk50Var3 instanceof lk50.c) {
                        cVar = (lk50.c) lk50Var3;
                    } else {
                        cVar = null;
                    }
                    if (cVar != null) {
                        buildAndGoTabConfig = (BuildAndGoTabConfig) cVar.a;
                    } else {
                        buildAndGoTabConfig = null;
                    }
                    String userId = this.f.d.getUserId();
                    if (buildAndGoTabConfig != null || !buildAndGoTabConfig.getEnableVirtualsAsFirstTab() || userId == null || userId.length() == 0) {
                        z = false;
                    } else {
                        BuildAndGoTabConfig.UserFilter userFilter = buildAndGoTabConfig.getUserFilter();
                        boolean z3 = (userFilter == null || (exactUserIds = userFilter.getExactUserIds()) == null || !exactUserIds.contains(userId)) ? false : true;
                        BuildAndGoTabConfig.UserFilter userFilter2 = buildAndGoTabConfig.getUserFilter();
                        if (userFilter2 != null && (userIdSuffixes = userFilter2.getUserIdSuffixes()) != null && !userIdSuffixes.isEmpty()) {
                            Iterator<T> it2 = userIdSuffixes.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z2 = false;
                                    break;
                                }
                                String str = (String) it2.next();
                                if (str == null || str.length() == 0 || userId.length() < (length = str.length())) {
                                    zEquals = false;
                                } else {
                                    String strL = wae0.L(length, userId);
                                    Integer intOrNull = StringsKt.toIntOrNull(str);
                                    Integer intOrNull2 = StringsKt.toIntOrNull(strL);
                                    if (intOrNull == null || intOrNull2 == null) {
                                        zEquals = strL.equals(str);
                                    } else if (intOrNull2.intValue() <= intOrNull.intValue()) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                }
                                if (zEquals) {
                                    z2 = true;
                                    break;
                                }
                            }
                        } else {
                            z2 = false;
                            break;
                        }
                        if (buildAndGoTabConfig.isFullRollout() || z3 || z2) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    if (q7qVar instanceof q7q.b) {
                        bVar = (q7q.b) q7qVar;
                    } else if (q7qVar instanceof q7q.d) {
                        bVar = ((q7q.d) q7qVar).a;
                    } else if (!Intrinsics.g(q7qVar, q7q.a.a) && !Intrinsics.g(q7qVar, q7q.c.a)) {
                        uhc.a();
                        return null;
                    }
                    return new FeaturedDisplayData(lk50Var4, lk50Var5, vghVar, z, bVar);
                }
            } else if (!Intrinsics.g(q7qVar, q7q.c.a)) {
                if (lk50Var instanceof lk50.c) {
                    vghVar = new vgh(lk50Var, new lk50.a(new Throwable("Sports config failed or inactive")));
                } else {
                    vghVar = new vgh(lk50Var, new lk50.a(new Throwable("Sports config failed or inactive")));
                }
                if (lk50Var3 instanceof lk50.c) {
                    cVar = (lk50.c) lk50Var3;
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    buildAndGoTabConfig = (BuildAndGoTabConfig) cVar.a;
                } else {
                    buildAndGoTabConfig = null;
                }
                String userId2 = this.f.d.getUserId();
                if (buildAndGoTabConfig != null) {
                    z = false;
                } else {
                    z = false;
                }
                if (q7qVar instanceof q7q.b) {
                    bVar = (q7q.b) q7qVar;
                } else if (q7qVar instanceof q7q.d) {
                    bVar = ((q7q.d) q7qVar).a;
                } else if (!Intrinsics.g(q7qVar, q7q.a.a)) {
                    uhc.a();
                    return null;
                }
                return new FeaturedDisplayData(lk50Var4, lk50Var5, vghVar, z, bVar);
            }
            return null;
        }
    }

    public static final class c<T> implements myh {
        public final /* synthetic */ iim a;

        public c(iim iimVar) {
            this.a = iimVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object value;
            FeaturedDisplayData featuredDisplayData = (FeaturedDisplayData) obj;
            wwd0 wwd0Var = this.a.m0;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, featuredDisplayData));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhm(iim iimVar, v1b<? super zhm> v1bVar) {
        super(2, v1bVar);
        this.b = iimVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new zhm(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((zhm) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        iim iimVar = this.b;
        je5 je5Var = iimVar.J;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            m1i m1iVarC = r1i.c(new n1i(iimVar.k0, iimVar.l0, new a(3, null)), je5Var.q(), je5Var.w(), je5Var.s1(), iimVar.Q0, new b(iimVar, null));
            c cVar = new c(iimVar);
            this.a = 1;
            if (m1iVarC.collect(cVar, this) == y5bVar) {
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
