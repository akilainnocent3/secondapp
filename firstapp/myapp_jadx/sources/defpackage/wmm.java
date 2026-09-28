package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.e;
import com.sportybet.android.cashoutphase3.b;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wmm implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wmm(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                b bVar = ((ck6) obj).a;
                vn20.f(bVar.requireContext(), "open_bets", "SP_GUIDE_FIRST", false, true);
                xh6 xh6Var = bVar.c0;
                if (xh6Var == null) {
                    Intrinsics.n("adapter");
                    throw null;
                }
                ArrayList arrayList = xh6Var.A;
                int size = arrayList.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        Object obj2 = arrayList.get(i3);
                        i3++;
                        if (((pl6) obj2).c != 8) {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                    }
                }
                if (i2 != -1) {
                    arrayList.remove(i2);
                    xh6Var.p();
                    return;
                }
                return;
            default:
                ov80 ov80Var = (ov80) obj;
                ov80Var.a().e.setVisibility(8);
                AppCompatImageView appCompatImageView = ov80Var.a().K;
                e eVar = ov80Var.a;
                appCompatImageView.setImageDrawable(eVar.getDrawable(R.drawable.edit_pencil));
                ov80Var.a().f.setAlpha(0.5f);
                ov80Var.a().f.setFocusable(false);
                ov80Var.a().f.setFocusableInTouchMode(false);
                ov80Var.a().f.setText(ov80Var.y);
                if (eVar != null) {
                    Object systemService = eVar.getSystemService("input_method");
                    systemService.getClass();
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(ov80Var.a().f.getWindowToken(), 0);
                    return;
                }
                return;
        }
    }
}
