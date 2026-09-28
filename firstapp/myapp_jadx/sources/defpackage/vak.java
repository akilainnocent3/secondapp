package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class vak implements pdd0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String d = "get_phone_number";

    public vak(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        String str = this.a;
        if (str == null) {
            str = "";
        }
        return kpu.d(new Pair("phone", str), new Pair("is_logged_in", Boolean.valueOf(this.b)), new Pair("has_account_info", Boolean.valueOf(this.c)));
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.d;
    }
}
