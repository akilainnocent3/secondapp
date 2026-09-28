package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.betslip.widget.e;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Outcome;
import java.io.File;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.event.comment.prematch.view.RecommendCodeViewHolder$bind$1$1", f = "RecommendCodeViewHolder.kt", l = {157}, m = "invokeSuspend", v = 2)
public final class xi40 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public String a;
    public int b;
    public final /* synthetic */ yi40 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ List<Selection> e;
    public final /* synthetic */ si40 f;
    public final /* synthetic */ int i;
    public final /* synthetic */ ri40 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xi40(yi40 yi40Var, String str, List<? extends Selection> list, si40 si40Var, int i, ri40 ri40Var, v1b<? super xi40> v1bVar) {
        super(2, v1bVar);
        this.c = yi40Var;
        this.d = str;
        this.e = list;
        this.f = si40Var;
        this.i = i;
        this.v = ri40Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xi40(this.c, this.d, this.e, this.f, this.i, this.v, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xi40) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BigDecimal bigDecimalMin;
        yi40 yi40Var;
        Object bVar;
        String string;
        Object objD;
        View viewInflate;
        Drawable drawable;
        yi40 yi40Var2 = this.c;
        igd0 igd0Var = yi40Var2.a;
        y5b y5bVar = y5b.a;
        int i = this.b;
        String str = this.d;
        if (i == 0) {
            uj50.b(obj);
            nh4 nh4Var = yi40Var2.b;
            lrm lrmVar = yi40Var2.c;
            psm psmVar = yi40Var2.d;
            nzm nzmVar = yi40Var2.v;
            nh4Var.getClass();
            lrmVar.getClass();
            psmVar.getClass();
            nzmVar.getClass();
            Context contextA = yi40Var2.a();
            contextA.getClass();
            str.getClass();
            List<Selection> list = this.e;
            list.getClass();
            ui40 ui40Var = new ui40(contextA, lrmVar, psmVar, nzmVar);
            lw2 lw2Var = new lw2(new ow2(new jw2(), new kw2(), ird0.a()));
            lw2Var.o(list);
            psm psmVar2 = ui40Var.c;
            String strC = psmVar2.c();
            int iX = psmVar2.X();
            kjd0 kjd0Var = ui40Var.e;
            kjd0Var.f.setText(strC);
            kjd0Var.e.setImageResource(iX);
            kjd0Var.i.setText(bwf0.a.g(System.currentTimeMillis()));
            kjd0Var.w.setText(str);
            lrm lrmVar2 = ui40Var.b;
            String str2 = lrmVar2.d0().a;
            lrmVar2.L(new imn(0L, "100", ""));
            BigDecimal bigDecimal = new BigDecimal(lrmVar2.d0().a);
            lrmVar2.L(new imn(0L, str2, ""));
            String strA = mh2.a(".00", new StringBuilder(), bigDecimal);
            BigDecimal bigDecimalE = ui40Var.d.e();
            si40 si40Var = this.f;
            boolean z = si40Var.e;
            BigDecimal bigDecimal2 = si40Var.b;
            BigDecimal bigDecimal3 = si40Var.a;
            if (!z || qz3.h(lw2Var, list)) {
                bigDecimalMin = BigDecimal.ZERO;
                bigDecimalMin.getClass();
            } else {
                bigDecimalMin = si40Var.d.multiply(bigDecimal2).multiply(bigDecimal).min(bigDecimalE);
                bigDecimalMin.getClass();
            }
            BigDecimal bigDecimalMin2 = bigDecimal.multiply(bigDecimal3).min(bigDecimalE);
            bigDecimalMin2.getClass();
            BigDecimal bigDecimal4 = BigDecimal.ZERO;
            if (!Intrinsics.g(bigDecimal4, bigDecimalMin)) {
                bigDecimalMin2 = bigDecimalMin2.add(bigDecimalMin).min(bigDecimalE);
                bigDecimalMin2.getClass();
            }
            Locale locale = Locale.US;
            String strL = bjb0.L(bigDecimalMin2, locale);
            TextView textView = kjd0Var.C;
            yi40Var = yi40Var2;
            LinearLayout linearLayout = kjd0Var.A;
            LinearLayout linearLayout2 = kjd0Var.b;
            BigDecimal bigDecimal5 = ui40.f;
            textView.setText(bigDecimal3.compareTo(bigDecimal5) > 0 ? bigDecimal5 + "+" : bjb0.L(bigDecimal3, locale));
            kjd0Var.E.setText(strA);
            if (bigDecimalMin.compareTo(bigDecimal4) <= 0 || qz3.h(lw2Var, list)) {
                linearLayout2.setVisibility(8);
                linearLayout.setVisibility(8);
            } else {
                kjd0Var.c.setText(bigDecimal2.multiply(BigDecimal.valueOf(100L)).setScale(2, RoundingMode.HALF_UP) + "%");
                linearLayout2.setVisibility(0);
                kjd0Var.B.setText(bjb0.L(bigDecimalMin, locale));
                linearLayout.setVisibility(0);
            }
            kjd0Var.D.setText(strL);
            for (Selection selection : list) {
                Outcome outcome = selection.c;
                if ((outcome == null || outcome.childOutcomes.isEmpty()) && !selection.p()) {
                    viewInflate = LayoutInflater.from(ui40Var.b()).inflate(R.layout.spr_betslip_share_item, (ViewGroup) null, false);
                    TextView textView2 = (TextView) viewInflate.findViewById(R.id.game);
                    if (textView2 != null) {
                        textView2.setText(outcome.desc);
                        mfb0 mfb0VarE = lfb0.d().e(selection.a.sport.id);
                        Drawable drawableD = (mfb0VarE == null || mfb0VarE.d() == null) ? null : mfb0VarE.d();
                        if (drawableD != null) {
                            drawableD.setTint(textView2.getContext().getColor(R.color.text_type1_tertiary));
                            drawable = drawableD;
                        } else {
                            drawable = null;
                        }
                        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                        textView2.setCompoundDrawablePadding(zch0.a(textView2.getContext(), 10));
                    }
                    TextView textView3 = (TextView) viewInflate.findViewById(R.id.odds);
                    if (textView3 != null) {
                        String str3 = outcome.odds;
                        str3.getClass();
                        textView3.setText(gky.a.a(str3, false));
                    }
                    TextView textView4 = (TextView) viewInflate.findViewById(R.id.teamname);
                    if (textView4 != null) {
                        textView4.setText(ui40Var.c(selection));
                    }
                    TextView textView5 = (TextView) viewInflate.findViewById(R.id.market);
                    if (textView5 != null) {
                        textView5.setText(e.b(selection, e.a.d.a));
                    }
                } else {
                    viewInflate = LayoutInflater.from(ui40Var.b()).inflate(R.layout.spr_betslip_share_item_pcbb, (ViewGroup) null, false);
                    TextView textView6 = (TextView) viewInflate.findViewById(R.id.odds);
                    if (textView6 != null) {
                        String str4 = outcome.odds;
                        str4.getClass();
                        textView6.setText(gky.a.a(str4, false));
                    }
                    TextView textView7 = (TextView) viewInflate.findViewById(R.id.teamname);
                    if (textView7 != null) {
                        textView7.setText(ui40Var.c(selection));
                    }
                    TextView textView8 = (TextView) viewInflate.findViewById(R.id.bb_selections);
                    if (textView8 != null) {
                        textView8.setText(selection.p() ? g880.f(selection) : g880.g(selection));
                    }
                }
                kjd0Var.v.addView(viewInflate);
            }
            try {
                zi50.a aVar = zi50.b;
                bVar = ui40Var.a();
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            if (bVar instanceof zi50.b) {
                bVar = null;
            }
            Bitmap bitmap = (Bitmap) bVar;
            if (bitmap == null) {
                string = null;
            } else {
                String absolutePath = ui40Var.b().getFilesDir().getAbsolutePath();
                String str5 = File.separator;
                File file = new File(v70.b(absolutePath, str5, "sportybetImage", str5));
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(file, pe4.b(this.i, "share_bet_recommend_code_", ".jpg"));
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    bitmap.compress(Bitmap.CompressFormat.JPEG, zch0.c(bitmap), fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    bitmap.recycle();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                string = mkh.c(ui40Var.b(), yrh0.h(ui40Var.b()), file2).toString();
            }
            if (string == null) {
                string = "";
            }
            Context contextA2 = yi40Var.a();
            contextA2.getClass();
            Uri uri = Uri.parse(string);
            this.a = string;
            this.b = 1;
            pfd pfdVar = fse.a;
            objD = ej5.d(odd.b, new ti40(contextA2, uri, null), this);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            string = this.a;
            uj50.b(obj);
            yi40Var = yi40Var2;
            objD = obj;
        }
        String str6 = string;
        Bitmap bitmap2 = (Bitmap) objD;
        if (bitmap2 == null) {
            return Unit.a;
        }
        FrameLayout frameLayout = igd0Var.y;
        ri40 ri40Var = this.v;
        String str7 = ri40Var.a;
        String str8 = ri40Var.b;
        List<Event> list2 = ri40Var.d;
        List<Selection> list3 = ri40Var.e;
        str7.getClass();
        str8.getClass();
        str6.getClass();
        list2.getClass();
        list3.getClass();
        frameLayout.setTag(new ri40(str7, str8, str6, list2, list3));
        igd0Var.w.setVisibility(0);
        igd0Var.w.setImageBitmap(bitmap2);
        yi40Var.i.b(str);
        return Unit.a;
    }
}
