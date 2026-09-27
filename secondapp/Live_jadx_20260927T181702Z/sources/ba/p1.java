package ba;

import androidx.annotation.NonNull;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class p1 implements aa.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScriptHandlerBoundaryInterface f20982a;

    public p1(@NonNull ScriptHandlerBoundaryInterface scriptHandlerBoundaryInterface) {
        this.f20982a = scriptHandlerBoundaryInterface;
    }

    @NonNull
    public static p1 a(@NonNull InvocationHandler invocationHandler) {
        return new p1((ScriptHandlerBoundaryInterface) my.a.a(ScriptHandlerBoundaryInterface.class, invocationHandler));
    }

    @Override // aa.j
    public void remove() {
        this.f20982a.remove();
    }
}
