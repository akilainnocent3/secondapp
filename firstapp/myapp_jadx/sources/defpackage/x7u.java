package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes8.dex */
public final class x7u extends tu5.a {
    public final rdd0 a;

    public x7u(rdd0 rdd0Var) {
        this.a = rdd0Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0099  */
    @Override // tu5.a
    public final tu5<?, ?> a(Type type, Annotation[] annotationArr, on50 on50Var) {
        String strPath;
        String strA;
        type.getClass();
        annotationArr.getClass();
        if (Intrinsics.g(urh0.e(type), su5.class)) {
            int length = annotationArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    strPath = null;
                    break;
                }
                Annotation annotation = annotationArr[i];
                if (annotation instanceof sbj) {
                    strPath = ((sbj) annotation).value();
                } else if (annotation instanceof flz) {
                    strPath = ((flz) annotation).value();
                } else if (annotation instanceof gmz) {
                    strPath = ((gmz) annotation).value();
                } else if (annotation instanceof amc) {
                    strPath = ((amc) annotation).value();
                } else if (annotation instanceof ljz) {
                    strPath = ((ljz) annotation).value();
                } else if (annotation instanceof ebl) {
                    strPath = ((ebl) annotation).value();
                } else if (annotation instanceof bay) {
                    strPath = ((bay) annotation).value();
                } else {
                    strPath = annotation instanceof fbl ? ((fbl) annotation).path() : null;
                }
                if (strPath != null) {
                    break;
                }
                i++;
            }
            if (strPath == null) {
                strA = null;
            } else {
                if (StringsKt.U(strPath)) {
                    strPath = null;
                }
                if (strPath != null) {
                    strA = inm.a("/", StringsKt.w0(strPath, '/'));
                } else {
                    strA = null;
                }
            }
            if (strA != null) {
                return new w7u(on50Var.b(this, type, annotationArr), strA, this.a);
            }
        }
        return null;
    }
}
