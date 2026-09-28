package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.winning.domain.model.WinningShareData;
import java.io.File;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class euj0 implements duj0 {
    public final Context a;
    public final h940 b;
    public final gbn c;
    public final psm d;
    public final k5b e;
    public volatile a f;

    public static final class a {
        public final String a;
        public final int b;

        public a(String str, int i) {
            str.getClass();
            this.a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return d830.a(this.b, "CacheKey(orderId=", this.a, ", widthPx=", ")");
        }
    }

    public euj0(Context context, h940 h940Var, gbn gbnVar, psm psmVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        h940Var.getClass();
        gbnVar.getClass();
        psmVar.getClass();
        this.a = context;
        this.b = h940Var;
        this.c = gbnVar;
        this.d = psmVar;
        this.e = k5bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.duj0
    public final Object a(x1b x1bVar) {
        fuj0 fuj0Var;
        if (x1bVar instanceof fuj0) {
            fuj0Var = (fuj0) x1bVar;
            int i = fuj0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fuj0Var.c = i - Integer.MIN_VALUE;
            } else {
                fuj0Var = new fuj0(this, x1bVar);
            }
        } else {
            fuj0Var = new fuj0(this, x1bVar);
        }
        Object obj = fuj0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = fuj0Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            this.f = null;
            k5b k5bVar = this.e;
            guj0 guj0Var = new guj0(this, null);
            fuj0Var.c = 1;
            if (ej5.d(k5bVar, guj0Var, fuj0Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }

    @Override // defpackage.duj0
    public final or60 b(String str, Configuration configuration) {
        return new or60(new kuj0(this, configuration, str, null));
    }

    public final void c(ggd0 ggd0Var, WinningShareData winningShareData, Context context) {
        String winningAmount;
        String displayType = winningShareData.getDisplayType();
        lr00.a aVar = lr00.b;
        if (Intrinsics.g(displayType, "recent_winning_order")) {
            ConstraintLayout constraintLayout = ggd0Var.l0;
            TextView textView = ggd0Var.U;
            TextView textView2 = ggd0Var.h0;
            TextView textView3 = ggd0Var.i0;
            constraintLayout.setVisibility(0);
            if (winningShareData.getPercent() > 0) {
                textView.setVisibility(0);
                textView.setText(sn5.b(context, R.string.component_pop_dialog__android_you_got_more_winnings_than_vnum_of_all_users_new, String.valueOf(winningShareData.getPercent())));
            } else {
                textView.setVisibility(8);
            }
            String verifyCode = winningShareData.getVerifyCode();
            if (verifyCode == null || verifyCode.length() == 0) {
                textView3.setVisibility(8);
                textView2.setVisibility(8);
            } else {
                textView3.setVisibility(0);
                textView2.setVisibility(0);
                textView3.setText(sn5.b(context, R.string.bet_history__verify_code, new Object[0]).concat(": "));
                textView2.setText(winningShareData.getVerifyCode());
            }
            try {
                winningAmount = bjb0.a0(Double.parseDouble(winningShareData.getWinningAmount()), Locale.US);
            } catch (Throwable th) {
                itf0.a aVar2 = itf0.a;
                aVar2.q(MyLog.TAG_WINNING_POPUP);
                aVar2.e(th);
                winningAmount = winningShareData.getWinningAmount();
            }
            ggd0Var.b.setText(this.d.I(winningAmount));
            TextView textView4 = ggd0Var.f0;
            Integer settleType = winningShareData.getSettleType();
            textView4.setText((settleType != null && settleType.intValue() == 1) ? sn5.b(context, R.string.bet_history__u_flash_win, new Object[0]) : sn5.b(context, R.string.component_pop_dialog__you_won, new Object[0]));
            ggd0Var.a0.setVisibility(8);
        }
        ImageButton imageButton = ggd0Var.d;
        RelativeLayout relativeLayout = ggd0Var.E;
        Iterator it = b.k(imageButton, ggd0Var.e, ggd0Var.i, ggd0Var.J, ggd0Var.d0, ggd0Var.I, ggd0Var.j0, ggd0Var.z, ggd0Var.m0, relativeLayout, relativeLayout, ggd0Var.w).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(WinningShareData winningShareData, Context context, x1b x1bVar) {
        huj0 huj0Var;
        if (x1bVar instanceof huj0) {
            huj0Var = (huj0) x1bVar;
            int i = huj0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                huj0Var.e = i - Integer.MIN_VALUE;
            } else {
                huj0Var = new huj0(this, x1bVar);
            }
        } else {
            huj0Var = new huj0(this, x1bVar);
        }
        Object objO = huj0Var.c;
        y5b y5bVar = y5b.a;
        int i2 = huj0Var.e;
        if (i2 == 0) {
            uj50.b(objO);
            huj0Var.a = winningShareData;
            huj0Var.b = context;
            huj0Var.e = 1;
            Integer settleType = winningShareData.getSettleType();
            String str = (settleType != null && settleType.intValue() == 1) ? xib0.FLASH_WIN_WINNING_DIALOG_BACKGROUND : xib0.WINNING_DIALOG;
            bc6 bc6Var = new bc6(1, yzo.b(huj0Var));
            bc6Var.q();
            this.c.c(str, new luj0(bc6Var));
            objO = bc6Var.o();
            if (objO == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            context = huj0Var.b;
            winningShareData = huj0Var.a;
            uj50.b(objO);
        }
        Bitmap bitmap = (Bitmap) objO;
        try {
            ggd0 ggd0VarA = ggd0.a(LayoutInflater.from(context));
            FrameLayout frameLayout = ggd0VarA.a;
            if (bitmap != null) {
                Resources resources = context.getResources();
                resources.getClass();
                ggd0VarA.T.setImageDrawable(new BitmapDrawable(resources, bitmap));
            }
            c(ggd0VarA, winningShareData, context);
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(zch0.f(context), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight());
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight(), Bitmap.Config.RGB_565);
            frameLayout.draw(new Canvas(bitmapCreateBitmap));
            if (bitmap != null) {
                bitmap.recycle();
            }
            return bitmapCreateBitmap;
        } catch (Exception e) {
            if (bitmap != null) {
                bitmap.recycle();
            }
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Comparable e(WinningShareData winningShareData, Context context, x1b x1bVar) {
        iuj0 iuj0Var;
        if (x1bVar instanceof iuj0) {
            iuj0Var = (iuj0) x1bVar;
            int i = iuj0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iuj0Var.c = i - Integer.MIN_VALUE;
            } else {
                iuj0Var = new iuj0(this, x1bVar);
            }
        } else {
            iuj0Var = new iuj0(this, x1bVar);
        }
        Object objD = iuj0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = iuj0Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objD);
                k5b k5bVar = this.e;
                juj0 juj0Var = new juj0(this, winningShareData, context, null);
                iuj0Var.c = 1;
                objD = ej5.d(k5bVar, juj0Var, iuj0Var);
                if (objD == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objD);
            }
            return (Uri) objD;
        } catch (Exception unused) {
            return null;
        }
    }

    public final File f() {
        File file = new File(this.a.getFilesDir(), "sportybetImage");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, "winning_popup_share.jpg");
    }
}
