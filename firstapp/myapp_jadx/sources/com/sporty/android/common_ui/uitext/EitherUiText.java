package com.sporty.android.common_ui.uitext;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.nk0;
import defpackage.yvf;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/sporty/android/common_ui/uitext/EitherUiText;", "Lcom/sporty/android/common_ui/uitext/UiText;", "Landroid/os/Parcelable;", "common-ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class EitherUiText extends UiText implements Parcelable {
    public static final Parcelable.Creator<EitherUiText> CREATOR = new a();
    public final UiText a;
    public final UiText b;
    public final Function1<Context, Boolean> c;

    public static final class a implements Parcelable.Creator<EitherUiText> {
        @Override // android.os.Parcelable.Creator
        public final EitherUiText createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new EitherUiText((UiText) parcel.readParcelable(EitherUiText.class.getClassLoader()), (UiText) parcel.readParcelable(EitherUiText.class.getClassLoader()), (Function1) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final EitherUiText[] newArray(int i) {
            return new EitherUiText[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EitherUiText(UiText uiText, UiText uiText2, Function1<? super Context, Boolean> function1) {
        uiText.getClass();
        uiText2.getClass();
        function1.getClass();
        this.a = uiText;
        this.b = uiText2;
        this.c = function1;
    }

    @Override // com.sporty.android.common_ui.uitext.UiText
    public final nk0 a(Context context) {
        context.getClass();
        return (this.c.invoke(context).booleanValue() ? this.a : this.b).a(context);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.sporty.android.common_ui.uitext.UiText
    public final CharSequence e(Context context) {
        context.getClass();
        return (this.c.invoke(context).booleanValue() ? this.a : this.b).e(context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EitherUiText)) {
            return false;
        }
        EitherUiText eitherUiText = (EitherUiText) obj;
        return Intrinsics.g(this.a, eitherUiText.a) && Intrinsics.g(this.b, eitherUiText.b) && Intrinsics.g(this.c, eitherUiText.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + yvf.a(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeSerializable((Serializable) this.c);
    }
}
