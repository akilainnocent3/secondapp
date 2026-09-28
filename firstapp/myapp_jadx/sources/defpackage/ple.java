package defpackage;

import android.content.DialogInterface;
import com.appsflyer.internal.v;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ple {
    public final String a;
    public final String b;
    public final DialogInterface.OnClickListener c;
    public final String d;
    public final DialogInterface.OnClickListener e;
    public final String f;
    public final Integer g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ple)) {
            return false;
        }
        ple pleVar = (ple) obj;
        return Intrinsics.g(this.a, pleVar.a) && Intrinsics.g(this.b, pleVar.b) && Intrinsics.g(this.c, pleVar.c) && Intrinsics.g(this.d, pleVar.d) && Intrinsics.g(this.e, pleVar.e) && Intrinsics.g(this.f, pleVar.f) && Intrinsics.g(this.g, pleVar.g);
    }

    public final int hashCode() {
        int iA = gmf0.a(this.a.hashCode() * 31, 31, this.b);
        DialogInterface.OnClickListener onClickListener = this.c;
        int iHashCode = (iA + (onClickListener == null ? 0 : onClickListener.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DialogInterface.OnClickListener onClickListener2 = this.e;
        int iHashCode3 = (iHashCode2 + (onClickListener2 == null ? 0 : onClickListener2.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.g;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("DialogInfo(message=", this.a, ", positiveActionText=", this.b, ", positiveAction=");
        sbA.append(this.c);
        sbA.append(", negativeActionText=");
        sbA.append(this.d);
        sbA.append(", negativeAction=");
        sbA.append(this.e);
        sbA.append(", title=");
        sbA.append(this.f);
        sbA.append(", negativeBtnColor=");
        return v.a(sbA, this.g, ")");
    }

    public ple(String str, String str2, DialogInterface.OnClickListener onClickListener, String str3, DialogInterface.OnClickListener onClickListener2, String str4, Integer num) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = onClickListener;
        this.d = str3;
        this.e = onClickListener2;
        this.f = str4;
        this.g = num;
    }
}
