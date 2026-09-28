package com.sportybet.feature.payment.impl.paybill;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.bmy;
import defpackage.bsr;
import defpackage.gmf0;
import defpackage.h5e;
import defpackage.j7g;
import defpackage.sn5;
import defpackage.uf80;
import defpackage.zch0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/sportybet/feature/payment/impl/paybill/ExclusiveOffersLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/sportybet/feature/payment/impl/paybill/ExclusiveOffersLayout$a;", "info", "", "setExclusiveOffersInfo", "(Lcom/sportybet/feature/payment/impl/paybill/ExclusiveOffersLayout$a;)V", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ExclusiveOffersLayout extends ConstraintLayout {
    public final bsr F;

    public static final class a {
        public final ArrayList a;
        public final String b;
        public final String c;

        public a(String str, String str2, ArrayList arrayList) {
            str2.getClass();
            this.a = arrayList;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && Intrinsics.g(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ExclusiveOffersInfo(payAmountPairList=");
            sb.append(this.a);
            sb.append(", freeDepositThresholdAmount=");
            sb.append(this.b);
            sb.append(", currency=");
            return uf80.a(sb, this.c, ")");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExclusiveOffersLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.layout_exclusive_offers, this);
        int i2 = R.id.quick_content;
        TextView textView = (TextView) h5e.a(R.id.quick_content, this);
        if (textView != null) {
            i2 = R.id.title;
            if (((TextView) h5e.a(R.id.title, this)) != null) {
                this.F = new bsr(this, textView);
                setBackgroundResource(R.drawable.exclusive_offers_bg);
                setPadding(zch0.b(context.getResources(), 11), zch0.b(context.getResources(), 12), zch0.b(context.getResources(), 11), zch0.b(context.getResources(), 16));
                return;
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void setExclusiveOffersInfo(a info) {
        info.getClass();
        j7g j7gVar = new j7g();
        ArrayList arrayList = info.a;
        String str = info.c;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            if (i < 0) {
                kotlin.collections.b.q();
                throw null;
            }
            Pair pair = (Pair) obj;
            Context context = getContext();
            context.getClass();
            Spanned spannedFromHtml = Html.fromHtml(sn5.b(context, R.string.common_payment_providers__only_pay_vcurrencytext1_to_make_a_successful_deposit_of_vcurrencytext2__KE, "<b>" + str + " " + pair.a + "</b>", "<b>" + str + " " + pair.b + "</b>"), 0);
            spannedFromHtml.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append(i3);
            sb.append(". ");
            j7gVar.a(sb.toString());
            j7gVar.a(spannedFromHtml);
            j7gVar.a("\n");
            i = i3;
        }
        j7gVar.a((arrayList.size() + 1) + ". ");
        Context context2 = getContext();
        context2.getClass();
        j7gVar.d(sn5.b(context2, R.string.page_payment__free_deposit_for_vcurrency_threshold_or_more__KE, str, info.b), true);
        j7gVar.a("  ");
        Context context3 = getContext();
        context3.getClass();
        j7gVar.a(sn5.b(context3, R.string.page_payment__sportybet_will_credit_your_charges_to_your_balance, sn5.c(this, R.string.app_name, new Object[0]), ""));
        this.F.b.setText(j7gVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExclusiveOffersLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExclusiveOffersLayout(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ ExclusiveOffersLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
