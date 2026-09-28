package defpackage;

import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.compose.ui.platform.AbstractComposeView;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class mch0 implements rdd, jch0 {
    public final rdd0 a;
    public final nch0 b;
    public final qch0 c;
    public final ttr d;
    public final lch0 e;
    public Long f;
    public boolean i;

    /* JADX WARN: Type inference failed for: r3v5, types: [lch0] */
    public mch0(rdd0 rdd0Var) {
        rdd0Var.getClass();
        this.a = rdd0Var;
        this.b = new nch0();
        this.c = new qch0();
        this.d = hwr.a(a1s.c, new n110(1));
        this.e = new Choreographer.FrameCallback() { // from class: lch0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                mch0 mch0Var = this.a;
                lch0 lch0Var = mch0Var.e;
                ttr ttrVar = mch0Var.d;
                long jNanoTime = System.nanoTime();
                qch0 qch0Var = mch0Var.c;
                Long l = mch0Var.f;
                long jLongValue = l != null ? l.longValue() : jNanoTime;
                qch0Var.getClass();
                ArrayList arrayList = qch0Var.a;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    qch0.a aVar = (qch0.a) it.next();
                    long jMax = Math.max(aVar.d, jNanoTime - Math.max(jLongValue, aVar.b));
                    aVar.d = jMax;
                    if (jNanoTime >= aVar.c) {
                        arrayList2.add(new pch0(aVar.a, jMax));
                        it.remove();
                    }
                }
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    pch0 pch0Var = (pch0) obj;
                    rdd0 rdd0Var2 = mch0Var.a;
                    long j2 = pch0Var.b / 1000000;
                    och0 och0Var = pch0Var.a;
                    rdd0Var2.a(new kch0(j2, och0Var.a, och0Var.b), k00.d);
                }
                if (!arrayList.isEmpty()) {
                    mch0Var.f = Long.valueOf(jNanoTime);
                    ((Choreographer) ttrVar.getValue()).postFrameCallback(lch0Var);
                } else if (mch0Var.i) {
                    ((Choreographer) ttrVar.getValue()).removeFrameCallback(lch0Var);
                    mch0Var.f = null;
                    mch0Var.i = false;
                }
            }
        };
        ix20.w.f.a(this);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c5  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jch0
    public final void a(r1k r1kVar, MotionEvent motionEvent, boolean z, long j) {
        AbstractComposeView abstractComposeView;
        String strD;
        och0 och0Var;
        motionEvent.getClass();
        int actionMasked = motionEvent.getActionMasked();
        nch0 nch0Var = this.b;
        nch0.a aVar = null;
        aVar = null;
        nch0.a aVar2 = null;
        och0Var = null;
        och0Var = null;
        och0Var = null;
        och0 och0Var2 = null;
        aVar = null;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3 || actionMasked == 5) {
                        nch0Var.a = null;
                        return;
                    }
                    return;
                }
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                nch0.a aVar3 = nch0Var.a;
                if (aVar3 != null) {
                    float f = rawX - aVar3.c;
                    float f2 = rawY - aVar3.d;
                    float f3 = (f2 * f2) + (f * f);
                    int i = aVar3.e;
                    if (f3 <= i * i) {
                        aVar2 = aVar3;
                    }
                }
                nch0Var.a = aVar2;
                return;
            }
            long eventTime = motionEvent.getEventTime();
            float rawX2 = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            int longPressTimeout = ViewConfiguration.getLongPressTimeout();
            nch0.a aVar4 = nch0Var.a;
            nch0Var.a = null;
            if (aVar4 != null && z && eventTime - aVar4.b < longPressTimeout) {
                float f4 = rawX2 - aVar4.c;
                float f5 = rawY2 - aVar4.d;
                float f6 = (f5 * f5) + (f4 * f4);
                int i2 = aVar4.e;
                if (f6 <= i2 * i2) {
                    och0Var2 = aVar4.a;
                }
            }
            och0 och0Var3 = och0Var2;
            if (och0Var3 != null) {
                qch0 qch0Var = this.c;
                qch0Var.getClass();
                qch0Var.a.add(new qch0.a(och0Var3, j, j + 1000000000));
                if (this.i) {
                    return;
                }
                this.i = true;
                this.f = Long.valueOf(j);
                ((Choreographer) this.d.getValue()).postFrameCallback(this.e);
                return;
            }
            return;
        }
        float rawX3 = motionEvent.getRawX();
        float rawY3 = motionEvent.getRawY();
        View decorView = r1kVar.getWindow().getDecorView();
        decorView.getClass();
        View viewB = xch0.b(decorView, (int) rawX3, (int) rawY3);
        if (viewB == null) {
            och0Var = null;
        } else {
            View view = viewB;
            while (true) {
                if (view == null) {
                    abstractComposeView = null;
                    break;
                } else if (view instanceof AbstractComposeView) {
                    abstractComposeView = (AbstractComposeView) view;
                    break;
                } else {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                }
            }
            if (abstractComposeView != null) {
                m9i0 m9i0VarA = xch0.a(abstractComposeView);
                if (m9i0VarA == null) {
                    strD = null;
                } else {
                    int[] iArr = new int[2];
                    m9i0VarA.getView().getLocationOnScreen(iArr);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(rawY3 - iArr[1])) & 4294967295L) | (((long) Float.floatToRawIntBits(rawX3 - iArr[0])) << 32);
                    bb80 bb80VarA = m9i0VarA.getSemanticsOwner().a();
                    strD = xch0.c(bb80VarA, jFloatToRawIntBits, true);
                    if (strD == null) {
                        strD = xch0.c(bb80VarA, jFloatToRawIntBits, false);
                    }
                }
                if (strD == null) {
                    strD = xch0.d(abstractComposeView);
                }
            } else {
                while (true) {
                    if (viewB == null) {
                        viewB = null;
                        break;
                    } else {
                        if (viewB.isEnabled() && viewB.isClickable()) {
                            break;
                        }
                        ViewParent parent2 = viewB.getParent();
                        viewB = parent2 instanceof View ? (View) parent2 : null;
                    }
                }
                if (viewB != null) {
                    strD = xch0.d(viewB);
                } else {
                    och0Var = null;
                }
            }
            och0Var = new och0(r1kVar.getClass().getSimpleName(), strD);
        }
        long eventTime2 = motionEvent.getEventTime();
        float rawX4 = motionEvent.getRawX();
        float rawY4 = motionEvent.getRawY();
        int scaledTouchSlop = ViewConfiguration.get(r1kVar).getScaledTouchSlop();
        if (z && och0Var != null) {
            aVar = new nch0.a(och0Var, eventTime2, rawX4, rawY4, scaledTouchSlop);
        }
        nch0Var.a = aVar;
    }

    @Override // defpackage.rdd
    public final void onStop(ibs ibsVar) {
        this.b.a = null;
        this.c.a.clear();
        if (this.i) {
            ((Choreographer) this.d.getValue()).removeFrameCallback(this.e);
            this.f = null;
            this.i = false;
        }
    }
}
