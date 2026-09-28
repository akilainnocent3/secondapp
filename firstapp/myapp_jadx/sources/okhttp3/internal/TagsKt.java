package okhttp3.internal;

import defpackage.ygp;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "T", "Ljava/util/concurrent/atomic/AtomicReference;", "Lokhttp3/internal/Tags;", "Lygp;", "type", "Lkotlin/Function0;", "compute", "computeIfAbsent", "(Ljava/util/concurrent/atomic/AtomicReference;Lygp;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class TagsKt {
    public static final <T> T computeIfAbsent(AtomicReference<Tags> atomicReference, ygp<T> ygpVar, Function0<? extends T> function0) {
        atomicReference.getClass();
        ygpVar.getClass();
        function0.getClass();
        T tInvoke = null;
        while (true) {
            Tags tags = atomicReference.get();
            T t = (T) tags.get(ygpVar);
            if (t != null) {
                return t;
            }
            if (tInvoke == null) {
                tInvoke = function0.invoke();
            }
            Tags tagsPlus = tags.plus(ygpVar, tInvoke);
            while (!atomicReference.compareAndSet(tags, tagsPlus)) {
                if (atomicReference.get() != tags) {
                }
            }
            return tInvoke;
        }
    }
}
