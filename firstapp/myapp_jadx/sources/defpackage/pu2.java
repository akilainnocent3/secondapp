package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.recyclerview.widget.r;
import com.google.gson.reflect.TypeToken;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import com.sportybet.ntespm.socket.GroupTopic;
import com.sportybet.ntespm.socket.SocketPushManager;
import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.ntespm.socket.Topic;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.betslip.widget.QuickBetView;
import com.sportybet.plugin.realsports.data.BoreDrawConfig;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.EarlyPayoutMarket;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.FeaturesWithoutMarketStatus;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.PreCannedBBOutcome;
import com.sportybet.plugin.realsports.data.SelectionFeatures;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.data.sim.SimShareData;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class pu2 implements jrm {
    public boolean A;
    public boolean B;
    public boolean C;
    public String D;
    public final j1b E;
    public final b390 F;
    public jvd0 G;
    public boolean H;
    public boolean I;
    public boolean J;
    public BoreDrawConfig K;
    public boolean L;
    public boolean M;
    public j8s N;
    public boolean O;
    public final lyh<Integer> P;
    public final m730<lrm> a;
    public final m730<krm> b;
    public final t880 c;
    public final hrd0 d;
    public final hv2 e;
    public final mpe0 f;
    public final mpe0 g;
    public final mpe0 h;
    public final ArrayList i;
    public final ArrayList j;
    public final ArrayList k;
    public final ArrayList l;
    public final ArrayList m;
    public final LinkedHashMap n;
    public ArrayList o;
    public final LinkedHashSet p;
    public final LinkedHashMap q;
    public final LinkedHashMap r;
    public final LinkedHashMap s;
    public final LinkedHashMap t;
    public final LinkedHashMap u;
    public final LinkedHashSet v;
    public k53 w;
    public boolean x;
    public boolean y;
    public boolean z;

    @c0d(c = "com.sportybet.plugin.realsports.domain.betitem.BetItemImpl$1$1", f = "BetItemImpl.kt", l = {199, 199, r.d.DEFAULT_DRAG_ANIMATION_DURATION}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super Unit>, v1b<? super Unit>, Object> {
        public pu2 a;
        public int b;
        public /* synthetic */ Object c;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = pu2.this.new a(v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super Unit> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L20;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.c
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r7.b
                r3 = 0
                r4 = 3
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L28
                if (r2 == r6) goto L22
                if (r2 == r5) goto L1e
                if (r2 != r4) goto L18
                defpackage.uj50.b(r8)
                goto L56
            L18:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r3
            L1e:
                defpackage.uj50.b(r8)
                goto L49
            L22:
                pu2 r2 = r7.a
                defpackage.uj50.b(r8)
                goto L3a
            L28:
                defpackage.uj50.b(r8)
                r7.c = r0
                pu2 r2 = defpackage.pu2.this
                r7.a = r2
                r7.b = r6
                java.lang.Object r8 = r2.T1(r7)
                if (r8 != r1) goto L3a
                goto L55
            L3a:
                java.lang.String r8 = (java.lang.String) r8
                r7.c = r0
                r7.a = r3
                r7.b = r5
                java.lang.Object r8 = r2.k2(r8, r7)
                if (r8 != r1) goto L49
                goto L55
            L49:
                kotlin.Unit r8 = kotlin.Unit.a
                r7.c = r3
                r7.b = r4
                java.lang.Object r7 = r0.emit(r8, r7)
                if (r7 != r1) goto L56
            L55:
                return r1
            L56:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: pu2.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.domain.betitem.BetItemImpl$2", f = "BetItemImpl.kt", l = {206, 207, 208}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return pu2.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
        
            if (r5.d2(r6) == r0) goto L20;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r6.a
                r2 = 3
                r3 = 2
                r4 = 1
                pu2 r5 = defpackage.pu2.this
                if (r1 == 0) goto L24
                if (r1 == r4) goto L20
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L15
                defpackage.uj50.b(r7)
                goto L42
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                r6 = 0
                return r6
            L1c:
                defpackage.uj50.b(r7)
                goto L39
            L20:
                defpackage.uj50.b(r7)
                goto L30
            L24:
                defpackage.uj50.b(r7)
                r6.a = r4
                java.lang.Object r7 = r5.e2(r6)
                if (r7 != r0) goto L30
                goto L41
            L30:
                r6.a = r3
                java.lang.Object r7 = r5.c2(r6)
                if (r7 != r0) goto L39
                goto L41
            L39:
                r6.a = r2
                java.lang.Object r6 = r5.d2(r6)
                if (r6 != r0) goto L42
            L41:
                return r0
            L42:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: pu2.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.domain.betitem.BetItemImpl$selectionCountChanges$1", f = "BetItemImpl.kt", l = {191}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<ez20<? super Integer>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = pu2.this.new c(v1bVar);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ez20<? super Integer> ez20Var, v1b<? super Unit> v1bVar) {
            return ((c) create(ez20Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v1, types: [iu2$a, zu2] */
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
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            final ez20 ez20Var = (ez20) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                final pu2 pu2Var = pu2.this;
                final ?? r8 = new iu2.a() { // from class: zu2
                    @Override // iu2.a
                    public final void C() {
                        ez20Var.c(Integer.valueOf(pu2Var.U().size()));
                    }
                };
                pu2Var.m1(r8);
                ez20Var.c(new Integer(pu2Var.U().size()));
                Function0 function0 = new Function0() { // from class: av2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        pu2Var.j1(r8);
                        return Unit.a;
                    }
                };
                this.b = null;
                this.a = 1;
                if (az20.a(ez20Var, function0, this) == y5bVar) {
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

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"pu2$d", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/sportybet/plugin/realsports/data/SelectionFeatures;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class d extends TypeToken<List<? extends SelectionFeatures>> {
    }

    @c0d(c = "com.sportybet.plugin.realsports.domain.betitem.BetItemImpl$setCurrentMode$1", f = "BetItemImpl.kt", l = {1210}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ k53 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(k53 k53Var, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.c = k53Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return pu2.this.new e(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                hv2 hv2Var = pu2.this.e;
                int i2 = this.c.a;
                this.a = 1;
                if (hv2Var.h(i2, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.plugin.realsports.domain.betitem.BetItemImpl$special$$inlined$flatMapLatest$1", f = "BetItemImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements gaj<myh<? super Unit>, Unit, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object c;

        public f(v1b v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super Unit> myhVar, Unit unit, v1b<? super Unit> v1bVar) {
            f fVar = pu2.this.new f(v1bVar);
            fVar.b = myhVar;
            fVar.c = unit;
            return fVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                or60 or60Var = new or60(pu2.this.new a(null));
                pfd pfdVar = fse.a;
                lyh lyhVarC = ozh.c(or60Var, odd.b);
                this.b = null;
                this.c = null;
                this.a = 1;
                if (kzh.c(myhVar, lyhVarC, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.plugin.realsports.domain.betitem.BetItemImpl$triggerKeepBetItemFlow$1", f = "BetItemImpl.kt", l = {215}, m = "invokeSuspend", v = 2)
    public static final class g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public g(v1b<? super g> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return pu2.this.new g(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                b390 b390Var = pu2.this.F;
                Unit unit = Unit.a;
                this.a = 1;
                if (b390Var.emit(unit, this) == y5bVar) {
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

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"pu2$h", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/sportybet/plugin/realsports/betslip/Selection;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class h extends TypeToken<List<? extends Selection>> {
    }

    public pu2(m730<lrm> m730Var, m730<krm> m730Var2, t880 t880Var, hrd0 hrd0Var, hv2 hv2Var) {
        m730Var.getClass();
        m730Var2.getClass();
        t880Var.getClass();
        hrd0Var.getClass();
        hv2Var.getClass();
        this.a = m730Var;
        this.b = m730Var2;
        this.c = t880Var;
        this.d = hrd0Var;
        this.e = hv2Var;
        this.f = hwr.b(new ju2(0));
        this.g = hwr.b(new ku2());
        this.h = hwr.b(new lu2());
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new LinkedHashMap();
        this.o = new ArrayList();
        this.p = new LinkedHashSet();
        this.q = new LinkedHashMap();
        this.r = new LinkedHashMap();
        this.s = new LinkedHashMap();
        this.t = new LinkedHashMap();
        this.u = new LinkedHashMap();
        this.v = new LinkedHashSet();
        this.w = k53.REAL;
        this.C = true;
        this.D = "";
        pfd pfdVar = fse.a;
        j1b j1bVarA = w5b.a(gku.a);
        this.E = j1bVarA;
        b390 b390VarB = d390.b(0, 1, pb5.b, 1);
        this.F = b390VarB;
        this.K = new BoreDrawConfig(m2g.a);
        this.P = uzh.b(hzh.a(new c(null)));
        b77 b77VarF = r0i.f(szh.a(b390VarB, 500L), new f(null));
        zu7.a aVar = zu7.a;
        kzh.d(b77VarF, zu7.a());
        if (hv2Var != q1g.a) {
            ej5.c(j1bVarA, null, null, new b(null), 3);
        }
    }

    public static void R1(Selection selection, LinkedHashSet linkedHashSet) {
        List<Selection> list;
        String strH = selection.h();
        strH.getClass();
        linkedHashSet.add(strH);
        if (!selection.p() || (list = selection.d) == null) {
            return;
        }
        for (Selection selection2 : list) {
            selection2.getClass();
            R1(selection2, linkedHashSet);
        }
    }

    public static void S1(String str, Selection selection, LinkedHashSet linkedHashSet) {
        List<Selection> list;
        if (Intrinsics.g(selection.h(), str)) {
            linkedHashSet.add(selection);
        }
        if (!selection.p() || (list = selection.d) == null) {
            return;
        }
        for (Selection selection2 : list) {
            selection2.getClass();
            S1(str, selection2, linkedHashSet);
        }
    }

    public static LinkedHashSet W1(List list) {
        Selection selectionE;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Selection selection = (Selection) it.next();
            linkedHashSet.add(new GroupTopic(selection.e()));
            linkedHashSet.add(new GroupTopic(selection.g()));
            if (selection.p()) {
                List<Selection> list2 = selection.d;
                list2.getClass();
                for (Selection selection2 : list2) {
                    linkedHashSet.add(new GroupTopic(selection2.e()));
                    linkedHashSet.add(new GroupTopic(selection2.g()));
                }
            }
            if (qvy.d(selection) && (selectionE = qvy.e(selection)) != null) {
                linkedHashSet.add(new GroupTopic(selectionE.e()));
            }
        }
        return linkedHashSet;
    }

    public static boolean X1(Selection selection, boolean z) {
        if (u7u.g(selection)) {
            return true;
        }
        return z && rlc.d(selection);
    }

    public static List h2(Subscriber subscriber, List list, List list2, boolean z, Function0 function0) {
        SocketPushManager socketPushManager = SocketPushManager.getInstance();
        LinkedHashSet<GroupTopic> linkedHashSetW1 = W1(list);
        Set<Topic> subscribedTopics = socketPushManager.getSubscribedTopics(subscriber);
        subscribedTopics.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : subscribedTopics) {
            if (obj instanceof GroupTopic) {
                arrayList.add(obj);
            }
        }
        for (GroupTopic groupTopic : yi80.d(yi80.e(CollectionsKt.E0(arrayList), CollectionsKt.E0(list2)), linkedHashSetW1)) {
            if (!((Boolean) function0.invoke()).booleanValue()) {
                return null;
            }
            socketPushManager.unsubscribeTopic(groupTopic, subscriber);
        }
        for (GroupTopic groupTopic2 : linkedHashSetW1) {
            if (!((Boolean) function0.invoke()).booleanValue()) {
                return null;
            }
            boolean zIsTopicSubscribed = socketPushManager.isTopicSubscribed(groupTopic2, subscriber);
            boolean z2 = z && !socketPushManager.isTopicActive(groupTopic2);
            if (!zIsTopicSubscribed || z2) {
                socketPushManager.subscribeTopic(groupTopic2, subscriber, z2);
            }
        }
        return CollectionsKt.A0(linkedHashSetW1);
    }

    @Override // defpackage.jrm
    public final void A(QuickBetView quickBetView) {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            i0(quickBetView, (Selection) obj);
        }
    }

    @Override // defpackage.jrm
    public final LinkedHashMap A0() {
        return this.s;
    }

    @Override // defpackage.jrm
    public final void A1() {
        this.t.clear();
    }

    @Override // defpackage.jrm
    public final void B() {
        LinkedHashSet<Selection> linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Selection selection = (Selection) obj;
            if (qz3.j(selection)) {
                linkedHashSet.add(selection);
            } else {
                selection.a.changeFlag = false;
                selection.c.oddsChangesFlag = 0;
            }
        }
        for (Selection selection2 : linkedHashSet) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_BET_SLIP);
            Event event = selection2.a;
            Market market = selection2.b;
            String str = market != null ? market.id : null;
            j7g j7gVar = new j7g();
            if (event != null) {
                j7gVar.f(event.eventId.replace("sr:match:", ""), -16777216, -3355444);
                if (!TextUtils.isEmpty(null)) {
                    j7gVar.a(" ");
                    throw null;
                }
                if (!TextUtils.isEmpty(event.productStatus)) {
                    j7gVar.a(" ");
                    j7gVar.f(event.productStatus, -1, -16776961);
                }
            }
            if (!TextUtils.isEmpty(str)) {
                j7gVar.a(" ");
                j7gVar.f(str, -3355444, -16777216);
            }
            if (event != null) {
                if (event.hasBetRadarStream()) {
                    j7gVar.f("BR", -1, -65536);
                }
                if (event.hasMediaLiveChannel()) {
                    j7gVar.f("ML", -16777216, -256);
                }
                if (event.hasWebViewLiveChannel()) {
                    j7gVar.f("PI", -16777216, -16711936);
                }
            }
            aVar.a("remove settled selections: %s", j7gVar);
            i1(selection2);
        }
        QuickBetView.k1 = false;
        QuickBetView.j1 = false;
        QuickBetView.q1.clear();
    }

    @Override // defpackage.jrm
    public final void B0(Subscriber subscriber) {
        subscriber.getClass();
        V0(subscriber, true);
    }

    @Override // defpackage.jrm
    public final boolean B1() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.j;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            if (qz3.b((Selection) obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                if (yay.i((Selection) obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jrm
    public final ArrayList C() {
        return this.j;
    }

    @Override // defpackage.jrm
    public final boolean C0() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.j;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            if (qz3.b((Selection) obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                if (u7u.j((Selection) obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jrm
    public final void C1(Selection selection) {
        selection.getClass();
        this.r.remove(selection);
    }

    @Override // defpackage.jrm
    public final boolean D() {
        return this.w == k53.EDIT;
    }

    @Override // defpackage.jrm
    public final String D0() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Selection selection = (Selection) obj;
            String str = selection.f;
            if (str != null && str.length() != 0) {
                String str2 = selection.f;
                str2.getClass();
                return str2;
            }
        }
        return "";
    }

    @Override // defpackage.jrm
    public final vu2 D1() {
        return new vu2(this.e.d());
    }

    @Override // defpackage.jrm
    public final boolean E() {
        return this.A;
    }

    @Override // defpackage.jrm
    public final lyh<Integer> E0() {
        return this.P;
    }

    @Override // defpackage.jrm
    public final boolean E1() {
        return this.z;
    }

    @Override // defpackage.jrm
    public final String F(int i, Context context, boolean z) {
        context.getClass();
        if (!z) {
            int i2 = nh4.c().d - i;
            return i2 > 1 ? sn5.b(context, R.string.component_betslip__select_more_extra_bonus_tip, String.valueOf(i2), yrh0.i(context, i2), nh4.c().a.toString(), bjb0.N(nh4.c().d(nh4.c().d).multiply(BigDecimal.valueOf(100L)))) : sn5.b(context, R.string.component_betslip__select_more_extra_bonus_tip, String.valueOf(i2), yrh0.i(context, i2), nh4.c().a.toString(), bjb0.N(nh4.c().d(i + 1).multiply(BigDecimal.valueOf(100L))));
        }
        if (U().size() <= Y1() - 1) {
            return sn5.b(context, R.string.component_betslip__select_more_extra_bonus_tip, "1", yrh0.i(context, 1), nh4.c().a.toString(), bjb0.N(nh4.c().d(i + 1).multiply(BigDecimal.valueOf(100L))));
        }
        return U().size() == Y1() ? sn5.b(context, R.string.component_betslip__max_extra_bonus_tip, bjb0.N(nh4.c().d(i).multiply(BigDecimal.valueOf(100L)))) : "";
    }

    @Override // defpackage.jrm
    public final Unit F0(pv3 pv3Var, sv3.a aVar) {
        SocketPushManager socketPushManager = SocketPushManager.getInstance();
        Set<Topic> subscribedTopics = socketPushManager.getSubscribedTopics(pv3Var);
        subscribedTopics.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : subscribedTopics) {
            if (obj instanceof GroupTopic) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayListC0 = CollectionsKt.C0(CollectionsKt.E0(CollectionsKt.i0(arrayList, this.o)));
        while (!arrayListC0.isEmpty() && i9p.h(aVar.getContext())) {
            socketPushManager.unsubscribeTopic((GroupTopic) arrayListC0.remove(0), pv3Var);
        }
        this.o = arrayListC0;
        return Unit.a;
    }

    @Override // defpackage.jrm
    public final boolean F1() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Selection selection = (Selection) obj;
            if (qz3.i(selection) && selection.a.changeFlag) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jrm
    public final void G(boolean z) {
        this.B = false;
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Selection selection = (Selection) obj;
            U1().H(selection.a, selection.b, selection.c, selection.d);
        }
        arrayList.clear();
        this.i.clear();
        this.p.clear();
        this.q.clear();
        this.t.clear();
        this.s.clear();
        this.k.clear();
        this.u.clear();
        this.r.clear();
        if (this.e != q1g.a) {
            ej5.c(this.E, null, null, new qu2(this, null), 3);
        }
        if (z) {
            Z1(false);
        }
        this.L = false;
        this.M = false;
    }

    @Override // defpackage.jrm
    public final boolean G0(String str) {
        str.getClass();
        ArrayList arrayList = this.k;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                SelectionFeatures selectionFeatures = (SelectionFeatures) obj;
                if (Intrinsics.g(selectionFeatures.getSelectionFeatures().getEventID(), str) && selectionFeatures.getMarketStatus() == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jrm
    public final boolean G1() {
        return this.B;
    }

    @Override // defpackage.jrm
    public final String H(Context context) {
        context.getClass();
        return U().size() == Y1() ? sn5.b(context, R.string.component_betslip__max_bonus_mask, new Object[0]) : sn5.b(context, R.string.component_betslip__add_more_qualifying_selection_to_boost_your_bonus, new Object[0]);
    }

    @Override // defpackage.jrm
    public final boolean H0() {
        return this.y;
    }

    @Override // defpackage.jrm
    public final boolean H1(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.j;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            if (qz3.b((Selection) obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                if (X1((Selection) obj2, z)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jrm
    public final boolean I() {
        ArrayList arrayList = this.j;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (yay.j((Selection) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jrm
    public final void I0(Selection selection, boolean z) {
        selection.getClass();
        this.s.put(selection, Boolean.valueOf(z));
    }

    @Override // defpackage.jrm
    public final void I1() {
        f2(k53.REAL, false);
        G(true);
    }

    @Override // defpackage.jrm
    public final g08 J() {
        ArrayList arrayListU = U();
        int size = arrayListU.size();
        g08 g08Var = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayListU.get(i);
            i++;
            Selection selection = (Selection) obj;
            if (selection.y) {
                g08Var = g08.FEATURED_BET_BUILDER;
            } else if (selection.z) {
                g08Var = g08.PRE_CANNED_BET_BUILDER;
            }
        }
        return g08Var;
    }

    @Override // defpackage.jrm
    public final void J0(boolean z) {
        this.A = z;
    }

    @Override // defpackage.jrm
    public final boolean J1() {
        String str;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayListU = U();
        if (arrayListU == null || !arrayListU.isEmpty()) {
            int size = arrayListU.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListU.get(i);
                i++;
                Event event = ((Selection) obj).a;
                if (event == null || (str = event.eventId) == null) {
                    str = "";
                }
                if (!linkedHashSet.add(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jrm
    public final void K(String str, boolean z) {
        str.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.j;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            if (Intrinsics.g(((Selection) obj).a.eventId, str)) {
                arrayList.add(obj);
            }
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            Selection selection = (Selection) obj2;
            selection.w = z;
            selection.a.changeFlag = true;
        }
    }

    @Override // defpackage.jrm
    public final k53 K0() {
        return this.w;
    }

    @Override // defpackage.jrm
    public final void K1() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Selection selection = (Selection) obj;
            selection.a.changeFlag = false;
            selection.c.oddsChangesFlag = 0;
        }
    }

    @Override // defpackage.jrm
    public final void L(Context context, Selection selection) {
        selection.getClass();
        if (context == null) {
            return;
        }
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            if (Intrinsics.g(this.i.get(i), selection)) {
                return;
            }
        }
        if (m0()) {
            k53 k53Var = k53.REAL;
            iu2 iu2Var = iu2.a;
            iu2Var.j().r0(k53Var);
            iu2Var.j().b1();
            if (((br3) mmc.a(hp0.A, br3.class)).U().I) {
                ((br3) mmc.a(hp0.A, br3.class)).U().i(oti.c().e());
            }
            zyf0.b(R.string.component_betslip__this_market_is_unavailable_in_sim_added_to_real, 0);
        }
    }

    @Override // defpackage.jrm
    public final void L0(Selection selection, boolean z) {
        selection.getClass();
        this.t.put(selection, Boolean.valueOf(z));
    }

    @Override // defpackage.jrm
    public final boolean L1() {
        ArrayList arrayListU = U();
        if (arrayListU == null || !arrayListU.isEmpty()) {
            int size = arrayListU.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListU.get(i);
                i++;
                if (g880.t((Selection) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jrm
    public final boolean M() {
        return this.x;
    }

    @Override // defpackage.jrm
    public final boolean M0() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.j;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            if (qz3.b((Selection) obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            if (!arrayList.isEmpty()) {
                int size2 = arrayList.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    Selection selection = (Selection) obj2;
                    if ((u7u.h(selection) || rlc.e(selection)) && !selection.n() && X1(selection, true)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.jrm
    public final boolean M1() {
        if (D()) {
            return iw2.a() > Y1();
        }
        return U().size() > Y1();
    }

    @Override // defpackage.jrm
    public final boolean N(Event event, Market market, Outcome outcome, k980 k980Var, List list) {
        return N0(event, market, outcome, true, (14336 & 16) != 0 ? false : false, (14336 & 32) != 0 ? null : list, (14336 & 64) != 0 ? k980.DEFAULT : k980Var, (14336 & 128) != 0 ? false : false, (14336 & 256) != 0 ? false : false, (14336 & 512) != 0 ? false : false, (14336 & 1024) != 0 ? null : null, (14336 & 2048) != 0 ? false : false, (14336 & 4096) != 0 ? false : false, false);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:109:0x0213 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x0218  */
    /* JADX WARN: Code duplicated, block: B:116:0x0226  */
    /* JADX WARN: Code duplicated, block: B:118:0x022c  */
    /* JADX WARN: Code duplicated, block: B:123:0x023a  */
    /* JADX WARN: Code duplicated, block: B:128:0x025d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0268  */
    /* JADX WARN: Code duplicated, block: B:135:0x0277  */
    /* JADX WARN: Code duplicated, block: B:146:0x0296  */
    /* JADX WARN: Code duplicated, block: B:147:0x029b  */
    /* JADX WARN: Code duplicated, block: B:150:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:151:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:154:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:155:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:157:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:158:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:162:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:163:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:213:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x01e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x01c1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0139  */
    /* JADX WARN: Code duplicated, block: B:57:0x014c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0160 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x016b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0173  */
    /* JADX WARN: Code duplicated, block: B:68:0x017b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0188 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c7  */
    @Override // defpackage.jrm
    public final boolean N0(Event event, Market market, Outcome outcome, boolean z, boolean z2, List<? extends Selection> list, k980 k980Var, boolean z3, boolean z4, boolean z5, Selection selection, boolean z6, boolean z7, boolean z8) {
        boolean z9;
        QuickBetView quickBetView;
        List listA0;
        int size;
        Selection selection2;
        int i;
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList arrayList;
        String string;
        String strH;
        Market market2;
        ArrayList arrayList2;
        QuickBetView quickBetView2;
        List list2;
        Selection selection3;
        boolean z13;
        boolean z14;
        Iterator it;
        Object next;
        Selection selection4;
        Market market3;
        if (!v(event, market, outcome)) {
            return false;
        }
        Event event2 = new Event(event);
        Market market4 = new Market(market);
        Outcome outcome2 = new Outcome(outcome);
        Selection selection5 = new Selection(event2, market4, outcome2, list, k980Var, Boolean.valueOf(z3), Boolean.valueOf(z6), Boolean.valueOf(z7), Boolean.valueOf(z8));
        boolean z15 = this.w == k53.EDIT && z;
        this.H = z;
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_EDIT_BET);
        StringBuilder sbA = z620.a("updateBetItem: ", event2.eventId + "-" + market4 + "-" + outcome2.id + ", isUndo: " + selection5.i, ", selected: ", ", checkEditBetMutex: ", z);
        sbA.append(z15);
        sbA.append(", isSocket: ");
        sbA.append(z4);
        aVar.g(sbA.toString(), new Object[0]);
        if ((!z15 || !R()) && !y1(event2)) {
            if (!z) {
                int size2 = this.j.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        z9 = false;
                        break;
                    }
                    if (selection5.equals(this.j.get(i2))) {
                        Selection selectionH = V1().H();
                        if (selectionH != null && selection5.toString().equals(selectionH.toString())) {
                            V1().i(null);
                            V1().c0(null);
                        }
                        V1().N(selection5);
                        g880.D(selection5);
                        b2(selection5);
                        if (this.j.isEmpty()) {
                            V1().clear();
                        }
                        b1();
                        Z1(false);
                        wq3 wq3VarU = ((br3) mmc.a(hp0.A, br3.class)).U();
                        wq3VarU.getClass();
                        QuickBetView quickBetView3 = wq3VarU.H;
                        if (quickBetView3 != null) {
                            quickBetView3.getBetItem().y0(quickBetView3, selection5, quickBetView3.i1);
                            QuickBetView.q1.remove(selection5);
                        }
                        z9 = true;
                        break;
                    }
                    i2++;
                }
            } else if (event == null || market == null || outcome == null) {
                listA0 = CollectionsKt.A0(this.j);
                size = this.j.size();
                selection2 = null;
                i = 0;
                z10 = false;
                z11 = false;
                z12 = false;
                while (i < size) {
                    list2 = listA0;
                    selection3 = (Selection) this.j.get(i);
                    int i3 = size;
                    selection5.f = selection3.f;
                    if (z5 || selection == null || !selection.equals(selection3)) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (selection3.equals(selection5)) {
                        if (z15) {
                            it = list2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                                selection4 = (Selection) next;
                                if (!Intrinsics.g(selection4.a.eventId, selection5.a.eventId)) {
                                }
                            }
                            if (((Selection) next) != null) {
                                itf0.a aVar2 = itf0.a;
                                aVar2.q(MyLog.TAG_EDIT_BET);
                                aVar2.n("on selected an UNDO selection which is mutex", new Object[0]);
                                return false;
                            }
                            selection3.i = false;
                            z11 = true;
                        }
                        selection5.e = selection3.e;
                        selection5.i = selection3.i;
                        selection5.y = selection3.y;
                        selection5.z = selection3.z;
                        selection5.A = selection3.A;
                        this.j.set(i, selection5);
                        if (z11) {
                            z14 = true;
                        } else {
                            z14 = true;
                        }
                        selection2 = selection3;
                        z12 = z14;
                        z10 = true;
                    } else {
                        market3 = selection5.b;
                        if ((xvy.a(market3) == null || xvy.b(market3) != null || rlc.b(selection5)) && z13 && (u7u.d(selection5, selection3) || rlc.a(selection5, selection3))) {
                            if (z15 && selection3.i && !z4) {
                                it = list2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    selection4 = (Selection) next;
                                    if (!Intrinsics.g(selection4.a.eventId, selection5.a.eventId) && !selection4.i) {
                                        break;
                                    }
                                }
                                if (((Selection) next) != null) {
                                    itf0.a aVar3 = itf0.a;
                                    aVar3.q(MyLog.TAG_EDIT_BET);
                                    aVar3.n("on selected an UNDO selection which is mutex", new Object[0]);
                                    return false;
                                }
                                selection3.i = false;
                                z11 = true;
                            }
                            selection5.e = selection3.e;
                            selection5.i = selection3.i;
                            selection5.y = selection3.y;
                            selection5.z = selection3.z;
                            selection5.A = selection3.A;
                            this.j.set(i, selection5);
                            if (z11 || z13) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            selection2 = selection3;
                            z12 = z14;
                            z10 = true;
                        } else {
                            Market market5 = selection5.b;
                            if ((akf.a(market5) != null || qvy.b(market5) != null) && z13 && (yay.c(selection5, selection3) || qvy.a(selection5, selection3))) {
                                if (z15) {
                                    it = list2.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                        selection4 = (Selection) next;
                                        if (!Intrinsics.g(selection4.a.eventId, selection5.a.eventId)) {
                                        }
                                    }
                                    if (((Selection) next) != null) {
                                        itf0.a aVar4 = itf0.a;
                                        aVar4.q(MyLog.TAG_EDIT_BET);
                                        aVar4.n("on selected an UNDO selection which is mutex", new Object[0]);
                                        return false;
                                    }
                                    selection3.i = false;
                                    z11 = true;
                                }
                                selection5.e = selection3.e;
                                selection5.i = selection3.i;
                                selection5.y = selection3.y;
                                selection5.z = selection3.z;
                                selection5.A = selection3.A;
                                this.j.set(i, selection5);
                                if (z11) {
                                    z14 = true;
                                } else {
                                    z14 = true;
                                }
                                selection2 = selection3;
                                z12 = z14;
                                z10 = true;
                            }
                        }
                    }
                    i++;
                    listA0 = list2;
                    size = i3;
                }
                if (!z10) {
                    if (!R() && !e0(selection5)) {
                        if (m0() && u1(selection5)) {
                            this.i.add(selection5);
                        }
                        this.j.add(selection5);
                        wq3 wq3VarU2 = ((br3) mmc.a(hp0.A, br3.class)).U();
                        wq3VarU2.getClass();
                        quickBetView2 = wq3VarU2.H;
                        if (quickBetView2 != null) {
                            quickBetView2.getBetItem().i0(quickBetView2, selection5);
                        }
                        if (this.C) {
                            vgb0.a(AnalyticsEvent.BET_ADD_ODDS);
                        }
                        SimShareData.INSTANCE.resetAutoBetTimes();
                        z12 = true;
                    }
                }
                if (z10 && (u7u.e(selection5) || u7u.f(selection5) || yay.e(selection5.b) != null || rlc.b(selection5))) {
                    LinkedHashSet linkedHashSet = this.p;
                    if (selection2 != null) {
                        string = selection2.toString();
                    } else {
                        string = null;
                    }
                    y8h0.a(linkedHashSet).remove(string);
                    LinkedHashMap linkedHashMap = this.q;
                    if (selection2 != null) {
                        strH = selection2.h();
                    } else {
                        strH = null;
                    }
                    y8h0.c(linkedHashMap).remove(strH);
                    krm krmVarU1 = U1();
                    if (selection2 != null) {
                        market2 = selection2.b;
                    } else {
                        market2 = null;
                    }
                    if (list != null) {
                        arrayList2 = new ArrayList(list);
                    } else {
                        arrayList2 = null;
                    }
                    krmVarU1.H(event2, market2, outcome2, arrayList2);
                }
                i2();
                this.p.add(event2.eventId + market4 + outcome2.id);
                j2(selection5);
                krm krmVarU2 = U1();
                if (list != null) {
                    arrayList = new ArrayList(list);
                } else {
                    arrayList = null;
                }
                krmVarU2.h(event2, market4, outcome2, arrayList);
                Z1(!z12);
                z9 = z12;
            } else if (outcome.isJokerOutcome()) {
                ArrayList arrayListU = U();
                if (arrayListU == null || !arrayListU.isEmpty()) {
                    int size3 = arrayListU.size();
                    int i4 = 0;
                    while (i4 < size3) {
                        Object obj = arrayListU.get(i4);
                        i4++;
                        Selection selection6 = (Selection) obj;
                        ArrayList arrayList3 = arrayListU;
                        if (!Intrinsics.g(selection6.a.eventId, event.eventId) || !Intrinsics.g(selection6.b, market)) {
                            arrayListU = arrayList3;
                        }
                    }
                    listA0 = CollectionsKt.A0(this.j);
                    size = this.j.size();
                    selection2 = null;
                    i = 0;
                    z10 = false;
                    z11 = false;
                    z12 = false;
                    while (i < size) {
                        list2 = listA0;
                        selection3 = (Selection) this.j.get(i);
                        int i5 = size;
                        selection5.f = selection3.f;
                        if (z5) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        if (selection3.equals(selection5)) {
                            market3 = selection5.b;
                            if (xvy.a(market3) == null) {
                            }
                            if (z15) {
                                it = list2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    selection4 = (Selection) next;
                                    if (!Intrinsics.g(selection4.a.eventId, selection5.a.eventId)) {
                                    }
                                }
                                if (((Selection) next) != null) {
                                    itf0.a aVar5 = itf0.a;
                                    aVar5.q(MyLog.TAG_EDIT_BET);
                                    aVar5.n("on selected an UNDO selection which is mutex", new Object[0]);
                                    return false;
                                }
                                selection3.i = false;
                                z11 = true;
                            }
                            selection5.e = selection3.e;
                            selection5.i = selection3.i;
                            selection5.y = selection3.y;
                            selection5.z = selection3.z;
                            selection5.A = selection3.A;
                            this.j.set(i, selection5);
                            if (z11) {
                                z14 = true;
                            } else {
                                z14 = true;
                            }
                            selection2 = selection3;
                            z12 = z14;
                            z10 = true;
                        } else {
                            if (z15) {
                                it = list2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    selection4 = (Selection) next;
                                    if (!Intrinsics.g(selection4.a.eventId, selection5.a.eventId)) {
                                    }
                                }
                                if (((Selection) next) != null) {
                                    itf0.a aVar6 = itf0.a;
                                    aVar6.q(MyLog.TAG_EDIT_BET);
                                    aVar6.n("on selected an UNDO selection which is mutex", new Object[0]);
                                    return false;
                                }
                                selection3.i = false;
                                z11 = true;
                            }
                            selection5.e = selection3.e;
                            selection5.i = selection3.i;
                            selection5.y = selection3.y;
                            selection5.z = selection3.z;
                            selection5.A = selection3.A;
                            this.j.set(i, selection5);
                            if (z11) {
                                z14 = true;
                            } else {
                                z14 = true;
                            }
                            selection2 = selection3;
                            z12 = z14;
                            z10 = true;
                        }
                        i++;
                        listA0 = list2;
                        size = i5;
                    }
                    if (!z10) {
                        if (!R()) {
                            if (m0()) {
                                this.i.add(selection5);
                            }
                            this.j.add(selection5);
                            wq3 wq3VarU3 = ((br3) mmc.a(hp0.A, br3.class)).U();
                            wq3VarU3.getClass();
                            quickBetView2 = wq3VarU3.H;
                            if (quickBetView2 != null) {
                                quickBetView2.getBetItem().i0(quickBetView2, selection5);
                            }
                            if (this.C) {
                                vgb0.a(AnalyticsEvent.BET_ADD_ODDS);
                            }
                            SimShareData.INSTANCE.resetAutoBetTimes();
                            z12 = true;
                        }
                    }
                    if (z10) {
                        LinkedHashSet linkedHashSet2 = this.p;
                        if (selection2 != null) {
                            string = selection2.toString();
                        } else {
                            string = null;
                        }
                        y8h0.a(linkedHashSet2).remove(string);
                        LinkedHashMap linkedHashMap2 = this.q;
                        if (selection2 != null) {
                            strH = selection2.h();
                        } else {
                            strH = null;
                        }
                        y8h0.c(linkedHashMap2).remove(strH);
                        krm krmVarU3 = U1();
                        if (selection2 != null) {
                            market2 = selection2.b;
                        } else {
                            market2 = null;
                        }
                        if (list != null) {
                            arrayList2 = new ArrayList(list);
                        } else {
                            arrayList2 = null;
                        }
                        krmVarU3.H(event2, market2, outcome2, arrayList2);
                    }
                    i2();
                    this.p.add(event2.eventId + market4 + outcome2.id);
                    j2(selection5);
                    krm krmVarU4 = U1();
                    if (list != null) {
                        arrayList = new ArrayList(list);
                    } else {
                        arrayList = null;
                    }
                    krmVarU4.h(event2, market4, outcome2, arrayList);
                    Z1(!z12);
                    z9 = z12;
                } else {
                    listA0 = CollectionsKt.A0(this.j);
                    size = this.j.size();
                    selection2 = null;
                    i = 0;
                    z10 = false;
                    z11 = false;
                    z12 = false;
                    while (i < size) {
                        list2 = listA0;
                        selection3 = (Selection) this.j.get(i);
                        int i6 = size;
                        selection5.f = selection3.f;
                        if (z5) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        if (selection3.equals(selection5)) {
                            market3 = selection5.b;
                            if (xvy.a(market3) == null) {
                            }
                            if (z15) {
                                it = list2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    selection4 = (Selection) next;
                                    if (!Intrinsics.g(selection4.a.eventId, selection5.a.eventId)) {
                                    }
                                }
                                if (((Selection) next) != null) {
                                    itf0.a aVar7 = itf0.a;
                                    aVar7.q(MyLog.TAG_EDIT_BET);
                                    aVar7.n("on selected an UNDO selection which is mutex", new Object[0]);
                                    return false;
                                }
                                selection3.i = false;
                                z11 = true;
                            }
                            selection5.e = selection3.e;
                            selection5.i = selection3.i;
                            selection5.y = selection3.y;
                            selection5.z = selection3.z;
                            selection5.A = selection3.A;
                            this.j.set(i, selection5);
                            if (z11) {
                                z14 = true;
                            } else {
                                z14 = true;
                            }
                            selection2 = selection3;
                            z12 = z14;
                            z10 = true;
                        } else {
                            if (z15) {
                                it = list2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    selection4 = (Selection) next;
                                    if (!Intrinsics.g(selection4.a.eventId, selection5.a.eventId)) {
                                    }
                                }
                                if (((Selection) next) != null) {
                                    itf0.a aVar8 = itf0.a;
                                    aVar8.q(MyLog.TAG_EDIT_BET);
                                    aVar8.n("on selected an UNDO selection which is mutex", new Object[0]);
                                    return false;
                                }
                                selection3.i = false;
                                z11 = true;
                            }
                            selection5.e = selection3.e;
                            selection5.i = selection3.i;
                            selection5.y = selection3.y;
                            selection5.z = selection3.z;
                            selection5.A = selection3.A;
                            this.j.set(i, selection5);
                            if (z11) {
                                z14 = true;
                            } else {
                                z14 = true;
                            }
                            selection2 = selection3;
                            z12 = z14;
                            z10 = true;
                        }
                        i++;
                        listA0 = list2;
                        size = i6;
                    }
                    if (!z10) {
                        if (!R()) {
                            if (m0()) {
                                this.i.add(selection5);
                            }
                            this.j.add(selection5);
                            wq3 wq3VarU4 = ((br3) mmc.a(hp0.A, br3.class)).U();
                            wq3VarU4.getClass();
                            quickBetView2 = wq3VarU4.H;
                            if (quickBetView2 != null) {
                                quickBetView2.getBetItem().i0(quickBetView2, selection5);
                            }
                            if (this.C) {
                                vgb0.a(AnalyticsEvent.BET_ADD_ODDS);
                            }
                            SimShareData.INSTANCE.resetAutoBetTimes();
                            z12 = true;
                        }
                    }
                    if (z10) {
                        LinkedHashSet linkedHashSet3 = this.p;
                        if (selection2 != null) {
                            string = selection2.toString();
                        } else {
                            string = null;
                        }
                        y8h0.a(linkedHashSet3).remove(string);
                        LinkedHashMap linkedHashMap3 = this.q;
                        if (selection2 != null) {
                            strH = selection2.h();
                        } else {
                            strH = null;
                        }
                        y8h0.c(linkedHashMap3).remove(strH);
                        krm krmVarU5 = U1();
                        if (selection2 != null) {
                            market2 = selection2.b;
                        } else {
                            market2 = null;
                        }
                        if (list != null) {
                            arrayList2 = new ArrayList(list);
                        } else {
                            arrayList2 = null;
                        }
                        krmVarU5.H(event2, market2, outcome2, arrayList2);
                    }
                    i2();
                    this.p.add(event2.eventId + market4 + outcome2.id);
                    j2(selection5);
                    krm krmVarU6 = U1();
                    if (list != null) {
                        arrayList = new ArrayList(list);
                    } else {
                        arrayList = null;
                    }
                    krmVarU6.h(event2, market4, outcome2, arrayList);
                    Z1(!z12);
                    z9 = z12;
                }
            } else {
                ArrayList arrayListU2 = U();
                if (arrayListU2 == null || !arrayListU2.isEmpty()) {
                    int size4 = arrayListU2.size();
                    int i7 = 0;
                    while (i7 < size4) {
                        Object obj2 = arrayListU2.get(i7);
                        i7++;
                        Selection selection7 = (Selection) obj2;
                        ArrayList arrayList4 = arrayListU2;
                        if (!Intrinsics.g(selection7.a.eventId, event.eventId) || !Intrinsics.g(selection7.b, market) || !selection7.c.isJokerOutcome()) {
                            arrayListU2 = arrayList4;
                        }
                    }
                    listA0 = CollectionsKt.A0(this.j);
                    size = this.j.size();
                    selection2 = null;
                    i = 0;
                    z10 = false;
                    z11 = false;
                    z12 = false;
                    while (i < size) {
                        list2 = listA0;
                        selection3 = (Selection) this.j.get(i);
                        int i8 = size;
                        selection5.f = selection3.f;
                        if (z5) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        if (selection3.equals(selection5)) {
                            market3 = selection5.b;
                            if (xvy.a(market3) == null) {
                            }
                            if (z15) {
                                it = list2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    selection4 = (Selection) next;
                                    if (!Intrinsics.g(selection4.a.eventId, selection5.a.eventId)) {
                                    }
                                }
                                if (((Selection) next) != null) {
                                    itf0.a aVar9 = itf0.a;
                                    aVar9.q(MyLog.TAG_EDIT_BET);
                                    aVar9.n("on selected an UNDO selection which is mutex", new Object[0]);
                                    return false;
                                }
                                selection3.i = false;
                                z11 = true;
                            }
                            selection5.e = selection3.e;
                            selection5.i = selection3.i;
                            selection5.y = selection3.y;
                            selection5.z = selection3.z;
                            selection5.A = selection3.A;
                            this.j.set(i, selection5);
                            if (z11) {
                                z14 = true;
                            } else {
                                z14 = true;
                            }
                            selection2 = selection3;
                            z12 = z14;
                            z10 = true;
                        } else {
                            if (z15) {
                                it = list2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    selection4 = (Selection) next;
                                    if (!Intrinsics.g(selection4.a.eventId, selection5.a.eventId)) {
                                    }
                                }
                                if (((Selection) next) != null) {
                                    itf0.a aVar10 = itf0.a;
                                    aVar10.q(MyLog.TAG_EDIT_BET);
                                    aVar10.n("on selected an UNDO selection which is mutex", new Object[0]);
                                    return false;
                                }
                                selection3.i = false;
                                z11 = true;
                            }
                            selection5.e = selection3.e;
                            selection5.i = selection3.i;
                            selection5.y = selection3.y;
                            selection5.z = selection3.z;
                            selection5.A = selection3.A;
                            this.j.set(i, selection5);
                            if (z11) {
                                z14 = true;
                            } else {
                                z14 = true;
                            }
                            selection2 = selection3;
                            z12 = z14;
                            z10 = true;
                        }
                        i++;
                        listA0 = list2;
                        size = i8;
                    }
                    if (!z10) {
                        if (!R()) {
                            if (m0()) {
                                this.i.add(selection5);
                            }
                            this.j.add(selection5);
                            wq3 wq3VarU5 = ((br3) mmc.a(hp0.A, br3.class)).U();
                            wq3VarU5.getClass();
                            quickBetView2 = wq3VarU5.H;
                            if (quickBetView2 != null) {
                                quickBetView2.getBetItem().i0(quickBetView2, selection5);
                            }
                            if (this.C) {
                                vgb0.a(AnalyticsEvent.BET_ADD_ODDS);
                            }
                            SimShareData.INSTANCE.resetAutoBetTimes();
                            z12 = true;
                        }
                    }
                    if (z10) {
                        LinkedHashSet linkedHashSet4 = this.p;
                        if (selection2 != null) {
                            string = selection2.toString();
                        } else {
                            string = null;
                        }
                        y8h0.a(linkedHashSet4).remove(string);
                        LinkedHashMap linkedHashMap4 = this.q;
                        if (selection2 != null) {
                            strH = selection2.h();
                        } else {
                            strH = null;
                        }
                        y8h0.c(linkedHashMap4).remove(strH);
                        krm krmVarU7 = U1();
                        if (selection2 != null) {
                            market2 = selection2.b;
                        } else {
                            market2 = null;
                        }
                        if (list != null) {
                            arrayList2 = new ArrayList(list);
                        } else {
                            arrayList2 = null;
                        }
                        krmVarU7.H(event2, market2, outcome2, arrayList2);
                    }
                    i2();
                    this.p.add(event2.eventId + market4 + outcome2.id);
                    j2(selection5);
                    krm krmVarU8 = U1();
                    if (list != null) {
                        arrayList = new ArrayList(list);
                    } else {
                        arrayList = null;
                    }
                    krmVarU8.h(event2, market4, outcome2, arrayList);
                    Z1(!z12);
                    z9 = z12;
                } else {
                    listA0 = CollectionsKt.A0(this.j);
                    size = this.j.size();
                    selection2 = null;
                    i = 0;
                    z10 = false;
                    z11 = false;
                    z12 = false;
                    while (i < size) {
                        list2 = listA0;
                        selection3 = (Selection) this.j.get(i);
                        int i9 = size;
                        selection5.f = selection3.f;
                        if (z5) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        if (selection3.equals(selection5)) {
                            market3 = selection5.b;
                            if (xvy.a(market3) == null) {
                            }
                            if (z15) {
                                it = list2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    selection4 = (Selection) next;
                                    if (!Intrinsics.g(selection4.a.eventId, selection5.a.eventId)) {
                                    }
                                }
                                if (((Selection) next) != null) {
                                    itf0.a aVar11 = itf0.a;
                                    aVar11.q(MyLog.TAG_EDIT_BET);
                                    aVar11.n("on selected an UNDO selection which is mutex", new Object[0]);
                                    return false;
                                }
                                selection3.i = false;
                                z11 = true;
                            }
                            selection5.e = selection3.e;
                            selection5.i = selection3.i;
                            selection5.y = selection3.y;
                            selection5.z = selection3.z;
                            selection5.A = selection3.A;
                            this.j.set(i, selection5);
                            if (z11) {
                                z14 = true;
                            } else {
                                z14 = true;
                            }
                            selection2 = selection3;
                            z12 = z14;
                            z10 = true;
                        } else {
                            if (z15) {
                                it = list2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    selection4 = (Selection) next;
                                    if (!Intrinsics.g(selection4.a.eventId, selection5.a.eventId)) {
                                    }
                                }
                                if (((Selection) next) != null) {
                                    itf0.a aVar12 = itf0.a;
                                    aVar12.q(MyLog.TAG_EDIT_BET);
                                    aVar12.n("on selected an UNDO selection which is mutex", new Object[0]);
                                    return false;
                                }
                                selection3.i = false;
                                z11 = true;
                            }
                            selection5.e = selection3.e;
                            selection5.i = selection3.i;
                            selection5.y = selection3.y;
                            selection5.z = selection3.z;
                            selection5.A = selection3.A;
                            this.j.set(i, selection5);
                            if (z11) {
                                z14 = true;
                            } else {
                                z14 = true;
                            }
                            selection2 = selection3;
                            z12 = z14;
                            z10 = true;
                        }
                        i++;
                        listA0 = list2;
                        size = i9;
                    }
                    if (!z10) {
                        if (!R()) {
                            if (m0()) {
                                this.i.add(selection5);
                            }
                            this.j.add(selection5);
                            wq3 wq3VarU6 = ((br3) mmc.a(hp0.A, br3.class)).U();
                            wq3VarU6.getClass();
                            quickBetView2 = wq3VarU6.H;
                            if (quickBetView2 != null) {
                                quickBetView2.getBetItem().i0(quickBetView2, selection5);
                            }
                            if (this.C) {
                                vgb0.a(AnalyticsEvent.BET_ADD_ODDS);
                            }
                            SimShareData.INSTANCE.resetAutoBetTimes();
                            z12 = true;
                        }
                    }
                    if (z10) {
                        LinkedHashSet linkedHashSet5 = this.p;
                        if (selection2 != null) {
                            string = selection2.toString();
                        } else {
                            string = null;
                        }
                        y8h0.a(linkedHashSet5).remove(string);
                        LinkedHashMap linkedHashMap5 = this.q;
                        if (selection2 != null) {
                            strH = selection2.h();
                        } else {
                            strH = null;
                        }
                        y8h0.c(linkedHashMap5).remove(strH);
                        krm krmVarU9 = U1();
                        if (selection2 != null) {
                            market2 = selection2.b;
                        } else {
                            market2 = null;
                        }
                        if (list != null) {
                            arrayList2 = new ArrayList(list);
                        } else {
                            arrayList2 = null;
                        }
                        krmVarU9.H(event2, market2, outcome2, arrayList2);
                    }
                    i2();
                    this.p.add(event2.eventId + market4 + outcome2.id);
                    j2(selection5);
                    krm krmVarU10 = U1();
                    if (list != null) {
                        arrayList = new ArrayList(list);
                    } else {
                        arrayList = null;
                    }
                    krmVarU10.h(event2, market4, outcome2, arrayList);
                    Z1(!z12);
                    z9 = z12;
                }
            }
            if (z9 || z2) {
                V1().w(null);
                if (((br3) mmc.a(hp0.A, br3.class)).U().I) {
                    ((br3) mmc.a(hp0.A, br3.class)).U().i(oti.c().e());
                    if (z2) {
                        wq3 wq3VarU7 = ((br3) mmc.a(hp0.A, br3.class)).U();
                        if (wq3VarU7.c.U().size() == 1 && (quickBetView = wq3VarU7.H) != null) {
                            quickBetView.L0();
                        }
                    }
                }
            }
            if (v0() || t1()) {
                this.I = false;
            }
            if (this.j.size() == 1) {
                i2();
            }
            return z9;
        }
        return false;
    }

    @Override // defpackage.jrm
    public final void N1(String str) {
        str.getClass();
        this.D = str;
    }

    @Override // defpackage.jrm
    public final boolean O() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.j;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            if (qz3.b((Selection) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            if (!((Selection) obj2).b.isPreMatch()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.jrm
    public final boolean O0() {
        ArrayList arrayList = this.j;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Selection selection = (Selection) obj;
                if (u7u.h(selection) || rlc.e(selection) || u7u.i(selection)) {
                    if (!selection.n()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.jrm
    public final boolean O1() {
        if (!U().isEmpty()) {
            ArrayList arrayListU = U();
            if (arrayListU != null && arrayListU.isEmpty()) {
                return true;
            }
            int size = arrayListU.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListU.get(i);
                i++;
                if (!g880.t((Selection) obj)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.jrm
    public final void P(QuickBetView quickBetView) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.m;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            p48.w(W1(kotlin.collections.a.c((Selection) obj)), arrayList);
        }
        mu2 mu2Var = new mu2();
        ArrayList arrayList3 = this.j;
        if (h2(quickBetView, arrayList3, arrayList, false, mu2Var) == null) {
            return;
        }
        arrayList2.clear();
        arrayList2.addAll(CollectionsKt.A0(arrayList3));
        LinkedHashMap linkedHashMap = this.n;
        linkedHashMap.clear();
        int size2 = arrayList3.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList3.get(i2);
            i2++;
            String strE = ((Selection) obj2).e();
            Integer num = (Integer) linkedHashMap.get(strE);
            linkedHashMap.put(strE, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        }
    }

    @Override // defpackage.jrm
    public final void P0(String str, Selection selection, Selection selection2) {
        str.getClass();
        selection.getClass();
        Set set = (Set) this.q.get(str);
        if (set != null) {
            set.remove(selection);
            set.add(selection2);
        }
    }

    @Override // defpackage.jrm
    public final boolean P1(up3 up3Var) {
        return ((Set) this.h.getValue()).contains(up3Var);
    }

    @Override // defpackage.jrm
    public final boolean Q() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (qz3.b((Selection) obj)) {
                i++;
            }
        }
        return i > 0;
    }

    @Override // defpackage.jrm
    public final int Q0() {
        ArrayList arrayListU = U();
        int i = 0;
        if (arrayListU != null && arrayListU.isEmpty()) {
            return 0;
        }
        int size = arrayListU.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListU.get(i2);
            i2++;
            Selection selection = (Selection) obj;
            List<PreCannedBBOutcome> list = selection.c.childOutcomes;
            if (list != null && !list.isEmpty()) {
                Market market = selection.b;
                market.getClass();
                if (!u5y.c(market) && (i = i + 1) < 0) {
                    kotlin.collections.b.p();
                    throw null;
                }
            }
        }
        return i;
    }

    @Override // defpackage.jrm
    public final LinkedHashSet Q1() {
        return this.v;
    }

    @Override // defpackage.jrm
    public final boolean R() {
        if (D()) {
            return iw2.a() >= Y1();
        }
        return this.j.size() >= Y1();
    }

    @Override // defpackage.jrm
    public final LinkedHashSet R0() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(W1(this.j));
        return linkedHashSet;
    }

    @Override // defpackage.jrm
    public final LinkedHashMap S() {
        return this.t;
    }

    @Override // defpackage.jrm
    public final void S0(t880.a aVar) {
        Object value;
        LinkedHashMap linkedHashMap;
        t880 t880Var = this.c;
        t880Var.getClass();
        wwd0 wwd0Var = t880Var.a;
        do {
            value = wwd0Var.getValue();
            Map map = (Map) value;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(jpu.a(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap2.put(entry.getKey(), yi80.c((Set) entry.getValue(), aVar));
            }
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                if (!((Set) entry2.getValue()).isEmpty()) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
        } while (!wwd0Var.g(value, linkedHashMap));
    }

    @Override // defpackage.jrm
    public final void T(Selection selection, String str) {
        str.getClass();
        this.u.put(selection, str);
    }

    @Override // defpackage.jrm
    public final boolean T0(Selection selection) {
        if (m0()) {
            ArrayList arrayList = this.i;
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (Intrinsics.g(((Selection) obj).a.eventId, selection.a.eventId)) {
                    i++;
                }
            }
            if (i > 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object T1(x1b x1bVar) {
        su2 su2Var;
        if (x1bVar instanceof su2) {
            su2Var = (su2) x1bVar;
            int i = su2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                su2Var.c = i - Integer.MIN_VALUE;
            } else {
                su2Var = new su2(this, x1bVar);
            }
        } else {
            su2Var = new su2(this, x1bVar);
        }
        Object objD = su2Var.a;
        y5b y5bVar = y5b.a;
        int i2 = su2Var.c;
        if (i2 == 0) {
            uj50.b(objD);
            zu7.a aVar = zu7.a;
            pfd pfdVar = fse.a;
            wcl wclVar = gku.a;
            uu2 uu2Var = new uu2(this, null);
            su2Var.c = 1;
            objD = ej5.d(wclVar, uu2Var, su2Var);
            if (objD != y5bVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(objD);
                return objD;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(objD);
        pfd pfdVar2 = fse.a;
        odd oddVar = odd.b;
        tu2 tu2Var = new tu2((List) objD, null);
        su2Var.c = 2;
        Object objD2 = ej5.d(oddVar, tu2Var, su2Var);
        return objD2 == y5bVar ? y5bVar : objD2;
    }

    @Override // defpackage.jrm
    public final ArrayList U() {
        int iOrdinal = this.w.ordinal();
        return (iOrdinal == 0 || iOrdinal != 1) ? this.j : this.i;
    }

    @Override // defpackage.jrm
    public final boolean U0() {
        ArrayList arrayList;
        if (!m0() && ((arrayList = this.j) == null || !arrayList.isEmpty())) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (qvy.d((Selection) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final krm U1() {
        krm krmVar = this.b.get();
        krmVar.getClass();
        return krmVar;
    }

    @Override // defpackage.jrm
    public final boolean V() {
        ArrayList arrayListU = U();
        if (arrayListU == null || !arrayListU.isEmpty()) {
            int size = arrayListU.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListU.get(i);
                i++;
                if (((Selection) obj).p()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jrm
    public final void V0(Subscriber subscriber, boolean z) {
        subscriber.getClass();
        mu2 mu2Var = new mu2();
        ArrayList arrayList = this.j;
        ArrayList arrayList2 = this.l;
        List listH2 = h2(subscriber, arrayList, arrayList2, z, mu2Var);
        if (listH2 == null) {
            return;
        }
        arrayList2.clear();
        arrayList2.addAll(listH2);
    }

    public final lrm V1() {
        lrm lrmVar = this.a.get();
        lrmVar.getClass();
        return lrmVar;
    }

    @Override // defpackage.jrm
    public final boolean W() {
        return this.w == k53.REAL;
    }

    @Override // defpackage.jrm
    public final void W0(ArrayList arrayList) {
        f2(k53.EDIT, false);
        ArrayList arrayList2 = this.k;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        pfd pfdVar = fse.a;
        ej5.c(w5b.a(odd.b), null, null, new ru2(this, null), 3);
    }

    @Override // defpackage.jrm
    public final int X() {
        ArrayList arrayListU = U();
        int i = 0;
        if (arrayListU != null && arrayListU.isEmpty()) {
            return 0;
        }
        int size = arrayListU.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListU.get(i2);
            i2++;
            if (((Selection) obj).y && (i = i + 1) < 0) {
                kotlin.collections.b.p();
                throw null;
            }
        }
        return i;
    }

    @Override // defpackage.jrm
    public final void X0(boolean z) {
        this.O = z;
    }

    @Override // defpackage.jrm
    public final int Y() {
        ArrayList arrayListU = U();
        int i = 0;
        if (arrayListU != null && arrayListU.isEmpty()) {
            return 0;
        }
        int size = arrayListU.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListU.get(i2);
            i2++;
            if (((Selection) obj).A && (i = i + 1) < 0) {
                kotlin.collections.b.p();
                throw null;
            }
        }
        return i;
    }

    @Override // defpackage.jrm
    public final String Y0() {
        return this.D;
    }

    public final int Y1() {
        return m0() ? SimShareData.INSTANCE.getMaxSelection() : this.d.y().getMaxSelectionLimit();
    }

    @Override // defpackage.jrm
    public final boolean Z() {
        k980 k980VarD0 = d0();
        return (k980VarD0 == k980.d || k980VarD0 == k980.e) && W();
    }

    @Override // defpackage.jrm
    public final boolean Z0() {
        ArrayList arrayList = this.j;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (u7u.i((Selection) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void Z1(boolean z) {
        for (iu2.a aVar : (Set) this.h.getValue()) {
            if (!z || !(aVar instanceof iu2.b)) {
                aVar.C();
            }
        }
    }

    @Override // defpackage.jrm
    public final BoreDrawConfig a() {
        return this.K;
    }

    @Override // defpackage.jrm
    public final boolean a0() {
        ArrayList arrayListU = U();
        if (arrayListU == null || !arrayListU.isEmpty()) {
            int size = arrayListU.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListU.get(i);
                i++;
                if (b3.S(((Selection) obj).a.eventId)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jrm
    public final int a1(Event event, Market market, Outcome outcome, List<? extends Selection> list, String str, String str2) {
        if (!v(event, market, outcome)) {
            return 4;
        }
        Event event2 = new Event(event);
        Market market2 = new Market(market);
        Outcome outcome2 = new Outcome(outcome);
        Selection selection = new Selection(event2, market2, outcome2, list);
        selection.f = str;
        ArrayList arrayList = this.j;
        if (arrayList.size() >= this.d.y().getMaxSelectionLimit() || U().size() >= Y1()) {
            return 3;
        }
        int size = arrayList.size();
        boolean z = true;
        boolean z2 = false;
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            if (Intrinsics.g(arrayList.get(i2), selection)) {
                arrayList.set(i2, selection);
                i = 2;
                z2 = true;
            }
        }
        if (z2) {
            z = false;
        } else {
            if (m0() && u1(selection)) {
                this.i.add(selection);
            }
            arrayList.add(selection);
            if (this.C) {
                vgb0.a(AnalyticsEvent.BET_ADD_ODDS);
            }
            i = 1;
        }
        String str3 = event2.eventId + market2 + outcome2.id;
        this.p.add(str3);
        j2(selection);
        U1().h(event2, market2, outcome2, list != null ? new ArrayList(list) : null);
        if (z) {
            V1().w(null);
        }
        V1().g0(str, str2, str3);
        if (v0() || t1()) {
            this.I = false;
        }
        i2();
        return i;
    }

    public final void a2(String str) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            S1(str, (Selection) obj, linkedHashSet);
        }
        boolean zIsEmpty = linkedHashSet.isEmpty();
        LinkedHashMap linkedHashMap = this.q;
        if (zIsEmpty) {
            linkedHashMap.remove(str);
        } else {
            linkedHashMap.put(str, linkedHashSet);
        }
    }

    @Override // defpackage.jrm
    public final void b(boolean z) {
        this.I = z;
    }

    @Override // defpackage.jrm
    public final boolean b0() {
        ArrayList arrayList = this.j;
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Selection selection = (Selection) obj;
            selection.getClass();
            int i3 = selection.b.status;
            String str = selection.a.eventId;
            str.getClass();
            Outcome outcome = selection.c;
            String str2 = outcome.odds;
            str2.getClass();
            boolean z = selection.i;
            k980 k980Var = k980.EDIT_BET;
            String str3 = outcome.id;
            str3.getClass();
            arrayList2.add(new SelectionFeatures(i3, new FeaturesWithoutMarketStatus(str, str2, z, k980Var, str3)));
        }
        ArrayList arrayList3 = new ArrayList(l48.r(arrayList2, 10));
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            arrayList3.add(((SelectionFeatures) obj2).getSelectionFeatures());
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = this.k;
        int size3 = arrayList5.size();
        int i5 = 0;
        while (i5 < size3) {
            Object obj3 = arrayList5.get(i5);
            i5++;
            if (((SelectionFeatures) obj3).getMarketStatus() != 3) {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayList6 = new ArrayList(l48.r(arrayList4, 10));
        int size4 = arrayList4.size();
        while (i < size4) {
            Object obj4 = arrayList4.get(i);
            i++;
            arrayList6.add(((SelectionFeatures) obj4).getSelectionFeatures());
        }
        return !arrayList6.equals(arrayList3);
    }

    @Override // defpackage.jrm
    public final void b1() {
        ArrayList arrayList = this.i;
        arrayList.clear();
        if (m0()) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = this.j;
            int size = arrayList3.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList3.get(i);
                i++;
                if (u1((Selection) obj)) {
                    arrayList2.add(obj);
                }
            }
            arrayList.addAll(arrayList2);
        }
        U1().B();
    }

    public final void b2(Selection selection) {
        Object obj;
        boolean zD = D();
        ArrayList arrayList = this.j;
        if (zD && selection.e == k980.EDIT_BET) {
            int size = arrayList.size();
            int i = 0;
            do {
                if (i >= size) {
                    obj = null;
                    break;
                } else {
                    obj = arrayList.get(i);
                    i++;
                }
            } while (!Intrinsics.g((Selection) obj, selection));
            Selection selection2 = (Selection) obj;
            if (selection2 != null) {
                selection2.i = true;
                String strH = selection2.h();
                strH.getClass();
                P0(strH, selection, selection2);
            }
        } else {
            arrayList.remove(selection);
            this.i.remove(selection);
            U1().H(selection.a, selection.b, selection.c, selection.d);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            R1(selection, linkedHashSet);
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                a2((String) it.next());
            }
        }
        this.p.remove(selection.toString());
        i2();
    }

    @Override // defpackage.jrm
    public final void c(Context context) {
        if (context == null) {
            return;
        }
        String strValueOf = String.valueOf(Y1());
        final nu2 nu2Var = new nu2(this, context);
        strValueOf.getClass();
        final Dialog dialog = new Dialog(context);
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
        dialog.setContentView(R.layout.dialog_simulate_reach);
        ((TextView) dialog.findViewById(R.id.txt_simulate_description)).setText(sn5.b(context, R.string.component_betslip__there_cannot_be_over_vthreshold_selections_betslip_tip, strValueOf));
        ((TextView) dialog.findViewById(R.id.btn_ok)).setOnClickListener(new View.OnClickListener() { // from class: al90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nu2 nu2Var2 = nu2Var;
                Dialog dialog2 = dialog;
                pu2 pu2Var = nu2Var2.a;
                Context context2 = nu2Var2.b;
                if (((br3) mmc.a(hp0.A, br3.class)).U().I) {
                    pu2Var.f2(k53.REAL, false);
                    pu2Var.b1();
                    if (context2 instanceof Activity) {
                        ((br3) mmc.a(hp0.A, br3.class)).U().i((Activity) context2);
                    }
                }
                dialog2.dismiss();
            }
        });
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        dialog.show();
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) new ColorDrawable(0), bqe.a(40.0f)));
        }
    }

    @Override // defpackage.jrm
    public final void c0(Selection selection, boolean z) {
        selection.getClass();
        this.r.put(selection, Boolean.valueOf(z));
    }

    @Override // defpackage.jrm
    public final LinkedHashMap c1() {
        return this.q;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c2(x1b x1bVar) {
        wu2 wu2Var;
        Object bVar;
        pu2 pu2Var;
        if (x1bVar instanceof wu2) {
            wu2Var = (wu2) x1bVar;
            int i = wu2Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wu2Var.d = i - Integer.MIN_VALUE;
            } else {
                wu2Var = new wu2(this, x1bVar);
            }
        } else {
            wu2Var = new wu2(this, x1bVar);
        }
        Object objC = wu2Var.b;
        y5b y5bVar = y5b.a;
        int i2 = wu2Var.d;
        try {
            if (i2 == 0) {
                uj50.b(objC);
                zi50.a aVar = zi50.b;
                hv2 hv2Var = this.e;
                wu2Var.a = this;
                wu2Var.d = 1;
                objC = hv2Var.c(wu2Var);
                if (objC == y5bVar) {
                    return y5bVar;
                }
                pu2Var = this;
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pu2 pu2Var2 = wu2Var.a;
                uj50.b(objC);
                pu2Var = pu2Var2;
            }
            String str = (String) objC;
            if (StringsKt.U(str)) {
                return Unit.a;
            }
            pu2Var.C = false;
            List<Selection> list = (List) sh8.b().fromJson(str, (Type) pu2Var.f.getValue());
            list.getClass();
            for (Selection selection : list) {
                pu2Var.N(selection.a, selection.b, selection.c, selection.e, selection.d);
            }
            bVar = Unit.a;
            zi50.a aVar2 = zi50.b;
            Throwable thA = zi50.a(bVar);
            if (thA != null) {
                itf0.a.a(a320.a("restoreSelections failed: ", thA), new Object[0]);
            }
            this.C = true;
            return Unit.a;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
    }

    @Override // defpackage.jrm
    public final void d() {
        this.x = !this.x;
    }

    @Override // defpackage.jrm
    public final k980 d0() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Selection selection = (Selection) obj;
            k980 k980Var = selection.e;
            k980Var.getClass();
            if (k980Var != k980.d && k980Var != k980.e) {
                k980 k980Var2 = selection.e;
                k980Var2.getClass();
                if (k980Var2 == k980.RECOMMENDED_CODE) {
                }
            }
            k980 k980Var3 = selection.e;
            k980Var3.getClass();
            return k980Var3;
        }
        return k980.DEFAULT;
    }

    @Override // defpackage.jrm
    public final void d1(boolean z) {
        this.y = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d2(x1b x1bVar) {
        xu2 xu2Var;
        Object bVar;
        if (x1bVar instanceof xu2) {
            xu2Var = (xu2) x1bVar;
            int i = xu2Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xu2Var.d = i - Integer.MIN_VALUE;
            } else {
                xu2Var = new xu2(this, x1bVar);
            }
        } else {
            xu2Var = new xu2(this, x1bVar);
        }
        Object objA = xu2Var.b;
        y5b y5bVar = y5b.a;
        int i2 = xu2Var.d;
        try {
            if (i2 == 0) {
                uj50.b(objA);
                this.k.clear();
                zi50.a aVar = zi50.b;
                hv2 hv2Var = this.e;
                xu2Var.a = this;
                xu2Var.d = 1;
                objA = hv2Var.a(xu2Var);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = xu2Var.a;
                uj50.b(objA);
            }
            String str = (String) objA;
            if (StringsKt.U(str)) {
                return Unit.a;
            }
            Object objFromJson = sh8.b().fromJson(str, (Type) this.g.getValue());
            objFromJson.getClass();
            Iterator it = ((Iterable) objFromJson).iterator();
            while (it.hasNext()) {
                this.k.add((SelectionFeatures) it.next());
            }
            bVar = Unit.a;
            zi50.a aVar2 = zi50.b;
            Throwable thA = zi50.a(bVar);
            if (thA != null) {
                itf0.a.a(a320.a("retrieveEditFeatures failed: ", thA), new Object[0]);
            }
            return Unit.a;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
    }

    @Override // defpackage.jrm
    public final boolean e() {
        ArrayList arrayListU = U();
        if (arrayListU == null || !arrayListU.isEmpty()) {
            int size = arrayListU.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListU.get(i);
                i++;
                if (((Selection) obj).c.isJokerOutcome()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jrm
    public final boolean e0(Selection selection) {
        ArrayList arrayList;
        selection.getClass();
        if (this.w == k53.EDIT && ((arrayList = this.j) == null || !arrayList.isEmpty())) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Selection selection2 = (Selection) obj;
                if (!selection2.i && !selection2.equals(selection) && Intrinsics.g(selection2.a, selection.a)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jrm
    public final void e1(i63 i63Var) {
        i63Var.getClass();
        V0(i63Var, true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e2(x1b x1bVar) {
        yu2 yu2Var;
        if (x1bVar instanceof yu2) {
            yu2Var = (yu2) x1bVar;
            int i = yu2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yu2Var.c = i - Integer.MIN_VALUE;
            } else {
                yu2Var = new yu2(this, x1bVar);
            }
        } else {
            yu2Var = new yu2(this, x1bVar);
        }
        Object objF = yu2Var.a;
        y5b y5bVar = y5b.a;
        int i2 = yu2Var.c;
        k53 k53Var = null;
        if (i2 == 0) {
            uj50.b(objF);
            k53.a aVar = k53.b;
            yu2Var.c = 1;
            objF = this.e.f(yu2Var);
            if (objF == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objF);
        }
        int iIntValue = ((Number) objF).intValue();
        for (k53 k53Var2 : k53.values()) {
            if (k53Var2.a == iIntValue) {
                k53Var = k53Var2;
                break;
            }
        }
        if (k53Var != null) {
            f2(k53Var, true);
        }
        return Unit.a;
    }

    @Override // defpackage.jrm
    public final boolean f(Event event, Market market, boolean z) {
        event.getClass();
        market.getClass();
        ArrayList arrayList = this.j;
        if (arrayList.size() > 0) {
            Selection selection = (Selection) arrayList.get(0);
            Event event2 = selection.a;
            Outcome outcome = selection.c;
            if (Intrinsics.g(event2, event) && Intrinsics.g(selection.b, market) && outcome.isJokerOutcome()) {
                int i = (event.status == 0 && market.isPreMatch() && market.status == 0 && z) ? 1 : 0;
                Outcome outcome2 = new Outcome(outcome);
                outcome2.isActive = i;
                arrayList.set(0, new Selection(event, market, outcome2));
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jrm
    public final boolean f0() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            Selection selection = (Selection) obj;
            boolean zI = qz3.i(selection);
            Event event = selection.a;
            if (zI && event.changeFlag) {
                i2++;
            }
            if (event.changeFlag) {
                i++;
            }
        }
        return !(i == 0 && i2 == 0) && i == i2;
    }

    @Override // defpackage.jrm
    public final void f1(List list) {
        Object bVar;
        list.getClass();
        try {
            zi50.a aVar = zi50.b;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Selection selection = (Selection) it.next();
                pu2 pu2Var = this;
                pu2Var.N(selection.a, selection.b, selection.c, selection.e, selection.d);
                this = pu2Var;
            }
            bVar = Unit.a;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a.a(a320.a("restoreSelections failed: ", thA), new Object[0]);
        }
    }

    public final void f2(k53 k53Var, boolean z) {
        if (this.w == k53Var) {
            return;
        }
        this.w = k53Var;
        if (z) {
            return;
        }
        jvd0 jvd0Var = this.G;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.G = ej5.c(this.E, null, null, new e(k53Var, null), 3);
    }

    @Override // defpackage.jrm
    public final boolean g(String str, String str2, String str3, boolean z) {
        Set<String> set;
        if (tru.g(str2, str3)) {
            return false;
        }
        Map<String, Set<String>> liveMarketCategorySet = z ? SimShareData.INSTANCE.getLiveMarketCategorySet() : SimShareData.INSTANCE.getPrematchMarketCategorySet();
        return (liveMarketCategorySet.get(str) == null || (set = liveMarketCategorySet.get(str)) == null || !set.contains(str2)) ? false : true;
    }

    @Override // defpackage.jrm
    public final boolean g0() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.j;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            if (qz3.b((Selection) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            if (!((Selection) obj2).b.isLive()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.jrm
    public final void g1(boolean z) {
        this.L = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g2(x1b x1bVar) {
        bv2 bv2Var;
        Object bVar;
        if (x1bVar instanceof bv2) {
            bv2Var = (bv2) x1bVar;
            int i = bv2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bv2Var.c = i - Integer.MIN_VALUE;
            } else {
                bv2Var = new bv2(this, x1bVar);
            }
        } else {
            bv2Var = new bv2(this, x1bVar);
        }
        Object obj = bv2Var.a;
        y5b y5bVar = y5b.a;
        int i2 = bv2Var.c;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                zi50.a aVar = zi50.b;
                String json = sh8.b().toJson(this.k);
                hv2 hv2Var = this.e;
                json.getClass();
                bv2Var.c = 1;
                if (hv2Var.e(json, bv2Var) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            bVar = Unit.a;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a.a(a320.a("storeEditFeatures failed: ", thA), new Object[0]);
        }
        return Unit.a;
    }

    @Override // defpackage.jrm
    public final boolean h() {
        ArrayList arrayList;
        if (!m0() && ((arrayList = this.j) == null || !arrayList.isEmpty())) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (yay.i((Selection) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jrm
    public final boolean h0() {
        ArrayList arrayList = this.j;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (((Selection) obj).b.status == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jrm
    public final String h1(int i, boolean z) {
        if (i == 1 || z) {
            return sn5.b(yrh0.j(), R.string.component_betslip__singles, new Object[0]);
        }
        if (i == 2) {
            return sn5.b(yrh0.j(), R.string.component_betslip__doubles, new Object[0]);
        }
        if (i == 3) {
            return sn5.b(yrh0.j(), R.string.component_betslip__trebles, new Object[0]);
        }
        return i >= 4 ? m58.a(i, " ".concat(sn5.b(yrh0.j(), R.string.component_betslip__folds_with_space, new Object[0]))) : "";
    }

    @Override // defpackage.jrm
    public final void i(boolean z) {
        this.z = z;
    }

    @Override // defpackage.jrm
    public final void i0(QuickBetView quickBetView, Selection selection) {
        Selection selectionE;
        if (selection == null) {
            return;
        }
        this.m.add(selection);
        String strE = selection.e();
        LinkedHashMap linkedHashMap = this.n;
        Integer num = (Integer) linkedHashMap.get(strE);
        if (num == null) {
            num = 0;
            SocketPushManager.getInstance().subscribeTopic(new GroupTopic(selection.e()), quickBetView);
            SocketPushManager.getInstance().subscribeTopic(new GroupTopic(selection.g()), quickBetView);
            if (selection.p()) {
                for (Selection selection2 : selection.d) {
                    SocketPushManager.getInstance().subscribeTopic(new GroupTopic(selection2.e()), quickBetView);
                    SocketPushManager.getInstance().subscribeTopic(new GroupTopic(selection2.g()), quickBetView);
                }
            }
            if (qvy.d(selection) && (selectionE = qvy.e(selection)) != null) {
                SocketPushManager.getInstance().subscribeTopic(new GroupTopic(selectionE.e()), quickBetView, true);
            }
        }
        linkedHashMap.put(strE, Integer.valueOf(num.intValue() + 1));
    }

    @Override // defpackage.jrm
    public final void i1(Selection selection) {
        selection.getClass();
        g880.D(selection);
        b2(selection);
        if (this.j.isEmpty()) {
            V1().clear();
        }
        Z1(false);
    }

    public final void i2() {
        zu7.a aVar = zu7.a;
        ej5.c(zu7.a(), null, null, new g(null), 3);
    }

    @Override // defpackage.jrm
    public final void j(Selection selection) {
        selection.getClass();
        this.u.remove(selection);
    }

    @Override // defpackage.jrm
    public final boolean j0(Event event, Market market, Outcome outcome, k980 k980Var) {
        return N(event, market, outcome, k980Var, null);
    }

    @Override // defpackage.jrm
    public final void j1(iu2.a aVar) {
        aVar.getClass();
        ((Set) this.h.getValue()).remove(aVar);
    }

    public final void j2(Selection selection) {
        List<Selection> list;
        String strH = selection.h();
        strH.getClass();
        a2(strH);
        if (!selection.p() || (list = selection.d) == null) {
            return;
        }
        for (Selection selection2 : list) {
            selection2.getClass();
            j2(selection2);
        }
    }

    @Override // defpackage.jrm
    public final int k() {
        ArrayList arrayListU = U();
        int i = 0;
        if (arrayListU != null && arrayListU.isEmpty()) {
            return 0;
        }
        int size = arrayListU.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListU.get(i2);
            i2++;
            Selection selection = (Selection) obj;
            List<PreCannedBBOutcome> list = selection.c.childOutcomes;
            if (list != null && !list.isEmpty()) {
                Market market = selection.b;
                market.getClass();
                if (u5y.c(market) && (i = i + 1) < 0) {
                    kotlin.collections.b.p();
                    throw null;
                }
            }
        }
        return i;
    }

    @Override // defpackage.jrm
    public final void k0(j8s j8sVar) {
        this.N = j8sVar;
    }

    @Override // defpackage.jrm
    public final void k1(Selection selection) {
        if (!u1(selection) || qz3.i(selection)) {
            this.i.remove(selection);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k2(String str, x1b x1bVar) {
        dv2 dv2Var;
        Throwable thA;
        if (x1bVar instanceof dv2) {
            dv2Var = (dv2) x1bVar;
            int i = dv2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dv2Var.c = i - Integer.MIN_VALUE;
            } else {
                dv2Var = new dv2(this, x1bVar);
            }
        } else {
            dv2Var = new dv2(this, x1bVar);
        }
        Object obj = dv2Var.a;
        y5b y5bVar = y5b.a;
        int i2 = dv2Var.c;
        Object bVar = null;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                zi50.a aVar = zi50.b;
                if (str != null) {
                    hv2 hv2Var = this.e;
                    dv2Var.c = 1;
                    if (hv2Var.g(str, dv2Var) == y5bVar) {
                        return y5bVar;
                    }
                }
                zi50.a aVar2 = zi50.b;
                thA = zi50.a(bVar);
                if (thA != null) {
                    itf0.a.a(a320.a("updateSelectionToCache failed: ", thA), new Object[0]);
                }
                return Unit.a;
            }
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            bVar = Unit.a;
            zi50.a aVar3 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar4 = zi50.b;
            bVar = new zi50.b(th);
        }
        thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a.a(a320.a("updateSelectionToCache failed: ", thA), new Object[0]);
        }
        return Unit.a;
    }

    @Override // defpackage.jrm
    public final boolean l() {
        return this.M;
    }

    @Override // defpackage.jrm
    public final boolean l0(Selection selection) {
        ArrayList arrayList = this.j;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Selection selection2 = (Selection) obj;
                if (selection2.toString().equals(selection.toString()) && selection2.i && D()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jrm
    public final LinkedHashMap l1() {
        return this.r;
    }

    @Override // defpackage.jrm
    public final void m(Selection selection) {
        selection.getClass();
        this.s.remove(selection);
    }

    @Override // defpackage.jrm
    public final boolean m0() {
        return this.w == k53.SIM;
    }

    @Override // defpackage.jrm
    public final void m1(iu2.a aVar) {
        aVar.getClass();
        ((Set) this.h.getValue()).add(aVar);
    }

    @Override // defpackage.jrm
    public final boolean n() {
        Collection collectionValues = this.s.values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            return false;
        }
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (((Boolean) it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jrm
    public final boolean n0() {
        return this.L;
    }

    @Override // defpackage.jrm
    public final boolean n1() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.j;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            if (qz3.b((Selection) obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                return true;
            }
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                Selection selection = (Selection) obj2;
                if (!u7u.i(selection) || !u7u.j(selection)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.jrm
    public final int o() {
        ArrayList arrayListU = U();
        int i = 0;
        if (arrayListU != null && arrayListU.isEmpty()) {
            return 0;
        }
        int size = arrayListU.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListU.get(i2);
            i2++;
            if (((Selection) obj).p() && (i = i + 1) < 0) {
                kotlin.collections.b.p();
                throw null;
            }
        }
        return i;
    }

    @Override // defpackage.jrm
    public final boolean o0() {
        return this.j.isEmpty();
    }

    @Override // defpackage.jrm
    public final boolean o1() {
        return this.I;
    }

    @Override // defpackage.jrm
    public final boolean p() {
        ArrayList arrayListU = U();
        if (arrayListU == null || !arrayListU.isEmpty()) {
            int size = arrayListU.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListU.get(i);
                i++;
                if (((Selection) obj).b.isLive()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jrm
    public final void p0(boolean z) {
        this.x = z;
    }

    @Override // defpackage.jrm
    public final boolean p1() {
        ArrayList arrayList = this.j;
        if (!arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                return true;
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Selection selection = (Selection) obj;
                if (!yay.j(selection) || !yay.i(selection)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.jrm
    public final void q0(boolean z) {
        this.M = z;
    }

    @Override // defpackage.jrm
    public final boolean q1() {
        return this.J;
    }

    @Override // defpackage.jrm
    public final void r(i63 i63Var) {
        i63Var.getClass();
        SocketPushManager socketPushManager = SocketPushManager.getInstance();
        Set<Topic> subscribedTopics = socketPushManager.getSubscribedTopics(i63Var);
        subscribedTopics.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : subscribedTopics) {
            if (obj instanceof GroupTopic) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = this.l;
        Iterator it = CollectionsKt.E0(CollectionsKt.i0(arrayList, arrayList2)).iterator();
        while (it.hasNext()) {
            socketPushManager.unsubscribeTopic((GroupTopic) it.next(), i63Var);
        }
        arrayList2.clear();
    }

    @Override // defpackage.jrm
    public final void r0(k53 k53Var) {
        k53Var.getClass();
        f2(k53Var, false);
    }

    @Override // defpackage.jrm
    public final void r1() {
        Object value;
        o2g o2gVar;
        wwd0 wwd0Var = this.c.a;
        do {
            value = wwd0Var.getValue();
            o2gVar = o2g.a;
            o2gVar.getClass();
        } while (!wwd0Var.g(value, o2gVar));
    }

    @Override // defpackage.jrm
    public final void s(String str) {
        str.getClass();
        this.v.add(str);
    }

    @Override // defpackage.jrm
    public final boolean s0(boolean z) {
        ArrayList arrayList = this.j;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Selection selection = (Selection) obj;
                if (u7u.h(selection) || (z && rlc.e(selection))) {
                    if (!selection.n()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.jrm
    public final void s1(boolean z) {
        this.B = z;
    }

    @Override // defpackage.jrm
    public final boolean t() {
        ArrayList arrayList = this.j;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (((Selection) obj).a.hasLiveOrSettledMarket()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.jrm
    public final Object t0(Subscriber subscriber, x1b x1bVar) {
        cv2 cv2Var;
        if (x1bVar instanceof cv2) {
            cv2Var = (cv2) x1bVar;
            int i = cv2Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cv2Var.d = i - Integer.MIN_VALUE;
            } else {
                cv2Var = new cv2(this, x1bVar);
            }
        } else {
            cv2Var = new cv2(this, x1bVar);
        }
        Object objA = cv2Var.b;
        y5b y5bVar = y5b.a;
        int i2 = cv2Var.d;
        if (i2 == 0) {
            uj50.b(objA);
            cv2Var.a = subscriber;
            cv2Var.d = 1;
            objA = bis.a(this.j, 5, cv2Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            subscriber = cv2Var.a;
            uj50.b(objA);
        }
        ArrayList arrayListR = CollectionsKt.R((Iterable) objA);
        final CoroutineContext context = cv2Var.getContext();
        List listH2 = h2(subscriber, arrayListR, this.o, false, new Function0() { // from class: ou2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(i9p.h(context));
            }
        });
        if (listH2 == null) {
            return Unit.a;
        }
        this.o = new ArrayList(listH2);
        return Unit.a;
    }

    @Override // defpackage.jrm
    public final boolean t1() {
        if (m0()) {
            ArrayList arrayList = this.i;
            if (arrayList == null || !arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (u7u.j((Selection) obj)) {
                        return true;
                    }
                }
            }
        } else {
            ArrayList arrayList2 = this.j;
            if (arrayList2 == null || !arrayList2.isEmpty()) {
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    if (u7u.j((Selection) obj2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.jrm
    public final boolean u() {
        return this.O;
    }

    @Override // defpackage.jrm
    public final boolean u0() {
        if (m0()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ArrayList arrayList = this.i;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                String str = ((Selection) obj).a.eventId;
                str.getClass();
                if (!linkedHashSet.add(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jrm
    public final boolean u1(Selection selection) {
        Set<String> set;
        selection.getClass();
        Market market = selection.b;
        Event event = selection.a;
        HashSet hashSet = tru.a;
        if (tru.g(market.id, market.specifier)) {
            return false;
        }
        Map<String, Set<String>> prematchMarketCategorySet = market.product == 3 ? SimShareData.INSTANCE.getPrematchMarketCategorySet() : SimShareData.INSTANCE.getLiveMarketCategorySet();
        return (prematchMarketCategorySet.get(event.sport.id) == null || (set = prematchMarketCategorySet.get(event.sport.id)) == null || !set.contains(market.id) || selection.c.isJokerOutcome()) ? false : true;
    }

    @Override // defpackage.jrm
    public final boolean v(Event event, Market market, Outcome outcome) {
        Sport sport;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (event == null || market == null || outcome == null) {
            return false;
        }
        String str6 = event.eventId;
        return !(str6 == null || str6.length() == 0 || (sport = event.sport) == null || (str = sport.id) == null || str.length() == 0 || (str2 = event.awayTeamName) == null || str2.length() == 0 || (str3 = event.homeTeamName) == null || str3.length() == 0 || (str4 = market.id) == null || str4.length() == 0 || (str5 = outcome.odds) == null || str5.length() == 0) || b3.T(event.eventId) || b3.U(event.eventId);
    }

    @Override // defpackage.jrm
    public final boolean v0() {
        boolean zM0 = m0();
        ArrayList arrayList = this.j;
        if (zM0) {
            if (arrayList == null || !arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (X1((Selection) obj, true)) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (arrayList == null || !arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                if (X1((Selection) obj2, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jrm
    public final boolean v1() {
        Market market;
        EarlyPayoutMarket earlyPayoutMarketB;
        ArrayList arrayList = this.j;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Selection selection = (Selection) obj;
                if ((selection == null || selection.q() || (market = selection.b) == null || (earlyPayoutMarketB = qvy.b(market)) == null) ? false : earlyPayoutMarketB.getSupported()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jrm
    public final j8s w() {
        return this.N;
    }

    @Override // defpackage.jrm
    public final boolean w0(Event event, Market market, Outcome outcome) {
        event.getClass();
        market.getClass();
        outcome.getClass();
        ArrayList arrayList = this.j;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Selection selection = (Selection) obj;
                if (Intrinsics.g(selection.a, event) && Intrinsics.g(selection.b, market) && Intrinsics.g(selection.c, outcome)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jrm
    public final boolean w1() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.j;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            if (qz3.b((Selection) obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                return true;
            }
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                Selection selection = (Selection) obj2;
                if (!yay.j(selection) || !yay.i(selection)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.jrm
    public final boolean x() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.j;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            if (qz3.b((Selection) obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                return true;
            }
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                Selection selection = (Selection) obj2;
                if (!u7u.h(selection) || selection.n() || !X1(selection, false)) {
                    if (!u7u.i(selection) || !u7u.j(selection)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.jrm
    public final void x0(boolean z) {
        this.J = z;
    }

    @Override // defpackage.jrm
    public final void x1() {
        ((Set) this.h.getValue()).clear();
    }

    @Override // defpackage.jrm
    public final void y(List<? extends Selection> list, t880.a aVar) {
        Object value;
        LinkedHashMap linkedHashMapM;
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(o980.a((Selection) it.next()));
        }
        t880 t880Var = this.c;
        t880Var.getClass();
        if (arrayList.isEmpty()) {
            return;
        }
        wwd0 wwd0Var = t880Var.a;
        do {
            value = wwd0Var.getValue();
            Map map = (Map) value;
            linkedHashMapM = kpu.m(map);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                String str = (String) obj;
                Set set = (Set) map.get(str);
                if (set == null) {
                    set = t3g.a;
                }
                linkedHashMapM.put(str, yi80.f(set, aVar));
            }
        } while (!wwd0Var.g(value, linkedHashMapM));
    }

    @Override // defpackage.jrm
    public final void y0(Subscriber subscriber, Selection selection, Subscriber subscriber2) {
        Selection selectionE;
        subscriber2.getClass();
        if (selection == null) {
            return;
        }
        SocketPushManager.getInstance().unsubscribeTopic(new GroupTopic("banned^events"), subscriber2);
        this.m.remove(selection);
        String strE = selection.e();
        LinkedHashMap linkedHashMap = this.n;
        Integer num = (Integer) linkedHashMap.get(strE);
        if (num != null) {
            int iIntValue = num.intValue() - 1;
            Integer numValueOf = Integer.valueOf(iIntValue);
            if (iIntValue >= 1) {
                linkedHashMap.put(strE, numValueOf);
                return;
            }
            linkedHashMap.remove(strE);
            SocketPushManager.getInstance().unsubscribeTopic(new GroupTopic(strE), subscriber);
            SocketPushManager.getInstance().unsubscribeTopic(new GroupTopic(selection.g()), subscriber);
            if (selection.p()) {
                for (Selection selection2 : selection.d) {
                    SocketPushManager.getInstance().unsubscribeTopic(new GroupTopic(selection2.e()), subscriber);
                    SocketPushManager.getInstance().unsubscribeTopic(new GroupTopic(selection2.g()), subscriber);
                }
            }
            if (!qvy.d(selection) || (selectionE = qvy.e(selection)) == null) {
                return;
            }
            SocketPushManager.getInstance().unsubscribeTopic(new GroupTopic(selectionE.e()), subscriber);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0 A[SYNTHETIC] */
    @Override // defpackage.jrm
    public final boolean y1(Event event) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int size;
        int i;
        int size2;
        int i2;
        Object obj;
        Object obj2;
        Event event2;
        String str;
        Sport sport;
        Category category;
        Tournament tournament;
        Sport sport2;
        Category category2;
        Tournament tournament2;
        Object obj3;
        event.getClass();
        if (this.w == k53.EDIT && this.H && b3.T(event.eventId)) {
            ArrayList arrayList3 = this.k;
            if (arrayList3 == null || !arrayList3.isEmpty()) {
                int size3 = arrayList3.size();
                int i3 = 0;
                while (i3 < size3) {
                    Object obj4 = arrayList3.get(i3);
                    i3++;
                    if (Intrinsics.g(((SelectionFeatures) obj4).getSelectionFeatures().getEventID(), event.eventId)) {
                    }
                }
                arrayList = new ArrayList();
                arrayList2 = this.j;
                size = arrayList2.size();
                i = 0;
                while (i < size) {
                    obj3 = arrayList2.get(i);
                    i++;
                    if (!((Selection) obj3).i) {
                        arrayList.add(obj3);
                    }
                }
                size2 = arrayList.size();
                i2 = 0;
                do {
                    obj = null;
                    if (i2 < size2) {
                        obj2 = arrayList.get(i2);
                        i2++;
                        event2 = ((Selection) obj2).a;
                        if (event2 != null || (sport2 = event2.sport) == null || (category2 = sport2.category) == null || (tournament2 = category2.tournament) == null) {
                            str = null;
                        } else {
                            str = tournament2.id;
                        }
                        sport = event.sport;
                        if (sport != null && (category = sport.category) != null && (tournament = category.tournament) != null) {
                            obj = tournament.id;
                        }
                    }
                    if (obj != null) {
                        return true;
                    }
                } while (!Intrinsics.g(str, obj));
                obj = obj2;
                if (obj != null) {
                    return true;
                }
            } else {
                arrayList = new ArrayList();
                arrayList2 = this.j;
                size = arrayList2.size();
                i = 0;
                while (i < size) {
                    obj3 = arrayList2.get(i);
                    i++;
                    if (!((Selection) obj3).i) {
                        arrayList.add(obj3);
                    }
                }
                size2 = arrayList.size();
                i2 = 0;
                do {
                    obj = null;
                    if (i2 < size2) {
                        obj2 = arrayList.get(i2);
                        i2++;
                        event2 = ((Selection) obj2).a;
                        if (event2 != null) {
                            str = null;
                        } else {
                            str = null;
                        }
                        sport = event.sport;
                        if (sport != null) {
                            obj = tournament.id;
                        }
                    }
                    if (obj != null) {
                        return true;
                    }
                } while (!Intrinsics.g(str, obj));
                obj = obj2;
                if (obj != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jrm
    public final int z() {
        ArrayList arrayListU = U();
        int i = 0;
        if (arrayListU != null && arrayListU.isEmpty()) {
            return 0;
        }
        int size = arrayListU.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListU.get(i2);
            i2++;
            if (b3.U(((Selection) obj).a.eventId) && (i = i + 1) < 0) {
                kotlin.collections.b.p();
                throw null;
            }
        }
        return i;
    }

    @Override // defpackage.jrm
    public final void z0(BoreDrawConfig boreDrawConfig) {
        boreDrawConfig.getClass();
        this.K = boreDrawConfig;
    }

    @Override // defpackage.jrm
    public final void z1(Subscriber subscriber, Subscriber subscriber2) {
        subscriber2.getClass();
        while (true) {
            ArrayList arrayList = this.m;
            if (arrayList.isEmpty()) {
                return;
            } else {
                y0(subscriber, (Selection) arrayList.remove(0), subscriber2);
            }
        }
    }
}
