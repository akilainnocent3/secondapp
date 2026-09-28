package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.v;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h9r {
    public static void a(Context context, final String str, Function2 function2, final op8 op8Var) {
        Activity activity;
        context.getClass();
        str.getClass();
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof Activity)) {
                if (!(baseContext instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    baseContext.getClass();
                }
            } else {
                activity = (Activity) baseContext;
                break;
            }
        }
        if (activity == null) {
            function2.invoke(Boolean.FALSE, "Context is not an Activity, cannot attach ComposeView");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content);
        if (viewGroup == null) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getClass();
            viewGroup = (ViewGroup) decorView;
        }
        final ComposeView composeView = new ComposeView(context, null, 6, 0);
        composeView.setAlpha(0.0f);
        composeView.setClickable(false);
        composeView.setFocusable(false);
        composeView.setClipChildren(false);
        composeView.setClipToPadding(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        final b9r b9rVar = new b9r(viewGroup, composeView, function2);
        final Handler handler = new Handler(Looper.getMainLooper());
        final yp40 yp40Var = new yp40();
        composeView.setContent(new op8(546598701, new Function2() { // from class: c9r
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final float density = ((mmd) aVar.O(kna.h)).getDensity();
                    final yp40 yp40Var2 = yp40Var;
                    final Handler handler2 = handler;
                    final ComposeView composeView2 = composeView;
                    final b9r b9rVar2 = b9rVar;
                    final String str2 = str;
                    d dVarA = v.a(d.a.b, new Function1() { // from class: e9r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            final urr urrVar = (urr) obj3;
                            urrVar.getClass();
                            yp40 yp40Var3 = yp40Var2;
                            if (!yp40Var3.a && ((int) (urrVar.a() >> 32)) > 0 && ((int) (urrVar.a() & 4294967295L)) > 0) {
                                yp40Var3.a = true;
                                final float f = density;
                                final ComposeView composeView3 = composeView2;
                                final b9r b9rVar3 = b9rVar2;
                                final String str3 = str2;
                                handler2.post(new Runnable() { // from class: f9r
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        urr urrVar2 = urrVar;
                                        float f2 = f;
                                        ComposeView composeView4 = composeView3;
                                        b9r b9rVar4 = b9rVar3;
                                        String str4 = str3;
                                        try {
                                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) ((((int) (urrVar2.a() >> 32)) / f2) * 2.0f), (int) ((((int) (urrVar2.a() & 4294967295L)) / f2) * 2.0f), Bitmap.Config.ARGB_8888);
                                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                                            float f3 = 2.0f / f2;
                                            canvas.scale(f3, f3);
                                            composeView4.draw(canvas);
                                            pfd pfdVar = fse.a;
                                            ej5.c(w5b.a(odd.b), null, null, new g9r(str4, bitmapCreateBitmap, b9rVar4, null), 3);
                                        } catch (Exception e) {
                                            Boolean bool = Boolean.FALSE;
                                            String message = e.getMessage();
                                            if (message == null) {
                                                message = "繪製 Bitmap 失敗";
                                            }
                                            b9rVar4.invoke(bool, message);
                                        }
                                    }
                                });
                            }
                            return Unit.a;
                        }
                    });
                    aiv aivVarC = g75.c(ht.a.a, false);
                    int iHashCode = Long.hashCode(aVar.m());
                    ne00 ne00VarO = aVar.o();
                    d dVarC = c.c(aVar, dVarA);
                    yka.k.getClass();
                    tsr.a aVar2 = yka.a.b;
                    if (aVar.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar.D();
                    if (aVar.g()) {
                        aVar.F(aVar2);
                    } else {
                        aVar.p();
                    }
                    hlh0.a(aVar, aivVarC, yka.a.f);
                    hlh0.a(aVar, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar, iHashCode, c1350a);
                    }
                    hlh0.a(aVar, dVarC, yka.a.d);
                    fc0.a(0, op8Var, aVar);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        viewGroup.addView(composeView, layoutParams);
        handler.postDelayed(new Runnable() { // from class: d9r
            @Override // java.lang.Runnable
            public final void run() {
                if (yp40Var.a) {
                    return;
                }
                b9rVar.invoke(Boolean.FALSE, "等待 Compose 渲染超時 (未觸發 onGloballyPositioned)");
            }
        }, 1000L);
    }
}
