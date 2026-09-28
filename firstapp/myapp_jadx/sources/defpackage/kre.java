package defpackage;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.cache.DiskLruCache;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class kre implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kre(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nk2 binding;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                DiskLruCache diskLruCache = (DiskLruCache) obj2;
                DiskLruCache.Companion companion = DiskLruCache.INSTANCE;
                ((IOException) obj).getClass();
                if (!_UtilJvmKt.assertionsEnabled || Thread.holdsLock(diskLruCache)) {
                    diskLruCache.B = true;
                    return Unit.a;
                }
                ddk0.a(Thread.currentThread().getName(), " MUST hold lock on ", diskLruCache);
                return null;
            case 1:
                zy10 zy10Var = (zy10) obj2;
                ((Boolean) obj).getClass();
                zt50 zt50Var = zy10Var.b;
                if (zt50Var != null && (binding = zt50Var.R.getBinding()) != null) {
                    binding.d.setStatus(false);
                }
                ((x5a0) zy10Var.e1).setValue(Boolean.TRUE);
                return Unit.a;
            default:
                ijf0 ijf0Var = (ijf0) obj;
                ijf0Var.getClass();
                ((Function1) obj2).invoke(new bri0.d0(ijf0Var));
                return Unit.a;
        }
    }
}
