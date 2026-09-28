package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface i04 {

    public static final class a implements i04 {
        public final ResourceUiText a;
        public final UiText b;

        public a(ResourceUiText resourceUiText, UiText uiText) {
            uiText.getClass();
            this.a = resourceUiText;
            this.b = uiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            return ((((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) - 466401601) * 31) - 1059283013;
        }

        public final String toString() {
            return "ClickInfoButton(title=" + this.a + ", message=" + this.b + ", contentResourceId=streak_boost_dialog_content, buttonResourceId=streak_boost_dialog_ok_button)";
        }
    }

    public static final class b implements i04 {
        public final UiText a;

        public b(UiText uiText) {
            uiText.getClass();
            this.a = uiText;
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
            return xh8.a(this.a, "ClickMissionRepairInfo(repairToolStreakDays=", ")");
        }
    }

    public static final class c implements i04 {
        public final UiText a;

        public c(UiText uiText) {
            uiText.getClass();
            this.a = uiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return xh8.a(this.a, "ClickRepairToolInfo(repairToolStreakDays=", ")");
        }
    }

    public static final class d implements i04 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 621841921;
        }

        public final String toString() {
            return "ConfirmRepair";
        }
    }

    public static final class e implements i04 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 158840838;
        }

        public final String toString() {
            return "DismissDialog";
        }
    }

    public static final class f implements i04 {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -219363975;
        }

        public final String toString() {
            return "DismissRepairAnimation";
        }
    }

    public static final class g implements i04 {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1718035994;
        }

        public final String toString() {
            return "HideBottomSheet";
        }
    }

    public static final class h implements i04 {
        public final boolean a;

        public h(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.a == ((h) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("ParticipateMission(previewMission=", ")", this.a);
        }
    }

    public static final class i implements i04 {
        public final q7e0 a;
        public final List<k00> b;

        /* JADX WARN: Multi-variable type inference failed */
        public i(q7e0 q7e0Var, List<? extends k00> list) {
            q7e0Var.getClass();
            list.getClass();
            this.a = q7e0Var;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Intrinsics.g(this.a, iVar.a) && Intrinsics.g(this.b, iVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "SendBettingStreakEvent(event=" + this.a + ", platforms=" + this.b + ")";
        }
    }

    public static final class j implements i04 {
        public final boolean a;

        public j(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.a == ((j) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("SwitchAlert(isEnabled=", ")", this.a);
        }
    }

    public static final class k implements i04 {
        public static final k a = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -743124466;
        }

        public final String toString() {
            return "ToNextWeek";
        }
    }

    public static final class l implements i04 {
        public static final l a = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -1970158446;
        }

        public final String toString() {
            return "ToPreviousWeek";
        }
    }

    public static final class m implements i04 {
        public static final m a = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 1133625152;
        }

        public final String toString() {
            return "UseRepairTool";
        }
    }
}
