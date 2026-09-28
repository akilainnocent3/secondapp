package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class p15 extends djx<Boolean> {
    @Override // defpackage.djx
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        if (!bundle.containsKey(str) || hv60.f(str, bundle)) {
            return null;
        }
        boolean z = bundle.getBoolean(str, false);
        if (z || !bundle.getBoolean(str, true)) {
            return Boolean.valueOf(z);
        }
        s5b.a(str);
        throw null;
    }

    @Override // defpackage.djx
    public final String b() {
        return "boolean";
    }

    @Override // defpackage.djx
    /* JADX INFO: renamed from: d */
    public final Boolean h(String str) {
        boolean z;
        str.getClass();
        if (Intrinsics.g(str, "true")) {
            z = true;
        } else {
            if (!Intrinsics.g(str, "false")) {
                hb5.a("A boolean NavType only accepts \"true\" or \"false\" values.");
                return null;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.djx
    public final void e(Bundle bundle, String str, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        str.getClass();
        bundle.putBoolean(str, zBooleanValue);
    }
}
