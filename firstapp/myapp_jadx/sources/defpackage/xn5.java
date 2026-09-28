package defpackage;

import java.util.ArrayList;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes7.dex */
public final class xn5 implements zrm {
    public final b5 a;
    public final String b;
    public final mp5 c;
    public final k5b d;
    public final OkHttpClient e;

    public xn5(b5 b5Var, String str, mp5 mp5Var, k5b k5bVar, OkHttpClient okHttpClient) {
        b5Var.getClass();
        str.getClass();
        mp5Var.getClass();
        k5bVar.getClass();
        okHttpClient.getClass();
        this.a = b5Var;
        this.b = str;
        this.c = mp5Var;
        this.d = k5bVar;
        this.e = okHttpClient;
    }

    @Override // defpackage.zrm
    public final Object a(ArrayList arrayList, ox00 ox00Var) {
        return ej5.d(this.d, new vn5(this, arrayList, null), ox00Var);
    }

    @Override // defpackage.zrm
    public final Object b(String str, String str2, px00.a aVar) {
        return ej5.d(this.d, new wn5(str2, this, str, null), aVar);
    }
}
