package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.webkit.WebView;
import androidx.appcompat.widget.AppCompatTextView;
import com.sportybet.android.gp.tz.R;
import java.util.HashMap;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class cj60 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cj60(Object obj, KeyEvent.Callback callback, int i) {
        this.a = i;
        this.b = obj;
        this.c = callback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [b0j0, hbs] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ij60 ij60Var = (ij60) obj3;
                Context context = (Context) obj2;
                String str = (String) obj;
                str.getClass();
                int length = str.length();
                ao80 ao80Var = ij60Var.b;
                if (length == 0) {
                    ao80Var.f.setText("");
                } else {
                    AppCompatTextView appCompatTextView = ao80Var.f;
                    AppCompatTextView appCompatTextView2 = ao80Var.f;
                    appCompatTextView.setTag(context.getString(R.string.error_text_very_low_bet));
                    HashMap map = new HashMap();
                    op5 op5Var = op5.a;
                    xi60.a aVar = ij60Var.d;
                    if (aVar == null) {
                        Intrinsics.n("dataItem");
                        throw null;
                    }
                    String str2 = aVar.b;
                    op5Var.getClass();
                    map.put("{currency}", op5.i(str2));
                    TreeMap treeMap = pw.a;
                    xi60.a aVar2 = ij60Var.d;
                    if (aVar2 == null) {
                        Intrinsics.n("dataItem");
                        throw null;
                    }
                    map.put("{amount}", pw.d(aVar2.m));
                    Resources resources = appCompatTextView2.getResources();
                    xi60.a aVar3 = ij60Var.d;
                    if (aVar3 == null) {
                        Intrinsics.n("dataItem");
                        throw null;
                    }
                    String strI = op5.i(aVar3.b);
                    xi60.a aVar4 = ij60Var.d;
                    if (aVar4 == null) {
                        Intrinsics.n("dataItem");
                        throw null;
                    }
                    appCompatTextView2.setText(resources.getString(R.string.fbg_gift_error_partial_text_min_value, strI, pw.d(aVar4.m)));
                    op5.r(op5Var, b.f(appCompatTextView2), map, 4);
                }
                ij60Var.a();
                return Unit.a;
            default:
                ibs ibsVar = (ibs) obj3;
                final WebView webView = (WebView) obj2;
                final use useVar = (use) obj;
                useVar.getClass();
                ?? r0 = new cbs(webView, useVar) { // from class: b0j0
                    public final /* synthetic */ WebView a;

                    @Override // defpackage.cbs
                    public final void F0(ibs ibsVar2, s9s.a aVar5) {
                        int i2 = c0j0.b.a[aVar5.ordinal()];
                        WebView webView2 = this.a;
                        if (i2 == 1) {
                            webView2.onResume();
                            return;
                        }
                        if (i2 == 2) {
                            webView2.onPause();
                            return;
                        }
                        if (i2 != 3) {
                            return;
                        }
                        try {
                            zi50.a aVar6 = zi50.b;
                            webView2.destroy();
                            Unit unit = Unit.a;
                        } catch (Throwable unused) {
                            zi50.a aVar7 = zi50.b;
                        }
                    }
                };
                ibsVar.getLifecycle().a(r0);
                return new c0j0.a(ibsVar, r0);
        }
    }
}
