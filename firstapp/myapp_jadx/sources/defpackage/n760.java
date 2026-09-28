package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes8.dex */
public final class n760 extends tu5.a {
    @Override // tu5.a
    public final tu5<?, ?> a(Type type, Annotation[] annotationArr, on50 on50Var) {
        Type typeD;
        boolean z;
        boolean z2;
        String str;
        Class<?> clsE = urh0.e(type);
        if (clsE == yl8.class) {
            return new m760(Void.class, false, true, false, false, false, true);
        }
        boolean z3 = clsE == r2i.class;
        boolean z4 = clsE == ct90.class;
        boolean z5 = clsE == ldv.class;
        if (clsE != ucy.class && !z3 && !z4 && !z5) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            if (z3) {
                str = "Flowable";
            } else if (z4) {
                str = "Single";
            } else {
                str = z5 ? "Maybe" : "Observable";
            }
            lpd0.a(ux5.a(str, " return type must be parameterized as ", str, "<Foo> or ", str), "<? extends Foo>");
            return null;
        }
        Type typeD2 = urh0.d(0, (ParameterizedType) type);
        Class<?> clsE2 = urh0.e(typeD2);
        if (clsE2 == bi50.class) {
            if (!(typeD2 instanceof ParameterizedType)) {
                ib5.a("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
                return null;
            }
            typeD = urh0.d(0, (ParameterizedType) typeD2);
            z2 = false;
            z = false;
        } else if (clsE2 != aj50.class) {
            typeD = typeD2;
            z = true;
            z2 = false;
        } else {
            if (!(typeD2 instanceof ParameterizedType)) {
                ib5.a("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
                return null;
            }
            typeD = urh0.d(0, (ParameterizedType) typeD2);
            z2 = true;
            z = false;
        }
        return new m760(typeD, z2, z, z3, z4, z5, false);
    }
}
