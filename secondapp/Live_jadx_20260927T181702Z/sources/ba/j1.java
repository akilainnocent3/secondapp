package ba;

import androidx.annotation.NonNull;
import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class j1 extends aa.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsReplyProxyBoundaryInterface f20964a;

    public j1(@NonNull JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f20964a = jsReplyProxyBoundaryInterface;
    }

    public static /* synthetic */ Object c(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        return new j1(jsReplyProxyBoundaryInterface);
    }

    @NonNull
    public static j1 d(@NonNull InvocationHandler invocationHandler) {
        final JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) my.a.a(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (j1) jsReplyProxyBoundaryInterface.getOrCreatePeer(new Callable() { // from class: ba.i1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return j1.c(jsReplyProxyBoundaryInterface);
            }
        });
    }

    @Override // aa.c
    public void a(@NonNull String str) {
        if (!g2.U.d()) {
            throw g2.a();
        }
        this.f20964a.postMessage(str);
    }

    @Override // aa.c
    public void b(@NonNull byte[] bArr) {
        Objects.requireNonNull(bArr, "ArrayBuffer must be non-null");
        if (!g2.C.d()) {
            throw g2.a();
        }
        this.f20964a.postMessageWithPayload(my.a.d(new b2(bArr)));
    }
}
