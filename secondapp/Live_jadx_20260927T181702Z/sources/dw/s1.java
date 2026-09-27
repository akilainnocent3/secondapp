package dw;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@zv.i
public abstract class s1 extends h3<String> {
    @oy.l
    public String d0(@oy.l String parentName, @oy.l String childName) {
        kotlin.jvm.internal.m0.p(parentName, "parentName");
        kotlin.jvm.internal.m0.p(childName, "childName");
        if (parentName.length() == 0) {
            return childName;
        }
        return parentName + kj.e.f102543c + childName;
    }

    @oy.l
    public String e0(@oy.l bw.f descriptor, int i10) {
        kotlin.jvm.internal.m0.p(descriptor, "descriptor");
        return descriptor.f(i10);
    }

    @Override // dw.h3
    @oy.l
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final String a0(@oy.l bw.f fVar, int i10) {
        kotlin.jvm.internal.m0.p(fVar, "<this>");
        return g0(e0(fVar, i10));
    }

    @oy.l
    public final String g0(@oy.l String nestedName) {
        kotlin.jvm.internal.m0.p(nestedName, "nestedName");
        String strZ = Z();
        if (strZ == null) {
            strZ = "";
        }
        return d0(strZ, nestedName);
    }
}
