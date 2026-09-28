package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.account.international.data.model.RegistrationStatusResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xor implements bfx {
    public static final /* synthetic */ int d = 0;
    public final RegistrationStatusResponse a;
    public final String b;
    public final String c;

    static {
        Parcelable.Creator<RegistrationStatusResponse> creator = RegistrationStatusResponse.CREATOR;
    }

    public xor(RegistrationStatusResponse registrationStatusResponse, String str, String str2) {
        this.a = registrationStatusResponse;
        this.b = str;
        this.c = str2;
    }

    public static final xor fromBundle(Bundle bundle) {
        RegistrationStatusResponse registrationStatusResponse;
        String string;
        bundle.getClass();
        bundle.setClassLoader(xor.class.getClassLoader());
        if (!bundle.containsKey(AnalyticsParam.EVENT_STATUS)) {
            registrationStatusResponse = null;
        } else {
            if (!Parcelable.class.isAssignableFrom(RegistrationStatusResponse.class) && !Serializable.class.isAssignableFrom(RegistrationStatusResponse.class)) {
                zkh.a(RegistrationStatusResponse.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                return null;
            }
            registrationStatusResponse = (RegistrationStatusResponse) bundle.get(AnalyticsParam.EVENT_STATUS);
        }
        String string2 = "";
        if (bundle.containsKey("email")) {
            string = bundle.getString("email");
            if (string == null) {
                hb5.a("Argument \"email\" is marked as non-null but was passed a null value.");
                return null;
            }
        } else {
            string = "";
        }
        if (!bundle.containsKey("password") || (string2 = bundle.getString("password")) != null) {
            return new xor(registrationStatusResponse, string, string2);
        }
        hb5.a("Argument \"password\" is marked as non-null but was passed a null value.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xor)) {
            return false;
        }
        xor xorVar = (xor) obj;
        return Intrinsics.g(this.a, xorVar.a) && Intrinsics.g(this.b, xorVar.b) && Intrinsics.g(this.c, xorVar.c);
    }

    public final int hashCode() {
        RegistrationStatusResponse registrationStatusResponse = this.a;
        return this.c.hashCode() + gmf0.a((registrationStatusResponse == null ? 0 : registrationStatusResponse.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LatamSignUpEmailFragmentArgs(status=");
        sb.append(this.a);
        sb.append(", email=");
        sb.append(this.b);
        sb.append(", password=");
        return uf80.a(sb, this.c, ")");
    }

    public xor() {
        this(null, "", "");
    }
}
