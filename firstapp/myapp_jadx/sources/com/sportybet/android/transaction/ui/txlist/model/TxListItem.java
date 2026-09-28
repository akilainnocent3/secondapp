package com.sportybet.android.transaction.ui.txlist.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import defpackage.brg0;
import defpackage.i41;
import defpackage.sn5;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes6.dex */
public interface TxListItem {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/android/transaction/ui/txlist/model/TxListItem$LoadMoreFooterUiText;", "Lcom/sporty/android/common_ui/uitext/UiText;", "Landroid/os/Parcelable;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class LoadMoreFooterUiText extends UiText implements Parcelable {
        public static final Parcelable.Creator<LoadMoreFooterUiText> CREATOR = new a();

        public static final class a implements Parcelable.Creator<LoadMoreFooterUiText> {
            @Override // android.os.Parcelable.Creator
            public final LoadMoreFooterUiText createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return new LoadMoreFooterUiText();
            }

            @Override // android.os.Parcelable.Creator
            public final LoadMoreFooterUiText[] newArray(int i) {
                return new LoadMoreFooterUiText[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.sporty.android.common_ui.uitext.UiText
        public final CharSequence e(Context context) {
            context.getClass();
            return sn5.b(context, R.string.app_common__loading_more_num, (String) CollectionsKt.b0(new Regex("\\s+").h(sn5.b(context, R.string.common_functions__no_more_records, new Object[0]))));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public static final class a implements TxListItem {
        public static final a a = new a();
        public static final UiText b = new LoadMoreFooterUiText();
    }

    public static final class b implements TxListItem {
        public final brg0 a;
        public final String b;
        public final String c;
        public final UiText d;
        public final boolean e;

        /* JADX WARN: Code duplicated, block: B:16:0x0065  */
        public b(brg0 brg0Var) {
            UiText resourceUiText;
            brg0Var.getClass();
            this.a = brg0Var;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM yyyy", Locale.getDefault());
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM HH:mm:ss", Locale.getDefault());
            long j = brg0Var.f;
            String str = simpleDateFormat2.format(Long.valueOf(j));
            str.getClass();
            this.b = str;
            String str2 = simpleDateFormat.format(Long.valueOf(j));
            str2.getClass();
            this.c = str2;
            int i = brg0Var.b;
            if (i == 10) {
                i41 i41Var = brg0Var.e;
                resourceUiText = Intrinsics.g(i41Var, i41.a.a) ? new ResourceUiText(R.string.page_transaction__withdrawals_blocked) : Intrinsics.g(i41Var, i41.c.a) ? new ResourceUiText(R.string.page_transaction__pending_verification) : Intrinsics.g(i41Var, i41.b.a) ? new ResourceUiText(R.string.page_transaction__verification_failed) : new ResourceUiText(R.string.page_transaction__pending);
            } else if (i == 20) {
                resourceUiText = null;
            } else if (i == 30) {
                resourceUiText = new ResourceUiText(R.string.page_transaction__failed);
            } else if (i == 90) {
                resourceUiText = new ResourceUiText(R.string.page_transaction__closed);
            } else if (i == 33 || i == 34) {
                resourceUiText = new ResourceUiText(R.string.page_transaction__failed);
            } else {
                resourceUiText = new StringUiText("");
            }
            this.d = resourceUiText;
            this.e = i == 10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "TxListItemData(transactionUI=" + this.a + ")";
        }
    }
}
