package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.cashout.CashoutFallbackSettingsDto;
import com.sporty.android.core.model.cashout.CashoutJsData;
import com.sporty.android.core.model.cashout.EventInfoTrackingWidgetEnabledConfigs;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class ep6 implements yo6 {
    public final fr6 a;
    public final j1b b;
    public jvd0 c;
    public final wwd0 d = xwd0.a(new xo6(0));
    public final wwd0 e = xwd0.a(Boolean.FALSE);
    public final wwd0 f = xwd0.a(null);
    public final wwd0 g = xwd0.a(null);
    public final wwd0 h = xwd0.a(null);
    public final wwd0 i;

    @c0d(c = "com.sportybet.android.cashoutphase3.data.manager.CashoutConfigManagerImpl$fetchCashoutNecessaryConfigs$1", f = "CashoutConfigManagerImpl.kt", l = {47}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: ep6$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.cashoutphase3.data.manager.CashoutConfigManagerImpl$fetchCashoutNecessaryConfigs$1$1", f = "CashoutConfigManagerImpl.kt", l = {57, 61}, m = "invokeSuspend", v = 2)
        public static final class C0533a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public pjd a;
            public int b;
            public /* synthetic */ Object c;
            public final /* synthetic */ ep6 d;

            /* JADX INFO: renamed from: ep6$a$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.android.cashoutphase3.data.manager.CashoutConfigManagerImpl$fetchCashoutNecessaryConfigs$1$1$boConfigsDeferred$1", f = "CashoutConfigManagerImpl.kt", l = {50}, m = "invokeSuspend", v = 2)
            public static final class C0534a extends tje0 implements Function2<v5b, v1b<? super xo6>, Object> {
                public int a;
                public final /* synthetic */ ep6 b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0534a(ep6 ep6Var, v1b<? super C0534a> v1bVar) {
                    super(2, v1bVar);
                    this.b = ep6Var;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new C0534a(this.b, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super xo6> v1bVar) {
                    return ((C0534a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    int i = this.a;
                    if (i == 0) {
                        uj50.b(obj);
                        this.a = 1;
                        Object objK = this.b.k(this);
                        return objK == y5bVar ? y5bVar : objK;
                    }
                    if (i == 1) {
                        uj50.b(obj);
                        return obj;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }

            /* JADX INFO: renamed from: ep6$a$a$b */
            @c0d(c = "com.sportybet.android.cashoutphase3.data.manager.CashoutConfigManagerImpl$fetchCashoutNecessaryConfigs$1$1$cashoutJsDataDeferred$1", f = "CashoutConfigManagerImpl.kt", l = {54}, m = "invokeSuspend", v = 2)
            public static final class b extends tje0 implements Function2<v5b, v1b<? super CashoutJsData>, Object> {
                public int a;
                public final /* synthetic */ ep6 b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(ep6 ep6Var, v1b<? super b> v1bVar) {
                    super(2, v1bVar);
                    this.b = ep6Var;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new b(this.b, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super CashoutJsData> v1bVar) {
                    return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    int i = this.a;
                    if (i == 0) {
                        uj50.b(obj);
                        this.a = 1;
                        Object objL = this.b.l(this);
                        return objL == y5bVar ? y5bVar : objL;
                    }
                    if (i == 1) {
                        uj50.b(obj);
                        return obj;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0533a(ep6 ep6Var, v1b<? super C0533a> v1bVar) {
                super(2, v1bVar);
                this.d = ep6Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0533a c0533a = new C0533a(this.d, v1bVar);
                c0533a.c = obj;
                return c0533a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0533a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
            
                if (r7.j(r0, "fetchCashoutJsData", r10) == r1) goto L15;
             */
            @Override // defpackage.pz1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = r10.c
                    v5b r0 = (defpackage.v5b) r0
                    y5b r1 = defpackage.y5b.a
                    int r2 = r10.b
                    r3 = 0
                    java.lang.String r4 = "SB_CASHOUT_CONFIG"
                    r5 = 2
                    r6 = 1
                    ep6 r7 = r10.d
                    r8 = 0
                    if (r2 == 0) goto L26
                    if (r2 == r6) goto L20
                    if (r2 != r5) goto L1a
                    defpackage.uj50.b(r11)
                    goto L66
                L1a:
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r10)
                    return r8
                L20:
                    pjd r0 = r10.a
                    defpackage.uj50.b(r11)
                    goto L57
                L26:
                    defpackage.uj50.b(r11)
                    itf0$a r11 = defpackage.itf0.a
                    r11.q(r4)
                    java.lang.String r2 = "start fetching cashout necessary configs."
                    java.lang.Object[] r9 = new java.lang.Object[r3]
                    r11.g(r2, r9)
                    ep6$a$a$a r11 = new ep6$a$a$a
                    r11.<init>(r7, r8)
                    r2 = 3
                    pjd r11 = defpackage.ej5.a(r0, r8, r11, r2)
                    ep6$a$a$b r9 = new ep6$a$a$b
                    r9.<init>(r7, r8)
                    pjd r0 = defpackage.ej5.a(r0, r8, r9, r2)
                    r10.c = r8
                    r10.a = r0
                    r10.b = r6
                    java.lang.String r2 = "fetchBOConfigs"
                    java.lang.Object r11 = r7.j(r11, r2, r10)
                    if (r11 != r1) goto L57
                    goto L65
                L57:
                    r10.c = r8
                    r10.a = r8
                    r10.b = r5
                    java.lang.String r11 = "fetchCashoutJsData"
                    java.lang.Object r10 = r7.j(r0, r11, r10)
                    if (r10 != r1) goto L66
                L65:
                    return r1
                L66:
                    itf0$a r10 = defpackage.itf0.a
                    r10.q(r4)
                    java.lang.String r11 = "cashout necessary configs fetch done."
                    java.lang.Object[] r0 = new java.lang.Object[r3]
                    r10.g(r11, r0)
                    kotlin.Unit r10 = kotlin.Unit.a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: ep6.a.C0533a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ep6.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                C0533a c0533a = new C0533a(ep6.this, null);
                this.a = 1;
                jfe0 jfe0Var = new jfe0(this, getContext());
                if (mdh0.a(jfe0Var, true, jfe0Var, c0533a) == y5bVar) {
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

    public ep6(fr6 fr6Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        this.a = fr6Var;
        this.b = w5b.a(CoroutineContext.Element.a.d(lfe0.a(), k5bVar).plus(new gp6(l5b.a.a)));
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.i = xwd0.a(o2gVar);
    }

    @Override // defpackage.yo6
    public final CashoutJsData a() {
        return (CashoutJsData) this.f.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.yo6
    public final Object b(x1b x1bVar) {
        fp6 fp6Var;
        if (x1bVar instanceof fp6) {
            fp6Var = (fp6) x1bVar;
            int i = fp6Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fp6Var.c = i - Integer.MIN_VALUE;
            } else {
                fp6Var = new fp6(this, x1bVar);
            }
        } else {
            fp6Var = new fp6(this, x1bVar);
        }
        Object objF = fp6Var.a;
        y5b y5bVar = y5b.a;
        int i2 = fp6Var.c;
        if (i2 == 0) {
            uj50.b(objF);
            fp6Var.c = 1;
            objF = this.a.f(fp6Var);
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
        EventInfoTrackingWidgetEnabledConfigs eventInfoTrackingWidgetEnabledConfigs = (EventInfoTrackingWidgetEnabledConfigs) objF;
        this.g.setValue(eventInfoTrackingWidgetEnabledConfigs);
        return eventInfoTrackingWidgetEnabledConfigs;
    }

    @Override // defpackage.yo6
    public final EventInfoTrackingWidgetEnabledConfigs c() {
        return (EventInfoTrackingWidgetEnabledConfigs) this.g.getValue();
    }

    @Override // defpackage.yo6
    public final xo6 d() {
        return (xo6) this.d.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.yo6
    public final Object e(String str, x1b x1bVar) {
        cp6 cp6Var;
        wwd0 wwd0Var;
        Object value;
        LinkedHashMap linkedHashMapM;
        if (x1bVar instanceof cp6) {
            cp6Var = (cp6) x1bVar;
            int i = cp6Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cp6Var.d = i - Integer.MIN_VALUE;
            } else {
                cp6Var = new cp6(this, x1bVar);
            }
        } else {
            cp6Var = new cp6(this, x1bVar);
        }
        Object objC = cp6Var.b;
        y5b y5bVar = y5b.a;
        int i2 = cp6Var.d;
        if (i2 == 0) {
            uj50.b(objC);
            cp6Var.a = str;
            cp6Var.d = 1;
            objC = this.a.c(str, cp6Var);
            if (objC == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = cp6Var.a;
            uj50.b(objC);
        }
        CashoutFallbackSettingsDto cashoutFallbackSettingsDto = (CashoutFallbackSettingsDto) objC;
        if (str == null) {
            this.h.setValue(cashoutFallbackSettingsDto);
            return cashoutFallbackSettingsDto;
        }
        do {
            wwd0Var = this.i;
            value = wwd0Var.getValue();
            linkedHashMapM = kpu.m((Map) value);
            linkedHashMapM.put(str, cashoutFallbackSettingsDto);
        } while (!wwd0Var.g(value, linkedHashMapM));
        return cashoutFallbackSettingsDto;
    }

    @Override // defpackage.yo6
    public final void f(boolean z) {
        wwd0 wwd0Var;
        Object value;
        CashoutJsData cashoutJsData;
        do {
            wwd0Var = this.f;
            value = wwd0Var.getValue();
            cashoutJsData = (CashoutJsData) value;
        } while (!wwd0Var.g(value, cashoutJsData != null ? CashoutJsData.copy$default(cashoutJsData, false, null, null, null, null, Boolean.valueOf(z), null, null, 223, null) : null));
    }

    @Override // defpackage.yo6
    public final v340 g() {
        return e1i.b(this.d);
    }

    @Override // defpackage.yo6
    public final boolean h() {
        return ((Boolean) this.e.getValue()).booleanValue() && this.f.getValue() != null;
    }

    @Override // defpackage.yo6
    public final c9p i() {
        jvd0 jvd0Var = this.c;
        if (jvd0Var != null) {
            return jvd0Var;
        }
        final jvd0 jvd0VarC = ej5.c(this.b, null, null, new a(null), 3);
        this.c = jvd0VarC;
        jvd0VarC.invokeOnCompletion(new Function1() { // from class: zo6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ep6 ep6Var = this.a;
                if (ep6Var.c == jvd0VarC) {
                    ep6Var.c = null;
                }
                return Unit.a;
            }
        });
        return jvd0VarC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(ojd ojdVar, String str, x1b x1bVar) {
        ap6 ap6Var;
        if (x1bVar instanceof ap6) {
            ap6Var = (ap6) x1bVar;
            int i = ap6Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ap6Var.d = i - Integer.MIN_VALUE;
            } else {
                ap6Var = new ap6(this, x1bVar);
            }
        } else {
            ap6Var = new ap6(this, x1bVar);
        }
        Object obj = ap6Var.b;
        y5b y5bVar = y5b.a;
        int i2 = ap6Var.d;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                ap6Var.a = str;
                ap6Var.d = 1;
                if (ojdVar.await(ap6Var) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = ap6Var.a;
                uj50.b(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_CASHOUT_CONFIG);
            aVar.o(th);
            w950.a("CashoutConfigManagerImpl", str, th, null);
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(x1b x1bVar) {
        bp6 bp6Var;
        wwd0 wwd0Var;
        Object value;
        if (x1bVar instanceof bp6) {
            bp6Var = (bp6) x1bVar;
            int i = bp6Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bp6Var.c = i - Integer.MIN_VALUE;
            } else {
                bp6Var = new bp6(this, x1bVar);
            }
        } else {
            bp6Var = new bp6(this, x1bVar);
        }
        Object objD = bp6Var.a;
        y5b y5bVar = y5b.a;
        int i2 = bp6Var.c;
        if (i2 == 0) {
            uj50.b(objD);
            bp6Var.c = 1;
            fr6 fr6Var = this.a;
            objD = ej5.d(fr6Var.f, new sq6(fr6Var, null), bp6Var);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        xo6 xo6Var = (xo6) objD;
        this.d.setValue(xo6Var);
        do {
            wwd0Var = this.e;
            value = wwd0Var.getValue();
            ((Boolean) value).getClass();
        } while (!wwd0Var.g(value, Boolean.TRUE));
        return xo6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(x1b x1bVar) {
        dp6 dp6Var;
        if (x1bVar instanceof dp6) {
            dp6Var = (dp6) x1bVar;
            int i = dp6Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dp6Var.c = i - Integer.MIN_VALUE;
            } else {
                dp6Var = new dp6(this, x1bVar);
            }
        } else {
            dp6Var = new dp6(this, x1bVar);
        }
        Object objE = dp6Var.a;
        y5b y5bVar = y5b.a;
        int i2 = dp6Var.c;
        if (i2 == 0) {
            uj50.b(objE);
            dp6Var.c = 1;
            objE = this.a.e(dp6Var);
            if (objE == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objE);
        }
        CashoutJsData cashoutJsData = (CashoutJsData) objE;
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_CASHOUT);
        aVar.g(cashoutJsData.toString(), new Object[0]);
        this.f.k(null, cashoutJsData);
        return cashoutJsData;
    }
}
