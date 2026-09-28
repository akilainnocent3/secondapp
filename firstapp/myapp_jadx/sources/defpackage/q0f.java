package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.time.c;

/* JADX INFO: loaded from: classes5.dex */
public final class q0f implements o0f {
    public static final long d;
    public final br5 a;
    public final j1b b;
    public jvd0 c;

    @c0d(c = "com.sportybet.android.instantwin.data.repository.DoubleOrNothingAudioPreloaderImpl$preload$1", f = "DoubleOrNothingAudioPreloaderImpl.kt", l = {DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: q0f$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.instantwin.data.repository.DoubleOrNothingAudioPreloaderImpl$preload$1$1", f = "DoubleOrNothingAudioPreloaderImpl.kt", l = {68}, m = "invokeSuspend", v = 2)
        public static final class C0991a extends tje0 implements Function2<v5b, v1b<? super List<? extends Unit>>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ q0f c;

            /* JADX INFO: renamed from: q0f$a$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.android.instantwin.data.repository.DoubleOrNothingAudioPreloaderImpl$preload$1$1$1$1", f = "DoubleOrNothingAudioPreloaderImpl.kt", l = {51}, m = "invokeSuspend", v = 2)
            public static final class C0992a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ String b;
                public final /* synthetic */ gr5.a c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0992a(String str, gr5.a aVar, v1b<? super C0992a> v1bVar) {
                    super(2, v1bVar);
                    this.b = str;
                    this.c = aVar;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new C0992a(this.b, this.c, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                    return ((C0992a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) throws Exception {
                    y5b y5bVar = y5b.a;
                    int i = this.a;
                    String str = this.b;
                    try {
                        if (i == 0) {
                            uj50.b(obj);
                            p0f p0fVar = new p0f(0, this.c, str);
                            this.a = 1;
                            if (cft.f(p0fVar, this) == y5bVar) {
                                return y5bVar;
                            }
                        } else {
                            if (i != 1) {
                                ib5.a("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            uj50.b(obj);
                        }
                    } catch (Exception e) {
                        if (e instanceof CancellationException) {
                            throw e;
                        }
                        itf0.a aVar = itf0.a;
                        aVar.f(e, yv0.a(aVar, "DONAudioPreloader", "Failed to preload audio: ", str), new Object[0]);
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0991a(q0f q0fVar, v1b<? super C0991a> v1bVar) {
                super(2, v1bVar);
                this.c = q0fVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0991a c0991a = new C0991a(this.c, v1bVar);
                c0991a.b = obj;
                return c0991a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super List<? extends Unit>> v1bVar) {
                return ((C0991a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                v5b v5bVar = (v5b) this.b;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        uj50.b(obj);
                        return obj;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                gr5.a aVar = new gr5.a();
                aVar.a = this.c.a;
                aVar.c = new idd.a();
                List<String> list = b3f.a;
                List listK = b.k("https://s.sporty.net/cms/Laliga_penalty_Goal_2d1661a455.mp3", "https://s.sporty.net/cms/Laliga_penalty_Kick_2b3ca52200.mp3", "https://s.sporty.net/cms/Laliga_penalty_Click_6083677df3.mp3", "https://s.sporty.net/cms/Laliga_penalty_NO_goal_c5652fcf1c.mp3", "https://s.sporty.net/cms/Laliga_penalty_Win_the_prize_65ed154510.mp3");
                ArrayList arrayList = new ArrayList(l48.r(listK, 10));
                Iterator it = listK.iterator();
                while (it.hasNext()) {
                    arrayList.add(ej5.a(v5bVar, null, new C0992a((String) it.next(), aVar, null), 3));
                }
                this.b = null;
                this.a = 1;
                Object objA = up1.a(arrayList, this);
                return objA == y5bVar ? y5bVar : objA;
            }
        }

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return q0f.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Exception {
            y5b y5bVar = y5b.a;
            int i = this.a;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    long j = q0f.d;
                    C0991a c0991a = new C0991a(q0f.this, null);
                    this.a = 1;
                    if (vxf0.b(hkd.e(j), c0991a, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
            } catch (Exception e) {
                if (e instanceof CancellationException) {
                    throw e;
                }
                itf0.a aVar = itf0.a;
                aVar.q("DONAudioPreloader");
                aVar.f(e, "Audio preload failed", new Object[0]);
            }
            return Unit.a;
        }
    }

    static {
        kotlin.time.b.a aVar = kotlin.time.b.b;
        d = c.h(30, rgf.SECONDS);
    }

    public q0f(br5 br5Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        this.a = br5Var;
        this.b = w5b.a(CoroutineContext.Element.a.d(lfe0.a(), k5bVar));
    }

    @Override // defpackage.o0f
    public final void a() {
        jvd0 jvd0Var = this.c;
        if (jvd0Var == null || !jvd0Var.isActive()) {
            this.c = ej5.c(this.b, null, null, new a(null), 3);
        }
    }
}
