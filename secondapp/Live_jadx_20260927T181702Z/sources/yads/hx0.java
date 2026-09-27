package yads;

import android.content.Context;
import android.graphics.Typeface;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class hx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hw0 f150331a;

    public /* synthetic */ hx0(Context context) {
        this(new hw0(context.getApplicationContext()));
    }

    public final Typeface a(sw0 sw0Var) {
        ConcurrentHashMap concurrentHashMap = ex0.f148870a;
        Typeface typeface = (Typeface) concurrentHashMap.get(sw0Var);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceA = this.f150331a.a(sw0Var);
        if (typefaceA == null) {
            return null;
        }
        concurrentHashMap.put(sw0Var, typefaceA);
        return typefaceA;
    }

    public hx0(hw0 hw0Var) {
        this.f150331a = hw0Var;
    }
}
