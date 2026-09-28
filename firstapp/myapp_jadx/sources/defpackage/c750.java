package defpackage;

import android.net.Uri;
import com.twilio.voice.EventGroupType;
import java.net.URL;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class c750 implements aub {
    public final xu0 a;
    public final CoroutineContext b;

    public c750(xu0 xu0Var, @vf4 CoroutineContext coroutineContext) {
        xu0Var.getClass();
        coroutineContext.getClass();
        this.a = xu0Var;
        this.b = coroutineContext;
    }

    @Override // defpackage.aub
    public final Object a(Map map, a750.b bVar, a750.c cVar, a750.a aVar) {
        Object objD = ej5.d(this.b, new b750(this, map, bVar, cVar, null), aVar);
        return objD == y5b.a ? objD : Unit.a;
    }

    public final URL b() {
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        xu0 xu0Var = this.a;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(xu0Var.a).appendPath(EventGroupType.SETTINGS_GROUP);
        u20 u20Var = xu0Var.b;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", u20Var.c).appendQueryParameter("display_version", u20Var.b).build().toString());
    }
}
