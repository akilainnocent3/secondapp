package com.sportybet.feature.luckynumber.luncher;

import defpackage.l5u;
import defpackage.tug;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface a {

    /* JADX INFO: renamed from: com.sportybet.feature.luckynumber.luncher.a$a, reason: collision with other inner class name */
    public static final class C0407a implements a {
        public static final C0407a a = new C0407a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0407a);
        }

        public final int hashCode() {
            return -2131412371;
        }

        public final String toString() {
            return "Finish";
        }
    }

    public static final class b implements a {
        public final l5u a;

        public b(l5u l5uVar) {
            l5uVar.getClass();
            this.a = l5uVar;
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
            return "LaunchNative(entry=" + this.a + ")";
        }
    }

    public static final class c implements a {
        public final String a;

        public c(String str) {
            str.getClass();
            this.a = str;
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
            return tug.a("LaunchWebView(url=", this.a, ")");
        }
    }

    public static final class d implements a {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -459608414;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
