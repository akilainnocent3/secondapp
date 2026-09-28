package defpackage;

import android.content.Intent;
import com.sportybet.plugin.event.EventActivity;
import com.sportybet.plugin.event.e;
import com.sportybet.plugin.event.f;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.event.ChangeMatchPanel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vkg implements ChangeMatchPanel.a {
    public final /* synthetic */ EventActivity a;
    public final /* synthetic */ String b;

    public vkg(EventActivity eventActivity, String str) {
        this.a = eventActivity;
        this.b = str;
    }

    @Override // com.sportybet.plugin.realsports.event.ChangeMatchPanel.a
    public final void a(Event event) {
        EventActivity eventActivity = this.a;
        Intent intent = new Intent(eventActivity, (Class<?>) EventActivity.class);
        intent.putExtra("EXTRA_EVENT", apg.f(event));
        intent.putExtra("EXTRA_SOURCE", 7);
        int i = EventActivity.U0;
        EventActivity.a.a(eventActivity, intent);
        eventActivity.finish();
    }

    @Override // com.sportybet.plugin.realsports.event.ChangeMatchPanel.a
    public final void b() {
        e eVar = this.a.E0;
        if (eVar == null) {
            Intrinsics.n("eventViewModel");
            throw null;
        }
        String str = this.b;
        str.getClass();
        ej5.c(o8i0.d(eVar), null, null, new f(eVar, str, null), 3);
    }
}
