package defpackage;

import android.util.Log;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
public final class hj80 implements fj80 {
    public final CoroutineContext a;
    public final vwf0 b;
    public final sqc<yf80> c;
    public final AtomicReference<yf80> d;

    @c0d(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$1", f = "SettingsCache.kt", l = {73}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: hj80$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0644a implements myh, paj {
            public final /* synthetic */ AtomicReference<yf80> a;

            public C0644a(AtomicReference<yf80> atomicReference) {
                this.a = atomicReference;
            }

            @Override // defpackage.paj
            public final haj<?> c() {
                return new pf(2, this.a, AtomicReference.class, "set", "set(Ljava/lang/Object;)V", 4);
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                this.a.set((yf80) obj);
                Unit unit = Unit.a;
                y5b y5bVar = y5b.a;
                return unit;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof myh) && (obj instanceof paj)) {
                    return Intrinsics.g(c(), ((paj) obj).c());
                }
                return false;
            }

            public final int hashCode() {
                return c().hashCode();
            }
        }

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return hj80.this.new a(v1bVar);
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
                hj80 hj80Var = hj80.this;
                lyh<yf80> lyhVarK = hj80Var.c.k();
                C0644a c0644a = new C0644a(hj80Var.d);
                this.a = 1;
                if (lyhVarK.collect(c0644a, this) == y5bVar) {
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

    @c0d(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$sessionConfigs$1", f = "SettingsCache.kt", l = {WebSocketProtocol.B0_FLAG_RSV1}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<v5b, v1b<? super yf80>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return hj80.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super yf80> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
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
            lyh<yf80> lyhVarK = hj80.this.c.k();
            this.a = 1;
            Object objA = s0i.a(lyhVarK, this);
            return objA == y5bVar ? y5bVar : objA;
        }
    }

    public hj80(@is1 CoroutineContext coroutineContext, vwf0 vwf0Var, sqc<yf80> sqcVar) {
        coroutineContext.getClass();
        vwf0Var.getClass();
        sqcVar.getClass();
        this.a = coroutineContext;
        this.b = vwf0Var;
        this.c = sqcVar;
        this.d = new AtomicReference<>();
        ej5.c(w5b.a(coroutineContext), null, null, new a(null), 3);
    }

    @Override // defpackage.fj80
    public final Double a() {
        return f().b;
    }

    @Override // defpackage.fj80
    public final boolean b() {
        Long l = f().e;
        Integer num = f().d;
        return l == null || num == null || this.b.a().c - l.longValue() >= ((long) num.intValue());
    }

    @Override // defpackage.fj80
    public final Boolean c() {
        return f().a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.fj80
    public final Object d(yf80 yf80Var, x1b x1bVar) {
        ij80 ij80Var;
        if (x1bVar instanceof ij80) {
            ij80Var = (ij80) x1bVar;
            int i = ij80Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ij80Var.c = i - Integer.MIN_VALUE;
            } else {
                ij80Var = new ij80(this, x1bVar);
            }
        } else {
            ij80Var = new ij80(this, x1bVar);
        }
        Object obj = ij80Var.a;
        y5b y5bVar = y5b.a;
        int i2 = ij80Var.c;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                sqc<yf80> sqcVar = this.c;
                jj80 jj80Var = new jj80(yf80Var, null);
                ij80Var.c = 1;
                if (sqcVar.l(jj80Var, ij80Var) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
        } catch (IOException e) {
            Log.w("FirebaseSessions", "Failed to update config values: " + e);
        }
        return Unit.a;
    }

    @Override // defpackage.fj80
    public final Integer e() {
        return f().c;
    }

    public final yf80 f() throws Throwable {
        AtomicReference<yf80> atomicReference = this.d;
        if (atomicReference.get() == null) {
            Object objA = dj5.a(e.a, new b(null));
            while (!atomicReference.compareAndSet(null, (yf80) objA) && atomicReference.get() == null) {
            }
        }
        yf80 yf80Var = atomicReference.get();
        yf80Var.getClass();
        return yf80Var;
    }
}
