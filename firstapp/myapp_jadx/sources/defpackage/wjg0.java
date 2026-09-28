package defpackage;

import com.sportybet.core.injection.opentelemetry.PageMeta;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wjg0 implements pdd0 {
    public final String a;
    public final HashMap<String, Object> b;
    public final PageMeta c;

    public wjg0(String str, HashMap map) {
        PageMeta.INSTANCE.getClass();
        PageMeta pageMetaA = PageMeta.Companion.a();
        this.a = str;
        this.b = map;
        this.c = pageMetaA;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjg0)) {
            return false;
        }
        wjg0 wjg0Var = (wjg0) obj;
        return Intrinsics.g(this.a, wjg0Var.a) && Intrinsics.g(this.b, wjg0Var.b) && Intrinsics.g(this.c, wjg0Var.c);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    @Override // defpackage.pdd0
    public final PageMeta getPageMeta() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        PageMeta pageMeta = this.c;
        return iHashCode + (pageMeta == null ? 0 : pageMeta.hashCode());
    }

    public final String toString() {
        return "TrackingEventWithMetrics(name=" + this.a + ", metrics=" + this.b + ", pageMeta=" + this.c + ")";
    }
}
