package com.sportybet.plugin.myfavorite.activities;

import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.myfavorite.activities.MyTeamActivity;
import com.sportybet.plugin.myfavorite.fragment.MyTeamFragment;
import com.sportybet.plugin.myfavorite.fragment.MyTeamSearchFragment;
import com.sportybet.plugin.myfavorite.util.MyFavoriteTypeEnum;
import defpackage.bb40;
import defpackage.czw;
import defpackage.d2x;
import defpackage.f2x;
import defpackage.iww;
import defpackage.izw;
import defpackage.jww;
import defpackage.k9j;
import defpackage.lop;
import defpackage.oke;
import defpackage.pvw;
import defpackage.py1;
import defpackage.vym;

/* JADX INFO: loaded from: classes6.dex */
public class MyTeamActivity extends py1 implements MyTeamSearchFragment.a, View.OnClickListener, d2x.a, k9j, MyTeamFragment.a, vym, bb40 {
    public static final /* synthetic */ int v = 0;
    public MyFavoriteTypeEnum a = MyFavoriteTypeEnum.SEARCH_TEAM;
    public RelativeLayout b;
    public d2x c;
    public EditText d;
    public iww e;
    public f2x f;
    public Handler i;

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
            int length = charSequence.length();
            MyTeamActivity myTeamActivity = MyTeamActivity.this;
            if (length < 3) {
                int i4 = MyTeamActivity.v;
                iww iwwVar = myTeamActivity.e;
                if (iwwVar != null) {
                    iwwVar.B1(new pvw(null, 10));
                    return;
                }
                return;
            }
            int i5 = MyTeamActivity.v;
            pvw pvwVar = new pvw(myTeamActivity.d.getText().toString(), 4);
            iww iwwVar2 = myTeamActivity.e;
            if (iwwVar2 != null) {
                iwwVar2.B1(pvwVar);
            }
        }
    }

    public final void A1() {
        if (izw.a.a().u()) {
            this.a = MyFavoriteTypeEnum.TEAM;
            MyTeamFragment myTeamFragment = new MyTeamFragment();
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a aVarA = oke.a(supportFragmentManager, supportFragmentManager);
            aVarA.r = true;
            aVarA.f(R.id.main_frame, myTeamFragment, null);
            aVarA.d();
            B1(true);
        } else {
            this.a = MyFavoriteTypeEnum.SEARCH_TEAM;
            MyTeamSearchFragment myTeamSearchFragment = new MyTeamSearchFragment();
            FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            androidx.fragment.app.a aVarA2 = oke.a(supportFragmentManager2, supportFragmentManager2);
            aVarA2.r = true;
            aVarA2.f(R.id.main_frame, myTeamSearchFragment, null);
            aVarA2.d();
            B1(false);
        }
        this.e = jww.a(this, this.a);
    }

    public final void B1(boolean z) {
        ImageButton imageButton = (ImageButton) findViewById(R.id.search);
        this.b = (RelativeLayout) findViewById(R.id.search_layout);
        ImageView imageView = (ImageView) findViewById(R.id.clear_icon);
        this.d = (EditText) findViewById(R.id.input_search);
        imageButton.setVisibility(z ? 0 : 8);
        imageButton.setOnClickListener(this);
        imageView.setOnClickListener(this);
        this.d.addTextChangedListener(new a());
        this.d.setImeOptions(3);
        this.d.setSingleLine();
        this.d.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: g2x
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                int i2 = MyTeamActivity.v;
                if (i == 3) {
                    MyTeamActivity myTeamActivity = this.a;
                    myTeamActivity.d.clearFocus();
                    lop.a(myTeamActivity.d);
                    if (textView == null || textView.length() >= 3) {
                        myTeamActivity.i.removeCallbacks(myTeamActivity.f);
                        myTeamActivity.i.post(myTeamActivity.f);
                    } else {
                        zyf0.b(R.string.wap_search__tips_enter_3_char, 0);
                        iww iwwVar = myTeamActivity.e;
                        if (iwwVar != null) {
                            iwwVar.B1(new pvw(null, 10));
                            return false;
                        }
                    }
                }
                return false;
            }
        });
    }

    @Override // com.sportybet.plugin.myfavorite.fragment.MyTeamSearchFragment.a
    public final void U0() {
    }

    @Override // com.sportybet.plugin.myfavorite.fragment.MyTeamSearchFragment.a
    public final void Z() {
        A1();
    }

    @Override // d2x.a, com.sportybet.plugin.myfavorite.fragment.MyTeamFragment.a
    public final void b(MyFavoriteTypeEnum myFavoriteTypeEnum) {
        if (myFavoriteTypeEnum == MyFavoriteTypeEnum.ACTION_BAR_SEARCH_TEAM) {
            z1();
        } else if (this.c == null) {
            czw.a(R.string.my_favourites_settings__saved_toast);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != R.id.search) {
            if (id == R.id.clear_icon) {
                z1();
                return;
            }
            return;
        }
        this.b.setVisibility(0);
        this.d.requestFocus();
        lop.d(getContentView());
        try {
            if (this.c == null) {
                this.c = new d2x();
                if (getSupportFragmentManager() != null) {
                    FragmentManager supportFragmentManager = getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                    aVar.r = true;
                    aVar.e(R.id.main_frame, this.c, null, 1);
                    aVar.d();
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [f2x] */
    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_my_team);
        ((ImageView) findViewById(R.id.go_back)).setOnClickListener(new View.OnClickListener() { // from class: e2x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = MyTeamActivity.v;
                this.a.finish();
            }
        });
        this.f = new Runnable() { // from class: f2x
            @Override // java.lang.Runnable
            public final void run() {
                int i = MyTeamActivity.v;
                MyTeamActivity myTeamActivity = this.a;
                pvw pvwVar = new pvw(myTeamActivity.d.getText().toString(), 4);
                iww iwwVar = myTeamActivity.e;
                if (iwwVar != null) {
                    iwwVar.B1(pvwVar);
                }
            }
        };
        this.i = new Handler();
        A1();
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        this.i.removeCallbacksAndMessages(null);
        super.onDestroy();
        iww iwwVar = this.e;
        if (iwwVar != null) {
            iwwVar.y1();
        }
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        lop.a(this.d);
    }

    public final void z1() {
        lop.a(this.d);
        try {
            if (getSupportFragmentManager() != null && this.c != null) {
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.p(this.c);
                aVar.d();
                this.c = null;
            }
        } catch (Exception unused) {
        }
        this.b.setVisibility(8);
        this.d.setText("");
        iww iwwVar = this.e;
        if (iwwVar != null) {
            iwwVar.B1(new pvw(null, 10));
        }
    }
}
