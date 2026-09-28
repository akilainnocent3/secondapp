package defpackage;

import androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o7z implements pdd0 {
    public final String a;
    public final String b;

    public o7z(String str) {
        str.getClass();
        this.a = "otp__error__view";
        this.b = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("errorReason", this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7z)) {
            return false;
        }
        o7z o7zVar = (o7z) obj;
        return this.a.equals(o7zVar.a) && Intrinsics.g(this.b, o7zVar.b);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a(QWvyvNzGsBpRT.vuTwTqpJUHWNay, this.a, ", reason=", this.b, ")");
    }
}
