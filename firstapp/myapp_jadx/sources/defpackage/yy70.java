package defpackage;

import android.app.Activity;
import android.widget.Toast;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.fragment.app.FragmentManager;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
public final class yy70 {

    public static final /* synthetic */ class a extends saj implements Function1<ot70, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ot70 ot70Var) {
            Object value;
            ot70 ot70Var2 = ot70Var;
            ot70Var2.getClass();
            l280 l280Var = (l280) this.receiver;
            azm azmVar = l280Var.v;
            wwd0 wwd0Var = l280Var.N;
            eu70 eu70Var = l280Var.B;
            if (ot70Var2 instanceof ot70.d) {
                String str = ((ot70.d) ot70Var2).a;
                if (!str.equals(((q080) wwd0Var.getValue()).a)) {
                    if (str.length() > l280Var.D.getMaxQueryLength()) {
                        ej5.c(o8i0.d(l280Var), null, null, new j280(l280Var, null), 3);
                    } else {
                        String string = UUID.randomUUID().toString();
                        string.getClass();
                        l280Var.J = string;
                        do {
                            value = wwd0Var.getValue();
                        } while (!wwd0Var.g(value, q080.a((q080) value, str, l280Var.z1(str), null, null, null, 28)));
                        l280Var.y1();
                    }
                }
            } else if (ot70Var2 instanceof ot70.e) {
                String str2 = ((ot70.e) ot70Var2).a;
                String string2 = UUID.randomUUID().toString();
                string2.getClass();
                l280Var.J = string2;
                eu70Var.getClass();
                eu70Var.a.a(new gx70(str2, string2), k00.d);
                while (true) {
                    Object value2 = wwd0Var.getValue();
                    String str3 = str2;
                    if (wwd0Var.g(value2, q080.a((q080) value2, str2, null, null, null, null, 30))) {
                        break;
                    }
                    str2 = str3;
                }
                l280Var.y1();
            } else if (ot70Var2 instanceof ot70.i) {
                ot70.i iVar = (ot70.i) ot70Var2;
                String str4 = iVar.a;
                int i = iVar.b;
                String string3 = UUID.randomUUID().toString();
                string3.getClass();
                l280Var.J = string3;
                String str5 = ((q080) wwd0Var.getValue()).a;
                String str6 = l280Var.J;
                eu70Var.getClass();
                str5.getClass();
                str6.getClass();
                eu70Var.a.a(new tt70(str5, str4, i, str6), k00.d);
                while (true) {
                    Object value3 = wwd0Var.getValue();
                    String str7 = str4;
                    if (wwd0Var.g(value3, q080.a((q080) value3, str4, null, null, null, null, 30))) {
                        break;
                    }
                    str4 = str7;
                }
                l280Var.y1();
            } else if (ot70Var2 instanceof ot70.l) {
                String str8 = ((ot70.l) ot70Var2).a;
                String string4 = UUID.randomUUID().toString();
                string4.getClass();
                l280Var.J = string4;
                eu70Var.getClass();
                eu70Var.a.a(new o080(str8, string4), k00.d);
                while (true) {
                    Object value4 = wwd0Var.getValue();
                    String str9 = str8;
                    if (wwd0Var.g(value4, q080.a((q080) value4, str8, null, null, null, null, 30))) {
                        break;
                    }
                    str8 = str9;
                }
                l280Var.y1();
            } else if (ot70Var2 instanceof ot70.f) {
                ej5.c(o8i0.d(l280Var), null, null, new k280(l280Var, ((ot70.f) ot70Var2).a, null), 3);
            } else if (ot70Var2.equals(ot70.g.a)) {
                l280Var.y1();
            } else if (ot70Var2 instanceof ot70.b) {
                zv70 zv70Var = ((ot70.b) ot70Var2).a;
                eu70Var.a(l280Var.J, zv70Var.a, ny70.GAME);
                azm.c(l280Var.v, zv70Var.e, null, null, 6);
            } else if (ot70Var2.equals(ot70.m.a)) {
                azmVar.d(wae.GAMES_LOBBY);
            } else if (ot70Var2 instanceof ot70.j) {
                ot70.j jVar = (ot70.j) ot70Var2;
                String str10 = jVar.a;
                String str11 = jVar.b;
                String str12 = jVar.c;
                eu70Var.a(l280Var.J, str11, ny70.TEAM);
                l280Var.z.a(l280Var.a, str11, str12, str10, null);
            } else if (ot70Var2 instanceof ot70.k) {
                ot70.k kVar = (ot70.k) ot70Var2;
                String str13 = kVar.a;
                String str14 = kVar.b;
                eu70Var.a(l280Var.J, str14, ny70.TOURNAMENT);
                azmVar.f(wae.TOURNAMENT_HOST, kotlin.collections.b.k(new Pair("sportId", str13), new Pair("tournamentId", str14)));
            } else if (ot70Var2 instanceof ot70.a) {
                ot70.a aVar = (ot70.a) ot70Var2;
                Event event = aVar.a;
                ny70 ny70Var = aVar.b;
                String str15 = l280Var.J;
                String str16 = event.eventId;
                str16.getClass();
                eu70Var.a(str15, str16, ny70Var);
                azmVar.j(wae.EVENT_DETAIL, kotlin.collections.b.k(new Pair("sportId", event.sport.id), new Pair(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, event.eventId), new Pair("eventType", event.status == 0 ? "prematch" : "live")), vj5.a(new Pair("EXTRA_EVENT", apg.f(event))));
            } else if (ot70Var2 instanceof ot70.h) {
                ny70 ny70Var2 = ((ot70.h) ot70Var2).a;
                String str17 = l280Var.J;
                eu70Var.getClass();
                str17.getClass();
                eu70Var.a.a(new vx70(ny70Var2.a, str17), k00.d);
            } else {
                if (!(ot70Var2 instanceof ot70.c)) {
                    uhc.a();
                    return null;
                }
                ej5.c(o8i0.d(l280Var), null, null, new h280(l280Var, ((ot70.c) ot70Var2).a, null), 3);
            }
            return Unit.a;
        }
    }

    public static final /* synthetic */ class b extends saj implements jaj<Event, Market, Outcome, Boolean, Boolean, Boolean> {
        @Override // defpackage.jaj
        public final Boolean l(Event event, Market market, Outcome outcome, Boolean bool, Boolean bool2) {
            Event event2 = event;
            Market market2 = market;
            Outcome outcome2 = outcome;
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            event2.getClass();
            market2.getClass();
            outcome2.getClass();
            l280 l280Var = (l280) this.receiver;
            l280Var.getClass();
            boolean zN0 = l280Var.w.N0(event2, market2, outcome2, zBooleanValue, (14336 & 16) != 0 ? false : false, (14336 & 32) != 0 ? null : null, (14336 & 64) != 0 ? k980.DEFAULT : null, (14336 & 128) != 0 ? false : false, (14336 & 256) != 0 ? false : false, (14336 & 512) != 0 ? false : false, (14336 & 1024) != 0 ? null : null, (14336 & 2048) != 0 ? false : false, (14336 & 4096) != 0 ? false : false, false);
            if (!zN0) {
                ej5.c(o8i0.d(l280Var), null, null, new i280(event2, market2, outcome2, l280Var, null), 3);
            } else if (zBooleanValue) {
                eu70 eu70Var = l280Var.B;
                String strB = apg.b(event2, market2);
                String str = l280Var.J;
                eu70Var.getClass();
                str.getClass();
                eu70Var.a.a(new ww70(strB, zBooleanValue2, str), k00.d);
            }
            return Boolean.valueOf(zN0);
        }
    }

    public static final /* synthetic */ class c extends saj implements gaj<Event, Market, Outcome, f8z> {
        @Override // defpackage.gaj
        public final f8z invoke(Event event, Market market, Outcome outcome) {
            Event event2 = event;
            Market market2 = market;
            Outcome outcome2 = outcome;
            event2.getClass();
            market2.getClass();
            outcome2.getClass();
            l280 l280Var = (l280) this.receiver;
            l280Var.getClass();
            z7z z7zVarA = l280Var.y.a(event2, market2, outcome2);
            boolean zW0 = l280Var.w.w0(event2, market2, outcome2);
            z7z.b bVar = z7zVarA instanceof z7z.b ? (z7z.b) z7zVarA : null;
            return new f8z(zW0, bVar != null ? bVar.a : null);
        }
    }

    public static final class d implements PointerInputEventHandler {
        public final /* synthetic */ k4i a;
        public final /* synthetic */ ooa0 b;

        @c0d(c = "com.sportybet.plugin.realsports.searchv2.ui.SearchScreenKt$SearchScreenContent$2$1$1$1", f = "SearchScreen.kt", l = {127}, m = "invokeSuspend", v = 2)
        public static final class a extends ji50 implements Function2<vp1, v1b<? super Unit>, Object> {
            public int b;
            public /* synthetic */ Object c;
            public final /* synthetic */ k4i d;
            public final /* synthetic */ ooa0 e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k4i k4iVar, ooa0 ooa0Var, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.d = k4iVar;
                this.e = ooa0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.d, this.e, v1bVar);
                aVar.c = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vp1 vp1Var, v1b<? super Unit> v1bVar) {
                return ((a) create(vp1Var, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                vp1 vp1Var = (vp1) this.c;
                y5b y5bVar = y5b.a;
                int i = this.b;
                if (i == 0) {
                    uj50.b(obj);
                    c020 c020Var = c020.a;
                    this.c = null;
                    this.b = 1;
                    if (u4f0.b(vp1Var, this, 1) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                this.d.t(false);
                ooa0 ooa0Var = this.e;
                if (ooa0Var != null) {
                    ooa0Var.b();
                }
                return Unit.a;
            }
        }

        public d(k4i k4iVar, ooa0 ooa0Var) {
            this.a = k4iVar;
            this.b = ooa0Var;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
            return dqi.b(u020Var, new a(this.a, this.b, null), v1bVar);
        }
    }

    public static final void a(final q080 q080Var, Function1 function1, final jaj jajVar, final gaj gajVar, final androidx.compose.ui.d dVar, androidx.compose.runtime.a aVar, final int i) {
        final Function1 function2;
        mx70 mx70Var;
        androidx.compose.runtime.b bVarI = aVar.i(-813121743);
        int i2 = i | (bVarI.M(q080Var) ? 4 : 2) | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(jajVar) ? 256 : 128) | (bVarI.A(gajVar) ? 2048 : 1024) | (bVarI.M(dVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            wt70 wt70Var = q080Var.e;
            if (wt70Var instanceof wt70.d) {
                mx70Var = ((wt70.d) wt70Var).a;
            } else {
                mx70Var = wt70Var instanceof wt70.b ? ((wt70.b) wt70Var).a : null;
            }
            if (mx70Var != null) {
                bVarI.N(-93776959);
                my70.b(mx70Var, function1, jajVar, gajVar, dVar, bVarI, (i2 & 112) | 8 | (i2 & 896) | (i2 & 7168) | (i2 & 57344));
                function2 = function1;
                bVarI.X(false);
            } else {
                function2 = function1;
                bVarI.N(-93522666);
                i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
                int iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVar);
                yka.k.getClass();
                tsr.a aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                yka.a.C1350a c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                op8 op8VarB = pp8.b(1657587711, new gaj() { // from class: vy70
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar3 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((jh0) obj).getClass();
                        if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            owx.a(q080Var.a, aVar3, 0);
                        } else {
                            aVar3.G();
                        }
                        return Unit.a;
                    }
                }, bVarI);
                l78 l78Var = l78.a;
                hh0.b(l78Var, wt70Var instanceof wt70.c, null, null, null, null, op8VarB, bVarI, 1572870, 30);
                hh0.b(l78Var, wt70Var instanceof wt70.a, null, null, null, null, pp8.b(1431855080, new gaj() { // from class: wy70
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar3 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((jh0) obj).getClass();
                        if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            Function1 function3 = function2;
                            boolean zM = aVar3.M(function3);
                            Object objY = aVar3.y();
                            if (zM || objY == a.C0041a.a) {
                                objY = new qy70(function3, 0);
                                aVar3.r(objY);
                            }
                            vcg.a((Function0) objY, aVar3, 0);
                        } else {
                            aVar3.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 1572870, 30);
                oz70.c(q080Var, function2, l78Var.a(1.0f, androidx.compose.ui.d.a.b, true), bVarI, i2 & WebSocketProtocol.PAYLOAD_SHORT);
                bVarI.X(true);
                bVarI.X(false);
            }
        } else {
            function2 = function1;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final Function1 function3 = function2;
            eVarZ.d = new Function2(function3, jajVar, gajVar, dVar, i) { // from class: xy70
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ jaj c;
                public final /* synthetic */ gaj d;
                public final /* synthetic */ d e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    yy70.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(l280 l280Var, Function0<Unit> function0, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        l280 l280Var2 = l280Var;
        l280Var2.getClass();
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(1088071053);
        int i2 = (bVarI.A(l280Var2) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16);
        boolean z = true;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            q080 q080Var = (q080) wyh.c(l280Var2.O, bVarI, 0, 7).getValue();
            int i3 = i2 & 14;
            boolean z2 = i3 == 4 || bVarI.A(l280Var2);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a2 = androidx.compose.runtime.a.C0041a.a;
            if (z2 || objY == c0042a2) {
                c0042a = c0042a2;
                a aVar2 = new a(1, l280Var2, l280.class, "onAction", "onAction(Lcom/sportybet/plugin/realsports/searchv2/presentation/SearchAction;)V", 0);
                bVarI.r(aVar2);
                objY = aVar2;
            } else {
                c0042a = c0042a2;
            }
            Function1 function1 = (Function1) ((chp) objY);
            boolean z3 = i3 == 4 || bVarI.A(l280Var2);
            Object objY2 = bVarI.y();
            if (z3 || objY2 == c0042a) {
                b bVar2 = new b(5, l280Var2, l280.class, "onOutcomeClick", "onOutcomeClick(Lcom/sportybet/plugin/realsports/data/Event;Lcom/sportybet/plugin/realsports/data/Market;Lcom/sportybet/plugin/realsports/data/Outcome;ZZ)Z", 0);
                bVarI.r(bVar2);
                objY2 = bVar2;
            }
            jaj jajVar = (jaj) ((chp) objY2);
            if (i3 != 4 && !bVarI.A(l280Var2)) {
                z = false;
            }
            Object objY3 = bVarI.y();
            if (z || objY3 == c0042a) {
                objY3 = new c(3, l280Var2, l280.class, "getOutcomeButtonState", "getOutcomeButtonState(Lcom/sportybet/plugin/realsports/data/Event;Lcom/sportybet/plugin/realsports/data/Market;Lcom/sportybet/plugin/realsports/data/Outcome;)Lcom/sportybet/plugin/realsports/ui/event/OutcomeButtonState;", 0);
                bVarI.r(objY3);
            }
            bVar = bVarI;
            c(q080Var, function1, jajVar, (gaj) ((chp) objY3), function0, bVar, (i2 << 9) & 57344);
            final Activity activity = (Activity) bVar.O(zct.a);
            t340 t340Var = l280Var2.Q;
            boolean zA = bVar.A(activity);
            Object objY4 = bVar.y();
            if (zA || objY4 == c0042a) {
                objY4 = new Function1() { // from class: py70
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        p080 p080Var = (p080) obj;
                        p080Var.getClass();
                        Activity activity2 = activity;
                        if (activity2 == null) {
                            return Unit.a;
                        }
                        if (p080Var instanceof p080.d) {
                            FragmentManager supportFragmentManager = ((fq0) activity2).getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            p080.d dVar = (p080.d) p080Var;
                            String str = dVar.a;
                            String str2 = dVar.b;
                            boolean z4 = dVar.c;
                            str.getClass();
                            str2.getClass();
                            xyd0 xyd0VarA = xyd0.a.a(str, str2, z4, null);
                            androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager);
                            aVar3.e(0, xyd0VarA, "statisticsDialogFragment", 1);
                            aVar3.d();
                        } else if (p080Var.equals(p080.c.a)) {
                            qz3.p(activity2);
                        } else if (p080Var.equals(p080.a.a)) {
                            qz3.m(activity2);
                        } else if (p080Var.equals(p080.b.a)) {
                            qz3.o(activity2);
                        } else {
                            if (!(p080Var instanceof p080.e)) {
                                uhc.a();
                                return null;
                            }
                            ResourceUiText resourceUiText = ((p080.e) p080Var).a;
                            resourceUiText.getClass();
                            Toast.makeText(activity2, resourceUiText.e(activity2).toString(), 0).show();
                        }
                        return Unit.a;
                    }
                };
                bVar.r(objY4);
            }
            abs.a(t340Var, null, null, (Function1) objY4, bVar, 0);
        } else {
            l280Var2 = l280Var2;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new fwb(l280Var2, function0, i);
        }
    }

    public static final void c(final q080 q080Var, final Function1<? super ot70, Unit> function1, final jaj<? super Event, ? super Market, ? super Outcome, ? super Boolean, ? super Boolean, Boolean> jajVar, final gaj<? super Event, ? super Market, ? super Outcome, f8z> gajVar, final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final jaj<? super Event, ? super Market, ? super Outcome, ? super Boolean, ? super Boolean, Boolean> jajVar2;
        final gaj<? super Event, ? super Market, ? super Outcome, f8z> gajVar2;
        androidx.compose.runtime.b bVar;
        q080Var.getClass();
        function1.getClass();
        jajVar.getClass();
        gajVar.getClass();
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(1878337512);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(q080Var) : bVarI.A(q080Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            jajVar2 = jajVar;
            i2 |= bVarI.A(jajVar2) ? 256 : 128;
        } else {
            jajVar2 = jajVar;
        }
        if ((i & 3072) == 0) {
            gajVar2 = gajVar;
            i2 |= bVarI.A(gajVar2) ? 2048 : 1024;
        } else {
            gajVar2 = gajVar;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            final k4i k4iVar = (k4i) bVarI.O(kna.i);
            final ooa0 ooa0Var = (ooa0) bVarI.O(kna.p);
            op8 op8VarB = pp8.b(1742852524, new Function2() { // from class: ry70
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i3 = 2;
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        q080 q080Var2 = q080Var;
                        String str = q080Var2.a;
                        Function1 function2 = function1;
                        boolean zM = aVar2.M(function2);
                        Object objY = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zM || objY == c0042a) {
                            objY = new a33(function2, i3);
                            aVar2.r(objY);
                        }
                        Function1 function3 = (Function1) objY;
                        boolean zM2 = aVar2.M(function2);
                        Object objY2 = aVar2.y();
                        if (zM2 || objY2 == c0042a) {
                            objY2 = new uy70(function2, 0);
                            aVar2.r(objY2);
                        }
                        l080.b(str, function3, (Function1) objY2, function0, q080Var2.e instanceof wt70.b, aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI);
            qyd0 qyd0Var = oib0.a;
            bVar = bVarI;
            hy60.a(null, op8VarB, null, null, null, 0, ((lib0) bVarI.O(qyd0Var)).l0, ((lib0) bVarI.O(qyd0Var)).a, null, pp8.b(-517556681, new gaj() { // from class: sy70
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    tmz tmzVar = (tmz) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    tmzVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(tmzVar) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        d dVarE = h.e(j.e(d.a.b, 1.0f), tmzVar);
                        Unit unit = Unit.a;
                        k4i k4iVar2 = k4iVar;
                        boolean zA = aVar2.A(k4iVar2);
                        ooa0 ooa0Var2 = ooa0Var;
                        boolean zM = zA | aVar2.M(ooa0Var2);
                        Object objY = aVar2.y();
                        if (zM || objY == a.C0041a.a) {
                            objY = new yy70.d(k4iVar2, ooa0Var2);
                            aVar2.r(objY);
                        }
                        yy70.a(q080Var, function1, jajVar2, gajVar2, wje0.a(dVarE, unit, (PointerInputEventHandler) objY), aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 805306416, 317);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ty70
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    yy70.c(q080Var, function1, jajVar, gajVar, function0, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
