package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class q1h {

    public static final class a implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
        public boolean a;
        public final /* synthetic */ View b;
        public final /* synthetic */ Function0<Unit> c;

        public a(View view, Function0<Unit> function0) {
            this.b = view;
            this.c = function0;
            view.addOnAttachStateChangeListener(this);
            if (this.a || !view.isAttachedToWindow()) {
                return;
            }
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.a = true;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            this.c.invoke();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            if (this.a) {
                return;
            }
            View view2 = this.b;
            if (view2.isAttachedToWindow()) {
                view2.getViewTreeObserver().addOnGlobalLayoutListener(this);
                this.a = true;
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            if (this.a) {
                this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.a = false;
            }
        }
    }

    public static final class b implements tse {
        public final /* synthetic */ a a;

        public b(a aVar) {
            this.a = aVar;
        }

        @Override // defpackage.tse
        public final void dispose() {
            a aVar = this.a;
            View view = aVar.b;
            if (aVar.a) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(aVar);
                aVar.a = false;
            }
            view.removeOnAttachStateChangeListener(aVar);
        }
    }

    public static final void a(Function0<Unit> function0, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.b bVarI = aVar.i(-1646555525);
        int i2 = (bVarI.A(function0) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            b((View) bVarI.O(AndroidCompositionLocals_androidKt.f), (mmd) bVarI.O(kna.h), function0, bVarI, (i2 << 6) & 896);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new n1h(i, 0, function0);
        }
    }

    public static final void b(final View view, final mmd mmdVar, final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(-1319522472);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(view) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(mmdVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            boolean zA = bVarI.A(view) | ((i2 & 896) == 256);
            Object objY = bVarI.y();
            if (zA || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new o1h(0, view, function0);
                bVarI.r(objY);
            }
            xvf.a(view, mmdVar, (Function1) objY, bVarI);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: p1h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    q1h.b(view, mmdVar, function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
