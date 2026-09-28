package com.sporty.android.platform.features.security.newdevicelogin.loginalert;

import com.sporty.android.core.model.accountprotection.LastLoginDeviceInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface b {

    public static final class a implements b {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -336016534;
        }

        public final String toString() {
            return "Leave";
        }
    }

    /* JADX INFO: renamed from: com.sporty.android.platform.features.security.newdevicelogin.loginalert.b$b, reason: collision with other inner class name */
    public static final class C0210b implements b {
        public final LastLoginDeviceInfo a;

        public C0210b(LastLoginDeviceInfo lastLoginDeviceInfo) {
            lastLoginDeviceInfo.getClass();
            this.a = lastLoginDeviceInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0210b) && Intrinsics.g(this.a, ((C0210b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "NavigateToSecurityAction(lastLoginDeviceInfo=" + this.a + ")";
        }
    }
}
