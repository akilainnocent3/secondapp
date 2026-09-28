package defpackage;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class xw70 implements pdd0 {
    public final String a;

    public xw70(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("language", this.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xw70) && Intrinsics.g(this.a, ((xw70) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "search__page__view";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("SearchPageView(language=", this.a, ")");
    }
}
