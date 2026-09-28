package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface h4e0 {

    public static final class a implements h4e0 {
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
            return "InfoBottomSheet(title=" + this.a + ", message=" + this.b + ", contentResourceId=streak_boost_dialog_content, buttonResourceId=streak_boost_dialog_ok_button)";
        }
    }

    public static final class b implements h4e0 {
        public final String a;

        public b(String str) {
            str.getClass();
            this.a = str;
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
            return tug.a("MissionHintBottomSheet(message=", this.a, ")");
        }
    }

    public static final class c implements h4e0 {
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
            return xh8.a(this.a, "MissionRepairInfoBottomSheet(repairToolStreakDays=", ")");
        }
    }

    public static final class d implements h4e0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1851962767;
        }

        public final String toString() {
            return "NoBottomSheet";
        }
    }

    public static final class e implements h4e0 {
        public final UiText a;

        public e(UiText uiText) {
            uiText.getClass();
            this.a = uiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.g(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return xh8.a(this.a, "RepairToolInfoBottomSheet(repairToolStreakDays=", ")");
        }
    }
}
