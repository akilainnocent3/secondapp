package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x980 implements bfx {
    public final String a;
    public final int b;

    public x980(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public static final x980 fromBundle(Bundle bundle) {
        bundle.getClass();
        bundle.setClassLoader(x980.class.getClassLoader());
        return new x980(bundle.containsKey("periodEndDate") ? bundle.getString("periodEndDate") : null, bundle.containsKey("periodDay") ? bundle.getInt("periodDay") : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x980)) {
            return false;
        }
        x980 x980Var = (x980) obj;
        return Intrinsics.g(this.a, x980Var.a) && this.b == x980Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Integer.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return d830.a(this.b, "SelfExclusionConfirmFragmentArgs(periodEndDate=", this.a, ", periodDay=", ")");
    }

    public x980() {
        this(null, 0);
    }
}
