package defpackage;

import com.sporty.android.core.model.dispatcher.ApplicationScope;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
public final class ich {
    public final m2l a;
    public final v5b b;
    public final ConcurrentHashMap<String, Boolean> c;

    @c0d(c = "com.sportybet.datastore.FeatureHintShownCache$1", f = "FeatureHintShownCache.kt", l = {48}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: ich$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.datastore.FeatureHintShownCache$1$1", f = "FeatureHintShownCache.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0673a extends tje0 implements gaj<myh<? super zn20>, Throwable, v1b<? super Unit>, Object> {
            public /* synthetic */ Throwable a;

            @Override // defpackage.gaj
            public final Object invoke(myh<? super zn20> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
                C0673a c0673a = new C0673a(3, v1bVar);
                c0673a.a = th;
                return c0673a.invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                Throwable th = this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                itf0.a.f(th, "FeatureHintShownCache prewarm failed", new Object[0]);
                return Unit.a;
            }
        }

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ich.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            ich ichVar = ich.this;
            if (i == 0) {
                uj50.b(obj);
                yzh yzhVar = new yzh(ichVar.a.a.a.k(), new C0673a(3, null));
                this.a = 1;
                obj = s0i.c(yzhVar, this);
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
            zn20 zn20Var = (zn20) obj;
            if (zn20Var != null) {
                for (Map.Entry<zn20.a<?>, Object> entry : zn20Var.a().entrySet()) {
                    zn20.a<?> key = entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof Boolean) {
                        ichVar.c.putIfAbsent(key.a, (Boolean) value);
                    }
                }
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.datastore.FeatureHintShownCache$markShown$1", f = "FeatureHintShownCache.kt", l = {WebSocketProtocol.B0_FLAG_RSV1}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ich.this.new b(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                m2l m2lVar = ich.this.a;
                Boolean bool = Boolean.TRUE;
                this.a = 1;
                if (m2lVar.a.putBoolean(this.c, bool, this) == y5bVar) {
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

    public ich(m2l m2lVar, @ApplicationScope v5b v5bVar) {
        m2lVar.getClass();
        v5bVar.getClass();
        this.a = m2lVar;
        this.b = v5bVar;
        this.c = new ConcurrentHashMap<>();
        ej5.c(v5bVar, null, null, new a(null), 3);
    }

    public final boolean a(String str) {
        Boolean bool = this.c.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void b(String str) {
        this.c.put(str, Boolean.TRUE);
        ej5.c(this.b, null, null, new b(str, null), 3);
    }
}
