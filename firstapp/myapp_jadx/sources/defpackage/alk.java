package defpackage;

import com.sporty.android.core.model.json.JsonSerializeService;
import com.sportybet.plugin.lgg.LggInfoShowRecord;

/* JADX INFO: loaded from: classes4.dex */
public final class alk {
    public final m2l a;
    public final JsonSerializeService b;

    public alk(m2l m2lVar, JsonSerializeService jsonSerializeService) {
        m2lVar.getClass();
        jsonSerializeService.getClass();
        this.a = m2lVar;
        this.b = jsonSerializeService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        ykk ykkVar;
        if (x1bVar instanceof ykk) {
            ykkVar = (ykk) x1bVar;
            int i = ykkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ykkVar.c = i - Integer.MIN_VALUE;
            } else {
                ykkVar = new ykk(this, x1bVar);
            }
        } else {
            ykkVar = new ykk(this, x1bVar);
        }
        Object string = ykkVar.a;
        y5b y5bVar = y5b.a;
        int i2 = ykkVar.c;
        if (i2 == 0) {
            uj50.b(string);
            g8s[] g8sVarArr = g8s.a;
            ykkVar.c = 1;
            string = this.a.a.getString("pref_gift_grab_hint_show_count", "", ykkVar);
            if (string == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(string);
        }
        String str = (String) string;
        try {
            zi50.a aVar = zi50.b;
            return this.b.fromJson(str, LggInfoShowRecord.class);
        } catch (Throwable unused) {
            zi50.a aVar2 = zi50.b;
            return null;
        }
    }
}
