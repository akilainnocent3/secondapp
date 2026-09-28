package com.sportybet.feature.gift.gift.presentation;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import defpackage.wh8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface d {

    public static final class a implements d {
        public final UiText a;
        public final boolean b;

        public a(UiText uiText, boolean z) {
            uiText.getClass();
            this.a = uiText;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ErrorDialog(message=" + this.a + ", finishOnConfirm=" + this.b + ")";
        }
    }

    public static final class b implements d {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -359494462;
        }

        public final String toString() {
            return "LoadingDialog";
        }
    }

    public static final class c implements d {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1258211467;
        }

        public final String toString() {
            return "NoDialog";
        }
    }

    /* JADX INFO: renamed from: com.sportybet.feature.gift.gift.presentation.d$d, reason: collision with other inner class name */
    public static final class C0363d implements d {
        public final String a;
        public final ResourceUiText b;
        public final ResourceUiText c;

        public C0363d(String str, ResourceUiText resourceUiText, ResourceUiText resourceUiText2) {
            str.getClass();
            this.a = str;
            this.b = resourceUiText;
            this.c = resourceUiText2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0363d)) {
                return false;
            }
            C0363d c0363d = (C0363d) obj;
            return Intrinsics.g(this.a, c0363d.a) && this.b.equals(c0363d.b) && this.c.equals(c0363d.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + wh8.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "UseBoostAlertDialog(id=" + this.a + ", title=" + this.b + ", desc=" + this.c + ")";
        }
    }
}
