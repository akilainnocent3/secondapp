package com.sportybet.feature.settings.shortcutwidget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.work.a;
import androidx.work.c;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.home.MainActivity;
import com.sportybet.feature.settings.shortcutwidget.SportyShortcutAppWidgetProvider;
import com.sportybet.feature.settings.shortcutwidget.SportyShortcutWidgetService;
import com.sportybet.work.workers.ShortcutWidgetWorker;
import defpackage.cx90;
import defpackage.dll;
import defpackage.f00;
import defpackage.hb5;
import defpackage.hce0;
import defpackage.ib5;
import defpackage.jpu;
import defpackage.kb5;
import defpackage.l4m;
import defpackage.lu0;
import defpackage.mu0;
import defpackage.n1a0;
import defpackage.o7d;
import defpackage.rvj0;
import defpackage.tlr;
import defpackage.uf00;
import defpackage.ury;
import defpackage.vgb0;
import defpackage.wae;
import defpackage.x590;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/feature/settings/shortcutwidget/SportyShortcutAppWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "Landroidx/work/a$b;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SportyShortcutAppWidgetProvider extends l4m implements a.b {
    public static uf00<? extends x590> e = n1a0.c;
    public dll c;
    public rvj0 d;

    public static void a(final Context context, final AppWidgetManager appWidgetManager, final int i) {
        Object next;
        Object next2;
        RemoteViews remoteViews;
        final List listK = b.k(new cx90(153.0f, 110.0f), new cx90(300.0f, 110.0f));
        Intent intent = new Intent(context, (Class<?>) SportyShortcutAppWidgetProvider.class);
        intent.setAction("sportybet.action.CLICK_SHORTCUT");
        intent.putExtra("appWidgetId", i);
        int i2 = Build.VERSION.SDK_INT;
        final PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, i2 >= 31 ? 167772160 : 134217728);
        broadcast.getClass();
        if (i == 0) {
            return;
        }
        Function1<? super cx90, ? extends RemoteViews> function1 = new Function1() { // from class: z8d0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3;
                int i4;
                cx90 cx90Var = (cx90) obj;
                uf00<? extends x590> uf00Var = SportyShortcutAppWidgetProvider.e;
                cx90Var.getClass();
                if (cx90Var.equals(listK.get(0))) {
                    i3 = R.layout.widget_shortcut_small;
                    i4 = 4;
                } else {
                    i3 = R.layout.widget_shortcut_large;
                    i4 = 8;
                }
                Context context2 = context;
                Intent intent2 = new Intent(context2, (Class<?>) SportyShortcutWidgetService.class);
                int i5 = i;
                intent2.putExtra("appWidgetId", i5);
                intent2.putExtra("count_changed", i4);
                intent2.setData(Uri.parse(intent2.toUri(1)));
                RemoteViews remoteViews2 = new RemoteViews(context2.getPackageName(), i3);
                remoteViews2.setRemoteAdapter(R.id.shortcut_widget_grid, intent2);
                remoteViews2.setPendingIntentTemplate(R.id.shortcut_widget_grid, broadcast);
                appWidgetManager.notifyAppWidgetViewDataChanged(i5, R.id.shortcut_widget_grid);
                return remoteViews2;
            }
        };
        appWidgetManager.getClass();
        listK.getClass();
        if (appWidgetManager.getAppWidgetInfo(i) == null) {
            kb5.a(hce0.a(i, "Invalid app widget id: "));
            return;
        }
        if (listK.isEmpty()) {
            hb5.a("Sizes cannot be empty");
            return;
        }
        if (listK.size() > 16) {
            hb5.a("At most 16 sizes may be provided");
            return;
        }
        if (i2 >= 31) {
            remoteViews = lu0.a.b(listK, function1);
        } else {
            Iterator it = listK.iterator();
            Object next3 = null;
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    float fB = mu0.b((cx90) next);
                    do {
                        Object next4 = it.next();
                        float fB2 = mu0.b((cx90) next4);
                        if (Float.compare(fB, fB2) > 0) {
                            next = next4;
                            fB = fB2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            cx90 cx90Var = (cx90) next;
            if (cx90Var == null) {
                ib5.a("Sizes cannot be empty");
                return;
            }
            tlr tlrVarC = mu0.c(appWidgetManager, i);
            if (tlrVarC == null) {
                Log.w("AppWidgetManagerCompat", "App widget sizes not found in the options bundle, falling back to the smallest supported size (" + cx90Var + ')');
                tlrVarC = new tlr(cx90Var, cx90Var);
            }
            cx90 cx90Var2 = tlrVarC.a;
            cx90 cx90Var3 = tlrVarC.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listK) {
                if (mu0.a(cx90Var2, (cx90) obj)) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                next2 = it2.next();
                if (it2.hasNext()) {
                    float fB3 = mu0.b((cx90) next2);
                    do {
                        Object next5 = it2.next();
                        float fB4 = mu0.b((cx90) next5);
                        if (Float.compare(fB3, fB4) < 0) {
                            next2 = next5;
                            fB3 = fB4;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next2 = null;
            }
            cx90 cx90Var4 = (cx90) next2;
            cx90 cx90Var5 = cx90Var4 == null ? cx90Var : cx90Var4;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listK) {
                if (mu0.a(cx90Var3, (cx90) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it3 = arrayList2.iterator();
            if (it3.hasNext()) {
                next3 = it3.next();
                if (it3.hasNext()) {
                    float fB5 = mu0.b((cx90) next3);
                    do {
                        Object next6 = it3.next();
                        float fB6 = mu0.b((cx90) next6);
                        if (Float.compare(fB5, fB6) < 0) {
                            next3 = next6;
                            fB5 = fB6;
                        }
                    } while (it3.hasNext());
                }
            }
            cx90 cx90Var6 = (cx90) next3;
            if (cx90Var6 != null) {
                cx90Var = cx90Var6;
            }
            remoteViews = cx90Var5.equals(cx90Var) ? (RemoteViews) function1.invoke(cx90Var5) : new RemoteViews((RemoteViews) function1.invoke(cx90Var5), (RemoteViews) function1.invoke(cx90Var));
        }
        appWidgetManager.updateAppWidget(i, remoteViews);
    }

    @Override // androidx.work.a.b
    public final a b() {
        a.C0076a c0076a = new a.C0076a();
        dll dllVar = this.c;
        if (dllVar != null) {
            c0076a.a = dllVar;
            return new a(c0076a);
        }
        Intrinsics.n("workerFactory");
        throw null;
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        context.getClass();
        appWidgetManager.getClass();
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i, bundle);
        a(context, appWidgetManager, i);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        super.onDeleted(context, iArr);
        f00 f00Var = vgb0.a;
        vgb0.a("shortcut_widget_deleted");
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onEnabled(Context context) {
        super.onEnabled(context);
        f00 f00Var = vgb0.a;
        vgb0.a("shortcut_widget_enabled");
    }

    @Override // defpackage.l4m, android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri uriB;
        if (intent == null || (uriB = intent.getData()) == null) {
            uriB = o7d.b(wae.HOME, null);
        }
        if (Intrinsics.g(intent != null ? intent.getAction() : null, "sportybet.action.CLICK_SHORTCUT")) {
            f00 f00Var = vgb0.a;
            vgb0.c("clicked_shortcut", jpu.b(new Pair("url", uriB.toString())), false);
            Intent intent2 = new Intent(context, (Class<?>) MainActivity.class);
            intent2.setData(uriB);
            intent2.setFlags(268435456);
            if (context != null) {
                context.startActivity(intent2);
            }
        }
        super.onReceive(context, intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        context.getClass();
        appWidgetManager.getClass();
        if (iArr != null) {
            for (int i : iArr) {
                ury.a aVar = new ury.a(ShortcutWidgetWorker.class);
                Pair[] pairArr = {new Pair("appWidgetId", Integer.valueOf(i))};
                c.a aVar2 = new c.a();
                Pair pair = pairArr[0];
                aVar2.b(pair.b, (String) pair.a);
                aVar.b.e = aVar2.a();
                ury uryVarA = aVar.a();
                rvj0 rvj0Var = this.d;
                if (rvj0Var == null) {
                    Intrinsics.n("workManager");
                    throw null;
                }
                rvj0Var.a(kotlin.collections.a.c(uryVarA));
                a(context, appWidgetManager, i);
            }
        }
        super.onUpdate(context, appWidgetManager, iArr);
        f00 f00Var = vgb0.a;
        vgb0.a("shortcut_widget_updated");
    }
}
