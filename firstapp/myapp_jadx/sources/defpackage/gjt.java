package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class gjt implements pdd0 {
    public final String a;
    public final String b = "logout";

    public gjt(String str) {
        this.a = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        String str = this.a;
        if (str == null) {
            str = "";
        }
        return kpu.d(new Pair("phone", str));
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.b;
    }
}
