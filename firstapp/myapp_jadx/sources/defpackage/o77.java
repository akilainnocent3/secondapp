package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o77 {
    public final String a;
    public final int b;
    public final String c;

    public o77(String str, int i, String str2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o77)) {
            return false;
        }
        o77 o77Var = (o77) obj;
        return Intrinsics.g(this.a, o77Var.a) && this.b == o77Var.b && this.c.equals(o77Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gpp.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return uf80.a(ml5.a(this.b, "ChannelUIState(displayChannelName=", this.a, ", channelIconResourceId=", ", channelIconUrl="), this.c, ")");
    }
}
