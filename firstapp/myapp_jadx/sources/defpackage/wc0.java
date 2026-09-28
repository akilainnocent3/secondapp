package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class wc0 implements lmh0 {
    public final Context a;

    public wc0(Context context) {
        this.a = context;
    }

    @Override // defpackage.lmh0
    public final void a(String str) {
        try {
            this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e) {
            throw new IllegalArgumentException(zdf0.a('.', "Can't open ", str), e);
        }
    }
}
