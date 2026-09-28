package com.sportybet.feature.remixbet.presentation;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import defpackage.oe90;
import defpackage.z450;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b {

    public static final class a extends b {
        public final ResourceUiText a;

        public a(ResourceUiText resourceUiText) {
            this.a = resourceUiText;
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
            return oe90.a(this.a, "Error(message=", ")");
        }
    }

    /* JADX INFO: renamed from: com.sportybet.feature.remixbet.presentation.b$b, reason: collision with other inner class name */
    public static final class C0416b extends b {
        public static final C0416b a = new C0416b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0416b);
        }

        public final int hashCode() {
            return 507188278;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c extends b {
        public final z450 a;

        public c(z450 z450Var) {
            this.a = z450Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }

        public final String toString() {
            return "Success(data=" + this.a + ")";
        }
    }
}
