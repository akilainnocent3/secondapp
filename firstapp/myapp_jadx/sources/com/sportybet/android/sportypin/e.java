package com.sportybet.android.sportypin;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.sportypin.e;
import defpackage.r02;
import defpackage.sn5;

/* JADX INFO: loaded from: classes6.dex */
public class e extends r02 {
    public String a;
    public String b;
    public String c;
    public a d;
    public Context e;

    public interface a {
        void a();

        void onDismiss();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.e = context;
        setCancelable(false);
    }

    @Override // defpackage.yq0, androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(this.e);
        aVar.e(R.layout.dialog_basic_info);
        aVar.a.k = false;
        androidx.appcompat.app.b bVarCreate = aVar.create();
        bVarCreate.show();
        TextView textView = (TextView) bVarCreate.findViewById(R.id.dbi_tv_title);
        TextView textView2 = (TextView) bVarCreate.findViewById(R.id.dbi_tv_info);
        TextView textView3 = (TextView) bVarCreate.findViewById(R.id.dbi_tv_conform);
        TextView textView4 = (TextView) bVarCreate.findViewById(R.id.dbi_tv_cancel);
        if (this.b == null || TextUtils.isEmpty(this.c) || !this.b.contains(this.c)) {
            textView2.setText(this.b);
        } else {
            int iIndexOf = this.b.indexOf(this.c);
            SpannableString spannableString = new SpannableString(this.b);
            spannableString.setSpan(new d(this), iIndexOf, this.c.length() + iIndexOf, 17);
            textView2.setText(spannableString);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            textView2.setHighlightColor(0);
        }
        textView.setText(this.a);
        textView.setVisibility(TextUtils.isEmpty(this.a) ? 8 : 0);
        textView4.setVisibility(8);
        textView3.setText(sn5.d(this, R.string.common_functions__ok, new Object[0]));
        textView3.setTypeface(null, 0);
        textView3.setOnClickListener(new View.OnClickListener() { // from class: tfs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e eVar = this.a;
                e.a aVar2 = eVar.d;
                if (aVar2 != null) {
                    aVar2.onDismiss();
                }
                eVar.dismiss();
            }
        });
        return bVarCreate;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.e = null;
    }
}
