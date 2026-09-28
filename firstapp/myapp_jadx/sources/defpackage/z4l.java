package defpackage;

import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class z4l {
    public final String a = "com.google.android.gms.fonts";
    public final String b = "com.google.android.gms";
    public final int c = R.array.com_google_android_gms_fonts_certs_common_ui;

    public z4l(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4l)) {
            return false;
        }
        z4l z4lVar = (z4l) obj;
        return Intrinsics.g(this.a, z4lVar.a) && Intrinsics.g(this.b, z4lVar.b) && this.c == z4lVar.c;
    }

    public final int hashCode() {
        return gmf0.a(this.a.hashCode() * 31, 961, this.b) + this.c;
    }
}
