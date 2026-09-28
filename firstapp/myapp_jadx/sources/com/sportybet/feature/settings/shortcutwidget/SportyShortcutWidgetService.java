package com.sportybet.feature.settings.shortcutwidget;

import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViewsService;
import defpackage.b9d0;
import defpackage.m4m;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/feature/settings/shortcutwidget/SportyShortcutWidgetService;", "Landroid/widget/RemoteViewsService;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SportyShortcutWidgetService extends m4m {
    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        int intExtra = intent != null ? intent.getIntExtra("count_changed", 0) : 0;
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        return new b9d0(applicationContext, intExtra);
    }
}
