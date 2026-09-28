package defpackage;

import android.content.Context;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class y2f implements x2f {
    public final Context a;
    public final j1b b;
    public final ngs c;
    public final ConcurrentHashMap.KeySetView<String, Boolean> d;
    public jvd0 e;

    @c0d(c = "com.sportybet.android.instantwin.data.repository.DoubleOrNothingLottiePreCacheHelperImpl$preCache$1", f = "DoubleOrNothingLottiePreCacheHelperImpl.kt", l = {72}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        /* JADX INFO: renamed from: y2f$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.instantwin.data.repository.DoubleOrNothingLottiePreCacheHelperImpl$preCache$1$2$1", f = "DoubleOrNothingLottiePreCacheHelperImpl.kt", l = {87}, m = "invokeSuspend", v = 2)
        public static final class C1318a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ y2f b;
            public final /* synthetic */ String c;

            /* JADX INFO: renamed from: y2f$a$a$a, reason: collision with other inner class name */
            public static final class C1319a implements Function1<Throwable, Unit> {
                public final /* synthetic */ yot<xmt> a;
                public final /* synthetic */ c b;
                public final /* synthetic */ b c;

                public C1319a(yot yotVar, c cVar, b bVar) {
                    this.a = yotVar;
                    this.b = cVar;
                    this.c = bVar;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Throwable th) {
                    yot<xmt> yotVar = this.a;
                    c cVar = this.b;
                    synchronized (yotVar) {
                        yotVar.a.remove(cVar);
                    }
                    b bVar = this.c;
                    synchronized (yotVar) {
                        yotVar.b.remove(bVar);
                    }
                    return Unit.a;
                }
            }

            /* JADX INFO: renamed from: y2f$a$a$b */
            public static final class b<T> implements qot {
                public final /* synthetic */ bc6 a;

                public b(bc6 bc6Var) {
                    this.a = bc6Var;
                }

                @Override // defpackage.qot
                public final void onResult(Object obj) {
                    bc6 bc6Var = this.a;
                    if (bc6Var.p() instanceof bzx) {
                        zi50.a aVar = zi50.b;
                        bc6Var.resumeWith(Boolean.FALSE);
                    }
                }
            }

            /* JADX INFO: renamed from: y2f$a$a$c */
            public static final class c<T> implements qot {
                public final /* synthetic */ bc6 a;

                public c(bc6 bc6Var) {
                    this.a = bc6Var;
                }

                @Override // defpackage.qot
                public final void onResult(Object obj) {
                    bc6 bc6Var = this.a;
                    if (bc6Var.p() instanceof bzx) {
                        zi50.a aVar = zi50.b;
                        bc6Var.resumeWith(Boolean.TRUE);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1318a(y2f y2fVar, String str, v1b<? super C1318a> v1bVar) {
                super(2, v1bVar);
                this.b = y2fVar;
                this.c = str;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C1318a(this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1318a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                y2f y2fVar = this.b;
                String str = this.c;
                try {
                    if (i == 0) {
                        uj50.b(obj);
                        this.a = 1;
                        bc6 bc6Var = new bc6(1, yzo.b(this));
                        bc6Var.q();
                        yot<xmt> yotVarI = lnt.i(y2fVar.a, str);
                        c cVar = new c(bc6Var);
                        b bVar = new b(bc6Var);
                        yotVarI.b(cVar);
                        yotVarI.a(bVar);
                        bc6Var.t(new C1319a(yotVarI, cVar, bVar));
                        obj = bc6Var.o();
                        if (obj == y5bVar) {
                            return y5bVar;
                        }
                    } else {
                        if (i != 1) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uj50.b(obj);
                    }
                    if (((Boolean) obj).booleanValue()) {
                        y2fVar.d.add(str);
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    itf0.a.p(th, "Failed to pre-cache DON Lottie: %s", str);
                }
                return Unit.a;
            }
        }

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = y2f.this.new a(v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                y2f y2fVar = y2f.this;
                ngs ngsVar = y2fVar.c;
                ConcurrentHashMap.KeySetView<String, Boolean> keySetView = y2fVar.d;
                keySetView.getClass();
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                ListIterator listIterator = ngsVar.listIterator(0);
                while (true) {
                    ngs.c cVar = (ngs.c) listIterator;
                    if (!cVar.hasNext()) {
                        break;
                    }
                    Object next = cVar.next();
                    if (!keySetView.contains((String) next)) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    arrayList2.add(ej5.a(v5bVar, null, new C1318a(y2fVar, (String) obj2, null), 3));
                }
                this.b = null;
                this.a = 1;
                if (up1.a(arrayList2, this) == y5bVar) {
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

    public y2f(Context context, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        this.a = context;
        this.b = w5b.a(CoroutineContext.Element.a.d(lfe0.a(), k5bVar));
        List<String> list = b3f.a;
        ngs ngsVarB = kotlin.collections.a.b();
        ngsVarB.add("https://s.sporty.net/cms/don_fire_indicator_5be88e73aa.json");
        ngsVarB.add("https://s.sporty.net/cms/GK_idle_7e623b53be.json");
        ngsVarB.add("https://s.sporty.net/cms/PL_idle_39f33c3038.json");
        ngsVarB.add("https://s.sporty.net/cms/PL_kick_ceb91b0891.json");
        ngsVarB.add("https://s.sporty.net/cms/Sporty_Penalty_Winning_6ef3822b22.json");
        ngsVarB.addAll(b3f.a);
        ngsVarB.addAll(b3f.c);
        ngsVarB.addAll(b3f.b);
        this.c = kotlin.collections.a.a(ngsVarB);
        this.d = ConcurrentHashMap.newKeySet();
    }

    @Override // defpackage.x2f
    public final void a() {
        if (b()) {
            return;
        }
        jvd0 jvd0Var = this.e;
        if (jvd0Var == null || !jvd0Var.isActive()) {
            this.e = ej5.c(this.b, null, null, new a(null), 3);
        }
    }

    @Override // defpackage.x2f
    public final boolean b() {
        ngs.c cVar;
        ConcurrentHashMap.KeySetView<String, Boolean> keySetView = this.d;
        keySetView.getClass();
        ngs ngsVar = this.c;
        if (ngsVar != null && ngsVar.isEmpty()) {
            return true;
        }
        ListIterator listIterator = ngsVar.listIterator(0);
        do {
            cVar = (ngs.c) listIterator;
            if (!cVar.hasNext()) {
                return true;
            }
        } while (keySetView.contains((String) cVar.next()));
        return false;
    }

    @Override // defpackage.x2f
    public final synchronized void c() {
        try {
            jvd0 jvd0Var = this.e;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            this.e = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
