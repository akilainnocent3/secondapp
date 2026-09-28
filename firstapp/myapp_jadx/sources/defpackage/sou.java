package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class sou<K, V> extends ybp<Map<K, V>> {
    public static final a c = new a();
    public final ybp<K> a;
    public final ybp<V> b;

    public class a implements ybp.a {
        @Override // ybp.a
        public final ybp<?> a(Type type, Set<? extends Annotation> set, h5w h5wVar) {
            Class<?> clsC;
            Type[] actualTypeArguments;
            if (!set.isEmpty() || (clsC = dah0.c(type)) != Map.class) {
                return null;
            }
            if (type == Properties.class) {
                actualTypeArguments = new Type[]{String.class, String.class};
            } else {
                if (!Map.class.isAssignableFrom(clsC)) {
                    d580.a();
                    return null;
                }
                Type typeE = irh0.e(type, clsC, irh0.c(type, clsC, Map.class), new LinkedHashSet());
                actualTypeArguments = typeE instanceof ParameterizedType ? ((ParameterizedType) typeE).getActualTypeArguments() : new Type[]{Object.class, Object.class};
            }
            return new sou(h5wVar, actualTypeArguments[0], actualTypeArguments[1]).b();
        }
    }

    public sou(h5w h5wVar, Type type, Type type2) {
        Set<Annotation> set = irh0.a;
        this.a = h5wVar.a(type, set, null);
        this.b = h5wVar.a(type2, set, null);
    }

    @Override // defpackage.ybp
    public final Object a(jep jepVar) {
        bgs bgsVar = new bgs();
        jepVar.f();
        while (jepVar.o()) {
            gfp gfpVar = (gfp) jepVar;
            if (gfpVar.o()) {
                gfpVar.y = gfpVar.g0();
                gfpVar.i = 11;
            }
            K kA = this.a.a(jepVar);
            V vA = this.b.a(jepVar);
            Object objPut = bgsVar.put(kA, vA);
            if (objPut != null) {
                StringBuilder sb = new StringBuilder("Map key '");
                sb.append(kA);
                String strM = jepVar.m();
                sb.append("' has multiple values at path ");
                sb.append(strM);
                sb.append(": ");
                sb.append(objPut);
                sb.append(" and ");
                sb.append(vA);
                throw new lcp(sb.toString());
            }
        }
        jepVar.l();
        return bgsVar;
    }

    @Override // defpackage.ybp
    public final void c(rfp rfpVar, Object obj) {
        rfpVar.f();
        for (Map.Entry<K, V> entry : ((Map) obj).entrySet()) {
            if (entry.getKey() == null) {
                throw new lcp("Map key is null at ".concat(rfpVar.m()));
            }
            int iF = rfpVar.F();
            if (iF != 5 && iF != 3) {
                ib5.a("Nesting problem.");
                return;
            } else {
                rfpVar.e = true;
                this.a.c(rfpVar, entry.getKey());
                this.b.c(rfpVar, entry.getValue());
            }
        }
        rfpVar.l();
    }

    public final String toString() {
        return "JsonAdapter(" + this.a + "=" + this.b + ")";
    }
}
