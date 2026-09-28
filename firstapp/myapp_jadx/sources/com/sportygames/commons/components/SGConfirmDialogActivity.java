package com.sportygames.commons.components;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.components.SGConfirmDialogActivity;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.twilio.voice.EventKeys;
import defpackage.ai60;
import defpackage.bk60;
import defpackage.bq40;
import defpackage.ci60;
import defpackage.elf;
import defpackage.g6i0;
import defpackage.gr60;
import defpackage.ikt;
import defpackage.m2g;
import defpackage.mn80;
import defpackage.op5;
import defpackage.pfs;
import defpackage.pw;
import defpackage.qlf;
import defpackage.uy1;
import defpackage.whs;
import defpackage.zj60;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportygames/commons/components/SGConfirmDialogActivity;", "Luy1;", "Lmn80;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SGConfirmDialogActivity extends uy1<mn80> {
    public static final /* synthetic */ int z = 0;
    public double d;
    public int w;
    public int y;
    public String c = "";
    public String e = "";
    public String f = "";
    public String i = "";
    public final ai60 v = new ai60();

    public static void A1(String str, String str2, String str3) {
        zj60 bridge;
        String str4 = SportyGamesManager.getInstance().getUser() != null ? "logged-in" : "non logged-in";
        Bundle bundleA = whs.a("popup_name", str, "button_name", str2);
        bundleA.putString(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, str3);
        bundleA.putString("user_state", str4);
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        if (sportyGamesManager == null || (bridge = sportyGamesManager.getBridge()) == null) {
            return;
        }
        ((bk60) bridge).a("popup_action", bundleA);
    }

    public final void B1(int i) {
        mn80 mn80Var;
        Resources resources;
        mn80 mn80Var2 = (mn80) this.a;
        if (mn80Var2 != null) {
            mn80Var2.i.setOnClickListener(new View.OnClickListener() { // from class: ei60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i2 = SGConfirmDialogActivity.z;
                    SGConfirmDialogActivity sGConfirmDialogActivity = this.a;
                    sGConfirmDialogActivity.setResult(108);
                    sGConfirmDialogActivity.finish();
                }
            });
        }
        z1();
        if (i > 0) {
            mn80 mn80Var3 = (mn80) this.a;
            if (mn80Var3 != null) {
                TextView textView = mn80Var3.z;
                textView.setText((mn80Var3 == null || (resources = textView.getResources()) == null) ? null : resources.getString(R.string.fbg_use_gift_confirm_text, String.valueOf(i)));
            }
            HashMap map = new HashMap();
            map.put("{giftAvailable}", String.valueOf(i));
            op5 op5Var = op5.a;
            mn80 mn80Var4 = (mn80) this.a;
            op5.r(op5Var, b.f(mn80Var4 != null ? mn80Var4.z : null), map, 4);
            mn80 mn80Var5 = (mn80) this.a;
            if (mn80Var5 != null) {
                mn80Var5.A.setVisibility(0);
            }
            if (Build.VERSION.SDK_INT <= 25 && (mn80Var = (mn80) this.a) != null) {
                mn80Var.z.setTextSize(2, 13.0f);
            }
            mn80 mn80Var6 = (mn80) this.a;
            if (mn80Var6 != null) {
                mn80Var6.A.setVisibility(0);
            }
            mn80 mn80Var7 = (mn80) this.a;
            if (mn80Var7 != null) {
                mn80Var7.v.setVisibility(0);
            }
        }
    }

    @Override // defpackage.uy1
    public final boolean onBackPressedCompat() {
        setResult(107);
        return false;
    }

    @Override // defpackage.uy1, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        mn80 mn80Var;
        mn80 mn80Var2;
        String string;
        mn80 mn80Var3;
        String string2;
        String string3;
        ViewTreeObserver viewTreeObserver;
        CharSequence text;
        List listC;
        ConstraintLayout constraintLayout;
        super.onCreate(bundle);
        elf.b(this, null, 3);
        mn80 mn80Var4 = (mn80) this.a;
        if (mn80Var4 != null && (constraintLayout = mn80Var4.a) != null) {
            qlf.b(constraintLayout);
        }
        int i = 0;
        int intExtra = getIntent().getIntExtra("color", 0);
        qlf.d(this);
        Window window = getWindow();
        window.getClass();
        qlf.c(window, getColor(intExtra));
        if (getIntent().hasExtra(EventKeys.ERROR_MESSAGE)) {
            this.c = String.valueOf(getIntent().getStringExtra(EventKeys.ERROR_MESSAGE));
        }
        if (getIntent().hasExtra("betAmount")) {
            this.d = getIntent().getDoubleExtra("betAmount", 0.0d);
        }
        if (getIntent().hasExtra("placeHolderMessage")) {
            this.e = String.valueOf(getIntent().getStringExtra("placeHolderMessage"));
        }
        this.c = String.valueOf(getIntent().getStringExtra(EventKeys.ERROR_MESSAGE));
        this.f = String.valueOf(getIntent().getStringExtra("positive"));
        this.i = String.valueOf(getIntent().getStringExtra("negative"));
        this.w = getIntent().getIntExtra("cancel_btn_color", 0);
        this.y = getIntent().getIntExtra("confirm_btn_color", 0);
        if (getIntent().hasExtra("gift")) {
            try {
                Parcelable parcelableExtra = getIntent().getParcelableExtra("gift");
                parcelableExtra.getClass();
                B1(((PromotionGiftsResponse) parcelableExtra).getEntityList().size());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            mn80 mn80Var5 = (mn80) this.a;
            if (mn80Var5 != null) {
                mn80Var5.i.setVisibility(8);
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 25) {
            mn80 mn80Var6 = (mn80) this.a;
            if (mn80Var6 != null) {
                mn80Var6.d.setTextSize(18.0f);
            }
            mn80 mn80Var7 = (mn80) this.a;
            if (mn80Var7 != null) {
                mn80Var7.c.setTextSize(18.0f);
            }
            mn80 mn80Var8 = (mn80) this.a;
            if (mn80Var8 != null) {
                mn80Var8.C.setTextSize(16.0f);
            }
        }
        mn80 mn80Var9 = (mn80) this.a;
        int i3 = 1;
        if (mn80Var9 != null) {
            gr60.a(mn80Var9.e, new ikt(this, i3));
        }
        mn80 mn80Var10 = (mn80) this.a;
        if (mn80Var10 != null) {
            mn80Var10.C.setText(this.c);
        }
        mn80 mn80Var11 = (mn80) this.a;
        if (mn80Var11 != null && (text = mn80Var11.C.getText()) != null) {
            pfs pfsVar = new pfs(text);
            if (pfsVar.hasNext()) {
                String next = pfsVar.next();
                if (pfsVar.hasNext()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(next);
                    while (pfsVar.hasNext()) {
                        arrayList.add(pfsVar.next());
                    }
                    listC = arrayList;
                } else {
                    listC = kotlin.collections.a.c(next);
                }
            } else {
                listC = m2g.a;
            }
            if (listC != null) {
                listC.size();
            }
        }
        final bq40 bq40Var = new bq40();
        final bq40 bq40Var2 = new bq40();
        mn80 mn80Var12 = (mn80) this.a;
        if (mn80Var12 != null && (viewTreeObserver = mn80Var12.C.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: bi60
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    int i4 = SGConfirmDialogActivity.z;
                    bq40 bq40Var3 = bq40Var2;
                    if (bq40Var3.a == 0) {
                        SGConfirmDialogActivity sGConfirmDialogActivity = this;
                        mn80 mn80Var13 = (mn80) sGConfirmDialogActivity.a;
                        int lineCount = mn80Var13 != null ? mn80Var13.C.getLineCount() : 0;
                        bq40 bq40Var4 = bq40Var;
                        bq40Var4.a = lineCount;
                        mn80 mn80Var14 = (mn80) sGConfirmDialogActivity.a;
                        ViewGroup.LayoutParams layoutParams = mn80Var14 != null ? mn80Var14.C.getLayoutParams() : null;
                        layoutParams.getClass();
                        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                        int i5 = bq40Var4.a;
                        if (i5 == 1) {
                            layoutParams2.S = 0.032f;
                        }
                        if (i5 == 2) {
                            layoutParams2.S = 0.063f;
                        }
                        if (i5 == 3) {
                            layoutParams2.S = 0.096f;
                        }
                        mn80 mn80Var15 = (mn80) sGConfirmDialogActivity.a;
                        if (mn80Var15 != null) {
                            mn80Var15.C.setLayoutParams(layoutParams2);
                        }
                        bq40Var3.a = 1;
                    }
                }
            });
        }
        mn80 mn80Var13 = (mn80) this.a;
        ViewGroup.LayoutParams layoutParams = mn80Var13 != null ? mn80Var13.C.getLayoutParams() : null;
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        int i4 = bq40Var.a;
        if (i4 == 1) {
            layoutParams2.S = 0.15f;
        }
        if (i4 == 2) {
            layoutParams2.S = 5.9f;
        }
        mn80 mn80Var14 = (mn80) this.a;
        if (mn80Var14 != null) {
            mn80Var14.C.setLayoutParams(layoutParams2);
        }
        mn80 mn80Var15 = (mn80) this.a;
        if (mn80Var15 != null) {
            mn80Var15.c.setText(this.i);
        }
        mn80 mn80Var16 = (mn80) this.a;
        if (mn80Var16 != null) {
            mn80Var16.d.setText(this.f);
        }
        mn80 mn80Var17 = (mn80) this.a;
        if (mn80Var17 != null) {
            gr60.a(mn80Var17.b, new ci60(this, i));
        }
        if (getIntent().hasExtra("updateMessage")) {
            double doubleExtra = getIntent().getDoubleExtra("updateMessage", 0.0d);
            mn80 mn80Var18 = (mn80) this.a;
            if (mn80Var18 != null) {
                AppCompatTextView appCompatTextView = mn80Var18.C;
                String str = this.e;
                TreeMap treeMap = pw.a;
                appCompatTextView.setText(c.p(str, "_AMOUNT_", pw.d(doubleExtra), true));
            }
            if (doubleExtra < 1.0d) {
                String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(doubleExtra);
                str2.getClass();
                mn80 mn80Var19 = (mn80) this.a;
                if (mn80Var19 != null) {
                    mn80Var19.C.setText(c.p(this.e, "_AMOUNT_", str2, true));
                }
            }
            Parcelable parcelableExtra2 = getIntent().getParcelableExtra("giftitem");
            parcelableExtra2.getClass();
            GiftItem giftItem = (GiftItem) parcelableExtra2;
            double doubleExtra2 = getIntent().getDoubleExtra("amount", 0.0d);
            double doubleExtra3 = getIntent().getDoubleExtra("useramount", 0.0d);
            mn80 mn80Var20 = (mn80) this.a;
            if (mn80Var20 != null) {
                mn80Var20.z.setVisibility(8);
            }
            mn80 mn80Var21 = (mn80) this.a;
            if (mn80Var21 != null) {
                mn80Var21.w.setVisibility(8);
            }
            mn80 mn80Var22 = (mn80) this.a;
            if (mn80Var22 != null) {
                mn80Var22.f.setVisibility(0);
            }
            mn80 mn80Var23 = (mn80) this.a;
            if (mn80Var23 != null) {
                mn80Var23.y.setVisibility(0);
            }
            mn80 mn80Var24 = (mn80) this.a;
            if (mn80Var24 != null) {
                mn80Var24.v.setVisibility(0);
            }
            mn80 mn80Var25 = (mn80) this.a;
            if (mn80Var25 != null) {
                mn80Var25.A.setVisibility(0);
            }
            mn80 mn80Var26 = (mn80) this.a;
            if (mn80Var26 != null) {
                TextView textView = mn80Var26.y;
                Resources resources = textView.getResources();
                if (resources != null) {
                    op5 op5Var = op5.a;
                    String upperCase = giftItem.getCurrency().toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    op5Var.getClass();
                    String strI = op5.i(upperCase);
                    TreeMap treeMap2 = pw.a;
                    string3 = resources.getString(R.string.fbg_gift_applied_amount_text, strI, pw.d(doubleExtra2));
                } else {
                    string3 = null;
                }
                textView.setText(string3);
            }
            HashMap map = new HashMap();
            op5 op5Var2 = op5.a;
            String currency = giftItem.getCurrency();
            Locale locale = Locale.ROOT;
            String upperCase2 = currency.toUpperCase(locale);
            upperCase2.getClass();
            op5Var2.getClass();
            map.put("{currency}", op5.i(upperCase2));
            TreeMap treeMap3 = pw.a;
            map.put("{amount}", pw.d(doubleExtra2));
            mn80 mn80Var27 = (mn80) this.a;
            op5.r(op5Var2, b.f(mn80Var27 != null ? mn80Var27.y : null), map, 4);
            mn80 mn80Var28 = (mn80) this.a;
            if (mn80Var28 != null) {
                TextView textView2 = mn80Var28.v;
                Resources resources2 = textView2.getResources();
                if (resources2 != null) {
                    String upperCase3 = giftItem.getCurrency().toUpperCase(locale);
                    upperCase3.getClass();
                    string2 = resources2.getString(R.string.fbg_user_deduct_amount_text, op5.i(upperCase3), pw.d(doubleExtra3));
                } else {
                    string2 = null;
                }
                textView2.setText(string2);
            }
            if (i2 <= 25 && (mn80Var3 = (mn80) this.a) != null) {
                mn80Var3.y.setTextSize(2, 15.0f);
            }
            HashMap map2 = new HashMap();
            String upperCase4 = giftItem.getCurrency().toUpperCase(locale);
            upperCase4.getClass();
            map2.put("{currency}", op5.i(upperCase4));
            map2.put("{amount}", pw.d(doubleExtra3));
            mn80 mn80Var29 = (mn80) this.a;
            op5.r(op5Var2, b.f(mn80Var29 != null ? mn80Var29.v : null), map2, 4);
            if (doubleExtra3 < 1.0d) {
                String str3 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(doubleExtra3);
                str3.getClass();
                mn80 mn80Var30 = (mn80) this.a;
                if (mn80Var30 != null) {
                    TextView textView3 = mn80Var30.v;
                    Resources resources3 = textView3.getResources();
                    if (resources3 != null) {
                        String upperCase5 = giftItem.getCurrency().toUpperCase(locale);
                        upperCase5.getClass();
                        string = resources3.getString(R.string.fbg_user_deduct_amount_text, op5.i(upperCase5), str3);
                    } else {
                        string = null;
                    }
                    textView3.setText(string);
                }
                HashMap map3 = new HashMap();
                String upperCase6 = giftItem.getCurrency().toUpperCase(locale);
                upperCase6.getClass();
                map3.put("{currency}", op5.i(upperCase6));
                map3.put("{amount}", str3);
                mn80 mn80Var31 = (mn80) this.a;
                op5.r(op5Var2, b.f(mn80Var31 != null ? mn80Var31.v : null), map3, 4);
            }
            mn80 mn80Var32 = (mn80) this.a;
            if (mn80Var32 != null) {
                mn80Var32.i.setBackground(null);
            }
            mn80 mn80Var33 = (mn80) this.a;
            if (mn80Var33 != null) {
                mn80Var33.f.setOnClickListener(new View.OnClickListener() { // from class: di60
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i5 = SGConfirmDialogActivity.z;
                        SGConfirmDialogActivity sGConfirmDialogActivity = this.a;
                        sGConfirmDialogActivity.z1();
                        Intent intent = new Intent("fbg_revert");
                        intent.putExtra("betAmount", sGConfirmDialogActivity.d);
                        fdt.a(sGConfirmDialogActivity).c(intent);
                    }
                });
            }
        }
        int i5 = this.w;
        if (i5 != 0 && (mn80Var2 = (mn80) this.a) != null) {
            mn80Var2.b.setBackgroundColor(i5);
        }
        int i6 = this.y;
        if (i6 == 0 || (mn80Var = (mn80) this.a) == null) {
            return;
        }
        mn80Var.e.setBackgroundColor(i6);
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        try {
            getWindow().clearFlags(128);
            overridePendingTransition(0, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            getWindow().addFlags(128);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.uy1
    public final g6i0 w1() {
        return mn80.a(getLayoutInflater(), null);
    }

    public final void z1() {
        mn80 mn80Var = (mn80) this.a;
        if (mn80Var != null) {
            mn80Var.y.setVisibility(8);
        }
        mn80 mn80Var2 = (mn80) this.a;
        if (mn80Var2 != null) {
            mn80Var2.f.setVisibility(8);
        }
        mn80 mn80Var3 = (mn80) this.a;
        if (mn80Var3 != null) {
            mn80Var3.v.setText("");
        }
        mn80 mn80Var4 = (mn80) this.a;
        if (mn80Var4 != null) {
            mn80Var4.w.setVisibility(0);
        }
        mn80 mn80Var5 = (mn80) this.a;
        if (mn80Var5 != null) {
            mn80Var5.z.setVisibility(0);
        }
        mn80 mn80Var6 = (mn80) this.a;
        if (mn80Var6 != null) {
            mn80Var6.i.setBackground(getDrawable(R.drawable.fbg_rounded_corner_dialog_text));
        }
        mn80 mn80Var7 = (mn80) this.a;
        if (mn80Var7 != null) {
            mn80Var7.C.setText(this.c);
        }
    }
}
