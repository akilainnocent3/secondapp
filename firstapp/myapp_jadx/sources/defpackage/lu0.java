package defpackage;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.res.Resources;
import android.util.Log;
import android.util.SizeF;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class lu0 {
    public static final lu0 a = new lu0();

    public final RemoteViews a(AppWidgetManager appWidgetManager, int i, Function1<? super cx90, ? extends RemoteViews> function1) {
        appWidgetManager.getClass();
        function1.getClass();
        ArrayList parcelableArrayList = appWidgetManager.getAppWidgetOptions(i).getParcelableArrayList("appWidgetSizes");
        if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            Log.w("AppWidgetManagerCompat", "App widget SizeF sizes not found in the options bundle, falling back to the min/max sizes");
            tlr tlrVarC = mu0.c(appWidgetManager, i);
            if (tlrVarC == null) {
                Log.w("AppWidgetManagerCompat", "App widget sizes not found in the options bundle, falling back to the provider size");
                AppWidgetProviderInfo appWidgetInfo = appWidgetManager.getAppWidgetInfo(i);
                return function1.invoke(new cx90(appWidgetInfo.minWidth / Resources.getSystem().getDisplayMetrics().density, appWidgetInfo.minHeight / Resources.getSystem().getDisplayMetrics().density));
            }
            cx90 cx90Var = tlrVarC.a;
            cx90 cx90Var2 = tlrVarC.b;
            return cx90Var.equals(cx90Var2) ? function1.invoke(cx90Var) : new RemoteViews(function1.invoke(cx90Var), function1.invoke(cx90Var2));
        }
        int iA = jpu.a(l48.r(parcelableArrayList, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        int size = parcelableArrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = parcelableArrayList.get(i2);
            i2++;
            SizeF sizeF = (SizeF) obj;
            sizeF.getClass();
            cx90 cx90VarD = cx90.d(sizeF);
            cx90VarD.getClass();
            linkedHashMap.put(obj, function1.invoke(cx90VarD));
        }
        return new RemoteViews(linkedHashMap);
    }

    public final RemoteViews b(Collection<cx90> collection, Function1<? super cx90, ? extends RemoteViews> function1) {
        collection.getClass();
        function1.getClass();
        Collection<cx90> collection2 = collection;
        int iA = jpu.a(l48.r(collection2, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (cx90 cx90Var : collection2) {
            linkedHashMap.put(cx90Var.c(), function1.invoke(cx90Var));
        }
        return new RemoteViews(linkedHashMap);
    }
}
