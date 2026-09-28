package defpackage;

import androidx.work.impl.eLa.LhMGMAwwhzjwfz;
import com.google.gson.reflect.TypeToken;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sportybet.android.social.data.local.SocShareCodeDetailEntity;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
public final class fha0 {
    public final mpe0 a = hwr.b(new eha0());

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"fha0$a", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/sportybet/android/social/data/local/SocShareCodeDetailEntity;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a extends TypeToken<List<? extends SocShareCodeDetailEntity>> {
    }

    public final String b(List<SocShareCodeDetailEntity> list) {
        if (list == null) {
            return null;
        }
        try {
            zi50.a aVar = zi50.b;
            return ((JsonSerializeService) this.a.getValue()).toJson(list);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            if (zi50.a(new zi50.b(th)) == null) {
                return null;
            }
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_CACHE_DB);
            aVar3.a("Social share code details convert to JS string failed", new Object[0]);
            return null;
        }
    }

    public final List<SocShareCodeDetailEntity> a(String str) {
        if (str == null) {
            return null;
        }
        Type type = new a().getType();
        try {
            zi50.a aVar = zi50.b;
            return (List) ((JsonSerializeService) this.a.getValue()).fromJson(str, type);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            if (zi50.a(new zi50.b(th)) == null) {
                return null;
            }
            itf0.a aVar3 = itf0.a;
            aVar3.q(LhMGMAwwhzjwfz.UiCAyDEFXbzb);
            aVar3.a("Social share code details convert from JS string failed", new Object[0]);
            return null;
        }
    }
}
