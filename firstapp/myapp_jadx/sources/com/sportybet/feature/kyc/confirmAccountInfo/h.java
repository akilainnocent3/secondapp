package com.sportybet.feature.kyc.confirmAccountInfo;

import com.sporty.android.core.model.patron.UserCertInfo;

/* JADX INFO: loaded from: classes6.dex */
public interface h {

    public static final class a implements h {
        public static final a a = new a();
    }

    public static final class b implements h {
        public static final b a = new b();
    }

    public static final class c implements h {
        public final UserCertInfo a;

        public c(UserCertInfo userCertInfo) {
            this.a = userCertInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UserInfo(data=" + this.a + ")";
        }
    }
}
