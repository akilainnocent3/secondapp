package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class nbl0 extends hdl0 {
    public final Context a;
    public final mfe0 b;

    public nbl0(Context context, mfe0 mfe0Var) {
        this.a = context;
        this.b = mfe0Var;
    }

    @Override // defpackage.hdl0
    public final Context a() {
        return this.a;
    }

    @Override // defpackage.hdl0
    public final mfe0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hdl0)) {
            return false;
        }
        hdl0 hdl0Var = (hdl0) obj;
        if (!this.a.equals(hdl0Var.a())) {
            return false;
        }
        mfe0 mfe0Var = this.b;
        if (mfe0Var == null) {
            return hdl0Var.b() == null;
        }
        return mfe0Var.equals(hdl0Var.b());
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        mfe0 mfe0Var = this.b;
        return (mfe0Var == null ? 0 : mfe0Var.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        String string = this.a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(length + 45 + strValueOf.length() + 1);
        hxa.c(sb, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
