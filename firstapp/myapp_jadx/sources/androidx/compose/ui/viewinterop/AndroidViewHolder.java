package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.v;
import androidx.compose.ui.layout.y;
import androidx.compose.ui.platform.AndroidComposeView;
import com.sportybet.android.gp.tz.R;
import defpackage.aiv;
import defpackage.biv;
import defpackage.c0d;
import defpackage.eb9;
import defpackage.ej5;
import defpackage.fxh0;
import defpackage.g9i0;
import defpackage.ghz;
import defpackage.glx;
import defpackage.h8j0;
import defpackage.i40;
import defpackage.ib5;
import defpackage.ibs;
import defpackage.iln;
import defpackage.jwo;
import defpackage.jxo;
import defpackage.klx;
import defpackage.kxa;
import defpackage.l8j0;
import defpackage.l9j0;
import defpackage.lc6;
import defpackage.ld0;
import defpackage.llx;
import defpackage.ma50;
import defpackage.mma;
import defpackage.mmd;
import defpackage.mzo;
import defpackage.nv60;
import defpackage.nzo;
import defpackage.obl0;
import defpackage.omd;
import defpackage.pb80;
import defpackage.qlr;
import defpackage.r6i0;
import defpackage.slx;
import defpackage.tcf;
import defpackage.tje0;
import defpackage.tlx;
import defpackage.tsr;
import defpackage.uga;
import defpackage.uj50;
import defpackage.urr;
import defpackage.v020;
import defpackage.v1b;
import defpackage.v40;
import defpackage.v5b;
import defpackage.vhv;
import defpackage.wgz;
import defpackage.wkn;
import defpackage.xa80;
import defpackage.xgz;
import defpackage.y020;
import defpackage.y5b;
import defpackage.y8h0;
import defpackage.ymn;
import defpackage.zmy;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005J\u0015\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\tR6\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR6\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR6\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u001fR*\u00100\u001a\u00020)2\u0006\u0010\u0019\u001a\u00020)8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R0\u00108\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0018\u0018\u0001018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R*\u0010@\u001a\u0002092\u0006\u0010\u0019\u001a\u0002098\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R0\u0010D\u001a\u0010\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u0018\u0018\u0001018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u00103\u001a\u0004\bB\u00105\"\u0004\bC\u00107R.\u0010L\u001a\u0004\u0018\u00010E2\b\u0010\u0019\u001a\u0004\u0018\u00010E8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR.\u0010T\u001a\u0004\u0018\u00010M2\b\u0010\u0019\u001a\u0004\u0018\u00010M8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR0\u0010Y\u001a\u0010\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020\u0018\u0018\u0001018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bV\u00103\u001a\u0004\bW\u00105\"\u0004\bX\u00107R\u0017\u0010_\u001a\u00020Z8\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010b¨\u0006d"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroid/view/ViewGroup;", "Lslx;", "Luga;", "Lxgz;", "Lzmy;", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "getInteropView", "()Landroid/view/View;", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "", "getNestedScrollAxes", "()I", "b", "Landroid/view/View;", "getView", "view", "Lkotlin/Function0;", "", "value", "d", "Lkotlin/jvm/functions/Function0;", "getUpdate", "()Lkotlin/jvm/functions/Function0;", "setUpdate", "(Lkotlin/jvm/functions/Function0;)V", "update", "f", "getReset", "setReset", "reset", "i", "getRelease", "setRelease", "release", "Landroidx/compose/ui/d;", "v", "Landroidx/compose/ui/d;", "getModifier", "()Landroidx/compose/ui/d;", "setModifier", "(Landroidx/compose/ui/d;)V", "modifier", "Lkotlin/Function1;", "w", "Lkotlin/jvm/functions/Function1;", "getOnModifierChanged$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnModifierChanged$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "onModifierChanged", "Lmmd;", "y", "Lmmd;", "getDensity", "()Lmmd;", "setDensity", "(Lmmd;)V", "density", "z", "getOnDensityChanged$ui_release", "setOnDensityChanged$ui_release", "onDensityChanged", "Libs;", "A", "Libs;", "getLifecycleOwner", "()Libs;", "setLifecycleOwner", "(Libs;)V", "lifecycleOwner", "Lnv60;", "B", "Lnv60;", "getSavedStateRegistryOwner", "()Lnv60;", "setSavedStateRegistryOwner", "(Lnv60;)V", "savedStateRegistryOwner", "", "H", "getOnRequestDisallowInterceptTouchEvent$ui_release", "setOnRequestDisallowInterceptTouchEvent$ui_release", "onRequestDisallowInterceptTouchEvent", "Ltsr;", "N", "Ltsr;", "getLayoutNode", "()Ltsr;", "layoutNode", "Lghz;", "getSnapshotObserver", "()Lghz;", "snapshotObserver", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class AndroidViewHolder extends ViewGroup implements slx, uga, xgz, zmy {
    public static final b O = b.a;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public ibs lifecycleOwner;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public nv60 savedStateRegistryOwner;
    public final int[] C;
    public long D;
    public l8j0 E;
    public final p F;
    public final o G;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public Function1<? super Boolean, Unit> onRequestDisallowInterceptTouchEvent;
    public final int[] I;
    public int J;
    public int K;
    public final tlx L;
    public boolean M;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public final tsr layoutNode;
    public final glx a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final View view;
    public final wgz c;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public Function0<Unit> update;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public Function0<Unit> reset;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public Function0<Unit> release;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public androidx.compose.ui.d modifier;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public Function1<? super androidx.compose.ui.d, Unit> onModifierChanged;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public mmd density;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public Function1<? super mmd, Unit> onDensityChanged;

    public static final class a extends h8j0.b {
        public final /* synthetic */ ViewFactoryHolder c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewFactoryHolder viewFactoryHolder) {
            super(1);
            this.c = viewFactoryHolder;
        }

        @Override // h8j0.b
        public final l8j0 d(l8j0 l8j0Var, List<h8j0> list) {
            b bVar = AndroidViewHolder.O;
            return this.c.f(l8j0Var);
        }

        @Override // h8j0.b
        public final h8j0.a e(h8j0 h8j0Var, h8j0.a aVar) {
            b bVar = AndroidViewHolder.O;
            iln ilnVar = this.c.layoutNode.U.c;
            if (ilnVar.j0.C) {
                long jA = jwo.a(ilnVar.i0(0L));
                int i = (int) (jA >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (jA & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long jA2 = eb9.c(ilnVar).a();
                int i3 = (int) (jA2 >> 32);
                int i4 = (int) (jA2 & 4294967295L);
                long j = ilnVar.c;
                long jA3 = jwo.a(ilnVar.i0((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i5 = i3 - ((int) (jA3 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (jA3 & 4294967295L));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return new h8j0.a(AndroidViewHolder.e(aVar.a, i, i2, i5, i7), AndroidViewHolder.e(aVar.b, i, i2, i5, i7));
                }
            }
            return aVar;
        }
    }

    public static final class b extends qlr implements Function1<AndroidViewHolder, Unit> {
        public static final b a = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AndroidViewHolder androidViewHolder) {
            AndroidViewHolder androidViewHolder2 = androidViewHolder;
            Handler handler = androidViewHolder2.getHandler();
            final p pVar = androidViewHolder2.F;
            handler.post(new Runnable() { // from class: md0
                @Override // java.lang.Runnable
                public final void run() {
                    pVar.invoke();
                }
            });
            return Unit.a;
        }
    }

    public static final class c extends qlr implements Function1<androidx.compose.ui.d, Unit> {
        public final /* synthetic */ tsr a;
        public final /* synthetic */ androidx.compose.ui.d b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tsr tsrVar, androidx.compose.ui.d dVar) {
            super(1);
            this.a = tsrVar;
            this.b = dVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(androidx.compose.ui.d dVar) {
            this.a.k(dVar.n(this.b));
            return Unit.a;
        }
    }

    public static final class d extends qlr implements Function1<mmd, Unit> {
        public final /* synthetic */ tsr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(tsr tsrVar) {
            super(1);
            this.a = tsrVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(mmd mmdVar) {
            this.a.l0(mmdVar);
            return Unit.a;
        }
    }

    public static final class e extends qlr implements Function1<wgz, Unit> {
        public final /* synthetic */ ViewFactoryHolder a;
        public final /* synthetic */ tsr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ViewFactoryHolder viewFactoryHolder, tsr tsrVar) {
            super(1);
            this.a = viewFactoryHolder;
            this.b = tsrVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(wgz wgzVar) {
            wgz wgzVar2 = wgzVar;
            AndroidComposeView androidComposeView = wgzVar2 instanceof AndroidComposeView ? (AndroidComposeView) wgzVar2 : null;
            ViewFactoryHolder viewFactoryHolder = this.a;
            if (androidComposeView != null) {
                HashMap<AndroidViewHolder, tsr> holderToLayoutNode = androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode();
                tsr tsrVar = this.b;
                holderToLayoutNode.put(viewFactoryHolder, tsrVar);
                androidComposeView.getAndroidViewsHandler$ui_release().addView(viewFactoryHolder);
                androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(tsrVar, viewFactoryHolder);
                viewFactoryHolder.setImportantForAccessibility(1);
                r6i0.p(viewFactoryHolder, new v40(androidComposeView, tsrVar, androidComposeView));
            }
            if (viewFactoryHolder.getView().getParent() != viewFactoryHolder) {
                viewFactoryHolder.addView(viewFactoryHolder.getView());
            }
            return Unit.a;
        }
    }

    public static final class f extends qlr implements Function1<wgz, Unit> {
        public final /* synthetic */ ViewFactoryHolder a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ViewFactoryHolder viewFactoryHolder) {
            super(1);
            this.a = viewFactoryHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(wgz wgzVar) {
            wgz wgzVar2 = wgzVar;
            AndroidComposeView androidComposeView = wgzVar2 instanceof AndroidComposeView ? (AndroidComposeView) wgzVar2 : null;
            ViewFactoryHolder viewFactoryHolder = this.a;
            if (androidComposeView != null) {
                androidComposeView.getAndroidViewsHandler$ui_release().removeViewInLayout(viewFactoryHolder);
                y8h0.c(androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder()).remove(androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(viewFactoryHolder));
                viewFactoryHolder.setImportantForAccessibility(0);
            }
            viewFactoryHolder.removeAllViewsInLayout();
            return Unit.a;
        }
    }

    public static final class g implements aiv {
        public final /* synthetic */ ViewFactoryHolder a;
        public final /* synthetic */ tsr b;

        public static final class a extends qlr implements Function1<y.a, Unit> {
            public static final a a = new a(1);

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(y.a aVar) {
                return Unit.a;
            }
        }

        public static final class b extends qlr implements Function1<y.a, Unit> {
            public final /* synthetic */ ViewFactoryHolder a;
            public final /* synthetic */ tsr b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ViewFactoryHolder viewFactoryHolder, tsr tsrVar) {
                super(1);
                this.a = viewFactoryHolder;
                this.b = tsrVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(y.a aVar) {
                androidx.compose.ui.viewinterop.a.a(this.a, this.b);
                return Unit.a;
            }
        }

        public g(ViewFactoryHolder viewFactoryHolder, tsr tsrVar) {
            this.a = viewFactoryHolder;
            this.b = tsrVar;
        }

        @Override // defpackage.aiv
        public final int a(nzo nzoVar, List<? extends mzo> list, int i) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            ViewFactoryHolder viewFactoryHolder = this.a;
            ViewGroup.LayoutParams layoutParams = viewFactoryHolder.getLayoutParams();
            layoutParams.getClass();
            viewFactoryHolder.measure(iMakeMeasureSpec, AndroidViewHolder.g(0, i, layoutParams.height));
            return viewFactoryHolder.getMeasuredWidth();
        }

        @Override // defpackage.aiv
        public final biv c(t tVar, List<? extends vhv> list, long j) {
            ViewFactoryHolder viewFactoryHolder = this.a;
            if (viewFactoryHolder.getChildCount() == 0) {
                return t.z1(tVar, kxa.k(j), kxa.j(j), a.a);
            }
            if (kxa.k(j) != 0) {
                viewFactoryHolder.getChildAt(0).setMinimumWidth(kxa.k(j));
            }
            if (kxa.j(j) != 0) {
                viewFactoryHolder.getChildAt(0).setMinimumHeight(kxa.j(j));
            }
            int iK = kxa.k(j);
            int i = kxa.i(j);
            ViewGroup.LayoutParams layoutParams = viewFactoryHolder.getLayoutParams();
            layoutParams.getClass();
            int iG = AndroidViewHolder.g(iK, i, layoutParams.width);
            int iJ = kxa.j(j);
            int iH = kxa.h(j);
            ViewGroup.LayoutParams layoutParams2 = viewFactoryHolder.getLayoutParams();
            layoutParams2.getClass();
            viewFactoryHolder.measure(iG, AndroidViewHolder.g(iJ, iH, layoutParams2.height));
            return t.z1(tVar, viewFactoryHolder.getMeasuredWidth(), viewFactoryHolder.getMeasuredHeight(), new b(viewFactoryHolder, this.b));
        }

        @Override // defpackage.aiv
        public final int e(nzo nzoVar, List<? extends mzo> list, int i) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            ViewFactoryHolder viewFactoryHolder = this.a;
            ViewGroup.LayoutParams layoutParams = viewFactoryHolder.getLayoutParams();
            layoutParams.getClass();
            viewFactoryHolder.measure(iMakeMeasureSpec, AndroidViewHolder.g(0, i, layoutParams.height));
            return viewFactoryHolder.getMeasuredWidth();
        }

        @Override // defpackage.aiv
        public final int g(nzo nzoVar, List<? extends mzo> list, int i) {
            ViewFactoryHolder viewFactoryHolder = this.a;
            ViewGroup.LayoutParams layoutParams = viewFactoryHolder.getLayoutParams();
            layoutParams.getClass();
            viewFactoryHolder.measure(AndroidViewHolder.g(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return viewFactoryHolder.getMeasuredHeight();
        }

        @Override // defpackage.aiv
        public final int i(nzo nzoVar, List<? extends mzo> list, int i) {
            ViewFactoryHolder viewFactoryHolder = this.a;
            ViewGroup.LayoutParams layoutParams = viewFactoryHolder.getLayoutParams();
            layoutParams.getClass();
            viewFactoryHolder.measure(AndroidViewHolder.g(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return viewFactoryHolder.getMeasuredHeight();
        }
    }

    public static final class h extends qlr implements Function1<pb80, Unit> {
        public static final h a = new h(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(pb80 pb80Var) {
            return Unit.a;
        }
    }

    public static final class i extends qlr implements Function1<tcf, Unit> {
        public final /* synthetic */ ViewFactoryHolder a;
        public final /* synthetic */ tsr b;
        public final /* synthetic */ ViewFactoryHolder c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ViewFactoryHolder viewFactoryHolder, tsr tsrVar, ViewFactoryHolder viewFactoryHolder2) {
            super(1);
            this.a = viewFactoryHolder;
            this.b = tsrVar;
            this.c = viewFactoryHolder2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(tcf tcfVar) {
            lc6 lc6VarA = tcfVar.F1().a();
            ViewFactoryHolder viewFactoryHolder = this.a;
            if (viewFactoryHolder.getView().getVisibility() != 8) {
                viewFactoryHolder.M = true;
                wgz wgzVar = this.b.C;
                AndroidComposeView androidComposeView = wgzVar instanceof AndroidComposeView ? (AndroidComposeView) wgzVar : null;
                if (androidComposeView != null) {
                    Canvas canvasC = i40.c(lc6VarA);
                    androidComposeView.getAndroidViewsHandler$ui_release().getClass();
                    this.c.draw(canvasC);
                }
                viewFactoryHolder.M = false;
            }
            return Unit.a;
        }
    }

    public static final class j extends qlr implements Function1<urr, Unit> {
        public final /* synthetic */ ViewFactoryHolder a;
        public final /* synthetic */ tsr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ViewFactoryHolder viewFactoryHolder, tsr tsrVar) {
            super(1);
            this.a = viewFactoryHolder;
            this.b = tsrVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(urr urrVar) {
            WindowInsets windowInsetsG;
            tsr tsrVar = this.b;
            ViewFactoryHolder viewFactoryHolder = this.a;
            androidx.compose.ui.viewinterop.a.a(viewFactoryHolder, tsrVar);
            viewFactoryHolder.c.C();
            int[] iArr = viewFactoryHolder.C;
            int i = iArr[0];
            int i2 = iArr[1];
            viewFactoryHolder.getView().getLocationOnScreen(iArr);
            long j = viewFactoryHolder.D;
            long jA = urrVar.a();
            viewFactoryHolder.D = jA;
            l8j0 l8j0Var = viewFactoryHolder.E;
            if (l8j0Var != null && ((i != iArr[0] || i2 != iArr[1] || !jxo.b(j, jA)) && (windowInsetsG = viewFactoryHolder.f(l8j0Var).g()) != null)) {
                viewFactoryHolder.getView().dispatchApplyWindowInsets(windowInsetsG);
            }
            return Unit.a;
        }
    }

    @c0d(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", l = {617, 619}, m = "invokeSuspend")
    public static final class k extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ AndroidViewHolder c;
        public final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(boolean z, AndroidViewHolder androidViewHolder, long j, v1b<? super k> v1bVar) {
            super(2, v1bVar);
            this.b = z;
            this.c = androidViewHolder;
            this.d = j;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new k(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((k) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
        
            if (r11 == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        
            if (r11 == r0) goto L18;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r10.a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto L10
                defpackage.uj50.b(r11)
                goto L47
            L10:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r10)
                r10 = 0
                return r10
            L17:
                defpackage.uj50.b(r11)
                goto L34
            L1b:
                defpackage.uj50.b(r11)
                androidx.compose.ui.viewinterop.AndroidViewHolder r11 = r10.c
                glx r4 = r11.a
                boolean r11 = r10.b
                if (r11 != 0) goto L39
                r10.a = r3
                r5 = 0
                long r7 = r10.d
                r9 = r10
                java.lang.Object r11 = r4.a(r5, r7, r9)
                if (r11 != r0) goto L34
                goto L46
            L34:
                exh0 r11 = (defpackage.exh0) r11
                long r10 = r11.a
                goto L4b
            L39:
                r9 = r10
                r9.a = r2
                long r5 = r9.d
                r7 = 0
                java.lang.Object r11 = r4.a(r5, r7, r9)
                if (r11 != r0) goto L47
            L46:
                return r0
            L47:
                exh0 r11 = (defpackage.exh0) r11
                long r10 = r11.a
            L4b:
                kotlin.Unit r10 = kotlin.Unit.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AndroidViewHolder.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", l = {628}, m = "invokeSuspend")
    public static final class l extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(long j, v1b<? super l> v1bVar) {
            super(2, v1bVar);
            this.c = j;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return AndroidViewHolder.this.new l(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((l) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                glx glxVar = AndroidViewHolder.this.a;
                this.a = 1;
                if (glxVar.b(this.c, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public static final class m extends qlr implements Function0<Unit> {
        public static final m a = new m(0);

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            return Unit.a;
        }
    }

    public static final class n extends qlr implements Function0<Unit> {
        public static final n a = new n(0);

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            return Unit.a;
        }
    }

    public static final class o extends qlr implements Function0<Unit> {
        public final /* synthetic */ ViewFactoryHolder a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ViewFactoryHolder viewFactoryHolder) {
            super(0);
            this.a = viewFactoryHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.a.getLayoutNode().N();
            return Unit.a;
        }
    }

    public static final class p extends qlr implements Function0<Unit> {
        public final /* synthetic */ ViewFactoryHolder a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ViewFactoryHolder viewFactoryHolder) {
            super(0);
            this.a = viewFactoryHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ViewFactoryHolder viewFactoryHolder = this.a;
            if (viewFactoryHolder.e && viewFactoryHolder.isAttachedToWindow() && viewFactoryHolder.getView().getParent() == viewFactoryHolder) {
                viewFactoryHolder.getSnapshotObserver().a(viewFactoryHolder, AndroidViewHolder.O, viewFactoryHolder.getUpdate());
            }
            return Unit.a;
        }
    }

    public static final class q extends qlr implements Function0<Unit> {
        public static final q a = new q(0);

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            return Unit.a;
        }
    }

    public AndroidViewHolder(Context context, mma mmaVar, int i2, glx glxVar, View view, wgz wgzVar) {
        super(context);
        this.a = glxVar;
        this.view = view;
        this.c = wgzVar;
        if (mmaVar != null) {
            LinkedHashMap linkedHashMap = l9j0.a;
            setTag(R.id.androidx_compose_ui_view_composition_context, mmaVar);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) this;
        a aVar = new a(viewFactoryHolder);
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        h8j0.a(this, aVar);
        r6i0.d.n(this, this);
        this.update = q.a;
        this.reset = n.a;
        this.release = m.a;
        androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
        this.modifier = aVar2;
        this.density = omd.a();
        this.C = new int[2];
        this.D = 0L;
        this.F = new p(viewFactoryHolder);
        this.G = new o(viewFactoryHolder);
        this.I = new int[2];
        this.J = Integer.MIN_VALUE;
        this.K = Integer.MIN_VALUE;
        this.L = new tlx();
        tsr tsrVar = new tsr(3);
        tsrVar.D = viewFactoryHolder;
        androidx.compose.ui.d dVarB = xa80.b(androidx.compose.ui.input.nestedscroll.a.a(aVar2, androidx.compose.ui.viewinterop.a.a, glxVar), true, h.a);
        v020 v020Var = new v020();
        v020Var.b = new y020(viewFactoryHolder);
        ma50 ma50Var = new ma50();
        ma50 ma50Var2 = v020Var.c;
        if (ma50Var2 != null) {
            ma50Var2.a = null;
        }
        v020Var.c = ma50Var;
        ma50Var.a = v020Var;
        setOnRequestDisallowInterceptTouchEvent$ui_release(ma50Var);
        androidx.compose.ui.d dVarA = v.a(androidx.compose.ui.draw.a.a(dVarB.n(v020Var), new i(viewFactoryHolder, tsrVar, viewFactoryHolder)), new j(viewFactoryHolder, tsrVar));
        tsrVar.k(this.modifier.n(dVarA));
        this.onModifierChanged = new c(tsrVar, dVarA);
        tsrVar.l0(this.density);
        this.onDensityChanged = new d(tsrVar);
        tsrVar.b0 = new e(viewFactoryHolder, tsrVar);
        tsrVar.c0 = new f(viewFactoryHolder);
        tsrVar.j(new g(viewFactoryHolder, tsrVar));
        this.layoutNode = tsrVar;
    }

    public static ymn e(ymn ymnVar, int i2, int i3, int i4, int i5) {
        int i6 = ymnVar.a - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = ymnVar.b - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = ymnVar.c - i4;
        if (i8 < 0) {
            i8 = 0;
        }
        int i9 = ymnVar.d - i5;
        return ymn.c(i6, i7, i8, i9 >= 0 ? i9 : 0);
    }

    public static int g(int i2, int i3, int i4) {
        if (i4 >= 0 || i2 == i3) {
            return View.MeasureSpec.makeMeasureSpec(kotlin.ranges.f.e(i4, i2, i3), 1073741824);
        }
        if (i4 != -2 || i3 == Integer.MAX_VALUE) {
            return (i4 != -1 || i3 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ghz getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            wkn.c("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.c.getSnapshotObserver();
    }

    @Override // defpackage.xgz
    public final boolean Z0() {
        return isAttachedToWindow();
    }

    @Override // defpackage.uga
    public final void a() {
        this.release.invoke();
    }

    @Override // defpackage.zmy
    public final l8j0 b(View view, l8j0 l8j0Var) {
        this.E = new l8j0(l8j0Var);
        return f(l8j0Var);
    }

    @Override // defpackage.uga
    public final void c() {
        this.reset.invoke();
        removeAllViewsInLayout();
    }

    public final l8j0 f(l8j0 l8j0Var) {
        l8j0.l lVar = l8j0Var.a;
        ymn ymnVarG = lVar.g(-1);
        ymn ymnVar = ymn.e;
        if (!ymnVarG.equals(ymnVar) || !lVar.h(-9).equals(ymnVar) || lVar.f() != null) {
            iln ilnVar = this.layoutNode.U.c;
            if (ilnVar.j0.C) {
                long jA = jwo.a(ilnVar.i0(0L));
                int i2 = (int) (jA >> 32);
                if (i2 < 0) {
                    i2 = 0;
                }
                int i3 = (int) (jA & 4294967295L);
                if (i3 < 0) {
                    i3 = 0;
                }
                long jA2 = eb9.c(ilnVar).a();
                int i4 = (int) (jA2 >> 32);
                int i5 = (int) (jA2 & 4294967295L);
                long j2 = ilnVar.c;
                long jA3 = jwo.a(ilnVar.i0((((long) Float.floatToRawIntBits((int) (j2 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L)));
                int i6 = i4 - ((int) (jA3 >> 32));
                if (i6 < 0) {
                    i6 = 0;
                }
                int i7 = i5 - ((int) (4294967295L & jA3));
                int i8 = i7 >= 0 ? i7 : 0;
                if (i2 != 0 || i3 != 0 || i6 != 0 || i8 != 0) {
                    return l8j0Var.a.n(i2, i3, i6, i8);
                }
            }
        }
        return l8j0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.I;
        getLocationInWindow(iArr);
        int i2 = iArr[0];
        region.op(i2, iArr[1], getWidth() + i2, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final mmd getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: getInteropView, reason: from getter */
    public final View getView() {
        return this.view;
    }

    public final tsr getLayoutNode() {
        return this.layoutNode;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final ibs getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final androidx.compose.ui.d getModifier() {
        return this.modifier;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.L.a();
    }

    public final Function1<mmd, Unit> getOnDensityChanged$ui_release() {
        return this.onDensityChanged;
    }

    public final Function1<androidx.compose.ui.d, Unit> getOnModifierChanged$ui_release() {
        return this.onModifierChanged;
    }

    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    public final Function0<Unit> getRelease() {
        return this.release;
    }

    public final Function0<Unit> getReset() {
        return this.reset;
    }

    public final nv60 getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    public final Function0<Unit> getUpdate() {
        return this.update;
    }

    public final View getView() {
        return this.view;
    }

    @Override // defpackage.rlx
    public final void h(int i2, View view) {
        tlx tlxVar = this.L;
        if (i2 == 1) {
            tlxVar.b = 0;
        } else {
            tlxVar.a = 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.M) {
            this.layoutNode.N();
            return null;
        }
        this.view.postOnAnimation(new ld0(this.G));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }

    @Override // defpackage.rlx
    public final void j(View view, View view2, int i2, int i3) {
        tlx tlxVar = this.L;
        if (i3 == 1) {
            tlxVar.b = i2;
        } else {
            tlxVar.a = i2;
        }
    }

    @Override // defpackage.rlx
    public final void k(View view, int i2, int i3, int[] iArr, int i4) {
        if (this.view.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i2 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i3 * (-1.0f))) & 4294967295L);
            int i5 = i4 == 0 ? 1 : 2;
            llx llxVar = this.a.a;
            llx llxVar2 = null;
            if (llxVar != null && llxVar.C) {
                llxVar2 = (llx) obl0.a(llxVar);
            }
            long jH0 = llxVar2 != null ? llxVar2.h0(i5, jFloatToRawIntBits) : 0L;
            iArr[0] = klx.a(Float.intBitsToFloat((int) (jH0 >> 32)));
            iArr[1] = klx.a(Float.intBitsToFloat((int) (jH0 & 4294967295L)));
        }
    }

    @Override // defpackage.uga
    public final void l() {
        View view = this.view;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.reset.invoke();
        }
    }

    @Override // defpackage.slx
    public final void o(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (this.view.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i2 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i3 * (-1.0f))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i4 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i5 * (-1.0f))) & 4294967295L);
            int i7 = i6 == 0 ? 1 : 2;
            llx llxVar = this.a.a;
            llx llxVar2 = null;
            if (llxVar != null && llxVar.C) {
                llxVar2 = (llx) obl0.a(llxVar);
            }
            llx llxVar3 = llxVar2;
            long jW0 = llxVar3 != null ? llxVar3.w0(i7, jFloatToRawIntBits, jFloatToRawIntBits2) : 0L;
            iArr[0] = klx.a(Float.intBitsToFloat((int) (jW0 >> 32)));
            iArr[1] = klx.a(Float.intBitsToFloat((int) (jW0 & 4294967295L)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.M) {
            this.layoutNode.N();
        } else {
            this.view.postOnAnimation(new ld0(this.G));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.view.layout(0, 0, i4 - i2, i5 - i3);
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        View view = this.view;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i3));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i2, i3);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.J = i2;
        this.K = i3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (!this.view.isNestedScrollingEnabled()) {
            return false;
        }
        ej5.c(this.a.c(), null, null, new k(z, this, fxh0.a(f2 * (-1.0f), f3 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        if (!this.view.isNestedScrollingEnabled()) {
            return false;
        }
        ej5.c(this.a.c(), null, null, new l(fxh0.a(f2 * (-1.0f), f3 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
    }

    @Override // defpackage.rlx
    public final void p(View view, int i2, int i3, int i4, int i5, int i6) {
        if (this.view.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i2 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i3 * (-1.0f))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i4 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i5 * (-1.0f))) & 4294967295L);
            int i7 = i6 == 0 ? 1 : 2;
            llx llxVar = this.a.a;
            llx llxVar2 = null;
            if (llxVar != null && llxVar.C) {
                llxVar2 = (llx) obl0.a(llxVar);
            }
            llx llxVar3 = llxVar2;
            if (llxVar3 != null) {
                llxVar3.w0(i7, jFloatToRawIntBits, jFloatToRawIntBits2);
            }
        }
    }

    @Override // defpackage.rlx
    public final boolean q(View view, View view2, int i2, int i3) {
        return ((i2 & 2) == 0 && (i2 & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        Function1<? super Boolean, Unit> function1 = this.onRequestDisallowInterceptTouchEvent;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(mmd mmdVar) {
        if (mmdVar != this.density) {
            this.density = mmdVar;
            Function1<? super mmd, Unit> function1 = this.onDensityChanged;
            if (function1 != null) {
                function1.invoke(mmdVar);
            }
        }
    }

    public final void setLifecycleOwner(ibs ibsVar) {
        if (ibsVar != this.lifecycleOwner) {
            this.lifecycleOwner = ibsVar;
            setTag(R.id.view_tree_lifecycle_owner, ibsVar);
        }
    }

    public final void setModifier(androidx.compose.ui.d dVar) {
        if (dVar != this.modifier) {
            this.modifier = dVar;
            Function1<? super androidx.compose.ui.d, Unit> function1 = this.onModifierChanged;
            if (function1 != null) {
                function1.invoke(dVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(Function1<? super mmd, Unit> function1) {
        this.onDensityChanged = function1;
    }

    public final void setOnModifierChanged$ui_release(Function1<? super androidx.compose.ui.d, Unit> function1) {
        this.onModifierChanged = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(Function1<? super Boolean, Unit> function1) {
        this.onRequestDisallowInterceptTouchEvent = function1;
    }

    public final void setRelease(Function0<Unit> function0) {
        this.release = function0;
    }

    public final void setReset(Function0<Unit> function0) {
        this.reset = function0;
    }

    public final void setSavedStateRegistryOwner(nv60 nv60Var) {
        if (nv60Var != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = nv60Var;
            setTag(R.id.view_tree_saved_state_registry_owner, nv60Var);
        }
    }

    public final void setUpdate(Function0<Unit> function0) {
        this.update = function0;
        this.e = true;
        this.F.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
