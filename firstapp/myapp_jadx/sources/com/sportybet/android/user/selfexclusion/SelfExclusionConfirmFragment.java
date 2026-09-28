package com.sportybet.android.user.selfexclusion;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.navigation.fragment.NavHostFragment;
import com.sporty.android.common_ui.widgets.CommonButton;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.user.selfexclusion.SelfExclusionConfirmFragment;
import com.sportybet.feature.facialrecognition.model.FacialRecognitionResult;
import defpackage.aa80;
import defpackage.ba80;
import defpackage.cyb;
import defpackage.dq7;
import defpackage.ee;
import defpackage.ej5;
import defpackage.hb5;
import defpackage.j7h;
import defpackage.jq40;
import defpackage.lfy;
import defpackage.n2m;
import defpackage.o8i0;
import defpackage.psm;
import defpackage.q6h;
import defpackage.r8i0;
import defpackage.s8i0;
import defpackage.sn5;
import defpackage.u6h;
import defpackage.ud;
import defpackage.uf80;
import defpackage.v8i0;
import defpackage.wie;
import defpackage.x980;
import defpackage.xxz;
import defpackage.z980;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes6.dex */
public class SelfExclusionConfirmFragment extends n2m implements View.OnClickListener, wie.a, wie.b {
    public TextView B;
    public TextView C;
    public EditText D;
    public ProgressDialog E;
    public j7h F;
    public int G;
    public long H = 0;
    public ee<u6h> I;
    public z980 J;
    public final SimpleDateFormat K;
    public final SimpleDateFormat L;
    public psm M;
    public xxz N;

    public SelfExclusionConfirmFragment() {
        Locale locale = Locale.US;
        this.K = new SimpleDateFormat("MM/dd/yyyy", locale);
        this.L = new SimpleDateFormat("dd MMM. yyyy HH:mm", locale);
    }

    @Override // wie.b
    public final void b() {
        if (!isAdded() || getView() == null) {
            return;
        }
        NavHostFragment.a.a(this).f(R.id.action_confirm_to_intro, null);
    }

    @Override // wie.a
    public final void d() {
    }

    public final void n0(String str) {
        if (TextUtils.isEmpty(str)) {
            str = sn5.d(this, R.string.common_feedback__please_check_your_internet_connection_and_try_again, new Object[0]);
        }
        if (isRemoving() || !isAdded() || getActivity() == null || getActivity().isFinishing() || getActivity().isDestroyed()) {
            return;
        }
        b.a aVar = new b.a(requireContext());
        AlertController.b bVar = aVar.a;
        bVar.f = str;
        bVar.k = false;
        aVar.setPositiveButton(R.string.common_functions__ok, null).f();
    }

