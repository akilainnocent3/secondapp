package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class wph0 {
    public final int a;
    public final String b;
    public final String c;

    public wph0(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wph0)) {
            return false;
        }
        wph0 wph0Var = (wph0) obj;
        return this.a == wph0Var.a && Intrinsics.g(this.b, wph0Var.b) && Intrinsics.g(this.c, wph0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserReactionItemData(msgId=");
        sb.append(this.a);
        sb.append(", userName=");
        sb.append(this.b);
        sb.append(", emoji=");
        return j26.a(sb, this.c, ')');
    }
}
