package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class es60 extends tu5.a {
    public final wsm a;
    public final xw9 b;

    public es60(wsm wsmVar, xw9 xw9Var) {
        wsmVar.getClass();
        this.a = wsmVar;
        this.b = xw9Var;
    }

    @Override // tu5.a
    public final tu5<?, ?> a(Type type, Annotation[] annotationArr, on50 on50Var) {
        type.getClass();
        annotationArr.getClass();
        if (!Intrinsics.g(urh0.e(type), su5.class) || !(type instanceof ParameterizedType)) {
            return null;
        }
        Type typeD = urh0.d(0, (ParameterizedType) type);
        if (!Intrinsics.g(urh0.e(typeD), zi50.class) || !(typeD instanceof ParameterizedType)) {
            return null;
        }
        Type typeD2 = urh0.d(0, (ParameterizedType) typeD);
        typeD2.getClass();
        return new ds60(typeD2, this.a, this.b);
    }
}
