package defpackage;

import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class eoz extends qlr implements Function1<WeakReference<Function2<? super kxs, ? super hxs, ? extends Unit>>, Boolean> {
    public final /* synthetic */ Function2<kxs, hxs, Unit> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public eoz(Function2<? super kxs, ? super hxs, Unit> function2) {
        super(1);
        this.a = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(WeakReference<Function2<? super kxs, ? super hxs, ? extends Unit>> weakReference) {
        WeakReference<Function2<? super kxs, ? super hxs, ? extends Unit>> weakReference2 = weakReference;
        weakReference2.getClass();
        return Boolean.valueOf(weakReference2.get() == null || weakReference2.get() == this.a);
    }
}
