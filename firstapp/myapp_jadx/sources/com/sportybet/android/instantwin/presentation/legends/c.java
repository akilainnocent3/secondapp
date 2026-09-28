package com.sportybet.android.instantwin.presentation.legends;

import android.os.Parcelable;
import com.sportybet.android.instantwin.router.sportylegends.SportyLegendsSettlementInput;
import defpackage.fqk;
import defpackage.mtg0;
import defpackage.sk3;
import defpackage.tug;

/* JADX INFO: loaded from: classes5.dex */
public interface c {

    public static final class a implements c {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1253406892;
        }

        public final String toString() {
            return "CheckDeviceSecurity";
        }
    }

    public interface b extends c {

        public static final class a implements b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -902636177;
            }

            public final String toString() {
                return "Back";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.legends.c$b$b, reason: collision with other inner class name */
        public static final class C0288b implements b {
            public final String a;

            public C0288b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0288b) && this.a.equals(((C0288b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tug.a("NavigateToBetHistoryPage(sportId=", this.a, ")");
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.legends.c$b$c, reason: collision with other inner class name */
        public static final class C0289c implements b {
            public static final C0289c a = new C0289c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0289c);
            }

            public final int hashCode() {
                return -902967463;
            }

            public final String toString() {
                return "NavigateToDepositPage";
            }
        }

        public static final class d implements b {
            public final fqk a;

            public d(fqk fqkVar) {
                this.a = fqkVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.a.equals(((d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "NavigateToGiftPickerPage(giftPickerInput=" + this.a + ")";
            }
        }

        public static final class e implements b {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 2143313538;
            }

            public final String toString() {
                return "NavigateToHomePage";
            }
        }

        public static final class f implements b {
            public static final f a = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -1804984924;
            }

            public final String toString() {
                return "NavigateToLoginPage";
            }
        }

        public static final class g implements b {
            public final SportyLegendsSettlementInput a;
            public final boolean b;
            public final sk3 c;

            static {
                Parcelable.Creator<SportyLegendsSettlementInput> creator = SportyLegendsSettlementInput.CREATOR;
            }

            public g(SportyLegendsSettlementInput sportyLegendsSettlementInput, boolean z, sk3 sk3Var) {
                sk3Var.getClass();
                this.a = sportyLegendsSettlementInput;
                this.b = z;
                this.c = sk3Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return this.a.equals(gVar.a) && this.b == gVar.b && this.c == gVar.c;
            }

            public final int hashCode() {
                return this.c.hashCode() + mtg0.a(this.a.hashCode() * 31, 31, this.b);
            }

            public final String toString() {
                return "NavigateToResultPage(input=" + this.a + ", isPlayerFallback=" + this.b + ", animationModeType=" + this.c + ")";
            }
        }

        public static final class h implements b {
            public static final h a = new h();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return 1111309311;
            }

            public final String toString() {
                return "NavigateToVirtualLobby";
            }
        }
    }
}
