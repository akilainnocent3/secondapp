package rs;

import dr.i0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class b implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f127495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f127496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f127497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0 f127498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f127499e;

    public b(Class cls, Map map, i0 i0Var, i0 i0Var2, List list) {
        this.f127495a = cls;
        this.f127496b = map;
        this.f127497c = i0Var;
        this.f127498d = i0Var2;
        this.f127499e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        return c.i(this.f127495a, this.f127496b, this.f127497c, this.f127498d, this.f127499e, obj, method, objArr);
    }
}
