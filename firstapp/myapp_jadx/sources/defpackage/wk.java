package defpackage;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.sportybet.feature.settings.shortcutwidget.AppWidgetPinnedReceiver;
import com.sportybet.feature.settings.shortcutwidget.SportyShortcutAppWidgetProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwk;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wk extends sll {
    public AppWidgetManager f;

    public static final Unit m0(wk wkVar) {
        ComponentName componentName = new ComponentName(wkVar.requireContext(), (Class<?>) SportyShortcutAppWidgetProvider.class);
        PendingIntent broadcast = PendingIntent.getBroadcast(wkVar.getContext(), 0, new Intent(wkVar.getContext(), (Class<?>) AppWidgetPinnedReceiver.class), 201326592);
        if (Build.VERSION.SDK_INT >= 26) {
            AppWidgetManager appWidgetManager = wkVar.f;
            if (appWidgetManager == null) {
                Intrinsics.n("manager");
                throw null;
            }
            if (appWidgetManager.isRequestPinAppWidgetSupported()) {
                AppWidgetManager appWidgetManager2 = wkVar.f;
                if (appWidgetManager2 == null) {
                    Intrinsics.n("manager");
                    throw null;
                }
                appWidgetManager2.requestPinAppWidget(componentName, null, broadcast);
            }
        }
        return Unit.a;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setViewCompositionStrategy(u6i0.c.a);
        composeView.setContent(new op8(-198938710, new rk(0, composeView, this), true));
        return composeView;
    }
}
