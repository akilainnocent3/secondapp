package defpackage;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class d6l0 {
    public final String a;
    public final long b;
    public boolean c;
    public long d;
    public final /* synthetic */ j6l0 e;

    public d6l0(j6l0 j6l0Var, String str, long j) {
        Objects.requireNonNull(j6l0Var);
        this.e = j6l0Var;
        hm20.e(str);
        this.a = str;
        this.b = j;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.k().getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void b(long j) {
        SharedPreferences.Editor editorEdit = this.e.k().edit();
        editorEdit.putLong(this.a, j);
        editorEdit.apply();
        this.d = j;
    }
}
