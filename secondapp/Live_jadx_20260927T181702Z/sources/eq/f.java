package eq;

import android.net.Uri;
import cs.o;
import java.util.Map;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public static final a f81535e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final Uri f81536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final Map<String, String> f81537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    public final JSONObject f81538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.m
    public final fq.a f81539d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(x xVar) {
            this();
        }

        @oy.l
        @o
        public final f a(@oy.l eq.a aVar) {
            return new f(aVar.f(), aVar.d(), aVar.e(), aVar.c());
        }

        public a() {
        }
    }

    public f(@oy.l Uri uri, @oy.l Map<String, String> map, @oy.m JSONObject jSONObject, @oy.m fq.a aVar) {
        this.f81536a = uri;
        this.f81537b = map;
        this.f81538c = jSONObject;
        this.f81539d = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ f f(f fVar, Uri uri, Map map, JSONObject jSONObject, fq.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            uri = fVar.f81536a;
        }
        if ((i10 & 2) != 0) {
            map = fVar.f81537b;
        }
        if ((i10 & 4) != 0) {
            jSONObject = fVar.f81538c;
        }
        if ((i10 & 8) != 0) {
            aVar = fVar.f81539d;
        }
        return fVar.e(uri, map, jSONObject, aVar);
    }

    @oy.l
    @o
    public static final f g(@oy.l eq.a aVar) {
        return f81535e.a(aVar);
    }

    @oy.l
    public final Uri a() {
        return this.f81536a;
    }

    @oy.l
    public final Map<String, String> b() {
        return this.f81537b;
    }

    @oy.m
    public final JSONObject c() {
        return this.f81538c;
    }

    @oy.m
    public final fq.a d() {
        return this.f81539d;
    }

    @oy.l
    public final f e(@oy.l Uri uri, @oy.l Map<String, String> map, @oy.m JSONObject jSONObject, @oy.m fq.a aVar) {
        return new f(uri, map, jSONObject, aVar);
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return m0.g(this.f81536a, fVar.f81536a) && m0.g(this.f81537b, fVar.f81537b) && m0.g(this.f81538c, fVar.f81538c) && m0.g(this.f81539d, fVar.f81539d);
    }

    @oy.m
    public final fq.a h() {
        return this.f81539d;
    }

    public int hashCode() {
        int iHashCode = ((this.f81536a.hashCode() * 31) + this.f81537b.hashCode()) * 31;
        JSONObject jSONObject = this.f81538c;
        int iHashCode2 = (iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        fq.a aVar = this.f81539d;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    @oy.l
    public final Map<String, String> i() {
        return this.f81537b;
    }

    @oy.m
    public final JSONObject j() {
        return this.f81538c;
    }

    @oy.l
    public final Uri k() {
        return this.f81536a;
    }

    @oy.l
    public String toString() {
        return "SendBeaconRequest(url=" + this.f81536a + ", headers=" + this.f81537b + ", payload=" + this.f81538c + ", cookieStorage=" + this.f81539d + ')';
    }
}
