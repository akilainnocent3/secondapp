package defpackage;

import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sporty.android.core.model.patron.Location;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.user.ChangeLocationActivity;
import java.net.ConnectException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class t47 implements gv5 {
    public final Object a;

    public t47(lyz lyzVar) {
        lyzVar.getClass();
        this.a = lyzVar;
    }

    public Object a(tje0 tje0Var) {
        return s0i.a(new sl50(bm50.b(((lyz) this.a).d(), vch0.b)), tje0Var);
    }

    @Override // defpackage.gv5
    public void onFailure(su5 su5Var, Throwable th) {
        if (su5Var.isCanceled()) {
            return;
        }
        boolean z = th instanceof ConnectException;
        ChangeLocationActivity changeLocationActivity = (ChangeLocationActivity) this.a;
        LoadingViewNew loadingViewNew = changeLocationActivity.z;
        if (z) {
            loadingViewNew.c(null);
        } else {
            loadingViewNew.c(changeLocationActivity.getCMSString(R.string.register_login_int__error_create_account_19000, new Object[0]));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gv5
    public void onResponse(su5 su5Var, bi50 bi50Var) {
        T t;
        ChangeLocationActivity changeLocationActivity = (ChangeLocationActivity) this.a;
        LinkedHashMap linkedHashMap = changeLocationActivity.L;
        BaseResponse baseResponse = (BaseResponse) bi50Var.b;
        if (!bi50Var.a.getIsSuccessful() || baseResponse == null || (t = baseResponse.data) == 0 || ((List) t).size() <= 0) {
            changeLocationActivity.z.c(changeLocationActivity.getCMSString(R.string.register_login_int__error_create_account_19000, new Object[0]));
            return;
        }
        changeLocationActivity.z.a();
        if (baseResponse.bizCode != 10000) {
            return;
        }
        List<Location> list = (List) baseResponse.data;
        changeLocationActivity.P = list;
        for (Location location : list) {
            if (location != null) {
                String str = location.state;
                String str2 = location.area;
                Set setKeySet = linkedHashMap.keySet();
                if (!TextUtils.isEmpty(str)) {
                    if (!setKeySet.contains(str)) {
                        linkedHashMap.put(str, new ArrayList());
                    } else if (changeLocationActivity.D.r()) {
                        ((List) linkedHashMap.get(str)).add(str2);
                    }
                }
            }
        }
        HashMap map = changeLocationActivity.M;
        ArrayList arrayList = changeLocationActivity.K;
        if (!changeLocationActivity.D.r() || TextUtils.isEmpty(changeLocationActivity.G)) {
            arrayList.addAll(linkedHashMap.keySet());
        } else {
            arrayList.addAll((Collection) linkedHashMap.get(changeLocationActivity.G));
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.keySet());
        for (int i = 0; i < arrayList2.size(); i++) {
            String strSubstring = ((String) arrayList2.get(i)).substring(0, 1);
            if (map.get(strSubstring) == null) {
                map.put(strSubstring, Integer.valueOf(i));
            }
        }
        iet ietVar = new iet();
        ietVar.d = true;
        ietVar.e = -1;
        ietVar.a = changeLocationActivity;
        ietVar.b = arrayList;
        ietVar.c = LayoutInflater.from(changeLocationActivity);
        changeLocationActivity.i = ietVar;
        changeLocationActivity.f.setAdapter(ietVar);
        changeLocationActivity.f.setLayoutManager(new LinearLayoutManager());
        if (!changeLocationActivity.H && changeLocationActivity.D.r()) {
            changeLocationActivity.i.d = false;
        }
        int color = changeLocationActivity.f.getContext().getColor(R.color.text_type1_secondary);
        int color2 = changeLocationActivity.f.getContext().getColor(R.color.background_type1_primary);
        r47 r47Var = new r47(changeLocationActivity);
        d8l d8lVar = new d8l();
        d8lVar.a = 80;
        int color3 = Color.parseColor("#CCCCCC");
        d8lVar.d = r47Var;
        Paint paint = new Paint();
        d8lVar.b = paint;
        paint.setColor(color3);
        TextPaint textPaint = new TextPaint();
        d8lVar.c = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(40.0f);
        textPaint.setColor(-1);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setColor(color);
        paint.setColor(color2);
        textPaint.setTextSize(zch0.b(changeLocationActivity.getResources(), 12));
        d8lVar.a = zch0.b(changeLocationActivity.getResources(), 24);
        changeLocationActivity.v = d8lVar;
        if (!TextUtils.isEmpty(changeLocationActivity.J) && changeLocationActivity.D.r()) {
            changeLocationActivity.w.setVisibility(8);
        } else {
            changeLocationActivity.f.i(changeLocationActivity.v);
            changeLocationActivity.w.setVisibility(0);
        }
    }

    public t47(ChangeLocationActivity changeLocationActivity) {
        this.a = changeLocationActivity;
    }
}
