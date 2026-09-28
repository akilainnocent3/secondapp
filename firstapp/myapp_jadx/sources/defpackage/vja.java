package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.concurrent.CancellationException;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class vja implements ScrollCaptureCallback {
    public final bb80 a;
    public final owo b;
    public final ap70 c;
    public final AndroidComposeView d;
    public final j1b e;
    public final r250 f;

    @c0d(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1", f = "ComposeScrollCaptureCallback.android.kt", l = {186}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Runnable c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Runnable runnable, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = runnable;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return vja.this.new a(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            vja vjaVar = vja.this;
            if (i == 0) {
                uj50.b(obj);
                r250 r250Var = vjaVar.f;
                this.a = 1;
                Object objA = r250Var.a(0.0f - r250Var.c, this);
                if (objA != y5bVar) {
                    objA = Unit.a;
                }
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            ((x5a0) vjaVar.c.a).setValue(Boolean.FALSE);
            this.c.run();
            return Unit.a;
        }
    }

    @c0d(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", f = "ComposeScrollCaptureCallback.android.kt", l = {119}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ScrollCaptureSession c;
        public final /* synthetic */ Rect d;
        public final /* synthetic */ Consumer<Rect> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer<Rect> consumer, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = scrollCaptureSession;
            this.d = rect;
            this.e = consumer;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return vja.this.new b(this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                ScrollCaptureSession scrollCaptureSession = this.c;
                Rect rect = this.d;
                owo owoVar = new owo(rect.left, rect.top, rect.right, rect.bottom);
                this.a = 1;
                obj = vja.this.a(scrollCaptureSession, owoVar, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            this.e.accept(ok40.a((owo) obj));
            return Unit.a;
        }
    }

    public vja(bb80 bb80Var, owo owoVar, j1b j1bVar, ap70 ap70Var, AndroidComposeView androidComposeView) {
        this.a = bb80Var;
        this.b = owoVar;
        this.c = ap70Var;
        this.d = androidComposeView;
        this.e = new j1b(j1bVar.getCoroutineContext().plus(sqe.a));
        this.f = new r250(owoVar.b(), new yja(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ScrollCaptureSession scrollCaptureSession, owo owoVar, x1b x1bVar) {
        wja wjaVar;
        int i;
        int i2;
        Object objA;
        ScrollCaptureSession scrollCaptureSession2;
        owo owoVar2;
        int i3;
        int i4;
        int iE;
        int iE2;
        int i5;
        int i6;
        Canvas canvasLockHardwareCanvas;
        if (x1bVar instanceof wja) {
            wjaVar = (wja) x1bVar;
            int i7 = wjaVar.i;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                wjaVar.i = i7 - Integer.MIN_VALUE;
            } else {
                wjaVar = new wja(this, x1bVar);
            }
        } else {
            wjaVar = new wja(this, x1bVar);
        }
        Object obj = wjaVar.e;
        y5b y5bVar = y5b.a;
        int i8 = wjaVar.i;
        r250 r250Var = this.f;
        if (i8 == 0) {
            uj50.b(obj);
            i = owoVar.b;
            i2 = owoVar.d;
            wjaVar.a = scrollCaptureSession;
            wjaVar.b = owoVar;
            wjaVar.c = i;
            wjaVar.d = i2;
            wjaVar.i = 1;
            int i9 = r250Var.a;
            if (i > i2) {
                kb5.a(whs.b(i, i2, "Expected min=", " ≤ max="));
                return null;
            }
            int i10 = i2 - i;
            if (i10 > i9) {
                kb5.a(whs.b(i10, i9, "Expected range (", ") to be ≤ viewportSize="));
                return null;
            }
            float f = i;
            float f2 = r250Var.c;
            if (f < f2 || i2 > i9 + f2) {
                objA = r250Var.a((f < f2 ? i : i2 - i9) - f2, wjaVar);
                if (objA != y5bVar) {
                    objA = Unit.a;
                }
                if (objA != y5bVar) {
                    objA = Unit.a;
                }
            } else {
                objA = Unit.a;
            }
            if (objA != y5bVar) {
            }
            return y5bVar;
        }
        if (i8 == 1) {
            int i11 = wjaVar.d;
            int i12 = wjaVar.c;
            owo owoVar3 = wjaVar.b;
            ScrollCaptureSession scrollCaptureSession3 = (ScrollCaptureSession) wjaVar.a;
            uj50.b(obj);
            i = i12;
            owoVar = owoVar3;
            i2 = i11;
            scrollCaptureSession = scrollCaptureSession3;
        } else {
            if (i8 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i4 = wjaVar.d;
            i3 = wjaVar.c;
            owoVar2 = wjaVar.b;
            scrollCaptureSession2 = (ScrollCaptureSession) wjaVar.a;
            uj50.b(obj);
        }
        iE = f.e(i3 - ycv.b(r250Var.c), 0, r250Var.a);
        iE2 = f.e(i4 - ycv.b(r250Var.c), 0, r250Var.a);
        i5 = owoVar2.a;
        i6 = owoVar2.c;
        if (iE == iE2) {
            return owo.e;
        }
        canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iE);
            owo owoVar4 = this.b;
            canvasLockHardwareCanvas.translate(-owoVar4.a, -owoVar4.b);
            this.d.getRootView().draw(canvasLockHardwareCanvas);
            int iB = ycv.b(r250Var.c);
            return new owo(i5, iE + iB, i6, iE2 + iB);
        } finally {
            scrollCaptureSession2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        wjaVar.a = scrollCaptureSession;
        wjaVar.b = owoVar;
        wjaVar.c = i;
        wjaVar.d = i2;
        wjaVar.i = 2;
        if (t4w.a(wjaVar.getContext()).P(xja.a, wjaVar) != y5bVar) {
            scrollCaptureSession2 = scrollCaptureSession;
            owoVar2 = owoVar;
            i3 = i;
            i4 = i2;
            iE = f.e(i3 - ycv.b(r250Var.c), 0, r250Var.a);
            iE2 = f.e(i4 - ycv.b(r250Var.c), 0, r250Var.a);
            i5 = owoVar2.a;
            i6 = owoVar2.c;
            if (iE == iE2) {
                return owo.e;
            }
            canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iE);
            owo owoVar5 = this.b;
            canvasLockHardwareCanvas.translate(-owoVar5.a, -owoVar5.b);
            this.d.getRootView().draw(canvasLockHardwareCanvas);
            int iB2 = ycv.b(r250Var.c);
            return new owo(i5, iE + iB2, i6, iE2 + iB2);
        }
        return y5bVar;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        ej5.c(this.e, kxx.a, null, new a(runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer<Rect> consumer) {
        final jvd0 jvd0VarC = ej5.c(this.e, null, null, new b(scrollCaptureSession, rect, consumer, null), 3);
        jvd0VarC.invokeOnCompletion(new aka(cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: zja
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                jvd0VarC.cancel((CancellationException) null);
            }
        });
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer<Rect> consumer) {
        consumer.accept(ok40.a(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.c = 0.0f;
        ((x5a0) this.c.a).setValue(Boolean.TRUE);
        runnable.run();
    }
}
