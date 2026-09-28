package com.sportybet.feature.luckynumber.featurematch.presentation;

import defpackage.b6c;
import defpackage.pe4;
import defpackage.q7q;
import defpackage.qcn;
import defpackage.vf5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface a {

    /* JADX INFO: renamed from: com.sportybet.feature.luckynumber.featurematch.presentation.a$a, reason: collision with other inner class name */
    public static final class C0403a implements a {
        public final qcn<Integer> a;

        public C0403a(qcn<Integer> qcnVar) {
            this.a = qcnVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0403a) && this.a.equals(((C0403a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return vf5.a(this.a, "ClickBet(balls=", ")");
        }
    }

    public static final class b implements a {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 508958819;
        }

        public final String toString() {
            return "ClickHighestOddsBet";
        }
    }

    public static final class c implements a {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1168479141;
        }

        public final String toString() {
            return "ClickHowToPlay";
        }
    }

    public static final class d implements a {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1730511517;
        }

        public final String toString() {
            return "DismissHowToPlay";
        }
    }

    public static final class e implements a {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -67539977;
        }

        public final String toString() {
            return "GoToLuckyNumberNextDraw";
        }
    }

    public static final class f implements a {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1509072380;
        }

        public final String toString() {
            return "RefreshRandomBalls";
        }
    }

    public static final class g implements a {
        public final int a;

        public g(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a == ((g) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pe4.b(this.a, "SelectPage(pageIndex=", ")");
        }
    }

    public static final class h implements a {
        public final q7q a;

        public h(q7q q7qVar) {
            q7qVar.getClass();
            this.a = q7qVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && Intrinsics.g(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SetData(data=" + this.a + ")";
        }
    }

    public static final class i implements a {
        public final boolean a;

        public i(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.a == ((i) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("TabSelected(isRestored=", ")", this.a);
        }
    }

    public static final class j implements a {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 999845979;
        }

        public final String toString() {
            return "TabUnselected";
        }
    }
}
