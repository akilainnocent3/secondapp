package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes8.dex */
public interface y2b<F, T> {

    public static abstract class a {
        public y2b a(Type type, Annotation[] annotationArr) {
            return null;
        }

        public y2b<ResponseBody, ?> b(Type type, Annotation[] annotationArr, on50 on50Var) {
            return null;
        }
    }

    T convert(F f);
}
