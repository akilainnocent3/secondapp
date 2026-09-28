package com.sporty.android.common_ui.uitext;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.nk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/sporty/android/common_ui/uitext/StringUiText;", "Lcom/sporty/android/common_ui/uitext/UiText;", "Landroid/os/Parcelable;", "common-ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class StringUiText extends UiText implements Parcelable {
    public static final Parcelable.Creator<StringUiText> CREATOR = new a();
    public final CharSequence a;

    public static final class a implements Parcelable.Creator<StringUiText> {
        @Override // android.os.Parcelable.Creator
        public final StringUiText createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new StringUiText((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final StringUiText[] newArray(int i) {
            return new StringUiText[i];
        }
    }

    public StringUiText(CharSequence charSequence) {
        charSequence.getClass();
        this.a = charSequence;
    }

    @Override // com.sporty.android.common_ui.uitext.UiText
    public final nk0 a(Context context) {
        context.getClass();
        nk0.b bVar = new nk0.b((Object) null);
        bVar.f(this.a);
        return bVar.m();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.sporty.android.common_ui.uitext.UiText
    public final CharSequence e(Context context) {
        context.getClass();
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StringUiText) && Intrinsics.g(this.a, ((StringUiText) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StringUiText(string=" + ((Object) this.a) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        TextUtils.writeToParcel(this.a, parcel, i);
    }
}
