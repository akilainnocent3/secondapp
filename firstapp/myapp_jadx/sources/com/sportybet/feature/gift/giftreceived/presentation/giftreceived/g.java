package com.sportybet.feature.gift.giftreceived.presentation.giftreceived;

import android.os.Parcelable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.core.domain.model.ApplicableCategoryIds;
import defpackage.gmf0;
import defpackage.mtg0;
import defpackage.uf80;
import defpackage.uts;
import defpackage.vh8;
import defpackage.wh8;
import defpackage.x45;
import defpackage.yvf;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface g {

    public static final class a implements g {
        public final String a;
        public final UiText b;
        public final UiText c;
        public final UiText d;
        public final UiText e;
        public final UiText f;

        public a(String str, UiText uiText, UiText uiText2, UiText uiText3, UiText uiText4, UiText uiText5) {
            uiText.getClass();
            uiText2.getClass();
            uiText3.getClass();
            uiText4.getClass();
            uiText5.getClass();
            this.a = str;
            this.b = uiText;
            this.c = uiText2;
            this.d = uiText3;
            this.e = uiText4;
            this.f = uiText5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c) && Intrinsics.g(this.d, aVar.d) && Intrinsics.g(this.e, aVar.e) && Intrinsics.g(this.f, aVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + yvf.a(yvf.a(yvf.a(yvf.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sbA = x45.a(this.b, "Boost(giftCardImgUrl=", this.a, ", title=", ", description=");
            vh8.a(sbA, this.c, ", cardTagline=", this.d, ", boostTypeName=");
            sbA.append(this.e);
            sbA.append(", cardCtaText=");
            sbA.append(this.f);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class b implements g {
        public final String a;
        public final UiText b;
        public final UiText c;
        public final ResourceUiText d;
        public final String e;
        public final ResourceUiText f;
        public final String g;
        public final boolean h;
        public final List<? extends Integer> i;

        public b(String str, UiText uiText, UiText uiText2, ResourceUiText resourceUiText, String str2, ResourceUiText resourceUiText2, String str3, boolean z, List list) {
            str.getClass();
            uiText.getClass();
            uiText2.getClass();
            str2.getClass();
            str3.getClass();
            list.getClass();
            this.a = str;
            this.b = uiText;
            this.c = uiText2;
            this.d = resourceUiText;
            this.e = str2;
            this.f = resourceUiText2;
            this.g = str3;
            this.h = z;
            this.i = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!Intrinsics.g(this.a, bVar.a) || !Intrinsics.g(this.b, bVar.b) || !Intrinsics.g(this.c, bVar.c) || !Intrinsics.g(this.d, bVar.d) || !Intrinsics.g(this.e, bVar.e) || !Intrinsics.g(this.f, bVar.f) || !Intrinsics.g(this.g, bVar.g) || this.h != bVar.h) {
                return false;
            }
            List<? extends Integer> list = bVar.i;
            Parcelable.Creator<ApplicableCategoryIds> creator = ApplicableCategoryIds.CREATOR;
            return Intrinsics.g(this.i, list);
        }

        public final int hashCode() {
            int iA = mtg0.a(gmf0.a(wh8.a(gmf0.a(wh8.a(yvf.a(yvf.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
            Parcelable.Creator<ApplicableCategoryIds> creator = ApplicableCategoryIds.CREATOR;
            return this.i.hashCode() + iA;
        }

        public final String toString() {
            String strE = ApplicableCategoryIds.e(this.i);
            StringBuilder sbA = x45.a(this.b, "General(giftCardImgUrl=", this.a, ", title=", ", description=");
            sbA.append(this.c);
            sbA.append(", cardTagline=");
            sbA.append(this.d);
            sbA.append(", currencyCode=");
            sbA.append(this.e);
            sbA.append(", cardCtaText=");
            sbA.append(this.f);
            sbA.append(", amount=");
            uts.b(this.g, ", isDiscountGift=", ", applicableCategoryIds=", sbA, this.h);
            return uf80.a(sbA, strE, ")");
        }
    }
}
