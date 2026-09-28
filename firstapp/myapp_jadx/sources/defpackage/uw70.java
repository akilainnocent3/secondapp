package defpackage;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.appcompat.widget.AppCompatEditText;
import com.sportybet.plugin.realsports.outrights.SearchMarketView;
import com.sportybet.plugin.realsports.outrights.detail.OutrightsActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class uw70 implements TextWatcher {
    public final /* synthetic */ AppCompatEditText a;
    public final /* synthetic */ SearchMarketView b;

    public uw70(AppCompatEditText appCompatEditText, SearchMarketView searchMarketView) {
        this.a = appCompatEditText;
        this.b = searchMarketView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.a.hasFocus()) {
            String string = StringsKt.t0(String.valueOf(editable)).toString();
            SearchMarketView searchMarketView = this.b;
            searchMarketView.F.d.setCompoundDrawablesWithIntrinsicBounds(string.length() > 0 ? searchMarketView.getClear() : null, (Drawable) null, (Drawable) null, (Drawable) null);
            rz70 rz70Var = searchMarketView.I;
            if (rz70Var != null) {
                OutrightsActivity outrightsActivity = ((xbz) rz70Var).a;
                int i = OutrightsActivity.F;
                qbz qbzVarA1 = outrightsActivity.A1();
                String string2 = StringsKt.t0(string).toString();
                ArrayList arrayList = qbzVarA1.i;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    String str = ((gqu) obj).a.desc;
                    str.getClass();
                    if (StringsKt.M(str, string2, true)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                rpu rpuVar = outrightsActivity.d;
                if (rpuVar == null) {
                    Intrinsics.n("marketAdapter");
                    throw null;
                }
                rpuVar.c = arrayList3.isEmpty();
                rpu rpuVar2 = outrightsActivity.d;
                if (rpuVar2 != null) {
                    rpuVar2.i(arrayList3);
                } else {
                    Intrinsics.n("marketAdapter");
                    throw null;
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
