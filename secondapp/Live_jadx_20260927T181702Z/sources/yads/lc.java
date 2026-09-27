package yads;

import android.media.MediaCodec;
import android.media.MediaDrmResetException;
import android.media.ResourceBusyException;
import javax.net.ssl.SSLHandshakeException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class lc {
    public static if3 a(Throwable th2) {
        if (th2 instanceof d5.h0) {
            if3 if3VarB = b(th2);
            if (if3VarB != null) {
                return if3VarB;
            }
            Throwable cause = th2.getCause();
            if3 if3VarA = cause != null ? a(cause) : null;
            return if3VarA == null ? if3.D : if3VarA;
        }
        if (th2 instanceof d5.m3) {
            return if3.f150605i;
        }
        if (th2 instanceof u4.a1) {
            return if3.f150606j;
        }
        if (th2 instanceof o5.a1.c) {
            return if3.f150607k;
        }
        if (th2 instanceof o5.l0.c) {
            return if3.f150608l;
        }
        if (th2 instanceof d6.k) {
            if3 if3VarB2 = b(th2);
            return if3VarB2 == null ? if3.f150609m : if3VarB2;
        }
        if (th2 instanceof s5.b) {
            return if3.f150610n;
        }
        if (th2 instanceof MediaCodec.CryptoException) {
            return if3.f150611o;
        }
        if (th2 instanceof j5.n.a) {
            Throwable cause2 = ((j5.n.a) th2).getCause();
            if (cause2 == null) {
                return if3.f150613q;
            }
            if ((cause2 instanceof MediaDrmResetException) || (cause2 instanceof ResourceBusyException)) {
                return if3.f150612p;
            }
            return ((cause2 instanceof MediaCodec.CryptoException) || (cause2 instanceof j5.w0)) ? if3.f150611o : if3.f150613q;
        }
        if (th2 instanceof a5.k0.b) {
            return if3.f150614r;
        }
        if (th2 instanceof a5.k0.f) {
            int i10 = ((a5.k0.f) th2).f3737i;
            if (i10 == 401) {
                return if3.f150615s;
            }
            if (i10 == 403) {
                return if3.f150616t;
            }
            return i10 == 404 ? if3.f150617u : if3.f150618v;
        }
        if (th2 instanceof a5.k0.d) {
            return ((a5.k0.d) th2).getCause() instanceof SSLHandshakeException ? if3.f150619w : if3.f150620x;
        }
        if (th2 instanceof u4.p1) {
            return if3.f150621y;
        }
        if (th2 instanceof z5.s.h) {
            return if3.f150622z;
        }
        if ((th2 instanceof f5.p0.b) || (th2 instanceof f5.p0.c)) {
            return if3.A;
        }
        if (th2 instanceof c7.l) {
            return if3.B;
        }
        return ((th2 instanceof b5.a.C0188a) || (th2 instanceof b5.b.a)) ? if3.C : if3.D;
    }

    public static if3 b(Throwable th2) {
        boolean z10;
        Throwable cause = th2.getCause();
        if (cause != null && (((z10 = cause instanceof MediaCodec.CodecException)) || (cause instanceof IllegalStateException) || (cause instanceof IllegalArgumentException))) {
            StackTraceElement[] stackTrace = cause.getStackTrace();
            if (!(stackTrace.length == 0) && stackTrace[0].isNativeMethod() && kotlin.jvm.internal.m0.g(stackTrace[0].getClassName(), "android.media.MediaCodec")) {
                String methodName = stackTrace[0].getMethodName();
                if (methodName == null) {
                    methodName = "";
                }
                if (kotlin.jvm.internal.m0.g(methodName, "native_dequeueOutputBuffer")) {
                    return if3.f150598b;
                }
                if (kotlin.jvm.internal.m0.g(methodName, "native_dequeueInputBuffer")) {
                    return if3.f150599c;
                }
                if (kotlin.jvm.internal.m0.g(methodName, "native_stop")) {
                    return if3.f150600d;
                }
                if (kotlin.jvm.internal.m0.g(methodName, "native_setSurface")) {
                    return if3.f150601e;
                }
                if (kotlin.jvm.internal.m0.g(methodName, "releaseOutputBuffer")) {
                    return if3.f150602f;
                }
                if (kotlin.jvm.internal.m0.g(methodName, "native_queueSecureInputBuffer")) {
                    return if3.f150603g;
                }
                if (z10) {
                    return if3.f150604h;
                }
            }
        }
        return null;
    }
}
