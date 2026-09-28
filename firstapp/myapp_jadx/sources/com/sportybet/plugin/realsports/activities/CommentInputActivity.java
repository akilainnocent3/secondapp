package com.sportybet.plugin.realsports.activities;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.PostCommentData;
import defpackage.bi50;
import defpackage.fte;
import defpackage.g9i0;
import defpackage.gr0;
import defpackage.hp0;
import defpackage.la20;
import defpackage.lop;
import defpackage.py1;
import defpackage.qag;
import defpackage.r6i0;
import defpackage.t8d0;
import defpackage.uuw;
import defpackage.va0;
import defpackage.vym;
import defpackage.wm70;
import defpackage.zyf0;
import java.net.ConnectException;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class CommentInputActivity extends py1 implements vym, View.OnClickListener, TextWatcher {
    public static final /* synthetic */ int v = 0;
    public AppCompatEditText a;
    public TextView b;
    public TextView c;
    public ProgressBar d;
    public String e;
    public String f;
    public int i;

    public class a extends fte<bi50<Void>> {
        public a() {
        }

        @Override // defpackage.zu90
        public final void onError(Throwable th) {
            CommentInputActivity commentInputActivity = CommentInputActivity.this;
            if (commentInputActivity.isFinishing()) {
                return;
            }
            int i = CommentInputActivity.v;
            commentInputActivity.z1(false);
            if (th instanceof ConnectException) {
                zyf0.a(R.string.common_feedback__please_check_your_internet_connection_and_try_again);
            } else {
                zyf0.b(R.string.common_feedback__failed_to_send_please_try_again, 0);
            }
        }

        @Override // defpackage.zu90
        public final void onSuccess(Object obj) {
            bi50 bi50Var = (bi50) obj;
            CommentInputActivity commentInputActivity = CommentInputActivity.this;
            if (commentInputActivity.isFinishing()) {
                return;
            }
            int i = CommentInputActivity.v;
            commentInputActivity.z1(false);
            if (!bi50Var.a.getIsSuccessful()) {
                zyf0.b(R.string.common_feedback__sorry_something_went_wrong, 0);
                return;
            }
            zyf0.c(1, commentInputActivity.getCMSString(R.string.common_feedback__sent_successfully, new Object[0]));
            Intent intent = new Intent();
            intent.putExtra("key_send_succeed", true);
            commentInputActivity.setResult(-1, intent);
            AppCompatEditText appCompatEditText = commentInputActivity.a;
            appCompatEditText.getClass();
            lop.b(appCompatEditText, null);
            commentInputActivity.finish();
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.a == null || editable == null) {
            return;
        }
        int length = editable.toString().length();
        this.c.setEnabled(length > 0);
        TextView textView = this.c;
        Drawable drawableA = gr0.a(this, length > 0 ? R.drawable.bg_fiilled_brand_secondary_3_radius : R.drawable.spr_shape_bg_send);
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        textView.setBackground(drawableA);
        TextView textView2 = this.b;
        if (length > 260) {
            textView2.setText(editable.toString().length() + "/280");
        } else {
            textView2.setText("");
        }
        if (editable.toString().length() > 280) {
            this.a.setText(editable.toString().substring(0, 280));
            this.a.setSelection(280);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.spr_push_bottom_in, R.anim.spr_push_bottom_out);
    }

    @Override // defpackage.r1k
    public final boolean onBackPressedCompat() {
        if (this.d.isShown()) {
            return true;
        }
        lop.a(this.a);
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != R.id.send_btn) {
            if (id == R.id.blank_area) {
                lop.a(this.a);
                finish();
                return;
            }
            return;
        }
        String string = this.a.getText().toString();
        if (TextUtils.isEmpty(string.trim())) {
            zyf0.c(1, getCMSString(R.string.common_feedback__please_write_a_comment, new Object[0]));
            return;
        }
        z1(true);
        t8d0 t8d0VarG0 = uuw.b;
        if (t8d0VarG0 == null) {
            t8d0VarG0 = ((la20) qag.a(hp0.A, la20.class)).g0();
            uuw.b = t8d0VarG0;
        }
        t8d0VarG0.c(new PostCommentData(string, Integer.valueOf(this.i), this.f, "", "PRE_MATCH")).d(wm70.c).b(va0.a()).a(new a());
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.spr_activity_comment_input);
        this.i = getIntent().getIntExtra("key_comment_id", 0);
        this.f = getIntent().getStringExtra("key_event_id");
        this.e = getIntent().getStringExtra("to_reply_name");
        overridePendingTransition(R.anim.spr_push_bottom_in, R.anim.spr_push_bottom_out);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        this.d = progressBar;
        progressBar.getIndeterminateDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        findViewById(R.id.blank_area).setOnClickListener(this);
        AppCompatEditText appCompatEditText = (AppCompatEditText) findViewById(R.id.input_comment);
        this.a = appCompatEditText;
        appCompatEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(280)});
        this.a.addTextChangedListener(this);
        this.b = (TextView) findViewById(R.id.input_count);
        TextView textView = (TextView) findViewById(R.id.send_btn);
        this.c = textView;
        textView.setOnClickListener(this);
        if (TextUtils.isEmpty(this.e)) {
            return;
        }
        this.a.setHint(getCMSString(R.string.live__reply_nickname_prefix_to, this.e));
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        lop.a(this.a);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void z1(boolean z) {
        ProgressBar progressBar = this.d;
        if (z) {
            progressBar.setVisibility(0);
            this.c.setText("");
            this.c.setEnabled(false);
        } else {
            progressBar.setVisibility(8);
            this.c.setText(getCMSString(R.string.common_functions__send, new Object[0]));
            this.c.setEnabled(true);
        }
    }
}
