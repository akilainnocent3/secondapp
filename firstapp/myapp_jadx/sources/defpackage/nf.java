package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nf implements xlw.a {
    public static String b(String str, String str2, String str3, String str4, List list) {
        return str + str2 + str3 + list + str4;
    }

    @Override // xlw.a
    public void a(View view, ValueAnimator valueAnimator) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
