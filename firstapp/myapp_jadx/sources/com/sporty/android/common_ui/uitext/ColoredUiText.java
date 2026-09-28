package com.sporty.android.common_ui.uitext;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cet;
import defpackage.f78;
import defpackage.f8i;
import defpackage.ix80;
import defpackage.j7g;
import defpackage.ljf0;
import defpackage.n9i;
import defpackage.nk0;
import defpackage.o9i;
import defpackage.ora0;
import defpackage.r58;
import defpackage.t82;
import defpackage.t9i;
import defpackage.yef0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/sporty/android/common_ui/uitext/ColoredUiText;", "Lcom/sporty/android/common_ui/uitext/UiText;", "Landroid/os/Parcelable;", "common-ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ColoredUiText extends UiText implements Parcelable {
    public static final Parcelable.Creator<ColoredUiText> CREATOR = new a();
    public final UiText a;
    public final Integer b;
    public final Integer c;

    public static final class a implements Parcelable.Creator<ColoredUiText> {
        @Override // android.os.Parcelable.Creator
        public final ColoredUiText createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ColoredUiText((UiText) parcel.readParcelable(ColoredUiText.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ColoredUiText[] newArray(int i) {
            return new ColoredUiText[i];
        }
    }

    public ColoredUiText(UiText uiText, Integer num, Integer num2) {
        uiText.getClass();
        this.a = uiText;
        this.b = num;
        this.c = num2;
    }

    @Override // com.sporty.android.common_ui.uitext.UiText
    public final nk0 a(Context context) {
        context.getClass();
        Integer numValueOf = null;
        nk0.b bVar = new nk0.b(numValueOf);
        Integer num = this.b;
        if (num != null) {
            numValueOf = Integer.valueOf(context.getColor(num.intValue()));
        } else {
            Integer num2 = this.c;
            if (num2 != null) {
                numValueOf = num2;
            }
        }
        UiText uiText = this.a;
        if (numValueOf != null) {
            int iL = bVar.l(new ora0(r58.b(numValueOf.intValue()), 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65534));
            try {
                bVar.e(uiText.a(context));
                Unit unit = Unit.a;
            } finally {
                bVar.i(iL);
            }
        } else {
            bVar.e(uiText.a(context));
        }
        return bVar.m();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.sporty.android.common_ui.uitext.UiText
    public final CharSequence e(Context context) {
        Integer numValueOf;
        context.getClass();
        j7g j7gVar = new j7g();
        Integer num = this.b;
        if (num != null) {
            numValueOf = Integer.valueOf(context.getColor(num.intValue()));
        } else {
            numValueOf = this.c;
            if (numValueOf == null) {
                numValueOf = null;
            }
        }
        UiText uiText = this.a;
        if (numValueOf == null) {
            j7gVar.a(uiText.e(context));
            return j7gVar;
        }
        j7gVar.e(numValueOf.intValue(), uiText.e(context));
        return j7gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColoredUiText)) {
            return false;
        }
        ColoredUiText coloredUiText = (ColoredUiText) obj;
        return Intrinsics.g(this.a, coloredUiText.a) && Intrinsics.g(this.b, coloredUiText.b) && Intrinsics.g(this.c, coloredUiText.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iIntValue = (iHashCode + (num != null ? num.intValue() : 0)) * 31;
        Integer num2 = this.c;
        return iIntValue + (num2 != null ? num2.intValue() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        Integer num = this.b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            f78.c(parcel, 1, num);
        }
        Integer num2 = this.c;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            f78.c(parcel, 1, num2);
        }
    }
}
