package defpackage;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.core.model.appupdate.VersionAutoUpdateConfig;
import com.sporty.android.core.model.config.VersionData;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.update.data.VersionUpdateInput;

/* JADX INFO: loaded from: classes6.dex */
public class i2i0 extends g7m implements k9j, j9j {
    public ujh0 f;
    public VersionUpdateInput i;
    public b v;
    public m2i0 w;
    public yi5 y;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[VersionAutoUpdateConfig.values().length];
            a = iArr;
            try {
                iArr[VersionAutoUpdateConfig.ENABLED_MOBILE_NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[VersionAutoUpdateConfig.ENABLED_WIFI_NETWORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[VersionAutoUpdateConfig.DISABLED_MOBILE_NETWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[VersionAutoUpdateConfig.DISABLED_WIFI_NETWORK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface b {
        void a();
    }

    public static i2i0 m0(VersionUpdateInput versionUpdateInput, b bVar) {
        i2i0 i2i0Var = new i2i0();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARG_VERSION_UPDATE_INPUT", versionUpdateInput);
        i2i0Var.setArguments(bundle);
        i2i0Var.v = bVar;
        return i2i0Var;
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName */
    public final String getA() {
        return "VersionUpdateDialogFragment";
    }

    public final void n0() {
        m2i0 m2i0Var = this.w;
        boolean zIsChecked = this.f.c.isChecked();
        m2i0Var.getClass();
        ej5.c(o8i0.d(m2i0Var), null, null, new l2i0(m2i0Var, zIsChecked, null), 3);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.i = (VersionUpdateInput) requireArguments().getParcelable("ARG_VERSION_UPDATE_INPUT");
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(m2i0.class);
        String strI = dq7VarA.i();
        if (strI != null) {
            this.w = (m2i0) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        } else {
            hb5.a("Local and anonymous classes can not be ViewModels");
        }
    }

    @Override // defpackage.yq0, androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(R.layout.update_dialog_view, (ViewGroup) null, false);
        int i = R.id.auto_update_bg;
        ImageView imageView = (ImageView) h5e.a(R.id.auto_update_bg, viewInflate);
        if (imageView != null) {
            i = R.id.auto_update_checkbox;
            CheckBox checkBox = (CheckBox) h5e.a(R.id.auto_update_checkbox, viewInflate);
            if (checkBox != null) {
                i = R.id.auto_update_in_wifi_btn;
                Button button = (Button) h5e.a(R.id.auto_update_in_wifi_btn, viewInflate);
                if (button != null) {
                    i = R.id.bottom_tint;
                    TextView textView = (TextView) h5e.a(R.id.bottom_tint, viewInflate);
                    if (textView != null) {
                        i = R.id.btn_close;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.btn_close, viewInflate);
                        if (appCompatImageView != null) {
                            i = R.id.content_container;
                            ScrollView scrollView = (ScrollView) h5e.a(R.id.content_container, viewInflate);
                            if (scrollView != null) {
                                i = R.id.image_bg;
                                View viewA = h5e.a(R.id.image_bg, viewInflate);
                                if (viewA != null) {
                                    i = R.id.image_bg2;
                                    View viewA2 = h5e.a(R.id.image_bg2, viewInflate);
                                    if (viewA2 != null) {
                                        i = R.id.message;
                                        TextView textView2 = (TextView) h5e.a(R.id.message, viewInflate);
                                        if (textView2 != null) {
                                            i = R.id.skip;
                                            TextView textView3 = (TextView) h5e.a(R.id.skip, viewInflate);
                                            if (textView3 != null) {
                                                i = R.id.update_now_btn;
                                                Button button2 = (Button) h5e.a(R.id.update_now_btn, viewInflate);
                                                if (button2 != null) {
                                                    i = R.id.update_tint;
                                                    TextView textView4 = (TextView) h5e.a(R.id.update_tint, viewInflate);
                                                    if (textView4 != null) {
                                                        i = R.id.update_title;
                                                        TextView textView5 = (TextView) h5e.a(R.id.update_title, viewInflate);
                                                        if (textView5 != null) {
                                                            this.f = new ujh0((ConstraintLayout) viewInflate, imageView, checkBox, button, textView, appCompatImageView, scrollView, viewA, viewA2, textView2, textView3, button2, textView4, textView5);
                                                            androidx.appcompat.app.b.a view = new androidx.appcompat.app.b.a(requireContext()).setView(this.f.a);
                                                            view.a.k = true;
                                                            androidx.appcompat.app.b bVarCreate = view.create();
                                                            sh8.a().a(r0b.d(requireContext()) ? xib0.NEW_VERSION_DIALOG_DARK_MODE_BANNER : xib0.NEW_VERSION_DIALOG_BANNER, this.f.b);
                                                            this.f.f.setOnClickListener(new View.OnClickListener() { // from class: e2i0
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view2) {
                                                                    i2i0 i2i0Var = this.a;
                                                                    VersionUpdateInput versionUpdateInput = i2i0Var.i;
                                                                    if (!(versionUpdateInput instanceof VersionUpdateInput.DefaultContent)) {
                                                                        i2i0Var.dismissAllowingStateLoss();
                                                                        return;
                                                                    }
                                                                    i2i0Var.n0();
                                                                    m2i0 m2i0Var = i2i0Var.w;
                                                                    VersionData versionData = ((VersionUpdateInput.DefaultContent) versionUpdateInput).b;
                                                                    ed5 ed5Var = new ed5(i2i0Var, 1);
                                                                    m2i0Var.getClass();
                                                                    versionData.getClass();
                                                                    ej5.c(o8i0.d(m2i0Var), null, null, new k2i0(versionData, ed5Var, m2i0Var, null), 3);
                                                                }
                                                            });
                                                            this.f.A.setOnClickListener(new View.OnClickListener() { // from class: f2i0
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view2) {
                                                                    i2i0 i2i0Var = this.a;
                                                                    if (i2i0Var.i instanceof VersionUpdateInput.DefaultContent) {
                                                                        i2i0Var.n0();
                                                                    }
                                                                    i2i0.b bVar = i2i0Var.v;
                                                                    if (bVar != null) {
                                                                        bVar.a();
                                                                    }
                                                                    i2i0Var.dismissAllowingStateLoss();
                                                                }
                                                            });
                                                            this.f.d.setOnClickListener(new View.OnClickListener() { // from class: g2i0
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view2) {
                                                                    i2i0 i2i0Var = this.a;
                                                                    if (i2i0Var.i instanceof VersionUpdateInput.DefaultContent) {
                                                                        i2i0Var.n0();
                                                                    }
                                                                    i2i0Var.dismissAllowingStateLoss();
                                                                }
                                                            });
                                                            this.f.z.setOnClickListener(new View.OnClickListener() { // from class: h2i0
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view2) {
                                                                    i2i0 i2i0Var = this.a;
                                                                    VersionUpdateInput versionUpdateInput = i2i0Var.i;
                                                                    if (!(versionUpdateInput instanceof VersionUpdateInput.DefaultContent)) {
                                                                        i2i0Var.dismissAllowingStateLoss();
                                                                        return;
                                                                    }
                                                                    i2i0Var.n0();
                                                                    m2i0 m2i0Var = i2i0Var.w;
                                                                    VersionData versionData = ((VersionUpdateInput.DefaultContent) versionUpdateInput).b;
                                                                    cos cosVar = new cos(i2i0Var, 2);
                                                                    m2i0Var.getClass();
                                                                    versionData.getClass();
                                                                    ej5.c(o8i0.d(m2i0Var), null, null, new k2i0(versionData, cosVar, m2i0Var, null), 3);
                                                                }
                                                            });
                                                            VersionUpdateInput versionUpdateInput = this.i;
                                                            if (versionUpdateInput instanceof VersionUpdateInput.DefaultContent) {
                                                                VersionUpdateInput.DefaultContent defaultContent = (VersionUpdateInput.DefaultContent) versionUpdateInput;
                                                                this.f.y.setText(defaultContent.b.getDesc());
                                                                int i2 = a.a[defaultContent.a.ordinal()];
                                                                if (i2 == 1) {
                                                                    this.f.f.setVisibility(8);
                                                                    this.f.y.setVisibility(0);
                                                                    this.f.B.setVisibility(0);
                                                                    this.f.c.setVisibility(8);
                                                                    this.f.e.setVisibility(8);
                                                                    this.f.A.setText(sn5.d(this, R.string.app_common__wifi_auto_update_dialog_mobile_updatenow, new Object[0]));
                                                                    this.f.A.setVisibility(0);
                                                                    this.f.d.setVisibility(8);
                                                                    this.f.z.setVisibility(0);
                                                                } else if (i2 == 2) {
                                                                    ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, (int) getResources().getDimension(R.dimen.wifi_auto_update_new_des_height));
                                                                    layoutParams.t = 0;
                                                                    layoutParams.v = 0;
                                                                    layoutParams.j = this.f.C.getId();
                                                                    this.f.i.setLayoutParams(layoutParams);
                                                                    this.f.f.setVisibility(0);
                                                                    this.f.y.setVisibility(0);
                                                                    this.f.B.setVisibility(8);
                                                                    this.f.c.setVisibility(8);
                                                                    this.f.e.setVisibility(0);
                                                                    this.f.A.setVisibility(8);
                                                                    this.f.d.setVisibility(8);
                                                                    this.f.z.setVisibility(8);
                                                                } else if (i2 == 3) {
                                                                    this.f.f.setVisibility(8);
                                                                    this.f.y.setVisibility(0);
                                                                    this.f.B.setVisibility(8);
                                                                    this.f.c.setVisibility(8);
                                                                    this.f.e.setVisibility(8);
                                                                    this.f.A.setText(sn5.d(this, R.string.app_common__wifi_auto_update_dialog_mobile_updatenow, new Object[0]));
                                                                    this.f.A.setVisibility(0);
                                                                    this.f.d.setText(sn5.d(this, R.string.app_common__wifi_auto_update_dialog_wifi_update, new Object[0]));
                                                                    this.f.d.setVisibility(0);
                                                                    this.f.z.setVisibility(0);
                                                                } else if (i2 == 4) {
                                                                    this.f.f.setVisibility(8);
                                                                    this.f.y.setVisibility(0);
                                                                    this.f.B.setVisibility(8);
                                                                    this.f.c.setVisibility(0);
                                                                    this.f.e.setVisibility(8);
                                                                    this.f.A.setText(sn5.d(this, R.string.app_common__wifi_auto_update_dialog_wifi_updatennow, new Object[0]));
                                                                    this.f.A.setVisibility(0);
                                                                    this.f.d.setVisibility(8);
                                                                    this.f.z.setVisibility(0);
                                                                }
                                                                if (this.y.b().f()) {
                                                                    this.f.c.setVisibility(8);
                                                                    this.f.d.setVisibility(8);
                                                                }
                                                            } else if (versionUpdateInput instanceof VersionUpdateInput.CustomContent) {
                                                                this.f.f.setVisibility(8);
                                                                this.f.y.setText(((VersionUpdateInput.CustomContent) versionUpdateInput).a);
                                                                this.f.y.setVisibility(0);
                                                                this.f.B.setVisibility(8);
                                                                this.f.c.setVisibility(8);
                                                                this.f.e.setVisibility(8);
                                                                this.f.A.setText(sn5.d(this, R.string.app_common__update_app, new Object[0]));
                                                                this.f.A.setVisibility(0);
                                                                this.f.d.setVisibility(8);
                                                                this.f.z.setVisibility(0);
                                                            }
                                                            TextView textView6 = this.f.y;
                                                            qry.a(textView6, new d8i0(new czd(this, 1), textView6));
                                                            return bVarCreate;
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
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setLayout((int) getResources().getDimension(R.dimen.wifi_auto_update_width), -2);
        window.setGravity(17);
    }
}
