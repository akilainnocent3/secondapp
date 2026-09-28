package com.sporty.android.common.uievent;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SEfl.gvQvkPPtA;
import defpackage.ci8;
import defpackage.ei8;
import defpackage.fi8;
import defpackage.mtg0;
import defpackage.oqj0;
import defpackage.snb0;
import defpackage.tvh;
import defpackage.uh8;
import defpackage.vh8;
import defpackage.wh8;
import defpackage.xh8;
import defpackage.zh8;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public interface a {

    /* JADX INFO: renamed from: com.sporty.android.common.uievent.a$a, reason: collision with other inner class name */
    public static final class C0203a implements a {
        public final zh8 a;

        public C0203a(zh8 zh8Var) {
            this.a = zh8Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0203a) && this.a == ((C0203a) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CheckAreNotificationsEnabled(callback=" + this.a + ")";
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class b implements a {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 724693381;
        }

        public final String toString() {
            return "FinishActivity";
        }
    }

    public static final class c implements a {
    }

    public static final class d implements a {
        public final snb0 a;

        public d(snb0 snb0Var) {
            this.a = snb0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "GoCustomerService(sportyDeskEntry=" + this.a + ")";
        }
    }

    public static final class e implements a {
        public final ci8 a;

        public e(ci8 ci8Var) {
            this.a = ci8Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "GoEnableNotifications(callback=" + this.a + ")";
        }
    }

    public static final class f implements a {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1990584233;
        }

        public final String toString() {
            return "Idle";
        }
    }

    public static final class g implements a {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1981519211;
        }

        public final String toString() {
            return "PopBackStackInNav";
        }
    }

    public static final class i implements a {
        public final ResourceUiText a;
        public final UiText b;
        public final ResourceUiText c;
        public final ResourceUiText d;
        public final oqj0 e;
        public final Function0<Unit> f;

        public i(ResourceUiText resourceUiText, StringUiText stringUiText, ResourceUiText resourceUiText2, ResourceUiText resourceUiText3, oqj0 oqj0Var, Function0 function0) {
            this.a = resourceUiText;
            this.b = stringUiText;
            this.c = resourceUiText2;
            this.d = resourceUiText3;
            this.e = oqj0Var;
            this.f = function0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                if (this.a.equals(iVar.a) && Intrinsics.g(this.b, iVar.b) && this.c.equals(iVar.c) && this.d.equals(iVar.d) && this.e == iVar.e && this.f.equals(iVar.f)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            UiText uiText = this.b;
            return this.f.hashCode() + ((this.e.hashCode() + mtg0.a(wh8.a(wh8.a((iHashCode + (uiText == null ? 0 : uiText.hashCode())) * 961, 31, this.c), 31, this.d), 961, false)) * 31);
        }

        public final String toString() {
            return "ShowCommonActionDialog(title=" + this.a + ", message=" + this.b + ", imageResId=null, positiveText=" + this.c + ", negativeText=" + this.d + ", cancelable=false, key=null, onPositiveButtonClicked=" + this.e + ", onNegativeButtonClicked=" + this.f + ")";
        }
    }

    public static final class j implements a {
        public final UiText a;
        public final UiText b;
        public final UiText c;
        public final UiText d;
        public final UiText e;
        public final UiText f;
        public final boolean g = true;
        public final Function1<CustomAlertDialogCallbackType, Unit> h;

        public j(ResourceUiText resourceUiText, UiText uiText, UiText uiText2, UiText uiText3, UiText uiText4, UiText uiText5, ei8 ei8Var) {
            this.a = resourceUiText;
            this.b = uiText;
            this.c = uiText2;
            this.d = uiText3;
            this.e = uiText4;
            this.f = uiText5;
            this.h = ei8Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.g(this.a, jVar.a) && Intrinsics.g(this.b, jVar.b) && Intrinsics.g(this.c, jVar.c) && Intrinsics.g(this.d, jVar.d) && Intrinsics.g(this.e, jVar.e) && Intrinsics.g(this.f, jVar.f) && this.g == jVar.g && Intrinsics.g(this.h, jVar.h);
        }

        public final int hashCode() {
            UiText uiText = this.a;
            int iHashCode = (uiText == null ? 0 : uiText.hashCode()) * 31;
            UiText uiText2 = this.b;
            int iHashCode2 = (iHashCode + (uiText2 == null ? 0 : uiText2.hashCode())) * 961;
            UiText uiText3 = this.c;
            int iHashCode3 = (iHashCode2 + (uiText3 == null ? 0 : uiText3.hashCode())) * 31;
            UiText uiText4 = this.d;
            int iHashCode4 = (iHashCode3 + (uiText4 == null ? 0 : uiText4.hashCode())) * 31;
            UiText uiText5 = this.e;
            int iHashCode5 = (iHashCode4 + (uiText5 == null ? 0 : uiText5.hashCode())) * 31;
            UiText uiText6 = this.f;
            int iA = mtg0.a((iHashCode5 + (uiText6 == null ? 0 : uiText6.hashCode())) * 31, 961, this.g);
            Function1<CustomAlertDialogCallbackType, Unit> function1 = this.h;
            return iA + (function1 != null ? function1.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbA = uh8.a(this.a, this.b, "ShowCustomAlertDialog(title=", ", message=", ", htmlMessage=null, hyperlinkInMessage=");
            vh8.a(sbA, this.c, ", checkBoxUiText=", this.d, ", positiveText=");
            vh8.a(sbA, this.e, ", negativeText=", this.f, ", cancelable=");
            sbA.append(this.g);
            sbA.append(gvQvkPPtA.UCqcAl);
            sbA.append(this.h);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class k implements a {
        public final UiText a;
        public final Integer b;
        public final ResourceUiText c;

        public k(ResourceUiText resourceUiText, Integer num, ResourceUiText resourceUiText2) {
            this.a = resourceUiText;
            this.b = num;
            this.c = resourceUiText2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return Intrinsics.g(this.a, kVar.a) && Intrinsics.g(this.b, kVar.b) && Intrinsics.g(this.c, kVar.c);
        }

        public final int hashCode() {
            UiText uiText = this.a;
            int iHashCode = (uiText == null ? 0 : uiText.hashCode()) * 31;
            Integer num = this.b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            ResourceUiText resourceUiText = this.c;
            return iHashCode2 + (resourceUiText != null ? resourceUiText.hashCode() : 0);
        }

        public final String toString() {
            return "ShowImageAlertDialog(message=" + this.a + ", imageResId=" + this.b + ", positiveText=" + this.c + ")";
        }
    }

    public static final class l implements a {
        public final UiText a;
        public final UiText b;
        public final Integer c;
        public final ResourceUiText d;
        public final UiText e;
        public final Function1<AlertDialogCallbackType, Unit> f;

        public l(ResourceUiText resourceUiText, ResourceUiText resourceUiText2, Integer num, ResourceUiText resourceUiText3, ResourceUiText resourceUiText4, fi8 fi8Var) {
            this.a = resourceUiText;
            this.b = resourceUiText2;
            this.c = num;
            this.d = resourceUiText3;
            this.e = resourceUiText4;
            this.f = fi8Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return Intrinsics.g(this.a, lVar.a) && Intrinsics.g(this.b, lVar.b) && Intrinsics.g(this.c, lVar.c) && Intrinsics.g(this.d, lVar.d) && Intrinsics.g(this.e, lVar.e) && Intrinsics.g(this.f, lVar.f);
        }

        public final int hashCode() {
            UiText uiText = this.a;
            int iHashCode = (uiText == null ? 0 : uiText.hashCode()) * 31;
            UiText uiText2 = this.b;
            int iHashCode2 = (iHashCode + (uiText2 == null ? 0 : uiText2.hashCode())) * 961;
            Integer num = this.c;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            ResourceUiText resourceUiText = this.d;
            int iHashCode4 = (iHashCode3 + (resourceUiText == null ? 0 : resourceUiText.hashCode())) * 31;
            UiText uiText3 = this.e;
            int iHashCode5 = (iHashCode4 + (uiText3 == null ? 0 : uiText3.hashCode())) * 961;
            Function1<AlertDialogCallbackType, Unit> function1 = this.f;
            return iHashCode5 + (function1 != null ? function1.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbA = uh8.a(this.a, this.b, "ShowImageDialog(title=", ", message=", ", imageUrl=null, imageResId=");
            sbA.append(this.c);
            sbA.append(", positiveText=");
            sbA.append(this.d);
            sbA.append(", negativeText=");
            sbA.append(this.e);
            sbA.append(", key=null, callback=");
            sbA.append(this.f);
            sbA.append(")");
            return sbA.toString();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class n implements a {
        public final UiText a;

        public n(UiText uiText) {
            uiText.getClass();
            this.a = uiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && Intrinsics.g(this.a, ((n) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return xh8.a(this.a, "ShowToast(message=", ")");
        }
    }

    public static final class m implements a {
        public final UiText a;
        public final UiText b;
        public final Function0<Unit> c;
        public final Integer d;
        public final float e;
        public final float f;

        public m(UiText uiText, UiText uiText2, Function0 function0, Integer num, float f, float f2) {
            uiText.getClass();
            this.a = uiText;
            this.b = uiText2;
            this.c = function0;
            this.d = num;
            this.e = f;
            this.f = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return Intrinsics.g(this.a, mVar.a) && Intrinsics.g(this.b, mVar.b) && Intrinsics.g(this.c, mVar.c) && Intrinsics.g(this.d, mVar.d) && Float.compare(this.e, mVar.e) == 0 && Float.compare(this.f, mVar.f) == 0;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            UiText uiText = this.b;
            int iHashCode2 = (iHashCode + (uiText == null ? 0 : uiText.hashCode())) * 31;
            Function0<Unit> function0 = this.c;
            int iHashCode3 = (iHashCode2 + (function0 == null ? 0 : function0.hashCode())) * 961;
            Integer num = this.d;
            return Float.hashCode(this.f) + tvh.a(this.e, (iHashCode3 + (num != null ? num.hashCode() : 0)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sbA = uh8.a(this.a, this.b, "ShowSnackBar(message=", ", actionText=", ", actionCallback=");
            sbA.append(this.c);
            sbA.append(", dismissCallback=null, durationMs=");
            sbA.append(this.d);
            sbA.append(", horizontalMarginDp=");
            sbA.append(this.e);
            sbA.append(", bottomMarginDp=");
            sbA.append(this.f);
            sbA.append(")");
            return sbA.toString();
        }

        public /* synthetic */ m(ResourceUiText resourceUiText) {
            this(resourceUiText, null, null, null, 0.0f, 0.0f);
        }
    }

    public static final class h implements a {
        public final UiText a;
        public final UiText b;
        public final UiText c;
        public final UiText d;
        public final UiText e;
        public final boolean f;
        public final Integer g;
        public final Object h;
        public final Function1<AlertDialogCallbackType, Unit> i;

        public /* synthetic */ h(UiText uiText, ResourceUiText resourceUiText, ResourceUiText resourceUiText2, Function1 function1, int i) {
            this(null, null, (i & 4) != 0 ? null : uiText, (i & 8) != 0 ? new ResourceUiText(R.string.common_functions__ok) : resourceUiText, (i & 16) != 0 ? null : resourceUiText2, (i & 32) != 0, null, null, (i & 256) != 0 ? null : function1);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Intrinsics.g(this.a, hVar.a) && Intrinsics.g(this.b, hVar.b) && Intrinsics.g(this.c, hVar.c) && Intrinsics.g(this.d, hVar.d) && Intrinsics.g(this.e, hVar.e) && this.f == hVar.f && Intrinsics.g(this.g, hVar.g) && Intrinsics.g(this.h, hVar.h) && Intrinsics.g(this.i, hVar.i);
        }

        public final int hashCode() {
            UiText uiText = this.a;
            int iHashCode = (uiText == null ? 0 : uiText.hashCode()) * 31;
            UiText uiText2 = this.b;
            int iHashCode2 = (iHashCode + (uiText2 == null ? 0 : uiText2.hashCode())) * 31;
            UiText uiText3 = this.c;
            int iHashCode3 = (iHashCode2 + (uiText3 == null ? 0 : uiText3.hashCode())) * 31;
            UiText uiText4 = this.d;
            int iHashCode4 = (iHashCode3 + (uiText4 == null ? 0 : uiText4.hashCode())) * 31;
            UiText uiText5 = this.e;
            int iA = mtg0.a((iHashCode4 + (uiText5 == null ? 0 : uiText5.hashCode())) * 31, 31, this.f);
            Integer num = this.g;
            int iHashCode5 = (iA + (num == null ? 0 : num.hashCode())) * 31;
            Object obj = this.h;
            int iHashCode6 = (iHashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
            Function1<AlertDialogCallbackType, Unit> function1 = this.i;
            return iHashCode6 + (function1 != null ? function1.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbA = uh8.a(this.a, this.b, "ShowAlertDialog(title=", ", htmlMessage=", ", message=");
            vh8.a(sbA, this.c, ", positiveText=", this.d, ", negativeText=");
            sbA.append(this.e);
            sbA.append(", cancelable=");
            sbA.append(this.f);
            sbA.append(", styleRes=");
            sbA.append(this.g);
            sbA.append(", key=");
            sbA.append(this.h);
            sbA.append(", callback=");
            sbA.append(this.i);
            sbA.append(")");
            return sbA.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public h(UiText uiText, UiText uiText2, UiText uiText3, UiText uiText4, UiText uiText5, boolean z, Integer num, Object obj, Function1<? super AlertDialogCallbackType, Unit> function1) {
            this.a = uiText;
            this.b = uiText2;
            this.c = uiText3;
            this.d = uiText4;
            this.e = uiText5;
            this.f = z;
            this.g = num;
            this.h = obj;
            this.i = function1;
        }
    }
}
