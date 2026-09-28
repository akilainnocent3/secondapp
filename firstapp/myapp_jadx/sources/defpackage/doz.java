package defpackage;

import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class doz extends qlr implements Function1<WeakReference<znz.a>, Boolean> {
    public final /* synthetic */ znz.a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doz(znz.a aVar) {
        super(1);
        this.a = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(WeakReference<znz.a> weakReference) {
        WeakReference<znz.a> weakReference2 = weakReference;
        weakReference2.getClass();
        return Boolean.valueOf(weakReference2.get() == null || weakReference2.get() == this.a);
    }
}
