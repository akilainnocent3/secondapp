package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.patron.LoginResponse;

/* JADX INFO: loaded from: classes5.dex */
public final class sit {
    public final String a;
    public final BaseResponse<LoginResponse> b;
    public final long c;

    public sit(String str, BaseResponse<LoginResponse> baseResponse, long j) {
        this.a = str;
        this.b = baseResponse;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sit)) {
            return false;
        }
        sit sitVar = (sit) obj;
        return this.a.equals(sitVar.a) && this.b.equals(sitVar.b) && this.c == sitVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoginResult(mobile=");
        sb.append(this.a);
        sb.append(", response=");
        sb.append(this.b);
        sb.append(", loginTime=");
        return nrz.a(this.c, ")", sb);
    }
}
