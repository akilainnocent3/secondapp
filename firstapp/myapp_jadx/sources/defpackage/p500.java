package defpackage;

import com.google.android.material.circularreveal.cardview.Kghu.xOgHBQVl;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public interface p500 extends pdd0 {

    public static final class a implements p500 {
        public final String a;

        public a(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.p500
        public final String d() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "payday_promo__unlock_modal_background_click";
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("UnlockModalBackgroundClick(variant=", this.a, ")");
        }
    }

    public static final class b implements p500 {
        public final String a;

        public b(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.p500
        public final String d() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "payday_promo__unlock_modal_close_btn_click";
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("UnlockModalCloseBtnClick(variant=", this.a, ")");
        }
    }

    public static final class c implements p500 {
        public final String a;

        public c(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.p500
        public final String d() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "payday_promo__unlock_modal_deposit_btn_click";
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("UnlockModalDepositBtnClick(variant=", this.a, ")");
        }
    }

    public static final class d implements p500 {
        public final String a;

        public d(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.p500
        public final String d() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.g(this.a, ((d) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "payday_promo__unlock_modal_view";
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("UnlockModalView(variant=", this.a, ")");
        }
    }

    String d();

    @Override // defpackage.pdd0
    default HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair(xOgHBQVl.ANeMX, d()));
    }
}
