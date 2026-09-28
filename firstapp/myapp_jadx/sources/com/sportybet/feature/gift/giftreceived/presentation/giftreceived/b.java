package com.sportybet.feature.gift.giftreceived.presentation.giftreceived;

import com.sporty.android.common_ui.uitext.UiText;
import defpackage.gmf0;
import defpackage.mq0;
import defpackage.ux5;
import defpackage.xh8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface b {

    public static final class a implements b {
        public final UiText a;

        public a(UiText uiText) {
            uiText.getClass();
            this.a = uiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return xh8.a(this.a, "Boost(boostTypeName=", ")");
        }
    }

    /* JADX INFO: renamed from: com.sportybet.feature.gift.giftreceived.presentation.giftreceived.b$b, reason: collision with other inner class name */
    public static final class C0368b implements b {
        public final String a;
        public final String b;
        public final boolean c;

        public C0368b(String str, String str2, boolean z) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0368b)) {
                return false;
            }
            C0368b c0368b = (C0368b) obj;
            return Intrinsics.g(this.a, c0368b.a) && Intrinsics.g(this.b, c0368b.b) && this.c == c0368b.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return mq0.a(ux5.a("General(currencyCode=", this.a, ", amount=", this.b, ", isDiscount="), this.c, ")");
        }
    }
}
