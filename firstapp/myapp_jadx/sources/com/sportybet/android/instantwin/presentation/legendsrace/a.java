package com.sportybet.android.instantwin.presentation.legendsrace;

import defpackage.bo10;
import defpackage.ulc0;
import defpackage.w5f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface a {

    /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.legendsrace.a$a, reason: collision with other inner class name */
    public static final class C0290a implements a {
        public final w5f a;

        public C0290a(w5f w5fVar) {
            this.a = w5fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0290a) && this.a.equals(((C0290a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "DoubleOrNothing(action=" + this.a + ")";
        }
    }

    public static final class b implements a {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -577901229;
        }

        public final String toString() {
            return "OnAllClipsFinished";
        }
    }

    public static final class c implements a {
        public final ulc0 a;

        public c(ulc0 ulc0Var) {
            ulc0Var.getClass();
            this.a = ulc0Var;
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
            return "OnClipFinished(runningPhase=" + this.a + ")";
        }
    }

    public static final class d implements a {
        public final ulc0 a;

        public d(ulc0 ulc0Var) {
            ulc0Var.getClass();
            this.a = ulc0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.g(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OnClipStart(runningPhase=" + this.a + ")";
        }
    }

    public static final class e implements a {
        public final Exception a;

        public e(bo10 bo10Var) {
            bo10Var.getClass();
            this.a = bo10Var;
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
            return "OnPlayerError(e=" + this.a + ")";
        }
    }

    public static final class f implements a {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 27524438;
        }

        public final String toString() {
            return "OnSkipToResult";
        }
    }

    public static final class g implements a {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -742415476;
        }

        public final String toString() {
            return "OnToggleMute";
        }
    }
}
