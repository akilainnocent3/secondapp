package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.models.enums.GiftUseType;
import java.util.List;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final class ij60 extends RecyclerView.d0 {
    public static final /* synthetic */ int v = 0;
    public final Activity a;
    public final ao80 b;
    public final gaj<? super GiftItem, ? super Double, ? super Boolean, Unit> c;
    public xi60.a d;
    public kop e;
    public Context f;
    public final TextInputEditText i;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[GiftUseType.values().length];
            try {
                iArr[GiftUseType.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GiftUseType.PARTIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij60(e eVar, ao80 ao80Var, wi6 wi6Var, gaj gajVar, yi60 yi60Var, s5p s5pVar) {
        super(ao80Var.a);
        eVar.getClass();
        gajVar.getClass();
        yi60Var.getClass();
        s5pVar.getClass();
        this.a = eVar;
        this.b = ao80Var;
        this.c = gajVar;
        this.i = ao80Var.w;
    }

    public static String e(String str) {
        List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{"."}, false, 2, 2, null);
        if (listSplit$default.size() < 2) {
            return str;
        }
        return listSplit$default.get(0) + "." + c.p((String) listSplit$default.get(1), ".", "", false);
    }

    public final void a() {
        ao80 ao80Var = this.b;
        ao80Var.N.setEnabled(false);
        MaterialButton materialButton = ao80Var.N;
        materialButton.setAlpha(0.5f);
        kbv.a(materialButton, R.color.fbg_use_type_tint_color_unselected_v3);
    }

    public final void b() {
        ao80 ao80Var = this.b;
        ao80Var.N.setEnabled(true);
        MaterialButton materialButton = ao80Var.N;
        materialButton.setAlpha(1.0f);
        ao80Var.J.setAlpha(1.0f);
        ao80Var.w.setAlpha(1.0f);
        kbv.a(materialButton, R.color.fbg_use_type_tint_color_selected);
    }

    public final void c() {
        ao80 ao80Var = this.b;
        try {
            TextInputEditText textInputEditText = ao80Var.w;
            TextInputEditText textInputEditText2 = ao80Var.w;
            textInputEditText.setEnabled(false);
            textInputEditText2.clearFocus();
            kop kopVar = this.e;
            if (kopVar == null) {
                Intrinsics.n("keyboardUtility");
                throw null;
            }
            Object systemService = kopVar.a.getSystemService("input_method");
            systemService.getClass();
            ((InputMethodManager) systemService).hideSoftInputFromWindow(textInputEditText2.getWindowToken(), 0);
            kop kopVar2 = this.e;
            if (kopVar2 == null) {
                Intrinsics.n("keyboardUtility");
                throw null;
            }
            textInputEditText2.removeTextChangedListener(kopVar2.e);
            textInputEditText2.setText((CharSequence) null);
        } catch (Exception unused) {
        }
    }

    public final void d(String str) {
        ao80 ao80Var = this.b;
        try {
            TextInputEditText textInputEditText = ao80Var.w;
            AppCompatTextView appCompatTextView = ao80Var.f;
            TextInputEditText textInputEditText2 = ao80Var.w;
            textInputEditText.clearFocus();
            kop kopVar = this.e;
            if (kopVar == null) {
                Intrinsics.n("keyboardUtility");
                throw null;
            }
            Object systemService = kopVar.a.getSystemService("input_method");
            systemService.getClass();
            ((InputMethodManager) systemService).hideSoftInputFromWindow(textInputEditText2.getWindowToken(), 0);
            kop kopVar2 = this.e;
            if (kopVar2 == null) {
                Intrinsics.n("keyboardUtility");
                throw null;
            }
            textInputEditText2.removeTextChangedListener(kopVar2.e);
            String strE = e(str);
            textInputEditText2.setText(strE);
            StringBuilder sb = new StringBuilder();
            int length = strE.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = strE.charAt(i);
                if (Character.isDigit(cCharAt) || cCharAt == '.') {
                    sb.append(cCharAt);
                }
            }
            String string = sb.toString();
            if (strE.length() > 0 && string.length() > 0 && string.equals(".")) {
                appCompatTextView.setText("");
                g();
                return;
            }
            if (strE.length() > 0 && string.length() > 0 && Double.parseDouble(string) > 0.0d) {
                double d = Double.parseDouble(string);
                xi60.a aVar = this.d;
                if (aVar == null) {
                    Intrinsics.n("dataItem");
                    throw null;
                }
                if (Double.compare(d, aVar.m) <= 0) {
                    appCompatTextView.setText("");
                    g();
                    return;
                }
            }
            if (strE.length() > 0 && string.length() > 0 && Double.parseDouble(string) > 0.0d) {
                double d2 = Double.parseDouble(string);
                xi60.a aVar2 = this.d;
                if (aVar2 == null) {
                    Intrinsics.n("dataItem");
                    throw null;
                }
                if (Double.compare(d2, aVar2.m) >= 0) {
                    double d3 = Double.parseDouble(string);
                    xi60.a aVar3 = this.d;
                    if (aVar3 == null) {
                        Intrinsics.n("dataItem");
                        throw null;
                    }
                    if (Double.compare(d3, aVar3.j) <= 0) {
                        b();
                        appCompatTextView.setText("");
                        op5 op5Var = op5.a;
                        xi60.a aVar4 = this.d;
                        if (aVar4 == null) {
                            Intrinsics.n("dataItem");
                            throw null;
                        }
                        String str2 = aVar4.b;
                        op5Var.getClass();
                        String strI = op5.i(str2);
                        TreeMap treeMap = pw.a;
                        textInputEditText2.setText(strI + " " + pw.d(Double.parseDouble(string)));
                        textInputEditText2.clearFocus();
                        return;
                    }
                }
            }
            if (strE.length() > 0 && string.length() > 0) {
                double d4 = Double.parseDouble(string);
                xi60.a aVar5 = this.d;
                if (aVar5 == null) {
                    Intrinsics.n("dataItem");
                    throw null;
                }
                if (Double.compare(d4, aVar5.j) > 0) {
                    appCompatTextView.setText("");
                    op5 op5Var2 = op5.a;
                    xi60.a aVar6 = this.d;
                    if (aVar6 == null) {
                        Intrinsics.n("dataItem");
                        throw null;
                    }
                    String str3 = aVar6.b;
                    op5Var2.getClass();
                    String strI2 = op5.i(str3);
                    TreeMap treeMap2 = pw.a;
                    xi60.a aVar7 = this.d;
                    if (aVar7 == null) {
                        Intrinsics.n("dataItem");
                        throw null;
                    }
                    textInputEditText2.setText(strI2 + " " + pw.d(aVar7.j));
                    b();
                    textInputEditText2.clearFocus();
                    return;
                }
            }
            if (strE.length() > 0 && string.length() == 0) {
                appCompatTextView.setText("");
                g();
                return;
            }
            if (strE.length() != 0 && Double.parseDouble(string) > 0.0d) {
                return;
            }
            appCompatTextView.setText("");
            g();
        } catch (Exception unused) {
        }
    }

    public final void f(MaterialButton materialButton) {
        ao80 ao80Var = this.b;
        Resources resources = ao80Var.b.getResources();
        ThreadLocal<TypedValue> threadLocal = th50.a;
        materialButton.setIcon(resources.getDrawable(R.drawable.ic_fbg_checkmark, null));
        materialButton.setIconTint(th50.a(R.color.white, null, ao80Var.b.getResources()));
        kbv.a(materialButton, R.color.fbg_use_type_tint_color_selected);
    }

    public final void g() {
        ao80 ao80Var = this.b;
        TextInputEditText textInputEditText = ao80Var.w;
        op5 op5Var = op5.a;
        xi60.a aVar = this.d;
        if (aVar == null) {
            Intrinsics.n("dataItem");
            throw null;
        }
        String str = aVar.b;
        op5Var.getClass();
        String strI = op5.i(str);
        TreeMap treeMap = pw.a;
        xi60.a aVar2 = this.d;
        if (aVar2 == null) {
            Intrinsics.n("dataItem");
            throw null;
        }
        textInputEditText.setText(strI + " " + pw.d(aVar2.m));
        b();
        ao80Var.w.clearFocus();
    }

    public final Context getContext() {
        Context context = this.f;
        if (context != null) {
            return context;
        }
        Intrinsics.n("context");
        throw null;
    }

    public final void h() {
        ao80 ao80Var = this.b;
        try {
            TextInputEditText textInputEditText = ao80Var.w;
            TextInputEditText textInputEditText2 = ao80Var.w;
            textInputEditText.setEnabled(true);
            if (Build.VERSION.SDK_INT > 27) {
                textInputEditText2.requestFocus();
            }
            kop kopVar = this.e;
            if (kopVar == null) {
                Intrinsics.n("keyboardUtility");
                throw null;
            }
            mj6 mj6Var = new mj6(this, 2);
            textInputEditText2.addTextChangedListener(kopVar.e);
            textInputEditText2.setOnEditorActionListener(new iop(mj6Var, textInputEditText2));
        } catch (Exception unused) {
        }
    }

    public final void i(GiftUseType giftUseType) {
        xi60.a aVar = this.d;
        if (aVar == null) {
            Intrinsics.n("dataItem");
            throw null;
        }
        if (aVar.h && giftUseType == GiftUseType.FULL) {
            return;
        }
        int i = a.a[giftUseType.ordinal()];
        ao80 ao80Var = this.b;
        if (i == 1) {
            MaterialButton materialButton = ao80Var.b;
            MaterialButton materialButton2 = ao80Var.M;
            f(materialButton);
            MaterialButton materialButton3 = ao80Var.I;
            materialButton3.setIcon(null);
            kbv.a(materialButton3, R.color.fbg_use_type_tint_color_unselected_v2);
            ao80Var.w.setEnabled(false);
            materialButton2.setEnabled(true);
            materialButton2.setAlpha(1.0f);
            a();
            xi60.a aVar2 = this.d;
            if (aVar2 == null) {
                Intrinsics.n("dataItem");
                throw null;
            }
            GiftUseType giftUseType2 = GiftUseType.FULL;
            giftUseType2.getClass();
            aVar2.l = giftUseType2;
            xi60.a aVar3 = this.d;
            if (aVar3 == null) {
                Intrinsics.n("dataItem");
                throw null;
            }
            aVar3.g = giftUseType2;
            kbv.a(materialButton2, R.color.fbg_use_type_tint_color_selected);
            return;
        }
        if (i != 2) {
            uhc.a();
            return;
        }
        MaterialButton materialButton4 = ao80Var.I;
        MaterialButton materialButton5 = ao80Var.M;
        f(materialButton4);
        MaterialButton materialButton6 = ao80Var.b;
        materialButton6.setIcon(null);
        kbv.a(materialButton6, R.color.fbg_use_type_tint_color_unselected_v2);
        materialButton5.setEnabled(false);
        materialButton5.setAlpha(0.5f);
        b();
        ao80Var.w.setEnabled(true);
        ao80Var.f.setText("");
        xi60.a aVar4 = this.d;
        if (aVar4 == null) {
            Intrinsics.n("dataItem");
            throw null;
        }
        GiftUseType giftUseType3 = GiftUseType.PARTIAL;
        giftUseType3.getClass();
        aVar4.l = giftUseType3;
        xi60.a aVar5 = this.d;
        if (aVar5 == null) {
            Intrinsics.n("dataItem");
            throw null;
        }
        aVar5.g = giftUseType3;
        kbv.a(materialButton5, R.color.fbg_use_type_tint_color_unselected_v3);
    }
}
