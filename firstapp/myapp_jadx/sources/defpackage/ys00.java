package defpackage;

import com.sporty.android.core.model.patron.UserPhone;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ys00 {
    public final UserPhone a;
    public final String b;

    public ys00(UserPhone userPhone, String str) {
        userPhone.getClass();
        this.a = userPhone;
        this.b = str;
    }

    public static ys00 a(ys00 ys00Var, UserPhone userPhone) {
        String str = ys00Var.b;
        ys00Var.getClass();
        userPhone.getClass();
        return new ys00(userPhone, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys00)) {
            return false;
        }
        ys00 ys00Var = (ys00) obj;
        return Intrinsics.g(this.a, ys00Var.a) && this.b.equals(ys00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PhoneState(phone=" + this.a + ", displayText=" + this.b + ")";
    }
}
