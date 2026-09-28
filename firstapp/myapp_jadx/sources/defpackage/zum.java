package defpackage;

import android.os.Bundle;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zum implements ehx {
    public final String a;
    public final int b = R.id.to_reset_password;

    public zum(String str) {
        this.a = str;
    }

    @Override // defpackage.ehx
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("email", this.a);
        return bundle;
    }

    @Override // defpackage.ehx
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zum) && Intrinsics.g(this.a, ((zum) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("ToResetPassword(email=", this.a, ")");
    }
}
