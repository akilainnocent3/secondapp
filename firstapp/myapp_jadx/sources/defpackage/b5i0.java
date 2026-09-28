package defpackage;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.c;
import androidx.media3.exoplayer.d;
import com.appsflyer.internal.w;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
public final class b5i0 implements z4i0 {
    public final Context a;
    public final ibs b;
    public d c;
    public final j1b d;
    public jvd0 e;
    public z4i0.a g;
    public final b i;
    public final wwd0 f = xwd0.a(new alc(0));
    public a h = new a(0);

    public static final class b implements rdd {

        @c0d(c = "com.sportybet.feature.dedicatedteampage.article.ui.player.VideoPlaybackManagerImpl$lifecycleListener$1$onStop$2", f = "VideoPlaybackManagerImpl.kt", l = {78}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ b5i0 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b5i0 b5i0Var, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = b5i0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.b, v1bVar);
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
                    this.a = 1;
                    if (hkd.b(30000L, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                b5i0 b5i0Var = this.b;
                d dVar = b5i0Var.c;
                if (dVar != null && !dVar.Q()) {
                    b5i0Var.f();
                }
                return Unit.a;
            }
        }

        public b() {
        }

        @Override // defpackage.rdd
        public final void onStart(ibs ibsVar) {
            Object value;
            b5i0 b5i0Var = b5i0.this;
            a aVar = b5i0Var.h;
            z4i0.a aVar2 = aVar.a;
            if (aVar2 == null) {
                return;
            }
            List<e3i0> list = aVar2.b;
            Object objC = b5i0Var.c();
            i42 i42Var = (i42) objC;
            if (i42Var.g0() != null) {
                jvd0 jvd0Var = b5i0Var.e;
                if (jvd0Var != null) {
                    jvd0Var.cancel((CancellationException) null);
                    return;
                }
                return;
            }
            wwd0 wwd0Var = b5i0Var.f;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, alc.a((alc) value, aVar2.a, a4h.f(list), aVar2.c, false, false, 0.0f, false, 120)));
            b5i0Var.g = aVar2;
            i42Var.p0(njv.b(b5i0.h(list).b));
            d dVar = (d) objC;
            dVar.d();
            long j = aVar.b;
            if (j > 0) {
                i42Var.n0(5, j);
            }
            dVar.n(aVar.c);
            b5i0Var.h = new a(0);
        }

        @Override // defpackage.rdd
        public final void onStop(ibs ibsVar) {
            b5i0 b5i0Var = b5i0.this;
            d dVar = b5i0Var.c;
            if (dVar != null) {
                b5i0Var.h = new a(b5i0Var.g, dVar.e0(), dVar.Q());
            }
            d dVar2 = b5i0Var.c;
            if (dVar2 != null) {
                dVar2.a();
            }
            jvd0 jvd0Var = b5i0Var.e;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            b5i0Var.e = ej5.c(b5i0Var.d, null, null, new a(b5i0Var, null), 3);
        }
    }

    public b5i0(Context context, ibs ibsVar, k5b k5bVar) {
        this.a = context;
        this.b = ibsVar;
        this.d = w5b.a(k5bVar.plus(lfe0.a()));
        b bVar = new b();
        this.i = bVar;
        ibsVar.getLifecycle().a(bVar);
    }

    public static e3i0 h(List list) {
        Object obj;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                e3i0 e3i0Var = (e3i0) next;
                int i = e3i0Var.c * e3i0Var.d;
                do {
                    Object next2 = it.next();
                    e3i0 e3i0Var2 = (e3i0) next2;
                    int i2 = e3i0Var2.c * e3i0Var2.d;
                    if (i < i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        e3i0 e3i0Var3 = (e3i0) obj;
        return e3i0Var3 == null ? new e3i0("", "", 0, 0) : e3i0Var3;
    }

    @Override // defpackage.z4i0
    public final void a(float f) {
        while (true) {
            wwd0 wwd0Var = this.f;
            Object value = wwd0Var.getValue();
            float f2 = f;
            if (wwd0Var.g(value, alc.a((alc) value, null, null, false, false, false, f2, false, 95))) {
                return;
            } else {
                f = f2;
            }
        }
    }

    @Override // defpackage.z4i0
    public final void b(boolean z) {
        while (true) {
            wwd0 wwd0Var = this.f;
            Object value = wwd0Var.getValue();
            boolean z2 = z;
            if (wwd0Var.g(value, alc.a((alc) value, null, null, false, z2, false, 0.0f, false, 119))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    @Override // defpackage.z4i0
    public final ExoPlayer c() {
        pid.d dVar;
        d dVar2 = this.c;
        if (dVar2 != null) {
            return dVar2;
        }
        Context context = this.a;
        pid pidVar = new pid(context);
        synchronized (pidVar.c) {
            dVar = pidVar.f;
        }
        dVar.getClass();
        pid.d.a aVar = new pid.d.a(dVar);
        aVar.k();
        aVar.s = true;
        pidVar.g(new pid.d(aVar));
        c cVar = new c();
        ExoPlayer.b bVar = new ExoPlayer.b(context);
        bVar.c(cVar);
        bVar.d(pidVar);
        d dVarA = bVar.a();
        dVarA.m.a(new c5i0(this));
        this.c = dVarA;
        return dVarA;
    }

    @Override // defpackage.z4i0
    public final v340 d() {
        return e1i.b(this.f);
    }

    @Override // defpackage.z4i0
    public final void e(boolean z) {
        while (true) {
            wwd0 wwd0Var = this.f;
            Object value = wwd0Var.getValue();
            boolean z2 = z;
            if (wwd0Var.g(value, alc.a((alc) value, null, null, false, false, z2, 0.0f, false, 111))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    @Override // defpackage.z4i0
    public final void f() {
        wwd0 wwd0Var;
        Object value;
        jvd0 jvd0Var = this.e;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        d dVar = this.c;
        if (dVar != null) {
            dVar.i();
        }
        d dVar2 = this.c;
        if (dVar2 != null) {
            dVar2.M0();
        }
        this.g = null;
        do {
            wwd0Var = this.f;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, alc.a((alc) value, "", null, false, false, false, 0.0f, false, WebSocketProtocol.PAYLOAD_SHORT)));
    }

    @Override // defpackage.z4i0
    public final void g(z4i0.a aVar) {
        Object value;
        wwd0 wwd0Var = this.f;
        String str = ((alc) wwd0Var.getValue()).a;
        String str2 = aVar.a;
        List<e3i0> list = aVar.b;
        if (Intrinsics.g(str, str2)) {
            return;
        }
        this.h = new a(0);
        jvd0 jvd0Var = this.e;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, alc.a((alc) value, aVar.a, a4h.f(list), aVar.c, false, false, 0.0f, false, 120)));
        this.g = aVar;
        String str3 = h(list).b;
        Object objC = c();
        ((i42) objC).p0(njv.b(str3));
        d dVar = (d) objC;
        dVar.d();
        dVar.n(true);
    }

    @Override // defpackage.z4i0
    public final void release() {
        this.b.getLifecycle().d(this.i);
        f();
        d dVar = this.c;
        if (dVar != null) {
            dVar.release();
        }
        jvd0 jvd0Var = this.e;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.c = null;
    }

    public static final class a {
        public final z4i0.a a;
        public final long b;
        public final boolean c;

        public a(z4i0.a aVar, long j, boolean z) {
            this.a = aVar;
            this.b = j;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            z4i0.a aVar = this.a;
            return Boolean.hashCode(this.c) + f87.a((aVar == null ? 0 : aVar.hashCode()) * 31, this.b, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StoppedMediaState(info=");
            sb.append(this.a);
            sb.append(", positionMs=");
            sb.append(this.b);
            return w.a(sb, ", wasPlaying=", this.c, ")");
        }

        public /* synthetic */ a(int i) {
            this(null, 0L, false);
        }
    }
}
