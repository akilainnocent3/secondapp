package com.sportybet.feature.inappreview;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    public final String a;
    public final a b;

    public e(String str, a aVar) {
        aVar.getClass();
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a.equals(eVar.a) && Intrinsics.g(this.b, eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InAppReviewState(bgPeopleRes=" + this.a + ", dialogState=" + this.b + ")";
    }
}
