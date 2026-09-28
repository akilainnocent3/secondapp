package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class maa0 {
    public final String a;
    public final Drawable b;
    public final boolean c;

    public maa0(String str, Drawable drawable, boolean z) {
        str.getClass();
        this.a = str;
        this.b = drawable;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof maa0)) {
            return false;
        }
        maa0 maa0Var = (maa0) obj;
        return Intrinsics.g(this.a, maa0Var.a) && this.b.equals(maa0Var.b) && this.c == maa0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SocialMetaModel(username=");
        sb.append(this.a);
        sb.append(", avatar=");
        sb.append(this.b);
        sb.append(", isMine=");
        return mq0.a(sb, this.c, ")");
    }
}
