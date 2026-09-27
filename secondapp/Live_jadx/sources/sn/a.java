package sn;

import gi.j;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @m
    public String f135486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @m
    public String f135487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @m
    public String f135488c;

    public a(@m String str, @m String str2, @m String str3) {
        this.f135486a = str;
        this.f135487b = str2;
        this.f135488c = str3;
    }

    public static /* synthetic */ a e(a aVar, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aVar.f135486a;
        }
        if ((i10 & 2) != 0) {
            str2 = aVar.f135487b;
        }
        if ((i10 & 4) != 0) {
            str3 = aVar.f135488c;
        }
        return aVar.d(str, str2, str3);
    }

    @m
    public final String a() {
        return this.f135486a;
    }

    @m
    public final String b() {
        return this.f135487b;
    }

    @m
    public final String c() {
        return this.f135488c;
    }

    @l
    public final a d(@m String str, @m String str2, @m String str3) {
        return new a(str, str2, str3);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m0.g(this.f135486a, aVar.f135486a) && m0.g(this.f135487b, aVar.f135487b) && m0.g(this.f135488c, aVar.f135488c);
    }

    @m
    public final String f() {
        return this.f135487b;
    }

    @m
    public final String g() {
        return this.f135488c;
    }

    @m
    public final String h() {
        return this.f135486a;
    }

    public int hashCode() {
        String str = this.f135486a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f135487b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f135488c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void i(@m String str) {
        this.f135487b = str;
    }

    public final void j(@m String str) {
        this.f135488c = str;
    }

    public final void k(@m String str) {
        this.f135486a = str;
    }

    @l
    public String toString() {
        return "DrmModel(ktyString=" + this.f135486a + ", drmKey=" + this.f135487b + ", drmKeyId=" + this.f135488c + j.f86771d;
    }
}
