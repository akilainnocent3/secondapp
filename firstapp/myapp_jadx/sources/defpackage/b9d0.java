package defpackage;

import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.settings.shortcutwidget.SportyShortcutAppWidgetProvider;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class b9d0 implements RemoteViewsService.RemoteViewsFactory {
    public final Context a;
    public final int b;
    public List<? extends x590> c;

    public b9d0(Context context, int i) {
        context.getClass();
        this.a = context;
        this.b = i;
        this.c = m2g.a;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return this.c.size();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        return this.c.get(i).a;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getLoadingView() {
        return new RemoteViews(this.a.getPackageName(), R.layout.item_shortcut_widget);
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) {
        Context context = this.a;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.item_shortcut_widget);
        x590 x590Var = this.c.get(i);
        remoteViews.setTextViewText(R.id.shortcut_item_title, sn5.b(context, x590Var.c, new Object[0]));
        remoteViews.setImageViewResource(R.id.shortcut_item_icon, x590Var.b);
        Intent intent = new Intent();
        intent.setData(o7d.b(x590Var.d, null));
        intent.setAction("sportybet.action.CLICK_SHORTCUT");
        remoteViews.setOnClickFillInIntent(R.id.shortcut_item_layout, intent);
        return remoteViews;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
        List list = SportyShortcutAppWidgetProvider.e;
        if (list.isEmpty()) {
            list = x590.w;
        }
        this.c = this.b == 4 ? CollectionsKt.t0(list, 4) : CollectionsKt.t0(list, 8);
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        List list = SportyShortcutAppWidgetProvider.e;
        if (list.isEmpty()) {
            list = x590.w;
        }
        this.c = this.b == 4 ? CollectionsKt.t0(list, 4) : CollectionsKt.t0(list, 8);
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }
}
