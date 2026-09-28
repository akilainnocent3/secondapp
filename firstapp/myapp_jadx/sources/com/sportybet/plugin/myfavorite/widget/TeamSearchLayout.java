package com.sportybet.plugin.myfavorite.widget;

import android.content.Context;
import android.os.Handler;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.myfavorite.fragment.MyTeamSearchFragment;
import com.sportybet.plugin.myfavorite.widget.TeamSearchLayout;
import defpackage.a9f0;
import defpackage.pvw;

/* JADX INFO: loaded from: classes6.dex */
public class TeamSearchLayout extends LinearLayout implements View.OnClickListener {
    public static final /* synthetic */ int f = 0;
    public EditText a;
    public ImageView b;
    public b c;
    public a9f0 d;
    public Handler e;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            TeamSearchLayout teamSearchLayout = TeamSearchLayout.this;
            teamSearchLayout.b.setVisibility(TextUtils.isEmpty(teamSearchLayout.a.getText()) ? 8 : 0);
            if (charSequence.length() < 3) {
                teamSearchLayout.a(charSequence.toString());
            } else {
                teamSearchLayout.e.removeCallbacks(teamSearchLayout.d);
                teamSearchLayout.e.postDelayed(teamSearchLayout.d, 1000L);
            }
        }
    }

    public interface b {
    }

    public TeamSearchLayout(Context context) {
        super(context);
    }

    private void setMaxLength(int i) {
        this.a.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    public final void a(String str) {
        b bVar = this.c;
        if (bVar != null) {
            MyTeamSearchFragment myTeamSearchFragment = (MyTeamSearchFragment) bVar;
            if (TextUtils.isEmpty(str) || str.length() < 3) {
                myTeamSearchFragment.n0();
            } else {
                myTeamSearchFragment.B.B1(new pvw(str, 4));
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.clear_icon) {
            this.a.setText("");
            this.b.setVisibility(8);
            b bVar = this.c;
            if (bVar != null) {
                ((MyTeamSearchFragment) bVar).n0();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.e.removeCallbacksAndMessages(null);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [a9f0] */
    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (EditText) findViewById(R.id.search);
        ImageView imageView = (ImageView) findViewById(R.id.clear_icon);
        this.b = imageView;
        imageView.setOnClickListener(this);
        this.d = new Runnable() { // from class: a9f0
            @Override // java.lang.Runnable
            public final void run() {
                int i = TeamSearchLayout.f;
                TeamSearchLayout teamSearchLayout = this.a;
                teamSearchLayout.a(teamSearchLayout.a.getText().toString());
            }
        };
        this.e = new Handler();
        this.a.addTextChangedListener(new a());
        this.a.setImeOptions(3);
        this.a.setSingleLine();
        setMaxLength(27);
        this.a.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: b9f0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                int i2 = TeamSearchLayout.f;
                if (i == 3) {
                    if (textView != null && textView.length() < 3) {
                        zyf0.b(R.string.wap_search__tips_enter_3_char, 0);
                    }
                    TeamSearchLayout teamSearchLayout = this.a;
                    teamSearchLayout.a.clearFocus();
                    ((InputMethodManager) teamSearchLayout.a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(teamSearchLayout.a.getWindowToken(), 2);
                    teamSearchLayout.e.removeCallbacks(teamSearchLayout.d);
                    teamSearchLayout.e.post(teamSearchLayout.d);
                }
                return false;
            }
        });
        this.a.requestFocus();
    }

    public void setCallBackListener(b bVar) {
        this.c = bVar;
    }

    public TeamSearchLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TeamSearchLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
