package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class iqh {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public iqh(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = lae0.a;
        hm20.j("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static iqh a(Context context) {
        fae0 fae0Var = new fae0(context);
        String strA = fae0Var.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new iqh(strA, fae0Var.a("google_api_key"), fae0Var.a("firebase_database_url"), fae0Var.a("ga_trackingId"), fae0Var.a("gcm_defaultSenderId"), fae0Var.a("google_storage_bucket"), fae0Var.a("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof iqh)) {
            return false;
        }
        iqh iqhVar = (iqh) obj;
        return scy.a(this.b, iqhVar.b) && scy.a(this.a, iqhVar.a) && scy.a(this.c, iqhVar.c) && scy.a(this.d, iqhVar.d) && scy.a(this.e, iqhVar.e) && scy.a(this.f, iqhVar.f) && scy.a(this.g, iqhVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        scy.a aVar = new scy.a(this);
        aVar.a(this.b, "applicationId");
        aVar.a(this.a, "apiKey");
        aVar.a(this.c, "databaseUrl");
        aVar.a(this.e, "gcmSenderId");
        aVar.a(this.f, "storageBucket");
        aVar.a(this.g, "projectId");
        return aVar.toString();
    }
}
