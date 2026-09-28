package com.sportybet.android.transaction.domain.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import defpackage.pe4;
import defpackage.sn5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/sportybet/android/transaction/domain/model/LastDayRangeOption;", "Landroid/os/Parcelable;", "InnerUiText", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LastDayRangeOption implements Parcelable {
    public static final Parcelable.Creator<LastDayRangeOption> CREATOR = new a();
    public final int a;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/sportybet/android/transaction/domain/model/LastDayRangeOption$InnerUiText;", "Lcom/sporty/android/common_ui/uitext/UiText;", "Landroid/os/Parcelable;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class InnerUiText extends UiText implements Parcelable {
        public static final Parcelable.Creator<InnerUiText> CREATOR = new a();
        public final int a;

        public static final class a implements Parcelable.Creator<InnerUiText> {
            @Override // android.os.Parcelable.Creator
            public final InnerUiText createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InnerUiText(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final InnerUiText[] newArray(int i) {
                return new InnerUiText[i];
            }
        }

        public InnerUiText(int i) {
            this.a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.sporty.android.common_ui.uitext.UiText
        public final CharSequence e(Context context) {
            context.getClass();
            int i = this.a;
            return i == 1 ? sn5.b(context, R.string.common_dates__today, new Object[0]) : sn5.b(context, R.string.page_transaction__last_vnumber_days, String.valueOf(i));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.a);
        }
    }

    public static final class a implements Parcelable.Creator<LastDayRangeOption> {
        @Override // android.os.Parcelable.Creator
        public final LastDayRangeOption createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new LastDayRangeOption(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final LastDayRangeOption[] newArray(int i) {
            return new LastDayRangeOption[i];
        }
    }

    public LastDayRangeOption(int i) {
        this.a = i;
    }

    public final UiText a() {
        return new InnerUiText(this.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LastDayRangeOption) && this.a == ((LastDayRangeOption) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return pe4.b(this.a, "LastDayRangeOption(days=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
    }
}
