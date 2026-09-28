package com.sportybet.android.user;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sporty.android.core.model.patron.Location;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.user.ChangeLocationActivity;
import defpackage.a8b;
import defpackage.bb40;
import defpackage.bol;
import defpackage.d8l;
import defpackage.iet;
import defpackage.k9j;
import defpackage.q47;
import defpackage.su5;
import defpackage.t47;
import defpackage.w7b;
import defpackage.xxz;
import defpackage.zyf0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ChangeLocationActivity extends bol implements View.OnClickListener, k9j, bb40 {
    public static final /* synthetic */ int R = 0;
    public TextView A;
    public TextView B;
    public View C;
    public w7b D;
    public UiText E;
    public UiText F;
    public String G;
    public String I;
    public String J;
    public su5<BaseResponse<List<Location>>> N;
    public su5<BaseResponse<String>> O;
    public List<Location> P;
    public boolean Q;
    public xxz b;
    public TextView c;
    public TextView d;
    public TextView e;
    public RecyclerView f;
    public iet i;
    public d8l v;
    public SideIndexBar w;
    public TextView y;
    public LoadingViewNew z;
    public boolean H = true;
    public final ArrayList K = new ArrayList();
    public final LinkedHashMap L = new LinkedHashMap();
    public final HashMap M = new HashMap();

    public final void A1(String str) {
        Intent intent = new Intent();
        int intExtra = getIntent().getIntExtra("requestCode", 0);
        intent.putExtra("save_value", str);
        intent.putExtra("requestCode", intExtra);
        setResult(-1, intent);
        zyf0.c(1, getCMSString(R.string.common_feedback__succeeded, new Object[0]));
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.back) {
            getOnBackPressedDispatcher().d();
            return;
        }
        LinkedHashMap linkedHashMap = this.L;
        if (id == R.id.clear) {
            if (this.i == null) {
                return;
            }
            int color = this.c.getContext().getColor(R.color.text_type1_secondary);
            this.c.setTextColor(color);
            this.A.setVisibility(0);
            this.d.setTextColor(color);
            this.B.setVisibility(8);
            this.e.setVisibility(8);
            this.C.setVisibility(8);
            this.c.setText(this.E.e(this));
            this.d.setText(this.F.e(this));
            this.H = true;
            this.i.d = true;
            if (this.D.r()) {
                this.f.i(this.v);
                iet ietVar = this.i;
                ArrayList arrayList = new ArrayList(linkedHashMap.keySet());
                ArrayList arrayList2 = ietVar.b;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                this.w.setVisibility(0);
                this.i.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (id == R.id.state) {
            if ((!this.H || this.Q) && this.D.r()) {
                this.d.setTextColor(this.d.getContext().getColor(R.color.text_type1_secondary));
                if (this.Q || !this.H) {
                    this.A.setVisibility(0);
                    if (this.Q) {
                        this.B.setVisibility(8);
                    }
                } else {
                    this.A.setVisibility(8);
                }
                this.Q = false;
                this.d.setText(this.F.e(this));
                this.H = true;
                this.i.d = true;
                this.f.i(this.v);
                iet ietVar2 = this.i;
                ArrayList arrayList3 = new ArrayList(linkedHashMap.keySet());
                ArrayList arrayList4 = ietVar2.b;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                this.w.setVisibility(0);
                this.i.notifyDataSetChanged();
            }
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_change_location);
        if (getIntent() != null) {
            this.I = getIntent().getStringExtra("state");
            this.J = getIntent().getStringExtra("area");
        }
        this.D = a8b.c();
        TextView textView = (TextView) findViewById(R.id.state);
        this.c = textView;
        textView.setOnClickListener(this);
        this.d = (TextView) findViewById(R.id.area);
        this.e = (TextView) findViewById(R.id.clear);
        this.C = findViewById(R.id.header_divider_line);
        this.f = (RecyclerView) findViewById(R.id.recycler_view);
        this.w = (SideIndexBar) findViewById(R.id.side_bar);
        this.y = (TextView) findViewById(R.id.index_hint);
        LoadingViewNew loadingViewNew = (LoadingViewNew) findViewById(R.id.loading);
        this.z = loadingViewNew;
        loadingViewNew.setOnClickListener(new View.OnClickListener() { // from class: p47
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ChangeLocationActivity.R;
                ChangeLocationActivity changeLocationActivity = this.a;
                changeLocationActivity.z.d();
                su5<BaseResponse<List<Location>>> su5VarD0 = changeLocationActivity.b.d0(null);
                changeLocationActivity.N = su5VarD0;
                su5VarD0.G(new t47(changeLocationActivity));
            }
        });
        ImageView imageView = (ImageView) findViewById(R.id.user_country_icon);
        TextView textView2 = (TextView) findViewById(R.id.user_country_name);
        this.A = (TextView) findViewById(R.id.state_indicator);
        TextView textView3 = (TextView) findViewById(R.id.area_indicator);
        this.B = textView3;
        textView3.setVisibility(8);
        imageView.setImageResource(this.D.j());
        textView2.setText(this.D.b);
        this.E = this.D.p();
        this.F = this.D.c();
        this.c.setText(this.E.e(this));
        this.d.setText(this.F.e(this));
        this.d.setVisibility(this.D.r() ? 0 : 8);
        this.e.setVisibility(8);
        this.C.setVisibility(8);
        int color = this.e.getContext().getColor(R.color.brand_secondary);
        if (!TextUtils.isEmpty(this.I)) {
            this.c.setText(this.I);
            this.G = this.I;
            this.A.setVisibility(8);
            this.c.setTextColor(color);
            this.e.setVisibility(0);
            this.C.setVisibility(0);
        }
        if (!TextUtils.isEmpty(this.J)) {
            this.d.setText(this.J);
            this.d.setTextColor(color);
            this.B.setVisibility(8);
            this.H = false;
        }
        this.w.setOnChooseListener(new a(this));
        findViewById(R.id.back).setOnClickListener(this);
        this.e.setOnClickListener(this);
        findViewById(R.id.home).setOnClickListener(new q47());
        this.z.d();
        su5<BaseResponse<List<Location>>> su5VarD0 = this.b.d0(null);
        this.N = su5VarD0;
        su5VarD0.G(new t47(this));
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
