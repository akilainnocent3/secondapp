package ko;

import a9.w;
import a9.x0;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@w
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @a9.j(name = "title")
    @oy.m
    public final String f102697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a9.j(name = "description")
    @oy.m
    public final String f102698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @a9.j(name = CampaignEx.JSON_KEY_IMAGE_URL)
    @oy.m
    public final String f102699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    @a9.j(name = "url")
    public final String f102700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @x0(autoGenerate = true)
    public final int f102701e;

    public o(@oy.m String str, @oy.m String str2, @oy.m String str3, @oy.l String specific_url, int i10) {
        m0.p(specific_url, "specific_url");
        this.f102697a = str;
        this.f102698b = str2;
        this.f102699c = str3;
        this.f102700d = specific_url;
        this.f102701e = i10;
    }

    public static /* synthetic */ o g(o oVar, String str, String str2, String str3, String str4, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = oVar.f102697a;
        }
        if ((i11 & 2) != 0) {
            str2 = oVar.f102698b;
        }
        if ((i11 & 4) != 0) {
            str3 = oVar.f102699c;
        }
        if ((i11 & 8) != 0) {
            str4 = oVar.f102700d;
        }
        if ((i11 & 16) != 0) {
            i10 = oVar.f102701e;
        }
        int i12 = i10;
        String str5 = str3;
        return oVar.f(str, str2, str5, str4, i12);
    }

    @oy.m
    public final String a() {
        return this.f102697a;
    }

    @oy.m
    public final String b() {
        return this.f102698b;
    }

    @oy.m
    public final String c() {
        return this.f102699c;
    }

    @oy.l
    public final String d() {
        return this.f102700d;
    }

    public final int e() {
        return this.f102701e;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return m0.g(this.f102697a, oVar.f102697a) && m0.g(this.f102698b, oVar.f102698b) && m0.g(this.f102699c, oVar.f102699c) && m0.g(this.f102700d, oVar.f102700d) && this.f102701e == oVar.f102701e;
    }

    @oy.l
    public final o f(@oy.m String str, @oy.m String str2, @oy.m String str3, @oy.l String specific_url, int i10) {
        m0.p(specific_url, "specific_url");
        return new o(str, str2, str3, specific_url, i10);
    }

    @oy.m
    public final String h() {
        return this.f102698b;
    }

    public int hashCode() {
        String str = this.f102697a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f102698b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f102699c;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f102700d.hashCode()) * 31) + this.f102701e;
    }

    public final int i() {
        return this.f102701e;
    }

    @oy.m
    public final String j() {
        return this.f102699c;
    }

    @oy.l
    public final String k() {
        return this.f102700d;
    }

    @oy.m
    public final String l() {
        return this.f102697a;
    }

    @oy.l
    public String toString() {
        return "RoomTable(title=" + this.f102697a + ", desc=" + this.f102698b + ", image_url=" + this.f102699c + ", specific_url=" + this.f102700d + ", id=" + this.f102701e + gi.j.f86771d;
    }

    public /* synthetic */ o(String str, String str2, String str3, String str4, int i10, int i11, x xVar) {
        this(str, str2, str3, str4, (i11 & 16) != 0 ? 0 : i10);
    }
}
