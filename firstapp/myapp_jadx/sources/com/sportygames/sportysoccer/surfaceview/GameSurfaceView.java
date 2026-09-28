package com.sportygames.sportysoccer.surfaceview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.account.Qr.QQWMbKFOuTf;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.crash.models.header.snc.OdQr;
import com.sportygames.sportysoccer.activities.GameActivity;
import com.sportygames.sportysoccer.surfaceview.GameSurfaceView;
import com.sportygames.sportysoccer.widget.StatusBarLayout;
import defpackage.ay0;
import defpackage.bcy;
import defpackage.bsh0;
import defpackage.bwf;
import defpackage.d3i0;
import defpackage.dwf;
import defpackage.ea50;
import defpackage.fug;
import defpackage.fw;
import defpackage.gzf0;
import defpackage.hpa0;
import defpackage.joc;
import defpackage.knj;
import defpackage.koc;
import defpackage.lmj;
import defpackage.lx30;
import defpackage.ocy;
import defpackage.pby;
import defpackage.pcy;
import defpackage.qby;
import defpackage.qcy;
import defpackage.rby;
import defpackage.ta50;
import defpackage.tu50;
import defpackage.tzw;
import defpackage.upc;
import defpackage.vpc;
import defpackage.wij;
import defpackage.wrc;
import defpackage.yoc;
import defpackage.zoc;
import defpackage.zy60;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes8.dex */
public class GameSurfaceView extends SurfaceView implements SurfaceHolder.Callback, Runnable {
    public static final /* synthetic */ int z = 0;
    public a a;
    public final pcy b;
    public final bcy c;
    public final qcy d;
    public final pby e;
    public final SurfaceHolder f;
    public final tzw i;
    public boolean v;
    public final Camera w;
    public boolean y;

    public interface a {
    }

