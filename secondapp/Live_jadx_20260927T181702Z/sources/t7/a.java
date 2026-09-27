package t7;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f136176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final Bundle f136177b = new Bundle();

    public a(int i10) {
        this.f136176a = i10;
    }

    public static /* synthetic */ a d(a aVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = aVar.f136176a;
        }
        return aVar.c(i10);
    }

    @Override // t7.y
    public int a() {
        return this.f136176a;
    }

    public final int b() {
        return this.f136176a;
    }

    @oy.l
    public final a c(int i10) {
        return new a(i10);
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && kotlin.jvm.internal.m0.g(a.class, obj.getClass()) && a() == ((a) obj).a();
    }

    public int hashCode() {
        return 31 + a();
    }

    @Override // t7.y
    @oy.l
    public Bundle j() {
        return this.f136177b;
    }

    @oy.l
    public String toString() {
        return "ActionOnlyNavDirections(actionId=" + a() + ')';
    }
}
