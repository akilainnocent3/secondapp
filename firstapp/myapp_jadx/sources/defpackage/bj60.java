package defpackage;

import android.content.res.Resources;
import androidx.appcompat.widget.AppCompatTextView;
import com.sportybet.android.gp.tz.R;
import java.util.HashMap;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class bj60 implements Function0 {
    public final /* synthetic */ ij60 a;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ij60 ij60Var = this.a;
        ao80 ao80Var = ij60Var.b;
        AppCompatTextView appCompatTextView = ao80Var.f;
        AppCompatTextView appCompatTextView2 = ao80Var.f;
        appCompatTextView.setTag("error_text_exceed:sg_fbg_dialog");
        HashMap map = new HashMap();
        op5 op5Var = op5.a;
        xi60.a aVar = ij60Var.d;
        if (aVar == null) {
            Intrinsics.n("dataItem");
            throw null;
        }
        String str = aVar.b;
        op5Var.getClass();
        map.put("{currency}", op5.i(str));
        TreeMap treeMap = pw.a;
        xi60.a aVar2 = ij60Var.d;
        if (aVar2 == null) {
            Intrinsics.n("dataItem");
            throw null;
        }
        map.put("{amount}", pw.d(aVar2.j));
        Resources resources = appCompatTextView2.getResources();
        xi60.a aVar3 = ij60Var.d;
        if (aVar3 == null) {
            Intrinsics.n("dataItem");
            throw null;
        }
        appCompatTextView2.setText(resources.getString(R.string.fbg_gift_error_partial_text, aVar3.b, pw.d(aVar3.j)));
        op5.r(op5Var, b.f(appCompatTextView2), map, 4);
        ij60Var.a();
        return Unit.a;
    }
}
