package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.sporty.android.core.model.config.VersionData;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ljti;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jti extends crl implements View.OnClickListener {
    public static final /* synthetic */ ohp<Object>[] z = {new d630(0, jti.class, "binding", "getBinding()Lcom/sportybet/android/databinding/FragmentForceUpdateBinding;")};
    public kkh0 f;
    public yi5 i;
    public VersionData v;
    public final q8i0 w;
    public final i6i0 y;

    public static final /* synthetic */ class a extends saj implements Function1<View, tvi> {
        public static final a a = new a(1, tvi.class, "bind", "bind(Landroid/view/View;)Lcom/sportybet/android/databinding/FragmentForceUpdateBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final tvi invoke(View view) {
            View view2 = view;
            view2.getClass();
            int i = R.id.content_container;
            if (((ScrollView) h5e.a(R.id.content_container, view2)) != null) {
                i = R.id.download_progress_bar;
                ProgressBar progressBar = (ProgressBar) h5e.a(R.id.download_progress_bar, view2);
                if (progressBar != null) {
                    i = R.id.force_update_bg;
                    ImageView imageView = (ImageView) h5e.a(R.id.force_update_bg, view2);
                    if (imageView != null) {
                        i = R.id.force_update_btn;
                        Button button = (Button) h5e.a(R.id.force_update_btn, view2);
                        if (button != null) {
                            i = R.id.message;
                            TextView textView = (TextView) h5e.a(R.id.message, view2);
                            if (textView != null) {
                                i = R.id.progress_bar_containeer;
                                ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.progress_bar_containeer, view2);
                                if (constraintLayout != null) {
                                    i = R.id.progress_text;
                                    if (((AppCompatTextView) h5e.a(R.id.progress_text, view2)) != null) {
                                        i = R.id.tv_download_error;
                                        TextView textView2 = (TextView) h5e.a(R.id.tv_download_error, view2);
                                        if (textView2 != null) {
                                            i = R.id.tv_progress;
                                            TextView textView3 = (TextView) h5e.a(R.id.tv_progress, view2);
                                            if (textView3 != null) {
                                                i = R.id.tv_version;
                                                TextView textView4 = (TextView) h5e.a(R.id.tv_version, view2);
                                                if (textView4 != null) {
                                                    i = R.id.update_title;
                                                    if (((TextView) h5e.a(R.id.update_title, view2)) != null) {
                                                        return new tvi((ConstraintLayout) view2, progressBar, imageView, button, textView, constraintLayout, textView2, textView3, textView4);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            bmy.a("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
            return null;
        }
    }

    public static final class b extends qlr implements Function0<Fragment> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return jti.this;
        }
    }

    public static final class c extends qlr implements Function0<w8i0> {
        public final /* synthetic */ b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class d extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    public static final class f extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? jti.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public jti() {
        ttr ttrVarA = hwr.a(a1s.c, new c(new b()));
        this.w = new q8i0(jq40.a(y1i0.class), new d(ttrVarA), new f(ttrVarA), new e(ttrVarA));
        this.y = g5e.a(a.a);
    }

    public final tvi m0() {
        return (tvi) this.y.a(this, z[0]);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (Intrinsics.g(view, m0().d)) {
            m0().i.setVisibility(8);
            yi5 yi5Var = this.i;
            if (yi5Var == null) {
                Intrinsics.n("buildConfiguration");
                throw null;
            }
            if (!yi5Var.b().f()) {
                view.setVisibility(4);
                m0().f.setVisibility(0);
            }
            y1i0 y1i0Var = (y1i0) this.w.getValue();
            VersionData versionData = this.v;
            if (versionData != null) {
                ej5.c(o8i0.d(y1i0Var), null, null, new z1i0(y1i0Var, versionData, null), 3);
            } else {
                Intrinsics.n("versionData");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        Bundle bundleRequireArguments = requireArguments();
        bundleRequireArguments.getClass();
        VersionData versionData = (VersionData) sj5.a(bundleRequireArguments, "arg_version_data", VersionData.class);
        if (versionData == null || !versionData.hasNewVersionRequired("1.82.2")) {
            androidx.fragment.app.e activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        this.v = versionData;
        TextView textView = m0().e;
        VersionData versionData2 = this.v;
        if (versionData2 == null) {
            Intrinsics.n("versionData");
            throw null;
        }
        textView.setText(versionData2.getDesc());
        m0().d.setOnClickListener(this);
        sh8.a().a(sn5.d(this, R.string.app_common__force_update_bg, new Object[0]), m0().c);
        TextView textView2 = m0().w;
        VersionData versionData3 = this.v;
        if (versionData3 == null) {
            Intrinsics.n("versionData");
            throw null;
        }
        textView2.setText(sn5.c(textView2, R.string.common_helps__version, versionData3.getVersion()));
        y1i0 y1i0Var = (y1i0) this.w.getValue();
        kkh0 kkh0Var = this.f;
        if (kkh0Var == null) {
            Intrinsics.n("updateNavigator");
            throw null;
        }
        y1i0Var.y1(kkh0Var);
        s9s.b bVar = s9s.b.a;
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new kti(this, null, this), 3);
    }
}
