package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes8.dex */
public abstract class fv5 implements xgp, Serializable {
    public static final Object NO_RECEIVER = a.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient xgp reflected;
    private final String signature;

    public static class a implements Serializable {
        public static final a a = new a();
    }

    public fv5(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.xgp
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.xgp
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public xgp compute() {
        xgp xgpVar = this.reflected;
        if (xgpVar != null) {
            return xgpVar;
        }
        xgp xgpVarComputeReflected = computeReflected();
        this.reflected = xgpVarComputeReflected;
        return xgpVarComputeReflected;
    }

    public abstract xgp computeReflected();

    public GenericDeclaration findJavaDeclaration() {
        ahp owner = getOwner();
        String signature = getSignature();
        signature.getClass();
        if (!(owner instanceof vp7)) {
            return null;
        }
        String strN0 = StringsKt.n0('(', signature);
        if (strN0.equals("<init>")) {
            throw new UnsupportedOperationException("Generic Java constructors are not supported: " + owner + '/' + signature);
        }
        Method[] declaredMethods = ((vp7) owner).d().getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            if (Intrinsics.g(method.getName(), strN0)) {
                StringBuilder sb = new StringBuilder();
                sb.append(method.getName());
                sb.append("(");
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                for (Class<?> cls : parameterTypes) {
                    cls.getClass();
                    n47.a(cls, sb);
                }
                sb.append(")");
                Class<?> returnType = method.getReturnType();
                returnType.getClass();
                n47.a(returnType, sb);
                if (sb.toString().equals(signature)) {
                    return method;
                }
            }
        }
        return null;
    }

    @Override // defpackage.wgp
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // defpackage.xgp
    public String getName() {
        return this.name;
    }

    public ahp getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return jq40.a(cls);
        }
        jq40.a.getClass();
        return new kmz(cls);
    }

    @Override // defpackage.xgp
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public xgp getReflected() {
        xgp xgpVarCompute = compute();
        if (xgpVarCompute != this) {
            return xgpVarCompute;
        }
        throw new bsp();
    }

    @Override // defpackage.xgp
    public qhp getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.xgp
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.xgp
    public shp getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.xgp
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.xgp
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.xgp
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // defpackage.xgp
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public fv5(Object obj) {
        this(obj, null, null, null, false);
    }

    public fv5() {
        this(NO_RECEIVER);
    }
}
