package defpackage;

import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class boz extends qlr implements Function1<WeakReference<Function2<? super kxs, ? super hxs, ? extends Unit>>, Boolean> {
    public static final boz a = new boz(1);

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(WeakReference<Function2<? super kxs, ? super hxs, ? extends Unit>> weakReference) {
        WeakReference<Function2<? super kxs, ? super hxs, ? extends Unit>> weakReference2 = weakReference;
        weakReference2.getClass();
        return Boolean.valueOf(weakReference2.get() == null);
    }
}
