package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class j82 {
    public static final int a(Context context) {
        Integer num;
        Object obj = dw2.f148384j;
        nt2 nt2VarA = cw2.a().a(context);
        if (nt2VarA == null || (num = nt2VarA.f153183r0) == null) {
            return 1;
        }
        if (num.intValue() == 0) {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }
}
