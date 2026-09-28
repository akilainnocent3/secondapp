package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.e;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wix {
    public static void a(yfx yfxVar, cjx cjxVar, xnu xnuVar) {
        Object next;
        vix vixVar = new vix();
        yfxVar.getClass();
        cjxVar.getClass();
        if (xnuVar == null || xnuVar.isEmpty()) {
            yfxVar.g(cjxVar.getLabel(), vixVar);
            return;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : (ynu) xnuVar.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Integer) {
                bundle.putInt(str, ((Number) value).intValue());
            } else if (value instanceof String) {
                bundle.putString(str, (String) value);
            } else if (value instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) value);
            } else if (value instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) value);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry2 : (ynu) xnuVar.entrySet()) {
            String str2 = (String) entry2.getKey();
            Iterator<T> it = cjxVar.G0().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.g(((nex) next).a, str2));
            if (next != null) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        yfxVar.g(cjxVar.b1(linkedHashMap), vixVar);
        ifx ifxVarH = yfxVar.b.h();
        if (ifxVarH != null) {
            ifxVarH.a().e(bundle, "nav_screen_props");
        }
    }

    public static final void b(phx phxVar, e eVar) {
        phxVar.getClass();
        eVar.getClass();
        if (phxVar.e() != null) {
            phxVar.k();
        } else {
            eVar.getOnBackPressedDispatcher().d();
        }
    }

    public static final void c(yfx yfxVar, Activity activity) {
        yfxVar.getClass();
        if (yfxVar.k() || activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        activity.finish();
    }
}
