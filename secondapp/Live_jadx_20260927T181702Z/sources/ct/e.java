package ct;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nReflectJavaAnnotation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaAnnotation.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaAnnotation\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,43:1\n11335#2:44\n11670#2,3:45\n*S KotlinDebug\n*F\n+ 1 ReflectJavaAnnotation.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaAnnotation\n*L\n26#1:44\n26#1:45,3\n*E\n"})
public final class e extends p implements nt.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final Annotation f77087a;

    public e(@oy.l Annotation annotation) {
        m0.p(annotation, "annotation");
        this.f77087a = annotation;
    }

    @oy.l
    public final Annotation P() {
        return this.f77087a;
    }

    @Override // nt.a
    @oy.l
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public l J() {
        return new l(cs.b.e(cs.b.a(this.f77087a)));
    }

    @Override // nt.a
    @oy.l
    public wt.b a() {
        return d.a(cs.b.e(cs.b.a(this.f77087a)));
    }

    @Override // nt.a
    public boolean b() {
        return false;
    }

    public boolean equals(@oy.m Object obj) {
        return (obj instanceof e) && this.f77087a == ((e) obj).f77087a;
    }

    public int hashCode() {
        return System.identityHashCode(this.f77087a);
    }

    @Override // nt.a
    @oy.l
    public Collection<nt.b> j() throws IllegalAccessException, InvocationTargetException {
        Method[] declaredMethods = cs.b.e(cs.b.a(this.f77087a)).getDeclaredMethods();
        m0.o(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            f.a aVar = f.f77088b;
            Object objInvoke = method.invoke(this.f77087a, null);
            m0.o(objInvoke, "method.invoke(annotation)");
            arrayList.add(aVar.a(objInvoke, wt.f.f(method.getName())));
        }
        return arrayList;
    }

    @oy.l
    public String toString() {
        return e.class.getName() + ": " + this.f77087a;
    }

    @Override // nt.a
    public boolean z() {
        return false;
    }
}
