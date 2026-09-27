package i8;

import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.x;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@s1({"SMAP\nAppSetId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSetId.kt\nandroidx/privacysandbox/ads/adservices/appsetid/AppSetId\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final C0894a f90549c = new C0894a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f90550d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f90551e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final String f90552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f90553b;

    /* JADX INFO: renamed from: i8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0894a {
        public /* synthetic */ C0894a(x xVar) {
            this();
        }

        public C0894a() {
        }
    }

    public a(@oy.l String id2, int i10) {
        m0.p(id2, "id");
        this.f90552a = id2;
        this.f90553b = i10;
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("Scope undefined.");
        }
    }

    @oy.l
    public final String a() {
        return this.f90552a;
    }

    public final int b() {
        return this.f90553b;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m0.g(this.f90552a, aVar.f90552a) && this.f90553b == aVar.f90553b;
    }

    public int hashCode() {
        return (this.f90552a.hashCode() * 31) + this.f90553b;
    }

    @oy.l
    public String toString() {
        return "AppSetId: id=" + this.f90552a + ", scope=" + (this.f90553b == 1 ? "SCOPE_APP" : "SCOPE_DEVELOPER");
    }
}
