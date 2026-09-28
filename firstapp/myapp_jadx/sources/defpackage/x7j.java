package defpackage;

import android.animation.ObjectAnimator;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class x7j implements Function0<Unit> {
    public final /* synthetic */ ImageView a;
    public final /* synthetic */ u6j b;
    public final /* synthetic */ ObjectAnimator c;

    public x7j(ImageView imageView, u6j u6jVar, ObjectAnimator objectAnimator) {
        this.a = imageView;
        this.b = u6jVar;
        this.c = objectAnimator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        u6j u6jVar = this.b;
        ImageView imageView = this.a;
        ObjectAnimator objectAnimator = this.c;
        try {
            imageView.clearAnimation();
            ajh ajhVarL1 = u6jVar.l1();
            if (ajhVarL1 != null) {
                ajhVarL1.C.removeView(imageView);
            }
            u6jVar.B0.remove(objectAnimator);
            objectAnimator.removeAllListeners();
            objectAnimator.cancel();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Unit.a;
    }
}
