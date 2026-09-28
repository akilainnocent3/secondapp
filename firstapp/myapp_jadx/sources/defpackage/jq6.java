package defpackage;

import com.sportybet.plugin.event.EventActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class jq6 implements gq6 {
    public final fr6 a;
    public final wwd0 b = xwd0.a(new wyy(0));
    public final wwd0 c;

    public static final class a implements lyh<wyy> {
        public final /* synthetic */ wwd0 a;
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: jq6$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.cashoutphase3.data.manager.CashoutOpenBetsCountManagerImpl$getOpenBetCountFlow$$inlined$map$1", f = "CashoutOpenBetsCountManagerImpl.kt", l = {109}, m = "collect", v = 2)
        public static final class C0735a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0735a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ String b;

            /* JADX INFO: renamed from: jq6$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.android.cashoutphase3.data.manager.CashoutOpenBetsCountManagerImpl$getOpenBetCountFlow$$inlined$map$1$2", f = "CashoutOpenBetsCountManagerImpl.kt", l = {50}, m = "emit", v = 2)
            public static final class C0736a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0736a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, String str) {
                this.a = myhVar;
                this.b = str;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0736a c0736a;
                if (v1bVar instanceof C0736a) {
                    c0736a = (C0736a) v1bVar;
                    int i = c0736a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0736a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0736a = new C0736a(v1bVar);
                    }
                } else {
                    c0736a = new C0736a(v1bVar);
                }
                Object obj2 = c0736a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0736a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    wyy wyyVar = (wyy) ((Map) obj).get(this.b);
                    if (wyyVar == null) {
                        wyyVar = new wyy(0);
                    }
                    c0736a.b = 1;
                    if (this.a.emit(wyyVar, c0736a) == y5bVar) {
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

        public a(wwd0 wwd0Var, String str) {
            this.a = wwd0Var;
            this.b = str;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super wyy> myhVar, v1b v1bVar) throws Throwable {
            C0735a c0735a;
            if (v1bVar instanceof C0735a) {
                c0735a = (C0735a) v1bVar;
                int i = c0735a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0735a.b = i - Integer.MIN_VALUE;
                } else {
                    c0735a = new C0735a(v1bVar);
                }
            } else {
                c0735a = new C0735a(v1bVar);
            }
            Object obj = c0735a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0735a.b;
            if (i2 != 0) {
                if (i2 == 1) {
                    uj50.b(obj);
                    return Unit.a;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            b bVar = new b(myhVar, this.b);
            c0735a.b = 1;
            this.a.collect(bVar, c0735a);
            return y5bVar;
        }
    }

    public jq6(fr6 fr6Var, qqe0 qqe0Var) {
        this.a = fr6Var;
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.c = xwd0.a(o2gVar);
    }

    @Override // defpackage.gq6
    public final wyy a(String str) {
        wyy wyyVar = (wyy) ((Map) this.c.getValue()).get(str);
        return wyyVar == null ? new wyy(0) : wyyVar;
    }

    @Override // defpackage.gq6
    public final void b(String str, nas nasVar, boolean z, EventActivity.f fVar) {
        ej5.c(nasVar, null, null, new iq6(fVar, this, str, z, null), 3);
    }

    @Override // defpackage.gq6
    public final lyh<wyy> c(String str) {
        return str != null ? new a(this.c, str) : this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, boolean z, x1b x1bVar) {
        hq6 hq6Var;
        Object value;
        Object value2;
        LinkedHashMap linkedHashMapM;
        if (x1bVar instanceof hq6) {
            hq6Var = (hq6) x1bVar;
            int i = hq6Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hq6Var.d = i - Integer.MIN_VALUE;
            } else {
                hq6Var = new hq6(this, x1bVar);
            }
        } else {
            hq6Var = new hq6(this, x1bVar);
        }
        Object objH = hq6Var.b;
        y5b y5bVar = y5b.a;
        int i2 = hq6Var.d;
        wwd0 wwd0Var = this.b;
        wwd0 wwd0Var2 = this.c;
        if (i2 == 0) {
            uj50.b(objH);
            wyy wyyVar = str != null ? (wyy) ((Map) wwd0Var2.getValue()).get(str) : (wyy) wwd0Var.getValue();
            if (wyyVar != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Long l = wyyVar.c;
                if (jCurrentTimeMillis - (l != null ? l.longValue() : 0L) <= 5000 && !z) {
                    return wyyVar;
                }
            }
            hq6Var.a = str;
            hq6Var.d = 1;
            objH = this.a.h(str, hq6Var);
            if (objH == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = hq6Var.a;
            uj50.b(objH);
        }
        wyy wyyVar2 = (wyy) objH;
        if (str != null) {
            do {
                value2 = wwd0Var2.getValue();
                linkedHashMapM = kpu.m((Map) value2);
                linkedHashMapM.put(str, wyyVar2);
            } while (!wwd0Var2.g(value2, linkedHashMapM));
        } else {
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, wyyVar2));
        }
        return wyyVar2;
    }
}
