package defpackage;

import defpackage.jsw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public final class l11<T extends jsw> implements ppv {
    public static final /* synthetic */ int e = 0;
    public final qj1 b;
    public final Map<m21, zr<T>> c;
    public final hcy<zr<T>> d;

    static {
        Logger.getLogger(l11.class.getName());
    }

    public l11(mw40 mw40Var, qj1 qj1Var, final xr xrVar, bjb0 bjb0Var, int i) {
        new AtomicBoolean(false);
        new p040(0.08333333333333333d, 5.0d);
        new p040(0.016666666666666666d, 1.0d);
        new ArrayList();
        this.b = qj1Var;
        opv opvVar = mw40Var.b;
        qj1Var.f.getClass();
        opvVar.a();
        Objects.requireNonNull(xrVar);
        this.d = new hcy<>(new Supplier() { // from class: j11
            @Override // java.util.function.Supplier
            public final Object get() {
                return xrVar.b();
            }
        });
        new Function() { // from class: k11
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                hcy<zr<T>> hcyVar = this.a.d;
                cx0<T> cx0Var = hcyVar.a;
                int i2 = cx0Var.b;
                Object obj2 = null;
                if (i2 != 0) {
                    Object[] objArr = cx0Var.a;
                    int i3 = i2 - 1;
                    Object obj3 = objArr[i3];
                    objArr[i3] = null;
                    cx0Var.b = i3;
                    obj2 = obj3;
                }
                if (obj2 == null) {
                    obj2 = hcyVar.b.get();
                }
                return (zr) obj2;
            }
        };
        new HashMap();
        new HashMap();
    }

    @Override // defpackage.ppv
    public final npv c() {
        return this.b;
    }
}
