package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pvk {
    public final String a;
    public final String b;

    public pvk(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvk)) {
            return false;
        }
        pvk pvkVar = (pvk) obj;
        return this.a.equals(pvkVar.a) && Intrinsics.g(this.b, pvkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("GiftShareData(url=", this.a, ", giftId=", this.b, ")");
    }
}
