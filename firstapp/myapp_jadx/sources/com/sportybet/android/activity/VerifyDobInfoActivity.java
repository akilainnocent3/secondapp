package com.sportybet.android.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import defpackage.j7g;
import defpackage.py1;
import defpackage.zch0;
import defpackage.zzh0;

/* JADX INFO: loaded from: classes5.dex */
public class VerifyDobInfoActivity extends py1 implements View.OnClickListener {
    public static final /* synthetic */ int a = 0;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.back_btn) {
            getOnBackPressedDispatcher().d();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_verify_dob_info);
        TextView textView = (TextView) findViewById(R.id.avdi_tv_info1);
        TextView textView2 = (TextView) findViewById(R.id.avdi_tv_info2);
        TextView textView3 = (TextView) findViewById(R.id.avdi_tv_info3);
        textView.setText(getCMSString(R.string.component_bvn__dob_info_content_1, new Object[0]));
        j7g j7gVar = new j7g();
        j7gVar.m(new String[]{getCMSString(R.string.component_bvn__dob_info_content_2, new Object[0])}, new boolean[]{false}, zch0.b(getResources(), getResources().getInteger(R.integer.bvn_indent_text_margin)));
        j7gVar.m(new String[]{getCMSString(R.string.component_bvn__dob_info_content_3, new Object[0])}, new boolean[]{false}, zch0.b(getResources(), getResources().getInteger(R.integer.bvn_indent_text_margin)));
        textView2.setText(j7gVar);
        textView3.setText(getCMSString(R.string.component_bvn__dob_info_content_4, new Object[0]));
        ((ImageView) findViewById(R.id.back_btn)).setOnClickListener(this);
        findViewById(R.id.home).setOnClickListener(new zzh0());
    }
}
