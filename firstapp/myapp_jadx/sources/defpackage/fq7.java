package defpackage;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class fq7<T> implements oe80<T> {
    public final Function1<ygp<?>, php<T>> a;
    public final hq7<nr5<T>> b = new hq7<>();

    /* JADX WARN: Multi-variable type inference failed */
    public fq7(Function1<? super ygp<?>, ? extends php<T>> function1) {
        this.a = function1;
    }

    @Override // defpackage.oe80
    public final php<T> a(ygp<Object> ygpVar) {
        nr5<T> nr5Var = this.b.get(tgp.b(ygpVar));
        nr5Var.getClass();
        xtw xtwVar = (xtw) nr5Var;
        T t = xtwVar.a.get();
        if (t == null) {
            synchronized (xtwVar) {
                t = xtwVar.a.get();
                if (t == null) {
                    t = (T) new nr5(this.a.invoke(ygpVar));
                    xtwVar.a = new SoftReference<>(t);
                }
            }
        }
        return t.a;
    }
}
