package com.sportybet.android.user.avatar;

import com.google.gson.reflect.TypeToken;
import com.sporty.android.core.model.config.bo.BOConfigParamDto;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import defpackage.bnh0;
import defpackage.c0d;
import defpackage.dq7;
import defpackage.gaj;
import defpackage.jq40;
import defpackage.krf0;
import defpackage.lk50;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.y5b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.user.avatar.ChangeAvatarViewModel$getUserFrame$1", f = "ChangeAvatarViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c extends tje0 implements gaj<lk50<? extends BOConfigValueBundle>, Integer, v1b<? super f>, Object> {
    public /* synthetic */ lk50 a;
    public /* synthetic */ int b;
    public final /* synthetic */ BOConfigParamDto c;
    public final /* synthetic */ e d;

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/sportybet/android/user/avatar/c$a", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/sportybet/android/user/avatar/FrameData;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a extends TypeToken<List<? extends FrameData>> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BOConfigParamDto bOConfigParamDto, e eVar, v1b<? super c> v1bVar) {
        super(3, v1bVar);
        this.c = bOConfigParamDto;
        this.d = eVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(lk50<? extends BOConfigValueBundle> lk50Var, Integer num, v1b<? super f> v1bVar) {
        int iIntValue = num.intValue();
        c cVar = new c(this.c, this.d, v1bVar);
        cVar.a = lk50Var;
        cVar.b = iIntValue;
        return cVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String string;
        String smallAvatarFrameUrl;
        e eVar = this.d;
        bnh0 bnh0Var = eVar.v;
        lk50 lk50Var = this.a;
        int i = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (!(lk50Var instanceof lk50.c)) {
            return f.b.a;
        }
        BOConfigValueWrapper response = ((BOConfigValueBundle) ((lk50.c) lk50Var).a).getResponse(this.c);
        Object obj2 = null;
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
                    kotlin.text.b.i((String) configValue);
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
                    kotlin.text.b.h((String) configValue);
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
        Object objFromJson = eVar.f.fromJson(string, new a().getType());
        objFromJson.getClass();
        for (Object obj3 : (Iterable) objFromJson) {
            String id = ((FrameData) obj3).getId();
            if (id != null && StringsKt.M(id, String.valueOf(i), false)) {
                obj2 = obj3;
                break;
            }
        }
        FrameData frameData = (FrameData) obj2;
        if (frameData != null) {
            String largeAvatarFrameUrl = frameData.getLargeAvatarFrameUrl();
            Object aVar = (largeAvatarFrameUrl == null || largeAvatarFrameUrl.length() <= 0 || (smallAvatarFrameUrl = frameData.getSmallAvatarFrameUrl()) == null || smallAvatarFrameUrl.length() <= 0 || i < krf0.TIER_3.a) ? f.b.a : new f.a(bnh0Var.e(frameData.getLargeAvatarFrameUrl()), bnh0Var.e(frameData.getSmallAvatarFrameUrl()));
            if (aVar != null) {
                return aVar;
            }
        }
        return f.b.a;
    }
}
