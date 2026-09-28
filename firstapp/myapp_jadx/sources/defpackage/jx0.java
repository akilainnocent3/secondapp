package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class jx0 extends ybp<Object> {
    public static final a c = new a();
    public final Class<?> a;
    public final ybp<Object> b;

    public class a implements ybp.a {
        @Override // ybp.a
        public final ybp<?> a(Type type, Set<? extends Annotation> set, h5w h5wVar) {
            Type componentType;
            if (type instanceof GenericArrayType) {
                componentType = ((GenericArrayType) type).getGenericComponentType();
            } else {
                componentType = type instanceof Class ? ((Class) type).getComponentType() : null;
            }
            if (componentType != null && set.isEmpty()) {
                return new jx0(dah0.c(componentType), h5wVar.a(componentType, irh0.a, null)).b();
            }
            return null;
        }
    }

    public jx0(Class<?> cls, ybp<Object> ybpVar) {
        this.a = cls;
        this.b = ybpVar;
    }

    @Override // defpackage.ybp
    public final Object a(jep jepVar) {
        ArrayList arrayList = new ArrayList();
        jepVar.d();
        while (jepVar.o()) {
            arrayList.add(this.b.a(jepVar));
        }
        jepVar.g();
        Object objNewInstance = Array.newInstance(this.a, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // defpackage.ybp
    public final void c(rfp rfpVar, Object obj) {
        rfpVar.d();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.b.c(rfpVar, Array.get(obj, i));
        }
        rfpVar.g();
    }

    public final String toString() {
        return this.b + ".array()";
    }
}
