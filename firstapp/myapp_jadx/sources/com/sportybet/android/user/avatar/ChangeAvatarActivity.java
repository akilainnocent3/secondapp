package com.sportybet.android.user.avatar;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.core.model.config.bo.BOConfigParamDto;
import com.sporty.android.core.model.config.bo.enums.BOConfigAppId;
import com.sporty.android.core.model.config.bo.enums.BOConfigNamespace;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.user.LoadingView;
import com.sportybet.android.user.avatar.ChangeAvatarActivity;
import com.sportybet.android.user.avatar.a;
import com.sportybet.android.user.avatar.e;
import com.sportybet.android.user.avatar.f;
import com.sportybet.android.widget.ProgressButton;
import defpackage.bb40;
import defpackage.bm50;
import defpackage.bnh0;
import defpackage.cyb;
import defpackage.dq7;
import defpackage.g1i;
import defpackage.g47;
import defpackage.h47;
import defpackage.hb5;
import defpackage.i47;
import defpackage.jq40;
import defpackage.k47;
import defpackage.k9j;
import defpackage.kzh;
import defpackage.l47;
import defpackage.lfy;
import defpackage.lyh;
import defpackage.lyz;
import defpackage.n1i;
import defpackage.o8i0;
import defpackage.op8;
import defpackage.r8i0;
import defpackage.s8i0;
import defpackage.u6i0;
import defpackage.uqm;
import defpackage.v340;
import defpackage.v8i0;
import defpackage.vym;
import defpackage.xzh;
import defpackage.y37;
import defpackage.yzh;
import defpackage.znl;
import defpackage.zyf0;
import java.net.ConnectException;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public class ChangeAvatarActivity extends znl implements View.OnClickListener, vym, k9j, bb40 {
    public static final /* synthetic */ int i = 0;
    public a b;
    public LoadingView c;
    public ProgressButton d;
    public e e;
    public uqm f;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        lyh lyhVarC0;
        if (view.getId() == R.id.goback) {
            finish();
            return;
        }
        if (view.getId() == R.id.save_btn) {
            String str = this.b.a;
            if (TextUtils.isEmpty(str)) {
                zyf0.c(0, getCMSString(R.string.common_feedback__something_went_wrong_please_try_again_later_thank_you, new Object[0]));
                finish();
                return;
            }
            e eVar = this.e;
            eVar.getClass();
            bnh0 bnh0Var = eVar.v;
            str.getClass();
            f fVar = (f) eVar.y.getValue();
            String strA0 = StringsKt.a0(str, bnh0Var.e(new String[0]));
            boolean z = fVar instanceof f.a;
            lyz lyzVar = eVar.d;
            if (z) {
                f.a aVar = (f.a) fVar;
                lyhVarC0 = lyzVar.C0((Boolean) eVar.B.getValue(), strA0, StringsKt.a0(aVar.a, bnh0Var.e(new String[0])), StringsKt.a0(aVar.b, bnh0Var.e(new String[0])));
            } else {
                lyhVarC0 = lyzVar.C0(null, strA0, null, null);
            }
            kzh.d(new g1i(bm50.a(new xzh(lyhVarC0, new k47(eVar, str, null))), new l47(eVar, null)), o8i0.d(eVar));
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [b47] */
    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_change_avatar);
        getIntent().getStringExtra("prev_avatar");
        this.b = new a();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.avatar_grid);
        recyclerView.setLayoutManager(new GridLayoutManager(4));
        recyclerView.setAdapter(this.b);
        ProgressButton progressButton = (ProgressButton) findViewById(R.id.save_btn);
        this.d = progressButton;
        progressButton.setOnClickListener(this);
        this.d.setEnabled(false);
        ((TextView) findViewById(R.id.goback)).setOnClickListener(this);
        LoadingView loadingView = (LoadingView) findViewById(R.id.loading);
        this.c = loadingView;
        loadingView.setOnClickListener(new View.OnClickListener() { // from class: a47
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = ChangeAvatarActivity.i;
                this.a.z1();
            }
        });
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(e.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        e eVar = (e) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        this.e = eVar;
        eVar.G.f(this, new lfy() { // from class: w37
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                lk50 lk50Var = (lk50) obj;
                int i2 = ChangeAvatarActivity.i;
                boolean z = lk50Var instanceof lk50.b;
                ChangeAvatarActivity changeAvatarActivity = this.a;
                ProgressButton progressButton2 = changeAvatarActivity.d;
                if (z) {
                    progressButton2.setLoading(true);
                    return;
                }
                progressButton2.setLoading(false);
                if (lk50Var instanceof lk50.c) {
                    Intent intent = new Intent();
                    intent.putExtra("requestCode", changeAvatarActivity.getIntent().getIntExtra("requestCode", -1));
                    changeAvatarActivity.setResult(-1, intent);
                    zyf0.c(0, changeAvatarActivity.getCMSString(R.string.my_account__avatar_saved, new Object[0]));
                    changeAvatarActivity.finish();
                    return;
                }
                if (lk50Var instanceof lk50.a) {
                    String cMSString = changeAvatarActivity.getCMSString(R.string.my_account__failed_to_upload_avatar, new Object[0]);
                    if (TextUtils.isEmpty(cMSString)) {
                        cMSString = changeAvatarActivity.getCMSString(R.string.common_feedback__please_check_your_internet_connection_and_try_again, new Object[0]);
                    }
                    if (changeAvatarActivity.isFinishing()) {
                        return;
                    }
                    b.a aVar = new b.a(changeAvatarActivity);
                    AlertController.b bVar = aVar.a;
                    bVar.f = cMSString;
                    bVar.k = false;
                    aVar.setPositiveButton(R.string.common_functions__ok, null).f();
                }
            }
        });
        this.e.I.f(this, new lfy() { // from class: x37
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                lk50 lk50Var = (lk50) obj;
                int i2 = ChangeAvatarActivity.i;
                boolean z = lk50Var instanceof lk50.b;
                ChangeAvatarActivity changeAvatarActivity = this.a;
                LoadingView loadingView2 = changeAvatarActivity.c;
                if (z) {
                    loadingView2.setVisibility(0);
                    loadingView2.b.setVisibility(0);
                    loadingView2.a.setVisibility(8);
                    return;
                }
                loadingView2.setVisibility(8);
                if (!(lk50Var instanceof lk50.c)) {
                    if (lk50Var instanceof lk50.a) {
                        boolean z2 = ((lk50.a) lk50Var).a instanceof ConnectException;
                        LoadingView loadingView3 = changeAvatarActivity.c;
                        if (z2) {
                            loadingView3.b(changeAvatarActivity.getCMSString(R.string.common_feedback__no_internet_connection_try_again, new Object[0]));
                            return;
                        } else {
                            loadingView3.b(changeAvatarActivity.getCMSString(R.string.my_account__failed_to_load_gallery, new Object[0]));
                            return;
                        }
                    }
                    return;
                }
                bp1 bp1Var = (bp1) ((lk50.c) lk50Var).a;
                a aVar = changeAvatarActivity.b;
                ArrayList arrayList = bp1Var.a;
                String str = bp1Var.b;
                ArrayList arrayList2 = aVar.b;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                aVar.a = str;
                aVar.notifyDataSetChanged();
            }
        });
        this.b.c = new y37(this);
        this.e.D.f(this, new lfy() { // from class: z37
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                int i2 = ChangeAvatarActivity.i;
                this.a.d.setEnabled(((Boolean) obj).booleanValue());
            }
        });
        final ComposeView composeView = (ComposeView) findViewById(R.id.frame_selector);
        final v340 v340Var = this.e.E;
        final ?? r1 = new Function1() { // from class: b47
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Boolean bool = (Boolean) obj;
                int i2 = ChangeAvatarActivity.i;
                e eVar2 = this.a.e;
                bool.getClass();
                wwd0 wwd0Var = eVar2.B;
                wwd0Var.getClass();
                wwd0Var.k(null, bool);
                return Unit.a;
            }
        };
        composeView.getClass();
        v340Var.getClass();
        composeView.setViewCompositionStrategy(u6i0.c.a);
        composeView.setContent(new op8(-232937662, new Function2() { // from class: co1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go1.a((so1) wyh.c(v340Var, aVar, 0, 7).getValue(), r1, aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        this.e.z.f(this, new lfy() { // from class: c47
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                int i2 = ChangeAvatarActivity.i;
                boolean z = ((f) obj) instanceof f.b;
                ComposeView composeView2 = composeView;
                if (z) {
                    composeView2.setVisibility(8);
                } else {
                    composeView2.setVisibility(0);
                }
            }
        });
        z1();
    }

    public final void z1() {
        e eVar = this.e;
        eVar.getClass();
        BOConfigParamDto bOConfigParamDto = new BOConfigParamDto(BOConfigAppId.COMMON, BOConfigNamespace.APPLICATION, "default_avatars", null, 8, null);
        kzh.d(new g1i(new yzh(new n1i(eVar.e.c(kotlin.collections.a.c(bOConfigParamDto)), eVar.A, new g47(bOConfigParamDto, eVar, null)), new h47(3, null)), new i47(eVar, null)), o8i0.d(eVar));
    }
}
