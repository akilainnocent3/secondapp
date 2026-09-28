package com.sportybet.feature.payment.impl.paybill;

import com.sporty.android.common_ui.uitext.UiText;
import defpackage.gpp;
import defpackage.ml5;
import defpackage.ng1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public final String a;
    public final int b;
    public final String c;
    public final ExclusiveOffersLayout.a d;
    public final List<UiText> e;

    /* JADX WARN: Multi-variable type inference failed */
    public a(String str, int i, String str2, ExclusiveOffersLayout.a aVar, List<? extends UiText> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = aVar;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b && Intrinsics.g(this.c, aVar.c) && Intrinsics.g(this.d, aVar.d) && Intrinsics.g(this.e, aVar.e);
    }

    public final int hashCode() {
        int iA = gpp.a(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        ExclusiveOffersLayout.a aVar = this.d;
        return this.e.hashCode() + ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ml5.a(this.b, "PaybillItemUiState(displayChannelName=", this.a, ", channelIconResId=", ", channelIconResUrl=");
        sbA.append(this.c);
        sbA.append(", exclusiveOffersInfo=");
        sbA.append(this.d);
        sbA.append(", steps=");
        return ng1.a(sbA, this.e, ")");
    }
}
