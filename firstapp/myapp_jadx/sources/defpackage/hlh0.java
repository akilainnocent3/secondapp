package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hlh0<T> {
    public static final <V> void a(a aVar, V v, Function2<? super T, ? super V, Unit> function2) {
        if (aVar.g() || !Intrinsics.g(aVar.y(), v)) {
            aVar.r(v);
            aVar.a(v, function2);
        }
    }
}
