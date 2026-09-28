package com.sportybet.android.account;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.widget.ImageView;
import androidx.appcompat.app.ActionBar;
import androidx.camera.view.PreviewView;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.account.KycNativeCameraActivity;
import com.sportybet.android.fileprovider.MyFileProvider;
import com.sportybet.android.gp.tz.R;
import defpackage.aas;
import defpackage.aiv;
import defpackage.b160;
import defpackage.c46;
import defpackage.c6n;
import defpackage.d020;
import defpackage.d160;
import defpackage.d35;
import defpackage.dbj;
import defpackage.dw;
import defpackage.eas;
import defpackage.erz;
import defpackage.f78;
import defpackage.fas;
import defpackage.fq0;
import defpackage.g75;
import defpackage.h6n;
import defpackage.h8n;
import defpackage.hlh0;
import defpackage.ht;
import defpackage.i060;
import defpackage.i89;
import defpackage.itf0;
import defpackage.j060;
import defpackage.j58;
import defpackage.kw0;
import defpackage.ls7;
import defpackage.ltp;
import defpackage.lx80;
import defpackage.ml5;
import defpackage.mtp;
import defpackage.n26;
import defpackage.n30;
import defpackage.n54;
import defpackage.nbj;
import defpackage.ne00;
import defpackage.nqe;
import defpackage.o0b;
import defpackage.obj;
import defpackage.op8;
import defpackage.psw;
import defpackage.pw6;
import defpackage.pwx;
import defpackage.q330;
import defpackage.qis;
import defpackage.r58;
import defpackage.rzk;
import defpackage.saj;
import defpackage.snh0;
import defpackage.tsr;
import defpackage.uf80;
import defpackage.utp;
import defpackage.ux5;
import defpackage.v8j0;
import defpackage.vd;
import defpackage.wd7;
import defpackage.ww20;
import defpackage.wz0;
import defpackage.x26;
import defpackage.x5a0;
import defpackage.x9n;
import defpackage.yka;
import defpackage.ytw;
import defpackage.zk40;
import defpackage.zn8;
import defpackage.zux;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sportybet/android/account/KycNativeCameraActivity;", "Lfq0;", "Lzux;", "Lpwx;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class KycNativeCameraActivity extends fq0 implements zux, pwx {
    public static final a i = new a();
    public PreviewView a;
    public h8n b;
    public ww20 c;
    public final ytw d = m.b(null);
    public final ytw e = m.b(Boolean.FALSE);
    public final ExecutorService f;

    public static final class a extends vd<Unit, Uri> {
        @Override // defpackage.vd
        public final Intent a(Object obj, Context context) {
            ((Unit) obj).getClass();
            return new Intent(context, (Class<?>) KycNativeCameraActivity.class);
        }

        @Override // defpackage.vd
        public final Object c(Intent intent, int i) {
            String stringExtra;
            if (i != -1 || intent == null || (stringExtra = intent.getStringExtra("extra_result_uri")) == null) {
                return null;
            }
            return Uri.parse(stringExtra);
        }
    }

    public static final /* synthetic */ class b extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            KycNativeCameraActivity kycNativeCameraActivity = (KycNativeCameraActivity) this.receiver;
            a aVar = KycNativeCameraActivity.i;
            kycNativeCameraActivity.z1();
            return Unit.a;
        }
    }

    public static final /* synthetic */ class c extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Rational rational;
            Size sizeT;
            KycNativeCameraActivity kycNativeCameraActivity = (KycNativeCameraActivity) this.receiver;
            a aVar = KycNativeCameraActivity.i;
            h8n h8nVar = kycNativeCameraActivity.b;
            if (h8nVar != null) {
                int i = MyFileProvider.v;
                File file = new File(MyFileProvider.b.a(), d020.a(System.currentTimeMillis(), "kyc_native_camera_", ".jpg"));
                PreviewView previewView = kycNativeCameraActivity.a;
                if (previewView == null) {
                    Intrinsics.n("previewView");
                    throw null;
                }
                Display display = previewView.getDisplay();
                int rotation = display != null ? display.getRotation() : 0;
                int iL = h8nVar.l();
                int iE = ((x9n) h8nVar.h).E(-1);
                if (iE == -1 || iE != rotation) {
                    snh0.b<?, ?, ?> bVarM = h8nVar.m(h8nVar.f);
                    h8n.b bVar = (h8n.b) bVarM;
                    x9n x9nVar = (x9n) bVar.d();
                    int iE2 = x9nVar.E(-1);
                    if (iE2 == -1 || iE2 != rotation) {
                        ((x9n.a) bVarM).b(rotation);
                    }
                    if (iE2 != -1 && rotation != -1 && iE2 != rotation) {
                        if (Math.abs(x26.b(rotation) - x26.b(iE2)) % 180 == 90 && (sizeT = x9nVar.t()) != null) {
                            ((x9n.a) bVarM).c(new Size(sizeT.getHeight(), sizeT.getWidth()));
                        }
                    }
                    h8nVar.f = bVar.d();
                    n26 n26VarC = h8nVar.c();
                    if (n26VarC == null) {
                        h8nVar.h = h8nVar.f;
                    } else {
                        h8nVar.h = h8nVar.p(n26VarC.h(), h8nVar.e, h8nVar.j);
                    }
                    if (h8nVar.v != null) {
                        int iAbs = Math.abs(x26.b(rotation) - x26.b(iL));
                        Rational rational2 = h8nVar.v;
                        if (iAbs == 90 || iAbs == 270) {
                            if (rational2 != null) {
                                rational = new Rational(rational2.getDenominator(), rational2.getNumerator());
                            }
                            h8nVar.v = rational2;
                        } else {
                            rational = new Rational(rational2.getNumerator(), rational2.getDenominator());
                        }
                        rational2 = rational;
                        h8nVar.v = rational2;
                    }
                }
                ((x5a0) kycNativeCameraActivity.e).setValue(Boolean.TRUE);
                itf0.a aVar2 = itf0.a;
                aVar2.q("SB_REG_KYC_WEBVIEW");
                aVar2.a("nativeCamera takePhoto, file=%s, %s", file.getName(), kycNativeCameraActivity.y1());
                h8nVar.K(new h8n.g(file), kycNativeCameraActivity.f, new utp(kycNativeCameraActivity, file));
            }
            return Unit.a;
        }
    }

    public static final /* synthetic */ class d extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            KycNativeCameraActivity kycNativeCameraActivity = (KycNativeCameraActivity) this.receiver;
            a aVar = KycNativeCameraActivity.i;
            ((x5a0) kycNativeCameraActivity.d).setValue(null);
            return Unit.a;
        }
    }

    public static final /* synthetic */ class e extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            KycNativeCameraActivity kycNativeCameraActivity = (KycNativeCameraActivity) this.receiver;
            a aVar = KycNativeCameraActivity.i;
            Uri uri = (Uri) ((x5a0) kycNativeCameraActivity.d).getValue();
            if (uri == null) {
                itf0.a aVar2 = itf0.a;
                aVar2.q("SB_REG_KYC_WEBVIEW");
                aVar2.n("nativeCamera confirmPhoto without uri, %s", kycNativeCameraActivity.y1());
                kycNativeCameraActivity.z1();
            } else {
                itf0.a aVar3 = itf0.a;
                aVar3.q("SB_REG_KYC_WEBVIEW");
                aVar3.a("nativeCamera confirmPhoto, result=%s, %s", KycNativeCameraActivity.A1(uri), kycNativeCameraActivity.y1());
                kycNativeCameraActivity.setResult(-1, new Intent().putExtra("extra_result_uri", uri.toString()));
                kycNativeCameraActivity.finish();
            }
            return Unit.a;
        }
    }

    public KycNativeCameraActivity() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.getClass();
        this.f = executorServiceNewSingleThreadExecutor;
    }

    public static String A1(Uri uri) {
        if (uri == null) {
            return "null";
        }
        String hexString = Integer.toHexString(uri.toString().hashCode());
        String scheme = uri.getScheme();
        return uf80.a(ux5.a("uri{id=", hexString, ", scheme=", scheme, ", authority="), uri.getAuthority(), "}");
    }

    @Override // androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        qis qisVarD;
        super.onCreate(bundle);
        itf0.a aVar = itf0.a;
        aVar.q("SB_REG_KYC_WEBVIEW");
        aVar.a("nativeCamera onCreate, %s", y1());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.f();
        }
        getWindow().setStatusBarColor(-16777216);
        getWindow().setNavigationBarColor(-16777216);
        PreviewView previewView = new PreviewView(this);
        previewView.setScaleType(PreviewView.e.FILL_CENTER);
        previewView.setImplementationMode(PreviewView.c.COMPATIBLE);
        this.a = previewView;
        zn8.a(this, new op8(-241108533, new Function2() { // from class: itp
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar2 = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                KycNativeCameraActivity.a aVar3 = KycNativeCameraActivity.i;
                if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    KycNativeCameraActivity kycNativeCameraActivity = this.a;
                    PreviewView previewView2 = kycNativeCameraActivity.a;
                    if (previewView2 == null) {
                        Intrinsics.n("previewView");
                        throw null;
                    }
                    Uri uri = (Uri) ((x5a0) kycNativeCameraActivity.d).getValue();
                    boolean zBooleanValue = ((Boolean) ((x5a0) kycNativeCameraActivity.e).getValue()).booleanValue();
                    boolean zA = aVar2.A(kycNativeCameraActivity);
                    Object objY = aVar2.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        KycNativeCameraActivity.b bVar = new KycNativeCameraActivity.b(0, kycNativeCameraActivity, KycNativeCameraActivity.class, "cancelCamera", "cancelCamera()V", 0);
                        aVar2.r(bVar);
                        objY = bVar;
                    }
                    Function0<Unit> function0 = (Function0) ((chp) objY);
                    boolean zA2 = aVar2.A(kycNativeCameraActivity);
                    Object objY2 = aVar2.y();
                    if (zA2 || objY2 == c0042a) {
                        KycNativeCameraActivity.c cVar = new KycNativeCameraActivity.c(0, kycNativeCameraActivity, KycNativeCameraActivity.class, "takePhoto", "takePhoto()V", 0);
                        aVar2.r(cVar);
                        objY2 = cVar;
                    }
                    Function0<Unit> function1 = (Function0) ((chp) objY2);
                    boolean zA3 = aVar2.A(kycNativeCameraActivity);
                    Object objY3 = aVar2.y();
                    if (zA3 || objY3 == c0042a) {
                        KycNativeCameraActivity.d dVar = new KycNativeCameraActivity.d(0, kycNativeCameraActivity, KycNativeCameraActivity.class, "showCameraPreview", "showCameraPreview()V", 0);
                        aVar2.r(dVar);
                        objY3 = dVar;
                    }
                    Function0<Unit> function2 = (Function0) ((chp) objY3);
                    boolean zA4 = aVar2.A(kycNativeCameraActivity);
                    Object objY4 = aVar2.y();
                    if (zA4 || objY4 == c0042a) {
                        KycNativeCameraActivity.e eVar = new KycNativeCameraActivity.e(0, kycNativeCameraActivity, KycNativeCameraActivity.class, "confirmPhoto", "confirmPhoto()V", 0);
                        aVar2.r(eVar);
                        objY4 = eVar;
                    }
                    kycNativeCameraActivity.w1(previewView2, uri, zBooleanValue, function0, function1, function2, (Function0) ((chp) objY4), aVar2, 0);
                } else {
                    aVar2.G();
                }
                return Unit.a;
            }
        }, true));
        aVar.q("SB_REG_KYC_WEBVIEW");
        aVar.a("nativeCamera startCamera, %s", y1());
        fas fasVar = ww20.b.a;
        synchronized (fasVar.a) {
            qisVarD = fasVar.b;
            if (qisVarD == null) {
                c46 c46Var = new c46(this, null);
                dbj dbjVarA = dbj.a(fasVar.c);
                final aas aasVar = new aas(c46Var);
                pw6 pw6VarG = obj.g(dbjVarA, new wz0() { // from class: bas
                    @Override // defpackage.wz0
                    public final qis apply(Object obj) {
                        return (qis) aasVar.invoke(obj);
                    }
                }, nqe.a());
                fasVar.b = pw6VarG;
                eas easVar = new eas(fasVar, c46Var, this);
                pw6VarG.k(new obj.b(pw6VarG, easVar), nqe.a());
                qisVarD = obj.d(pw6VarG);
            }
        }
        wd7 wd7Var = new wd7();
        final pw6 pw6VarG2 = obj.g(qisVarD, new nbj(wd7Var), nqe.a());
        pw6VarG2.k(new Runnable() { // from class: jtp
            @Override // java.lang.Runnable
            public final void run() {
                Object bVar;
                KycNativeCameraActivity kycNativeCameraActivity = this.a;
                pw6 pw6Var = pw6VarG2;
                KycNativeCameraActivity.a aVar2 = KycNativeCameraActivity.i;
                try {
                    zi50.a aVar3 = zi50.b;
                    ww20 ww20Var = (ww20) pw6Var.get();
                    kycNativeCameraActivity.c = ww20Var;
                    lq20 lq20Var = new lq20(w2z.U(new aq20.a().a));
                    x9n.D(lq20Var);
                    aq20 aq20Var = new aq20(lq20Var);
                    aq20Var.s = aq20.z;
                    PreviewView previewView2 = kycNativeCameraActivity.a;
                    if (previewView2 == null) {
                        Intrinsics.n("previewView");
                        throw null;
                    }
                    aq20Var.G(previewView2.getSurfaceProvider());
                    h8n.b bVar2 = new h8n.b();
                    ftw ftwVar = bVar2.a;
                    ftwVar.Y(i8n.O, 1);
                    PreviewView previewView3 = kycNativeCameraActivity.a;
                    if (previewView3 == null) {
                        Intrinsics.n("previewView");
                        throw null;
                    }
                    Display display = previewView3.getDisplay();
                    ftwVar.Y(x9n.l, Integer.valueOf(display != null ? display.getRotation() : 0));
                    h8n h8nVarE = bVar2.e();
                    kycNativeCameraActivity.b = h8nVarE;
                    ww20Var.a.e();
                    k36 k36Var = k36.c;
                    k36Var.getClass();
                    ww20Var.a(kycNativeCameraActivity, k36Var, aq20Var, h8nVarE);
                    itf0.a aVar4 = itf0.a;
                    aVar4.q("SB_REG_KYC_WEBVIEW");
                    aVar4.a("nativeCamera started, %s", kycNativeCameraActivity.y1());
                    bVar = Unit.a;
                    Throwable thA = zi50.a(bVar);
                    if (thA != null) {
                        itf0.a aVar5 = itf0.a;
                        aVar5.q("SB_REG_KYC_WEBVIEW");
                        aVar5.p(thA, "nativeCamera startCamera failed, %s", kycNativeCameraActivity.y1());
                        aVar5.q(MyLog.TAG_FILE_PROVIDER);
                        aVar5.p(thA, "Failed to start KYC native camera", new Object[0]);
                        zyf0.a(R.string.common_feedback__something_went_wrong);
                        kycNativeCameraActivity.z1();
                    }
                } catch (Throwable th) {
                    zi50.a aVar6 = zi50.b;
                    bVar = new zi50.b(th);
                }
            }
        }, o0b.c(this));
    }

    @Override // defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        itf0.a aVar = itf0.a;
        aVar.q("SB_REG_KYC_WEBVIEW");
        aVar.a("nativeCamera onDestroy, %s", y1());
        ww20 ww20Var = this.c;
        if (ww20Var != null) {
            ww20Var.a.e();
        }
        this.f.shutdown();
        super.onDestroy();
    }

    public final void u1(final Uri uri, final boolean z, final Function0 function0, final Function0 function1, final Function0 function2, final androidx.compose.ui.d dVar, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        int i4;
        float f;
        boolean z2;
        boolean z3;
        int i5;
        androidx.compose.runtime.b bVarI = aVar.i(-77484780);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.A(uri) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.A(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= bVarI.M(dVar) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= bVarI.A(this) ? 1048576 : 524288;
        }
        if (bVarI.q(i3 & 1, (599187 & i3) != 599186)) {
            androidx.compose.ui.d dVarI = h.i(v8j0.b(j.g(dVar, 1.0f)), 16.0f, 12.0f, 16.0f, 24.0f);
            d160 d160VarA = b160.a(kw0.e, ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarI);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
            if (uri != null) {
                bVarI.N(2069826434);
                i5 = 29360128;
                i4 = i3;
                f = 56.0f;
                z2 = false;
                z3 = true;
                v1(R.drawable.spr_ic_refresh, "Retake photo", !z, j58.c(0.7f, j58.b), j58.c(0.4f, j58.f), function1, j.r(h.j(aVar3, 0.0f, 0.0f, 36.0f, 0.0f, 11), 56.0f), bVarI, ((i4 << 6) & 458752) | 1600560 | ((i4 << 3) & 29360128));
                bVarI.X(false);
            } else {
                i4 = i3;
                f = 56.0f;
                z2 = false;
                z3 = true;
                i5 = 29360128;
                bVarI.N(2070356906);
                bVarI.X(false);
            }
            if (uri == null) {
                bVarI.N(2070402383);
                x1(((i4 >> 9) & 7168) | ((i4 >> 3) & 112) | 384, bVarI, j.r(aVar3, 72.0f), function0, !z);
                bVarI.X(z2);
            } else {
                bVarI.N(2070612842);
                bVarI.X(z2);
            }
            if (uri != null) {
                bVarI = bVarI;
                bVarI = bVarI;
                bVarI.N(2070668115);
                int i6 = i4 << 3;
                androidx.compose.runtime.b bVar = bVarI;
                v1(R.drawable.ic__check, "Use photo", !z, r58.d(4280263779L), j58.c(0.8f, j58.f), function2, j.r(h.j(aVar3, 36.0f, 0.0f, 0.0f, 0.0f, 14), f), bVar, (i6 & 458752) | 1600560 | (i6 & i5));
                bVarI = bVar;
                bVarI.X(z2);
            } else {
                bVarI = bVarI;
                bVarI = bVarI;
                bVarI.N(2071182250);
                bVarI.X(z2);
            }
            bVarI.X(z3);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ptp
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar4 = (a) obj;
                    ((Integer) obj2).getClass();
                    KycNativeCameraActivity.a aVar5 = KycNativeCameraActivity.i;
                    this.a.u1(uri, z, function0, function1, function2, dVar, aVar4, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public final void v1(final int i2, final String str, final boolean z, final long j, final long j2, final Function0 function0, final androidx.compose.ui.d dVar, androidx.compose.runtime.a aVar, final int i3) {
        int i4;
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(1339477208);
        if ((i3 & 6) == 0) {
            i4 = (bVarI.d(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= bVarI.b(z) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= bVarI.e(j) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= bVarI.e(j2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= bVarI.A(function0) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= bVarI.M(dVar) ? 1048576 : 524288;
        }
        int i5 = i4;
        if (bVarI.q(i5 & 1, (i5 & 599187) != 599186)) {
            i060 i060Var = j060.a;
            androidx.compose.ui.d dVarA = dw.a(d35.a(androidx.compose.foundation.a.b(ls7.a(lx80.d(dVar, 4.0f, i060Var, false, 0L, 0L, 28), i060Var), j, zk40.a), 1.0f, j2, i060Var), z ? 1.0f : 0.5f);
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = rzk.a(bVarI);
            }
            androidx.compose.ui.d dVarB = androidx.compose.foundation.d.b(dVarA, (psw) objY, null, z, null, function0, 24);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            h6n.b(erz.a(i2, i5 & 14, bVarI), str, j.r(androidx.compose.ui.d.a.b, 24.0f), j58.f, bVarI, (i5 & 112) | 3456, 0);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: rtp
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar3 = (a) obj;
                    ((Integer) obj2).getClass();
                    KycNativeCameraActivity.a aVar4 = KycNativeCameraActivity.i;
                    this.a.v1(i2, str, z, j, j2, function0, dVar, aVar3, qj40.a(i3 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public final void w1(final PreviewView previewView, final Uri uri, final boolean z, final Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, final Function0<Unit> function3, androidx.compose.runtime.a aVar, final int i2) {
        boolean z2;
        androidx.compose.runtime.b bVarI = aVar.i(1355394513);
        int i3 = i2 | (bVarI.A(previewView) ? 4 : 2) | (bVarI.A(uri) ? 32 : 16) | (bVarI.b(z) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024) | (bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function2) ? 131072 : 65536) | (bVarI.A(function3) ? 1048576 : 524288) | (bVarI.A(this) ? 8388608 : 4194304);
        if (bVarI.q(i3 & 1, (4793491 & i3) != 4793490)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarE = j.e(aVar2, 1.0f);
            long j = j58.b;
            zk40.a aVar3 = zk40.a;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarE, j, aVar3);
            n54 n54Var = ht.a.a;
            aiv aivVarC = g75.c(n54Var, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            boolean zA = bVarI.A(previewView);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new Function1() { // from class: ktp
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        KycNativeCameraActivity.a aVar5 = KycNativeCameraActivity.i;
                        ((Context) obj).getClass();
                        return previewView;
                    }
                };
                bVarI.r(objY);
            }
            Function1 function4 = (Function1) objY;
            androidx.compose.ui.d dVarE2 = j.e(aVar2, 1.0f);
            boolean zA2 = bVarI.A(uri);
            Object objY2 = bVarI.y();
            if (zA2 || objY2 == c0042a) {
                z2 = false;
                objY2 = new ltp(uri, 0);
                bVarI.r(objY2);
            } else {
                z2 = false;
            }
            androidx.compose.ui.viewinterop.b.a(function4, dVarE2, (Function1) objY2, bVarI, 48, 0);
            if (uri == null) {
                bVarI.N(1505899176);
                bVarI.X(z2);
            } else {
                bVarI.N(1505899177);
                androidx.compose.ui.d dVarE3 = j.e(aVar2, 1.0f);
                Object objY3 = bVarI.y();
                if (objY3 == c0042a) {
                    objY3 = new mtp();
                    bVarI.r(objY3);
                }
                Function1 function5 = (Function1) objY3;
                boolean zA3 = bVarI.A(uri);
                Object objY4 = bVarI.y();
                if (zA3 || objY4 == c0042a) {
                    objY4 = new Function1() { // from class: ntp
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ImageView imageView = (ImageView) obj;
                            KycNativeCameraActivity.a aVar5 = KycNativeCameraActivity.i;
                            imageView.getClass();
                            imageView.setImageURI(uri);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY4);
                }
                androidx.compose.ui.viewinterop.b.a(function5, dVarE3, (Function1) objY4, bVarI, 54, 0);
                z2 = false;
                bVarI.X(false);
            }
            androidx.compose.ui.d dVarR = j.r(h.j(v8j0.c(aVar2), 16.0f, 16.0f, 0.0f, 0.0f, 12), 48.0f);
            androidx.compose.foundation.layout.d dVar = androidx.compose.foundation.layout.d.a;
            c6n.a(function0, androidx.compose.foundation.a.b(ls7.a(dVar.b(dVarR, n54Var), j060.a), j58.c(0.4f, j), aVar3), false, null, null, i89.a, bVarI, ((i3 >> 9) & 14) | 1572864, 60);
            androidx.compose.runtime.b bVar = bVarI;
            if (z) {
                bVar.N(1507008388);
                q330.a(dVar.b(j.r(aVar2, 48.0f), ht.a.e), j58.f, 0.0f, 0L, 0, 0.0f, bVar, 48, 60);
                bVar = bVar;
                bVar.X(false);
            } else {
                bVar.N(1507241911);
                bVar.X(false);
            }
            androidx.compose.ui.d dVarB2 = dVar.b(aVar2, ht.a.h);
            int i4 = i3 >> 3;
            int i5 = i3 >> 6;
            androidx.compose.runtime.b bVar2 = bVar;
            u1(uri, z, function1, function2, function3, dVarB2, bVar2, (i4 & WebSocketProtocol.PAYLOAD_SHORT) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i4 & 3670016));
            bVarI = bVar2;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(previewView, uri, z, function0, function1, function2, function3, i2) { // from class: otp
                public final /* synthetic */ PreviewView b;
                public final /* synthetic */ Uri c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ Function0 v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar5 = (a) obj;
                    ((Integer) obj2).getClass();
                    KycNativeCameraActivity.a aVar6 = KycNativeCameraActivity.i;
                    this.a.w1(this.b, this.c, this.d, this.e, this.f, this.i, this.v, aVar5, qj40.a(1));
                    return Unit.a;
                }
            };
        }
    }

    public final void x1(final int i2, androidx.compose.runtime.a aVar, final androidx.compose.ui.d dVar, final Function0 function0, final boolean z) {
        int i3;
        androidx.compose.runtime.b bVarI = aVar.i(-1387513166);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.b(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.A(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.M(dVar) ? 256 : 128;
        }
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            i060 i060Var = j060.a;
            androidx.compose.ui.d dVarA = ls7.a(lx80.d(dVar, 4.0f, i060Var, false, 0L, 0L, 28), i060Var);
            long j = j58.f;
            androidx.compose.ui.d dVarA2 = dw.a(d35.a(dVarA, 4.0f, j, i060Var), z ? 1.0f : 0.5f);
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = rzk.a(bVarI);
            }
            androidx.compose.ui.d dVarF = h.f(androidx.compose.foundation.d.b(dVarA2, (psw) objY, null, z, null, function0, 24), 8.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarF);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            g75.a(androidx.compose.foundation.a.b(ls7.a(j.e(androidx.compose.ui.d.a.b, 1.0f), i060Var), j, zk40.a), bVarI, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: qtp
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar3 = (a) obj;
                    ((Integer) obj2).getClass();
                    KycNativeCameraActivity.a aVar4 = KycNativeCameraActivity.i;
                    this.a.x1(qj40.a(i2 | 1), aVar3, dVar, function0, z);
                    return Unit.a;
                }
            };
        }
    }

    public final String y1() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iMyPid = Process.myPid();
        int taskId = getTaskId();
        String strA1 = A1((Uri) ((x5a0) this.d).getValue());
        boolean zIsFinishing = isFinishing();
        boolean zIsDestroyed = isDestroyed();
        StringBuilder sbA = ml5.a(iMyPid, "instance=", hexString, ", pid=", ", taskId=");
        f78.b(taskId, ", captured=", strA1, ", finishing=", sbA);
        sbA.append(zIsFinishing);
        sbA.append(", destroyed=");
        sbA.append(zIsDestroyed);
        return sbA.toString();
    }

    public final void z1() {
        itf0.a aVar = itf0.a;
        aVar.q("SB_REG_KYC_WEBVIEW");
        aVar.a("nativeCamera cancel, %s", y1());
        setResult(0);
        finish();
    }
}
