package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.core.model.accountprotection.LastLoginDeviceInfo;
import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SEfl.gvQvkPPtA;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class s380 {
    public final e480 a;
    public final ResourceUiText b;
    public final LastLoginDeviceInfo c;
    public final String d;

    public s380(e480 e480Var, ResourceUiText resourceUiText, LastLoginDeviceInfo lastLoginDeviceInfo, String str) {
        str.getClass();
        this.a = e480Var;
        this.b = resourceUiText;
        this.c = lastLoginDeviceInfo;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s380)) {
            return false;
        }
        s380 s380Var = (s380) obj;
        return this.a == s380Var.a && this.b.equals(s380Var.b) && this.c.equals(s380Var.c) && Intrinsics.g(this.d, s380Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + wh8.a(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "SecurityActionInitialState(source=" + this.a + ", subTitle=" + this.b + gvQvkPPtA.qhumMuUKGZfYtz + this.c + ", mobile=" + this.d + ")";
    }
}