    public GameSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new tzw();
        SurfaceHolder holder = getHolder();
        this.f = holder;
        holder.addCallback(this);
        this.w = new Camera();
        this.b = new pcy();
        this.c = new bcy(context);
        this.d = new qcy(context, new knj(this));
        this.e = new pby(context, new com.sportygames.sportysoccer.surfaceview.a(this));
        setFocusable(true);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        qcy qcyVar = this.d;
        StatusBarLayout statusBarLayout = qcyVar.e;
        if (motionEvent.getAction() == 0) {
            if (qcyVar.b(motionEvent.getX(), motionEvent.getY())) {
                qcyVar.j = true;
                statusBarLayout.setLeaderBoardIconPressed();
                qcyVar.c();
            }
        } else if (qcyVar.j) {
            qcyVar.j = false;
            statusBarLayout.setLeaderBoardIconNormal();
            qcyVar.c();
        }
        qcyVar.i.onTouchEvent(motionEvent);
        this.e.E.onTouchEvent(motionEvent);
        return true;
    }

    public void setListener(a aVar) {
        this.a = aVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        float f;
        wij wijVarA = wij.a();
        float f2 = i2 / 8000.0f;
        wijVarA.a = f2;
        wijVarA.b = f2 * 1.3f;
        pcy pcyVar = this.b;
        pcyVar.a = i2;
        try {
            ea50<Bitmap> ea50VarN = com.bumptech.glide.a.d(SportyGamesManager.getApplicationContext()).k().P("https://s.sporty.net/common/main/res/49f4b8fbe62539fc74d39a0adf7c8878.webp").N(new ocy(pcyVar, i3, i2));
            ta50 ta50Var = new ta50();
            ea50VarN.L(ta50Var, ta50Var, ea50VarN, fug.b);
            ta50Var.get();
        } catch (Exception unused) {
        }
        bcy bcyVar = this.c;
        bcyVar.a = i2;
        Context context = bcyVar.e;
        BitmapFactory.Options optionsD = bsh0.d(context.getResources(), R.drawable.sg_soccer_bg);
        float f3 = i3;
        float f4 = f3 * 0.3f;
        float f5 = f3 - f4;
        float f6 = (f5 / optionsD.outHeight) * optionsD.outWidth;
        float f7 = bcyVar.a;
        if (f6 < f7) {
            f5 *= f7 / f6;
            f = f7;
        } else {
            f = f6;
        }
        bcyVar.f = new bwf(bsh0.i(context.getResources(), R.drawable.sg_soccer_bg, (int) f, (int) f5, optionsD), 0.0f, f4, f, f4 + f5);
        qcy qcyVar = this.d;
        qcyVar.a = i2;
        qcyVar.g = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        pby pbyVar = this.e;
        pbyVar.a = i2;
        pbyVar.g = new rby(i2, i3, pbyVar.o, pbyVar.e);
        this.y = true;
        a aVar = this.a;
        if (aVar != null) {
            GameActivity gameActivity = (GameActivity) aVar;
            if (gameActivity.C) {
                return;
            }
            gameActivity.C = true;
            lmj lmjVar = gameActivity.z;
            lmjVar.h.h(lmjVar);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.v = true;
        new Thread(this).start();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        synchronized (this) {
            this.v = false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:122:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:124:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:126:0x0204  */
    /* JADX WARN: Code duplicated, block: B:128:0x020a  */
    /* JADX WARN: Code duplicated, block: B:130:0x023e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0244  */
    /* JADX WARN: Code duplicated, block: B:133:0x0250  */
    /* JADX WARN: Code duplicated, block: B:134:0x0256  */
    /* JADX WARN: Code duplicated, block: B:136:0x0264  */
    /* JADX WARN: Code duplicated, block: B:137:0x026a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0278  */
    /* JADX WARN: Code duplicated, block: B:140:0x0280  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x0104  */
    @Override // java.lang.Runnable
    public final void run() {
        byte b;
        int i;
        byte b2;
        zoc zocVar;
        bsh0.a aVarH;
        bsh0.a aVarH2;
        bsh0.a aVarH3;
        qby qbyVar;
        qby qbyVar2;
        bsh0.a aVarF;
        bsh0.a aVarG;
        int i2;
        int i3;
        Canvas canvas;
        Canvas canvasLockHardwareCanvas;
        while (this.v) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (getVisibility() == 0) {
                if (this.y) {
                    synchronized (this) {
                        try {
                            int i4 = Build.VERSION.SDK_INT;
                            SurfaceHolder surfaceHolder = this.f;
                            canvasLockHardwareCanvas = i4 >= 26 ? surfaceHolder.lockHardwareCanvas() : surfaceHolder.lockCanvas();
                            if (canvasLockHardwareCanvas != null) {
                                try {
                                    pcy pcyVar = this.b;
                                    Camera camera = this.w;
                                    tzw tzwVar = this.i;
                                    pcyVar.b = canvasLockHardwareCanvas;
                                    pcyVar.c = camera;
                                    pcyVar.d = tzwVar;
                                    pcyVar.a(pcyVar.e);
                                    bcy bcyVar = this.c;
                                    Camera camera2 = this.w;
                                    tzw tzwVar2 = this.i;
                                    bcyVar.b = canvasLockHardwareCanvas;
                                    bcyVar.c = camera2;
                                    bcyVar.d = tzwVar2;
                                    bcyVar.a(bcyVar.f);
                                    qcy qcyVar = this.d;
                                    Camera camera3 = this.w;
                                    tzw tzwVar3 = this.i;
                                    qcyVar.b = canvasLockHardwareCanvas;
                                    qcyVar.c = camera3;
                                    qcyVar.d = tzwVar3;
                                    bwf bwfVar = qcyVar.f;
                                    if (bwfVar != null) {
                                        qcyVar.a(bwfVar);
                                    }
                                    pby pbyVar = this.e;
                                    Camera camera4 = this.w;
                                    tzw tzwVar4 = this.i;
                                    pbyVar.b = canvasLockHardwareCanvas;
                                    pbyVar.c = camera4;
                                    pbyVar.d = tzwVar4;
                                    pbyVar.c();
                                } catch (Exception unused) {
                                    if (canvasLockHardwareCanvas != null) {
                                        try {
                                            this.f.unlockCanvasAndPost(canvasLockHardwareCanvas);
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    canvas = canvasLockHardwareCanvas;
                                    if (canvas != null) {
                                        this.f.unlockCanvasAndPost(canvas);
                                    }
                                    throw th;
                                }
                            }
                            if (canvasLockHardwareCanvas != null) {
                                this.f.unlockCanvasAndPost(canvasLockHardwareCanvas);
                            }
                        } catch (Exception unused2) {
                            canvasLockHardwareCanvas = null;
                        } catch (Throwable th3) {
                            th = th3;
                            canvas = null;
                        }
                    }
                }
                if (this.y) {
                    final pby pbyVar2 = this.e;
                    pbyVar2.getClass();
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    String str = pbyVar2.f;
                    switch (str.hashCode()) {
                        case -1041657885:
                            if (!str.equals("determination")) {
                                b = -1;
                            } else {
                                b = 0;
                            }
                            break;
                        case 1562135812:
                            if (!str.equals(OdQr.iwRak)) {
                                b = -1;
                            } else {
                                b = 1;
                            }
                            break;
                        case 1926817518:
                            if (!str.equals("ready_to_kick")) {
                                b = -1;
                            } else {
                                b = 2;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        case 0:
                            qby qbyVar3 = pbyVar2.h;
                            final boolean z2 = qbyVar3 != null && ((i = qbyVar3.a) == 10 || i == 11);
                            pbyVar2.f = "init";
                            pbyVar2.l.post(new Runnable() { // from class: nby
                                @Override // java.lang.Runnable
                                public final void run() {
                                    GameSurfaceView.a aVar = pbyVar2.n.a.a;
                                    if (aVar != null) {
                                        lmj lmjVar = ((GameActivity) aVar).z;
                                        lmjVar.h.e(z2, lmjVar);
                                    }
                                }
                            });
                            break;
                        case 1:
                            joc jocVarA = pbyVar2.r.a(jCurrentTimeMillis2);
                            String str2 = jocVarA.a;
                            str2.getClass();
                            switch (str2.hashCode()) {
                                case -1759562497:
                                    if (!str2.equals("hit_target_edge")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 0;
                                    }
                                    break;
                                case -1271344497:
                                    if (!str2.equals("flying")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 1;
                                    }
                                    break;
                                case -377168095:
                                    if (!str2.equals("hit_nothing")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 2;
                                    }
                                    break;
                                case 364268641:
                                    if (!str2.equals("touchdown")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 3;
                                    }
                                    break;
                                case 378250507:
                                    if (!str2.equals("hit_defense_obj_ufo")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 4;
                                    }
                                    break;
                                case 956579203:
                                    if (!str2.equals("can_collision")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 5;
                                    }
                                    break;
                                case 1125003643:
                                    if (!str2.equals("hit_frame_edge")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 6;
                                    }
                                    break;
                                case 1221446423:
                                    if (!str2.equals("hit_target_center")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 7;
                                    }
                                    break;
                                case 1283225119:
                                    if (!str2.equals("hit_frame_net")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 8;
                                    }
                                    break;
                                case 1345710065:
                                    if (!str2.equals(QQWMbKFOuTf.NgHoOFBR)) {
                                        b2 = -1;
                                    } else {
                                        b2 = 9;
                                    }
                                    break;
                                case 2121823767:
                                    if (!str2.equals("hit_defense_obj_lightning")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 10;
                                    }
                                    break;
                                default:
                                    b2 = -1;
                                    break;
                            }
                            switch (b2) {
                                case 0:
                                    pbyVar2.g(HttpStatusCodesKt.HTTP_PROCESSING, jCurrentTimeMillis2);
                                    pbyVar2.e(jCurrentTimeMillis2);
                                    break;
                                case 1:
                                case 2:
                                case 4:
                                case 8:
                                case 10:
                                    pbyVar2.g(100, jCurrentTimeMillis2);
                                    break;
                                case 3:
                                    pbyVar2.f = "determination";
                                    break;
                                case 5:
                                    pbyVar2.g(100, jCurrentTimeMillis2);
                                    if (pbyVar2.C != null) {
                                        String str3 = pbyVar2.i.c;
                                        if (str3.equals("ufo")) {
                                            qbyVar = new qby(51);
                                        } else if (str3.equals("lightning")) {
                                            qbyVar = new qby(50);
                                        } else {
                                            aVarH = bsh0.h(pbyVar2.g.e, pbyVar2.p);
                                            if (aVarH.c) {
                                                qbyVar2 = new qby(20, aVarH);
                                            } else if (pbyVar2.i.a) {
                                                aVarF = bsh0.f(pbyVar2.t.a(), pbyVar2.t.b(), pbyVar2.t.i() * 0.5f * 0.25f, pbyVar2.p.a(), pbyVar2.p.b(), pbyVar2.p.i() * 0.5f);
                                                if (aVarF.c) {
                                                    qbyVar2 = new qby(10, aVarF);
                                                } else {
                                                    aVarG = bsh0.g(pbyVar2.t, pbyVar2.p);
                                                    if (aVarG.c) {
                                                        qbyVar2 = new qby(11, aVarG);
                                                    } else {
                                                        aVarH2 = bsh0.h(pbyVar2.g.a, pbyVar2.p);
                                                        if (aVarH2.c) {
                                                            qbyVar2 = new qby(21, aVarH2);
                                                        } else {
                                                            aVarH3 = bsh0.h(pbyVar2.g.f, pbyVar2.p);
                                                            if (aVarH3.c) {
                                                                qbyVar2 = new qby(22, aVarH3);
                                                            } else {
                                                                qbyVar = new qby(23, new bsh0.a());
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                aVarH2 = bsh0.h(pbyVar2.g.a, pbyVar2.p);
                                                if (aVarH2.c) {
                                                    qbyVar2 = new qby(21, aVarH2);
                                                } else {
                                                    aVarH3 = bsh0.h(pbyVar2.g.f, pbyVar2.p);
                                                    if (aVarH3.c) {
                                                        qbyVar2 = new qby(22, aVarH3);
                                                    } else {
                                                        qbyVar = new qby(23, new bsh0.a());
                                                    }
                                                }
                                            }
                                            qbyVar = qbyVar2;
                                        }
                                    } else {
                                        aVarH = bsh0.h(pbyVar2.g.e, pbyVar2.p);
                                        if (aVarH.c) {
                                            qbyVar2 = new qby(20, aVarH);
                                        } else if (pbyVar2.i.a) {
                                            aVarF = bsh0.f(pbyVar2.t.a(), pbyVar2.t.b(), pbyVar2.t.i() * 0.5f * 0.25f, pbyVar2.p.a(), pbyVar2.p.b(), pbyVar2.p.i() * 0.5f);
                                            if (aVarF.c) {
                                                qbyVar2 = new qby(10, aVarF);
                                            } else {
                                                aVarG = bsh0.g(pbyVar2.t, pbyVar2.p);
                                                if (aVarG.c) {
                                                    qbyVar2 = new qby(11, aVarG);
                                                } else {
                                                    aVarH2 = bsh0.h(pbyVar2.g.a, pbyVar2.p);
                                                    if (aVarH2.c) {
                                                        qbyVar2 = new qby(21, aVarH2);
                                                    } else {
                                                        aVarH3 = bsh0.h(pbyVar2.g.f, pbyVar2.p);
                                                        if (aVarH3.c) {
                                                            qbyVar2 = new qby(22, aVarH3);
                                                        } else {
                                                            qbyVar = new qby(23, new bsh0.a());
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            aVarH2 = bsh0.h(pbyVar2.g.a, pbyVar2.p);
                                            if (aVarH2.c) {
                                                qbyVar2 = new qby(21, aVarH2);
                                            } else {
                                                aVarH3 = bsh0.h(pbyVar2.g.f, pbyVar2.p);
                                                if (aVarH3.c) {
                                                    qbyVar2 = new qby(22, aVarH3);
                                                } else {
                                                    qbyVar = new qby(23, new bsh0.a());
                                                }
                                            }
                                        }
                                        qbyVar = qbyVar2;
                                    }
                                    pbyVar2.h = qbyVar;
                                    koc kocVar = pbyVar2.r;
                                    int i5 = qbyVar.a;
                                    bwf bwfVar2 = pbyVar2.C;
                                    kocVar.t = i5;
                                    if (i5 == 51) {
                                        joc jocVar = kocVar.s;
                                        kocVar.x = jocVar.c;
                                        kocVar.y = bwfVar2.b + jocVar.d;
                                    }
                                    a aVar = pbyVar2.n.a.a;
                                    if (aVar != null) {
                                        lmj lmjVar = ((GameActivity) aVar).z;
                                        hpa0 hpa0Var = lmjVar.a;
                                        if (hpa0Var != null) {
                                            if (i5 == 10) {
                                                hpa0Var.a(111, false, false);
                                                hpa0Var.a(117, false, false);
                                            } else if (i5 == 11) {
                                                hpa0Var.a(112, false, false);
                                                hpa0Var.a(117, false, false);
                                            } else if (i5 == 50) {
                                                hpa0Var.a(115, false, false);
                                            } else if (i5 != 51) {
                                                switch (i5) {
                                                    case 20:
                                                        hpa0Var.a(ay0.K(hpa0.h, lx30.INSTANCE), false, false);
                                                        break;
                                                    case 21:
                                                        hpa0Var.a(114, false, false);
                                                        break;
                                                    case 22:
                                                        hpa0Var.a(113, false, false);
                                                        break;
                                                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                                                        hpa0Var.a(ay0.K(hpa0.g, lx30.INSTANCE), false, false);
                                                        break;
                                                }
                                            } else {
                                                hpa0Var.a(116, false, false);
                                            }
                                        }
                                        d3i0 d3i0Var = lmjVar.b;
                                        if (d3i0Var != null) {
                                            Vibrator vibrator = d3i0Var.b;
                                            if (!d3i0Var.a) {
                                                if (i5 == 10 || i5 == 11 || i5 == 20 || i5 == 21) {
                                                    vibrator.vibrate(100L);
                                                } else if (i5 == 50) {
                                                    vibrator.vibrate(new long[]{0, 300, 50, 50, 50, 50}, -1);
                                                } else if (i5 == 51) {
                                                    vibrator.vibrate(new long[]{0, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50}, -1);
                                                }
                                            }
                                        }
                                    }
                                    qby qbyVar4 = pbyVar2.h;
                                    int i6 = qbyVar4.a;
                                    bsh0.a aVar2 = qbyVar4.b;
                                    if (i6 != 10) {
                                        if (i6 != 11) {
                                            switch (i6) {
                                                case 20:
                                                    pbyVar2.A.d = true;
                                                    pbyVar2.w = new dwf(aVar2.a, aVar2.b, pbyVar2.p.i() * 0.5f);
                                                    pbyVar2.x = new vpc(jCurrentTimeMillis2, ((long) wij.e) + jCurrentTimeMillis2);
                                                    break;
                                                case 21:
                                                    pbyVar2.w = new dwf(aVar2.a, aVar2.b, pbyVar2.p.i() * 0.5f);
                                                    pbyVar2.x = new vpc(jCurrentTimeMillis2, ((long) wij.e) + jCurrentTimeMillis2);
                                                    break;
                                                case 22:
                                                    pbyVar2.B = new gzf0(jCurrentTimeMillis2, jCurrentTimeMillis2);
                                                    break;
                                            }
                                        } else {
                                            wrc wrcVar = pbyVar2.v;
                                            long jA = pbyVar2.i.a();
                                            float fA = (bsh0.a(pbyVar2.t.a(), pbyVar2.t.b(), pbyVar2.p.a(), pbyVar2.p.b()) - 90.0f) % 360.0f;
                                            wrcVar.c = true;
                                            wrcVar.k = fA;
                                            wrcVar.h = new fw(1.0f, 0.0f, jCurrentTimeMillis2, jA - 50);
                                            wrcVar.i = null;
                                            wrcVar.j = new tu50(jCurrentTimeMillis2, jA);
                                            float fA2 = pbyVar2.t.a();
                                            float fB = pbyVar2.t.b();
                                            int[] iArr = bsh0.i;
                                            if (pbyVar2.h.a == 10) {
                                                jCurrentTimeMillis2 = jCurrentTimeMillis2;
                                                i3 = 3;
                                            } else {
                                                jCurrentTimeMillis2 = jCurrentTimeMillis2;
                                                i3 = 2;
                                            }
                                            pbyVar2.b(fA2, fB, jCurrentTimeMillis2, iArr, i3);
                                            long j = jCurrentTimeMillis2 + 90;
                                            pbyVar2.B = new gzf0(j, j);
                                            break;
                                        }
                                    } else {
                                        wrc wrcVar2 = pbyVar2.v;
                                        long jA2 = pbyVar2.i.a();
                                        wrcVar2.c = true;
                                        wrcVar2.k = wrcVar2.l.nextInt(36) * 10;
                                        wrcVar2.h = new fw(1.0f, 0.0f, jCurrentTimeMillis2, jA2);
                                        wrcVar2.i = new zy60(4.0f, jCurrentTimeMillis2, jA2);
                                        wrcVar2.j = null;
                                        float fA3 = pbyVar2.t.a();
                                        float fB2 = pbyVar2.t.b();
                                        int[] iArr2 = bsh0.h;
                                        if (pbyVar2.h.a == 10) {
                                            jCurrentTimeMillis2 = jCurrentTimeMillis2;
                                            i2 = 3;
                                        } else {
                                            jCurrentTimeMillis2 = jCurrentTimeMillis2;
                                            i2 = 2;
                                        }
                                        pbyVar2.b(fA3, fB2, jCurrentTimeMillis2, iArr2, i2);
                                        long j2 = jCurrentTimeMillis2 + 90;
                                        pbyVar2.B = new gzf0(j2, j2);
                                        break;
                                    }
                                    break;
                                case 6:
                                case 9:
                                    upc upcVarA = pbyVar2.x.a(jCurrentTimeMillis2);
                                    dwf dwfVar = pbyVar2.w;
                                    float f = dwfVar.l * upcVarA.a;
                                    dwfVar.e(upcVarA.b);
                                    dwf dwfVar2 = pbyVar2.w;
                                    dwfVar2.g(dwfVar2.a(), pbyVar2.w.b(), f, f);
                                    break;
                                case 7:
                                    pbyVar2.g(HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS, jCurrentTimeMillis2);
                                    pbyVar2.e(jCurrentTimeMillis2);
                                    break;
                            }
                            pbyVar2.q = jocVarA;
                            if (jocVarA.g) {
                                pbyVar2.p.k();
                            }
                            bwf bwfVar3 = pbyVar2.p;
                            float f2 = jocVarA.b;
                            float f3 = jocVarA.c;
                            float f4 = jocVarA.d;
                            bwfVar3.g(f2, f3, f4, f4);
                            bwf bwfVar4 = pbyVar2.p;
                            bwfVar4.j = jocVarA.f;
                            bwfVar4.e(jocVarA.e);
                            pbyVar2.d();
                            if (pbyVar2.C != null && (zocVar = pbyVar2.D) != null) {
                                yoc yocVarA = zocVar.a(jCurrentTimeMillis2);
                                pbyVar2.C.f(yocVarA.a, yocVarA.b);
                                pbyVar2.C.e(yocVarA.d);
                                bwf bwfVar5 = pbyVar2.C;
                                bwfVar5.h = 0.0f;
                                bwfVar5.i = yocVarA.c;
                                bwfVar5.j = 0.0f;
                                bwfVar5.e = 1.0f;
                                bwfVar5.f = 1.0f;
                            }
                            pbyVar2.f(jCurrentTimeMillis2);
                            gzf0 gzf0Var = pbyVar2.B;
                            if (gzf0Var != null && gzf0Var.a(jCurrentTimeMillis2).booleanValue()) {
                                bwf bwfVar6 = pbyVar2.g.f;
                                bwfVar6.e = 0.95f;
                                bwfVar6.f = 0.95f;
                            } else {
                                bwf bwfVar7 = pbyVar2.g.f;
                                bwfVar7.e = 1.0f;
                                bwfVar7.f = 1.0f;
                            }
                            break;
                        case 2:
                            pbyVar2.g(100, jCurrentTimeMillis2);
                            pbyVar2.f(jCurrentTimeMillis2);
                            break;
                    }
                }
            }
            long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (jCurrentTimeMillis3 < 30) {
                try {
                    Thread.sleep(30 - jCurrentTimeMillis3);
                } catch (InterruptedException unused3) {
                }
            }
        }
    }

    public GameSurfaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GameSurfaceView(Context context) {
        this(context, null);
    }
}
