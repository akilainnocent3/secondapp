package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AbstractComposeView;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public interface u6i0 {
    Function0<Unit> a(AbstractComposeView abstractComposeView);

    public static final class a implements u6i0 {
        public static final a a = new a();

        /* JADX INFO: renamed from: u6i0$a$a, reason: collision with other inner class name */
        public static final class C1163a extends qlr implements Function0<Unit> {
            public final /* synthetic */ AbstractComposeView a;
            public final /* synthetic */ b b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1163a(AbstractComposeView abstractComposeView, b bVar) {
                super(0);
                this.a = abstractComposeView;
                this.b = bVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                this.a.removeOnAttachStateChangeListener(this.b);
                return Unit.a;
            }
        }

        @Override // defpackage.u6i0
        public final Function0<Unit> a(AbstractComposeView abstractComposeView) {
            b bVar = new b(abstractComposeView);
            abstractComposeView.addOnAttachStateChangeListener(bVar);
            return new C1163a(abstractComposeView, bVar);
        }

        public static final class b implements View.OnAttachStateChangeListener {
            public final /* synthetic */ AbstractComposeView a;

            public b(AbstractComposeView abstractComposeView) {
                this.a = abstractComposeView;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                this.a.e();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
            }
        }
    }

    public static final class b implements u6i0 {
        public static final b a = new b();

        public static final class a extends qlr implements Function0<Unit> {
            public final /* synthetic */ AbstractComposeView a;
            public final /* synthetic */ ViewOnAttachStateChangeListenerC1164b b;
            public final /* synthetic */ v6i0 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractComposeView abstractComposeView, ViewOnAttachStateChangeListenerC1164b viewOnAttachStateChangeListenerC1164b, v6i0 v6i0Var) {
                super(0);
                this.a = abstractComposeView;
                this.b = viewOnAttachStateChangeListenerC1164b;
                this.c = v6i0Var;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                ViewOnAttachStateChangeListenerC1164b viewOnAttachStateChangeListenerC1164b = this.b;
                AbstractComposeView abstractComposeView = this.a;
                abstractComposeView.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1164b);
                wue.c(abstractComposeView).a.remove(this.c);
                return Unit.a;
            }
        }

        @Override // defpackage.u6i0
        public final Function0<Unit> a(AbstractComposeView abstractComposeView) {
            ViewOnAttachStateChangeListenerC1164b viewOnAttachStateChangeListenerC1164b = new ViewOnAttachStateChangeListenerC1164b(abstractComposeView);
            abstractComposeView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1164b);
            v6i0 v6i0Var = new v6i0(abstractComposeView);
            wue.c(abstractComposeView).a.add(v6i0Var);
            return new a(abstractComposeView, viewOnAttachStateChangeListenerC1164b, v6i0Var);
        }

        /* JADX INFO: renamed from: u6i0$b$b, reason: collision with other inner class name */
        public static final class ViewOnAttachStateChangeListenerC1164b implements View.OnAttachStateChangeListener {
            public final /* synthetic */ AbstractComposeView a;

            public ViewOnAttachStateChangeListenerC1164b(AbstractComposeView abstractComposeView) {
                this.a = abstractComposeView;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                AbstractComposeView abstractComposeView = this.a;
                for (Object obj : fd80.c(abstractComposeView.getParent(), a8i0.a)) {
                    if (obj instanceof View) {
                        View view2 = (View) obj;
                        view2.getClass();
                        Object tag = view2.getTag(R.id.is_pooling_container_tag);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null ? bool.booleanValue() : false) {
                            return;
                        }
                    }
                }
                abstractComposeView.e();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
            }
        }
    }

    public static final class c implements u6i0 {
        public static final c a = new c();

        public static final class a extends qlr implements Function0<Unit> {
            public final /* synthetic */ AbstractComposeView a;
            public final /* synthetic */ ViewOnAttachStateChangeListenerC1165c b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractComposeView abstractComposeView, ViewOnAttachStateChangeListenerC1165c viewOnAttachStateChangeListenerC1165c) {
                super(0);
                this.a = abstractComposeView;
                this.b = viewOnAttachStateChangeListenerC1165c;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                this.a.removeOnAttachStateChangeListener(this.b);
                return Unit.a;
            }
        }

        public static final class b extends qlr implements Function0<Unit> {
            public final /* synthetic */ dq40<Function0<Unit>> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(dq40<Function0<Unit>> dq40Var) {
                super(0);
                this.a = dq40Var;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                this.a.a.invoke();
                return Unit.a;
            }
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, u6i0$c$a] */
        @Override // defpackage.u6i0
        public final Function0<Unit> a(AbstractComposeView abstractComposeView) {
            if (!abstractComposeView.isAttachedToWindow()) {
                dq40 dq40Var = new dq40();
                ViewOnAttachStateChangeListenerC1165c viewOnAttachStateChangeListenerC1165c = new ViewOnAttachStateChangeListenerC1165c(abstractComposeView, dq40Var);
                abstractComposeView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1165c);
                dq40Var.a = new a(abstractComposeView, viewOnAttachStateChangeListenerC1165c);
                return new b(dq40Var);
            }
            ibs ibsVarB = ll5.b(abstractComposeView);
            if (ibsVarB != null) {
                return y6i0.a(abstractComposeView, ibsVarB.getLifecycle());
            }
            wkn.d("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner");
            fkd.a();
            return null;
        }

        /* JADX INFO: renamed from: u6i0$c$c, reason: collision with other inner class name */
        public static final class ViewOnAttachStateChangeListenerC1165c implements View.OnAttachStateChangeListener {
            public final /* synthetic */ AbstractComposeView a;
            public final /* synthetic */ dq40<Function0<Unit>> b;

            public ViewOnAttachStateChangeListenerC1165c(AbstractComposeView abstractComposeView, dq40<Function0<Unit>> dq40Var) {
                this.a = abstractComposeView;
                this.b = dq40Var;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [T, x6i0] */
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                AbstractComposeView abstractComposeView = this.a;
                ibs ibsVarB = ll5.b(abstractComposeView);
                if (ibsVarB != null) {
                    this.b.a = y6i0.a(abstractComposeView, ibsVarB.getLifecycle());
                    abstractComposeView.removeOnAttachStateChangeListener(this);
                    return;
                }
                wkn.d("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner");
                fkd.a();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
            }
        }
    }
}
