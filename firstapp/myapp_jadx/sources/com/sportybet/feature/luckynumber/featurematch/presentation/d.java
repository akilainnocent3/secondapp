package com.sportybet.feature.luckynumber.featurematch.presentation;

import com.appsflyer.internal.m;
import com.appsflyer.internal.w;
import com.appsflyer.internal.x;
import com.sporty.android.common_ui.uitext.StringUiText;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.mq0;
import defpackage.qcn;
import defpackage.shu;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface d {

    public static final class a implements d {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -70252535;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public static final class b implements d {
        public final String a;
        public final StringUiText b;
        public final String c;
        public final String d;
        public final boolean e;

        public b(String str, StringUiText stringUiText, String str2, String str3, boolean z) {
            m.a(str, str2, str3);
            this.a = str;
            this.b = stringUiText;
            this.c = str2;
            this.d = str3;
            this.e = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && this.b.equals(bVar.b) && Intrinsics.g(this.c, bVar.c) && Intrinsics.g(this.d, bVar.d) && this.e == bVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + gmf0.a(gmf0.a((this.b.a.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HighestOddsCard(name=");
            sb.append(this.a);
            sb.append(", odds=");
            sb.append(this.b);
            sb.append(", marketName=");
            hxa.c(sb, this.c, ", id=", this.d, ", isLoading=");
            return mq0.a(sb, this.e, ")");
        }
    }

    public static final class c implements d {
        public final String a;
        public final long b;
        public final qcn<Integer> c;
        public final String d;
        public final boolean e;

        public c(String str, long j, qcn<Integer> qcnVar, String str2, boolean z) {
            str.getClass();
            qcnVar.getClass();
            str2.getClass();
            this.a = str;
            this.b = j;
            this.c = qcnVar;
            this.d = str2;
            this.e = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && this.b == cVar.b && Intrinsics.g(this.c, cVar.c) && Intrinsics.g(this.d, cVar.d) && this.e == cVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + gmf0.a(shu.a(this.c, f87.a(this.a.hashCode() * 31, this.b, 31), 31), 31, this.d);
        }

        public final String toString() {
            StringBuilder sbA = x.a(this.b, "LastMinuteCard(name=", this.a, ", drawTimeForElapsedRealtime=");
            sbA.append(", balls=");
            sbA.append(this.c);
            sbA.append(", id=");
            sbA.append(this.d);
            return w.a(sbA, ", isLoading=", this.e, ")");
        }
    }

    /* JADX INFO: renamed from: com.sportybet.feature.luckynumber.featurematch.presentation.d$d, reason: collision with other inner class name */
    public static final class C0406d implements d {
        public static final C0406d a = new C0406d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0406d);
        }

        public final int hashCode() {
            return -1127701256;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
