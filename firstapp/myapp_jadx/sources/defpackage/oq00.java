package defpackage;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class oq00 implements tqc<String> {
    public final /* synthetic */ cr00 a;
    public final /* synthetic */ mq00 b;
    public final /* synthetic */ String c;

    public oq00(cr00 cr00Var, mq00 mq00Var, String str) {
        this.a = cr00Var;
        this.b = mq00Var;
        this.c = str;
    }

    @Override // defpackage.tqc
    public final void a(Exception exc) {
        ej5.c(zu7.a(), null, null, new uq00(this.b, this.c, null), 3);
        itf0.a.d("getStringAsync error " + exc, new Object[0]);
    }

    @Override // defpackage.tqc
    public final void onSuccess(String str) {
        String str2 = str;
        str2.getClass();
        this.a.invoke(new JSONObject(str2));
    }
}
