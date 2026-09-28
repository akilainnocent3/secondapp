package com.sportybet.plugin.realsports.activities;

import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.core.model.pocket.transaction.Transaction;
import com.sporty.android.core.model.realsports.SportBet;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.LoadingView;
import defpackage.ap0;
import defpackage.bag;
import defpackage.bb40;
import defpackage.bi50;
import defpackage.gv5;
import defpackage.gym;
import defpackage.iym;
import defpackage.k9j;
import defpackage.l840;
import defpackage.lop;
import defpackage.mo0;
import defpackage.pwx;
import defpackage.r5m;
import defpackage.su5;
import defpackage.tj5;
import defpackage.tqg0;
import defpackage.xpg0;
import defpackage.xym;
import defpackage.ypg0;
import java.net.ConnectException;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class TransactionSearchActivity extends r5m implements pwx, View.OnClickListener, TextWatcher, TextView.OnEditorActionListener, k9j, bb40, xym {
    public boolean A;
    public String B;
    public a C;
    public iym b;
    public ClearEditText c;
    public TextView d;
    public LoadingView e;
    public RecyclerView f;
    public ypg0 i;
    public mo0 v;
    public su5<BaseResponse<SportBet>> w;
    public List<Transaction> y;
    public String z;

    public class a implements InputFilter {
        @Override // android.text.InputFilter
        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            while (i < i2) {
                if (!Character.isLetterOrDigit(charSequence.charAt(i))) {
                    return "";
                }
                i++;
            }
            return null;
        }
    }

    public class b implements gv5<BaseResponse<SportBet>> {
        public final /* synthetic */ int a;

        public b(int i) {
            this.a = i;
        }

        @Override // defpackage.gv5
        public final void onFailure(su5<BaseResponse<SportBet>> su5Var, Throwable th) {
            if (su5Var.isCanceled()) {
                return;
            }
            TransactionSearchActivity transactionSearchActivity = TransactionSearchActivity.this;
            if (transactionSearchActivity.isFinishing()) {
                return;
            }
            boolean z = th instanceof ConnectException;
            LoadingView loadingView = transactionSearchActivity.e;
            if (z) {
                loadingView.I();
            } else {
                loadingView.J(transactionSearchActivity.getCMSString(R.string.common_feedback__something_went_wrong_tip, new Object[0]));
            }
        }

        @Override // defpackage.gv5
        public final void onResponse(su5<BaseResponse<SportBet>> su5Var, bi50<BaseResponse<SportBet>> bi50Var) {
            if (su5Var.isCanceled()) {
                return;
            }
            TransactionSearchActivity transactionSearchActivity = TransactionSearchActivity.this;
            if (transactionSearchActivity.isFinishing()) {
                return;
            }
            transactionSearchActivity.e.E();
            if (!bi50Var.a.getIsSuccessful()) {
                transactionSearchActivity.e.J(transactionSearchActivity.getCMSString(R.string.wap_search__failed, new Object[0]));
                return;
            }
            BaseResponse<SportBet> baseResponse = bi50Var.b;
            if (baseResponse == null || !baseResponse.hasData()) {
                transactionSearchActivity.e.J(transactionSearchActivity.getCMSString(R.string.wap_search__failed, new Object[0]));
                return;
            }
            List<Transaction> list = baseResponse.data.statements;
            int i = this.a;
            if (list != null && list.size() != 0) {
                transactionSearchActivity.f.setVisibility(0);
                List<Transaction> list2 = baseResponse.data.statements;
                transactionSearchActivity.y = list2;
                ypg0 ypg0Var = new ypg0(transactionSearchActivity, list2);
                transactionSearchActivity.i = ypg0Var;
                ypg0Var.i = i;
                transactionSearchActivity.f.setAdapter(ypg0Var);
                transactionSearchActivity.f.setLayoutManager(new LinearLayoutManager());
                return;
            }
            if (baseResponse.data.statements.size() != 0 || i != 0) {
                transactionSearchActivity.e.H(transactionSearchActivity.getCMSString(R.string.page_transaction__no_results_at_this_time, new Object[0]));
                return;
            }
            LoadingView loadingView = transactionSearchActivity.e;
            String cMSString = transactionSearchActivity.getCMSString(R.string.page_transaction__no_results_at_this_time, new Object[0]);
            String cMSString2 = transactionSearchActivity.getCMSString(R.string.page_transaction__search_older_histories, new Object[0]);
            loadingView.setVisibility(0);
            loadingView.G.setVisibility(8);
            loadingView.F.setVisibility(0);
            loadingView.F.a(cMSString, null, cMSString2);
            loadingView.H.setVisibility(8);
            loadingView.I.setVisibility(8);
            transactionSearchActivity.e.setTag("history");
            RecyclerView recyclerView = transactionSearchActivity.f;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        editable.toString().equals(this.B);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.B = charSequence.toString();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.cancel) {
            getOnBackPressedDispatcher().d();
        } else if (id == R.id.search_icon) {
            this.d.setVisibility(8);
            this.f.setVisibility(0);
            lop.a(this.c);
            z1(0);
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.spr_activity_transaction_search);
        if (this.v == null) {
            this.v = l840.a();
        }
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("ticketId");
            this.z = stringExtra;
            if (!TextUtils.isEmpty(stringExtra)) {
                this.A = true;
            }
            bag bagVarA = tj5.a(getIntent());
            if (bagVarA != null) {
                gym.a(this.b, new xpg0.k(bagVarA));
            }
        }
        this.C = new a();
        findViewById(R.id.cancel).setOnClickListener(this);
        findViewById(R.id.search_icon).setOnClickListener(this);
        ClearEditText clearEditText = (ClearEditText) findViewById(R.id.search_text);
        this.c = clearEditText;
        clearEditText.addTextChangedListener(this);
        this.c.setMaxLength(27);
        this.c.setErrorView((TextView) findViewById(R.id.target_hint));
        this.c.setOnEditorActionListener(this);
        this.c.setFilters(new InputFilter[]{this.C});
        this.d = (TextView) findViewById(R.id.search_hint_view);
        LoadingView loadingView = (LoadingView) findViewById(R.id.loading);
        this.e = loadingView;
        loadingView.setOnClickListener(new tqg0(this));
        this.f = (RecyclerView) findViewById(R.id.search_result_list);
        if (TextUtils.isEmpty(this.z)) {
            return;
        }
        this.c.setText(this.z);
        ClearEditText clearEditText2 = this.c;
        clearEditText2.setSelection(clearEditText2.getText().length());
        this.c.clearFocus();
        lop.a(this.c);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.c.getWindowToken(), 2);
        this.d.setVisibility(8);
        this.f.setVisibility(0);
        z1(0);
        return true;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String string = charSequence.toString();
        this.e.E();
        boolean zEndsWith = string.endsWith(this.B);
        int length = string.length();
        List<Transaction> list = this.y;
        if (length == 0) {
            if (list != null && list.size() != 0) {
                this.y.clear();
            }
            ypg0 ypg0Var = this.i;
            if (ypg0Var != null) {
                ypg0Var.notifyDataSetChanged();
            }
            this.d.setVisibility(0);
            this.f.setVisibility(8);
            return;
        }
        if (list == null || list.size() == 0 || !zEndsWith) {
            this.c.setError((String) null);
            this.f.setVisibility(8);
            this.d.setVisibility(0);
        } else {
            this.f.setVisibility(0);
            this.d.setVisibility(8);
        }
        boolean z = this.A;
        TextView textView = this.d;
        if (!z) {
            textView.setVisibility(0);
            this.f.setVisibility(8);
        } else {
            textView.setVisibility(8);
            this.f.setVisibility(0);
            z1(0);
            this.A = false;
        }
    }

    public final void z1(int i) {
        String string = this.c.getText().toString();
        if (TextUtils.isEmpty(string)) {
            this.d.setVisibility(8);
            this.c.setError(getCMSString(R.string.page_transaction__please_enter_a_ticket_id_or_trade_number, new Object[0]));
            return;
        }
        this.c.setError((String) null);
        su5<BaseResponse<SportBet>> su5Var = this.w;
        if (su5Var != null) {
            su5Var.cancel();
        }
        this.e.K();
        su5<BaseResponse<SportBet>> su5VarJ = ap0.g().J(string, i);
        this.w = su5VarJ;
        su5VarJ.G(new b(i));
    }
}
