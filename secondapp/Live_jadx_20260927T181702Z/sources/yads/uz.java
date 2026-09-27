package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class uz {
    public static final Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public static final ta2 b(Context context) {
        int i10 = context.getResources().getConfiguration().orientation;
        if (i10 != 1) {
            return i10 != 2 ? ta2.f155798e : ta2.f155796c;
        }
        return ta2.f155797d;
    }
}
