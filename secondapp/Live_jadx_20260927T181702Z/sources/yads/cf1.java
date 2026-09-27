package yads;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class cf1 {
    public static final hw2 a(lt2 lt2Var) {
        return Build.VERSION.SDK_INT >= 24 ? yf.a(lt2Var) : new kw2(lt2Var);
    }
}
