package com.sportybet.android.bookingcode.presentation.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.e;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.bookingcode.presentation.activity.PreviewCodeActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import com.sportybet.plugin.realsports.data.Event;
import defpackage.bqe;
import defpackage.c8i0;
import defpackage.cyb;
import defpackage.d090;
import defpackage.dq7;
import defpackage.e090;
import defpackage.ej5;
import defpackage.eq20;
import defpackage.fks;
import defpackage.g08;
import defpackage.g9i0;
import defpackage.hb5;
import defpackage.hq20;
import defpackage.i2i;
import defpackage.jq20;
import defpackage.jq40;
import defpackage.lfy;
import defpackage.n8j0;
import defpackage.o0m;
import defpackage.o8i0;
import defpackage.qoa0;
import defpackage.r5b;
import defpackage.r6i0;
import defpackage.r8i0;
import defpackage.rlf;
import defpackage.rws;
import defpackage.s8i0;
import defpackage.tlf;
import defpackage.v8i0;
import defpackage.xz80;
import defpackage.yrh0;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public class PreviewCodeActivity extends o0m implements View.OnClickListener, rlf {
    public static final /* synthetic */ int A = 0;
    public e b;
    public xz80 c;
    public rws d;
    public e090 e;
    public ImageView f;
    public Bitmap i;
    public TextView v;
    public ImageView w;
    public LoadingView y;
    public String z;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.load_code) {
            rws rwsVar = this.d;
            String str = this.z;
            g08 g08Var = g08.LOAD_CODE_FROM_CODEHUB;
            rwsVar.getClass();
            rws.y1(rwsVar, str, g08Var, null, 28);
            return;
        }
        if (id != R.id.ic_share) {
            if (id == R.id.close_preview) {
                finish();
            }
        } else {
            e090 e090Var = this.e;
            String str2 = this.z;
            e090Var.getClass();
            str2.getClass();
            ej5.c(o8i0.d(e090Var), null, null, new d090(e090Var, str2, null), 3);
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        n8j0.g cVar;
        super.onCreate(bundle);
        setContentView(R.layout.she_activity_zoom_image);
        if (Build.VERSION.SDK_INT >= 35) {
            Window window = getWindow();
            qoa0 qoa0Var = new qoa0(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                cVar = new n8j0.f(window, qoa0Var);
            } else if (i >= 30) {
                cVar = new n8j0.d(window, qoa0Var);
            } else {
                cVar = i >= 26 ? new n8j0.c(window, qoa0Var) : new n8j0.b(window, qoa0Var);
            }
            cVar.d(true);
            cVar.c(true);
            View viewFindViewById = findViewById(android.R.id.content);
            tlf tlfVar = new tlf(viewFindViewById, true);
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            r6i0.d.n(viewFindViewById, tlfVar);
        } else {
            Window window2 = getWindow();
            window2.addFlags(Integer.MIN_VALUE);
            window2.clearFlags(67108864);
            window2.setStatusBarColor(0);
        }
        setTitle("preview");
        this.f = (ImageView) findViewById(R.id.img_content);
        TextView textView = (TextView) findViewById(R.id.load_code);
        this.v = textView;
        textView.setOnClickListener(this);
        ImageView imageView = (ImageView) findViewById(R.id.ic_share);
        this.w = imageView;
        imageView.setOnClickListener(this);
        this.y = (LoadingView) findViewById(R.id.zoom_image_loading);
        ((ImageView) findViewById(R.id.close_preview)).setOnClickListener(this);
        this.i = yrh0.n(this, Uri.parse(getIntent().getStringExtra("imageUri")));
        this.z = getIntent().getStringExtra("shareCode");
        boolean booleanExtra = getIntent().getBooleanExtra("openFromShare", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("openFromCustom", false);
        c8i0.l(this.v, Integer.valueOf(bqe.a(booleanExtra ? 28.0f : 12.0f)), null, null, null);
        this.w.setVisibility(booleanExtra ? 8 : 0);
        this.v.setVisibility(booleanExtra2 ? 8 : 0);
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(rws.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.d = (rws) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        v8i0 viewModelStore2 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory2 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras2 = getDefaultViewModelCreationExtras();
        viewModelStore2.getClass();
        defaultViewModelProviderFactory2.getClass();
        defaultViewModelCreationExtras2.getClass();
        s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory2, defaultViewModelCreationExtras2);
        dq7 dq7VarA2 = jq40.a(e090.class);
        String strI2 = dq7VarA2.i();
        if (strI2 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.e = (e090) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
        i2i.b(this.d.e).f(this, new lfy() { // from class: bq20
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                int i2 = PreviewCodeActivity.A;
                PreviewCodeActivity previewCodeActivity = this.a;
                previewCodeActivity.b.c((a) obj, previewCodeActivity, previewCodeActivity.findViewById(R.id.root), null);
            }
        });
        i2i.b(this.d.i).f(this, new lfy() { // from class: cq20
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                mws mwsVar = (mws) obj;
                int i2 = PreviewCodeActivity.A;
                boolean z = mwsVar instanceof mws.a;
                PreviewCodeActivity previewCodeActivity = this.a;
                if (z) {
                    mws.a aVar = (mws.a) mwsVar;
                    Intent intent = new Intent(previewCodeActivity, (Class<?>) BetslipActivity.class);
                    yt5.g(intent, aVar.a.name(), aVar.b, bew.ADD_TO_BETSLIP_DIRECTLY);
                    yrh0.s(previewCodeActivity, intent, true);
                    previewCodeActivity.finish();
                    return;
                }
                if (mwsVar instanceof mws.c) {
                    mws.c cVar2 = (mws.c) mwsVar;
                    String str = cVar2.a;
                    List<Event> list = cVar2.b;
                    if (str == null || list == null) {
                        return;
                    }
                    g08 g08Var = g08.UNKNOWN;
                    ekl.b(previewCodeActivity, str, list, "LOAD_CODE_FROM_CODEHUB", true, cVar2.d);
                }
            }
        });
        i2i.b(this.e.c).f(this, new lfy() { // from class: dq20
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                int i2 = PreviewCodeActivity.A;
                PreviewCodeActivity previewCodeActivity = this.a;
                previewCodeActivity.b.c((a) obj, previewCodeActivity, previewCodeActivity.findViewById(R.id.root), null);
            }
        });
        r5b r5bVarB = i2i.b(this.e.e);
        xz80 xz80Var = this.c;
        Objects.requireNonNull(xz80Var);
        r5bVarB.f(this, new eq20(xz80Var));
        i2i.b(this.d.z).f(this, new lfy() { // from class: fq20
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                UiText uiText = (UiText) obj;
                int i2 = PreviewCodeActivity.A;
                if (uiText != null) {
                    PreviewCodeActivity previewCodeActivity = this.a;
                    previewCodeActivity.showDialog(previewCodeActivity, uiText.e(previewCodeActivity).toString(), new iq20());
                }
            }
        });
        fks.b(i2i.b(this.d.w), i2i.b(this.e.i), new Function2() { // from class: gq20
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                tzs tzsVar = (tzs) obj2;
                int i2 = PreviewCodeActivity.A;
                boolean zA = ((tzs) obj).a();
                PreviewCodeActivity previewCodeActivity = this.a;
                if (zA || tzsVar.a()) {
                    previewCodeActivity.y.K();
                    return null;
                }
                previewCodeActivity.y.E();
                return null;
            }
        }).f(this, new hq20());
        this.f.setImageBitmap(this.i);
        this.f.getViewTreeObserver().addOnGlobalLayoutListener(new jq20(this));
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Bitmap bitmap = this.i;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }
}
