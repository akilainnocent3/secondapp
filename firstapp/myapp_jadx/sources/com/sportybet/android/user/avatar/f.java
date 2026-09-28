package com.sportybet.android.user.avatar;

import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import defpackage.tx5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface f {

    /* JADX INFO: loaded from: classes2.dex */
    public static final class a implements f {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a(yFmFZvuWxAYfEj.bLvnWZLrLHoDj, this.a, ", smallFrameUrl=", this.b, ")");
        }
    }

    public static final class b implements f {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -903192049;
        }

        public final String toString() {
            return "NoAvailableFrame";
        }
    }
}
