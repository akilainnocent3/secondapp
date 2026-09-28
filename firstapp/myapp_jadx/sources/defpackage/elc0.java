package defpackage;

import android.content.Context;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes5.dex */
public final class elc0 implements dlc0 {
    public final Context a;
    public final j1b b;
    public jvd0 c;
    public final ConcurrentHashMap<Integer, Boolean> d = new ConcurrentHashMap<>();
    public final List<Integer> e = b.k(Integer.valueOf(R.string.page_instant_virtual__lottie_sporty_legends_goal), Integer.valueOf(R.string.page_instant_virtual__lottie_sporty_legends_no_goal), Integer.valueOf(R.string.page_instant_virtual__lottie_sporty_legends_half_time), Integer.valueOf(R.string.page_instant_virtual__lottie_sporty_legends_scoreboard), Integer.valueOf(R.string.page_instant_virtual__lottie_sporty_legends_kickoff));

    @c0d(c = "com.sportybet.android.instantwin.data.repository.SportyLegendsSettlementLottiePreCacheHelperImpl$preCache$1", f = "SportyLegendsSettlementLottiePreCacheHelperImpl.kt", l = {43}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: elc0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.instantwin.data.repository.SportyLegendsSettlementLottiePreCacheHelperImpl$preCache$1$1", f = "SportyLegendsSettlementLottiePreCacheHelperImpl.kt", l = {90}, m = "invokeSuspend", v = 2)
        public static final class C0524a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public elc0 a;
            public Iterator b;
            public int c;
            public int d;
            public final /* synthetic */ elc0 e;

            /* JADX INFO: renamed from: elc0$a$a$a, reason: collision with other inner class name */
            public static final class C0525a implements Function1<Throwable, Unit> {
                public final /* synthetic */ yot<xmt> a;
                public final /* synthetic */ c b;
                public final /* synthetic */ b c;

                public C0525a(yot yotVar, c cVar, b bVar) {
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

            /* JADX INFO: renamed from: elc0$a$a$b */
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

            /* JADX INFO: renamed from: elc0$a$a$c */
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
            public C0524a(elc0 elc0Var, v1b<? super C0524a> v1bVar) {
                super(2, v1bVar);
                this.e = elc0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0524a(this.e, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0524a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x002d  */
            /* JADX WARN: Code duplicated, block: B:16:0x0081 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:23:0x0047 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:25:? A[LOOP:0: B:9:0x0027->B:25:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x007f -> B:17:0x0082). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // defpackage.pz1
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    y5b r0 = defpackage.y5b.a
                    int r1 = r9.d
                    r2 = 1
                    if (r1 == 0) goto L1a
                    if (r1 != r2) goto L13
                    int r1 = r9.c
                    java.util.Iterator r3 = r9.b
                    elc0 r4 = r9.a
                    defpackage.uj50.b(r10)
                    goto L82
                L13:
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r9)
                    r9 = 0
                    return r9
                L1a:
                    defpackage.uj50.b(r10)
                    elc0 r10 = r9.e
                    java.util.List<java.lang.Integer> r1 = r10.e
                    java.util.Iterator r1 = r1.iterator()
                    r4 = r10
                    r3 = r1
                L27:
                    boolean r10 = r3.hasNext()
                    if (r10 == 0) goto L97
                    java.lang.Object r10 = r3.next()
                    java.lang.Number r10 = (java.lang.Number) r10
                    int r1 = r10.intValue()
                    android.content.Context r10 = r4.a
                    java.lang.String r10 = r10.getString(r1)
                    r10.getClass()
                    int r5 = r10.length()
                    if (r5 != 0) goto L47
                    goto L27
                L47:
                    r9.a = r4
                    r9.b = r3
                    r9.c = r1
                    r9.d = r2
                    bc6 r5 = new bc6
                    v1b r6 = defpackage.yzo.b(r9)
                    r5.<init>(r2, r6)
                    r5.q()
                    android.content.Context r6 = r4.a
                    yot r10 = defpackage.lnt.i(r6, r10)
                    elc0$a$a$c r6 = new elc0$a$a$c
                    r6.<init>(r5)
                    elc0$a$a$b r7 = new elc0$a$a$b
                    r7.<init>(r5)
                    r10.b(r6)
                    r10.a(r7)
                    elc0$a$a$a r8 = new elc0$a$a$a
                    r8.<init>(r10, r6, r7)
                    r5.t(r8)
                    java.lang.Object r10 = r5.o()
                    y5b r5 = defpackage.y5b.a
                    if (r10 != r0) goto L82
                    return r0
                L82:
                    java.lang.Boolean r10 = (java.lang.Boolean) r10
                    boolean r10 = r10.booleanValue()
                    if (r10 == 0) goto L27
                    java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Boolean> r10 = r4.d
                    java.lang.Integer r5 = new java.lang.Integer
                    r5.<init>(r1)
                    java.lang.Boolean r1 = java.lang.Boolean.TRUE
                    r10.put(r5, r1)
                    goto L27
                L97:
                    kotlin.Unit r9 = kotlin.Unit.a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: elc0.a.C0524a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return elc0.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    C0524a c0524a = new C0524a(elc0.this, null);
                    this.a = 1;
                    if (vxf0.b(RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS, c0524a, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
            } catch (Exception unused) {
            }
            return Unit.a;
        }
    }

    public elc0(Context context, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        this.a = context;
        this.b = w5b.a(CoroutineContext.Element.a.d(lfe0.a(), oddVar));
    }

    @Override // defpackage.dlc0
    public final void a() {
        jvd0 jvd0Var = this.c;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.c = ej5.c(this.b, null, null, new a(null), 3);
    }

    @Override // defpackage.dlc0
    public final boolean b() {
        List<Integer> list = this.e;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!Intrinsics.g(this.d.get(Integer.valueOf(((Number) it.next()).intValue())), Boolean.TRUE)) {
                return false;
            }
        }
        return true;
    }
}
