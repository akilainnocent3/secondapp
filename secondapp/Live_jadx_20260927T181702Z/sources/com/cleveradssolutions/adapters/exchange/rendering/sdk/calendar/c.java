package com.cleveradssolutions.adapters.exchange.rendering.sdk.calendar;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements f {
    @Override // com.cleveradssolutions.adapters.exchange.rendering.sdk.calendar.f
    public void a(Context context, g gVar) {
        String strL = gVar.l();
        String strP = gVar.p();
        String strD = gVar.d();
        if (strL == null) {
            strL = "";
        }
        if (strP == null) {
            strP = "";
        }
        if (strD == null) {
            strD = "";
        }
        Intent intent = new Intent("android.intent.action.EDIT");
        intent.setType("vnd.android.cursor.item/event");
        intent.putExtra("title", strL);
        intent.putExtra("description", strP);
        intent.putExtra("eventLocation", strD);
        intent.putExtra("beginTime", gVar.j() != null ? gVar.j().b() : System.currentTimeMillis());
        intent.putExtra("endTime", gVar.b() != null ? gVar.b().b() : System.currentTimeMillis() + 1800000);
        intent.putExtra("allDay", false);
        intent.putExtra("visibility", 0);
        if (gVar.h() != null && !gVar.h().a()) {
            intent.putExtra("hasAlarm", 1);
        }
        com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.c.a(context, intent);
    }
}
