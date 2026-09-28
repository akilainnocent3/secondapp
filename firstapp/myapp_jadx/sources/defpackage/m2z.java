package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes8.dex */
public final class m2z extends y2b.a {

    public static final class a<T> implements y2b<ResponseBody, Optional<T>> {
        public final y2b<ResponseBody, T> a;

        public a(y2b<ResponseBody, T> y2bVar) {
            this.a = y2bVar;
        }

        @Override // defpackage.y2b
        public final Object convert(ResponseBody responseBody) {
            return Optional.ofNullable(this.a.convert(responseBody));
        }
    }

    @Override // y2b.a
    public final y2b<ResponseBody, ?> b(Type type, Annotation[] annotationArr, on50 on50Var) {
        if (urh0.e(type) != Optional.class) {
            return null;
        }
        return new a(on50Var.d(urh0.d(0, (ParameterizedType) type), annotationArr));
    }
}
