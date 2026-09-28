package com.sportygames.newcms.uitext;

import android.os.Parcel;
import android.os.Parcelable;
import com.sportygames.newcms.CMSRes;
import com.sportygames.newcms.c;
import defpackage.a4h;
import defpackage.n1a0;
import defpackage.qcn;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportygames/newcms/uitext/CMSUiText;", "Lcom/sportygames/newcms/uitext/UiText;", "cms_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CMSUiText extends UiText {
    public static final Parcelable.Creator<CMSUiText> CREATOR = new a();
    public final CMSRes a;
    public final qcn<String> b;

    public static final class a implements Parcelable.Creator<CMSUiText> {
        @Override // android.os.Parcelable.Creator
        public final CMSUiText createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new CMSUiText((CMSRes) parcel.readParcelable(CMSUiText.class.getClassLoader()), a4h.f(parcel.createStringArrayList()));
        }

        @Override // android.os.Parcelable.Creator
        public final CMSUiText[] newArray(int i) {
            return new CMSUiText[i];
        }
    }

    public CMSUiText(CMSRes cMSRes, qcn<String> qcnVar) {
        cMSRes.getClass();
        qcnVar.getClass();
        this.a = cMSRes;
        this.b = qcnVar;
    }

    @Override // com.sportygames.newcms.uitext.UiText
    public final String a(androidx.compose.runtime.a aVar) {
        aVar.N(176522839);
        String[] strArr = (String[]) this.b.toArray(new String[0]);
        String strC = c.c(this.a, (String[]) Arrays.copyOf(strArr, strArr.length), aVar);
        aVar.H();
        return strC;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CMSUiText)) {
            return false;
        }
        CMSUiText cMSUiText = (CMSUiText) obj;
        return Intrinsics.g(this.a, cMSUiText.a) && Intrinsics.g(this.b, cMSUiText.b);
    }

    public final int hashCode() {
        CMSRes cMSRes = this.a;
        return this.b.hashCode() + ((cMSRes.getB() + ((cMSRes.getA() + 527) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeStringList(this.b);
    }

    public CMSUiText(CMSRes cMSRes) {
        this(cMSRes, n1a0.c);
    }
}
