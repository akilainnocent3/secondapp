package yads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class tg2 {
    public static Intent a(Context context, sg2 sg2Var) {
        String str = sg2Var.f155416b;
        String str2 = sg2Var.f155415a;
        String str3 = sg2Var.f155423i;
        Map map = sg2Var.f155417c;
        Integer num = sg2Var.f155418d;
        Intent intent = new Intent("android.intent.action.VIEW");
        if (str3 != null) {
            intent.setClassName(str2, str3);
        } else {
            intent.setData(Uri.parse(str));
            intent.setPackage(str2);
        }
        if (num == null || !(context instanceof Activity)) {
            intent.addFlags((num != null ? num.intValue() : 0) | u4.a0.F);
        } else {
            intent.addFlags(num.intValue());
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str4 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Boolean) {
                    intent.putExtra(str4, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    intent.putExtra(str4, ((Number) value).intValue());
                } else if (value instanceof String) {
                    intent.putExtra(str4, (String) value);
                } else if (value instanceof tq0) {
                    try {
                        dr.i1.a aVar = dr.i1.f79460c;
                        dr.i1.b(intent.putExtra(str4, ((tq0) value).getValue()));
                    } catch (Throwable th2) {
                        dr.i1.a aVar2 = dr.i1.f79460c;
                        dr.i1.b(dr.j1.a(th2));
                    }
                }
            }
        }
        return intent;
    }
}
