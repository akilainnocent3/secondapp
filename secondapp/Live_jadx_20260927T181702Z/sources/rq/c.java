package rq;

import cv.p0;
import dr.v1;
import dr.z0;
import kj.e;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c {
    @l
    public static final Class<?> a(@l Class<?> componentClass) throws ClassNotFoundException {
        m0.p(componentClass, "componentClass");
        qq.l lVar = (qq.l) componentClass.getAnnotation(qq.l.class);
        if (lVar == null || !lVar.isRoot()) {
            throw new IllegalArgumentException((componentClass + " is not a root Yatagan component").toString());
        }
        z0<String, String> z0VarB = b(componentClass);
        Class<?> clsLoadClass = componentClass.getClassLoader().loadClass(z0VarB.d() + ".Yatagan$" + z0VarB.g());
        m0.o(clsLoadClass, "componentClass.classLoad…Class(implementationName)");
        return clsLoadClass;
    }

    public static final z0<String, String> b(Class<?> cls) {
        String name = cls.getName();
        m0.o(name, "name");
        int iX3 = p0.X3(name, e.f102543c, 0, false, 6, null);
        if (iX3 == -1) {
            return v1.a("", name);
        }
        String strSubstring = name.substring(0, iX3);
        m0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        String strSubstring2 = name.substring(iX3 + 1);
        m0.o(strSubstring2, "this as java.lang.String).substring(startIndex)");
        return v1.a(strSubstring, strSubstring2);
    }
}
