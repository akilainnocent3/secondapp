package com.sportybet.android.ugpay.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import defpackage.ay0;
import defpackage.bjb0;
import defpackage.sn5;
import defpackage.tx5;
import defpackage.vch0;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface BountyHintUiState {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/sportybet/android/ugpay/model/BountyHintUiState$DisplayTextUiText;", "Lcom/sporty/android/common_ui/uitext/UiText;", "Landroid/os/Parcelable;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class DisplayTextUiText extends UiText implements Parcelable {
        public static final Parcelable.Creator<DisplayTextUiText> CREATOR = new a();
        public final String a;
        public final String b;

        public static final class a implements Parcelable.Creator<DisplayTextUiText> {
            @Override // android.os.Parcelable.Creator
            public final DisplayTextUiText createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new DisplayTextUiText(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DisplayTextUiText[] newArray(int i) {
                return new DisplayTextUiText[i];
            }
        }

        public DisplayTextUiText(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.sporty.android.common_ui.uitext.UiText
        public final CharSequence e(Context context) {
            context.getClass();
            return sn5.b(context, R.string.page_payment__free_deposit_for_vcurrency_threshold_or_more__KE, this.b, bjb0.V(new BigDecimal(this.a).longValue())) + sn5.b(context, R.string.app_common__blank_space, new Object[0]) + sn5.b(context, R.string.page_payment__sportybet_will_credit_your_charges_to_your_balance, sn5.b(context, R.string.app_name, new Object[0]), "");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
            parcel.writeString(this.b);
        }
    }

    public static final class a implements BountyHintUiState {
        public final String a;
        public final String b;
        public final ResourceUiText c;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
            Object[] objArr = {str, str2};
            StringUiText stringUiText = vch0.a;
            this.c = new ResourceUiText(R.string.page_transaction__cash_back, ay0.S(objArr));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("BountyDetailsUiState(displayAmount=", this.a, ", displayCashBack=", this.b, ")");
        }
    }

    public static final class b implements BountyHintUiState {
        public final String a;
        public final String b;
        public final UiText c;

        public b(String str, String str2) {
            str2.getClass();
            this.a = str;
            this.b = str2;
            this.c = new DisplayTextUiText(str, str2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && Intrinsics.g(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("FreeDepositThresholdHint(threshold=", this.a, ", currency=", this.b, ")");
        }
    }
}
