package defpackage;

import android.os.Handler;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d46 implements h5f0<c46> {
    public static final wg1 O = hoa.a.a(g26.a.class, "camerax.core.appConfig.cameraFactoryProvider");
    public static final wg1 P = hoa.a.a(b26.a.class, "camerax.core.appConfig.deviceSurfaceManagerProvider");
    public static final wg1 Q = hoa.a.a(tnh0.c.class, "camerax.core.appConfig.useCaseConfigFactoryProvider");
    public static final wg1 R = hoa.a.a(Executor.class, "camerax.core.appConfig.cameraExecutor");
    public static final wg1 S = hoa.a.a(Handler.class, "camerax.core.appConfig.schedulerHandler");
    public static final wg1 T;
    public static final wg1 U;
    public static final wg1 V;
    public static final wg1 W;
    public static final wg1 X;
    public static final wg1 Y;
    public static final wg1 Z;
    public final w2z N;

    public static final class a {
        public final ftw a;

        public a() {
            ftw ftwVarV = ftw.V();
            this.a = ftwVarV;
            wg1 wg1Var = h5f0.w;
            Class cls = (Class) ftwVarV.b(wg1Var, null);
            if (cls != null && !cls.equals(c46.class)) {
                nrh0.a(this, "Invalid target class configuration for ", ": ", cls);
                throw null;
            }
            ftwVarV.Y(wg1Var, c46.class);
            wg1 wg1Var2 = h5f0.v;
            if (ftwVarV.b(wg1Var2, null) == null) {
                ftwVarV.Y(wg1Var2, c46.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }
    }

    public interface b {
        d46 getCameraXConfig();
    }

    static {
        Class cls = Integer.TYPE;
        T = hoa.a.a(cls, "camerax.core.appConfig.minimumLoggingLevel");
        U = hoa.a.a(k36.class, "camerax.core.appConfig.availableCamerasLimiter");
        V = hoa.a.a(Long.TYPE, "camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming");
        W = hoa.a.a(fo50.class, "camerax.core.appConfig.cameraProviderInitRetryPolicy");
        X = hoa.a.a(vj30.class, "camerax.core.appConfig.quirksSettings");
        Y = hoa.a.a(cls, "camerax.core.appConfig.configImplType");
        Z = hoa.a.a(Boolean.TYPE, "camerax.core.appConfig.repeatingStreamForced");
    }

    public d46(w2z w2zVar) {
        this.N = w2zVar;
    }

    public final k36 U() {
        return (k36) this.N.b(U, null);
    }

    public final g26.a V() {
        return (g26.a) this.N.b(O, null);
    }

    public final long W() {
        return ((Long) this.N.b(V, -1L)).longValue();
    }

    public final b26.a X() {
        return (b26.a) this.N.b(P, null);
    }

    public final tnh0.c Y() {
        return (tnh0.c) this.N.b(Q, null);
    }

    @Override // defpackage.q340
    public final hoa l() {
        return this.N;
    }
}
