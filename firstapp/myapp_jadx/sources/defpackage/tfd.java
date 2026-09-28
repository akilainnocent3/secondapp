package defpackage;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class tfd implements xl80 {
    public static aj80 b(ls6 ls6Var) {
        return new aj80(System.currentTimeMillis() + 3600000, new aj80.b(8), new aj80.a(true, false, false), 10.0d, 1.2d, 60);
    }

    @Override // defpackage.xl80
    public final aj80 a(ls6 ls6Var, JSONObject jSONObject) {
        return b(ls6Var);
    }
}
