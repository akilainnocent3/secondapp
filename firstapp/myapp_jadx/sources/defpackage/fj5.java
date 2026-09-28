package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Unit;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes8.dex */
public final class fj5 extends y2b.a {

    public static final class a implements y2b<ResponseBody, ResponseBody> {
        public static final a a = new a();

        @Override // defpackage.y2b
        public final ResponseBody convert(ResponseBody responseBody) {
            ResponseBody responseBody2 = responseBody;
            try {
                lb5 lb5Var = new lb5();
                responseBody2.getD().V0(lb5Var);
                return ResponseBody.create(responseBody2.getB(), responseBody2.getC(), lb5Var);
            } finally {
                responseBody2.close();
            }
        }
    }

    public static final class b implements y2b<RequestBody, RequestBody> {
        public static final b a = new b();

        @Override // defpackage.y2b
        public final RequestBody convert(RequestBody requestBody) {
            return requestBody;
        }
    }

    public static final class c implements y2b<ResponseBody, ResponseBody> {
        public static final c a = new c();

        @Override // defpackage.y2b
        public final ResponseBody convert(ResponseBody responseBody) {
            return responseBody;
        }
    }

    public static final class d implements y2b<Object, String> {
    }

    public static final class e implements y2b<ResponseBody, Unit> {
        public static final e a = new e();

        @Override // defpackage.y2b
        public final Unit convert(ResponseBody responseBody) {
            responseBody.close();
            return Unit.a;
        }
    }

    public static final class f implements y2b<ResponseBody, Void> {
        public static final f a = new f();

        @Override // defpackage.y2b
        public final Void convert(ResponseBody responseBody) {
            responseBody.close();
            return null;
        }
    }

    @Override // y2b.a
    public final y2b a(Type type, Annotation[] annotationArr) {
        if (RequestBody.class.isAssignableFrom(urh0.e(type))) {
            return b.a;
        }
        return null;
    }

    @Override // y2b.a
    public final y2b<ResponseBody, ?> b(Type type, Annotation[] annotationArr, on50 on50Var) {
        if (type == ResponseBody.class) {
            return urh0.h(annotationArr, s8e0.class) ? c.a : a.a;
        }
        if (type == Void.class) {
            return f.a;
        }
        if (urh0.b && type == Unit.class) {
            return e.a;
        }
        return null;
    }
}
