package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.feature.payment.impl.deposit.presentation.model.PendingRequestParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface z7e {

    public static final class a implements z7e {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -493450131;
        }

        public final String toString() {
            return "DismissConfirmCompleted";
        }
    }

    public static final class b implements z7e {
        public final sfp a;
        public final bc6 b;

        public b(sfp sfpVar, bc6 bc6Var) {
            this.a = sfpVar;
            this.b = bc6Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.a.equals(bVar.a) && this.b == bVar.b;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.a.hashCode() * 31);
        }

        public final String toString() {
            return "JumpBank(param=" + this.a + ", continuation=" + this.b + ")";
        }
    }

    public static final class c implements z7e {
        public final String a;
        public final UiText b;
        public final bc6 c;

        public c(String str, UiText uiText, bc6 bc6Var) {
            str.getClass();
            this.a = str;
            this.b = uiText;
            this.c = bc6Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && this.c == cVar.c;
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            UiText uiText = this.b;
            return this.c.hashCode() + ((iHashCode + (uiText == null ? 0 : uiText.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbA = x45.a(this.b, "OpenWebViewForResult(url=", this.a, ", title=", ", continuation=");
            sbA.append(this.c);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class d implements z7e {
        public final tzs a;

        public d(tzs tzsVar) {
            tzsVar.getClass();
            this.a = tzsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.g(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SetConfirmCompletedState(state=" + this.a + ")";
        }
    }

    public static final class e implements z7e {
        public final boolean a;
        public final op8 b;
        public final Function0<Unit> c;

        public e(boolean z, op8 op8Var, c8e c8eVar) {
            this.a = z;
            this.b = op8Var;
            this.c = c8eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.a == eVar.a && this.b == eVar.b && Intrinsics.g(this.c, eVar.c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
            Function0<Unit> function0 = this.c;
            return iHashCode + (function0 == null ? 0 : function0.hashCode());
        }

        public final String toString() {
            return "ShowComposeBottomSheetSuspend(cancelable=" + this.a + ", content=" + this.b + ", onCancel=" + this.c + ")";
        }
    }

    public static final class f implements z7e {
        public final ld00 a;
        public final bc6 b;

        public f(ld00 ld00Var, bc6 bc6Var) {
            this.a = ld00Var;
            this.b = bc6Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return this.a.equals(fVar.a) && this.b == fVar.b;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ShowConfirmCompleted(content=" + this.a + ", continuation=" + this.b + ")";
        }
    }

    public static final class g implements z7e {
        public final ResourceUiText a;
        public final ResourceUiText b;
        public final ResourceUiText c;
        public final ResourceUiText d;
        public final ResourceUiText e;
        public final d8e f;

        public g(ResourceUiText resourceUiText, ResourceUiText resourceUiText2, ResourceUiText resourceUiText3, ResourceUiText resourceUiText4, ResourceUiText resourceUiText5, d8e d8eVar) {
            this.a = resourceUiText;
            this.b = resourceUiText2;
            this.c = resourceUiText3;
            this.d = resourceUiText4;
            this.e = resourceUiText5;
            this.f = d8eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return this.a.equals(gVar.a) && this.b.equals(gVar.b) && this.c.equals(gVar.c) && this.d.equals(gVar.d) && this.e.equals(gVar.e) && this.f == gVar.f;
            }
            return false;
        }

        public final int hashCode() {
            return this.f.hashCode() + mtg0.a(wh8.a(wh8.a(wh8.a(wh8.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, true);
        }

        public final String toString() {
            return "ShowInsufficientFundsBottomSheetSuspend(title=" + this.a + ", message=" + this.b + ", checkBoxUiText=" + this.c + ", positiveText=" + this.d + ", negativeText=" + this.e + ", cancelable=true, callback=" + this.f + ")";
        }
    }

    public static final class h implements z7e {
        public final UiText a;
        public final UiText b;
        public final kyf0 c;
        public final UiText d;
        public final n67 e;
        public final Function1<v1b<? super Unit>, Object> f;
        public final UiText g;
        public final n67 h;
        public final Function1<v1b<? super Unit>, Object> i;
        public final bc6 j;

        public h(UiText uiText, UiText uiText2, kyf0 kyf0Var, UiText uiText3, n67 n67Var, Function1 function1, UiText uiText4, n67 n67Var2, Function1 function2, bc6 bc6Var) {
            uiText.getClass();
            uiText2.getClass();
            kyf0Var.getClass();
            uiText3.getClass();
            n67Var.getClass();
            function1.getClass();
            n67Var2.getClass();
            this.a = uiText;
            this.b = uiText2;
            this.c = kyf0Var;
            this.d = uiText3;
            this.e = n67Var;
            this.f = function1;
            this.g = uiText4;
            this.h = n67Var2;
            this.i = function2;
            this.j = bc6Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return Intrinsics.g(this.a, hVar.a) && Intrinsics.g(this.b, hVar.b) && Intrinsics.g(this.c, hVar.c) && Intrinsics.g(this.d, hVar.d) && Intrinsics.g(this.e, hVar.e) && Intrinsics.g(this.f, hVar.f) && Intrinsics.g(this.g, hVar.g) && Intrinsics.g(this.h, hVar.h) && Intrinsics.g(this.i, hVar.i) && this.j == hVar.j;
            }
            return false;
        }

        public final int hashCode() {
            int iB = w57.b((this.e.hashCode() + yvf.a((this.c.hashCode() + yvf.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d)) * 31, 31, this.f);
            UiText uiText = this.g;
            int iHashCode = (this.h.hashCode() + ((iB + (uiText == null ? 0 : uiText.hashCode())) * 31)) * 31;
            Function1<v1b<? super Unit>, Object> function1 = this.i;
            return this.j.hashCode() + ((iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbA = uh8.a(this.a, this.b, "ShowPaymentActionBottomSheetSuspend(title=", ", message=", ", titleIconStyle=");
            sbA.append(this.c);
            sbA.append(", primaryActionText=");
            sbA.append(this.d);
            sbA.append(", primaryActionIconStyle=");
            sbA.append(this.e);
            sbA.append(", onPrimaryActionClicked=");
            sbA.append(this.f);
            sbA.append(", secondaryActionText=");
            sbA.append(this.g);
            sbA.append(", secondaryActionIconStyle=");
            sbA.append(this.h);
            sbA.append(", onSecondaryActionClicked=");
            sbA.append(this.i);
            sbA.append(", continuation=");
            sbA.append(this.j);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class i implements z7e {
        public final ResourceUiText a;
        public final UiText b;
        public final ResourceUiText c;
        public final ResourceUiText d;
        public final kyf0 e;
        public final n67 f;
        public final bc6 g;

        public i(ResourceUiText resourceUiText, UiText uiText, ResourceUiText resourceUiText2, ResourceUiText resourceUiText3, kyf0 kyf0Var, n67 n67Var, bc6 bc6Var) {
            kyf0Var.getClass();
            n67Var.getClass();
            this.a = resourceUiText;
            this.b = uiText;
            this.c = resourceUiText2;
            this.d = resourceUiText3;
            this.e = kyf0Var;
            this.f = n67Var;
            this.g = bc6Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return this.a.equals(iVar.a) && this.b.equals(iVar.b) && this.c.equals(iVar.c) && this.d.equals(iVar.d) && Intrinsics.g(this.e, iVar.e) && Intrinsics.g(this.f, iVar.f) && this.g == iVar.g;
            }
            return false;
        }

        public final int hashCode() {
            return this.g.hashCode() + mtg0.a((this.f.hashCode() + ((this.e.hashCode() + wh8.a(wh8.a(yvf.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31, 31, true);
        }

        public final String toString() {
            return "ShowPaymentResultBottomSheetSuspend(title=" + this.a + ", message=" + this.b + ", primaryActionText=" + this.c + ", proceedAnywayText=" + this.d + ", titleIconStyle=" + this.e + ", primaryActionIconStyle=" + this.f + ", cancelable=true, continuation=" + this.g + ")";
        }
    }

    public static final class j implements z7e {
        public final PendingRequestParam a;

        public j(PendingRequestParam pendingRequestParam) {
            this.a = pendingRequestParam;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.a.equals(((j) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowPendingRequestBottomSheet(param=" + this.a + ")";
        }
    }

    public static final class k implements z7e {
        public final String a;
        public final String b;
        public final int c;
        public final bc6 d;

        public k(String str, String str2, int i, bc6 bc6Var) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
            this.c = i;
            this.d = bc6Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k) {
                k kVar = (k) obj;
                return Intrinsics.g(this.a, kVar.a) && Intrinsics.g(this.b, kVar.b) && this.c == kVar.c && this.d == kVar.d;
            }
            return false;
        }

        public final int hashCode() {
            return this.d.hashCode() + gpp.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("ShowRequestVerifyWebViewDialog(tradeId=", this.a, ", htmlContent=", this.b, ", reloadCount=");
            sbA.append(this.c);
            sbA.append(", continuation=");
            sbA.append(this.d);
            sbA.append(")");
            return sbA.toString();
        }
    }
}
