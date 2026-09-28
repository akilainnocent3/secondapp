package com.sportybet.android.activity;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.BankVerifyNumberEditText;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.patron.BirthdayVerifyData;
import com.sportybet.android.activity.BirthVerifyActivity;
import com.sportybet.android.gp.tz.R;
import defpackage.gbn;
import defpackage.gnl;
import defpackage.sh8;
import defpackage.w8;
import defpackage.wie;
import defpackage.xib0;
import defpackage.xxz;
import defpackage.yd4;
import defpackage.yt5;
import defpackage.zd4;
import defpackage.ztc;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes5.dex */
public class BirthVerifyActivity extends gnl implements View.OnClickListener, TextView.OnEditorActionListener, BankVerifyNumberEditText.a {
    public static final /* synthetic */ int F = 0;
    public String A;
    public String B;
    public Date C;
    public Long D = 0L;
    public ProgressDialog E;
    public xxz b;
    public ConstraintLayout c;
    public Button d;
    public TextView e;
    public BankVerifyNumberEditText f;
    public ImageView i;
    public ImageView v;
    public ImageView w;
    public ImageView y;
    public ImageView z;

    public final void A1() {
        String string = this.f.getText().toString();
        boolean zIsEmpty = TextUtils.isEmpty(string);
        ImageView imageView = this.i;
        if (zIsEmpty) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        if (string.length() != 11) {
            B1(false);
        } else {
            this.c.setBackgroundResource(R.drawable.bvn_text_success_bg);
        }
    }

    public final void B1(boolean z) {
        Button button = this.d;
        if (z) {
            button.setBackgroundResource(R.drawable.bvn_btn_rect);
            this.d.setClickable(true);
        } else {
            button.setBackgroundResource(R.drawable.bvn_unverify_btn_rect);
            this.d.setClickable(false);
        }
    }

    public final void C1() {
        String cMSString = getCMSString(R.string.component_bvn__your_dob_verification_has_failed_tip, new Object[0]);
        String cMSString2 = getCMSString(R.string.common_functions__retry, new Object[0]);
        String cMSString3 = getCMSString(R.string.component_bvn__verification_failed, new Object[0]);
        wie wieVar = new wie();
        wieVar.a = cMSString;
        wieVar.c = "Cancel";
        wieVar.b = cMSString2;
        wieVar.f = false;
        wieVar.e = true;
        wieVar.w = null;
        wieVar.v = null;
        wieVar.i = true;
        wieVar.d = cMSString3;
        wieVar.z = R.color.text_type1_secondary;
        wieVar.y = R.color.brand_secondary;
        wieVar.A = R.color.text_type1_primary;
        wieVar.B = 0;
        wieVar.C = 1;
        wieVar.D = false;
        wieVar.E = true;
        wieVar.F = false;
        wieVar.show(getSupportFragmentManager(), "verify_dialog");
    }

