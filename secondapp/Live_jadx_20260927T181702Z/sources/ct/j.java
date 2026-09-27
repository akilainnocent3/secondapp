package ct;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nReflectJavaAnnotationArguments.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaAnnotationArguments.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaArrayAnnotationArgument\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,79:1\n11335#2:80\n11670#2,3:81\n*S KotlinDebug\n*F\n+ 1 ReflectJavaAnnotationArguments.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaArrayAnnotationArgument\n*L\n48#1:80\n48#1:81,3\n*E\n"})
public final class j extends f implements nt.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final Object[] f77091c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@oy.m wt.f fVar, @oy.l Object[] values) {
        super(fVar, null);
        m0.p(values, "values");
        this.f77091c = values;
    }

    @Override // nt.e
    @oy.l
    public List<f> b() {
        Object[] objArr = this.f77091c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            f.a aVar = f.f77088b;
            m0.m(obj);
            arrayList.add(aVar.a(obj, null));
        }
        return arrayList;
    }
}
