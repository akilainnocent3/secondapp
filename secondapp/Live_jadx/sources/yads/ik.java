package yads;

import android.content.Context;
import android.content.res.TypedArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ik {
    public static final int a(Context context, int i10) {
        int color;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i10});
        try {
            color = typedArrayObtainStyledAttributes.getColor(0, 0);
        } catch (Exception unused) {
            color = -16777216;
        }
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }
}
