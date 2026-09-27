package pr;

import dr.l1;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.s1;
import sc.k;
import ur.f;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nCancellationException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellationException.kt\nkotlin/coroutines/cancellation/CancellationExceptionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
public final class a {
    @l1(version = k.f129877g)
    @f
    public static final CancellationException a(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    @l1(version = k.f129877g)
    @f
    public static final CancellationException b(Throwable th2) {
        CancellationException cancellationException = new CancellationException(th2 != null ? String.valueOf(th2) : null);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    @l1(version = k.f129877g)
    public static /* synthetic */ void c() {
    }
}
