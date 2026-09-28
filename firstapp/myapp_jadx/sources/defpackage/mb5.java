package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public abstract class mb5 {
    public int a;

    public mb5(int i) {
        this.a = i;
    }

    public void e(int i) {
        this.a = i | this.a;
    }

    public abstract String f(Context context);

    public abstract String h(Context context);

    public boolean i(int i) {
        return (this.a & i) == i;
    }
}
