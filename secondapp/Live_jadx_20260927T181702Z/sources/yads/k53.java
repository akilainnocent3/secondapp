package yads;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class k53 {
    public static Object a(Callable callable, Object obj, String str, String str2) {
        if (obj == null) {
            boolean z10 = ad1.f146762a;
            return null;
        }
        try {
            return callable.call();
        } catch (Throwable unused) {
            boolean z11 = ad1.f146762a;
            return null;
        }
    }
}
