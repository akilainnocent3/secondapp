package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public abstract class y38<C extends Collection<T>, T> extends ybp<C> {
    public static final a b = new a();
    public final ybp<T> a;

    public class a implements ybp.a {
        @Override // ybp.a
        public final ybp<?> a(Type type, Set<? extends Annotation> set, h5w h5wVar) {
            Class<?> clsC = dah0.c(type);
            if (set.isEmpty()) {
                if (clsC == List.class || clsC == Collection.class) {
                    return new z38(h5wVar.a(dah0.a(type), irh0.a, null)).b();
                }
                if (clsC == Set.class) {
                    return new a48(h5wVar.a(dah0.a(type), irh0.a, null)).b();
                }
            }
            return null;
        }
    }

    public y38(ybp<T> ybpVar) {
        this.a = ybpVar;
    }

    @Override // defpackage.ybp
    public Object a(jep jepVar) {
        Collection collectionD = d();
        jepVar.d();
        while (jepVar.o()) {
            collectionD.add(this.a.a(jepVar));
        }
        jepVar.g();
        return collectionD;
    }

    @Override // defpackage.ybp
    public void c(rfp rfpVar, Object obj) {
        rfpVar.d();
        Iterator it = ((Collection) obj).iterator();
        while (it.hasNext()) {
            this.a.c(rfpVar, (T) it.next());
        }
        rfpVar.g();
    }

    public abstract C d();

    public final String toString() {
        return this.a + ".collection()";
    }
}
