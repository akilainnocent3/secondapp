package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.scy;
import defpackage.twk0;
import defpackage.uif;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class AuthenticationExtensions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new twk0();
    public final FidoAppIdExtension a;
    public final zzs b;
    public final UserVerificationMethodExtension c;
    public final zzz d;
    public final zzab e;
    public final zzad f;
    public final zzu i;
    public final zzag v;
    public final GoogleThirdPartyPaymentExtension w;
    public final zzai y;

    public AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, zzs zzsVar, UserVerificationMethodExtension userVerificationMethodExtension, zzz zzzVar, zzab zzabVar, zzad zzadVar, zzu zzuVar, zzag zzagVar, GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, zzai zzaiVar) {
        this.a = fidoAppIdExtension;
        this.c = userVerificationMethodExtension;
        this.b = zzsVar;
        this.d = zzzVar;
        this.e = zzabVar;
        this.f = zzadVar;
        this.i = zzuVar;
        this.v = zzagVar;
        this.w = googleThirdPartyPaymentExtension;
        this.y = zzaiVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        return scy.a(this.a, authenticationExtensions.a) && scy.a(this.b, authenticationExtensions.b) && scy.a(this.c, authenticationExtensions.c) && scy.a(this.d, authenticationExtensions.d) && scy.a(this.e, authenticationExtensions.e) && scy.a(this.f, authenticationExtensions.f) && scy.a(this.i, authenticationExtensions.i) && scy.a(this.v, authenticationExtensions.v) && scy.a(this.w, authenticationExtensions.w) && scy.a(this.y, authenticationExtensions.y);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.h(parcel, 2, this.a, i, false);
        uif.h(parcel, 3, this.b, i, false);
        uif.h(parcel, 4, this.c, i, false);
        uif.h(parcel, 5, this.d, i, false);
        uif.h(parcel, 6, this.e, i, false);
        uif.h(parcel, 7, this.f, i, false);
        uif.h(parcel, 8, this.i, i, false);
        uif.h(parcel, 9, this.v, i, false);
        uif.h(parcel, 10, this.w, i, false);
        uif.h(parcel, 11, this.y, i, false);
        uif.n(parcel, iM);
    }
}
