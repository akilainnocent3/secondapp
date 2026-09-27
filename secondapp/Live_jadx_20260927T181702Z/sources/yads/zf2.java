package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class zf2 extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zf2 f158800b = new zf2();

    public zf2() {
        super(0);
    }

    @Override // ds.a
    public final Object invoke() {
        Object next;
        Iterator<E> it = yf2.f158285d.iterator();
        while (it.hasNext()) {
            next = it.next();
            List list = ((yf2) next).f158286b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    try {
                        Class.forName((String) it2.next());
                        return (yf2) next;
                    } catch (ClassNotFoundException unused) {
                    } catch (Throwable unused2) {
                        boolean z10 = ad1.f146762a;
                    }
                }
            }
        }
        next = null;
        return (yf2) next;
    }
}
