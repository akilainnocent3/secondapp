package defpackage;

import android.content.Context;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.Ticket;
import com.sportybet.android.instantwin.presentation.showoff.model.InstantVirtualShowOffType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ly7o;", "Lj8i0;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class y7o extends j8i0 {
    public final v340 A;
    public final odd a;
    public final ji2 b;
    public final t6o c;
    public final reo d;
    public final String e;
    public final Integer f;
    public final UiText i;
    public final InstantVirtualShowOffType v;
    public final wwd0 w;
    public final v340 y;
    public final wwd0 z;

    @c0d(c = "com.sportybet.android.instantwin.presentation.showoff.InstantVirtualShowOffViewModel$fetchData$1", f = "InstantVirtualShowOffViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super lk50<? extends Ticket>>, v1b<? super Unit>, Object> {
        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return y7o.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super lk50<? extends Ticket>> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            y7o y7oVar = y7o.this;
            y7oVar.w.setValue(a8o.a.b.a);
            wwd0 wwd0Var = y7oVar.z;
            n5o n5oVar = new n5o(false, false, false);
            wwd0Var.getClass();
            wwd0Var.k(null, n5oVar);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.instantwin.presentation.showoff.InstantVirtualShowOffViewModel$fetchData$2", f = "InstantVirtualShowOffViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<lk50<? extends Ticket>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ Context c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = context;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = y7o.this.new b(this.c, v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends Ticket> lk50Var, v1b<? super Unit> v1bVar) {
            return ((b) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y7o y7oVar = y7o.this;
            wwd0 wwd0Var = y7oVar.w;
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (!(lk50Var instanceof lk50.c)) {
                if (!(lk50Var instanceof lk50.a)) {
                    return Unit.a;
                }
                wwd0Var.setValue(a8o.a.C0009a.a);
                return Unit.a;
            }
            a8o.a.d dVar = new a8o.a.d(n6o.a((Ticket) ((lk50.c) lk50Var).a, this.c, y7oVar.b), y7oVar.i, y7oVar.f);
            wwd0Var.getClass();
            wwd0Var.k(null, dVar);
            wwd0 wwd0Var2 = y7oVar.z;
            n5o n5oVarA = n5o.a((n5o) wwd0Var2.getValue(), false, false, 6);
            wwd0Var2.getClass();
            wwd0Var2.k(null, n5oVarA);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.instantwin.presentation.showoff.InstantVirtualShowOffViewModel$fetchData$3", f = "InstantVirtualShowOffViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ Context b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = context;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return y7o.this.new c(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            y7o y7oVar = y7o.this;
            wwd0 wwd0Var = y7oVar.w;
            a8o.a.d dVar = new a8o.a.d(n6o.a(((InstantVirtualShowOffType.TicketWithCompleteInfo) y7oVar.v).a, this.b, y7oVar.b), y7oVar.i, y7oVar.f);
            wwd0Var.getClass();
            wwd0Var.k(null, dVar);
            wwd0 wwd0Var2 = y7oVar.z;
            n5o n5oVarA = n5o.a((n5o) wwd0Var2.getValue(), false, false, 6);
            wwd0Var2.getClass();
            wwd0Var2.k(null, n5oVarA);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.instantwin.presentation.showoff.InstantVirtualShowOffViewModel$fetchData$4", f = "InstantVirtualShowOffViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ Context b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.b = context;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return y7o.this.new d(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:117:0x026e  */
        /* JADX WARN: Code duplicated, block: B:118:0x0270  */
        /* JADX WARN: Code duplicated, block: B:132:0x02b5  */
        /* JADX WARN: Code duplicated, block: B:133:0x02bc  */
        /* JADX WARN: Code duplicated, block: B:136:0x02cb  */
        /* JADX WARN: Code duplicated, block: B:142:0x02e0  */
        /* JADX WARN: Code duplicated, block: B:143:0x02e9  */
        /* JADX WARN: Code duplicated, block: B:157:0x031e  */
        /* JADX WARN: Code duplicated, block: B:169:0x034c  */
        /* JADX WARN: Code duplicated, block: B:171:0x035b  */
        /* JADX WARN: Code duplicated, block: B:173:0x0361  */
        /* JADX WARN: Code duplicated, block: B:175:0x0365  */
        /* JADX WARN: Code duplicated, block: B:176:0x0369 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:177:0x036b  */
        /* JADX WARN: Code duplicated, block: B:178:0x036f  */
        /* JADX WARN: Code duplicated, block: B:181:0x0379  */
        /* JADX WARN: Code duplicated, block: B:184:0x0387  */
        /* JADX WARN: Code duplicated, block: B:186:0x0397  */
        /* JADX WARN: Code duplicated, block: B:187:0x039a  */
        /* JADX WARN: Code duplicated, block: B:190:0x03a6  */
        /* JADX WARN: Code duplicated, block: B:198:0x03c8  */
        /* JADX WARN: Code duplicated, block: B:199:0x03cb  */
        /* JADX WARN: Code duplicated, block: B:202:0x03d1  */
        /* JADX WARN: Code duplicated, block: B:203:0x03d4  */
        /* JADX WARN: Code duplicated, block: B:206:0x03da  */
        /* JADX WARN: Code duplicated, block: B:207:0x03dd  */
        /* JADX WARN: Code duplicated, block: B:211:0x03eb  */
        /* JADX WARN: Code duplicated, block: B:212:0x03ee  */
        /* JADX WARN: Code duplicated, block: B:215:0x03f4  */
        /* JADX WARN: Code duplicated, block: B:216:0x03f7  */
        /* JADX WARN: Code duplicated, block: B:219:0x03fd  */
        /* JADX WARN: Code duplicated, block: B:220:0x0400  */
        /* JADX WARN: Code duplicated, block: B:223:0x0406  */
        /* JADX WARN: Code duplicated, block: B:224:0x0409  */
        /* JADX WARN: Code duplicated, block: B:227:0x040f  */
        /* JADX WARN: Code duplicated, block: B:228:0x0412  */
        /* JADX WARN: Code duplicated, block: B:231:0x0418  */
        /* JADX WARN: Code duplicated, block: B:232:0x041b  */
        /* JADX WARN: Code duplicated, block: B:263:0x0429 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:264:0x0429 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:277:0x0343 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:281:0x02db A[SYNTHETIC] */
        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v36 java.lang.Object, still in use, count: 2, list:
              (r2v36 java.lang.Object) from 0x02b1: PHI (r2 I:??) = (r2v21 java.lang.Object), (r2v36 java.lang.Object) binds: [B:129:0x02b0, B:274:0x02b1] A[DONT_GENERATE, DONT_INLINE]
              (r2v36 java.lang.Object) from 0x02a5: CHECK_CAST (com.sportybet.android.instantwin.newtork.model.response.OutcomeInRound) (r2v36 java.lang.Object)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
            	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
            	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r29) {
            /*
                Method dump skipped, instruction units count: 1172
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: y7o.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.android.instantwin.presentation.showoff.InstantVirtualShowOffViewModel$fetchData$5", f = "InstantVirtualShowOffViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public e(v1b<? super e> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return y7o.this.new e(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            y7o.this.w.setValue(a8o.b.a);
            return Unit.a;
        }
    }

    public y7o(vu60 vu60Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar, ji2 ji2Var, t6o t6oVar, reo reoVar, cmo cmoVar) {
        UiText resourceUiText;
        vu60Var.getClass();
        ji2Var.getClass();
        this.a = oddVar;
        this.b = ji2Var;
        this.c = t6oVar;
        this.d = reoVar;
        String str = (String) vu60Var.b("ARG_SPORT_ID");
        this.e = str;
        this.f = Intrinsics.g(str, "sr:sport:1") ? Integer.valueOf(R.string.page_instant_virtual__show_off_logo) : null;
        Integer numC = cmoVar.c(str);
        if (numC != null) {
            int iIntValue = numC.intValue();
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(R.string.page_instant_virtual__show_off_title_vname, ay0.S(new Object[]{new ResourceUiText(iIntValue)}));
        } else {
            resourceUiText = vch0.a;
        }
        this.i = resourceUiText;
        this.v = (InstantVirtualShowOffType) vu60Var.b("ARG_TYPE");
        wwd0 wwd0VarA = xwd0.a(a8o.a.b.a);
        this.w = wwd0VarA;
        this.y = e1i.b(wwd0VarA);
        wwd0 wwd0VarA2 = xwd0.a(new n5o(false, false, false));
        this.z = wwd0VarA2;
        this.A = e1i.b(wwd0VarA2);
    }

    public final void x1(Context context) {
        context.getClass();
        InstantVirtualShowOffType instantVirtualShowOffType = this.v;
        if (instantVirtualShowOffType instanceof InstantVirtualShowOffType.TicketWithoutCompleteInfo) {
            String str = ((InstantVirtualShowOffType.TicketWithoutCompleteInfo) instantVirtualShowOffType).a;
            t6o t6oVar = this.c;
            t6oVar.getClass();
            str.getClass();
            kzh.d(new g1i(new xzh(bm50.a(ozh.c(new or60(new s6o(t6oVar, str, this.e, null)), t6oVar.b)), new a(null)), new b(context, null)), o8i0.d(this));
            return;
        }
        boolean z = instantVirtualShowOffType instanceof InstantVirtualShowOffType.TicketWithCompleteInfo;
        odd oddVar = this.a;
        if (z) {
            ej5.c(o8i0.d(this), oddVar, null, new c(context, null), 2);
            return;
        }
        if (instantVirtualShowOffType instanceof InstantVirtualShowOffType.RoundWithCompleteInfo) {
            ej5.c(o8i0.d(this), oddVar, null, new d(context, null), 2);
        } else if (instantVirtualShowOffType == null) {
            ej5.c(o8i0.d(this), oddVar, null, new e(null), 2);
        } else {
            uhc.a();
        }
    }

    public final String y1() {
        a8o a8oVar = (a8o) this.y.a.getValue();
        if (a8oVar instanceof a8o.a.d) {
            return ((a8o.a.d) a8oVar).a.a;
        }
        if (a8oVar instanceof a8o.a.c) {
            return ((a8o.a.c) a8oVar).a.a;
        }
        return null;
    }

    public final void z1() {
        wwd0 wwd0Var = this.z;
        n5o n5oVarA = n5o.a((n5o) wwd0Var.getValue(), false, false, 5);
        wwd0Var.getClass();
        wwd0Var.k(null, n5oVarA);
    }
}
