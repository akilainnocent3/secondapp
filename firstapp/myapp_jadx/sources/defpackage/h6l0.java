package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes4.dex */
public final class h6l0 {
    public final String a;
    public boolean b;
    public String c;
    public final /* synthetic */ j6l0 d;

    public h6l0(j6l0 j6l0Var, String str) {
        this.d = j6l0Var;
        hm20.e(str);
        this.a = str;
    }

    public final String a() {
        if (!this.b) {
            this.b = true;
            this.c = this.d.k().getString(this.a, null);
        }
        return this.c;
    }

    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.d.k().edit();
        editorEdit.putString(this.a, str);
        editorEdit.apply();
        this.c = str;
    }
}
