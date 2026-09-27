package dw;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.jvm.internal.s1({"SMAP\nPluginGeneratedSerialDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n+ 2 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n160#2:135\n160#2:139\n1797#3,3:136\n1797#3,3:140\n*S KotlinDebug\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n*L\n128#1:135\n129#1:139\n128#1:136,3\n129#1:140,3\n*E\n"})
public final class m2 {
    public static final /* synthetic */ <SD extends bw.f> boolean a(SD sd2, Object obj, ds.l<? super SD, Boolean> typeParamsAreEqual) {
        kotlin.jvm.internal.m0.p(sd2, "<this>");
        kotlin.jvm.internal.m0.p(typeParamsAreEqual, "typeParamsAreEqual");
        if (sd2 == obj) {
            return true;
        }
        kotlin.jvm.internal.m0.y(3, "SD");
        if (!(obj instanceof bw.f)) {
            return false;
        }
        bw.f fVar = (bw.f) obj;
        if (!kotlin.jvm.internal.m0.g(sd2.h(), fVar.h()) || !typeParamsAreEqual.invoke(obj).booleanValue() || sd2.e() != fVar.e()) {
            return false;
        }
        int iE = sd2.e();
        for (int i10 = 0; i10 < iE; i10++) {
            if (!kotlin.jvm.internal.m0.g(sd2.d(i10).h(), fVar.d(i10).h()) || !kotlin.jvm.internal.m0.g(sd2.d(i10).getKind(), fVar.d(i10).getKind())) {
                return false;
            }
        }
        return true;
    }

    public static final int b(@oy.l bw.f fVar, @oy.l bw.f[] typeParams) {
        kotlin.jvm.internal.m0.p(fVar, "<this>");
        kotlin.jvm.internal.m0.p(typeParams, "typeParams");
        int iHashCode = (fVar.h().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable<bw.f> iterableA = bw.j.a(fVar);
        Iterator<bw.f> it = iterableA.iterator();
        int iHashCode2 = 1;
        int i10 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i11 = i10 * 31;
            String strH = it.next().h();
            if (strH != null) {
                iHashCode3 = strH.hashCode();
            }
            i10 = i11 + iHashCode3;
        }
        Iterator<bw.f> it2 = iterableA.iterator();
        while (it2.hasNext()) {
            int i12 = iHashCode2 * 31;
            bw.n kind = it2.next().getKind();
            iHashCode2 = i12 + (kind != null ? kind.hashCode() : 0);
        }
        return (((iHashCode * 31) + i10) * 31) + iHashCode2;
    }
}
