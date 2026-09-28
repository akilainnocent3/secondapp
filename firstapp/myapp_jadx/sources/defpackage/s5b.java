package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class s5b {
    public static final void a(String str) {
        str.getClass();
        throw new IllegalArgumentException(tug.a("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static final r5b b(CoroutineContext coroutineContext, Function2 function2) {
        coroutineContext.getClass();
        r5b r5bVar = new r5b();
        kfe0 kfe0Var = new kfe0((c9p) coroutineContext.get(c9p.b.a));
        pfd pfdVar = fse.a;
        r5bVar.m = new tf4<>(r5bVar, function2, w5b.a(gku.a.h0().plus(coroutineContext).plus(kfe0Var)), new p5b(r5bVar, 0));
        return r5bVar;
    }
}
