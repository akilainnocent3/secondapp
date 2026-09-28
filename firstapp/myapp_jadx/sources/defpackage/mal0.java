package defpackage;

import android.os.Process;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class mal0 {
    public static final HashMap a;

    static {
        new HashSet(Arrays.asList("native", "unity"));
        a = new HashMap();
        n36.a("UID: [", Process.myUid(), Process.myPid(), "]  PID: [", "] ").concat("PlayCoreVersion");
    }
}
