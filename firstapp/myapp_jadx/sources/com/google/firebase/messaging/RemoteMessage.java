package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ox0;
import defpackage.u2y;
import defpackage.uif;
import defpackage.z650;

/* JADX INFO: loaded from: classes4.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new z650();
    public final Bundle a;
    public ox0 b;
    public a c;

    public static class a {
        public final String a;
        public final String b;
        public final String c;

        public a(u2y u2yVar) {
            this.a = u2yVar.i("gcm.n.title");
            u2yVar.f("gcm.n.title");
            Object[] objArrE = u2yVar.e("gcm.n.title");
            if (objArrE != null) {
                String[] strArr = new String[objArrE.length];
                for (int i = 0; i < objArrE.length; i++) {
                    strArr[i] = String.valueOf(objArrE[i]);
                }
            }
            this.b = u2yVar.i("gcm.n.body");
            u2yVar.f("gcm.n.body");
            Object[] objArrE2 = u2yVar.e("gcm.n.body");
            if (objArrE2 != null) {
                String[] strArr2 = new String[objArrE2.length];
                for (int i2 = 0; i2 < objArrE2.length; i2++) {
                    strArr2[i2] = String.valueOf(objArrE2[i2]);
                }
            }
            u2yVar.i("gcm.n.icon");
            if (TextUtils.isEmpty(u2yVar.i("gcm.n.sound2"))) {
                u2yVar.i("gcm.n.sound");
            }
            u2yVar.i("gcm.n.tag");
            u2yVar.i("gcm.n.color");
            u2yVar.i("gcm.n.click_action");
            u2yVar.i("gcm.n.android_channel_id");
            String strI = u2yVar.i("gcm.n.link_android");
            strI = TextUtils.isEmpty(strI) ? u2yVar.i("gcm.n.link") : strI;
            if (!TextUtils.isEmpty(strI)) {
                Uri.parse(strI);
            }
            this.c = u2yVar.i("gcm.n.image");
            u2yVar.i("gcm.n.ticker");
            u2yVar.b("gcm.n.notification_priority");
            u2yVar.b("gcm.n.visibility");
            u2yVar.b("gcm.n.notification_count");
            u2yVar.a("gcm.n.sticky");
            u2yVar.a("gcm.n.local_only");
            u2yVar.a("gcm.n.default_sound");
            u2yVar.a("gcm.n.default_vibrate_timings");
            u2yVar.a("gcm.n.default_light_settings");
            u2yVar.g();
            u2yVar.d();
            u2yVar.j();
        }
    }

    public RemoteMessage(Bundle bundle) {
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.a(parcel, 2, this.a);
        uif.n(parcel, iM);
    }
}