    public final void D1() {
        String cMSString = getCMSString(R.string.component_bvn__your_dob_verification_has_failed_you_have_entered_tip, new Object[0]);
        String cMSString2 = getCMSString(R.string.common_functions__ok, new Object[0]);
        String cMSString3 = getCMSString(R.string.component_bvn__verification_failed, new Object[0]);
        wie wieVar = new wie();
        wieVar.a = cMSString;
        wieVar.c = "Cancel";
        wieVar.b = cMSString2;
        wieVar.f = false;
        wieVar.e = true;
        wieVar.w = null;
        wieVar.v = null;
        wieVar.i = true;
        wieVar.d = cMSString3;
        wieVar.z = R.color.text_type1_secondary;
        wieVar.y = R.color.brand_secondary;
        wieVar.A = R.color.text_type1_primary;
        wieVar.B = 0;
        wieVar.C = 1;
        wieVar.D = false;
        wieVar.E = true;
        wieVar.F = false;
        wieVar.show(getSupportFragmentManager(), "verify_dialog");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.verify_btn) {
            if (System.currentTimeMillis() - this.D.longValue() > 500) {
                B1(false);
                String str = !TextUtils.isEmpty(this.B) ? this.B : "";
                String string = TextUtils.isEmpty(this.f.getText().toString()) ? "" : this.f.getText().toString();
                ProgressDialog progressDialog = new ProgressDialog(this, R.style.BrandProgressDialogTheme);
                this.E = progressDialog;
                progressDialog.setMessage(getCMSString(R.string.common_functions__loading_with_dot, new Object[0]));
                this.E.setIndeterminate(true);
                this.E.setCancelable(false);
                this.E.setCanceledOnTouchOutside(false);
                this.E.show();
                this.b.h0(new BirthdayVerifyData(str, string)).G(new zd4(this, this));
            }
            this.D = Long.valueOf(System.currentTimeMillis());
            return;
        }
        if (id == R.id.dob_picker_container) {
            DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: wd4
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    int i4 = BirthVerifyActivity.F;
                    Date time = new GregorianCalendar(i, i2, i3).getTime();
                    bwf0 bwf0Var = bwf0.a;
                    String strP = bwf0Var.p(time, false);
                    BirthVerifyActivity birthVerifyActivity = this.a;
                    birthVerifyActivity.A = strP;
                    birthVerifyActivity.B = bwf0.m(bwf0Var, time, "yyyy-MM-dd", false, 0);
                    birthVerifyActivity.e.setText(birthVerifyActivity.A);
                }
            };
            Date date = this.C;
            Calendar calendarB = yt5.b(Calendar.getInstance());
            if (date != null) {
                calendarB.setTime(date);
            }
            DatePickerDialog datePickerDialogA = ztc.a(this, onDateSetListener, calendarB);
            datePickerDialogA.getDatePicker().setMaxDate(yt5.b(Calendar.getInstance()).getTimeInMillis());
            datePickerDialogA.show();
            return;
        }
        if (id == R.id.back_btn) {
            getOnBackPressedDispatcher().d();
            return;
        }
        if (id == R.id.info_btn) {
            startActivity(new Intent(this, (Class<?>) VerifyDobInfoActivity.class));
        } else if (id == R.id.bvn_edit_cleaner) {
            this.f.setText("");
            this.i.setVisibility(8);
            this.c.setBackgroundResource(R.drawable.bvn_text_success_bg);
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_verify_birth);
        if (getIntent().getIntExtra("bvn_result_code", -1) == 105) {
            D1();
        }
        this.c = (ConstraintLayout) findViewById(R.id.bvn_edittext_container);
        this.d = (Button) findViewById(R.id.verify_btn);
        this.e = (TextView) findViewById(R.id.dob_tv);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.dob_picker_container);
        ImageView imageView = (ImageView) findViewById(R.id.back_btn);
        TextView textView = (TextView) findViewById(R.id.info_btn);
        this.f = (BankVerifyNumberEditText) findViewById(R.id.bvn_edittext);
        this.i = (ImageView) findViewById(R.id.bvn_edit_cleaner);
        this.v = (ImageView) findViewById(R.id.gift_image);
        this.w = (ImageView) findViewById(R.id.top_bg);
        this.y = (ImageView) findViewById(R.id.down_bg);
        this.z = (ImageView) findViewById(R.id.light_image);
        ((TextView) findViewById(R.id.message)).setText(Html.fromHtml(getCMSString(R.string.app_common__bvn_gift_present, new Object[0])));
        this.d.setOnClickListener(this);
        constraintLayout.setOnClickListener(this);
        imageView.setOnClickListener(this);
        textView.setOnClickListener(this);
        this.f.setOnClickListener(this);
        this.i.setOnClickListener(this);
        this.v.setOnClickListener(this);
        B1(false);
        yd4 yd4Var = new yd4(this);
        this.e.addTextChangedListener(yd4Var);
        this.f.addTextChangedListener(yd4Var);
        this.f.setOnEditorActionListener(this);
        this.f.setImeListener(this);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        gbn gbnVarA = sh8.a();
        gbnVarA.d(i, this.w, xib0.IMAGE_BVN_UP);
        gbnVarA.d(i, this.y, xib0.IMAGE_BVN_DOWN);
        gbnVarA.a(xib0.IMAGE_BVN_LIGHT, this.z);
        gbnVarA.a(xib0.IMAGE_BVN_GIFT_CLOSE, this.v);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (textView.getId() != R.id.bvn_edittext) {
            return false;
        }
        A1();
        return false;
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        getAccountHelper().loadAccountInfo(new w8() { // from class: xd4
            @Override // defpackage.w8
            public final void a(AccountInfo accountInfo, String str, String str2) {
                int i = BirthVerifyActivity.F;
                BirthVerifyActivity birthVerifyActivity = this.a;
                if (birthVerifyActivity.isFinishing()) {
                    return;
                }
                if (birthVerifyActivity.getAccountHelper().getAccount() == null) {
                    birthVerifyActivity.finish();
                    return;
                }
                AccountInfo accountInfo2 = birthVerifyActivity.getAccountHelper().getAccountInfo();
                if (accountInfo2 == null || TextUtils.isEmpty(accountInfo2.getBirthday())) {
                    return;
                }
                String birthday = accountInfo2.getBirthday();
                try {
                    birthday.getClass();
                    Date dateA = pwf0.a(birthday, "yyyyMMdd", false, owf0.a);
                    birthVerifyActivity.C = dateA;
                    bwf0 bwf0Var = bwf0.a;
                    dateA.getClass();
                    birthVerifyActivity.B = bwf0.m(bwf0Var, dateA, "yyyy-MM-dd", false, 0);
                    String strP = bwf0Var.p(birthVerifyActivity.C, false);
                    birthVerifyActivity.A = strP;
                    birthVerifyActivity.e.setText(strP);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public final void z1(String str) {
        if (TextUtils.isEmpty(str)) {
            str = getCMSString(R.string.common_feedback__please_check_your_internet_connection_and_try_again, new Object[0]);
        }
        if (isFinishing()) {
            return;
        }
        b.a aVar = new b.a(this);
        AlertController.b bVar = aVar.a;
        bVar.f = str;
        bVar.k = false;
        aVar.setPositiveButton(R.string.common_functions__ok, null).f();
    }
}
