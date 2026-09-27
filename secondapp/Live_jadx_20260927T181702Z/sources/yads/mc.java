package yads;

import android.media.MediaCodec;
import android.media.MediaDrmResetException;
import android.media.ResourceBusyException;
import javax.net.ssl.SSLHandshakeException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mc {
    public static if3 a(Throwable th2) {
        if (th2 instanceof re.s) {
            if3 if3VarB = b(th2);
            if (if3VarB != null) {
                return if3VarB;
            }
            Throwable cause = th2.getCause();
            if3 if3VarA = cause != null ? a(cause) : null;
            return if3VarA == null ? if3.D : if3VarA;
        }
        if (th2 instanceof re.l2) {
            return if3.f150605i;
        }
        if (th2 instanceof re.s2) {
            return if3.f150606j;
        }
        if (th2 instanceof nf.v.c) {
            return if3.f150607k;
        }
        if (th2 instanceof nf.o.b) {
            return if3.f150608l;
        }
        if (th2 instanceof fh.h) {
            if3 if3VarB2 = b(th2);
            return if3VarB2 == null ? if3.f150609m : if3VarB2;
        }
        if (th2 instanceof zf.b) {
            return if3.f150610n;
        }
        if (th2 instanceof MediaCodec.CryptoException) {
            return if3.f150611o;
        }
        if (th2 instanceof com.google.android.exoplayer2.drm.d.a) {
            Throwable cause2 = ((com.google.android.exoplayer2.drm.d.a) th2).getCause();
            if (cause2 == null) {
                return if3.f150613q;
            }
            if ((cause2 instanceof MediaDrmResetException) || (cause2 instanceof ResourceBusyException)) {
                return if3.f150612p;
            }
            return ((cause2 instanceof MediaCodec.CryptoException) || (cause2 instanceof ze.c0)) ? if3.f150611o : if3.f150613q;
        }
        if (th2 instanceof ah.q0.b) {
            return if3.f150614r;
        }
        if (th2 instanceof ah.q0.f) {
            int i10 = ((ah.q0.f) th2).f5354i;
            if (i10 == 401) {
                return if3.f150615s;
            }
            if (i10 == 403) {
                return if3.f150616t;
            }
            return i10 == 404 ? if3.f150617u : if3.f150618v;
        }
        if (th2 instanceof ah.q0.d) {
            return ((ah.q0.d) th2).getCause() instanceof SSLHandshakeException ? if3.f150619w : if3.f150620x;
        }
        if (th2 instanceof re.d4) {
            return if3.f150621y;
        }
        if (th2 instanceof ah.v0.h) {
            return if3.f150622z;
        }
        if ((th2 instanceof te.x.a) || (th2 instanceof te.x.b) || (th2 instanceof te.j0.j)) {
            return if3.A;
        }
        if (th2 instanceof og.k) {
            return if3.B;
        }
        return ((th2 instanceof bh.a.C0193a) || (th2 instanceof bh.b.a)) ? if3.C : if3.D;
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
