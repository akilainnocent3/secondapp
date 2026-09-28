package defpackage;

import android.app.Activity;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final class hsx implements View.OnClickListener, TextView.OnEditorActionListener {
    public final Activity a;
    public final xxz b;
    public final TextView c;
    public final TextView d;
    public final androidx.appcompat.app.b e;
    public final ProgressBar f;
    public final EditText i;
    public su5<BaseResponse<String>> v;
    public final View w;
    public c y;
    public final AccountHelperEntryPointImpl z;

    public class a implements InputFilter {
        @Override // android.text.InputFilter
        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            StringBuilder sb = new StringBuilder();
            while (i < i2) {
                char cCharAt = charSequence.charAt(i);
                if (!Character.isWhitespace(cCharAt)) {
                    sb.append(cCharAt);
                }
                i++;
            }
            return sb.toString();
        }
    }

    public class b implements gv5<BaseResponse<String>> {
        public final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        @Override // defpackage.gv5
        public final void onFailure(su5<BaseResponse<String>> su5Var, Throwable th) {
            hsx hsxVar = hsx.this;
            hsxVar.c.setVisibility(0);
            hsxVar.f.setVisibility(8);
        }

        @Override // defpackage.gv5
        public final void onResponse(su5<BaseResponse<String>> su5Var, bi50<BaseResponse<String>> bi50Var) {
            BaseResponse<String> baseResponse;
            hsx hsxVar = hsx.this;
            Activity activity = hsxVar.a;
            hsxVar.c.setVisibility(0);
            hsxVar.f.setVisibility(8);
            if (!bi50Var.a.getIsSuccessful() || (baseResponse = bi50Var.b) == null) {
                return;
            }
            int i = baseResponse.bizCode;
            if (i != 10000) {
                if (i != 11011) {
                    zyf0.c(0, sn5.b(activity, R.string.common_info_setting__failed_to_save_username, new Object[0]));
                    return;
                } else {
                    hsxVar.d.setText(sn5.b(activity, R.string.common_info_setting__username_was_taken, new Object[0]));
                    return;
                }
            }
            hsxVar.z.getAccountHelper().saveNickName(this.a);
            zyf0.c(0, sn5.b(activity, R.string.common_info_setting__username_saved, new Object[0]));
            hsxVar.i.setText("");
            hsxVar.e.dismiss();
        }
    }

    public interface c {
        void onDismiss();
    }

    public hsx(Activity activity, xxz xxzVar) {
        InputFilter[] inputFilterArr = {new a(), new InputFilter.LengthFilter(15)};
        this.z = new AccountHelperEntryPointImpl();
        this.a = activity;
        this.b = xxzVar;
        this.w = LayoutInflater.from(activity).inflate(R.layout.spr_nickname_dialog, (ViewGroup) null);
        androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(activity);
        TextView textView = (TextView) this.w.findViewById(R.id.save_btn);
        this.c = textView;
        textView.setOnClickListener(this);
        this.w.findViewById(R.id.cancel_btn).setOnClickListener(this);
        this.d = (TextView) this.w.findViewById(R.id.hint_tv);
        this.f = (ProgressBar) this.w.findViewById(R.id.progress_bar);
        EditText editText = (EditText) this.w.findViewById(R.id.set_nick_edit);
        this.i = editText;
        editText.setOnClickListener(this);
        this.i.setOnEditorActionListener(this);
        this.i.setFilters(inputFilterArr);
        this.i.setInputType(96);
        this.i.setText("");
        androidx.appcompat.app.b bVarCreate = aVar.create();
        this.e = bVarCreate;
        bVarCreate.setCanceledOnTouchOutside(true);
        this.e.setCancelable(true);
        this.e.setOnCancelListener(new isx(this));
        this.e.setOnDismissListener(new jsx(this));
    }

    public final void a() {
        EditText editText = this.i;
        lop.a(editText);
        String string = editText.getText().toString();
        if (TextUtils.isEmpty(string)) {
            zyf0.c(0, sn5.b(this.a, R.string.common_info_setting__please_enter_a_username, new Object[0]));
            return;
        }
        su5<BaseResponse<String>> su5Var = this.v;
        if (su5Var != null) {
            su5Var.cancel();
        }
        this.c.setVisibility(8);
        this.f.setVisibility(0);
        su5<BaseResponse<String>> su5VarD1 = this.b.d1(string);
        this.v = su5VarD1;
        su5VarD1.G(new b(string));
    }

    public final void b() {
        Activity activity = this.a;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        androidx.appcompat.app.b bVar = this.e;
        bVar.show();
        EditText editText = this.i;
        lop.d(editText);
        Window window = bVar.getWindow();
        if (window != null) {
            window.clearFlags(131072);
            window.setContentView(this.w);
        } else {
            lop.a(editText);
            bVar.dismiss();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.save_btn) {
            a();
        } else if (id == R.id.cancel_btn) {
            this.e.dismiss();
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        a();
        lop.a(this.i);
        return true;
    }
}
