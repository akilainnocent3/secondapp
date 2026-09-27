package cu;

import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nClassLiteralValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassLiteralValue.kt\norg/jetbrains/kotlin/resolve/constants/ClassLiteralValue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,17:1\n1#2:18\n*E\n"})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final wt.b f77120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77121b;

    public f(@oy.l wt.b classId, int i10) {
        m0.p(classId, "classId");
        this.f77120a = classId;
        this.f77121b = i10;
    }

    @oy.l
    public final wt.b a() {
        return this.f77120a;
    }

    public final int b() {
        return this.f77121b;
    }

    public final int c() {
        return this.f77121b;
    }

    @oy.l
    public final wt.b d() {
        return this.f77120a;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return m0.g(this.f77120a, fVar.f77120a) && this.f77121b == fVar.f77121b;
    }

    public int hashCode() {
        return (this.f77120a.hashCode() * 31) + this.f77121b;
    }

    @oy.l
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f77121b;
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("kotlin/Array<");
        }
        sb2.append(this.f77120a);
        int i12 = this.f77121b;
        for (int i13 = 0; i13 < i12; i13++) {
            sb2.append(">");
        }
        String string = sb2.toString();
        m0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
