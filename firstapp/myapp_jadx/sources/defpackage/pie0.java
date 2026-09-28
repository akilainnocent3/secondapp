package defpackage;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.sportybet.android.gp.tz.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpie0;", "Lr02;", "<init>", "()V", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class pie0 extends v4m {
    public oje0 f;
    public pui i;

    @c0d(c = "com.sporty.android.common.survey.SurveyDialogFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", f = "SurveyDialogFragment.kt", l = {32}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ pie0 b;
        public final /* synthetic */ pie0 c;

        /* JADX INFO: renamed from: pie0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.common.survey.SurveyDialogFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", f = "SurveyDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0972a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ pie0 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0972a(v1b v1bVar, pie0 pie0Var) {
                super(2, v1bVar);
                this.b = pie0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0972a c0972a = new C0972a(v1bVar, this.b);
                c0972a.a = obj;
                return c0972a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0972a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                v5b v5bVar = (v5b) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                ej5.c(v5bVar, null, null, new oie0(null, this.b), 3);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pie0 pie0Var, v1b v1bVar, pie0 pie0Var2) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = pie0Var;
            this.c = pie0Var2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s9s.b bVar = s9s.b.a;
            return new a(this.b, v1bVar, this.c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                s9s lifecycle = this.b.getViewLifecycleOwner().getLifecycle();
                s9s.b bVar = s9s.b.d;
                C0972a c0972a = new C0972a(null, this.c);
                this.a = 1;
                if (m850.a(lifecycle, bVar, c0972a, this) == y5bVar) {
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

    @Override // androidx.fragment.app.d
    public final int getTheme() {
        return R.style.MatchParentDialog;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.style.FullScreenDialogStyle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        WebView webView;
        Window window;
        layoutInflater.getClass();
        View viewInflate = getLayoutInflater().inflate(R.layout.frag_survey, viewGroup, false);
        if (viewInflate == null) {
            bmy.a("rootView");
            return null;
        }
        this.i = new pui((FrameLayout) viewInflate);
        try {
            Dialog dialog = getDialog();
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.setLayout(-1, -1);
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            oje0 oje0Var = this.f;
            if (oje0Var == null) {
                Intrinsics.n("surveyWebViewManager");
                throw null;
            }
            WeakReference<WebView> weakReference = oje0Var.g;
            if (weakReference == null || (webView = weakReference.get()) == null) {
                dismiss();
            } else {
                pui puiVar = this.i;
                if (puiVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                puiVar.a.addView(webView);
                oje0 oje0Var2 = this.f;
                if (oje0Var2 == null) {
                    Intrinsics.n("surveyWebViewManager");
                    throw null;
                }
                WeakReference<WebView> weakReference2 = oje0Var2.g;
                if (weakReference2 != null) {
                    weakReference2.clear();
                }
                oje0Var2.g = null;
            }
            pui puiVar2 = this.i;
            if (puiVar2 != null) {
                return puiVar2.a;
            }
            Intrinsics.n("binding");
            throw null;
        } catch (Throwable th) {
            itf0.a.d(a320.a("Error setting dialog background: ", th), new Object[0]);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        pui puiVar = this.i;
        if (puiVar != null) {
            puiVar.a.removeAllViews();
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        view.getClass();
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        z7j0.a(window, false);
        nie0 nie0Var = new nie0();
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        r6i0.d.n(view, nie0Var);
        s9s.b bVar = s9s.b.a;
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new a(this, null, this), 3);
    }
}
