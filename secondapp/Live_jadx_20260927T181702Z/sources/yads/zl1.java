package yads;

import android.net.Uri;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f158897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f158898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wl1 f158899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f158900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f158901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p51 f158902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f158903g;

    public zl1(Uri uri, String str, wl1 wl1Var, List list, String str2, p51 p51Var, Object obj) {
        this.f158897a = uri;
        this.f158898b = str;
        this.f158899c = wl1Var;
        this.f158900d = list;
        this.f158901e = str2;
        this.f158902f = p51Var;
        l51 l51VarF = p51.f();
        for (int i10 = 0; i10 < p51Var.size(); i10++) {
            l51VarF.a(((dm1) p51Var.get(i10)).a().a());
        }
        l51VarF.a();
        this.f158903g = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl1)) {
            return false;
        }
        zl1 zl1Var = (zl1) obj;
        return this.f158897a.equals(zl1Var.f158897a) && ib3.a(this.f158898b, zl1Var.f158898b) && ib3.a(this.f158899c, zl1Var.f158899c) && ib3.a((Object) null, (Object) null) && this.f158900d.equals(zl1Var.f158900d) && ib3.a(this.f158901e, zl1Var.f158901e) && this.f158902f.equals(zl1Var.f158902f) && ib3.a(this.f158903g, zl1Var.f158903g);
    }

    public final int hashCode() {
        int iHashCode = this.f158897a.hashCode() * 31;
        String str = this.f158898b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        wl1 wl1Var = this.f158899c;
        int iHashCode3 = (this.f158900d.hashCode() + ((iHashCode2 + (wl1Var == null ? 0 : wl1Var.hashCode())) * 961)) * 31;
        String str2 = this.f158901e;
        int iHashCode4 = (this.f158902f.hashCode() + ((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Object obj = this.f158903g;
        return iHashCode4 + (obj != null ? obj.hashCode() : 0);
    }
}
