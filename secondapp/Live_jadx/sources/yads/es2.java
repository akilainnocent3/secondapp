package yads;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class es2 {
    public static View a(Context context, Class cls, int i10, ViewGroup viewGroup) {
        try {
            return (View) cls.cast(LayoutInflater.from(context).inflate(i10, viewGroup, false));
        } catch (Exception unused) {
            boolean z10 = ad1.f146762a;
            return null;
        }
    }
}
