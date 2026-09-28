package defpackage;

import com.google.gson.reflect.TypeToken;
import com.sporty.android.core.model.config.bo.BOConfigParamDto;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sportybet.android.user.avatar.AvatarData;
import com.sportybet.android.user.avatar.e;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.user.avatar.ChangeAvatarViewModel$getAvatars$1", f = "ChangeAvatarViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g47 extends tje0 implements gaj<lk50<? extends BOConfigValueBundle>, String, v1b<? super lk50<? extends bp1>>, Object> {
    public /* synthetic */ lk50 a;
    public /* synthetic */ String b;
    public final /* synthetic */ BOConfigParamDto c;
    public final /* synthetic */ e d;

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"g47$a", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/sportybet/android/user/avatar/AvatarData;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a extends TypeToken<List<? extends AvatarData>> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g47(BOConfigParamDto bOConfigParamDto, e eVar, v1b<? super g47> v1bVar) {
        super(3, v1bVar);
        this.c = bOConfigParamDto;
        this.d = eVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(lk50<? extends BOConfigValueBundle> lk50Var, String str, v1b<? super lk50<? extends bp1>> v1bVar) {
        g47 g47Var = new g47(this.c, this.d, v1bVar);
        g47Var.a = lk50Var;
        g47Var.b = str;
        return g47Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:81:0x012d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String string;
        String strE;
        lk50 lk50Var = this.a;
        String str = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (!(lk50Var instanceof lk50.c)) {
            if (lk50Var instanceof lk50.b) {
                return lk50.b.a;
            }
            if (lk50Var instanceof lk50.a) {
                return new lk50.a(((lk50.a) lk50Var).a);
            }
            uhc.a();
            return null;
        }
        BOConfigValueWrapper response = ((BOConfigValueBundle) ((lk50.c) lk50Var).a).getResponse(this.c);
        Object configValue = response != null ? response.getConfigValue() : null;
        dq7 dq7VarA = jq40.a(String.class);
        if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
            if (configValue instanceof Integer) {
                if (!(configValue instanceof String)) {
                    configValue = null;
                }
                string = configValue;
            } else {
                if (configValue instanceof String) {
                    StringsKt.toIntOrNull((String) configValue);
                }
                string = null;
            }
        } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
            if (configValue instanceof Long) {
                if (!(configValue instanceof String)) {
                    configValue = null;
                }
                string = configValue;
            } else {
                if (configValue instanceof String) {
                    StringsKt.s0((String) configValue);
                }
                string = null;
            }
        } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
            if (configValue instanceof Float) {
                if (!(configValue instanceof String)) {
                    configValue = null;
                }
                string = configValue;
            } else {
                if (configValue instanceof String) {
                    b.i((String) configValue);
                }
                string = null;
            }
        } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
            if (configValue instanceof Double) {
                if (!(configValue instanceof String)) {
                    configValue = null;
                }
                string = configValue;
            } else {
                if (configValue instanceof String) {
                    b.h((String) configValue);
                }
                string = null;
            }
        } else if (!dq7VarA.equals(jq40.a(Boolean.TYPE))) {
            if (dq7VarA.equals(jq40.a(String.class))) {
                if (configValue == null || (string = configValue.toString()) == null) {
                }
            } else if (configValue != null) {
                if (!(configValue instanceof String)) {
                    configValue = null;
                }
                string = configValue;
            }
            string = null;
        } else if (configValue instanceof Boolean) {
            if (!(configValue instanceof String)) {
                configValue = null;
            }
            string = configValue;
        } else {
            if (configValue instanceof String) {
                StringsKt.r0((String) configValue);
            }
            string = null;
        }
        Type type = new a().getType();
        e eVar = this.d;
        Object objFromJson = eVar.f.fromJson(string, type);
        objFromJson.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) objFromJson).iterator();
        while (it.hasNext()) {
            String url = ((AvatarData) it.next()).getUrl();
            if (url == null) {
                strE = null;
            } else {
                if (url.length() <= 0) {
                    url = null;
                }
                if (url != null) {
                    strE = eVar.v.e(url);
                } else {
                    strE = null;
                }
            }
            if (strE != null) {
                arrayList.add(strE);
            }
        }
        return new lk50.c(new bp1(str, arrayList));
    }
}
