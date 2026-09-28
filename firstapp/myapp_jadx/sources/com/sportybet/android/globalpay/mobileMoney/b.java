package com.sportybet.android.globalpay.mobileMoney;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import defpackage.gmf0;
import defpackage.id90;
import defpackage.tug;
import defpackage.ux5;
import defpackage.xh8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface b extends id90 {

    public static final class a implements b {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("ChannelLoaded(channelId=", this.a, ")");
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.globalpay.mobileMoney.b$b, reason: collision with other inner class name */
    public static final class C0228b implements b {
        public final String a;

        public C0228b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0228b) && Intrinsics.g(this.a, ((C0228b) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return tug.a("LaunchAddNewNumber(primaryOtpToken=", this.a, ")");
        }
    }

    public static final class c implements b {
        public final String a;
        public final String b;
        public final ResourceUiText c;

        public c(ResourceUiText resourceUiText, String str, String str2) {
            str.getClass();
            this.a = str;
            this.b = str2;
            this.c = resourceUiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && this.b.equals(cVar.b) && this.c.equals(cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("LaunchPrimaryPhoneOtp(callingCodeWithoutSymbol=", this.a, ", phoneNumber=", this.b, ", alertMessage=");
            sbA.append(this.c);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class d implements b {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -429998246;
        }

        public final String toString() {
            return "NavigateToContactSupport";
        }
    }

    public static final class e implements b {
        public final String a;

        public e(String str) {
            str.getClass();
            this.a = str;
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
            return tug.a("NetworkChanged(channelId=", this.a, ")");
        }
    }

    public static final class f implements b {
        public final UiText a;

        public f(UiText uiText) {
            uiText.getClass();
            this.a = uiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.g(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return xh8.a(this.a, "ShowSnackBar(message=", ")");
        }
    }
}
