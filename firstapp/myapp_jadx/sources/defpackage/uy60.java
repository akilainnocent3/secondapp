package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes8.dex */
public final class uy60 extends y2b.a {
    @Override // y2b.a
    public final y2b a(Type type, Annotation[] annotationArr) {
        if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
            return ky60.a;
        }
        return null;
    }

    @Override // y2b.a
    public final y2b<ResponseBody, ?> b(Type type, Annotation[] annotationArr, on50 on50Var) {
        if (type == String.class) {
            return ty60.a;
        }
        if (type == Boolean.class || type == Boolean.TYPE) {
            return ly60.a;
        }
        if (type == Byte.class || type == Byte.TYPE) {
            return my60.a;
        }
        if (type == Character.class || type == Character.TYPE) {
            return ny60.a;
        }
        if (type == Double.class || type == Double.TYPE) {
            return oy60.a;
        }
        if (type == Float.class || type == Float.TYPE) {
            return py60.a;
        }
        if (type == Integer.class || type == Integer.TYPE) {
            return qy60.a;
        }
        if (type == Long.class || type == Long.TYPE) {
            return ry60.a;
        }
        if (type == Short.class || type == Short.TYPE) {
            return sy60.a;
        }
        return null;
    }
}
