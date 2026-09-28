package defpackage;

import android.os.Parcelable;
import com.sportybet.core.domain.model.ApplicableCategoryIds;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ive {
    public final String a;
    public final String b;
    public final String c;
    public final List<? extends Integer> d;

    public ive(String str, String str2, String str3, List<? extends Integer> list) {
        bt6.a(str, str2, list);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ive)) {
            return false;
        }
        ive iveVar = (ive) obj;
        if (!Intrinsics.g(this.a, iveVar.a) || !Intrinsics.g(this.b, iveVar.b) || !this.c.equals(iveVar.c)) {
            return false;
        }
        List<? extends Integer> list = iveVar.d;
        Parcelable.Creator<ApplicableCategoryIds> creator = ApplicableCategoryIds.CREATOR;
        return Intrinsics.g(this.d, list);
    }

    public final int hashCode() {
        int iA = gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Parcelable.Creator<ApplicableCategoryIds> creator = ApplicableCategoryIds.CREATOR;
        return this.d.hashCode() + iA;
    }

    public final String toString() {
        return kwi.a(ux5.a("DobGiftReceivedState(titleImageUrl=", this.a, ", currencyCode=", this.b, ", amount="), this.c, ", applicableCategoryIds=", ApplicableCategoryIds.e(this.d), ")");
    }
}
