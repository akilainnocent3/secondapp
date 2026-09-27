package com.ironsource;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class pg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f63324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f63325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f63326c;

    public pg(boolean z10, boolean z11, boolean z12) {
        this.f63324a = z10;
        this.f63325b = z11;
        this.f63326c = z12;
    }

    public final boolean a() {
        return this.f63324a;
    }

    public final boolean b() {
        return this.f63325b;
    }

    public final boolean c() {
        return this.f63326c;
    }

    public final boolean d() {
        return this.f63326c;
    }

    public final boolean e() {
        return this.f63324a;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg)) {
            return false;
        }
        pg pgVar = (pg) obj;
        return this.f63324a == pgVar.f63324a && this.f63325b == pgVar.f63325b && this.f63326c == pgVar.f63326c;
    }

    public final boolean f() {
        return this.f63325b;
    }

    @oy.l
    public final JSONObject g() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(C4346j8.f62121k, this.f63324a).put(C4346j8.f62122l, this.f63325b).put(C4346j8.f62123m, this.f63326c);
        kotlin.jvm.internal.m0.o(jSONObjectPut, "JSONObject()\n        .pu…ts.IS_SHOWN_KEY, isShown)");
        return jSONObjectPut;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        boolean z10 = this.f63324a;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = r10 * 31;
        boolean z11 = this.f63325b;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (i10 + r11) * 31;
        boolean z12 = this.f63326c;
        return i11 + (z12 ? 1 : z12);
    }

    @oy.l
    public String toString() {
        return "ViewVisibilityParams(isVisible=" + this.f63324a + ", isWindowVisible=" + this.f63325b + ", isShown=" + this.f63326c + gi.j.f86771d;
    }

    @oy.l
    public final pg a(boolean z10, boolean z11, boolean z12) {
        return new pg(z10, z11, z12);
    }

    public static /* synthetic */ pg a(pg pgVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = pgVar.f63324a;
        }
        if ((i10 & 2) != 0) {
            z11 = pgVar.f63325b;
        }
        if ((i10 & 4) != 0) {
            z12 = pgVar.f63326c;
        }
        return pgVar.a(z10, z11, z12);
    }
}
