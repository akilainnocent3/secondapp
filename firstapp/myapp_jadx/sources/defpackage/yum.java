package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.account.international.data.model.RegistrationStatusResponse;
import com.sportybet.android.gp.tz.R;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class yum implements ehx {
    public final RegistrationStatusResponse a;
    public final String b;
    public final String c;
    public final int d = R.id.to_latam_registration;

    public yum(RegistrationStatusResponse registrationStatusResponse, String str, String str2) {
        this.a = registrationStatusResponse;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.ehx
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(RegistrationStatusResponse.class);
        Parcelable parcelable = this.a;
        if (zIsAssignableFrom) {
            bundle.putParcelable(AnalyticsParam.EVENT_STATUS, parcelable);
        } else if (Serializable.class.isAssignableFrom(RegistrationStatusResponse.class)) {
            bundle.putSerializable(AnalyticsParam.EVENT_STATUS, (Serializable) parcelable);
        }
        bundle.putString("email", this.b);
        bundle.putString("password", this.c);
        return bundle;
    }

    @Override // defpackage.ehx
    public final int b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yum)) {
            return false;
        }
        yum yumVar = (yum) obj;
        return Intrinsics.g(this.a, yumVar.a) && Intrinsics.g(this.b, yumVar.b) && Intrinsics.g(this.c, yumVar.c);
    }

    public final int hashCode() {
        RegistrationStatusResponse registrationStatusResponse = this.a;
        return this.c.hashCode() + gmf0.a((registrationStatusResponse == null ? 0 : registrationStatusResponse.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToLatamRegistration(status=");
        sb.append(this.a);
        sb.append(", email=");
        sb.append(this.b);
        sb.append(", password=");
        return uf80.a(sb, this.c, lobGSRIlnSGJY.CvrQ);
    }
}
