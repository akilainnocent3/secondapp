package com.sportybet.feature.settings.shortcutwidget;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import defpackage.a3m;
import defpackage.bb40;
import defpackage.op8;
import defpackage.saj;
import defpackage.xq40;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/feature/settings/shortcutwidget/ShortcutWidgetConfigureActivity;", "Lpy1;", "Lbb40;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ShortcutWidgetConfigureActivity extends a3m implements bb40 {
    public static final /* synthetic */ int d = 0;
    public int b;
    public AppWidgetManager c;

    public static final /* synthetic */ class a extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ShortcutWidgetConfigureActivity shortcutWidgetConfigureActivity = (ShortcutWidgetConfigureActivity) this.receiver;
            int i = ShortcutWidgetConfigureActivity.d;
            Intent intentPutExtra = shortcutWidgetConfigureActivity.getIntent().putExtra("appWidgetId", shortcutWidgetConfigureActivity.b);
            intentPutExtra.getClass();
            shortcutWidgetConfigureActivity.setResult(0, intentPutExtra);
            shortcutWidgetConfigureActivity.finish();
            return Unit.a;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ShortcutWidgetConfigureActivity shortcutWidgetConfigureActivity = (ShortcutWidgetConfigureActivity) this.receiver;
            int i = ShortcutWidgetConfigureActivity.d;
            shortcutWidgetConfigureActivity.getClass();
            ComponentName componentName = new ComponentName(shortcutWidgetConfigureActivity, (Class<?>) SportyShortcutAppWidgetProvider.class);
            AppWidgetManager appWidgetManager = shortcutWidgetConfigureActivity.c;
            if (appWidgetManager == null) {
                Intrinsics.n("appWidgetManager");
                throw null;
            }
            int[] appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
            Intent intent = new Intent(shortcutWidgetConfigureActivity, (Class<?>) SportyShortcutAppWidgetProvider.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", appWidgetIds);
            shortcutWidgetConfigureActivity.sendBroadcast(intent);
            Intent intentPutExtra = intent.putExtra("appWidgetIds", appWidgetIds);
            intentPutExtra.getClass();
            shortcutWidgetConfigureActivity.setResult(-1, intentPutExtra);
            if (!shortcutWidgetConfigureActivity.isFinishing()) {
                shortcutWidgetConfigureActivity.finish();
            }
            return Unit.a;
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        Intent intent = getIntent();
        int i = (intent == null || (extras = intent.getExtras()) == null) ? 0 : extras.getInt("appWidgetId", 0);
        this.b = i;
        if (i == 0) {
            finish();
            return;
        }
        Intent intentPutExtra = getIntent().putExtra("appWidgetId", this.b);
        intentPutExtra.getClass();
        setResult(0, intentPutExtra);
        zn8.a(this, new op8(1415441082, new xq40(this), true));
    }
}
