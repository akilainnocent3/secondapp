package com.sporty.android.common_ui.uitext;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.j7g;
import defpackage.nk0;
import defpackage.vch0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/sporty/android/common_ui/uitext/ConcatUiText;", "Lcom/sporty/android/common_ui/uitext/UiText;", "Landroid/os/Parcelable;", "common-ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ConcatUiText extends UiText implements Parcelable {
    public static final Parcelable.Creator<ConcatUiText> CREATOR = new a();
    public final UiText[] a;
    public final UiText b;

    public static final class a implements Parcelable.Creator<ConcatUiText> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final ConcatUiText createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i = parcel.readInt();
            UiText[] uiTextArr = new UiText[i];
            for (int i2 = 0; i2 != i; i2++) {
                uiTextArr[i2] = parcel.readParcelable(ConcatUiText.class.getClassLoader());
            }
            return new ConcatUiText(uiTextArr, (UiText) parcel.readParcelable(ConcatUiText.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ConcatUiText[] newArray(int i) {
            return new ConcatUiText[i];
        }
    }

    public ConcatUiText(UiText[] uiTextArr, UiText uiText) {
        uiText.getClass();
        this.a = uiTextArr;
        this.b = uiText;
    }

    @Override // com.sporty.android.common_ui.uitext.UiText
    public final nk0 a(Context context) {
        context.getClass();
        nk0.b bVar = new nk0.b((Object) null);
        UiText[] uiTextArr = this.a;
        int length = uiTextArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            bVar.e(uiTextArr[i].a(context));
            if (i2 < uiTextArr.length - 1) {
                bVar.e(this.b.a(context));
            }
            i++;
            i2 = i3;
        }
        return bVar.m();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.sporty.android.common_ui.uitext.UiText
    public final CharSequence e(Context context) {
        context.getClass();
        j7g j7gVar = new j7g();
        UiText[] uiTextArr = this.a;
        int length = uiTextArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            j7gVar.a(uiTextArr[i].e(context));
            if (i2 < uiTextArr.length - 1) {
                j7gVar.a(this.b.e(context));
            }
            i++;
            i2 = i3;
        }
        return j7gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConcatUiText)) {
            return false;
        }
        ConcatUiText concatUiText = (ConcatUiText) obj;
        return Arrays.equals(this.a, concatUiText.a) && Intrinsics.g(this.b, concatUiText.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Arrays.hashCode(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        UiText[] uiTextArr = this.a;
        int length = uiTextArr.length;
        parcel.writeInt(length);
        for (int i2 = 0; i2 != length; i2++) {
            parcel.writeParcelable(uiTextArr[i2], i);
        }
        parcel.writeParcelable(this.b, i);
    }

    public ConcatUiText(UiText[] uiTextArr) {
        this(uiTextArr, vch0.a);
    }
}
