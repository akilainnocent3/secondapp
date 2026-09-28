package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes8.dex */
public final class i5w extends y2b.a {
    public final h5w a;

    public i5w(h5w h5wVar) {
        this.a = h5wVar;
    }

    public static i5w c() {
        return new i5w(new h5w(new h5w.a()));
    }

    public static Set<? extends Annotation> d(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(gep.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.EMPTY_SET;
    }

    @Override // y2b.a
    public final y2b a(Type type, Annotation[] annotationArr) {
        return new j5w(this.a.a(type, d(annotationArr), null));
    }

    @Override // y2b.a
    public final y2b<ResponseBody, ?> b(Type type, Annotation[] annotationArr, on50 on50Var) {
        return new k5w(this.a.a(type, d(annotationArr), null));
    }
}
