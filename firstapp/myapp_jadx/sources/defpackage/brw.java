package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.sportybet.android.gp.tz.R;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class brw implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ytw b;
    public final /* synthetic */ Object c;

    public /* synthetic */ brw(ytw ytwVar, ytw ytwVar2) {
        this.b = ytwVar;
        this.c = ytwVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        ytw ytwVar = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ytw ytwVar2 = (ytw) obj2;
                Context context = (Context) obj;
                context.getClass();
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.sh_multiplier_v2, (ViewGroup) null, false);
                viewInflate.getClass();
                trw.f(viewInflate);
                ytwVar.setValue((MotionLayout) viewInflate.findViewById(R.id.motionLayout));
                ytwVar2.setValue((MotionLayout) viewInflate.findViewById(R.id.shooting_star_layout));
                MotionLayout motionLayout = (MotionLayout) ytwVar.getValue();
                if (motionLayout != null) {
                    motionLayout.setScaleX(1.35f);
                    motionLayout.setScaleY(1.35f);
                    motionLayout.setElevation(1200.0f);
                    motionLayout.setTranslationZ(1200.0f);
                }
                MotionLayout motionLayout2 = (MotionLayout) ytwVar2.getValue();
                if (motionLayout2 != null) {
                    motionLayout2.setScaleX(1.35f);
                    motionLayout2.setScaleY(1.35f);
                    motionLayout2.setElevation(1200.0f);
                    motionLayout2.setTranslationZ(1200.0f);
                }
                return viewInflate;
            default:
                Set set = (Set) obj;
                set.getClass();
                ytwVar.setValue(Boolean.FALSE);
                ((Function1) obj2).invoke(set);
                return Unit.a;
        }
    }

    public /* synthetic */ brw(ytw ytwVar, Function1 function1) {
        this.c = function1;
        this.b = ytwVar;
    }
}