    public final int o0(String str) {
        int iCurrentTimeMillis;
        try {
            long time = this.L.parse(str).getTime();
            this.H = time;
            iCurrentTimeMillis = ((int) ((time - System.currentTimeMillis()) / RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS)) + 1;
        } catch (ParseException e) {
            e.printStackTrace();
            iCurrentTimeMillis = 0;
        }
        return Math.max(iCurrentTimeMillis, 0);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.confirm_btn) {
            z980 z980Var = this.J;
            if (!z980Var.a.W() || (z980Var.c.d() instanceof z980.a.C1380a)) {
                ej5.c(o8i0.d(z980Var), null, null, new aa80(z980Var, null), 3);
                return;
            } else {
                ej5.c(o8i0.d(z980Var), null, null, new ba80(z980Var, null), 3);
                return;
            }
        }
        if (id != R.id.cancel_btn) {
            if (id == R.id.show_tint) {
                boolean zEquals = this.C.getText().toString().equals(sn5.d(this, R.string.common_functions__show, new Object[0]));
                EditText editText = this.D;
                if (zEquals) {
                    editText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    this.C.setText(sn5.d(this, R.string.common_functions__hide, new Object[0]));
                    return;
                } else {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    this.C.setText(sn5.d(this, R.string.common_functions__show, new Object[0]));
                    return;
                }
            }
            return;
        }
        String strD = sn5.d(this, R.string.self_exclusion__are_you_sure_you_want_to_cancel, new Object[0]);
        String strD2 = sn5.d(this, R.string.common_functions__u_yes, new Object[0]);
        String strD3 = sn5.d(this, R.string.common_functions__u_no, new Object[0]);
        String strD4 = sn5.d(this, R.string.common_functions__cancel, new Object[0]);
        wie wieVar = new wie();
        wieVar.a = strD;
        wieVar.c = strD3;
        wieVar.b = strD2;
        wieVar.f = true;
        wieVar.e = true;
        wieVar.w = null;
        wieVar.v = this;
        wieVar.i = true;
        wieVar.d = strD4;
        wieVar.z = R.color.text_type1_secondary;
        wieVar.y = R.color.brand_secondary;
        wieVar.A = R.color.text_type1_primary;
        wieVar.B = 1;
        wieVar.C = 1;
        wieVar.D = false;
        wieVar.E = true;
        wieVar.F = false;
        wieVar.show(requireActivity().getSupportFragmentManager(), "cancel_dialog");
    }

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(z980.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        z980 z980Var = (z980) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        this.J = z980Var;
        z980Var.d.f(this, new lfy() { // from class: v980
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                z980.a aVar = (z980.a) obj;
                if (aVar == null) {
                    return;
                }
                SelfExclusionConfirmFragment selfExclusionConfirmFragment = this.a;
                ProgressDialog progressDialog = selfExclusionConfirmFragment.E;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                if (aVar instanceof z980.a.e) {
                    selfExclusionConfirmFragment.p0();
                    return;
                }
                if (aVar instanceof z980.a.b) {
                    selfExclusionConfirmFragment.n0(selfExclusionConfirmFragment.getString(R.string.common_feedback__facial_recognition_error));
                    return;
                }
                if (!(aVar instanceof z980.a.d)) {
                    if (aVar instanceof z980.a.c) {
                        selfExclusionConfirmFragment.I.b(((z980.a.c) aVar).a);
                        return;
                    } else {
                        if (aVar instanceof z980.a.C1380a) {
                            selfExclusionConfirmFragment.p0();
                            xdp xdpVar = new xdp();
                            xdpVar.h("selfExclusionMinutes", new cep(Integer.valueOf(selfExclusionConfirmFragment.G)));
                            selfExclusionConfirmFragment.N.R(xdpVar.toString()).G(new w980(selfExclusionConfirmFragment));
                            return;
                        }
                        return;
                    }
                }
                j7h j7hVar = selfExclusionConfirmFragment.F;
                if (j7hVar == null) {
                    hf3 hf3Var = new hf3(selfExclusionConfirmFragment, 1);
                    if3 if3Var = new if3(selfExclusionConfirmFragment, 2);
                    j7h j7hVar2 = new j7h();
                    j7hVar2.a = hf3Var;
                    j7hVar2.b = if3Var;
                    selfExclusionConfirmFragment.F = j7hVar2;
                    j7hVar = j7hVar2;
                }
                j7hVar.show(selfExclusionConfirmFragment.getChildFragmentManager(), "FacialRecognitionDialogFragment");
            }
        });
        this.I = registerForActivityResult(new q6h(), new ud() { // from class: u980
            @Override // defpackage.ud
            public final void a(Object obj) {
                FacialRecognitionResult facialRecognitionResult = (FacialRecognitionResult) obj;
                SelfExclusionConfirmFragment selfExclusionConfirmFragment = this.a;
                vu90<z980.a> vu90Var = selfExclusionConfirmFragment.J.c;
                facialRecognitionResult.getClass();
                Object obj2 = FacialRecognitionResult.b.a;
                FacialRecognitionResult.b bVar = facialRecognitionResult.a;
                if (obj2 == bVar) {
                    vu90Var.m(z980.a.C1380a.a);
                } else if (FacialRecognitionResult.b.c != bVar) {
                    vu90Var.m(z980.a.b.a);
                }
                if (bVar.equals(obj2)) {
                    selfExclusionConfirmFragment.F.dismiss();
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        int i3;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_self_exclusion_confirm, viewGroup, false);
        this.B = (TextView) viewInflate.findViewById(R.id.expiry_date);
        this.C = (TextView) viewInflate.findViewById(R.id.show_tint);
        CommonButton commonButton = (CommonButton) viewInflate.findViewById(R.id.confirm_btn);
        CommonButton commonButton2 = (CommonButton) viewInflate.findViewById(R.id.cancel_btn);
        viewInflate.findViewById(R.id.password_container).setVisibility(8);
        viewInflate.findViewById(R.id.password_hint).setVisibility(8);
        this.D = (EditText) viewInflate.findViewById(R.id.pwd_edit);
        this.C.setOnClickListener(this);
        commonButton.setOnClickListener(this);
        commonButton2.setOnClickListener(this);
        TextView textView = (TextView) viewInflate.findViewById(R.id.notify_msg);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.description_msg);
        if (this.M.O()) {
            i = R.string.self_exclusion__your_self_exclusion_will_start_immediately_and_will_end_on__ZA;
            i2 = R.string.self_exclusion__once_the_self_exculsion_is_applied_you_will_be_immediately_etc__ZA;
            i3 = R.string.self_exclusion__self_exclude__ZA;
        } else {
            i = R.string.self_exclusion__your_self_exclusion_will_start_immediately_and_will_end_on;
            i2 = R.string.self_exclusion__once_the_self_exculsion_is_applied_you_will_be_immediately_etc;
            i3 = R.string.self_exclusion__self_exclude;
        }
        textView.setText(sn5.d(this, i, new Object[0]));
        textView2.setText(sn5.d(this, i2, new Object[0]));
        commonButton.setText(sn5.d(this, i3, new Object[0]));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ProgressDialog progressDialog = this.E;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.E = null;
        super.onDestroyView();
    }

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.H == 0 || this.B == null) {
            return;
        }
        TimeZone timeZone = new GregorianCalendar().getTimeZone();
        Date date = new Date(this.H);
        SimpleDateFormat simpleDateFormat = this.L;
        simpleDateFormat.setTimeZone(timeZone);
        this.B.setText(Html.fromHtml(sn5.d(this, R.string.self_exclusion__format, simpleDateFormat.format(date), q0(date))));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Spanned spannedFromHtml;
        String str = x980.fromBundle(getArguments()).a;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        SimpleDateFormat simpleDateFormat = this.L;
        if (zIsEmpty) {
            int i = x980.fromBundle(getArguments()).b;
            TextView textView = this.B;
            Calendar calendar = Calendar.getInstance();
            calendar.add(5, i);
            String str2 = "<b>" + simpleDateFormat.format(calendar.getTime()) + "</b> ";
            this.G = o0(simpleDateFormat.format(calendar.getTime()));
            textView.setText(Html.fromHtml(str2.concat(q0(calendar.getTime()))));
        } else {
            TextView textView2 = this.B;
            Calendar calendar2 = Calendar.getInstance();
            int i2 = calendar2.get(11);
            int i3 = calendar2.get(12);
            try {
                calendar2.setTime(this.K.parse(str));
                calendar2.set(11, i2);
                calendar2.set(12, i3);
                String str3 = "<b>" + simpleDateFormat.format(calendar2.getTime()) + "</b> ";
                this.G = o0(simpleDateFormat.format(calendar2.getTime()));
                spannedFromHtml = Html.fromHtml(str3.concat(q0(calendar2.getTime())));
            } catch (Exception e) {
                e.printStackTrace();
                spannedFromHtml = null;
            }
            textView2.setText(spannedFromHtml);
        }
        super.onViewCreated(view, bundle);
    }

    public final void p0() {
        if (this.E == null) {
            ProgressDialog progressDialog = new ProgressDialog(getContext(), R.style.BrandProgressDialogTheme);
            this.E = progressDialog;
            progressDialog.setMessage(sn5.d(this, R.string.common_functions__loading_with_dot, new Object[0]));
            this.E.setIndeterminate(true);
            this.E.setCancelable(false);
            this.E.setCanceledOnTouchOutside(false);
        }
        this.E.show();
    }

    public final String q0(Date date) {
        TimeZone timeZone = new GregorianCalendar().getTimeZone();
        int rawOffset = timeZone.getRawOffset() + (timeZone.inDaylightTime(date) ? timeZone.getDSTSavings() : 0);
        return sn5.d(this, R.string.self_exclusion__time_zone_format, uf80.a(new StringBuilder("GMT "), rawOffset >= 0 ? "+" : "-", String.format(Locale.US, "%02d:%02d", Integer.valueOf(Math.abs(rawOffset / 3600000)), Integer.valueOf(Math.abs((rawOffset / 60000) % 60)))));
    }
}
