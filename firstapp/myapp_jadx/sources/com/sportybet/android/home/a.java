package com.sportybet.android.home;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface a {

    /* JADX INFO: renamed from: com.sportybet.android.home.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class C0252a implements a {
        public static final C0252a a = new C0252a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0252a);
        }

        public final int hashCode() {
            return 2056911225;
        }

        public final String toString() {
            return "NotReady";
        }
    }

    public static final class b implements a {
        public final Uri a;

        public b(Uri uri) {
            this.a = uri;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            Uri uri = this.a;
            if (uri == null) {
                return 0;
            }
            return uri.hashCode();
        }

        public final String toString() {
            return "Ready(data=" + this.a + ")";
        }
    }
}
