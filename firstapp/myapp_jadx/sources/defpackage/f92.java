package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import com.sporty.android.common_ui.widgets.GiftGrabPowerBar;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f92 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f92(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.a;
            case 1:
                fgb fgbVar = (fgb) obj;
                fgbVar.T0 = 1;
                fgbVar.n1().z1();
                return Unit.a;
            default:
                glk glkVar = ((GiftGrabPowerBar) obj).V0;
                View view = glkVar.b;
                Property property = View.SCALE_Y;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.5f, 2.0f);
                objectAnimatorOfFloat.setDuration(1000L);
                objectAnimatorOfFloat.setRepeatCount(-1);
                objectAnimatorOfFloat.setRepeatMode(2);
                Unit unit = Unit.a;
                View view2 = glkVar.b;
                Property property2 = View.ALPHA;
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property2, 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(1000L);
                objectAnimatorOfFloat2.setRepeatCount(-1);
                objectAnimatorOfFloat2.setRepeatMode(2);
                View view3 = glkVar.d;
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view3, (Property<View, Float>) property, 1.4f, 1.5f);
                objectAnimatorOfFloat3.setDuration(1000L);
                objectAnimatorOfFloat3.setRepeatCount(-1);
                objectAnimatorOfFloat3.setRepeatMode(2);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view3, (Property<View, Float>) property2, 0.0f, 1.0f);
                objectAnimatorOfFloat4.setDuration(1000L);
                objectAnimatorOfFloat4.setRepeatCount(-1);
                objectAnimatorOfFloat4.setRepeatMode(2);
                FrameLayout frameLayout = glkVar.c.c;
                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property2, 0.0f, 0.3f);
                objectAnimatorOfFloat5.setDuration(1000L);
                objectAnimatorOfFloat5.setRepeatCount(-1);
                objectAnimatorOfFloat5.setRepeatMode(2);
                ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.SCALE_X, 1.0f, 1.3f);
                objectAnimatorOfFloat6.setDuration(1000L);
                objectAnimatorOfFloat6.setRepeatCount(-1);
                objectAnimatorOfFloat6.setRepeatMode(2);
                ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, 1.0f, 1.3f);
                objectAnimatorOfFloat7.setDuration(1000L);
                objectAnimatorOfFloat7.setRepeatCount(-1);
                objectAnimatorOfFloat7.setRepeatMode(2);
                return b.k(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat5, objectAnimatorOfFloat6, objectAnimatorOfFloat7);
        }
    }
}
