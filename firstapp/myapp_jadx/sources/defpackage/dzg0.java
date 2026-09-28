package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class dzg0 {
    public final Context a;

    public dzg0(Context context) {
        this.a = context;
    }

    public final void a(int... iArr) {
        for (int i : iArr) {
            Context context = this.a;
            nan.a aVar = new nan.a(context);
            aVar.c = context.getString(i);
            qw90.a(context).a(aVar.a());
        }
    }
}
