package defpackage;

import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.redblack.remote.models.EndRoundStatsItem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class q3w implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q3w(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<Pair> listN;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                pb80 pb80Var = (pb80) obj;
                pb80Var.getClass();
                lb80.c(pb80Var, (String) obj2);
                return Unit.a;
            default:
                nn40 nn40Var = (nn40) obj2;
                LoadingState loadingState = (LoadingState) obj;
                if (nn40.a.a[loadingState.getStatus().ordinal()] == 1) {
                    ypa0 ypa0Var = nn40Var.z;
                    if (ypa0Var == null) {
                        Intrinsics.n("soundViewModel");
                        throw null;
                    }
                    String string = nn40Var.getString(R.string.cashout);
                    string.getClass();
                    ypa0Var.A1(0L, string);
                    fph0 fph0Var = nn40Var.F;
                    if (fph0Var != null) {
                        fph0Var.i(null, false);
                    }
                    xo40 xo40Var = (xo40) nn40Var.b;
                    if (xo40Var != null) {
                        xo40Var.L.setVisibility(8);
                    }
                    xo40 xo40Var2 = (xo40) nn40Var.b;
                    if (xo40Var2 != null) {
                        xo40Var2.e.setGravity(1);
                    }
                    fph0 fph0Var2 = nn40Var.F;
                    fph0Var2.getClass();
                    fph0Var2.i(null, false);
                    xo40 xo40Var3 = (xo40) nn40Var.b;
                    if (xo40Var3 != null) {
                        xo40Var3.d0.setAlpha(1.0f);
                    }
                    xo40 xo40Var4 = (xo40) nn40Var.b;
                    if (xo40Var4 != null) {
                        xo40Var4.d0.setEnabled(true);
                    }
                    xo40 xo40Var5 = (xo40) nn40Var.b;
                    if (xo40Var5 != null) {
                        xo40Var5.c0.setAlpha(1.0f);
                    }
                    xo40 xo40Var6 = (xo40) nn40Var.b;
                    if (xo40Var6 != null) {
                        xo40Var6.c0.setEnabled(true);
                    }
                    e activity = nn40Var.getActivity();
                    if (activity != null) {
                        j6g j6gVar = new j6g(activity);
                        j6gVar.setCancelable(false);
                        Window window = j6gVar.getWindow();
                        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                        if (attributes != null) {
                            attributes.gravity = 17;
                        }
                        if (attributes != null) {
                            attributes.flags &= -5;
                        }
                        Window window2 = j6gVar.getWindow();
                        if (window2 != null) {
                            window2.setAttributes(attributes);
                        }
                        Window window3 = j6gVar.getWindow();
                        if (window3 != null) {
                            window3.setBackgroundDrawableResource(R.color.dialog_bg_color);
                        }
                        j6gVar.show();
                        Window window4 = j6gVar.getWindow();
                        if (window4 != null) {
                            window4.setLayout(-1, -1);
                        }
                        HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                        Map map = hTTPResponse != null ? (Map) hTTPResponse.getData() : null;
                        j6gVar.a().c.setLayoutManager(new LinearLayoutManager());
                        LinkedHashMap linkedHashMap = map != null ? new LinkedHashMap(map) : null;
                        if (linkedHashMap != null) {
                        }
                        if (linkedHashMap != null && (listN = mpu.n(linkedHashMap)) != null) {
                            ArrayList arrayList = new ArrayList(l48.r(listN, 10));
                            for (Pair pair : listN) {
                                arrayList.add(new EndRoundStatsItem((String) pair.a, (String) pair.b));
                            }
                            j6gVar.b = new k6g(activity, arrayList);
                        }
                        j6gVar.a().c.setAdapter(j6gVar.b);
                        j6gVar.setOnDismissListener(new xm40());
                    }
                }
                return Unit.a;
        }
    }
}
