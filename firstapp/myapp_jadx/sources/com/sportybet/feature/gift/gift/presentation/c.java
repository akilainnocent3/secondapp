package com.sportybet.feature.gift.gift.presentation;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import defpackage.ai50;
import defpackage.c04;
import defpackage.mtg0;
import defpackage.wh8;
import defpackage.z620;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface c {

    public static final class a implements c {
        public final String a;
        public final boolean b;
        public final ResourceUiText c;
        public final ResourceUiText d;
        public final List<c04> e;
        public final String f;

        public a(String str, boolean z, ResourceUiText resourceUiText, ResourceUiText resourceUiText2, List list, String str2) {
            str.getClass();
            list.getClass();
            this.a = str;
            this.b = z;
            this.c = resourceUiText;
            this.d = resourceUiText2;
            this.e = list;
            this.f = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b && this.c.equals(aVar.c) && this.d.equals(aVar.d) && Intrinsics.g(this.e, aVar.e) && this.f.equals(aVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + ai50.a(wh8.a(wh8.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sbA = z620.a("IntroBottomSheet(giftId=", this.a, ", onlyForCasinoGames=", ", title=", this.b);
            sbA.append(this.c);
            sbA.append(", description=");
            sbA.append(this.d);
            sbA.append(", applicableCategories=");
            sbA.append(this.e);
            sbA.append(", imgUrl=");
            sbA.append(this.f);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class b implements c {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1642502721;
        }

        public final String toString() {
            return "NoBottomSheet";
        }
    }
}
