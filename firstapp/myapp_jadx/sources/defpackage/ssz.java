package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ssz extends IOException {
    public final boolean a;
    public final int b;

    public ssz(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.a = z;
        this.b = i;
    }

    public static ssz a(RuntimeException runtimeException, String str) {
        return new ssz(str, runtimeException, true, 1);
    }

    public static ssz b(String str) {
        return new ssz(str, null, true, 4);
    }

    public static ssz c(String str) {
        return new ssz(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder(message != null ? message.concat(" ") : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.a);
        sb.append(", dataType=");
        return zk1.a(this.b, "}", sb);
    }
}
